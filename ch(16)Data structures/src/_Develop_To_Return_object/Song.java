package _Develop_To_Return_object;
/*
 * Finally we know what’s wrong...The Song class needs to implement Comparable
 * */
public class Song implements Comparable<Song>{
	String title ,artist ,rating ,bpm ;
	Song(String t ,String a ,String r , String b )
	{
		title=t ;
		artist=a ;
		rating = r ; 
		bpm = b ;
		
	}
	public String getArtist() {
		return artist;
	}
	public String getTitle() {
		return title;
	}
	public String getBpm() {
		return bpm;
	} 
	public String getRating() {
		return rating;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
	//	return super.toString();
		return  getArtist();
	}
	/*
	 * The sort() method sends a Song to  compareTo() Song that to see
	 *  how that song Compare to 
 		which the method was invoked.*/
	/*
	 * Simple! We just pass the work
     on to the title String objects,
     since we know Strings have a
      compareTo() method.*/
	@Override
	public int compareTo(Song s) {
		// TODO Auto-generated method stub
		return title.compareTo(s.title);
	}
}
