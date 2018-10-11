package dijkstra;

import java.util.ArrayList;

public class Vertex implements VertexInteface {
	private int distanceFromSource=Integer.MAX_VALUE;// initialiser la distance à l'infini
	
	private boolean visited;// if the node is visited
	
	private int nodeIndex;
	
	// les sommets sont distingués par leur index
	// dans le graphe les indices vont de 0 à n-1
	

	
	
	public int getDistanceFromSource() {
		return distanceFromSource;
	}
	public void setDistanceFromSource(int distanceFromSource) {
		this.distanceFromSource = distanceFromSource;
	}
	public boolean isVisited() {
		return visited;
	}
	public void setVisited(boolean visited) {
		this.visited = visited;
	}
	// les getters pour la liste des arêtes 
	

	public int getNodeIndex() {
		return nodeIndex;
	}
	
	public boolean equals(Vertex v) {
		if(v.getNodeIndex()==nodeIndex)
			return true;
		else
			return false;
	}

	
	


}
