package by.epam.courses.module5.task4.cave;

import by.epam.courses.module5.task4.treasure.Treasure;

import java.util.*;

public class DragonCave {
    private List<Treasure> treasures;

    public DragonCave(){
        treasures = new ArrayList<>();
    }

    public List<Treasure> getTreasures() {
        return treasures;
    }

    public void setTreasures(List<Treasure> treasures) {
        this.treasures = treasures;
    }

    @Override
    public String toString() {
        return "DragonCave{" +
                "treasures=" + treasures +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DragonCave cave = (DragonCave) o;
        return Objects.equals(treasures, cave.treasures);
    }

    @Override
    public int hashCode() {
        return Objects.hash(treasures);
    }
}
