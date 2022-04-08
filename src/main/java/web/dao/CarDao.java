package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarDao {

    private List<Car> carList;

    {
        carList = new ArrayList<>();

        carList.add(new Car(1, "Ferrari", "V6"));
        carList.add(new Car(2, "Porsche", "V4"));
        carList.add(new Car(3, "Audi", "V8"));
        carList.add(new Car(4, "BMW", "V12"));
        carList.add(new Car(5, "Tesla", "V777"));
        carList.add(new Car(6, "LADA", "V1"));
    }

    public List<Car> getParamCarList(int count) {
        List<Car> sublist;
        if(count > 0 & count < 5) {
            sublist = carList.subList(0,count);
            return sublist;
        }
        return carList;
    }

    public List<Car> getCarList() {
        return carList;
    }
}
