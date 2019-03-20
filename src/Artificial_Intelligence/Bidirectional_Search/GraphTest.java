package Artificial_Intelligence.Bidirectional_Search;

public class GraphTest {
    private GraphHelper helper = GraphHelper.getInstance();

    public static void main(String[] args) {
        GraphTest test = new GraphTest();
        test.testIsRoute();
    }

    public void testIsRoute() {
        Graph commonGraph = new Graph<String>("z");
        System.out
                .println("Expected true, result [" + helper.isRoute(graph1(commonGraph), graph2(commonGraph)) + "]\n");

        commonGraph = new Graph<String>("z");
        System.out.println("Expected false, result [" + helper.isRoute(graph1(commonGraph), graph2(null)) + "]\n");
    }

    private Graph graph1(Graph commonGraph) {
        Graph main = new Graph<String>("a");
        Graph graphb = new Graph<String>("b");
        Graph graphc = new Graph<String>("c");
        Graph graphd = new Graph<String>("d");
        Graph graphe = new Graph<String>("e");

        graphb.addAdjacent(graphc);
        graphb.addAdjacent(graphe);
        if (commonGraph != null)
            graphb.addAdjacent(commonGraph);

        graphd.addAdjacent(graphc);
        graphd.addAdjacent(graphe);
        graphd.addAdjacent(main);

        main.addAdjacent(graphb);
        main.addAdjacent(graphd);

        return main;
    }

    private Graph graph2(Graph commonGraph) {
        Graph main = new Graph<String>("f");
        Graph graphg = new Graph<String>("g");
        Graph graphh = new Graph<String>("h");
        Graph graphi = new Graph<String>("i");
        Graph graphj = new Graph<String>("j");

        graphg.addAdjacent(graphh);
        graphg.addAdjacent(graphj);
        if (commonGraph != null)
            graphg.addAdjacent(commonGraph);

        graphi.addAdjacent(graphh);
        graphi.addAdjacent(graphj);
        graphi.addAdjacent(main);

        main.addAdjacent(graphg);
        main.addAdjacent(graphi);

        return main;
    }
}
