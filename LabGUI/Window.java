import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Window extends JFrame implements ActionListener{
    private Container pane;
    private static JTextField t;
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
	t = new JTextField(5);
	pane.add(t);
	l = new JLabel("");
	pane.add(l);
    }

    public void actionPerformed(ActionEvent e){
	String event = e.getActionCommand();
	double s = Double.parseDouble(t.getText());
	/*if(number()==false){
	    l.setText("Please input numbers");
	    
	}*/
	try{
	    Integer.parseInt(t.getText());
	    if(event.equals("From Celcius")){
		s = CtoF(s);
		l.setText(s+"F");	    
	    }
	    if(event.equals("From Farenheit")){
		s = FtoC(s);
		l.setText(s+"C");
	    }
	}catch(NumberFormatException n){
	    l.setText("Please input numbers");
	}
	
    }

    public static double CtoF(double c){
	return c * 9/5 +32;
    }
    public static double FtoC(double f){
	return (f - 32) * 5/9;
    }

    //help from kevin
    public static boolean number(){
	String input = t.getText();
	if(input.length()==0){
	    return false;
	}
	for(int i=0; i<input.length();i++){
	    if(!Character.isDigit(input.charAt(i))){
		return false;
	    }
	}
	return true;
    }
}