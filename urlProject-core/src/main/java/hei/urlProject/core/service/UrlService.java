package hei.urlProject.core.service;

import hei.urlProject.core.entity.Url;

import java.util.List;

public interface UrlService {

    public Url findOne(Long id);

    public Url findOneByUrlRaccourci(String urlRaccourci);

    public List<Url> findAll();

    public void save(Url url);
}
