import javax.swing.JOptionPane;

public class JavaLibsPractice {

    public static void main(String[] args) {

        //Customize the InputDialog (title, the placement text etc)
        //ShowMessageDialog doesn't provide a field for input (done)
        String name = JOptionPane.showInputDialog("Hi! Whats your name?");
        int age = Integer.parseInt(JOptionPane.showInputDialog("How old are you?"));
        double price = Double.parseDouble(JOptionPane.showInputDialog("Enter a random number"));
        String noun = JOptionPane.showInputDialog("Enter a noun");
    
        // Perfoming calculations for age and price
        int nextYear = age + 1;
        double randomNumber2 = price * 100;

        // Creating a lil' story
        String story = "Hi! My name is " + name + " I am " + age + " years old." + " In some years, I'll be " + nextYear + " years old. " + " I bought a " + noun + " for " + price + " but atleast it wasn't " + randomNumber2;
       
        // Displaying the story
        JOptionPane.showMessageDialog(null, story);

        //Show message that game is done, without input field
        JOptionPane.showMessageDialog(null,"MadLibs game is now done!");


    }   
}