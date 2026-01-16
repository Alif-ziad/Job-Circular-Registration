package Data;

import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Ssignup extends JFrame implements MouseListener,ActionListener
{
	JPanel panel;
	JLabel text1, text2, text3, text4, text5, text6, text7, text8, text9, text10,text11,text12,text13;
	JTextField tf1, tf2, tf3, tf4, tf5, tf6;
	JRadioButton rb1, rb2, rb3, rb4, rb5;
	ButtonGroup bg1,bg2;
	JPasswordField pf1, pf2;
	JCheckBox cb1, cb2;
	JComboBox jcb1;
	JButton jb1, jb2;
	
	Color c1,c2,c3;
	Font f1,f2,f3,f4,f5,f6;
	
	public Ssignup()
	{
		super("Security Signup");
		super.setBounds(350,100,570,600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		c1=new Color(243,173,112);
		c2=new Color(236,135,135);
		c3=new Color(246,220,87);
		
		panel=new JPanel();
		panel.setLayout(null);
		panel.setBackground(c1);
		
		f1=new Font("Comic Sans MS",Font.BOLD,20);
		text1=new JLabel("Apply for Security");
		text1.setBounds(160,20,250,30);
		text1.setFont(f1);
		panel.add(text1);
		
		f2=new Font("Comic Sans MS",Font.BOLD,12);
		text2=new JLabel("*Full Name :");
		text2.setBounds(10,60,100,20);
		text2.setFont(f2);
		panel.add(text2);
		
		tf1=new JTextField();
		tf1.setBounds(110,60,200,20);
		panel.add(tf1);
		
		text3=new JLabel("*Phone Number(+88) :");
		text3.setBounds(10,90,130,20);
		text3.setFont(f2);
		panel.add(text3);
		
		tf2=new JTextField();
		tf2.setBounds(140,90,85,20);
		panel.add(tf2);
		
		text4=new JLabel("*E-mail :");
		text4.setBounds(10,120,80,20);
		text4.setFont(f2);
		panel.add(text4);
		
		tf3=new JTextField();
		tf3.setBounds(90,120,180,20);
		panel.add(tf3);
		
		text5=new JLabel("*NID :");
		text5.setBounds(10,150,60,20);
		text5.setFont(f2);
		panel.add(text5);
		
		tf4=new JTextField();
		tf4.setBounds(70,150,200,20);
		panel.add(tf4);
		
		text6=new JLabel("*Gender :");
		text6.setBounds(10,180,60,20);
		text6.setFont(f2);
		panel.add(text6);
		
		rb1 = new JRadioButton("Male");
		rb1.setBounds(80,180,100,20);
		rb1.setBackground(c1);
		panel.add(rb1);
		
		rb2 = new JRadioButton("Female");
		rb2.setBounds(190,180,120,20);
		rb2.setBackground(c1);
		panel.add(rb2);
		
		bg1 = new ButtonGroup();
		bg1.add(rb1);
		bg1.add(rb2);
		
		text7=new JLabel("Previous working place(If applicable) :");
		text7.setBounds(15,210,220,20);
		text7.setFont(f2);
		panel.add(text7);
		
		tf5=new JTextField();
		tf5.setBounds(235,210,300,20);
		panel.add(tf5);
		
		text8=new JLabel("Years of experience(If applicable) :");
		text8.setBounds(15,240,225,20);
		text8.setFont(f2);
		panel.add(text8);
		
		tf6=new JTextField();
		tf6.setBounds(240,240,25,20);
		panel.add(tf6);
		
		text9=new JLabel("Years");
		text9.setBounds(270,240,50,20);
		text9.setFont(f2);
		panel.add(text9);
		
		text10=new JLabel("Preferred Working Shift:");
		text10.setBounds(15,270,150,20);
		text10.setFont(f2);
		panel.add(text10);
		
		rb3 = new JRadioButton("Morning(4am-12pm)");
		rb3.setBounds(160,270,150,20);
		rb3.setBackground(c1);
		panel.add(rb3);
		
		rb4 = new JRadioButton("Day(12pm-8pm)");
		rb4.setBounds(160,300,150,20);
		rb4.setBackground(c1);
		panel.add(rb4);
		
		rb5 = new JRadioButton("Night(8pm-4am)");
		rb5.setBounds(160,330,150,20);
		rb5.setBackground(c1);
		panel.add(rb5);
		
		bg2 = new ButtonGroup();
		bg2.add(rb3);
		bg2.add(rb4);
		bg2.add(rb5);
		
		text11=new JLabel("*Password:");
		text11.setBounds(10,360,75,20);
		text11.setFont(f2);
		panel.add(text11);
		
		pf1=new JPasswordField();
		pf1.setBounds(85,360,70,20);
		pf1.setEchoChar('*');
		panel.add(pf1);
		
		text12=new JLabel("*Confirm Password:");
		text12.setBounds(10,390,125,20);
		text12.setFont(f2);
		panel.add(text12);
		
		pf2=new JPasswordField();
		pf2.setBounds(135,390,70,20);
		pf2.setEchoChar('*');
		panel.add(pf2);
		
		cb1=new JCheckBox("Yes, I agree to all the terms and agreements.*");
		cb1.setBounds(30,440,400,20);
		cb1.setFont(f2);
		cb1.setBackground(c1);
	    panel.add(cb1);
		
		
		jb1=new JButton("Signup");
		jb1.setBounds(100,490,100,40);
		jb1.addActionListener(this);
		jb1.setFont(f2);
		jb1.addMouseListener(this);
		jb1.setBackground(c2);
		panel.add(jb1);
		
		jb2=new JButton("Cancel");
		jb2.setBounds(350,490,100,40);
		jb2.addActionListener(this);
		jb2.setFont(f2);
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
		if(me.getSource()==jb1)
		{
		jb1.setBackground(c3);
		jb1.setForeground(Color.WHITE);
		}
		else if(me.getSource()==jb2)
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
		if(me.getSource()==jb1)
		{
		jb1.setBackground(c2);
		jb1.setForeground(Color.BLACK);
		}
		else if(me.getSource()==jb2)
		{
		jb2.setBackground(c2);
		jb2.setForeground(Color.BLACK);
		}
		else
		{
		}
	}
	public void actionPerformed(ActionEvent ae)
{
	if(ae.getSource()==jb1)
	{
		String s1, s2, s3, s4, s5, s6, s7, s8, s9, s10;
		s1=tf1.getText();
		s2=tf2.getText();
		s3=tf3.getText();
		s4=tf4.getText();
		if(rb1.isSelected())
		{
			s5=rb1.getText();
		}
		else if(rb2.isSelected())
		{
			s5=rb2.getText();
		}
		else 
		{
		s5="";
		}
		s6=tf5.getText();
		s7=tf6.getText();
		if(rb3.isSelected())
		{
			s8=rb3.getText();
		}
		else if(rb4.isSelected())
		{
			s8=rb4.getText();
		}
		else if(rb5.isSelected())
		{
			s8=rb5.getText();
		}
		else
		{
			s8="any Shift";
		}
		
		s9=pf1.getText();
		s10=pf2.getText();
		if(s1.isEmpty()||s2.isEmpty()||s3.isEmpty()||s4.isEmpty()||s5.isEmpty()||s9.isEmpty()||s10.isEmpty())
		{
			JOptionPane.showMessageDialog(this,"Fill all '*'marked fields");
		}
		else
		{
			Sstore a1=new Sstore(s3,s9);
			a1.addsstore();
			JOptionPane.showMessageDialog(this,"added");
			tf1.setText("");
			tf2.setText("");
			tf3.setText("");
			tf4.setText("");
			tf5.setText("");
			tf6.setText("");
			pf1.setText("");
			pf2.setText("");
			
		Sconfirm obj1=new Sconfirm(s1,s2,s3,s4,s5,s6,s7,s8,s9,s10);
		obj1.setVisible(true);
		this.setVisible(false);
			
		}
	}
	else if(ae.getSource()==jb2)
	{
		Main obj2=new Main();
		obj2.setVisible(true);
		this.setVisible(false);
	}
	else
	{
	}
}
}
