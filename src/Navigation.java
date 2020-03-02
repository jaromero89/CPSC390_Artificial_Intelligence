
import java.util.ArrayList;
import java.util.HashSet;
import java.util.PriorityQueue;

public class Navigation  {
    String fileName;
    public State initialState, goalState;
    public PriorityQueue queue;


    public Navigation(String file ) {
        fileName = file;
    }

    public void relativePath(Distance distance, boolean useCost) {
        ArrayList<State> findNeighbors = new ArrayList<>();
        ArrayList<State> visited = new ArrayList<>();
        ArrayList<State> frontier = new ArrayList<>();
        HashSet<State> searchTree = new HashSet<>();

        char[][] route = GridLayout.designGridFromFile(fileName);

        State initialState = GridLayout.getInitialPosition(route);
        State goalState = GridLayout.getGoalState(route);

        if(route.length < 1) { return; }

        int path_Cost = 0;

        searchTree.add(initialState);
        visited.add(initialState);

        State current_State = initialState;
        State currState;

        while(!current_State.equals(goalState)) {
            findNeighbors = GridLayout.getNeighbors(current_State, route);
            searchTree.addAll(findNeighbors);

            frontier.addAll(findNeighbors);
            frontier.removeAll(visited);

            if(useCost) {
                current_State = Distance.lowestCostState(frontier, goalState, distance);
            } else {
                current_State = Distance.lowestDistanceState(frontier, goalState, distance);
            }

            path_Cost = current_State.cost;
            visited.add(current_State);
        }

        current_State = current_State.parent;
        while(!current_State.equals(initialState)) {
            route[current_State.x][current_State.y] = 'o';
            current_State = current_State.parent;
        }

        GridLayout.DisplayGrid(route);
        System.out.print("\nPath cost: " + path_Cost + "\nSearch tree size: " + searchTree.size() + '\n');
    }

}



