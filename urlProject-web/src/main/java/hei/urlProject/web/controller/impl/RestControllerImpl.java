package hei.urlProject.web.controller.impl;

import hei.urlProject.core.entity.Url;
import hei.urlProject.core.service.UrlService;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;
import javax.inject.Named;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Named
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class RestControllerImpl implements RestController {

    @Inject
    private UrlService urlService;

    @GET
    @Path("/")
    public List<Url> getUrl()
    {
        return UrlService.findAll();
    }

}
