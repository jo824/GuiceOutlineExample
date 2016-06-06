public class MainApp {
	private cardShuffleService;

	@Inject
	public void setupCardShuffleService(CardShuffleService cardShuffleService){
		this.cardShuffleService = cardShuffleService;
	}

	public void shuffleDeck(ArrayList<Card> deck){
		 cardShuffleService.shuffleDeck(deck);
	}
}