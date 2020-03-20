package by.epam.courses.module4.simple_classes.task4.train;

public class TrainLogic{
    private static TrainLogic trainLogic;

    private TrainLogic() {}

    public static TrainLogic getInstance() {
        if (trainLogic == null) {
            trainLogic = new TrainLogic();
        }
        return trainLogic;
    }

    public void getInformation(Train train) {
        System.out.println(train.getDestinationName() +
                ", " + train.getTrainNumber() +
                ", " + train.getMoveTime());
    }
}
