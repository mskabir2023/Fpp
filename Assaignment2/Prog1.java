/*Create a class called Prog1. In the main method of the class, output to the console the result
of doing the following two computations:
1. get a random number x in the range 1 .. 9 and compute πx.
2. get a random number y in the range 3 .. 14 and compute yπ.
Use the RandomNumbers.java class that has been provided for you as an attachment. (Do not
use the Random class directly.) Use Math API to solve πx and yπ.*/

public class Prog1 {
    public static void main(String[] args) {
        int x=RandomNumbers.getRandomInt(1,9);
        int y=RandomNumbers.getRandomInt(3,14);
        System.out.println("First Result is : " + Math.pow(Math.PI,x));
        System.out.println("Second Result is : " +Math.pow(y,Math.PI));
    }
}
