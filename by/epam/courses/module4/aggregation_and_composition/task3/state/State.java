package by.epam.courses.module4.aggregation_and_composition.task3.state;

import by.epam.courses.module4.aggregation_and_composition.task3.city.City;
import by.epam.courses.module4.aggregation_and_composition.task3.region.Region;

import java.util.Arrays;
import java.util.Objects;

public class State {
    private String name;
    private Region[] regions;
    private City capital;
    private int stateArea;

    public State(String name, City city, int stateArea, Region... regions) {
        this.name = name;
        this.capital = city;
        this.stateArea = stateArea;
        this.regions = regions;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStateArea() {
        return stateArea;
    }

    public void setStateArea(int stateArea) {
        this.stateArea = stateArea;
    }

    public Region[] getRegions() {
        return regions;
    }

    public void setRegions(Region[] regions) {
        this.regions = regions;
    }

    public City getCapital() {
        return capital;
    }

    public void setCapital(City capital) {
        this.capital = capital;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        State state = (State) o;
        return stateArea == state.stateArea &&
                Arrays.equals(regions, state.regions) &&
                Objects.equals(capital, state.capital) &&
                this.name.equals(state.name);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(capital, stateArea, name);
        result = 31 * result + Arrays.hashCode(regions);
        return result;
    }

    @Override
    public String toString() {
        return "State{" +
                "name='" + name + '\'' +
                ", regions=" + Arrays.toString(regions) +
                ", capital=" + capital +
                ", stateArea=" + stateArea +
                '}';
    }
}
