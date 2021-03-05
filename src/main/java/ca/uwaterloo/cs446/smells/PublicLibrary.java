package ca.uwaterloo.cs446.smells;

import java.util.ArrayList;
import java.util.List;

public class PublicLibrary {
	private String address;
	private List<String> inventory;
	private int availableParkingSpots;

	public PublicLibrary(String address, int parkingLotCapacity) {
		this.address = address;
		this.inventory = new ArrayList<String>();
		this.availableParkingSpots = parkingLotCapacity;
	}

	public void addStock(String item) {
		inventory.add(item);
	}

	public void loanItem(String item) {
		if (!inventory.remove(item)) {
			throw new IllegalArgumentException("No stock of " +
					item + " to be removed");
		}
	}

	public boolean isInStock(String item) {
		return inventory.contains(item);
	}

	public String getAddress() {
		return address;
	}

	public void setAvailableParkinSpots(int newCount) {
		this.availableParkingSpots = newCount;
	}

	public int getAvailableParkingSpots() {
		return availableParkingSpots;
	}
}
