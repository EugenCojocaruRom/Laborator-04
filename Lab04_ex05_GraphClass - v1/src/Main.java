public class Main {
    public static void main(String[] args) {

        //Declare a new graph and add some values to it
        Graph myGraph = new Graph(3);
        myGraph.addArc(1, 2);
        myGraph.addArc(2, 3);
        myGraph.addArc(1, 3);

        //Display the adjacency matrix
        System.out.println("Adjacency Matrix:");
        myGraph.print();

        //Display order of nodes at in-depth search from each graph node
        System.out.println("The order of the nodes is:");
        for (int i = 1; i <= myGraph.size(); i++) {
            System.out.println(" - Starting from node " + i + ": ");
            myGraph.dfs(i, new boolean[myGraph.size() + 1]);
        }
    }
}