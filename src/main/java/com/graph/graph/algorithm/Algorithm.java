package com.graph.graph.algorithm;

import com.graph.graph.graphcore.Graph;

public abstract class Algorithm {
    private Graph graph;
    public abstract void explore();

    public Graph getGraph() {
        return graph;
    }

    public void setGraph(Graph graph) {
        this.graph = graph;
    }
}
