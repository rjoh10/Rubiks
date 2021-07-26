public class RoobikCube
{

    private RoobikFace[][] faces;
    private char[][] outputArray;


    public RoobikCube(RoobikFace[][] faces){
        this.faces = faces;
        this.outputArray = new char[12][12];
    }

    public RoobikCube()
    {
       this.faces = new RoobikFace[][]{ {new RoobikFace(""),
                                        new RoobikFace("White"),
                                        new RoobikFace(""),
                                        new RoobikFace("")},
                { new RoobikFace("Blue"),
                        new RoobikFace("Orange"),
                        new RoobikFace("Green"),
                        new RoobikFace("")},
                {new RoobikFace(""),
                        new RoobikFace("Yellow"),
                        new RoobikFace(""),
                        new RoobikFace("")},
                {new RoobikFace(""),
                        new RoobikFace("Red"),
                        new RoobikFace(""),
                        new RoobikFace("")}};
        this.outputArray = new char[12][12];

    }

    RoobikCube turnLeft()
    {
        int rows = faces.length;
        int cols = faces[0].length;
        RoobikFace[][] rotatedLeft = new RoobikFace[rows][cols];
        for (int i = 0; i<rows; i++){
            for (int j = 0; j<cols; j++){
                    rotatedLeft[i][j] = faces[j][cols - i - 1];
            }
        }
        return new RoobikCube(rotatedLeft);
    }

    RoobikCube turnRight()
    {
        int rows = faces.length;
        int cols = faces[0].length;
        RoobikFace[][] rotatedRight = new RoobikFace[rows][cols];
        for (int i = 0; i<rows; i++){
            for (int j = 0; j<cols; j++){
               rotatedRight[i][j] = faces[rows - j - 1][i];
            }
        }
        return new RoobikCube(rotatedRight);
    }


    RoobikCube turnUp()
    {
        int rows = faces.length;
        int cols = faces[0].length;
        RoobikFace[][] rotatedUp = new RoobikFace[rows][cols];

        for (int j = 0; j<cols; j++){
            for (int i = 0; i<rows; i++){
//                    rotatedUp[i][j] = faces[j][cols - i - 1];
                    rotatedUp[i][j] = faces[rows-i-1][j];
            }
        }
        return new RoobikCube(rotatedUp);
    }

    RoobikCube turnDown()
    {
        int rows = faces.length;
        int cols = faces[0].length;
        RoobikFace[][] rotatedDown = new RoobikFace[rows][cols];
        for (int j = 0; j<cols; j++){
            for (int i = 0; i<rows; i++){
//                  rotatedDown[i][j] = faces[rows - 1][j];
                rotatedDown[i][j] = faces[rows - j - 1][i];
            }
        }
        return new RoobikCube(rotatedDown);
    }

    public String toString()
    {
        RoobikFace[][] roobikFaceArray = new RoobikFace[4][4];
        String output="";
        for(int i=0; i<4; i++){
            for(int j=0; j<4; j++){
                roobikFaceArray[i][j] = this.faces[i][j];
                createOutputArray(i,j,this.faces[i][j].toString().charAt(0));
            }
        }
//        System.out.println(outputArray);
        int row = outputArray.length;
        int col = outputArray[0].length;
        for(int i=0; i<row;i++){
            for (int j=0; j<col; j++){
                output +=outputArray[i][j]+" ";
            }
            output+= "\n";
        }
        return output;
    }

    private void createOutputArray(int rows, int cols, char faceColor){
        for(int row=3*rows; row<3*rows+3; row++){
            for(int col=3*cols; col<3*cols+3; col++){
                outputArray[row][col] = faceColor;
            }
        }

    }
    
}
