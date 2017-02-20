package hei.urlProject.core.service;

import hei.urlProject.core.entity.Url;

import java.util.List;

public interface UrlService {

    public List<Url> findAll();


    public Url findOne(long id);


    public void save(Url url);
}
