package pl.geolocation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pl.geolocation.model.Localizations;
import pl.geolocation.model.LocalizationsDao;
import java.util.List;

@Controller
@RequestMapping
public class GeneralController {

    private LocalizationsDao localizationsDao;

    @Autowired
    private void Localizations(LocalizationsDao localizationsDo){
        this.localizationsDao = localizationsDo;
    }

    @RequestMapping(value = "/")
    public String home(){

        return "home";
    }


        @RequestMapping(value = "/all")
        public String showAllLocalizations(Model model){


            model.addAttribute("localizations", localizationsDao.findAll());

            return "showList";
        }


        @GetMapping(value = "/show")
        public String showLocationForm(Model model){

        model.addAttribute("localizations", new Localizations());

        return "userLocalization";
        }


        @PostMapping(value = "/show")
        @ResponseBody
        public Double showNearestLocalization(@ModelAttribute Localizations localizations, @RequestParam(value = "szerokosc") Double war1,@RequestParam(value = "dlugosc")Double war2){

            final double RADIUS = 3963.1676;

            double result;
            double dist = 0.0;

        List<Localizations> near = localizationsDao.findAll();

        for(double i = 0; i < near.size(); i++){

            result = Math.sin(localizations.getLatitude()) * Math.sin(war1) + Math.sin(localizations.getLongtitude()) * Math.sin(war2);

            dist = Math.acos(result);


        }


            return dist * RADIUS;

        }

}
