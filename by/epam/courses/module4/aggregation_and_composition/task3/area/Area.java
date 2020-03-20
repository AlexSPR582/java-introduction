package by.epam.courses.module4.aggregation_and_composition.task3.area;

import by.epam.courses.module4.aggregation_and_composition.task3.city.City;

import java.util.Arrays;
import java.util.Objects;

public class Area {
    private City[] cities;
    private String name;

    public Area(String name, City... cities) {
        this.cities = cities;
        this.name = name;
    }

    public City[] getCities() {
        return cities;
    }

    public void setCities(City... cities) {
        this.cities = cities;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Area area = (Area) o;
        return Arrays.equals(cities, area.cities)
                && this.name.equals(area.name);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(cities) + Objects.hashCode(name);
    }

    @Override
    public String toString() {
        return "Area{" +
                "cities=" + Arrays.toString(cities) +
                '}';
    }
}
