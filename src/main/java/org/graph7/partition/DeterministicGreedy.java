package org.graph7.partition;

import java.util.Set;

/**
 * @param <V> the target graph's vertex type
 * @param <E> the target graph's edge type
 *
 * @author Woohyuk Jang
 * @since May 2, 2018
 */
@SuppressWarnings("WeakerAccess")
public interface DeterministicGreedy<V, E>{
    Set<Partition<V, E>> partitionSet();
    Double getCutWeights();
    Double getEdgeCutCount();
    Double getInnerWeightsSum();
}