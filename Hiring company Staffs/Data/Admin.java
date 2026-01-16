package Data;

import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Admin extends JFrame implements MouseListener,ActionListener
{
	JPanel panel;
	JLabel text1,text2,text3;
	JTextField tf1,tf2;
	JPasswordField pf1;
	JButton jb1,jb2;
	Color c1,c2;
	Font f1,f2;
	public Admin()
	{
		super("Administration");
		super.setBounds(500,275,330,270);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		c1=new Color(243,173,112);
		c2=new Color(236,135,135);
		
		panel=new JPanel();
		panel.setLayout(null);
		panel.setBackground(c1);
		
		f1=new Font("Comic Sans MS",Font.BOLD,18);
		text1=new JLabel("Administrator Login");
		text1.setBounds(50,30,260,24);
		text1.setFont(f1);
		panel.add(text1);
		
		f2=new Font("Comic Sans MS",Font.BOLD,12);
		text2=new JLabel("Administrator E-mail:");
		text2.setBounds(20,80,130,20);
		text2.setFont(f2);
		panel.add(text2);
		
		tf1=new JTextField();
		tf1.setBounds(150,80,100,20);
		panel.add(tf1);
		
		f2=new Font("Comic Sans MS",Font.BOLD,12);
		text3=new JLabel("Administrator Password:");
		text3.setBounds(20,120,150,20);
		text3.setFont(f2);
		panel.add(text3);
		
		pf1=new JPasswordField();
		pf1.setBounds(170,120,100,20);
		panel.add(pf1);
		
		jb1=new JButton("Return");
		jb1.setBounds(55,170,100,40);
		jb1.addActionListener(this);
		jb1.setFont(f1);
		jb1.addMouseListener(this);
		jb1.setBackground(c2);
		panel.add(jb1);
		
		jb2=new JButton("Login");
		jb2.setBounds(165,170,100,40);
		jb2.addActionListener(this);
		jb2.setFont(f1);
		jb2.addMouseListener(this);
		jb2.setBackground(c2);
		panel.add(jb2);
		
		this.add(panel);
}
public void mouseClicked(MouseEvent me)
	{
	}
	public void mousePressed(MouseEvent me) 
	{
	}
	public void mouseReleased(MouseEvent me) 
	{
	}
	public void mouseEntered(MouseEvent me) 
	{
        if(me.getSource() == jb1)
		{
		jb1.setBackground(Color.BLACK);
		jb1.setForeground(Color.WHITE);
		}
		else if(me.getSource() == jb2)
		{
		jb2.setBackground(Color.BLACK);
		jb2.setForeground(Color.WHITE);
		}
		else
		{
		}	
	}
	public void mouseExited(MouseEvent me)
	{
		if(me.getSource() == jb1)
		{
		jb1.setBackground(c2);
		jb1.setForeground(Color.BLACK);
		}
		else if(me.getSource() == jb2)
		{
		jb2.setBackground(c2);
		jb2.setForeground(Color.BLACK);
		}
		
	}
public void actionPerformed(ActionEvent ae)
{
	if(ae.getSource()==jb1)
	{
		Main obj1=new Main();
		obj1.setVisible(true);
		this.setVisible(false);
	}
	else if(ae.getSource()==jb2)
	{
		String adminemail = tf1.getText();
      String adminpass = pf1.getText();

      if (adminemail.equals("admin") && adminpass.equals("admin")) 
	    {

                Adminprofile obj2=new Adminprofile();
				obj2.setVisible(true);
				this.setVisible(false);
	    }

    else 
	{
        JOptionPane.showMessageDialog(null, "Invalid E-mail or Password!");
    }
	}
	else
	{
	}
}
}