package hiber.dao;

import hiber.model.Car;
import hiber.model.User;
import java.util.List;

public interface CarDao {

    void addCar(Car car);

    List<Car> getCars();
    List<User> getUser(String model, int series);
}
