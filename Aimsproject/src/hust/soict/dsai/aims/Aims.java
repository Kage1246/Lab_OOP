package hust.soict.dsai.aims;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.media.Book;
import hust.soict.dsai.aims.media.CompactDisc;
import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.media.Track;
import hust.soict.dsai.aims.screen.CartScreen;
import hust.soict.dsai.aims.screen.StoreScreen;
import hust.soict.dsai.aims.store.Store;

public class Aims {

	public static String input() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the title");
		String inputString = input.nextLine();
		return inputString;
	}
	
	public static void showMenu() {
		System.out.println("AIMS: ");
		System.out.println("--------------------------------");
		System.out.println("1. View store");
		System.out.println("2. Update store");
		System.out.println("3. See current cart");
		System.out.println("0. Exit");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 0-1-2-3");
	}

	public static void storeMenu() {
		System.out.println("Options: ");
		System.out.println("--------------------------------");
		System.out.println("1. See a media’s details");
		System.out.println("2. Add a media to cart");
		System.out.println("3. Play a media");
		System.out.println("4. See current cart");
		System.out.println("0. Back");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 0-1-2-3-4");
		}
	
	public static void mediaDetailsMenu() {
		System.out.println("Options: ");
		System.out.println("--------------------------------");
		System.out.println("1. Add to cart");
		System.out.println("2. Play");
		System.out.println("0. Back");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 0-1-2");
	}
	
	public static void mediaDetailsMenuForBooks() {
		System.out.println("Options: ");
		System.out.println("--------------------------------");
		System.out.println("1. Add to cart");
		System.out.println("0. Back");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 0-1");
	}
	
	public static void cartMenu() {
		System.out.println("Options: ");
		System.out.println("--------------------------------");
		System.out.println("1. Filter medias in cart");
		System.out.println("2. Sort medias in cart");
		System.out.println("3. Remove media from cart");
		System.out.println("4. Play a media");
		System.out.println("5. Place order");
		System.out.println("0. Back");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 0-1-2-3-4-5");
	}
	
	public static void main(String[] args) {
		Store testStore = new Store();
		Cart testCart = new Cart();
		List<String> authorList = new ArrayList<>();
		authorList.add("fadasfasg");
		Book book1 = new Book("fdhdfh", "dfhfdh", 13f, authorList);
		Book book2 = new Book("dfhfdh", "dfgfdgfd", 12f, authorList);
		CompactDisc cd1 = new CompactDisc("fdh", "Chdfhsd", "Dir", 5, 16.5f, "gdsgfsd");
		CompactDisc cd2 = new CompactDisc("fdhdfjdf", "dfhdf", "Dir", 6, 6.5f, "sdgsdfs");
		Track track1 = new Track("A", 3);
		Track track2 = new Track("B", 4);
		Track track3 = new Track("C", 3);
		cd1.addTrack(track1);
		cd1.addTrack(track2);
		cd2.addTrack(track3);
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Aladin", "Animation", "Roger Allers", 100, 18.99f);
		testStore.addMedia(dvd1);
		testStore.addMedia(dvd2);
		testStore.addMedia(cd1);
		testStore.addMedia(cd2);
		testStore.addMedia(book1);
		testStore.addMedia(book2);
		StoreScreen testScreen = new StoreScreen(testStore, testCart);
	}
}
