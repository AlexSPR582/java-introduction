package by.epam.courses.module4.aggregation_and_composition.task2.engine;

import java.util.Objects;

public class Engine {
    private int enginePower;
    private int torque;
    private EngineType engineType;


    public Engine(int enginePower, int torque, EngineType engineType) {
        this.enginePower = enginePower;
        this.torque = torque;
        this.engineType = engineType;
    }

    public int getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(int enginePower) {
        this.enginePower = enginePower;
    }

    public int getTorque() {
        return torque;
    }

    public void setTorque(int torque) {
        this.torque = torque;
    }

    public EngineType getEngineType() {
        return engineType;
    }

    public void setEngineType(EngineType engineType) {
        this.engineType = engineType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Engine engine = (Engine) o;
        return enginePower == engine.enginePower &&
                torque == engine.torque &&
                engineType == engine.engineType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(enginePower, torque, engineType);
    }

    @Override
    public String toString() {
        return "Engine{" +
                "enginePower=" + enginePower +
                ", torque=" + torque +
                ", engineType=" + engineType +
                '}';
    }
}
