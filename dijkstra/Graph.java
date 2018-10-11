package dijkstra;
import java.util.ArrayList;

public class Graph {
	private Vertex[] nodes;// liste des sommets
	private Edge[] edges;// liste des arêtes 
	private int nbreEdges;
	private int nbreNodes;
	public Vertex[] getNodes() {
		return nodes;
	}
	public Edge[] getEdges() {
		return edges;
	}
	public int getNbreEdges() {
		return nbreEdges;
	}
	public int getNbreNodes() {
		return nbreNodes;
	}
	// constructeur
	public Graph(Edge[]edges, Vertex[] nodes) {
		this.edges=edges;
		this.nodes=nodes;
		nbreEdges=edges.length;
		nbreNodes=nodes.length;
		
		
		
	}
	
	
	public boolean succesor(Vertex r,Vertex r2) {
		Edge[] L=this.getEdges();
		for(Edge c:L) {
			if(c.neigbour(r, r2))// si r et r2 sont adjacents
				return true;
		}

			return false;
		
	}
	public int arete(Vertex r1,Vertex r2) {
		// donne la longueur d'une arête en connaissant les 2 sommets qui le composent
		for(Edge edge:edges) {
			if(edge.getNodeDebut()==r1 && edge.getNodeFin()==r2) {
				return edge.getLength();
			}
			if(edge.getNodeDebut()==r2 && edge.getNodeFin()==r1) {
				return edge.getLength();
		}
			
		
	}
		return 0;
	
	}
	public Vertex minimum() {
		// return le vertex de distance minimale
		Vertex min=nodes[0];
		for(Vertex vert:nodes) {
			if(vert.getDistanceFromSource()<min.getDistanceFromSource())
				min=vert;
		}
		return min;
				
			
		
	}
	
	
	
}