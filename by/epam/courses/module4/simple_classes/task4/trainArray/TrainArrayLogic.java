package by.epam.courses.module4.simple_classes.task4.trainArray;

import by.epam.courses.module4.simple_classes.task4.train.Train;
import by.epam.courses.module4.simple_classes.task4.train.TrainLogic;

import java.util.Arrays;
import java.util.Comparator;

public class TrainArrayLogic {
    private static TrainArrayLogic trainArrayLogic;

    private TrainArrayLogic() {}

    public static TrainArrayLogic getInstance() {
        if (trainArrayLogic == null) {
            trainArrayLogic = new TrainArrayLogic();
        }
        return  trainArrayLogic;
    }

    public void sortTrainsByTrainNumber(Train[] trains) {
        Arrays.sort(trains, new Comparator<Train>() {
            @Override
            public int compare(Train t1, Train t2) {
                return t1.getTrainNumber() - t2.getTrainNumber();
            }
        });
    }

    public void findTrain(int trainNumber, Train[] trains) {
        TrainLogic tl = TrainLogic.getInstance();
        for (int i = 0; i < trains.length; i++) {
            if (trains[i].getTrainNumber() == trainNumber) {
                tl.getInformation(trains[i]);
            }
        }
    }

    public void sortTrainsByDestination(Train[] trains) {
        Arrays.sort(trains, new Comparator<Train>() {
            @Override
            public int compare(Train t1, Train t2) {
                int result = t1.getDestinationName().compareToIgnoreCase(t2.getDestinationName());
                if (t1.getMoveTime().isBefore(t2.getMoveTime())) {
                    return -1;
                }
                else if (t1.getMoveTime().isAfter(t2.getMoveTime())) {
                    return 1;
                }
                return result;
            }
        });
    }

    public void printTrainArray(Train[] trains) {
        TrainLogic tl = TrainLogic.getInstance();
        for (Train train: trains) {
            tl.getInformation(train);
        }
    }
}
