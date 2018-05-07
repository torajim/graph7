package org.graph7.partition;

import org.jgrapht.Graph;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

/**
 * Linear Weighted Greedy
 *
 * @param <V> the target graph's vertex type
 * @param <E> the target graph's edge type
 *
 * @author Woohyuk Jang
 * @since May 2, 2018
 */

@Service
@DeterministicGreedyQualifier(DeterministicGreedyAlgorithms.LinearWeightedGreedy)
public class LinearWeightedGreedy<V, E> implements DeterministicGreedy<V, E>{
    private Graph<V, E> graph;
    private Set<Partition<V, E>> partitionSet = new HashSet<>();

    public LinearWeightedGreedy() {
    }

    @Override
    public void buildPartitionsWithGraph(Graph<V, E> graph, int numOfPartitions) {
        this.graph = graph;
        doPartitioning(numOfPartitions);
    }

    private void doPartitioning(int numOfPartitions){
        int numOfVertex = graph.vertexSet().size();
        int c = (int)Math.ceil((float)numOfVertex / (float)numOfPartitions);
        System.out.println(c);
    }

    @Override
    public Set<Partition<V, E>> partitionSet() {
        return null;
    }

    @Override
    public Double getCutEdgesWeightsSum() {
        return null;
    }

    @Override
    public Double getCutEdgesCount() {
        return null;
    }

    @Override
    public Double getInnerOnlyEdgesWeightsSum() {
        return null;
    }

    @Override
    public Double getInnerOnlyEdgesCount() {
        return null;
    }
}