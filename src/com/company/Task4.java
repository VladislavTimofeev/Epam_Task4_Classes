package com.company;

public class Task4 {

    public static void main(String[] args) {
        Train[] trains = new Train[5];
        trains[0] = createTrain("Gomel", 1165, 23.50);
        trains[1] = createTrain("Brest", 2309, 11.20);
        trains[2] = createTrain("Gomel", 3421, 15.40);
        trains[3] = createTrain("Moskow", 1108, 19.10);
        trains[4] = createTrain("Warsaw", 4583, 18.45);

        sortTrainByNumber(trains);
        for (Train train : trains) {
            Util.print(train.toString());
        }

        Util.print("-----");

        try {
            int trainNumber = Util.scanInt("Введите номер вагона: ");
            Train trainByNumber = findTrainByNumber(trains, trainNumber);
            Util.print(trainByNumber.toString());
        }catch (CustomException ex){
            Util.print(ex.getMessage());
        }

        Util.print("-----");

        sortTrainByDestination(trains);
        for (Train train : trains) {
            Util.print(train.toString());
        }

    }

    private static Train createTrain(String destination, int trainNumber, double departureTime) {
        Train train = new Train();
        train.setDestination(destination);
        train.setTrainNumber(trainNumber);
        train.setDepartureTime(departureTime);
        return train;
    }

    public static void sortTrainByNumber(Train[] trains) {
        for (int i = 0; i < trains.length - 1; i++) {
            for (int j = trains.length - 1; j > i; j--) {
                if (trains[j - 1].getTrainNumber() > trains[j].getTrainNumber()) {
                    swap(trains, j);
                }
            }
        }
    }

    public static Train findTrainByNumber(Train[] trains, int trainNumber) throws CustomException {
        for (Train train : trains) {
            if (train.getTrainNumber() == trainNumber) {
                return train;
            }
        }
        throw new CustomException("Object not found: " + trainNumber);
    }

    public static void sortTrainByDestination(Train[] trains) {
        for (int i = 0; i < trains.length - 1; i++) {
            for (int j = trains.length - 1; j > i; j--) {

                if (trains[j - 1].getDestination().equals(trains[j].getDestination()) &&
                        trains[j - 1].getDepartureTime() > trains[j].getDepartureTime()) {
                    swap(trains, j);
                } else if (trains[j - 1].getDestination().compareTo(trains[j].getDestination()) > 0) {
                    swap(trains, j);
                }
            }
        }
    }

    private static void swap(Train[] trains, int j) {
        Train temp = trains[j - 1];
        trains[j - 1] = trains[j];
        trains[j] = temp;
    }

}
