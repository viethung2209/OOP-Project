module com.graph.graph {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.graph.graph to javafx.fxml;
    exports com.graph.graph;
    exports com.graph.graph.graphcore;
    opens com.graph.graph.graphcore to javafx.fxml;
    exports com.graph.graph.test;
    opens com.graph.graph.test to javafx.fxml;
}