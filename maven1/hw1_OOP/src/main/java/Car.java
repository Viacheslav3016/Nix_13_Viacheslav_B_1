import lombok.Data;

import java.util.List;

@Data
public abstract class Car<T> implements CrudOperations<T>, Printable<T>, NotificationAboutService<T>{
    int CarID;
    String nameOfCar;
     double carMileage;
    public Car(int CarID, String nameOfCar, double carMileage) {
        this.CarID = CarID;
        this.nameOfCar = nameOfCar;
        this.carMileage = carMileage;
    }

    @Override
    public String toString() {
        return "CarID='" + CarID + '\'' +
                ", nameOfCar=" + nameOfCar + '\'' +
                ", CarMileage=" + carMileage + '\'' +
                '}' + "\n";
    }

    @Override
    public void DeleteList(List<T> list) {
        list.remove(list);
    }

    @Override
    public void AddToList(T t) {
    }

    @Override
    public void PrintAllCars(List<T> list) {
        list.forEach(System.out::println);
    }

    @Override
    public String InfoAboutCarService(List<T> list) {
        double limitTO = 0.0;
        if (carMileage >= limitTO){
            System.out.println();
        }else System.out.println();
        return null;
    }
}
