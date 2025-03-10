package Projects;

//One Piece GUI

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Main1 implements ActionListener{
	
	private JPanel header;
	private JPanel body;
	private JPanel captain;
	private JPanel swordsman;
	private JPanel cook;
	
	private JLabel title;
	private JLabel luffy;
	private JLabel zoro;
	private JLabel sanji;
	
	private JButton b1;
	private JButton b2;
	private JButton b3;
	
	ImageIcon luffy2 = new ImageIcon("luffy2.png");
	ImageIcon zoro2 = new ImageIcon("zoro2.png");
	ImageIcon sanji2 = new ImageIcon("sanji2.png");
	
	Main1(){
		JFrame frame = new JFrame("Project-1");
		frame.setVisible(true);
		frame.setLayout(null);
		frame.setBounds(650, 200, 500, 400);
	
		ImageIcon icon = new ImageIcon("icon.png");
		frame.setIconImage(icon.getImage());
		
		header = new JPanel();
		header.setBounds(0, 0, 5000, 100);
		header.setBackground(Color.black);
		header.setLayout(null);
		
		title = new JLabel();
		title.setText("The One Piece is REAL!");
		title.setForeground(Color.white);
		title.setLayout(null);
		title.setFont(new Font("Trebuchet MS",Font.PLAIN,25));
		title.setBounds(525, 35, 500, 30);
		
		JLabel line = new JLabel();
		line.setBackground(Color.white);
		line.setLayout(null);
		line.setBounds(0, 101, 5000, 2);
		
		//body
		body = new JPanel();
		body.setBounds(0, 102, 1300,800);
		body.setBackground(Color.white);
		body.setLayout(null);
		
		//Captian Panel
		captain = new JPanel();
		captain.setLayout(null);
		captain.setBounds(150, 80, 250, 400);
		captain.setBackground(Color.black);
		
		
		//Luffy - Captain Panel
		ImageIcon luffy_poster = new ImageIcon("luffy_poster.png");
		luffy = new JLabel();
		luffy.setIcon(luffy_poster);
		luffy.setLayout(null);
		luffy.setBounds(0,0,250,400);
		
		//buttons
		b1 = new JButton();
		b1.setLayout(null);
		b1.setText("MEAT");
		b1.setBounds(225, 500, 100, 50);
		b1.setFocusable(false);
		b1.setBackground(Color.black);
		b1.setForeground(Color.white);
		b1.addActionListener(this);
		
		//Swordsman Panel
		swordsman = new JPanel();
		swordsman.setLayout(null);
		swordsman.setBounds(505, 80, 250, 400);
		swordsman.setBackground(Color.black);
		
		//Zoro - Swordsman Panel
		ImageIcon zoro_poster = new ImageIcon("zoro_poster.png");
		zoro = new JLabel();
		zoro.setIcon(zoro_poster);
		zoro.setLayout(null);
		zoro.setBounds(0, 0, 250, 400);
		
		//buttons
		b2 = new JButton();
		b2.setLayout(null);
		b2.setText("SAKE");
		b2.setBounds(585, 500, 100, 50);
		b2.setFocusable(false);
		b2.setBackground(Color.black);
		b2.setForeground(Color.white);
		b2.addActionListener(this);
		
		//Cook Panel
		cook = new JPanel();
		cook.setLayout(null);
		cook.setBounds(860, 80, 250, 400);
		cook.setBackground(Color.black);
		
		//Sanji - Cook Panel
		ImageIcon sanji_poster = new ImageIcon("sanji_poster.png");
		sanji = new JLabel();
		sanji.setIcon(sanji_poster);
		sanji.setLayout(null);
		sanji.setBounds(0, 0, 250, 400);
		
		//buttons
		b3 = new JButton();
		b3.setLayout(null);
		b3.setText("WOMEN");
		b3.setBounds(940, 500, 100, 50);
		b3.setFocusable(false);
		b3.setBackground(Color.black);
		b3.setForeground(Color.white);
		b3.addActionListener(this);
		
		header.add(title);
		frame.add(header);
		body.add(captain);
		captain.add(luffy);
		body.add(swordsman);
		swordsman.add(zoro);
		body.add(cook);
		cook.add(sanji);
		frame.add(body);
		
		body.add(b1);
		body.add(b2);
		body.add(b3);
	}
	
	public static void main(String[] args) {	
		Main1 m = new Main1();
		
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == b1) {
			title.setText("Luffy loves Meat!");
			luffy.setIcon(luffy2);
		}
		if(e.getSource() == b2) {
			title.setText("Zoro loves Sake!");
			zoro.setIcon(zoro2);
		}
	    if(e.getSource() == b3) {
	    	title.setText("Sanji never changes!");
	    	sanji.setIcon(sanji2);
		}
	}
	
}