package ClueBoard;
import javax.swing.*;
import java.awt.*;

import java.util.ArrayList;
import ClueBoard.Card;

public class CheckBoxPanel extends JPanel {
	
	private ArrayList<JCheckBox> cb_list = new ArrayList<JCheckBox>();

	public CheckBoxPanel(Board board) {
		//Load all cards into the arraylist
		for (Card c: board.getCards()) {
			cb_list.add( new JCheckBox(c.getCardName(), false));
		}
		
		//Create panels
		JPanel peoplePanel = new JPanel();
		peoplePanel.setBorder(BorderFactory.createTitledBorder("People"));
		JPanel roomsPanel = new JPanel();
		roomsPanel.setBorder(BorderFactory.createTitledBorder("Rooms"));
		JPanel weaponsPanel = new JPanel();
		weaponsPanel.setBorder(BorderFactory.createTitledBorder("Weapons"));

		//Add people buttons to the panel
		for (int i = 0; i < board.getCards().size(); i++) {
			if (board.getCards().get(i).getCardtype() == Card.CardType.PERSON)
				peoplePanel.add(cb_list.get(i));
			else if (board.getCards().get(i).getCardtype() == Card.CardType.ROOM)
				roomsPanel.add(cb_list.get(i));
			else if (board.getCards().get(i).getCardtype() == Card.CardType.WEAPON)
				weaponsPanel.add(cb_list.get(i));
		}
		setLayout(new BoxLayout(this, 1));
		add(peoplePanel);
		add(roomsPanel);
		add(weaponsPanel);



	}
}
