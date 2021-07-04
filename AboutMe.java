package AboutMe;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String myName;
        short myAge;
        String zodiacSign;
        boolean amIStockInvestor;
        float unrealisedProfitPercent;
        int monthsInInvesting;
        double averageUnrealisedProfitPerMonth;
        char currency = 'E';

        // E = EUR

        byte happinessLevel;
        String superSkill1, superSkill2, superSkill3;

        myName = "Aleksandra Gorbule";
        myAge = 22;
        zodiacSign = "Aries";
        amIStockInvestor = true;
        monthsInInvesting = 8;
        unrealisedProfitPercent = 49;
        averageUnrealisedProfitPerMonth = unrealisedProfitPercent / monthsInInvesting;
        happinessLevel = 10;
        superSkill1 = ("Dancing like nobody's watching!");
        superSkill2 = ("Singing like nobody's listening!");
        superSkill3 = ("Staying positive even in hard times!");



        System.out.println("*************");
        System.out.println("Hello there!");
        System.out.println(" ");
        System.out.println("My name is " + myName);
        System.out.println(" ");
        System.out.println("I am " + myAge +" y.o.");
        System.out.println(" ");
        System.out.println("My zodiac sign is " + zodiacSign);
        System.out.println("_____________");
        System.out.println("I have 3 super skills:");
        System.out.println("1. " + superSkill1);
        System.out.println("2. " + superSkill2);
        System.out.println("3. " + superSkill3);
        System.out.println("_____________");
        System.out.println("Am I beginner in Stock Investing? " + "YES, it is " + amIStockInvestor);
        System.out.println("In this field I am only " + monthsInInvesting + " months");
        System.out.println("Average profit per month is " + averageUnrealisedProfitPerMonth + " %");
        System.out.println("_____________");
        System.out.println("Level of Happiness TODAY from 0 to 10: " + happinessLevel);
