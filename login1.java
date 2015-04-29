import java.awt.*;
import java.awt.event.*;
import java.awt.Button.*;
class login1 extends Frame implements ActionListener
{
	Button b1,b2,b3,b4;
	String s1="",s2="";
	
	Button b;
	login1()
	{
	setVisible(true);
		setTitle("Billing Page");
		setSize(500,500);
		setFont(new Font("Times New Roman",Font.BOLD,20));
		setLayout(null);
		b1=new Button("Billing");
		b1.setBounds(120,40,100,60);
		add(b1);
		b2=new Button("Edit Inventory");
		b2.setBounds(120,100,150,80);
		add(b2);
		b3=new Button("Delete Inventory");
		b3.setBounds(120,200,200,90);
		add(b3);
		b4=new Button("Display Stack");
		b4.setBounds(120,300,250,100);
		add(b4);
		
		
				
setBackground(Color.RED);
	}
	public static void main(String ar[])
	{
		login1 l1=new login1();
	}
public void actionPerformed(ActionEvent e)
{
	if(e.getSource()==b)
	{
		setVisible(false);
		login l1=new login();
	}
	}
	}
	
