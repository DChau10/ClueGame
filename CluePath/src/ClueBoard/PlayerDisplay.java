package ClueBoard;

import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;

public class PlayerDisplay extends JPanel {
	private Player human_player;
	private JTextField mypeople;
	private JTextField myrooms;
	private JTextField myweapons;
	
	public PlayerDisplay(Player human_player) {
		this.human_player = human_player;
		setLayout(new GridLayout(6,1));
		TitledBorder title = BorderFactory.createTitledBorder( BorderFactory.createEtchedBorder(0), "My Cards");
		title.setTitleJustification(2);
		setBorder(title);
		
		createDisplay("People", Card.CardType.PERSON);
		createDisplay("Rooms", Card.CardType.ROOM);
		createDisplay("Weapons", Card.CardType.WEAPON);
		
	}

	
	private void createDisplay(String title, Card.CardType type) {
		JPanel panel = new JPanel();
		panel.setLayout( new GridLayout(0,1));
		panel.setBorder( new TitledBorder(new EtchedBorder(), title));
		for (Card card: this.human_player.getMyCards()) {
			if (card.getCardtype() == type) {
				JTextField item = new JTextField(card.getCardName());
				panel.add(item);
			}
		}
		add(panel);
		
	}
}


