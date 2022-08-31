 import javax.swing.JOptionPane;
public class TenthQ {
    public static void main(String[] args) {
        String name=JOptionPane.showInputDialog("What IS Your Name?");
        String message=JOptionPane.showInputDialog("My Name IS Hal!  What Would You Like Me To Do? ");
        JOptionPane.showMessageDialog(null,"I'm Sorry, "+name+". I'm Afraid I Can't Do That");
    }
}
