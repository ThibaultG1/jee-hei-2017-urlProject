package hei.urlProject.web.controller;

import hei.urlProject.core.entity.Url;
import hei.urlProject.core.service.UrlService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.inject.Inject;
import java.util.List;

@Controller
public class WebController {

    private final static Logger LOGGER = LoggerFactory.getLogger(WebController.class);

    @Inject
    private UrlService urlService;

    @RequestMapping(value="/",method = RequestMethod.GET)
    public String getFormAndList(ModelMap model){
        LOGGER.info("J'affiche le formulaire d'ajout d'URL");
        model.addAttribute("url", new Url());
        LOGGER.info("Je retourne la liste des URLs");
        List<Url> urls = urlService.findAll();
        model.addAttribute("urls",urls);
        return "index";
    }

    @RequestMapping(value="/form", method=RequestMethod.POST)
    public String submitForm(@ModelAttribute("url") Url url){
        LOGGER.info("J'ajoute un URL");
        urlService.save(url);
        return "redirect:";
    }

    @RequestMapping("/*")
    public String error(){
        return "404";
    }

}
