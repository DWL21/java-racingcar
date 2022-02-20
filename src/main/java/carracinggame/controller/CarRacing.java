package carracinggame.controller;

import carracinggame.domain.Car;
import carracinggame.domain.Cars;
import carracinggame.domain.Times;
import carracinggame.view.OutputView;

import java.util.ArrayList;
import java.util.List;

public class CarRacing {

    int carsCount;
    Cars cars = new Cars();

    public void start(String[] carNames, int times) {
        cars.makeCars(carNames);
        carsCount = carNames.length;
        OutputView.printResultMessage();
        while (!Times.isEnd(times)) {
            cars.run();
            result();
            times--;
        }
    }

    private void result() {
        for (int i = 0; i < carsCount; i++) {
            Car car = cars.getCar(i);
            OutputView.printResult(car.getName(), car.getPosition());
        }
        OutputView.println();
    }

}
