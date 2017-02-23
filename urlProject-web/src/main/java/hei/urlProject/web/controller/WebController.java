package hei.urlProject.web.controller;

import hei.urlProject.core.entity.Url;
import hei.urlProject.core.service.UrlService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.inject.Inject;
import java.util.List;

@Controller
public class WebController {

    @Inject
    private UrlService urlService;

    @RequestMapping("/")
    public String getListOfUrls(ModelMap model){
        List<Url> urls = urlService.findAll();
        model.addAttribute("urls",urls);
        return "urlsList";
    }

}
