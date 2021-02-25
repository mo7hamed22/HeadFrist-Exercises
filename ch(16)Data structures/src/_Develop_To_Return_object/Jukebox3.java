package _Develop_To_Return_object;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


/* ====
 *================= Updating the Jukebox to use a Comparator =========================
We did three new things in this code:
1) Created an inner class that implements Comparator (and thus the compare()
method that does the work previously done by compareTo()).
2) Made an instance of the Comparator inner class.
3) Called the overloaded sort() method, giving it both the song list and the
instance of the Comparator inner class.
Note: we also updated the Song class toString() method to print both the song
title and the artist. (It prints title: artist regardless of how the list is sorted.)
 ===========================================================================* */

public class Jukebox3 {
	ArrayList<Song> songList =new ArrayList<Song>();
	public static void main(String[] args) {
		new Jukebox3().go();
	}
		public void go() {
			getSongs();
			System.out.println("Befor Sorting => " + songList);
			//Adding Collections.sort() to the Jukebox code Look at The Comment at the end ... 
			//Call Static  Collections sort() Method Then Print
			ArtistCompare artistCompare = new ArtistCompare();
			Collections.sort(songList,artistCompare);
			System.out.println("After Sorting =>" +songList);


	}
		void getSongs(){
			File file =new File("SongList.txt");
			try {
				BufferedReader reader =new BufferedReader(new FileReader(file));
				String line = null ;
				while((line=reader.readLine())!=null)
				{
					 addSong(line);
				}
				
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		void addSong(String line)
		{
			String [] str = line.split("/");
			Song nextSong=new Song(str[0],str[1],str[2],str[3]) ;
			songList.add(nextSong);
		}
			
		class ArtistCompare implements Comparator<Song> {
			public int compare(Song one, Song two ) {
			return one.getArtist().compareTo(two.getArtist());
			}
		}
		
}
