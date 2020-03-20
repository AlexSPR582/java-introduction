package by.epam.courses.module4.aggregation_and_composition.task2.car;

import by.epam.courses.module4.aggregation_and_composition.task2.carException.DifferentWheelsException;
import by.epam.courses.module4.aggregation_and_composition.task2.carException.NotEnoughWheelsException;
import by.epam.courses.module4.aggregation_and_composition.task2.engine.Engine;
import by.epam.courses.module4.aggregation_and_composition.task2.wheel.Wheel;
import by.epam.courses.module4.aggregation_and_composition.task2.carException.OddNumberOfWheelsException;

import java.util.Arrays;
import java.util.Objects;

public class Car {
    private String model;
    private Wheel[] wheels;
    private Engine engine;
    private int currentFuel = 0;

    public Car(String model, Engine engine, Wheel... wheels){
        this.model = model;
        this.engine = engine;
        if (wheelsValidation(wheels)) {
            this.wheels = wheels;
        }
    }

    public Car(String model, Engine engine, int currentFuel, Wheel... wheels) {
        this.model = model;
        this.engine = engine;
        this.currentFuel = currentFuel;
        if (wheelsValidation(wheels)) {
            this.wheels = wheels;
        }
    }

    public int getCurrentFuel() {
        return currentFuel;
    }

    public void setCurrentFuel(int currentFuel) {
        this.currentFuel = currentFuel;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Wheel[] getWheels() {
        return wheels;
    }

    public void setWheels(Wheel[] wheels) {
        if (wheelsValidation(wheels)) {
            this.wheels = wheels;
        }
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    private boolean wheelsValidation(Wheel[] wheels) {
        if (wheels.length < 4) {
            throw new NotEnoughWheelsException();
        }
        else if (wheels.length % 2 != 0) {
            throw new OddNumberOfWheelsException();
        }
        for (Wheel wheel : wheels) {
            if (wheel.getDiameter() != wheels[0].getDiameter()
                    || wheel.getWidth() != wheels[0].getWidth()) {
                throw new DifferentWheelsException();
            }
        }
        return true;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return currentFuel == car.currentFuel &&
                Objects.equals(model, car.model) &&
                Arrays.equals(wheels, car.wheels) &&
                Objects.equals(engine, car.engine);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(model, engine, currentFuel);
        result = 31 * result + Arrays.hashCode(wheels);
        return result;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", wheels=" + Arrays.toString(wheels) +
                ", engine=" + engine +
                ", currentFuel=" + currentFuel +
                '}';
    }
}
