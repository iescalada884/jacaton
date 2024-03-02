package mentesDigitales.DFDAssistant;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Node implements Comparable<Node> {
	
    private final String nodeId;
    
    private Integer nodeCost;
    
    Map<Node, Integer> adjacentNodes = new HashMap<>();
    
    private Integer distanceFromOrigin = Integer.MAX_VALUE;
    
    private List<Node> shortestPath = new LinkedList<>();
    
    public Node(String nodeId, Integer nodeCost) {
    	this.nodeId = nodeId;
    	this.nodeCost = nodeCost;
    }

	public Integer getNodeCost() {
		return nodeCost;
	}

	public void setNodeCost(Integer nodeCost) {
		this.nodeCost = nodeCost;
	}

	public Integer getDistanceFromOrigin() {
		return distanceFromOrigin;
	}

	public void setDistanceFromOrigin(Integer distanceFromOrigin) {
		this.distanceFromOrigin = distanceFromOrigin;
	}

	public Map<Node, Integer> getAdjacentNodes() {
		return adjacentNodes;
	}

	public void setAdjacentNodes(Map<Node, Integer> adjacentNodes) {
		this.adjacentNodes = adjacentNodes;
	}

	public List<Node> getShortestPath() {
		return shortestPath;
	}

	public void setShortestPath(List<Node> shortestPath) {
		this.shortestPath = shortestPath;
	}

	public String getNodeId() {
		return nodeId;
	}
	
	@Override
	public int compareTo(Node node) {
		return Integer.compare(this.distanceFromOrigin, node.distanceFromOrigin);
	}
	

}
