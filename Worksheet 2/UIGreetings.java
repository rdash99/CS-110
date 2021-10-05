import javax.swing.JOptionPane;

public class UIGreetings {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("What is your name?");
        JOptionPane.showMessageDialog(null, "Hello " + name, "Greetings fellow human", 0);
    }
}
