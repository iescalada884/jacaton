package mentesDigitales.DFDAssistant;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.Set;

public class Dijkstra {
	
	public static Graph calculateShortestPathFromSource(
			Graph graph, Node source, Node goal) {
		
	    source.setDistanceFromOrigin(0);

	    Set<Node> examinedNodes = new HashSet<>();
	    PriorityQueue<Node> unexploredNodes = new PriorityQueue<Node>();

	    unexploredNodes.add(source);

	    while (unexploredNodes.size() != 0 && unexploredNodes.peek() != goal) {
	        Node currentNode = unexploredNodes.poll();
	        for (Entry < Node, Integer> adjacencyPair: 
	          currentNode.getAdjacentNodes().entrySet()) {
	            Node adjacentNode = adjacencyPair.getKey();
	            Integer costToAdjacentNote = adjacencyPair.getValue();
	            Integer adjacentNodeCost = adjacentNode.getNodeCost();
	            if (!examinedNodes.contains(adjacentNode)) {
	                calculateMinimumDistance
	                	(adjacentNode, costToAdjacentNote,
	                	 currentNode, adjacentNodeCost);
	                unexploredNodes.add(adjacentNode);
	            }
	        }
	        examinedNodes.add(currentNode);
	    }
	    return graph;
	}
	
	private static void calculateMinimumDistance(Node adjacentNode,
		Integer costToAdjacentNote, Node currentNode, Integer adjacentNodeCost) {
		Integer sourceDistance = currentNode.getDistanceFromOrigin();
		Integer nodeDistance =
				sourceDistance + costToAdjacentNote + adjacentNodeCost;
		if (nodeDistance < adjacentNode.getDistanceFromOrigin()) {
			adjacentNode.setDistanceFromOrigin(nodeDistance);
			LinkedList<Node> shortestPath = new LinkedList<>(currentNode.getShortestPath());
			shortestPath.add(currentNode);
			adjacentNode.setShortestPath(shortestPath);
			}
		}
	
	
}
