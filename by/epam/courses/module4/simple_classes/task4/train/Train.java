package by.epam.courses.module4.simple_classes.task4.train;

import java.time.LocalTime;
import java.util.Objects;

public class Train {
    private String destinationName;
    private int trainNumber;
    private LocalTime moveTime;

    public Train(String destination, int trainNumber, String moveTime){
        this.destinationName = destination;
        this.trainNumber = trainNumber;
        this.moveTime = LocalTime.parse(moveTime);
    }

    public String getDestinationName() {
        return destinationName;
    }

    public void setDestinationName(String destinationName) {
        this.destinationName = destinationName;
    }

    public int getTrainNumber() {
        return trainNumber;
    }

    public void setTrainNumber(int trainNumber) {
        this.trainNumber = trainNumber;
    }

    public LocalTime getMoveTime() {
        return moveTime;
    }

    public void setMoveTime(LocalTime moveTime) {
        this.moveTime = moveTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Train train = (Train) o;
        return trainNumber == train.trainNumber &&
                Objects.equals(destinationName, train.destinationName) &&
                Objects.equals(moveTime, train.moveTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(destinationName, trainNumber, moveTime);
    }

    @Override
    public String toString() {
        return "Train{" +
                "destinationName='" + destinationName + '\'' +
                ", trainNumber=" + trainNumber +
                ", moveTime=" + moveTime +
                '}';
    }
}
