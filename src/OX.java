//

public class OX {
    private String [][] table = {
            {" " ,"0" ,"1" ,"2"},
            {"0" ,"-" ,"-" ,"-"},
            {"1" ,"-" ,"-" ,"-"},
            {"2" ,"-" ,"-" ,"-"},
    };
    private String player;
    private int scoreX,scoreO,scoreDraw;
    public OX(){
        player = "X";
        scoreX = 0;
        scoreO = 0;
        scoreDraw = 0;
    }
    public void showPlayerWin(){
        System.out.println( "X WIN : "+getscoreX());
        System.out.println( "O WIN : "+getscoreO());
        System.out.println( "DRAW : "+getscoreDraw());
    }
    public String getTable(){
        String result="";
        for(int row = 0 ;row < table.length;row++){
            for(int col= 0; col< table[row].length;col++){
                result = result+table[row][col];
            }
            result = result+"\n";

        }
        return result;
    }

    public String getCurrentPlayer() {
        return player;
    }

    public int getscoreO() {
        return scoreO;
    }

    public int getscoreX() {
        return scoreX;
    }

    public int getscoreDraw() {
        return scoreDraw;
    }

    public boolean put(int col, int row) {
        if(!table[row+1][col+1].equals("-")&&!table[row+1][col+1].equals("X")&&!table[row+1][col+1].equals("O")){
            System.out.print("Fail put");
            return false;
        }else{

        }
        table[row+1][col+1] = getCurrentPlayer();
        return true;

    }
    public void showScoreDraw(){
        System.out.println( "X WIN : "+scoreX);
        System.out.println( "O WIN : "+scoreO);
        System.out.println( "DRAW : "+scoreDraw);
    }
    public void switchPlayer() {
        if(player.equals("X")){
            player = "O";
        }else{
            player = "X";
        }

    }
    public void setWin(String name){

        if(name.equals("X")){
            scoreX = scoreX + 1;
        }else if (name.equals("O")){
            scoreO = scoreO + 1;
        }

    }
    public boolean checkWin() {
        boolean flag = false;
        String name = getCurrentPlayer();
                for (int i = 1 ; i < 4 ; i++) {
            if (table[1][i].equals(name)&&table[2][i].equals(name)&&table[3][i].equals(name)) {
               flag = true;
               setWin(name);

                break;
            }else if (table[1][i].equals(name)&&table[2][i].equals(name)&&table[3][i].equals(name)) {
                flag = true;
                setWin(name);
                break;
            }else if (table[i][1].equals(name)&&table[i][2].equals(name)&&table[i][3].equals(name) ) {
                flag = true;
                setWin(name);
                break;
            }else if (table[1][1].equals(name)&&table[2][2].equals(name)&&table[3][3].equals(name)||
                      table[1][3].equals(name)&&table[2][2].equals(name)&&table[3][1].equals(name)) {
                flag = true;
                setWin(name);
                break;
            }
        }
        return flag;


    }


    public boolean checkTableFull() {
        int countTable = 0;
        for(int i = 1 ; i < 4 ; i++ ){
            for (int j = 1 ; j < 4 ; j++){
                if(!table[i][j].equals("-")){
                    countTable++;
                }
            }
        }
        if(countTable==9){
            return true;
        }else{
            return false;
        }
    }
}