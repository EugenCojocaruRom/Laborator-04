Lab04 - Exercise 5 - Lab04\_ex05\_Graph class

Define a Graph class for oriented graphs, where the arcs don't have associated weight and the nodes start at 1.

Class data (private):

&nbsp;- Boolean type matrix (adjacents)

&nbsp;- number of nodes

Class methods:

 - constructor with 1 parameter (number of nodes in the graph)

 - int Size() - returns the number of nodes in the graph

&nbsp;- void addArc(int v, int w) - add an arc to the graph (between v and w)

 - boolean isArc(int v, int w) - checks if there is an arc between nodes v and w

&nbsp;- void print() - displays the adjacents matrix (1s and 0s)

 - void dfs(int v, boolean\[] visited) - depth-first search from node v

Create a graph by successively adding arcs. Display the adjacents matrix and the order of the nodes when performing DFS frome each node.

