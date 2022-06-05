package web.Dao;

import org.springframework.stereotype.Component;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarDaoImp implements CarDao{

    List<Car> cars;

    {
        cars = new ArrayList<>();
        for (int i = 1; i < 6; i++) {
            cars.add(new Car(i,"Car" + i, "Black"));
        }
    }

    @Override
    public List<Car> getCars(int count) {
        if (count == 0 ) {
            return cars;
        }
        return cars.stream().limit(count).collect(Collectors.toList());
    }
}
