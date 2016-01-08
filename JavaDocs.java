import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JavaDocs extends JFrame{ //implements ActionListener{
    private Container pane;
    private JTextField t;
    private JButton a, b;

    
    public JavaDocs(){
	this.setTitle("JavaDocs");
	this.setSize(600,400);
	this.setLocation(100,100);
	this.setDefaultCloseOperation(EXIT_ON_CLOSE);

	pane=this.getContentPane();
	pane.setLayout(new BoxLayout(pane, BoxLayout.Y_AXIS));

	a = new JButton("Load File");

	b = new JButton("Save File");

	t = new JTextField();

	pane.add(a);
	pane.add(b);
	pane.add(t);
    }

}
