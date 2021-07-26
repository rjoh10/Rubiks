public class RoobikCube
{

    
    private String[][] faces;

    //constructor to initialize the faces
    public RoobikCube()
    {
        this.faces = new String[][]{ { new RoobikFace("White").toString(),"","",""},
                { new RoobikFace("Blue").toString(),
                        new RoobikFace("Orange").toString(),
                        new RoobikFace("Green").toString(),""},
                { new RoobikFace("Yellow").toString(),"","",""},
                { new RoobikFace("Red").toString(),"","",""}};

    }
    
    //constructor to flip the faces
    public RoobikCube(String[][] faces){
        this.faces = faces;
    }

   //method to flip to the left
   RoobikCube turnLeft()
   {
        
        int rows = faces.length;
        int cols = faces[0].length;
        String[][] rotatedLeft = new String[rows][cols];
        for (int i = 0; i<rows; i++){
            for (int j = 0; j<cols; j++){
                    rotatedLeft[i][j] = faces[j][cols - i - 1];
            }
        }
        return new RoobikCube(rotatedLeft);
        
   }
   
    //method to flip to the right
    RoobikCube turnRight()
    {
        int rows = faces.length;
        int cols = faces[0].length;
        String[][] rotatedRight = new String[rows][cols];
        for (int i = 0; i<rows; i++){
            for (int j = 0; j<cols; j++){
               rotatedRight[i][j] = faces[rows - j - 1][i];
            }
        }
        return new RoobikCube(rotatedRight);
    }

    //method to flip up
    RoobikCube turnUp()
    {
        int rows = faces.length;
        int cols = faces[0].length;
        String[][] rotatedUp = new String[rows][cols];

            for (int j = 0; j<cols; j++){
                for (int i = 0; i<rows; i++){
                    rotatedUp[i][j] = faces[j][cols - i - 1];
            }
        }
        return new RoobikCube(rotatedUp);
    }

    //method to flip down
    RoobikCube turnDown()
    {
        int rows = faces.length;
        int cols = faces[0].length;
        String[][] rotatedDown = new String[rows][cols];
        for (int j = 0; j<cols; j++){
            for (int i = 0; i<rows; i++){
                rotatedDown[i][j] = faces[rows - j - 1][i];
            }
        }
        return new RoobikCube(rotatedDown);
    }

    /** 
     * @return String
     */
    public String toString()
    {
        int rows = faces.length;
        int cols = faces[3].length;
        String output = "";
        for (int i = 0; i<rows; i++){
            for (int j = 0; j<cols; j++){
                output += faces[i][j];
            }
            output += "\n";
        }
        return output;

    }
    
}
