package web.Service;

import org.springframework.stereotype.Component;
import web.Dao.CarDao;
import web.models.Car;

import java.util.List;

@Component
public class CarServiceImp implements CarService{

    private final CarDao carDao;

    public CarServiceImp(CarDao carDao) {
        this.carDao = carDao;
    }

    @Override
    public List<Car> getCars(int count) {
        return carDao.getCars(count);
    }
}
