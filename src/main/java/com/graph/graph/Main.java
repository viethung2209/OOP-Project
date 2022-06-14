package com.graph.graph;

import com.graph.graph.algorithm.Algorithm;
import com.graph.graph.algorithm.BFS;
import com.graph.graph.algorithm.Dijkstra;
import com.graph.graph.context.Context;
import com.graph.graph.graphcore.Graph;

import java.util.Scanner;

public class Main {
    private static Graph graph = new Graph();
    private static Algorithm algorithm;
    private static Context context = new Context();

    public static void main(String[] args) {
        graph.addVertex("B");
        graph.addVertex("A");
        graph.addVertex("A");
        graph.addVertex("D");
        graph.addVertex("C");
        graph.addEdge("C", "D", 4);
        graph.addEdge("C", "D", 3);
        graph.addEdge("A", "B", 1);
        graph.addEdge("B", "D", 3);
        graph.addEdge("A", "C", 2);
        // show graph
        System.out.println(graph.toString());
        // show menu
        Scanner scanner = new Scanner(System.in);
        int choose = 0;
        do {
            System.out.println("----------------------------------------------------");
            System.out.println("Single shortest path algorithm");
            System.out.println("1. Create graph");
            System.out.println("2. Choose algorithm");
            System.out.println("3. Play");
            System.out.println("0. Exit");
            System.out.println("----------------------------------------------------");
            switch (choose = scanner.nextInt()) {
                case 1:
                    graphFunction();
                    break;
                case 2:
                    chooseAlgorithm();
                    break;
                case 3:
                    context.setAlgorithm(algorithm);
                    context.play();
                    break;
                case 0:
                    return; // exit
            }
        } while (choose != 0);
    }

    public static void chooseAlgorithm() {
        Scanner scanner = new Scanner(System.in);
        int choose = 0;
        do {
            System.out.println("----------------------------------------------------");
            System.out.println("Choose algorithm");
            System.out.println("1. BFS");
            System.out.println("2. Dijkstra");
            System.out.println("0. Back");
            System.out.println("----------------------------------------------------");
            switch (choose = scanner.nextInt()) {
                case 1:
                    algorithm = new BFS();
                    algorithm.setGraph(graph);
                    break;
                case 2:
                    algorithm = new Dijkstra();
                    algorithm.setGraph(graph);
                    break;
                case 0:
                    return; // exit
            }
        } while (choose != 0);
    }

    public static void graphFunction() {
        Scanner sc = new Scanner(System.in);
        int choose = 0;
        do {
            System.out.println("-----------------------------------------------------");
            System.out.println("1. Create new Graph");
            System.out.println("2. Add vertex");
            System.out.println("3. Add edge");
            System.out.println("4. Remove vertex");
            System.out.println("5. Remove edge");
            System.out.println("6. Show graph");
            System.out.println("0. Exit");
            System.out.println("-----------------------------------------------------");
            choose = sc.nextInt();
            sc.nextLine();
            switch (choose) {
                case 1:
                    graph = new Graph();
                    System.out.println("Create new Graph successfully");
                    break;
                case 2:
                    addVertexToGraph();
                    break;
                case 3:
                    addEdgeToGraph();
                    break;
                case 4:
                    removeVertexFromGraph();
                    break;
                case 5:
                    removeEdgeFromGraph();
                    break;
                case 6:
                    System.out.println(graph.toString());
                case 0:
                    System.out.println("Exit");
                    break;
            }
        } while (choose != 0);
    }

    public static void addVertexToGraph() {
        Scanner sc = new Scanner(System.in);
        int choose = 0;
        do {
            System.out.println("Do you want to add vertex to graph? (1. Yes, 0. No)");
            choose = sc.nextInt();
            sc.nextLine();
            switch (choose) {
                case 1:
                    System.out.println("Enter vertex name: ");
                    String vertexName = sc.nextLine();
                    graph.addVertex(vertexName);
                    break;
                case 0:
                    System.out.println("Exit");
                    break;
            }
        } while (choose != 0);
    }

    public static void addEdgeToGraph() {
        Scanner sc = new Scanner(System.in);
        int choose = 0;
        do {
            System.out.println("Do you want to add edge to graph? (1. Yes, 0. No)");
            choose = sc.nextInt();
            sc.nextLine();
            switch (choose) {
                case 1:
                    System.out.println("Enter vertex name: ");
                    String vertexName = sc.nextLine();
                    System.out.println("Enter vertex name: ");
                    String vertexName2 = sc.nextLine();
                    System.out.println("Enter weight: ");
                    int weight = sc.nextInt();
                    sc.nextLine();
                    graph.addEdge(vertexName, vertexName2, weight);
                    break;
                case 0:
                    System.out.println("Exit");
                    break;
            }
        } while (choose != 0);
    }

    public static void removeVertexFromGraph() {
        Scanner sc = new Scanner(System.in);
        int choose = 0;
        do {
            System.out.println("Do you want to remove vertex from graph? (1. Yes, 0. No)");
            choose = sc.nextInt();
            sc.nextLine();
            switch (choose) {
                case 1:
                    System.out.println("Enter vertex name: ");
                    String vertexName = sc.nextLine();
                    graph.removeVertex(vertexName);
                    break;
                case 0:
                    System.out.println("Exit");
                    break;
            }
        } while (choose != 0);
    }

    public static void removeEdgeFromGraph() {
        Scanner sc = new Scanner(System.in);
        int choose = 0;
        do {
            System.out.println("Do you want to remove edge from graph? (1. Yes, 0. No)");
            choose = sc.nextInt();
            sc.nextLine();
            switch (choose) {
                case 1:
                    System.out.println("Enter vertex name: ");
                    String vertexName = sc.nextLine();
                    System.out.println("Enter vertex name: ");
                    String vertexName2 = sc.nextLine();
                    graph.removeEdge(vertexName, vertexName2);
                    break;
                case 0:
                    System.out.println("Exit");
                    break;
            }
        } while (choose != 0);
    }
}
