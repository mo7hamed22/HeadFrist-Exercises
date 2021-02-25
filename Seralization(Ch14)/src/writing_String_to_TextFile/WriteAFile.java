package writing_String_to_TextFile;
	import java.io.*;
public class WriteAFile {
	public static void main(String[] args) {
		
	try {
		FileWriter Writer = new FileWriter("Write_string_here.txt");
		Writer.write("My Name Is Mohamed");
		Writer.close();
		
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	}
}
