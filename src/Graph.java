import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
class GUI extends JFrame{
	public GUI(){
		init();
		setLayout(new FlowLayout());
		JLabel username = new JLabel("Username : ");
		JTextField name= new JTextField(20);
		add(username);
		add(name);
		JLabel password = new JLabel("Password : ");
		add(password);
		JTextField pass= new JTextField(20);
		add(pass);
		JButton Log= new JButton("Log in");
		add(Log);
	}
	public void init()
	{
		
	}
}
public class Graph {
	public static void main(String[] args)
	{
		GUI a=new GUI();
		a.setSize(300,300);
		a.setVisible(true);
		
	}
}
