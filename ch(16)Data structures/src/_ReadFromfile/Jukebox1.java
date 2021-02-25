package _ReadFromfile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import javax.swing.text.html.HTMLEditorKit.Parser;

public class Jukebox1 {
	ArrayList<String> songList =new ArrayList<String>();
	public static void main(String[] args) {
		new Jukebox1().go();
	}
		public void go() {
			getSongs();
			System.out.println("Befor Sorting => " + songList);
			//Adding Collections.sort() to the Jukebox code Look at The Comment at the end ... 
			//Call Static  Collections sort() Method Then Print 
			Collections.sort(songList);
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
			songList.add(str[0]);
		}
			
		
}

/* Array List Haven't Method for Sort 
 * but since ArrayList implements the List
 * interface,ArrayList IS-A List Thanks to polymorphism ,
 *  you can pass an ArrayList to a method declared to take List.
 *  >>>>>there IS a sort() method in the Collections class It takes a List
 * */
 