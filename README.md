# Project Description

> Java Program uses [Kruskal’s algorithm](https://en.wikipedia.org/wiki/Kruskal%27s_algorithm) that finds a [minimum spanning tree](https://en.wikipedia.org/wiki/Minimum_spanning_tree) (MST) of an undirected weighted graph.

# Project Features

  - Uses the [unionFind strategy](https://en.wikipedia.org/wiki/Disjoint-set_data_structure) in its most efficient form.
  - Uses the [greedy strategy](https://en.wikipedia.org/wiki/Greedy_algorithm)
  - reads undirected weighted graph from input file via the command line. Input files consist of the following: 
    - zero or more lines of comments begining with 'c '
    - followed by an integer that represents the number of nodes in the graph 
    - then followed by one edge per line. A triplet of integers represents each edge, where the third integer is the weight of the edge         between the first two integers. i.e. an edge 1  2  3   means that the weight of the edge between 1 and 2 is 3.
  - Outputs results to file. Output file consists of the edges making the minnimum spanning tree along with the total weight of the MST.
