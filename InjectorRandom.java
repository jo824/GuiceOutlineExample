public class InjectorRandom {
	
	protected void configure(){
		bind(CardShuffleService.class).to(RandomShuffle.class);
	}

}