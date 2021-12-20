package Zadaca2;

import java.util.ArrayList;
import java.util.List;

public class Glavna2 {

	public static void main(String[] args) {
		
		List<Vraboten2> v = new ArrayList<Vraboten2>();
	
		v.add(new Vraboten2("Stefan", "Stefanovski", "10000"));
		v.add(new Vraboten2("Aleksandar", "Ristevski", "15000"));
		XML1 xml = new XML1();
		xml.createXMLFile("xml", v);
	}
}
