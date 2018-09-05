package com.bsbr.altec.wtr.seriazable;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SuperNotSerializeble {
	public static void main(String[] args) {
		Dog d = new Dog(35, "Fido");
		System.out.println("before: " + d.name + " "
				+ d.weight);
		try {
			FileOutputStream fs = new FileOutputStream("testSer.ser");
			ObjectOutputStream os = new ObjectOutputStream(fs);
			os.writeObject(d);
			os.close();
		} catch (Exception e) { e.printStackTrace(); }
		try {
			FileInputStream fis = new FileInputStream("testSer.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			d = (Dog) ois.readObject();
			ois.close();
		} catch (Exception e) { e.printStackTrace(); }
		System.out.println("after: " + d.name + " "
				+ d.weight);
	}
}

	
