package ru.netology.sqr;

public class SQRService {
    public int howManySquares(int lowerLimit, int upperLimit) {
        int counter = 0;

        for (int i = 10; i <= 99; i++) {
            int iSquare = i * i;
            if (iSquare >= lowerLimit) {
                if (iSquare <= upperLimit) {
                    counter++;
                }
            }
        }
        return  counter;

    }

}
