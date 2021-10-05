import javax.swing.JOptionPane;

/* A program that creates a window and greets the user*/
public class UIGreetings {
    public static void main(String[] args) {

        //display an input prompt
        String name = JOptionPane.showInputDialog("What is your name?");

        //change to an output prompt
        JOptionPane.showMessageDialog(null, "Hello " + name, "Greetings fellow human", 0);
    }
}
