package hei.urlProject.web.controller.impl;

import hei.urlProject.core.entity.Url;
import hei.urlProject.core.service.UrlService;
import hei.urlProject.web.controller.RestController;

import javax.inject.Inject;
import javax.inject.Named;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Named
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class RestControllerImpl implements RestController {

    @Inject
    private UrlService urlService;

    @GET
    @Path("/list")
    public List<Url> getUrl()
    {
        return urlService.findAll();
    }

    @GET
    @Path("/{id}")
    public Url getOne(@PathParam("id") long id) {
        return urlService.findOne(id);
    }


    @POST
    @Path("/")
    public void saveEvenement(Url url) {
        urlService.save(url);
    }
}
