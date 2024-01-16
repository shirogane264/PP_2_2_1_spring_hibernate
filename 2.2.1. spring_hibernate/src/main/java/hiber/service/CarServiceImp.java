package hiber.service;

import hiber.dao.CarDao;
import hiber.model.Car;
import hiber.model.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class CarServiceImp implements CarService{

    private final CarDao carDao;

    public CarServiceImp(CarDao carDao) {
        this.carDao = carDao;
    }

    @Transactional
    @Override
    public void addCar(Car car) {
        carDao.addCar(car);
    }


    @Override
    public List<Car> getCars() {
        return carDao.getCars();
    }


    @Override
    @Transactional(readOnly = true)
    public List<User> getUser(String model, int series) {
        return carDao.getUser(model, series);
    }

}
