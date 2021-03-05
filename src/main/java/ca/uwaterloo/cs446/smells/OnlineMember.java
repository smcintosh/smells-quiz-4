package ca.uwaterloo.cs446.smells;

public class OnlineMember {
	// For the quiz, let us presume that membership authorization is not necessary
	public boolean stockCheck(PublicLibrary library, String item) {
		return library.isInStock(item);
	}

	public void borrowItem(PublicLibrary library, String item) {
		if (stockCheck(library, item)) {
			library.loanItem(item);
		}
	}

	public void returnItem(PublicLibrary library, String item) {
		library.addStock(item);
	}
}
