import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;


public class Main {
    private static final Logger logger = Logger.getLogger(Main.class.getSimpleName());

    public static void main(String[] args) {
        logger.info("Start of program");
        List<HeavyCar> listOfHeavyCars1 = new ArrayList<>();
        HeavyCar<HeavyCar> heavyCar1 = new HeavyCar(4, "Opel Movano", 125.5);
        HeavyCar<HeavyCar> heavyCar2 = new HeavyCar(6, "Renault Master" ,265.2);
        HeavyCar<HeavyCar> heavyCar3 = new HeavyCar(3, "Renault Trafic", 197.4);
        List<LightCar> listOfLightCars1 = new ArrayList<>();
        LightCar<LightCar> lightCar1 = new LightCar(2, "Ford Fusion", 200.5);
        LightCar<LightCar> lightCar2 = new LightCar(5, "Opel Zafira", 175.6);

        heavyCar1.AddToList(heavyCar1);
        heavyCar1.AddToList(heavyCar2);
        heavyCar1.AddToList(heavyCar3);

        lightCar1.AddToList(lightCar1);
        lightCar1.AddToList(lightCar2);


        heavyCar1.PrintAllCars(listOfHeavyCars1);

//        heavyCar2.InfoAboutCarService(listOfHeavyCars1);
//        lightCar2.InfoAboutCarService(listOfLightCars1);

        logger.info("End of programm");

    }
}
