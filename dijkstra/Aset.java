package dijkstra;
import java.util.ArrayList;

// la liste des vertexs marqu�s

public class Aset implements AsetInterface {
	ArrayList<Vertex> A;

	@Override
	public boolean appartient(Vertex s) {
		return A.contains(s);
		
		
	}

	



	@Override
	public void add(Vertex s) {
		A.add(s);
		
		
	}

}
