package hei.urlProject.core.dao;

import hei.urlProject.core.entity.Url;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UrlDAO extends JpaRepository<Url, Long> {}