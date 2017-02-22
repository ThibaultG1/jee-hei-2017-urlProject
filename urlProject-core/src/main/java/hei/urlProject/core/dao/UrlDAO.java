package hei.urlProject.core.dao;

import hei.urlProject.core.entity.Url;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UrlDAO extends JpaRepository<Url,Long>{

}
