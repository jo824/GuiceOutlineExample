public class InjectorSplit extends AbstractModucle {

	protected void configure(){
		bind(CardShuffleServie.class).to(SplitShuffle.class);
	}
}