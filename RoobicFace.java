import java.util.Random;

public class RoobikFace
{
    private String color;
    private char[][] colrArray;

    enum COLOR{
        White,
        Blue,
        Orange,
        Green,
        Yellow,
        Red
    }

    public RoobikFace(String _color)
    {
        this.color = _color;
        colrArray= createRoobikFace(color);
    }

    private COLOR randomColor(){
        int pickColor = new Random().nextInt(COLOR.values().length);
        return COLOR.values()[pickColor];
    }

    private char[][] createRoobikFace(String color){
        colrArray= new char[3][3];
         for(int i=0; i<3; i++) {
            for (int j = 0; j < 3; j++) {
                if (color!=""){
                    String rndmColor = randomColor().name();
                    while(rndmColor.equalsIgnoreCase(color)){
                        rndmColor = randomColor().name();
                    }
                    colrArray[i][j] = rndmColor.substring(0, 1).charAt(0);
                }
                else{
                    colrArray[i][j] = ' ';
                }
            }
        }
       if (color!=""){
           colrArray[1][1] = color.substring(0, 1).charAt(0);
       }
        return colrArray;
    }

    public String toString()
    {
        String output="";
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                output +=colrArray[i][j]+" ";
            }
            output+= "\n";
        }
        System.out.println(output);
        return output;
    }
    public static void main(String[] args){
        RoobikFace fb = new RoobikFace("Green");
        System.out.println(fb);
    }
    public char[][] getColrArray() {
        return colrArray;
    }
}
