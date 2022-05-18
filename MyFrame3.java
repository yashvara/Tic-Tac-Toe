import java.awt.AWTEvent.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.lang.*;

public class MyFrame3 extends JFrame
{
	MyFrame fm;
	MyFrame2 fm2;
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9;
	Character sign = 'X';
	MyFrame3()
	{
		super("TIC TAC TOE");
        MyActionListener ml = new MyActionListener(this);
		setLayout(null);
		setBounds(0,0,500,500);		
		setLayout(new GridLayout(3,3));

		b1 = new JButton("");
		b2 = new JButton("");
		b3 = new JButton("");
		b4 = new JButton("");
		b5 = new JButton("");
		b6 = new JButton("");
		b7 = new JButton("");
		b8 = new JButton("");
		b9 = new JButton("");

		Font font = new Font("ITALIC",Font.BOLD,25);

        b1.setFont(font);
        b2.setFont(font);
        b3.setFont(font);
        b4.setFont(font);
        b5.setFont(font);
        b6.setFont(font);
        b7.setFont(font);
        b8.setFont(font);
        b9.setFont(font);

		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		add(b6);
		add(b7);
		add(b8);
		add(b9);
		
		b1.addActionListener(ml);
		b2.addActionListener(ml);
		b3.addActionListener(ml);
		b4.addActionListener(ml);
		b5.addActionListener(ml);
		b6.addActionListener(ml);
		b7.addActionListener(ml);
		b8.addActionListener(ml);
		b9.addActionListener(ml);
		

		addWindowListener(new WindowAdapter()
			{
				public void windowClosing(WindowEvent we)
				{
					System.exit(0);
				}
			});
	}
	public static void main(String args[])
	{
		MyFrame3 mf = new MyFrame3();
		mf.setVisible(true);

	}
}