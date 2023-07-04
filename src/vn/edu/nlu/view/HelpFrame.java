package vn.edu.nlu.view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Panel;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SpringLayout;

import vn.edu.nlu.model.ImageFactory;
import vn.edu.nlu.view.panel.PanelHelp;


public class HelpFrame extends JFrame{
	private ImageIcon iconBgHelp;
	private PanelHelp panelHelp;
	static final int WIDTH = 530, HEIGHT = 646;

	public HelpFrame(int width, int height) {
		
		setTitle("Help");
		setSize(new Dimension(width, height));
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// set borderLayout.
		SpringLayout layout = new SpringLayout();

		//-------------- Panel Background Help -----------------
		panelHelp = new PanelHelp();
		setContentPane(new PanelBackground());
		
		
		//----------------- Panel Content Help ----------------------
		panelHelp.getBtBack().addMouseListener(new MouseHandler());
				
				
		layout.putConstraint(SpringLayout.SOUTH, panelHelp, 500, SpringLayout.SOUTH, this);
		layout.putConstraint(SpringLayout.WEST, panelHelp, 200, SpringLayout.WEST, this);
		
		add(panelHelp);
		setLayout(layout);
//		panelHelp.add(panelHelp);
		setVisible(true);
	}
	
	public HelpFrame() {
		this(WIDTH, HEIGHT);
	}
	
	private class PanelBackground extends JPanel {
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(ImageFactory.createImageBackground().getImage(), 0, 0,getWidth(), getHeight(), null);
		}
	}
	
	private class MouseHandler implements MouseListener{

		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			if(e.getSource() == panelHelp.getBtBack()) {
				backMenuView();
			}
		}

		
		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			if(e.getSource() == panelHelp.getBtBack()) {
				ImageIcon iconBack = new ImageIcon("");
				panelHelp.getBtBack().setIcon(iconBack);
				panelHelp.getBtBack().setPreferredSize(new Dimension(120, 45));
			}
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			if(e.getSource() == panelHelp.getBtBack()) {
				ImageIcon iconBack = new ImageIcon("");
				panelHelp.getBtBack().setIcon(iconBack);
				panelHelp.getBtBack().setPreferredSize(new Dimension(105, 30));
				dispose();
			}
		}


		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}


		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
		public void backMenuView() {
			new MenuFrame();
//			this.dispose();
		}
	}
}
