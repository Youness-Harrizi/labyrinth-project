package dijkstra;

import java.util.ArrayList;

public class Pere implements PereInterface {
	ArrayList<Vertex> Pere;

	@Override
	public boolean estfils(Vertex S) {
		// TODO Auto-generated method stub
		return false;
	}
	public void initialisePere(int n, Vertex r) {
		// pour initialiser le tableau pere par la valeur 
		for (int i = 0; i < n; i++) {
			Pere.add(r);
			
		}
		
	}
	public ArrayList<Vertex> getPere() {
		return Pere;
	}
	


}