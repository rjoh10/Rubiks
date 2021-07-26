public class RoobikFace
{
    private String color;
    
    public RoobikFace(String _color)
    {
        color = _color;
    }

    // Override
    // Returns a 3x3 array of string for the color of the face
    public String toString()
    {
        char[][] colrArray = new char[3][3];
        String output="";
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                colrArray[i][j] = color.substring(0, 1).charAt(0);
                output +=colrArray[i][j]+" ";
            }
            output+= "\n";
        }
//        return color.substring(0, 1);
        return output;
    }
}
