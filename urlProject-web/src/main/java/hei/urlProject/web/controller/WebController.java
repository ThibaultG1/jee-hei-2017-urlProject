package hei.urlProject.web.controller;

import hei.urlProject.core.entity.Url;
import hei.urlProject.core.service.UrlService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import javax.inject.Inject;
import java.util.List;
import java.util.UUID;

@Controller
public class WebController {

    private final static Logger LOGGER = LoggerFactory.getLogger(WebController.class);

    @Inject
    private UrlService urlService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String getFormAndList(ModelMap model) {
        LOGGER.info("J'affiche le formulaire d'ajout d'URL");
        model.addAttribute("url", new Url());
        LOGGER.info("Je retourne la liste des URLs");
        List<Url> urls = urlService.findAll();
        model.addAttribute("urls", urls);
        return "index";
    }

    @RequestMapping(value = "/form", method = RequestMethod.POST)
    public String submitForm(@ModelAttribute("url") Url url) {
        LOGGER.info("J'ajoute un URL");
        if (url.getUrlRaccourci() == "") {
            url.setUrlRaccourci(UUID.randomUUID().toString());
            urlService.save(url);
            return "redirect:";
        } else {
            if (urlService.findOneByUrlRaccourci(url.getUrlRaccourci()) == null) {
                urlService.save(url);
                return "redirect:";
            }
            else
                return "redirect:nope";
        }

    }

    @RequestMapping(value="/{urlRaccourci}")
    public String redirectMe(@ModelAttribute("url") Url url) {
        if (urlService.findOneByUrlRaccourci(url.getUrlRaccourci()) != null) {
            return "redirect:" + urlService.findOneByUrlRaccourci(url.getUrlRaccourci()).getUrlInitial();
        }
        else
            return "404";
    }

    @RequestMapping("/nope")
    public String error() {
        return "nope";
    }

    @RequestMapping("/*")
    public String error404() {
        return "404";
    }

}
