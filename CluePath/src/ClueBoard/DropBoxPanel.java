package ClueBoard;
import java.awt.*;
import java.util.ArrayList;

import javax.swing.*;

public class DropBoxPanel extends JPanel {

	private JComboBox person, room, weapon;

	public DropBoxPanel(Board board) {

		person = new JComboBox<String>();
		room = new JComboBox<String>();
		weapon = new JComboBox<String>();
		
		//Create panels
		JPanel peoplePanel = new JPanel();
		peoplePanel.setBorder(BorderFactory.createTitledBorder("People Guess"));
		JPanel roomsPanel = new JPanel();
		roomsPanel.setBorder(BorderFactory.createTitledBorder("Rooms Guess"));
		JPanel weaponsPanel = new JPanel();
		weaponsPanel.setBorder(BorderFactory.createTitledBorder("Weapons Guess"));

		//Add people buttons to the panel
		for (int i = 0; i < board.getCards().size(); i++) {
			if (board.getCards().get(i).getCardtype() == Card.CardType.PERSON)
				person.addItem(board.getCards().get(i).getCardName());
			else if (board.getCards().get(i).getCardtype() == Card.CardType.ROOM)
				room.addItem(board.getCards().get(i).getCardName());
			else if (board.getCards().get(i).getCardtype() == Card.CardType.WEAPON)
				weapon.addItem(board.getCards().get(i).getCardName());
		}
		
		setLayout(new BoxLayout(this, 1));
		peoplePanel.add(person);
		roomsPanel.add(room);
		weaponsPanel.add(weapon);
		
		add(peoplePanel);
		add(roomsPanel);
		add(weaponsPanel);
	}
}
