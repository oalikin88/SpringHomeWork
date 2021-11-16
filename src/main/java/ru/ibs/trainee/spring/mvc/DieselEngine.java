package ru.ibs.trainee.spring.mvc;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class DieselEngine implements Engine {

    private static boolean DIESEL;

    public DieselEngine() {
        System.out.println("DieselEngine is created!");
    }

    @Override
    public String powerUp() {
        return "Двигатель работает на дизельном топливе";
    }

    public static boolean getDIESEL() {
        return DIESEL;
    }

    public static void setDIESEL(boolean DIESEL) {
        DieselEngine.DIESEL = DIESEL;
    }
}
