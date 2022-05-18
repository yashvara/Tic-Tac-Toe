import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import javax.swing.text.LabelView;
import java.lang.*;

public class MyFrame2 extends JFrame
{
	MyFrame fm ;
	MyFrame2 fm2;
	JButton b2;
    JTextField t1, t2;
    Label lbl1, lbl2;
	JMenuBar mb;
	JMenu m1;
	JMenuItem mi1, mi2;

	MyFrame2()
	{
		super("TIC TAC TOE");
		setLayout(null);
        setBounds(0,0,500,500);
		MyActionListener ml = new MyActionListener(this);

		Font ft = new Font("ITALIC",Font.BOLD,18);
		
		b2 = new JButton("Save");
		t1 = new JTextField();
        lbl1 = new Label("Player 1"); 
        t2 = new JTextField();
        lbl2 = new Label("Player 2");
		mb= new JMenuBar();
		m1 = new JMenu("Menu"); 
		mi1 = new JMenuItem("Player name");
        mi2 = new JMenuItem("Start game");

		setJMenuBar(mb);
        mb.add(m1);

		lbl1.setFont(ft);
		lbl2.setFont(ft);
        b2.setFont(ft);

		add(b2);
        add(t1);
        add(t2);
        add(lbl1);
        add(lbl2);
		add(mb);	
		m1.add(mi1);
        m1.add(mi2);
		
        lbl1.setBounds(100,100,100,50);
        t1.setBounds(200,100,200,50);      
        lbl2.setBounds(100,200,100,50);
        t2.setBounds(200,200,200,50);
		b2.setBounds(100,300,150,50);
	
		mi2.addActionListener(ml);
		
		addWindowListener(new WindowAdapter()
			{
				public void windowClosing(WindowEvent we)
				{
					System.exit(0);
				}
			});
	}
	public static void main(String args[]){
		MyFrame2 mf = new MyFrame2();
		mf.setVisible(true);
		mf.mi1.setEnabled(false);
		mf.mi2.setEnabled(true);
		
	}
	
}