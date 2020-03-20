package by.epam.courses.module4.aggregation_and_composition.task3.state;

import by.epam.courses.module4.aggregation_and_composition.task3.region.Region;

public class StateLogic {
    public static StateLogic stateLogic;

    private StateLogic() {}

    public static StateLogic getInstance() {
        if (stateLogic == null) {
            stateLogic = new StateLogic();
        }
        return stateLogic;
    }

    public void printCapital(State state) {
        System.out.println("Столица государства: " +
                state.getCapital().getName());
    }

    public void printRegionAmount(State state) {
        System.out.println("Количество областей: " +
                state.getRegions().length);
    }

    public void printStateArea(State state) {
        System.out.println("Площадь государства: " +
                state.getStateArea());
    }

    public void printRegionCenters(State state) {
        System.out.println("Областные центры:");
        for (Region region: state.getRegions()) {
            System.out.println(region.getRegionCenter().getName());
        }
    }
}
