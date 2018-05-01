package org.graph7.partition;

import org.jgrapht.Graph;
import org.jgrapht.graph.DefaultDirectedWeightedGraph;
import org.jgrapht.graph.DefaultWeightedEdge;
import org.junit.Test;

import java.util.Set;

public class LinearWeightedGreedyTest {

    @Test
    public void partitionSet() {
        Graph<String, DefaultWeightedEdge> testGraph = new DefaultDirectedWeightedGraph<>(DefaultWeightedEdge.class);
        String v1 = "v1";
        String v2 = "v2";

        testGraph.addVertex(v1);
        testGraph.addVertex(v2);
        DefaultWeightedEdge e1 = testGraph.addEdge(v1, v2);
        testGraph.setEdgeWeight(e1, 10);

        DeterministicGreedy<String, DefaultWeightedEdge> lwg = new LinearWeightedGreedy<>();
        Set<Partition<String, DefaultWeightedEdge>> partitionSet = lwg.partitionSet();
        partitionSet.forEach((v) -> System.out.println(v.getVertexSet()));

    }

    @Test
    public void getCutWeights() {
    }

    @Test
    public void getEdgeCutCount() {
    }

    @Test
    public void getInnerWeightsSum() {
    }
}