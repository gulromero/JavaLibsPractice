public class TestClass {
    public static void main(String[] args) {
        // Creating an instance of ComputeMethods
        ComputeMethods cm = new ComputeMethods();

        // Invoking fToC method and display the result
        double tempInCelsius = cm.fToC(100); 
        System.out.println("Temp in celsius is " + tempInCelsius);

        // Invoking hypotenuse method and displaying the result
        double hypotenuse = cm.hypotenuse(6, 9); 
        System.out.println("Hypotenuse is " + hypotenuse);

        // Invoking roll method and display the result
        int diceSum = cm.roll();
        System.out.println("The sum of the dice values is " + diceSum);
    }
}
