package mentesDigitales.DFDAssistant;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SimulacionIncendioTorre {

	public static void main(String[] args) {
		
		Node menos3A = new Node("Pasillo -3", 1);
		Map<Node, Integer> adyacentesMenos3A = new HashMap<>();
		
		Node menos3B = new Node("Banyos chicos -3", 1);
		Map<Node, Integer> adyacentesMenos3B = new HashMap<>();
		
		Node menos3C = new Node("Banyos chicas -3", 1);
		Map<Node, Integer> adyacentesMenos3C = new HashMap<>();
		
		Node menos3D = new Node("Espacios Sociales Aprendizaje", 2);
		Map<Node, Integer> adyacentesMenos3D = new HashMap<>();
		
		Node S1 = new Node("Salida Emergencia -3", 1);
		Map<Node, Integer> adyacentesS1 = new HashMap<>();
		
		
		Node menos2A = new Node("Pasillo -2", 1);
		Map<Node, Integer> adyacentesMenos2A = new HashMap<>();
		
		Node menos2B = new Node("Aula 8", 1);
		Map<Node, Integer> adyacentesMenos2B = new HashMap<>();
		
		Node menos2C = new Node("Aula divisible (Lado pequeño)", 1);
		Map<Node, Integer> adyacentesMenos2C = new HashMap<>();
		
		Node menos2D = new Node("Banyos chicos -2", 1);
		Map<Node, Integer> adyacentesMenos2D = new HashMap<>();
		
		Node menos2E = new Node("Banyos chicas -3", 1);
		Map<Node, Integer> adyacentesMenos2E = new HashMap<>();
		
		Node menos2F = new Node("Aula divisible (Lado grande)", 1);
		Map<Node, Integer> adyacentesMenos2F = new HashMap<>();
		
		Node menos2G = new Node("Aula 9", 1);
		Map<Node, Integer> adyacentesMenos2G = new HashMap<>();
		
		
		Node menos1A = new Node("Pasillo -1", 1);
		Map<Node, Integer> adyacentesMenos1A = new HashMap<>();
		
		Node menos1B = new Node("Aula 1", 1);
		Map<Node, Integer> adyacentesMenos1B = new HashMap<>();
		
		Node menos1C = new Node("Sala Profesores", 1);
		Map<Node, Integer> adyacentesMenos1C = new HashMap<>();
		
		Node menos1D = new Node("Aula 2", 1);
		Map<Node, Integer> adyacentesMenos1D = new HashMap<>();
		
		Node menos1E = new Node("Banyos chicos -1", 1);
		Map<Node, Integer> adyacentesMenos1E = new HashMap<>();
		
		Node menos1F = new Node("Banyos chicas -2", 1);
		Map<Node, Integer> adyacentesMenos1F = new HashMap<>();
		
		Node menos1G = new Node("Aula 3", 1);
		Map<Node, Integer> adyacentesMenos1G = new HashMap<>();
		
		Node menos1H = new Node("Aula 6", 1);
		Map<Node, Integer> adyacentesMenos1H = new HashMap<>();
		
		Node menos1I = new Node("Aula 5", 1);
		Map<Node, Integer> adyacentesMenos1I = new HashMap<>();
		
		Node menos1J = new Node("Aula 4", 1);
		Map<Node, Integer> adyacentesMenos1J = new HashMap<>();
		
		
		Node _0A = new Node("Pasillo 0", 50);
		Map<Node, Integer> adyacentesMenos0A = new HashMap<>();
		
		Node _0B = new Node("Banyos chicos 0", 50);
		Map<Node, Integer> adyacentesMenos0B = new HashMap<>();
		
		Node _0C = new Node("Vestibulo", Integer.MAX_VALUE);
		Map<Node, Integer> adyacentesMenos0C = new HashMap<>();
		
		Node _0D = new Node("Banyos chicas A", 50);
		Map<Node, Integer> adyacentesMenos0D = new HashMap<>();
		
		Node _0E = new Node("Entrepasillos", 50);
		Map<Node, Integer> adyacentesMenos0E = new HashMap<>();
		
		Node _0F = new Node("Aula 7", 50);
		Map<Node, Integer> adyacentesMenos0F = new HashMap<>();
		
		Node _0G = new Node("Sala de conferencias", 50);
		Map<Node, Integer> adyacentesMenos0G = new HashMap<>();
		
		Node S2 = new Node("Salida 0", 50);
		Map<Node, Integer> adyacentesMenos0H = new HashMap<>();
		
		Node _1A = new Node("Planta 1", 2);
		Map<Node, Integer> adyacentes1A = new HashMap<>();
		
		adyacentesMenos3A.put(menos3B, 1);
		adyacentesMenos3A.put(menos3C, 1);
		adyacentesMenos3A.put(menos3D, 1);
		adyacentesMenos3A.put(S1, 1);
		adyacentesMenos3A.put(menos2A, 2);
		
		adyacentesMenos3B.put(menos3A, 1);
		
		adyacentesMenos3C.put(menos3A, 1);
		
		adyacentesMenos3D.put(menos3A, 1);
		
		adyacentesS1.put(menos3A, 1);
		
		adyacentesMenos2A.put(menos3A, 2);
		adyacentesMenos2A.put(menos2B, 1);
		adyacentesMenos2A.put(menos2C, 1);
		adyacentesMenos2A.put(menos2D, 1);
		adyacentesMenos2A.put(menos2E, 1);
		adyacentesMenos2A.put(menos2F, 1);
		adyacentesMenos2A.put(menos2G, 1);
		adyacentesMenos2A.put(menos1A, 2);
		
		adyacentesMenos2B.put(menos2A, 1);
		
		adyacentesMenos2C.put(menos2A, 1);
		
		adyacentesMenos2D.put(menos2A, 1);
	
		adyacentesMenos2E.put(menos2A, 1);
		
		adyacentesMenos2F.put(menos2A, 1);
		
		adyacentesMenos2G.put(menos2A, 1);
		
		adyacentesMenos1A.put(menos2A, 2);
		adyacentesMenos1A.put(menos1B, 1);
		adyacentesMenos1A.put(menos1C, 1);
		adyacentesMenos1A.put(menos1D, 1);
		adyacentesMenos1A.put(menos1E, 1);
		adyacentesMenos1A.put(menos1F, 1);
		adyacentesMenos1A.put(menos1G, 1);
		adyacentesMenos1A.put(menos1H, 1);
		adyacentesMenos1A.put(menos1I, 1);
		adyacentesMenos1A.put(menos1J, 1);
		
		adyacentesMenos1A.put(_0A, 2);
		
		adyacentesMenos1B.put(menos1A, 1);
		
		adyacentesMenos1C.put(menos1A, 1);
		
		adyacentesMenos1D.put(menos1A, 1);
		
		adyacentesMenos1E.put(menos1A, 1);
		
		adyacentesMenos1F.put(menos1A, 1);
		
		adyacentesMenos1G.put(menos1A, 1);
		
		adyacentesMenos1H.put(menos1A, 1);
		
		adyacentesMenos1I.put(menos1A, 1);
		
		adyacentesMenos1J.put(menos1A, 1);
		
		adyacentesMenos0A.put(menos1A, 2);
		adyacentesMenos0A.put(_1A, 2);
		adyacentesMenos0A.put(_0B, 1);
		adyacentesMenos0A.put(_0C, 1);
		adyacentesMenos0A.put(_0D, 1);
		adyacentesMenos0A.put(_0E, 1);
		
		adyacentesMenos0B.put(_0A, 1);
		
		adyacentesMenos0C.put(_0B, 1);
		adyacentesMenos0C.put(_0G, 1);
		
		adyacentesMenos0D.put(_0A, 1);
		
		adyacentesMenos0E.put(_0A, 1);
		adyacentesMenos0E.put(_0F, 1);
		adyacentesMenos0E.put(_0G, 1);
		
		adyacentesMenos0F.put(_0E, 1);
		
		adyacentesMenos0G.put(_0C, 1);
		adyacentesMenos0G.put(_0E, 1);
		
		adyacentes1A.put(_0A, 2);
		
		menos3A.setAdjacentNodes(adyacentesMenos3A);
		menos3D.setAdjacentNodes(adyacentesMenos3B);
		menos3C.setAdjacentNodes(adyacentesMenos3C);
		menos3D.setAdjacentNodes(adyacentesMenos3D);
		
		menos2A.setAdjacentNodes(adyacentesMenos2A);
		menos2B.setAdjacentNodes(adyacentesMenos2B);
		menos2C.setAdjacentNodes(adyacentesMenos2C);
		menos2D.setAdjacentNodes(adyacentesMenos2D);
		menos2E.setAdjacentNodes(adyacentesMenos2E);
		menos2F.setAdjacentNodes(adyacentesMenos2F);
		menos2G.setAdjacentNodes(adyacentesMenos2G);
		
		menos1A.setAdjacentNodes(adyacentesMenos1A);
		menos1B.setAdjacentNodes(adyacentesMenos1B);
		menos1C.setAdjacentNodes(adyacentesMenos1C);
		menos1D.setAdjacentNodes(adyacentesMenos1D);
		menos1E.setAdjacentNodes(adyacentesMenos1E);
		menos1F.setAdjacentNodes(adyacentesMenos1F);
		menos1G.setAdjacentNodes(adyacentesMenos1G);
		menos1H.setAdjacentNodes(adyacentesMenos1H);
		menos1I.setAdjacentNodes(adyacentesMenos1I);
		menos1J.setAdjacentNodes(adyacentesMenos1J);
		
		_0A.setAdjacentNodes(adyacentesMenos0A);
		_0B.setAdjacentNodes(adyacentesMenos0B);
		_0C.setAdjacentNodes(adyacentesMenos0C);
		_0D.setAdjacentNodes(adyacentesMenos0D);
		_0E.setAdjacentNodes(adyacentesMenos0E);
		_0F.setAdjacentNodes(adyacentesMenos0F);
		_0G.setAdjacentNodes(adyacentesMenos0G);
		
		_1A.setAdjacentNodes(adyacentes1A);
		
		Set<Node> nodes = new HashSet<>();
		nodes.add(_0G);
		nodes.add(_0F);
		nodes.add(_0E);
		nodes.add(_0D);
		nodes.add(_0C);
		nodes.add(_0B);
		nodes.add(_0A);
		
		nodes.add(menos1A);
		nodes.add(menos1B);
		nodes.add(menos1C);
		nodes.add(menos1D);
		nodes.add(menos1E);
		nodes.add(menos1F);
		nodes.add(menos1G);
		nodes.add(menos1H);
		nodes.add(menos1I);
		nodes.add(menos1J);
		
		nodes.add(menos2A);
		nodes.add(menos2B);
		nodes.add(menos2C);
		nodes.add(menos2D);
		nodes.add(menos2E);
		nodes.add(menos2F);
		nodes.add(menos2G);
		
		nodes.add(menos3A);
		nodes.add(menos3B);
		nodes.add(menos3C);
		nodes.add(menos3D);
		
		nodes.add(S1);
		nodes.add(S2);
		
		Graph graph = new Graph(nodes);
		Graph graph2 = new Graph(nodes);
		
		Dijkstra.calculateShortestPathFromSource(graph, menos1B, S1);
		Dijkstra.calculateShortestPathFromSource(graph2, menos1B, S2);
		
		for (Node nBase: graph.getNodes()) {
			System.out.println("|Camino hasta " + nBase.getNodeId() + "|");
			for (Node nPath: nBase.getShortestPath()) {
				System.out.println(nPath.getNodeId());
			}
			System.out.println("Coste: " + nBase.getDistanceFromOrigin());
			System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		}
		
		for (Node nBase: graph2.getNodes()) {
			System.out.println("|Camino hasta " + nBase.getNodeId() + "|");
			for (Node nPath: nBase.getShortestPath()) {
				System.out.println(nPath.getNodeId());
			}
			System.out.println("Coste: " + nBase.getDistanceFromOrigin());
			System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		}
		
	}
		

}
