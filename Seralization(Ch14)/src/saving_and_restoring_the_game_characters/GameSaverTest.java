package saving_and_restoring_the_game_characters;

import java.io.*;

import javax.imageio.stream.FileImageInputStream;

public class GameSaverTest {
	public static void main(String[] args) {
		GameCharacter one = new GameCharacter(50, "Elf", new String[] {"bow", "sword", "dust"});
		GameCharacter two = new GameCharacter(200, "Troll", new String[] {"bare hands", "big ax"});
		GameCharacter three = new GameCharacter(120, "Magician", new String[] {"spells", "invisibility"});
		// imagine code that does things with the characters that might change their state values
		try {
		ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("Game.ser"));
		os.writeObject(one);
		os.writeObject(two);
		os.writeObject(three);
		os.close();
		} catch(IOException ex) {
		ex.printStackTrace();
		}
		one =null ;
		two =null;
		three =null ;
		try {
			ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("Game.ser"));
			GameCharacter ch_one =(GameCharacter) inputStream.readObject();
			GameCharacter ch_two =(GameCharacter) inputStream.readObject();
			GameCharacter ch_three =(GameCharacter) inputStream.readObject();
			System.out.println("One’s type:"  + ch_one.getType());
			System.out.println("One’s type:"  + ch_two.getType());
			System.out.println("One’s type:"  + ch_three.getType());

			
		} 
			// TODO: handle exception
		catch (ClassNotFoundException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
}
}