//package p1;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.lang.*;

public class MyFrame extends JFrame
{
	JButton btn;
	JMenuBar mb;
    JMenu m1;
    JMenuItem mi1, mi2;

	MyActionListener ml = new MyActionListener(this);
	MyFrame()
	{
		super("TIC TAC TOE");
		setLayout(null);
		//setBounds(0,0,900,900);
		setBounds(0,0,500,500);
		
		btn = new JButton("Player name");
		mb= new JMenuBar();
        m1 = new JMenu("Menu");
        setJMenuBar(mb);
        mb.add(m1);

        mi1 = new JMenuItem("Player name");
        mi2 = new JMenuItem("Start game");


		//add(btn);
        m1.add(mi1);
        m1.add(mi2);

		//btn.setBounds(100,100,100,100);
		
		
		mi1.addActionListener(ml);
		
		addWindowListener(new WindowAdapter()
			{
				public void windowClosing(WindowEvent we)
				{
					System.exit(0);
				}
			});
	}
	public static void main(String[] args)
	{
		MyFrame mf = new MyFrame();
		mf.setVisible(true);
		mf.mi2.setEnabled(false);
	}
}