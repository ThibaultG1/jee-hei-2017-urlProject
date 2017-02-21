package hei.urlProject.core.service;

import hei.urlProject.core.entity.Url;

import java.util.List;

public interface UrlService {

    List<Url> findAll();


    Url findOne(long id);


    void save(Url url);
}
