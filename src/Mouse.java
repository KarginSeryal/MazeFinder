import java.util.ArrayList;

public class Mouse {
    private final String[][] maze;
    private String[][] path;
    ArrayList<int[]> cords = new ArrayList<int[]>();
    public Mouse(String[][] maze){
        this.maze = maze;
        path = new String[this.maze.length][this.maze[0].length];
        for(int i = 0; i < this.maze.length; i++){
            for(int j = 0; j < this.maze[0].length; j++){
                path[i][j] = this.maze[i][j];
            }
        }
    }

    public void pathfinder(){
         int[] start = {0,0,0};
         int[] end = {maze.length - 1, maze[0].length - 1};
         cords.add(start);
         int[][] Haroon = new int[500][2];
         int[] temp = new int[2];
         while(lastCord()[0] == end[0] && lastCord()[1] == end[1]){
            temp = directions(lastCord());
            switch (temp[0]){
                case 1: cords.add(new int[]{lastCord()[0], lastCord()[1] - 1, 0});
                case 2: cords.add(new int[]{lastCord()[0] - 1, lastCord()[1], 0});
                case 3: cords.add(new int[]{lastCord()[0], lastCord()[1] + 1, 0});
                case 4: cords.add(new int[]{lastCord()[0] + 1, lastCord()[1], 0});
                case 5:
            }



         }
    }

    public int[] directions(int[] location){
        int[] theWay = {5,0};
        if(location[1] != 0 && maze[location[0]][location[1] - 1] == "."){ // left
            theWay[0] = 1;
            theWay[1]++;
        }
        if(location[0] != maze.length && maze[location[0] - 1][location[1]] == "."){ // down
            if(2 < theWay[0]){
                theWay[0] = 2;
                theWay[1]++;
            }
        }
        if(location[1] != maze[0].length && maze[location[0]][location[1] + 1] == "."){  // right
            if(3 < theWay[0]){
                theWay[0] = 3;
                theWay[1]++;
            }
        }
        if(location[0] != maze[0].length && maze[location[0] + 1][location[1]] == "."){  // up
            if(4 < theWay[0]){
                theWay[0] = 4;
                theWay[1]++;
            }
        }
        cords.get(cords.size() - 1)[2] = theWay[1];
        return theWay;
    }


    public int[] forkFinder(){
        for(int i = cordsLast(); i >= 0)
    }

    public int cordsLast(){
        return cords.size() - 1;
    }

    public int[] lastCord(){
        return cords.get(cordsLast());
    }


}
