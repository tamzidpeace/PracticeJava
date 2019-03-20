package Artificial_Intelligence.Bidirectional_Search;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class GraphHelper {
    // implements singleton pattern
    private static GraphHelper instance;

    private GraphHelper() {
    }

    /**
     * @return the instance
     */
    public static GraphHelper getInstance() {
        if (instance == null)
            instance = new GraphHelper();
        return instance;
    }

    public boolean isRoute(Graph gr1, Graph gr2) {
        Queue<Graph> queue1 = new LinkedList<>();
        Queue<Graph> queue2 = new LinkedList<>();

        addToQueue(queue1, gr1, "1");
        addToQueue(queue2, gr2, "2");

        while (!queue1.isEmpty() || !queue2.isEmpty()) {
            if (!queue1.isEmpty()) {
                Graph gAux1 = queue1.remove();
                Iterator<Graph> it1 = gAux1.getAdjacents().iterator();

                while (it1.hasNext()) {
                    Graph adj1 = it1.next();
                    System.out.println("adj1 " + adj1);
                    if (adj1.hasVisitor("2"))
                        return true;
                    else if (!adj1.hasVisitor("1"))
                        addToQueue(queue1, adj1, "1");
                }
            }

            if (!queue2.isEmpty()) {
                Graph gAux2 = queue2.remove();
                Iterator<Graph> it2 = gAux2.getAdjacents().iterator();
                while (it2.hasNext()) {
                    Graph adj2 = it2.next();
                    System.out.println("adj2 " + adj2);
                    if (adj2.hasVisitor("1"))
                        return true;
                    else if (!adj2.hasVisitor("2"))
                        addToQueue(queue2, adj2, "2");
                }
            }
        }

        return false;
    }

    private void addToQueue(Queue<Graph> queue, Graph gr, String visitor) {
        gr.setVisitor(visitor);
        queue.add(gr);
    }
}