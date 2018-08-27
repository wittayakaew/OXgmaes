import java.util.Scanner;
public class Games {
    private static OX ox;
    private static Scanner kb = new Scanner(System.in);
    private static int col,row;
    public static void input (){
        System.out.print(ox.getCurrentPlayer() + " (Col) : ");
        col = kb.nextInt();
        System.out.print(ox.getCurrentPlayer() + " (Row) : ");
        row = kb.nextInt();

        if(col>2&&row>2&&col>-1&&row>-1){
            System.out.println("Please input between 0-2");
        }else{
            ox.put(col,row);
        }

    }
    public static void main(String[]args){
        ox= new OX();
        while(true){
        System.out.print(ox.getTable());
        input();


        if(ox.checkWin()){
            System.out.print(ox.getTable());

            ox.showPlayerWin();
            break;
        }
        ox.switchPlayer();
        if(ox.checkTableFull()){
            ox.getTable();
            ox.showScoreDraw();
            break;
        }
        }
    }
}