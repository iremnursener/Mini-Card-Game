package SE116PROJECT;

public class Game {

	public static void main(String[] args) {
		Deck gameDeck = new Deck();
		//gameDeck.printDeck(); // CONTROL
		gameDeck.shuffleDeck();

		//gameDeck.printDeck();// CONTROL
		for(Card card:gameDeck.getCards()) {
			System.out.println(card.getCardName()+" value: "+card.getValue());
		}
	}

}
