package mentesDigitales.DFDAssistant;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.Set;

public class Dijkstra {
	
	public static Graph calculateShortestPathFromSource(Graph graph, Node source) {
	    source.setDistanceFromOrigin(0);

	    Set<Node> examinedNodes = new HashSet<>();
	    PriorityQueue<Node> unexploredNodes = new PriorityQueue<Node>();

	    unexploredNodes.add(source);

	    while (unexploredNodes.size() != 0) {
	        Node currentNode = unexploredNodes.poll();
	        for (Entry < Node, Integer> adjacencyPair: 
	          currentNode.getAdjacentNodes().entrySet()) {
	            Node adjacentNode = adjacencyPair.getKey();
	            Integer edgeWeight = adjacencyPair.getValue();
	            Integer currentNodeCost = adjacentNode.getNodeCost();
	            if (!examinedNodes.contains(adjacentNode)) {
	                calculateMinimumDistance(adjacentNode, edgeWeight, currentNode, currentNodeCost);
	                unexploredNodes.add(adjacentNode);
	            }
	        }
	        examinedNodes.add(currentNode);
	    }
	    return graph;
	}
	
	private static void calculateMinimumDistance(Node adjacentNode,
		Integer edgeWeigh, Node currentNode, Integer currentNodeCost) {
		Integer sourceDistance = currentNode.getDistanceFromOrigin();
		Integer nodeDistance = sourceDistance + edgeWeigh + currentNodeCost;
		if (nodeDistance < adjacentNode.getDistanceFromOrigin()) {
			adjacentNode.setDistanceFromOrigin(nodeDistance);
			LinkedList<Node> shortestPath = new LinkedList<>(currentNode.getShortestPath());
			shortestPath.add(currentNode);
			adjacentNode.setShortestPath(shortestPath);
			}
		}
	
	
}
