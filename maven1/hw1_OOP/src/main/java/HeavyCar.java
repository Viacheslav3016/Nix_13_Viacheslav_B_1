import java.util.*;

public class HeavyCar<T extends Car> extends Car<T>{

    private static final org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(HeavyCar.class.getSimpleName());

    public HeavyCar(int CarID, String nameOfCar, double carMileage) {
        super(CarID, nameOfCar, carMileage);
    }
    List<T> heavyCarList = new ArrayList<>();

    public List<T> getHeavyCarList() {
        return heavyCarList;
    }

    @Override
    public double getCarMileage() {
        return super.getCarMileage();
    }

    @Override
    public String getNameOfCar() {
        return super.getNameOfCar();
    }

    @Override
    public int getCarID() {
        return super.getCarID();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }


    @Override
    public void DeleteList(List<T> list) {
        super.DeleteList(heavyCarList);
        logger.info(getHeavyCarList() + " was deleted");
    }

    @Override
    public void AddToList(T t) {
        heavyCarList.add(t);
        logger.info(getNameOfCar() + " was added");

    }

    @Override
    public void PrintAllCars(List<T> list) {
        logger.info("All the element was printed");
         super.PrintAllCars(heavyCarList);
    }


    @Override
    public String InfoAboutCarService(List<T> list) {
        double limitTOHeavyCar = 200.0;
            if (getCarMileage() >= limitTOHeavyCar) {
                String s1 = "Time to make full service for: " +  "/ Car: " + getNameOfCar() + "/ ID Of car: " + getCarID() + "/ CarMileage: " + getCarMileage();
                System.out.println(s1);
                return s1;
            } else if (getCarMileage()< limitTOHeavyCar) {
                String s2 = "Not enough millege to do a full service for: " + "/ Car: "
                        + getNameOfCar() + "/ ID Of car: " + getCarID() + "/ CarMileage: " + getCarMileage();
                System.out.println(s2);
                return s2;
            }
        logger.info("INfo about HeavyCar service");
        return "";
    }
}


