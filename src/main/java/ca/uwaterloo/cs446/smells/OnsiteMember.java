package ca.uwaterloo.cs446.smells;

import java.util.List;

public class OnsiteMember {
	
	// Stub for now
	public List<String> getDirections(PublicLibrary library) {
		// TODO: Business logic to get directions from an online map service
		return null;
	}

	public int checkParkingAvailability(PublicLibrary library) {
		return library.getAvailableParkingSpots();
	}
}
