public class Graph {
    //Matrix of type boolean for adjacents
    private boolean[][] adj;
    //Variable of type int for number of nodes
    private int n;

    //Constructor with 1 parameter of type int (the number of nodes)
    public Graph(int nodes) {
        //Boolean with size nodes + 1 to be able to go as far as the max number of nodes (given that the nodes start at 1)
        this.adj = new boolean[nodes + 1][nodes + 1];
        //Number of nodes in the graph
        this.n = nodes;
    }

    //Method for the number of nodes in the graph
    public int size() {
        //Return the number of nodes
        return n;
    }

    //Method for adding arcs to the graph, where v is the beginning and w is the tip of the arc
    public void addArc(int v, int w) {
        //Check that both nodes are in the interval 1 to n
        if (v >= 1 && v <= n && w >= 1 && w <= n) {
            //Return 'true' if adjacency exists
            adj[v][w] = true;
        }
    }

    //Method for checking that an arc exists between nodes v and w
    public boolean isArc(int v, int w) {
        //Return the matrix coordinates (where values 0 and 1 are stored)
        return adj[v][w];
    }

    //Method for displaying the adjacents matrix (1's and 0's)
    public void print() {
        //Loop through each line from i = 1 to n (inclusive), incrementing i by 1
        for (int i = 1; i <= n; i++) {
            //Loop through each column from j = 1 to n (inclusive), incrementing j by 1
            for (int j = 1; j <= n; j++) {
                //Display the value found at each of the coordinates
                System.out.print((adj[i][j] ? 1 : 0) + " ");
            }
            //Print a new line character after each line of the matrix
            System.out.println();
        }
    }

    //Method for in-depth search starting from node v
    public void dfs(int v, boolean[] visited) {
        //Set the current node as seen
        visited[v] = true;
        //Loop through the number of nodes from w = 1 to n, incrementing w by 1
        for (int w = 1; w <= n; w++) {
            //Check if there is an arc between nodes v and w AND that it wasn't already visited
            if (isArc(v, w) && !visited[w]) {
                //Display the 2 nodes and their edge
                System.out.println(v + "-" + w);
                //Call the dfs method when the condition above is met
                dfs(w, visited);
            }
        }
    }
}
