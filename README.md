# Page Replacement Algorithm

Memory management is crucial for efficient system operation, with page replacement algorithms playing a key role in optimizing memory usage. Three primary algorithms are commonly used: FIFO (First-In-First-Out), LRU (Least Recently Used), and Optimal.

To understand their behavior across diverse page access patterns and memory configurations, we evaluated these algorithms through a series of comprehensive test cases. Test Cases 1-3 featured different page string sequences but shared the same size of 20 strings and utilized 3 pages frames. Conversely, Test Cases 4-6 employed the same page string sequence input while varying the number of page frames (3, 5, and 7 frames). This allowed us to observe how each algorithm adapted to varying memory constraints despite identical page access patterns.

The evaluation results indicated that the number of page faults (instances where a requested page is not in memory) varied across the algorithms and test cases. FIFO and LRU exhibited improvements with increased page frames (Test Cases 4-6 showing fewer page faults compared to 1-3). In contrast, the Optimal algorithm consistently minimized page faults across all scenarios.

The choice of a page replacement algorithm is influenced by its runtime complexity. FIFO offers constant O(1) time complexity due to its simple queue-based operation. LRU's complexity scales with the number of page frames (O(n)) because it involves list traversals to track recently used pages. Optimal's complexity is variable, reaching O(n^2) in worst-case scenarios when predicting future page requests. This highlights a trade-off: simpler algorithms offer faster execution but may lead to more page faults, while the more complex Optimal algorithm minimizes page faults at the cost of higher computation time.

The evaluation underscores the importance of selecting the appropriate page replacement algorithm based on specific system requirements and constraints. While FIFO and LRU offer faster execution and improve with more memory frames, Optimal prioritizes minimizing page faults even with higher complexity. By understanding these strengths and limitations, system designers can make informed decisions to optimize memory usage and enhance overall system efficiency.


## Page Replacement Algorithm Result:

**FIFO Replacement Algorithm**

Test Case: FIFO Test Case 1 Page Fault: 15

Test Case: FIFO Test Case 2 Page Fault: 15 

Test Case: FIFO Test Case 3 Page Fault: 16 

Test Case: FIFO Test Case 4 [rss:15, npf:3] Page Fault: 13 

Test Case: FIFO Test Case 5 [rss:15, npf:5] Page Fault: 13 

Test Case: FIFO Test Case 6 [rss:15, npf:7] Page Fault: 9 



**LRU Replacement Algorithm**

Test Case: LRU Test Case 1 Page Fault: 12 

Test Case: LRU Test Case 2 Page Fault: 15 

Test Case: LRU Test Case 3 Page Fault: 16 

Test Case: LRU Test Case 4 [rss:15, npf:3] Page Fault: 13 

Test Case: LRU Test Case 5 [rss:15, npf:5] Page Fault: 13 

Test Case: LRU Test Case 6 [rss:15, npf:7] Page Fault: 10 



**Optimal Replacement Algorithm**

Test Case: OPT Test Case 1 Page Fault: 9 

Test Case: OPT Test Case 2 Page Fault: 13 

Test Case: OPT Test Case 3 Page Fault: 13 

Test Case: OPT Test Case 4 [rss:15, npf:3] Page Fault: 11 

Test Case: OPT Test Case 5 [rss:15, npf:5] Page Fault: 9 

Test Case: OPT Test Case 6 [rss:15, npf:7] Page Fault: 8 


![Chart](PageRepAlgoResultGraph.png)
