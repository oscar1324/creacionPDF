/**
 * 
 */
package com.oscar.Datos;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

/**
 * @author 201905
 *
 */
public class Datos {

	
	
	public List<Persona> recuperarPersonas() {
		ArrayList<Persona> ListaPersona = new ArrayList<>();
		
		Persona p1 = new Persona("Oscar","Salamanca");
		Persona p2 = new Persona("Alba","Almendros");
		Persona p3 = new Persona("Enrique","Almendros");
		Persona p4 = new Persona("Diego", "Pajaron");
		
		ListaPersona.add(p1);
		ListaPersona.add(p2);
		ListaPersona.add(p3);
		ListaPersona.add(p4);
		
		return ListaPersona;
	}
}
