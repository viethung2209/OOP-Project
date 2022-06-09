package com.graph.graph.context;

import com.graph.graph.algorithm.Algorithm;
import com.graph.graph.graphcore.Graph;

public class Context {
    private Graph graph;
    private Algorithm algorithm;
    public void setGraph(Graph graph) {
        this.graph = graph;
    }
    public void setAlgorithm(Algorithm algorithm) {
        this.algorithm = algorithm;
    }

    public void play() {
        algorithm.explore(graph);
    }
}
