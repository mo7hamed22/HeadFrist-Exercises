///**
//
// * 
// */
//package teat;
//
//
//import java.util.*;
//
//import javax.sound.midi.*;
//
//import org.omg.CORBA.DATA_CONVERSION;
//
//import java.io.* ;
//
//
//
//public class Just_test {
//	
//	int c =0 ;
//	/**
//	 * @param args
//	 * @throws InvalidMidiDataException 
//	 */
//	public static void main(String[] args)  {
//		// TODO Auto-generated method stub
//       // Scanner in = new Scanner(System.in);
//		//Version_2
//		MusicTest1 mini = new MusicTest1();
//		if (args.length < 2) {
//		System.out.println("Don’t forget the instrument and note args");
//		} else {
//		int instrument = Integer.parseInt(args[0]);
//		int note = Integer.parseInt(args[1]);
//		mini.play(instrument, note);
//		
//		//Version _1
////		MusicTest1 mt = new MusicTest1();
////		mt.play();
//	}
//	}
//	
//
//
//	 class MusicTest1 {//Version_1
//		/*public void play() throws InvalidMidiDataException {
//		try {
//			//1=Get a Sequencer and open it
//			Sequencer player = MidiSystem.getSequencer();
//			player.open();
//			// 2=Make a new Sequence
//		
//			Sequence seq = new Sequence(Sequence.PPQ,4);
//			// 3=Get a new Track from the Sequence
//			Track track =seq.createTrack();
//			
//			ShortMessage a = new ShortMessage();
//			a.setMessage(144, 1, 44, 100);
//			MidiEvent noteOn = new MidiEvent(a, 1);
//               track.add(noteOn);
//			
//			ShortMessage b = new ShortMessage();
//			
//			b.setMessage(192, 1, 102, 100);
//
//			MidiEvent noteOff = new MidiEvent(b, 30);
//			track.add(noteOff);
//			//Fill the Track with MidiEvents and
//			// give the Sequence to the Sequencer
//		//	t.add(myMidiEvent1);
//			//player.setSequence(seq);
//			player.setSequence(seq);
//			player.start();
//			
//			
//			System.out.println("Successfully got a sequencer");
//		} catch (MidiUnavailableException ex) {
//			// TODO Auto-generated catch block
//			//e.printStackTrace();
//			System.out.println("Bummer");
//		}
//		
//		System.out.println("We got a sequencer");
//		}*/
//		//Version_2
//		public void play(int instrument, int note) {
//			try {
//			Sequencer player = MidiSystem.getSequencer();
//			player.open();
//			Sequence seq = new Sequence(Sequence.PPQ, 4);
//			Track track = seq.createTrack();
//			MidiEvent event = null;
//			ShortMessage first = new ShortMessage();
//			first.setMessage(192, 1, instrument, 0);
//			MidiEvent changeInstrument = new MidiEvent(first, 1);
//			track.add(changeInstrument);
//			ShortMessage a = new ShortMessage();
//			a.setMessage(144, 1, note, 100);
//			MidiEvent noteOn = new MidiEvent(a, 1);
//			track.add(noteOn);
//			ShortMessage b = new ShortMessage();
//			b.setMessage(128, 1, note, 100);
//			MidiEvent noteOff = new MidiEvent(b, 16);
//			track.add(noteOff);
//			player.setSequence(seq);
//			player.start();
//			} catch (Exception ex) {ex.printStackTrace();}
//			} // close play
//		
//	};
//	
//	
//	//ALL THis Was in Main (old)
//		//format
//	//	String s =String.format("Ihave% d", 800000000);//for decimal num must be int ,short ,long,char
//	//	String s =String.format("Ihave%.1f", 80);//for float,double
//	//	String s =String.format("Ihave %X", 42);//for print as hexadecimal must long short etc
//	//	String s =String.format("Ihave %c", 80);//for char
//	//	String s =String.format("I have %,.1f and %,d", 8037863784.982728 ,222292);//for More than one
//		/*date=========================================== */
//	//	String s =String.format("%tc", new Date());//for Date
//	//	String s =String.format("%tr", new Date());//just Time
//	//	Date today=new Date();
//	//	String s =String.format("%tA,%<tB %<td", today);//ta->day of week ,tB->Month
//	//	System.out.print(s);
////===============Calender ==========================
////		Calendar c =Calendar.getInstance();
////		c.set(2020, 7, 24, 10, 15);//Month is zero based so it's 8
////		long day1 =c.getTimeInMillis(); //convert this to big amount of 01 mileseconed
////		day1+=1000*60*60 ; //add hour's of milis
////		c.setTimeInMillis(day1);
////		System.out.println("new hour " + c.get(c.HOUR_OF_DAY));
////
////		c.add(c.DATE, 35);//Add 35 day to this date
////		System.out.println("add 35 days" + c.getTime());
////		c.roll(c.DATE, 35);//roll 35 day to this date but not change Month
////		System.out.println("roll 35 days" + c.getTime());
////		c.set(c.DATE, 35);//Not ADDing just a set for this date
////		System.out.println("set to 1" + c.getTime());
////		
////		
//		
//
//
//
//
//
//
//		
//		
//		
//		
//		
//	//	DotComBust game = new DotComBust();
//	//	game.setUP() ;
//		//game.startPlaying() ; 
//	
//		
//        //Real Guess Game V!
////        int GuessNum =0 ;
////        GameHelper helper = new GameHelper ();
////        SimpleDotCom theDotCom = new SimpleDotCom();
////        int randomNum = (int)(Math.random() * 4);
////        ArrayList<String>
////        //int []locations= {randomNum ,randomNum+1 ,randomNum+2};
////        theDotCom.setLocationCells(locations);
////        boolean isAliva = true;
////        while (isAliva==true) {
////			String guess =helper.getOserlnput("Enter Number");
////			String result = theDotCom.checkYourself(guess);
////			GuessNum++;
////			if(result.equals("kill"))
////			{
////				isAliva=false;
////				System.out.println("You Took  " +GuessNum + "  guesses   ");
////			}
////			
////		}
//        
//    	//Code for sec largest ele in array
//    	/*	int []x = {1,8,377,4,990};
//    		int []y =new int [x.length];
//    		int max =x[0];
//    		int index =0 ;
//    		for (int i = 0; i < x.length; i++) {
//    			if(x[i]>max)
//    			
//    			{	
//    				if(i==x.length-1)
//    			{
//    				y[i]=max;
//    			}
//    				max = x[i];
//    				index = i ;
//    				
//    				}
//    			else {
//    				
//    				y[i]=x[i];
//    			}
//    			
//    			
//    		}
//    		int max2 = y[0];
//    		for (int i = 0; i < y.length; i++) {
//    			if(y[i]>max2)
//    			
//    				max2 = y[i];
//    		}
//    		
//    		System.out.print(max2);*/
//        /*===========================================*/
//        
//        
//        //code 4 
////        Just_test t1 ,t2 ;
////        t1=new Just_test();
////        t1.c++;
////        t2=new Just_test();
////        t2.c++;
////        System.out.print(t1.c +" "+ t2.c);
//        
//        
//        //Guess Game
////        GuessGame game = new GuessGame();
////        game.startGame();
//        
//        
//        //code 3 
////        Dog dog1 =new Dog();
////        dog1.name="harrry";
////        dog1.size=88;
////        dog1.breed="dog";
////        dog1.bark();
//        //code 2
//  
////        String pet[] = {"Frid" ,"zuze" ,"Bin"};
////        int len =pet.length;
////        int rand1=(int)(Math.random()*len);
////        System.out.print(rand1);
////        
//        
//        
//        //code 1
////        String[] wordListOne = {"24/7" ,"multi-	Tiar",
////        		"30,OOO foot", "B-to-B" , "win-win" , "front-end" ,
////        		"web- based" , "pervasive", "smart", "six-sigma",
////        		" cri tical -path" , "dynamic"} ;
////        	String[] wordListTwo = { "empowered", "sticky",
////        	"value-added.", "oriented", "centric", "distributed",
////        	"clustered", "branded", "outaide-the-box", "positioned",
////        	"networked", " f ocused" , "leveraged", "aligned",
////        	"targeted", "shared" , "cooperative", "accelerated"};
////        	String[] wordListThree = {"process", "tipping-point",
////        			"solution", "architecture", "core competency" ,
////        			"strategy", "mindshare", "portal" , "apace" , "vision",
////        			"adigm", "ssion"};
////        	// find out !low many word. aN In ...d11bt
////        	int oneLenqth = wordListOne . length;
////        	int twoLength = wordListTwo .length;
////        	int threeLength=wordListThree.length;        	
////        	//random 
////        	int r1= (int)(Math.random()*oneLenqth);
////        	int r2= (int)(Math.random()*twoLength);
////        	int r3= (int)(Math.random()*threeLength);
////        	// now build a pllrue
////        	String phrase  = wordListOne[r1] + " " +
////        	wordListTwo[r2] + " " + wordListThree[r3] ;
////        	// print oat the phra..
////        	System.out.println("What we need is a " + phrase);
//
//        	
//        	
//        	
//        	
///*     int n ,k ,t ,d,two_lo=0 ;
////      double frist_loven;
////      
////      n=in.nextInt();
////      t=in.nextInt();
////      k=in.nextInt();
////      d=in.nextInt();
////      frist_loven= Math.ceil( n / (1.0d * k)) * t;
////      two_lo=t+d;
////      if(frist_loven<=two_lo)
////      {
////    	  System.out.print("No");
////      }
////      else     	  System.out.print("Yes");
////
////
////      
//*/     
//        
//        
// 
//    
//    
//    
//
//         
//class DotComBust
//{
//	private GameHelper helper =new GameHelper() ;;
//	private	 ArrayList<DotCom> dotComsList= new ArrayList<DotCom>();;
//	private int numOfGuesses =0 ;
//	private void setUpGame () {
//		//first make some dot corns and give them locations
//		DotCom one = new DotCom();
//		one.setName("Pets.com");
//		DotCom two = new DotCom();
//		two.setName("eToys.com");
//		DotCom three = new DotCom();
//		three.setName("Go2.com");
//		dotComsList.add (one);
//		dotComsList.add(two);
//		dotComsList.add(three);
//		System.out.println("Your goal is to sink three dot corns . ");
//		System.out.println("Pets.com , eToys.com , Go2.com ");
//		System.out.println(" Try to sink them all in the fewest number of guesses ");
//		for ( DotCom dotComToSet : dotComsList) {
//		ArrayList<String> newLocation = helper.placeDotCom(3); 
//		dotComToSet.setLocationCells( newLocation);}
//	//	I I I c lose for loop
//		
//	}
//	private void startPlayinq () {
//			while(!dotComsList.isEmpty()) {
//			String userGuess = helper.getUserInput("Enter a guess");
//			checkUserGuess(userGuess);
//	}
//	finishGame();
//	}
//	
//	private void checkUserGuess (String userGuess)
//	{
//	numOfGuesses++;
//	String result =" miss" ;
//	
//	for (DotCom dotComToTest : dotComsList) {
//	result = dotComToTest.checkYourself(userGuess); 
//	if (result.equals("hit"))
//	{
//	break; 
//	}
//	 if(result.equals("kill")) {
//	dotComsList.remove(dotComToTest);
//	break;
//	}
//	
//	}//close for
//	System. out.println(result); 
//}// close method
//private void finishGame () {
//     System.out.println("All Dot Corns are dead! Your stock i s now worth less.");
//  if(numOfGuesses <= 18) {
//         System.out.println(" It only took you" + numOfGuesses + " guesses.") ;
//         System.out.println(" You got out before you r op ti o n s sank.");
//  }
//else {
//       System.out.println("Took you long enough. " + numOfGuesses + " guesse s .");
//       System.out.println("Fish are dancing with your o p tio n s . " ) ;
//}
//// close method
//  }
//}
//
//
//
// class GameHelper {
//	 private static final String alphabet= "abcdefg";
//	 private int gridLength = 7;
//	private int gridSize = 49;
//	 private int [] grid = new int[gridSize];
//	private int comCount = 0;
//	
//public String getUserInput(String prompt)
//{
//String inputLine= null;
//System.out.println(prompt +"");
//try {
//	BufferedReader is=new BufferedReader( new InputStreamReader(System.in));
//	inputLine = is.readLine();
//	if (inputLine.length () == 0)
//	return null;
//	} catch (IOException e) {
//	System.out.println("IOException: " + e);
//	}
//	return inputLine.toLowerCase();}
//	public ArrayList<String> placeDotCom(int comSize){
//		ArrayList<String> alphaCells = new ArrayList<String>();
//		String [] a1phacoords = new String [comSize];
//		String temp = null;
//		int []coords = new int[comSize];
//		int attempts = 0;
//		boolean success = false;
//		// flag = found a good location?
//		int location = 0;
//		// current starting location
//		comCount++;
//		int incr = 1;
//		if((comCount % 2) == 1) {
//				incr = gridLength;}
//				while ( !success & attempts++ < 200 ) {
//						location = (int) (Math.random() * gridSize);
//						//System.out.println( " try" + location);
//						int x =0;
//						success = true;
//						while (success && x < comSize) {
//						if (grid[location] == 0) {
//							coords[x++] = location;
//							location += incr;
//							if (location >= gridSize){	
//								success = false;
//							}
//							if (x > 0 && (location % gridLength==0))
//							{	success = false;	}
//						}else {
//							// System.out.print ( " used" + location);
//							success = false;
//			}
//	}
//		
//	
//}
//				int x = 0;
//				int row = 0;
//				int column = 0;
//				// System.out.println ( "\ n " ) ;
//				while (x < comSize) {
//				grid[coords[x]] = 1;
//				row = (int) (coords[x] /gridLength);
//				column = coords[x] % gridLength;
//				temp = String.valueOf(alphabet.charAt(column));
//				alphaCells.add(temp.concat(Integer.toString(row)));
//				x++;
//				//System.out.println( "coord " + x  + " = " + alphaCells.get(x - l) ) ;
//				}
//				// System.out.println(" \ n " ) ;
//	     
//				return alphaCells;
//	}
//	
//				
//				
//				
// };
// //================================
// class DotCom{	
//	 private ArrayList<String> locationCells ;
//	 private String name;
////int[] locationCells ;
//int numOfHits = 0 ;
//public void setLocationCells(ArrayList<String>locs) {
//locationCells = locs;
// }
//public void setName (String n)
//{name=n ; }
//
//public String checkYourself(String userGuess)
//{
//	String result = "miss ";
//
// int guess = locationCells.indexOf(userGuess);
// if (guess >= 0)
// {
//	 locationCells.remove(guess);
//	 if (locationCells.isEmpty())
//{		result = "kill";
//System.out.println("ouch  ! You sunk  " + name + ":(");
//}
//	 else {result ="hit";}
//	
//}
////for (int cell : locationCells)
////			if (guess ==cell) {
////			result = "hit";
////			numOfHits++;
////			break;
////			//What should we see
////			}
////if (numOfHits ==locationCells.length)
////	{result ="kill";}
////	
////	System.out.println(result);
//	
//return result;
//
//}
// };
////============================================================================
//  class GuessGame{
//	  Player p1 ,p2 ,p3 ;
//	
//	  void startGame() {
//	  p1=new Player();
//	  p2=new Player();
//	  p3=new Player();
//	  
//	  int guessp1 = 0;
//	  int guessp2 = 0;
//	  int guessp3 = 0;
//	  
//	  boolean p1isRight = false;
//	  boolean p2isRight = false;
//	  boolean p3isRight = false;
//	 int  targetNumber = (int)(Math.random()*10) ;
//	 System.out.println("I’m thinking of a number between 0 and 9...");
//	 while(true) {
//		 System.out.println("Number to guess is " + targetNumber);
//		 p1.palyerGuess();
//		 p2.palyerGuess();
//		 p3.palyerGuess();
//		 guessp1 = p1.num;
//		 System.out.println("Player one guessed " + guessp1);
//		 guessp2 = p2.num;
//		 System.out.println("Player two guessed "+ guessp2);
//		 guessp3 = p3.num;
//		 System.out.println("Player three guessed " + guessp3);
//		 
//		 if (guessp1 == targetNumber) {
//			 p1isRight = true;
//			 }
//			 if (guessp2 == targetNumber) {
//			 p2isRight = true;
//			 }
//			 if (guessp3 == targetNumber) {
//			 p3isRight = true;
//			 }
//			 if (p1isRight || p2isRight || p3isRight) {
//				 System.out.println("We have a winner!");
//				 System.out.println("Player one got it right? " + p1isRight);
//				 System.out.println("Player two got it right? " + p2isRight);
//				 System.out.println("Player three got it right? " + p3isRight);
//				 System.out.println("Game is over.");
//				 break; // game over, so break out of the loop
//				 } else {
//				 // we must keep going because nobody got it right!
//				 System.out.println("Players will have to try again.");
//				 } // end if/else
//				 } // end loop
//				 } // end method
//  };//end class
//		 
//	  
//  class Player{
//	  int num =0 ;
//		
//		
//	public  void palyerGuess()
//	  {
//		   num = (int)(Math.random() * 10) ;
//		  System.out.println("The Player Guess = " + num );
//	  }
//	
//	 
// };
//  
//
//	  
//  
//
//
//
//
//
//
//
//class Dog {
//
//int size;
//String breed;
//String name;
//
//void bark() {
//System.out.println("Ruff! Ruff!");
//
//}
//}
//}
