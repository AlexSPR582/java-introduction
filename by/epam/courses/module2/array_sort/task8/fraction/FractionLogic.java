package by.epam.courses.module2.array_sort.task8.fraction;

public class FractionLogic {
    public int findCommonDenominator(Fraction... fractions) {
        int i = 0;
        int max = findMaxDenominator(fractions);
        int commonDenominator = findMaxDenominator(fractions);
        while (i < fractions.length){
            if (commonDenominator % fractions[i].getDenominator() != 0){
                commonDenominator += max;
                i = 0;
            }
            else {
                i++;
            }
        }
        return commonDenominator;
    }


    public Fraction[] sort(Fraction... fractions) {
        for (int i = 0; i < fractions.length; i++) {
            for (int j = i + 1; j < fractions.length; j++){
                if (compare(fractions[i], fractions[j]) == 1) {
                    Fraction buffer = fractions[i];
                    fractions[i] = fractions[j];
                    fractions[j] = buffer;
                }
            }
        }
        return fractions;
    }

    public void print(Fraction... fractions) {
        for (Fraction fraction: fractions) {
            System.out.print(fraction.getNumerator() + "/" + fraction.getDenominator() + " ");
        }
        System.out.println();
    }

    private int findMaxDenominator(Fraction... fractions) {
        int maxDenominator = fractions[0].getDenominator();
        for (int i = 0; i < fractions.length; i++) {
            if (fractions[i].getDenominator() > maxDenominator) {
                maxDenominator = fractions[i].getDenominator();
            }
        }
        return maxDenominator;
    }


    private int compare(Fraction fraction1, Fraction fraction2) {
        int commonDenominator = findCommonDenominator(fraction1, fraction2);
        int firstFactor = commonDenominator / fraction1.getDenominator();
        int secondFactor = commonDenominator / fraction2.getDenominator();
        if (firstFactor * fraction1.getNumerator() > secondFactor * fraction2.getNumerator()) {
            return 1;
        }
        else if (firstFactor * fraction1.getNumerator() < secondFactor * fraction2.getNumerator()) {
            return -1;
        }
        else {
            return 0;
        }
    }
}
