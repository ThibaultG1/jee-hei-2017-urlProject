package hei.urlProject.core.entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Url {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="urlInitial")
    private String urlInitial;

    @Column(name="urlRaccourci")
    private String urlRaccourci;

    public Url() {
    }

    public Url(String urlInitial, String urlRaccourci) {
        this.urlInitial = urlInitial;
        this.urlRaccourci = urlRaccourci;
    }

    public Long getId() {
        return id;
    }

    public String getUrlInitial() {
        return urlInitial;
    }

    public void setUrlInitial(String urlInitial) {
        this.urlInitial = urlInitial;
    }

    public String getUrlRaccourci() {
        return urlRaccourci;
    }

    public void setUrlRaccourci(String urlRaccourci) {
        this.urlRaccourci = urlRaccourci;
    }
}
