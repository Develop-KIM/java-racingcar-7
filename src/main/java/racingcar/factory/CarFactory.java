package racingcar.factory;

import racingcar.domain.Car;

import java.util.ArrayList;
import java.util.List;

public class CarFactory {
    public static List<Car> create(String carNames) {
        if (carNames == null || carNames.trim().isEmpty()) {
            throw new IllegalArgumentException("null 또는 빈 문자열은 입력이 불가능 합니다.");
        }
        String[] names = carNames.split(",");
        List<Car> cars = new ArrayList<>();
        for (String name : names) {
            if (name.length() > 5) {
                throw new IllegalArgumentException("자동차 이름은 5자 초과 불가능 합니다.");
            }
            cars.add(new Car(name.trim()));
        }
        return cars;
    }
}