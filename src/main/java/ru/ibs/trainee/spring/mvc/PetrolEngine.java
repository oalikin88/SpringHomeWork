package ru.ibs.trainee.spring.mvc;

import org.springframework.stereotype.Component;

@Component
public class PetrolEngine implements Engine {
    private static boolean PETROL;

    public PetrolEngine() {
        System.out.println("PetrolEngine is created!");
    }

    @Override
    public String powerUp() {
        return "Двигатель работает на бензине";
    }

    public static boolean getPETROL() {
        return PETROL;
    }

    public static void setPETROL(boolean PETROL) {
        PetrolEngine.PETROL = PETROL;
    }
}
