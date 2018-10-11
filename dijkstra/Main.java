package dijkstra;

public class Main {

	public static void main(Graph g, Vertex r) {
		Aset A=new Aset();
		A.add(r);
		Vertex pivot=r;
		Pere previous=new Pere();
		int n=g.getNbreNodes();
		previous.initialisePere(n,r);
		r.setDistanceFromSource(0);
		
		for(int j=0;j<n-1;j++) {
	
		for(Vertex y:g.getNodes()) {
			if(!(A.appartient(y)) && g.succesor(pivot, y)  ){
				
				if(pivot.getDistanceFromSource()+ g.arete(pivot, y)  < y.getDistanceFromSource()) {
					y.setDistanceFromSource(pivot.getDistanceFromSource()+ g.arete(pivot, y));
					previous.getPere().set(y.getNodeIndex(), pivot);
					
				}
				
				
			}
			
		}
		// chercher le sommet minimum
		pivot=g.minimum();
		A.add(pivot);
		
		}
		
		
		
	
	}

}
