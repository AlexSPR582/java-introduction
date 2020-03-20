package by.epam.courses.module5.task4.treasure;

public class TreasureLogic {
    private static TreasureLogic treasureLogic;

    private TreasureLogic() {}

    public static TreasureLogic getInstance() {
        if (treasureLogic == null) {
            treasureLogic = new TreasureLogic();
        }
        return treasureLogic;
    }

    public void printTreasure(Treasure treasure) {
        System.out.println("название: " + treasure.getName() +
                "; цена: " + treasure.getPrice());
    }
}
