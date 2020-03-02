#        James L. Romero 
        Student ID: 2334232 
    CPSC390_Artificial_Intelligence
        Robot Navigation
          Dr. Linstead
        
      Program Description : Inside of a 2d array, there are a seleted set of paths one may take in order 
                            to reach the goal position. The user starts from an initital position and is 
                            tasked to find an optimal path. The path is based on utilizing the A* Search 
                            alogorithm while being tasked to operate on certain distance criteria. The formulated  
                            distances are euclidean and Manhattan distance. Euclidean distance or Euclidean metric is the                               
                           "ordinary" straight-line distance between two points in Euclidean space(google). The 
                            Manhattan distance is The distance between two points measured along axes at right angles. In a    
                            plane with p1 at (x1, y1) and p2 at (x2, y2), it is |x1 - x2| + |y1 - y2|. Lm distance.
                            
      A* Algorithm : A* was created based on the Dikstras algorithm, but more optimal. It is an informed search algorithm, as  
                     it uses information about path cost and also uses heuristics to find the solution.
                     
                     A* terminology :
                     
                     Node (also called State) — All potential position or stops with a unique identification
                     Transition — The act of moving between states or nodes.
                     Starting Node — Whereto start searching
                     Goal Node — The target to stop searching.
                     Search Space — A collection of nodes, like all board positions of a board game
                     Cost — Numerical value (say distance, time, or financial expense) for the path from a node to another               
                     node.
                     g(n) — this represents the exact cost of the path from the starting node to any node n
                     h(n) — this represents the heuristic estimated cost from node n to the goal node.
                     f(n) — lowest cost in the neighboring node n
       
       Each time A* enters a node, it calculates the cost, f(n)(n being the neighboring node), to travel to all of the 
       neighboring nodes, and then enters the node with the lowest value of f(n).
                      These values we calculate using the following formula:
                                       f(n) = g(n) + h(n)
                                       
       In summary, A* is an effictive algoritm used in Artificial Intelligence. The impoortance lie within it heuristic   
       function, however .
      
