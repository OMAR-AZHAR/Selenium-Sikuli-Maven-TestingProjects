package mutate;

public class Mutate_043 {

    public String mutateit() {


        double[] numArray = { 207, 222, 33, 55, 99.7, 202.5 };


        for (double num: numArray) {

            while(numArray[0] < num)
                numArray[0] = num;
        }
        String large=String.valueOf(numArray[0]);

        System.out.format("Largest element = %.2f", numArray[0]);
        return large;
    }
}
