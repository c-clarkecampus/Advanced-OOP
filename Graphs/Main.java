public class Main {

    public static void main(String[] args) {

        Graph graph = new Graph(5);

        graph.addNode(new Node('A'));
        graph.addNode(new Node('B'));
        graph.addNode(new Node('C'));
        graph.addNode(new Node('D'));
        graph.addNode(new Node('E'));

        graph.addEdge(0,1);  // A -> B
        graph.addEdge(0,2); // A -> C
        graph.addEdge(1,0);  // B -> A
        graph.addEdge(1,3);  // B -> D
        graph.addEdge(2,1);  // C -> B
        graph.addEdge(2,3); // C -> D
        graph.addEdge(3,2);
        graph.addEdge(3,4); // D -> E


        graph.print();

    }
}
