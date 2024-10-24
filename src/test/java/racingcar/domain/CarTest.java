package racingcar.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    private Car car;

    @BeforeEach
    void setUp() {
        car = new Car("pobi");
    }

    @Test
    public void create() {
        assertThat(car).isEqualTo(new Car("pobi", 0));
    }

    @Test
    void move() {
        car = car.move();
        assertThat(car.distance()).isEqualTo(1);

        car = car.move();
        assertThat(car.distance()).isEqualTo(2);

    }

}