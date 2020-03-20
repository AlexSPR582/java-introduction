package by.epam.courses.module5.task4.cave;

import by.epam.courses.module5.task4.treasure.Treasure;
import by.epam.courses.module5.task4.treasure.TreasureLogic;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DragonCaveLogic {
    private static DragonCaveLogic dragonCaveLogic;

    private DragonCaveLogic() {}

    public static DragonCaveLogic getInstance() {
        if (dragonCaveLogic == null) {
            dragonCaveLogic = new DragonCaveLogic();
        }
        return dragonCaveLogic;
    }

    public void readTreasuresFromFile(DragonCave cave) {
        String path = "src/by/epam/courses/module5/task4/treasure/treasures.txt";
        try (FileReader fr = new FileReader(path);
             Scanner sc = new Scanner(fr)) {
            Pattern pattern = Pattern.compile("(.+)\\s(\\d+)$");
            while (sc.hasNextLine()){
                Matcher matcher = pattern.matcher(sc.nextLine());
                if (matcher.find()){
                    cave.getTreasures().add(new Treasure(matcher.group(1),
                            Integer.parseInt(matcher.group(2))));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void writeTreasuresToFile(DragonCave cave) {
        String path = "src/by/epam/courses/module5/task4/treasure/treasures.txt";
        try (FileWriter fw = new FileWriter(path);
             PrintWriter pw = new PrintWriter(fw)) {
            for (Treasure treasure : cave.getTreasures()) {
                pw.println(treasure.getName() + " " + treasure.getPrice());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void printTreasures(DragonCave cave) {
        for (Treasure treasure: cave.getTreasures()) {
            TreasureLogic.getInstance().printTreasure(treasure);
        }
    }

    public void printTreasures(List<Treasure> treasures) {
        for (Treasure treasure: treasures) {
            TreasureLogic.getInstance().printTreasure(treasure);
        }
    }

    public Treasure findMostExpensiveTreasure(DragonCave cave){
        Treasure mostExpensive = null;
        if (cave.getTreasures().size() != 0) {
            mostExpensive = cave.getTreasures().get(0);
            for (Treasure treasure : cave.getTreasures()) {
                if (treasure.getPrice() > mostExpensive.getPrice()) {
                    mostExpensive = treasure;
                }
            }
        }
        return mostExpensive;
    }

    public List<Treasure> findTreasuresForPrice(int price, DragonCave cave){
        List<Treasure> list = new ArrayList<>();
        for (Treasure treasure: cave.getTreasures()) {
            if (treasure.getPrice() == price) {
                list.add(treasure);
            }
        }
        return list;
    }

    public void sortPrice(DragonCave cave) {
        cave.getTreasures().sort(new Comparator<Treasure>() {
            @Override
            public int compare(Treasure o1, Treasure o2) {
                return o1.getPrice() - o2.getPrice();
            }
        });
    }

    public void addTreasure(Treasure treasure, DragonCave cave) {
        if (!cave.getTreasures().contains(treasure)) {
            cave.getTreasures().add(treasure);
        }
    }
}
