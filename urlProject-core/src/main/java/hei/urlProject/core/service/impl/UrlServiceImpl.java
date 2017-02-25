package hei.urlProject.core.service.impl;

import hei.urlProject.core.dao.UrlDAO;
import hei.urlProject.core.entity.Url;
import hei.urlProject.core.service.UrlService;
import org.springframework.transaction.annotation.Transactional;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;

@Named
@Transactional
public class UrlServiceImpl implements UrlService{

    @Inject
    UrlDAO urlDAO;

    public Url findOne(Long id){
        return urlDAO.findOne(id);
    }

    public Url findOneByUrlRaccourci(String urlRaccourci){return urlDAO.findByUrlRaccourci(urlRaccourci);};

    public List<Url> findAll(){
        return urlDAO.findAll();
    }

    public void save(Url url){
        urlDAO.save(url);
    }
}
