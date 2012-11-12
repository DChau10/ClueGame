package ClueBoard;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class GameFrame extends JFrame{
	private DetectivePanel panel;
	public GameFrame(Board board) {
		//Create DetectivePanel
		panel = new DetectivePanel(board);
		//Create the Menu Bar
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		menuBar.add(createFileMenu());

		//Set title and layout for main window
		setSize(new Dimension(720, 780));
		setTitle("Clue");
		setLayout(new BorderLayout());
		setVisible(true);
		//Add the board to the window
		BoardPanel bPanel = new BoardPanel(board);
		add(bPanel, BorderLayout.CENTER);
		//Deal cards
		board.deal();
		//Add the Player's cards to the window
		PlayerDisplay ppanel = new PlayerDisplay(board.getPlayer(0));
		add(ppanel, BorderLayout.EAST);
		//Add the game control panel to window
		GameControlPanel gcpanel = new GameControlPanel();
		add(gcpanel, BorderLayout.SOUTH);
		

	}

	private JMenu createFileMenu() {
		JMenu menu = new JMenu("File"); 
		menu.add(createNotesItem());
		menu.add(createFileExitItem());
		return menu;
	}
	
	private JMenuItem createNotesItem() {
		JMenuItem notes = new JMenuItem("Show Notes");
		class MenuItemListener implements ActionListener {
			public void actionPerformed(ActionEvent e)
			{
				panel.setVisible(true);
			}
		}
		notes.addActionListener(new MenuItemListener());
		return notes;
	}
	
	private JMenuItem createFileExitItem() {
		  JMenuItem item = new JMenuItem("Exit Program");
		  class MenuItemListener implements ActionListener {
		    public void actionPerformed(ActionEvent e)
		    {
		       System.exit(0);
		    }
		  }
		  item.addActionListener(new MenuItemListener());
		  return item;
		}


}
