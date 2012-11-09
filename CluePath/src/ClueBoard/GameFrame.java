package ClueBoard;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class GameFrame extends JFrame{
	private DetectivePanel panel;
	public GameFrame(Board board) {
		panel = new DetectivePanel(board);
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		menuBar.add(createFileMenu());


		setSize(new Dimension(700, 800));
		setTitle("Clue");
		setLayout(new BorderLayout());
		setVisible(true);
		BoardPanel bPanel = new BoardPanel(board);
		add(bPanel, BorderLayout.CENTER);

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
