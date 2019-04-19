package pl.geolocation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pl.geolocation.model.Localizations;
import pl.geolocation.service.LocalizationsService;

import java.util.List;

@Controller
@RequestMapping
public class GeneralController {

    private LocalizationsService localizationsService;

    @Autowired
    private void Localizations(LocalizationsService localizationsDo) {
        this.localizationsService = localizationsDo;
    }

    @RequestMapping(value = "/")
    public String home() {

        return "home";
    }

    @RequestMapping(value = "/all")
    public String showAllLocalizations(Model model) {

        List<Localizations> list = localizationsService.findAll();

        model.addAttribute("localizations", list);

        return "showList";
    }


    @GetMapping(value = "/show")
    public String showLocationForm() {


        return "userLocalization";

    }

    @PostMapping(value = "/show")
    @ResponseBody
    public Double showNearestLocalization(@ModelAttribute Localizations localizations, @RequestParam Double lat, @RequestParam Double log) {


        return lat + log;
    }

}

