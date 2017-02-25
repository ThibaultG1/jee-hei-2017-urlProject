package hei.urlProject.core.entity;

import javax.persistence.*;

@Entity
public class Url {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="urlInitial")
    private String urlInitial;

    @Column(name="urlRaccourci")
    private String urlRaccourci;

    public Url() {
        super();
    }

    public Url(String urlInitial, String urlRaccourci) {
        super();
        this.urlInitial = urlInitial;
        this.urlRaccourci = urlRaccourci;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
