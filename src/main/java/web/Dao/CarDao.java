package web.Dao;

import web.models.Car;

import java.util.List;

public interface CarDao {
    List<Car> getCars(int count);
}
