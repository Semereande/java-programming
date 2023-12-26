public class SecondClass {

    public static void main(String[] args){
        System.out.println("Hello, Mussie");

        boolean isAlien = false;

        if(isAlien == false) {
            System.out.println("It is not an alien");
            System.out.println("I am not scared of aliens");
        }

        int topScore = 80;
        if(topScore < 100){
            System.out.println("you got the high score!");
        }

        int secondTopScore = 60;
        if((topScore > secondTopScore) || (topScore < 100)){
            System.out.println("Greater than top score and less than 100");
        }

        if((topScore > 90) || (secondTopScore <= 90)){
            System.out.println("Either or Both of the conditions are true");
        }

        int newValue = 50;
        if(newValue == 50){
            System.out.println("This is true");
        }

        boolean isCar = false;
        if(isCar){
            System.out.println("This is not suppose to happen");
        }

        String madeOfCar = "Volkswagen";
        boolean isDomestic = madeOfCar == "Volkswagen" ? false : true;
        if(isDomestic){
            System.out.println("This car is domestic to our country");
        }
       String s = (isDomestic) ? "This car is domestic" : "This car is not domestic";
        System.out.println(s);


        double number1 = 20.00d;
        double number2 = 80.00d;
        double total = (number1 + number2) * (100.00d);
        System.out.println("My total = " + total);
        double remaineder = (total) % (40.00);
        System.out.println("the Remainder = " + remaineder);

        boolean checkRemaineder =  (remaineder == 0 ) ? true : false;
        System.out.println("check remainder = " + checkRemaineder);

        if(!checkRemaineder){
            System.out.println("got some remainder");
        }

    }
}
