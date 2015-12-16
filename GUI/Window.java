import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Window extends JFrame {
    private Container pane;
    private JTextField t;
    private JLabel l;

    public Window() {
        this.setTitle("Temperture Conversion");
        this.setSize(400,200);
        this.setLocation(75,50);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

	pane = this.getContentPane();
	pane.setLayout(new BoxLayout(pane,BoxLayout.PAGE_AXIS));

	JButton b1 = new JButton("C to F");
	pane.add(b1);
	b1.addActionListener(this);
	b1.setActionCommand("From Celcius");
	JButton b2 = new JButton("F to C");
	pane.add(b2);
	b2.addActionListener(this);
	b2.setActionCommand("From Farenheit");
	t = new JTextField(10);
	pane.add(t);
	l = new JLabel("");
	pane.add(l);
    }

    public void actionPerformed(ActionEvent e){
	String event = e.getActionCommand();
	if(event.equals("From Celcius")){
	    int s = CtoF(t.getText());
	    l.setText(s);	    
	}
	if(event.equals("From Farenheit")){
	    
	}
    }

    public static double CtoF(double t){
	return t * 9/5 +32;
    }
    public static double FtoC(double t){
	return (t - 32) * 5/9;
    }


}