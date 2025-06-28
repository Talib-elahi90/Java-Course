import java.util.ArrayList;
import java.util.List;

public class DepthFirstSearch {
    public static void main(String[] args) {
        Node root = new Node("A");
        root.addChild("B").addChild("C");
        root.child.get(0).addChild("D").addChild("E");
        root.child.get(1).addChild("F");

        List<String> result = new ArrayList<>();
        root.depthFirstSearch(result);

        System.out.println("DFS Result: " + result);
    }
}

class Node {
    String name;
    List<Node> child;

    public Node(String name) {
        this.name = name;
        this.child = new ArrayList<>();
    }

    public Node addChild(String name) {
        Node child = new Node(name);
        this.child.add(child);
        return this; // allows chaining
    }

    public List<String> depthFirstSearch(List<String> array) {
        array.add(this.name);
        for (Node child : child) {
            child.depthFirstSearch(array);
        }
        return array;
    }
}