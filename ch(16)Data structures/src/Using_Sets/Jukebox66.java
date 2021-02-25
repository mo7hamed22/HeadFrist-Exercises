package Using_Sets;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;


/* ====
 *================= Updating the Jukebox to use a Sets =========================
TO Remove Duplicate  
 ===========================================================================* */

public class Jukebox66 {
	ArrayList<Song2> songList =new ArrayList<Song2>();
	public static void main(String[] args) {
		new Jukebox66().go();
	}
		public void go() {
			getSongs();
			System.out.println("Befor Sorting => " + songList);
			//Adding Collections.sort() to the Jukebox code Look at The Comment at the end ... 
			//Call Static  Collections sort() Method Then Print
			Collections.sort(songList);
			System.out.println("After Sorting  =>" +songList);
			
			//Here we create a new HashSet
			//parameterized to hold Songs.
			HashSet<Song2> songSet =new HashSet<Song2>();
			songSet.addAll(songList);
			System.out.println("After Sorting => " +songSet);
			/*
			 * HashSet has a simple addAll() method
             that can another collection and use it 
				to populate the HashSet. It’s the same as if
				we added each song one at a time (except much simpler).		
				*After putting it
					into a HashSet,
					and printing the
					HashSet (we didn’t
					call sort() again).
				*/
			


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
				reader.close();

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
			Song2 nextSong=new Song2(str[0],str[1],str[2],str[3]) ;
			songList.add(nextSong);
		}
			
		
}
