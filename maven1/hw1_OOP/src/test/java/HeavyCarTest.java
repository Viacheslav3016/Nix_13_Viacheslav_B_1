import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class HeavyCarTest {

    @Test
    void deleteList() {

    }

    @Test
    void addToList() {
        List <HeavyCar> listOfHeavyCars1Actual = new ArrayList<>();
        HeavyCar<HeavyCar> heavyCar1 = new HeavyCar<>(4, "Opel Movano", 125.5);
        HeavyCar<HeavyCar> heavyCar2 = new HeavyCar<>(6, "Renault Master" ,265.2);
        HeavyCar<HeavyCar> heavyCar3 = new HeavyCar<>(3, "Renault Trafic", 197.4);
        heavyCar1.AddToList(heavyCar1);
        heavyCar2.AddToList(heavyCar2);
        heavyCar3.AddToList(heavyCar3);
        assertFalse(listOfHeavyCars1Actual.isEmpty());


        List <HeavyCar> listOfHeavyCars1Actua2l = new ArrayList<>();

        assertTrue(listOfHeavyCars1Actua2l.isEmpty());

    }

    @Test
    void printAllCars() {
        HeavyCar<HeavyCar> heavyCar1 = new HeavyCar<>(4, "Opel Movano", 125.5);


        List <HeavyCar> listOfHeavyCars1Actual = new ArrayList<>();
        heavyCar1.AddToList(heavyCar1);

          heavyCar1.PrintAllCars(listOfHeavyCars1Actual);
        String actual = "CarID='4', nameOfCar=Opel Movano', CarMileage=125.5'}";
//        assertEquals(, actual);
    }

    @Test
    void infoAboutCarService() {
        List <HeavyCar> listOfHeavyCars1Actual = new ArrayList<>();

        HeavyCar<HeavyCar> heavyCar1 = new HeavyCar<>(4, "Opel Movano", 130.0);
        heavyCar1.AddToList(heavyCar1);
        String expected = heavyCar1.InfoAboutCarService(listOfHeavyCars1Actual);
        String actual = "Not enough millege to do a full service for: / Car: Opel Movano/ ID Of car: 4/ CarMileage: 130.0";
        assertEquals(expected, actual);

        List <HeavyCar> listOfHeavyCars1Actual2 = new ArrayList<>();
        HeavyCar<HeavyCar> heavyCar2 = new HeavyCar<>(6, "Renault Master" ,265.2);
        heavyCar1.AddToList(heavyCar2);
        String expected2 = heavyCar1.InfoAboutCarService(listOfHeavyCars1Actual2);
        String actual2 = "Time to make full service for: / Car: Renault Master/ ID Of car: 6/ CarMileage: 265.2\n";
        assertEquals(expected2, actual2);
    }
}