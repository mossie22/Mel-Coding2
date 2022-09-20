public class ninetwentyone {
    public static void main(String[] args)
    {
        double numBlocks = 2500000.0;
        double blockWeight = 2.5;
        System.out.println("the pyramid weighs " + (numBlocks * blockWeight) + " tons");


        double numerator1 = 1;
        double denomenator1 = 2;
        double numerator2 = 2;
        double denomenator2 = 5;
        double finalNumerator = (numerator1 * denomenator2) + (denomenator1 * numerator2);
        double finalDenomenator = (denomenator1 * denomenator2);
        System.out.println("the numerator of the first fraction is: " + numerator1);
        System.out.println("the denomenator of the first fraction is: " + denomenator1);
        System.out.println("the numerator of the second fraction is: " + numerator2);
        System.out.println("the denomenator of the second fraction is: " + denomenator2);
        System.out.println("the sum of " + numerator1 + "/" + denomenator1 + " + " + numerator2 + "/" + denomenator2 + " is " + finalNumerator + "/" + finalDenomenator);

    }
}
