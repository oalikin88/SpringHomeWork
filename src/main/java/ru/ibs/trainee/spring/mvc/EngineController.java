package ru.ibs.trainee.spring.mvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ru.ibs.trainee.spring.mvc.validation.FuelExceptionHandle;

@Controller
public class EngineController {
    @Autowired
    Engine petrolEngine;
    @Autowired
    Engine dieselEngine;

    @RequestMapping(value = "/ask")
    @FuelExceptionHandle
    public String ask() {

            return "ask-engine-view";

    }
    @GetMapping (value = "/showinfo")
    @FuelExceptionHandle
    public String showinfo(@RequestParam("type") String type, Model model) {

        if("petrol".equals(type)) {
           model.addAttribute("engine", petrolEngine);
            return "show-info";
        } else if ("diesel".equals(type)) {
            model.addAttribute("engine", dieselEngine);
            return "show-info";
        } else {
            throw new RuntimeException();
        }
    }


}




