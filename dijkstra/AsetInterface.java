package dijkstra;

public interface AsetInterface {
	//contient les sommets non encores attribu�s
	// l'algorithme de Djikstra se fait sur n-1 etapes ou n est le degre
	public boolean appartient(Vertex s);
	//tester si s n'est plus dispo
	public void add(Vertex s);
	// ajouter un sommet � A
	

}
