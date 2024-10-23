import java.util.Random;

public class ComputeMethods {
    
    // Method to convert Fahrenheit to Celsius
    public double fToC(double degreesF) {
        return (degreesF - 32) * 5 / 9;
    }

    // Method to compute the hypotenuse of a triangle
    public double hypotenuse(int a, int b) {
        return Math.sqrt((a * a) + (b * b));
    }

    // Method to simulate rolling two dice and return their sum
    public int roll() {
        Random rand = new Random();
        int die1 = rand.nextInt(6) + 1; 
        int die2 = rand.nextInt(6) + 1; 
        return die1 + die2;
    }
}

