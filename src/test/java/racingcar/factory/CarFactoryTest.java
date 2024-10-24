package racingcar.factory;

import org.junit.jupiter.api.Test;
import racingcar.domain.Car;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class CarFactoryTest {

    @Test
    void create() {
        String carNames = "pobi,woni";

        List<Car> cars = CarFactory.create(carNames);

        assertThat(cars).hasSize(2);
        assertThat(cars).extracting(Car::name)
                .containsExactly("pobi", "woni");
    }

    @Test
    void Exception() {
        assertThrows(IllegalArgumentException.class, () -> CarFactory.create(null));
        assertThrows(IllegalArgumentException.class, () -> CarFactory.create(""));
        assertThrows(IllegalArgumentException.class, () -> CarFactory.create(" "));
        assertThrows(IllegalArgumentException.class, () -> CarFactory.create("pobi,woni,javaji"));
    }
}