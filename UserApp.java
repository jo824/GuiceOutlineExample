public class UserApp {
	
	public static void main(String[]args){
		Injector injector;
		ArrayList<Card> shuffledDeck = new ArrayList<Card>();

		switch(args[0]){
			case "split":
				injector = new Guice.createInjector(new InjectorSplit()); 
			case "random":
				injector = new Guice.createInjector(new RandomShuffle());

		}

		MainApp myApp = injector.getInstance(MainApp.class);

		myApp.shuffleDeck(shuffledDeck);
	}
}