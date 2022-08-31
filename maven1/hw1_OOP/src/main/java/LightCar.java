import java.util.ArrayList;
import java.util.List;

public class LightCar<T extends Car> extends Car<T>{

    private static final org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(LightCar.class.getSimpleName());

    public LightCar(int CarID, String nameOfCar, double carMileage) {
        super(CarID, nameOfCar, carMileage);
    }
    List<T> lightCarlist = new ArrayList<T>();
    @Override
    public void setCarID(int carID) {
        super.setCarID(carID);
    }

    @Override
    public void setNameOfCar(String nameOfCar) {
        super.setNameOfCar(nameOfCar);
    }

    @Override
    public void setCarMileage(double carMileage) {
        super.setCarMileage(carMileage);
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
    public void DeleteList(List<T> list) {
        super.DeleteList(lightCarlist);
        logger.info(getNameOfCar() + " was deleted");

    }

    @Override
    public void PrintAllCars(List<T> list) {
        logger.info("All the element was printed");
        super.PrintAllCars(lightCarlist);
    }

    @Override
    public void AddToList(T t) {
        lightCarlist.add(t);
        logger.info(getNameOfCar() + " was added");

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
    public String InfoAboutCarService(List<T> list) {
        double limitTOHeavyCar = 180.0;
        if (getCarMileage() >= limitTOHeavyCar) {
            System.out.println("Time to make full service for: " +  "/ Car: "
                    + getNameOfCar() + "/ ID Of car: " + getCarID() + "/ CarMileage: " + getCarMileage());
        } else if (getCarMileage()< limitTOHeavyCar) {
            System.out.println("Not enough millege to do a full service for: " + "/ Car: "
                    + getNameOfCar() + "/ ID Of car: " + getCarID() + "/ CarMileage: " + getCarMileage());
        }
        logger.info("INfo about LightCar service");
        return null;
    }
}
