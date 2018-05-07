package org.graph7.partition;

import org.jgrapht.Graph;
import org.jgrapht.graph.DefaultDirectedWeightedGraph;
import org.jgrapht.graph.DefaultWeightedEdge;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Set;

@RunWith(SpringRunner.class)
public class LinearWeightedGreedyTest {

    @Autowired
    @DeterministicGreedyQualifier(DeterministicGreedyAlgorithms.LinearWeightedGreedy)
    private DeterministicGreedy<String, DefaultWeightedEdge> linearWeightedGreedy;

    @Test
    public void partitionSet() {
        Graph<String, DefaultWeightedEdge> testGraph = new DefaultDirectedWeightedGraph<>(DefaultWeightedEdge.class);
        String v1 = "v1";
        String v2 = "v2";
        String v3 = "v3";
        String v4 = "v4";

        testGraph.addVertex(v1);
        testGraph.addVertex(v2);
        testGraph.addVertex(v3);
        testGraph.addVertex(v4);

        DefaultWeightedEdge e1 = testGraph.addEdge(v1, v2);
        testGraph.setEdgeWeight(e1, 10);
        DefaultWeightedEdge e2 = testGraph.addEdge(v1, v3);
        testGraph.setEdgeWeight(e2, 2.5);
        DefaultWeightedEdge e3 = testGraph.addEdge(v3, v4);
        testGraph.setEdgeWeight(e3, -1);

        linearWeightedGreedy.buildPartitionsWithGraph(testGraph, 3);
        Set<Partition<String, DefaultWeightedEdge>> partitionSet = linearWeightedGreedy.partitionSet();
        //partitionSet.forEach((v) -> System.out.println(v.getVertexSet()));
    }

    @SpringBootApplication
    static class TestConfiguration {
    }

    @Test
    public void buildPartitionsWithGraph() {
    }

    @Test
    public void getCutEdgesWeightsSum() {
    }

    @Test
    public void getCutEdgesCount() {
    }

    @Test
    public void getInnerOnlyEdgesWeightsSum() {
    }

    @Test
    public void getInnerOnlyEdgesCount() {
    }
}