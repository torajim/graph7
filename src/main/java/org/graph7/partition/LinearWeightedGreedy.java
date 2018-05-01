package org.graph7.partition;

import java.util.HashSet;
import java.util.Set;

/**
 * @param <V> the target graph's vertex type
 * @param <E> the target graph's edge type
 *
 * @author Woohyuk Jang
 * @since May 2, 2018
 */
public class LinearWeightedGreedy<V, E> implements DeterministicGreedy<V, E>{
    @Override
    public Set<Partition<V, E>> partitionSet() {
        Set<Partition<V, E>> partitionSet = new HashSet<>();
        Partition<V, E> partition = new Partition<>();
        partitionSet.add(partition);
        return partitionSet;
    }

    @Override
    public Double getCutWeights() {
        return null;
    }

    @Override
    public Double getEdgeCutCount() {
        return null;
    }

    @Override
    public Double getInnerWeightsSum() {
        return null;
    }
}