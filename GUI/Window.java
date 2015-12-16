import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Window extends JFrame {
    private Container pane;

    public Window() {
        this.setTitle("Temperture Conversion");
        this.setSize(400,200);
        this.setLocation(75,50);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

	pane = this.getContentPane();
	pane.setLayout(new FlowLayout());

	JButton b1 = new JButton("C to F");
	pane.add(b1);
	JButton b2 = new JButton("F to C");
	pane.add(b2);
	JTextField t = new JTextField(10);
	pane.add(t);
    }

    public static double CtoF(double t){
	return t * 9/5 +32;
    }
    public static double FtoC(double t){
	return (t - 32) * 5/9;
    }

    public static void main(String[] args) {
        Window g = new Window();
        g.setVisible(true);

    }
}