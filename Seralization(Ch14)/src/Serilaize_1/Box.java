package Serilaize_1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Box implements Serializable
{
	/**
	 * 
	 */
	//private static final long serialVersionUID = 1L;
	private int width , hight ; 
	public void setHight(int hight) {
		this.hight = hight;
	}
public void setWidth(int width) {
	this.width = width;
}
public static void main(String[] args) {
	Box box =new Box();
	box.setHight(90);
	box.setWidth(30);
	//This Serialization 
		try {
			FileOutputStream fs = new FileOutputStream("foo.ser");
			ObjectOutputStream os = new ObjectOutputStream(fs);
		    os.writeObject(box);
		    os.close();

	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		//======= This is De_serialization
		try {
			FileInputStream inputStream =new FileInputStream("foo.ser");
			ObjectInputStream oss= new ObjectInputStream(inputStream);
			Object boxx =oss.readObject();
			//Object hight =oss.readObject();
			Box dbox= (Box) boxx ;
			System.out.print(""+ dbox.hight +" "+dbox.width);
			oss.close();
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//here file must be exists
 catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
		


}
}
