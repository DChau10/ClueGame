package ClueBoard;
import javax.swing.*;

import java.awt.*;


public class DetectivePanel extends JFrame{
	
	public DetectivePanel(Board board) {


		setSize(new Dimension(520, 800));
		setTitle("Detective Panel");
		setLayout(new BorderLayout());
		
		
		//ADD CHECKBOX PANEL
		CheckBoxPanel cPanel = new CheckBoxPanel(board);
		DropBoxPanel dPanel = new DropBoxPanel(board);
		add(cPanel, BorderLayout.WEST);
		add(dPanel, BorderLayout.EAST);
		
		
	}
}
