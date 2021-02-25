package read_file_using_fileObjectandBuffer;

import java.io.*;

public class ReadAFile {
	public static void main(String[] args) {
		File  file =new File("Write_string_here.txt");
		try {
			FileReader fileReader=new FileReader(file);
			BufferedReader reader=new BufferedReader(fileReader);
			String line =" ";
			while ((line=reader.readLine())!=null) {
				System.out.println(line);
				
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
