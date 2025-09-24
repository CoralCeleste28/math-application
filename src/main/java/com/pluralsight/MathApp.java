public class MathApp {
    public static void main(String[] args) {
       //Question 1
        double bobSalary = 30.00;
        double garySalary = 27.00;
        double highestSalary = Math.max(bobSalary, garySalary);
        System.out.println("Question 1");
        System.out.println("The highest salary is " + highestSalary + "\n");

        //Question 2
        double carPrice = 15000.00;
        double truckPrice = 25000.00;
        System.out.println("Question 2");
        System.out.println("Car Price: " + carPrice);
        System.out.println("Truck Price: " + truckPrice + "\n");

        //Question 3
        double radiusincm = 7.25;
        double area = Math.PI * radiusincm * radiusincm;
        System.out.println("Question 3");
        System.out.println("The area of the circle is " + area + "\n");

        //Question 4
        double number = 5.0;
        double squareRoot = Math.sqrt(number);
        System.out.println("Question 4");
        System.out.println("The square root of " + number + " is " + squareRoot + "\n");

        //Question 5
        int x1 = 5;
        int x2 = 85;
        int y1 = 10;
        int y2 = 50;

        double deltaX = x2 - x1;
        double deltaY = y2 - y1;
        double distance = Math.hypot(deltaX, deltaY);
        System.out.println("Question 5");
        System.out.println("The distance between points (5, 10) and (85, 50) is " + distance + "\n");

        //Question 6
        number = -3.8;
        double absoluteValue = Math.abs(number);
        System.out.println("Question 6");
        System.out.println("The absolute of -3.8 is " + absoluteValue + "\n");

        //Question 7
        number = 0.5;
        System.out.println("Question 7");
        System.out.println("Find and display a random number between 0 and 1: " + number);

        number = Math.random();
        System.out.println("Find and display a random number between 0 and 1: " + number + "\n");


        //Question 8
        int minutesInHour = 60;
        int hoursInDay = 24;
        System.out.println("Question 8");
        System.out.println("There are " + hoursInDay * minutesInHour + " minutes in a day.");




    }





}