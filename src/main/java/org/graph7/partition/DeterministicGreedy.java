package org.graph7.partition;

import org.jgrapht.Graph;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.util.Set;

/**
 * @param <V> the target graph's vertex type
 * @param <E> the target graph's edge type
 *
 * @author Woohyuk Jang
 * @since May 2, 2018
 */

@Validated
public interface DeterministicGreedy<V, E> {
    void buildPartitionsWithGraph(
            @NotNull(message="Graph should not be null") Graph<V, E> graph
            , @Min(value=1, message="Min partition number is 1") int numOfPartitions);

    Set<Partition<V, E>> partitionSet();

    Double getCutEdgesWeightsSum();

    Double getCutEdgesCount();

    Double getInnerOnlyEdgesWeightsSum();

    Double getInnerOnlyEdgesCount();
}