package by.epam.courses.module4.aggregation_and_composition.task3.region;

import by.epam.courses.module4.aggregation_and_composition.task3.area.Area;
import by.epam.courses.module4.aggregation_and_composition.task3.city.City;

import java.util.Arrays;
import java.util.Objects;

public class Region {
    private String name;
    private Area[] areas;
    private City regionCenter;

    public Region(String name, City regionCenter, Area... areas) {
        this.name = name;
        this.areas = areas;
        this.regionCenter = regionCenter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public City getRegionCenter() {
        return regionCenter;
    }

    public void setRegionCenter(City regionCenter) {
        this.regionCenter = regionCenter;
    }

    public Area[] getAreas() {
        return areas;
    }

    public void setAreas(Area... areas) {
        this.areas = areas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Region region = (Region) o;
        return Arrays.equals(areas, region.areas) &&
                Objects.equals(regionCenter, region.regionCenter) &&
                this.name.equals(region.name);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(regionCenter, name);
        result = 31 * result + Arrays.hashCode(areas);
        return result;
    }

    @Override
    public String toString() {
        return "Region{" +
                "name='" + name + '\'' +
                ", areas=" + Arrays.toString(areas) +
                ", regionCenter=" + regionCenter +
                '}';
    }
}
