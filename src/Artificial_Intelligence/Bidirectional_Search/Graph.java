package Artificial_Intelligence.Bidirectional_Search;

import java.util.HashSet;
import java.util.Set;

public class Graph<T> {
    private T value;
    private Set<Graph> adjacents = new HashSet<>();
    private Set<String> visitors = new HashSet<>();

    public Graph(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void addAdjacent(Graph adjacent) {
        this.adjacents.add(adjacent);
    }

    public Set<Graph> getAdjacents() {
        return this.adjacents;
    }

    public void setVisitor(String visitor) {
        this.visitors.add(visitor);
    }

    public boolean hasVisitor(String visitor) {
        return this.visitors.contains(visitor);
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("Value [").append(value).append("] visitors[");
        if (!visitors.isEmpty()) {
            for (String visitor : visitors) {
                sb.append(visitor).append(",");
            }
        }
        sb.append("]");
        return sb.toString().replace(",]", "]");
    }
}
