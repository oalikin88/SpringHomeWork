package ru.ibs.trainee.spring.mvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import ru.ibs.trainee.spring.mvc.validation.FuelExceptionHandle;

@Controller
public class EngineController {
    @Autowired
    Engine petrolEngine;
    @Autowired
    Engine dieselEngine;
    @ResponseBody
    @RequestMapping(value = "/check", method = RequestMethod.GET,
            produces = "application/json; charset=utf-8")
    @FuelExceptionHandle
    public String check(@RequestParam(value = "type", required = false) String type) {
        if(null == type) {
            return "Введите запрос";
        }else if("petrol".equals(type)) {
            String s = petrolEngine.powerUp();
            return s;
        } else if ("diesel".equals(type)) {
            String s = dieselEngine.powerUp();
            return s;
        } else {
            throw new RuntimeException();
        }

    }


}




