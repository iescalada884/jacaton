package mentesDigitales.DFDAssistant;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MainTest {

	public static void main(String[] args) {
		
		
		Node nodeE = new Node("E", 3);		
		Node nodeD = new Node("D", 1);
		Node nodeC = new Node("C", 10);
		Node nodeB = new Node("B", 6);
		Node nodeA = new Node("A", 0);
		
		Map<Node, Integer> adjacentsE = new HashMap<>();
		adjacentsE.put(nodeD, 1);
		adjacentsE.put(nodeC, 10);
		
		Map<Node, Integer> adjacentsD = new HashMap<>();
		adjacentsD.put(nodeE, 1);
		adjacentsD.put(nodeC, 1);
		adjacentsD.put(nodeB, 3);
		
		Map<Node, Integer> adjacentsC = new HashMap<>();
		adjacentsC.put(nodeE, 10);
		adjacentsC.put(nodeD, 1);
		adjacentsC.put(nodeA, 4);
		
		Map<Node, Integer> adjacentsB = new HashMap<>();
		adjacentsB.put(nodeD, 3);
		adjacentsB.put(nodeA, 3);
		
		Map<Node, Integer> adjacentsA = new HashMap<>();
		adjacentsA.put(nodeC, 4);
		adjacentsA.put(nodeB, 3);
		
		nodeE.setAdjacentNodes(adjacentsE);
		nodeD.setAdjacentNodes(adjacentsD);
		nodeC.setAdjacentNodes(adjacentsC);
		nodeB.setAdjacentNodes(adjacentsB);
		nodeA.setAdjacentNodes(adjacentsA);
		
		Set<Node> nodes = new HashSet<>();
		nodes.add(nodeE);
		nodes.add(nodeD);
		nodes.add(nodeC);
		nodes.add(nodeB);
		nodes.add(nodeA);
		
		Graph graph = new Graph(nodes);
		
		Graph result = Dijkstra.calculateShortestPathFromSource(graph, nodeA);
		
		for (Node nBase: result.getNodes()) {
			System.out.println("|Camino hasta " + nBase.getNodeId() + "|");
			for (Node nPath: nBase.getShortestPath()) {
				System.out.println(nPath.getNodeId());
			}
			System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		}

	}

}
