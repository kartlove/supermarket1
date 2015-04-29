import java.awt.*;
import java.awt.event.*;
import java.awt.Button.*;
class login extends Frame implements ActionListener
{
	Label l1,l2,l3;
	String s1="",s2="";
	Button b,b1;
	TextField t1,t2;
	login()
	{
		setVisible(true);
		setTitle("LOGIN PAGE");
		setSize(500,500);
		setFont(new Font("Times New Roman",Font.BOLD,20));
		setLayout(null);
		l1=new Label("Username");
		l1.setBounds(100,100,100,50);
		add(l1);
		l2=new Label("Password");
		l2.setBounds(100,250,100,50);
		add(l2);
		l3=new Label("SuperMarket Management System");
		l3.setBounds(105,15,400,50);
		add(l3);
		t1=new TextField();
		t1.setBounds(250,100,100,50);
		add(t1);
		t2=new TextField();
		t2.setEchoChar('*');
		t2.setBounds(250,250,100,50);
		add(t2);
		
		b=new Button("admin");
		b.setBounds(180,410,80,100);
		add(b);
		b1=new Button("user");
		b1.setBounds(260,410,90,100);
		add(b1);
		
setBackground(Color.RED);
	}

	public static void main(String ar[])
	{
		login l1=new login();
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
