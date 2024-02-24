package controller;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Serializer {
	public static void serializar(String path, Object obj) {
		try {
			FileOutputStream file = new FileOutputStream(path);
			ObjectOutputStream o = new ObjectOutputStream(file);
			o.writeObject(obj);
			o.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static Object desserializar(String path) {
		Object retorno = null;
		
		try {
			FileInputStream file = new FileInputStream(path);
			ObjectInputStream o = new ObjectInputStream(file);
			retorno = o.readObject();
			o.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		return retorno;
	}
}
