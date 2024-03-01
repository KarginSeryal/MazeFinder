import java.util.ArrayList;

public class Mouse {
    private String[][] maze;
    private String[][] path;
    ArrayList<int[]> road = new ArrayList<int[]>();
    public Mouse(String[][] maze){
        this.maze = maze;
        path = new String[this.maze.length][this.maze[0].length];
    }

    public void pathfinder(){
         int[] start = {0,0};
         int[] end = {maze.length - 1, maze[0].length - 1};



    }

    public int direction(int[] location){
        int theWay = 6;
        if(location[1] != 0 && maze[location[0]][location[1] - 1] == "."){
            theWay = 1;
        }
        if(location[0] != maze.length && maze[location[0] + 1][location[1]] == "."){
            if(2 < theWay){
                theWay = 2;
            }
        }
        if(location[1] != maze[0].length && maze[location[0]][location[1] + 1] == "."){
            if(3 < theWay){
                theWay = 3;
            }
        }
        if(location[0] != 0 && maze[location[0] + 1][location[1]] == "."){
            if(4 < theWay){
                theWay = 4;
            }
        }

    }




}
