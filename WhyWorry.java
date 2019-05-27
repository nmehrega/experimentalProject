public class WhyWorry {
	public boolean shouldWeWorryInLife(boolean isThereAProblem, boolean canYouDoSomethingAboutIt) {
		if (isThereAProblem) {
			if (canYouDoSomethingAboutIt) {
				resolveProblem();
				return false; 
			} else {
				return false; 
			}
		} else {
			return false; 
		}
	}
}
