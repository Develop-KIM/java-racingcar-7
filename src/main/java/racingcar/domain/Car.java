package racingcar.domain;

public record Car(String name, int distance) {

    public Car(String name) {
        this(name, 0);
    }

    public Car move() {
        return new Car(name, distance + 1);
    }
}
