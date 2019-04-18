package pl.geolocation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.geolocation.model.Localizations;
import pl.geolocation.model.LocalizationsDao;

@Controller
@RequestMapping
public class GeneralController {

    private LocalizationsDao localizationsDo;

    @Autowired
    private void Localizations(LocalizationsDao localizationsDo){
        this.localizationsDo = localizationsDo;
    }

    @RequestMapping(value = "/")
    public String home(){

        return "home";
    }


        @RequestMapping(value = "/all")
        public String showAllLocalizations(Model model){


            model.addAttribute("localizations", localizationsDo.findAll());

            return "showList";
        }


        @GetMapping(value = "/show")
        public String showLocationForm(Model model){

        model.addAttribute("localizations", new Localizations());

        return "userLocalization";
        }


        @PostMapping(value = "/show")
        public String showNearestLocalization(@ModelAttribute Localizations localizations, Model model){


        model.addAttribute("localizations", localizationsDo.findNearest());

        return "userNearestLocalization";
        }





}
