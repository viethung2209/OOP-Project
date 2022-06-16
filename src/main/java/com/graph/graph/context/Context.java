package com.graph.graph.context;

import com.graph.graph.algorithm.Algorithm;
import com.graph.graph.graphcore.Graph;

public class Context {
    private Algorithm algorithm;


    public void play() {
        algorithm.explore();
    }

    public Algorithm getAlgorithm() {
        return algorithm;
    }

    public void setAlgorithm(Algorithm algorithm) {
        this.algorithm = algorithm;
    }
}
