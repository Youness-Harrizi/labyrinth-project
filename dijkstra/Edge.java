package dijkstra;

public class Edge {
	private Vertex  NodeDebut;
	private Vertex NodeFin;
	private int length;
	public Edge(Vertex nodeDebut, Vertex  nodeFin, int length) {// CTRL+SHIFT+S pour génere le constructeur
		super();
		NodeDebut = nodeDebut;
		NodeFin = nodeFin;
		this.length = length;
	}
	public boolean neigbour(Vertex r1, Vertex r2) {
		if(NodeDebut.equals(r1) && NodeFin.equals(r2)) 
			return true;
		if(NodeDebut.equals(r2) && NodeFin.equals(r1)) 
			return true;
		else 
			return false;
		
		
	}
	public int getLength() {
		// la longueur d'un arc
		return length;
	}
	public Vertex getNodeDebut() {
		return NodeDebut;
	}
	public Vertex getNodeFin() {
		return NodeFin;
	}
	
	

}
