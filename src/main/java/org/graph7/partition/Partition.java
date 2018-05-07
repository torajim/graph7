package org.graph7.partition;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Set;

/**
 * @param <V> the target graph's vertex type
 * @param <E> the target graph's edge type
 *
 * @author Woohyuk Jang
 * @since May 2, 2018
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@SuppressWarnings("WeakerAccess")
public class Partition<V, E> {
    private Set<V> vertexSet;
    private Set<E> innerOnlyEdges;
    private Double innerOnlyEdgesWeightsSum;
    private Set<E> cutEdges;
    private Double cutEdgesWeightsSum;
}