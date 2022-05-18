import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.lang.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import static javax.swing.JOptionPane.*;

public class MyActionListener implements ActionListener
{
	MyFrame mf;
	MyFrame2 mf2;
	MyFrame3 mf3;

	int turn = 0;
	int val = 0;
	String plr1, plr2;

	ArrayList<String> Arr_plr1 = new ArrayList<String>();
	ArrayList<String> Arr_plr2 = new ArrayList<String>();

	
	MyActionListener(MyFrame m){
		this.mf = m;
	}
	MyActionListener(MyFrame2 m){
		this.mf2 = m;
	}
	MyActionListener(MyFrame3 m){
		this.mf3 = m;
	}
	
	

	public void actionPerformed(ActionEvent e)
	{
		if(e.getActionCommand().equals("Player name")){
			System.out.println(e.getActionCommand() + "=" + this.mf.btn);
			mf2 = new MyFrame2();
			//mf.fm = this.mf;
			this.mf2.setVisible(true);
			this.mf.setVisible(false);
			this.mf2.mi1.setEnabled(false);
		}

		if(e.getActionCommand().equals("Save")) {
			System.out.println(e.getActionCommand() + "=" + this.mf2.b2);
			plr1 = mf2.t1.getText();
			plr2 = mf2.t2.getText();
			//System.out.println(" "+plr1 + " "+ plr2 + " ");
			this.mf.mi2.setEnabled(false);
		}

		if(e.getActionCommand().equals("Start game")){
			System.out.println(e.getActionCommand() + "=" + this.mf2.mi2);
			mf3 = new MyFrame3();
			mf3.fm2 = this.mf2;
			this.mf3.setVisible(true);
			this.mf2.setVisible(false);
		}

		if(mf3.isVisible()){
			if(turn == 0) {
				val += 1;
				if(e.getActionCommand().equals("Start game")) {
					System.out.println("\n Start game ..\n");
				}
				else {
                    ((Container) e.getSource()).setFont(new Font("ITALIC", Font.ITALIC, 90));
                    ((AbstractButton) e.getSource()).setText("X");
                }
				Arr_plr1.add(e.getActionCommand());

				turn = 1;
			}
			else{
				val += 1;
				if(e.getActionCommand().equals("Start game")) {
					System.out.println("\n Start game ..\n");
				}
				else {
                    ((Container) e.getSource()).setFont(new Font("ITALIC", Font.ITALIC, 90));
                    ((AbstractButton) e.getSource()).setText("O");
                }
				Arr_plr2.add(e.getActionCommand());

				turn = 0;
			}

		}

		if(val >= 5){
			if( (mf3.b1.getText().equals("X") && mf3.b2.getText().equals("X") && mf3.b3.getText().equals("X")) ||
				(mf3.b4.getText().equals("X") && mf3.b5.getText().equals("X") && mf3.b6.getText().equals("X")) ||
				(mf3.b7.getText().equals("X") && mf3.b8.getText().equals("X") && mf3.b9.getText().equals("X")) ||
				(mf3.b1.getText().equals("X") && mf3.b4.getText().equals("X") && mf3.b7.getText().equals("X")) ||
				(mf3.b2.getText().equals("X") && mf3.b5.getText().equals("X") && mf3.b8.getText().equals("X")) ||
				(mf3.b3.getText().equals("X") && mf3.b6.getText().equals("X") && mf3.b9.getText().equals("X")) || 
				(mf3.b1.getText().equals("X") && mf3.b5.getText().equals("X") && mf3.b9.getText().equals("X")) || 
				(mf3.b3.getText().equals("X") && mf3.b5.getText().equals("X") && mf3.b7.getText().equals("X"))) {
				
					JOptionPane.showMessageDialog(null, mf3.fm2.t1.getText()+" won", "congratulation", JOptionPane.WARNING_MESSAGE);
					mf3.setVisible(false);
				}
				
			if( (mf3.b1.getText().equals("O") && mf3.b2.getText().equals("O") && mf3.b3.getText().equals("O")) ||
				(mf3.b4.getText().equals("O") && mf3.b5.getText().equals("O") && mf3.b6.getText().equals("O")) ||
				(mf3.b7.getText().equals("O") && mf3.b8.getText().equals("O") && mf3.b9.getText().equals("O")) ||
				(mf3.b1.getText().equals("O") && mf3.b4.getText().equals("O") && mf3.b7.getText().equals("O")) ||
				(mf3.b2.getText().equals("O") && mf3.b5.getText().equals("O") && mf3.b8.getText().equals("O")) ||
				(mf3.b3.getText().equals("O") && mf3.b6.getText().equals("O") && mf3.b9.getText().equals("O")) || 
				(mf3.b1.getText().equals("O") && mf3.b5.getText().equals("O") && mf3.b9.getText().equals("O")) || 
				(mf3.b3.getText().equals("O") && mf3.b5.getText().equals("O") && mf3.b7.getText().equals("O")) ) {

					JOptionPane.showMessageDialog(null, mf3.fm2.t2.getText()+" won", "congratulation", JOptionPane.WARNING_MESSAGE);
					mf3.setVisible(false);

			}
		}
	}
}