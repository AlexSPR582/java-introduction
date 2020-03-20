package by.epam.courses.module4.aggregation_and_composition.task3.main;

//3. Создать объект класса Государство, используя классы Область, Район, Город.
//Методы: вывести на консоль столицу, количество областей, площадь, областные центры.

import by.epam.courses.module4.aggregation_and_composition.task3.area.Area;
import by.epam.courses.module4.aggregation_and_composition.task3.city.City;
import by.epam.courses.module4.aggregation_and_composition.task3.region.Region;
import by.epam.courses.module4.aggregation_and_composition.task3.state.State;
import by.epam.courses.module4.aggregation_and_composition.task3.state.StateLogic;

public class Main {
    public static void main(String[] args) {
        City capital = new City("Город-N");
        City regionalCenter1 = new City("Город-2");
        Area area1 = new Area("Район-1", new City("Город-1"), regionalCenter1);
        Area area2 = new Area("Район-2", new City("Город-2"), capital);
        Region region1 = new Region("Область-1", regionalCenter1, area1, area2);

        City regionalCenter2 = new City("Город-3");
        Area area3 = new Area("Район-3", new City("Город-4"), new City("Город-5"));
        Area area4 = new Area("Район-4", new City("Город-6"), regionalCenter2);
        Region region2 = new Region("Область-2", regionalCenter2, area3, area4);

        State state = new State("Государство-1", capital, 20956, region1, region2);

        StateLogic stateLog = StateLogic.getInstance();
        stateLog.printCapital(state);
        stateLog.printRegionAmount(state);
        stateLog.printRegionCenters(state);
        stateLog.printStateArea(state);
    }
}
