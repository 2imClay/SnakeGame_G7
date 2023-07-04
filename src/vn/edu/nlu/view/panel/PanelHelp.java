package vn.edu.nlu.view.panel;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

import vn.edu.nlu.model.ImageFactory;

public class PanelHelp extends JPanel{
	private ImageIcon iconBgHelp;
	private final int WIDTH = 102, HEIGHT = 300;

	private JButton btBack;
	public PanelHelp() {
		this.setLayout(new BorderLayout());
		this.setPreferredSize(new Dimension(WIDTH, HEIGHT));
		//panel
		iconBgHelp = new ImageIcon("helpbg");
		
		btBack = new JButton(ImageFactory.createImageButton("back"));
		btBack.setBorderPainted(false);
		btBack.setContentAreaFilled(false);
		btBack.setFocusable(false);
		btBack.setPreferredSize(new Dimension(105,30));
		
		//add components to jPanel
		this.setOpaque(false);
		
		this.add(btBack, BorderLayout.SOUTH);
	}
	
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g);
//		g.drawImage(ImageFactory.createImageBackground().getImage(), 0, 0,getWidth(), getHeight(), null);
	}
	
	public JButton getBtBack() {
		return btBack;
	}
}
