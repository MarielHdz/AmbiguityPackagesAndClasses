package tracker;

import audio.Song;
import shapes.Rectangle;
import video.Movie;

public class Printer {

	public static void main(String[] args) {
		
		Rectangle rec = new Rectangle(3, 6);
		Song song = new Song("song", "author");
		Movie movie = new Movie("Jumamji", 2.30);	
		printShapes(rec);
		
	}
	
	public static void printShapes(Rectangle shape) {
		System.out.println(shape.getHeight());
		System.out.println(shape.getWidth());

	}
}
