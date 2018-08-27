import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OXTest {
    @Test
    public void shouldCreateOXObjectCorrectly() {
        OX ox = new OX();
        // " 012\n0---\n1---\n2---\n"
        assertEquals(" 012\n0---\n1---\n2---\n",ox.getTable());
        assertEquals("X",ox.getCurrentPlayer());
        assertEquals(0,ox.getscoreO());
        assertEquals(0,ox.getscoreX());
        assertEquals(0,ox.getscoreDraw());

    }
    @Test
    public void put(){
        OX ox = new OX();
        ox.put(1,1);
        assertEquals(" 012\n0---\n1-X-\n2---\n",ox.getTable());

        ox.put(0,0);
        assertEquals(" 012\n0X--\n1-X-\n2---\n",ox.getTable());

        ox.put(2,1);
        assertEquals(" 012\n0X--\n1-XX\n2---\n",ox.getTable());

        ox.switchPlayer();
        ox.put(0,2);
        assertEquals(" 012\n0X--\n1-XX\n2O--\n",ox.getTable());

        assertEquals(false,ox.put(0,2));


    }
    @Test
    public void switchPlayer(){
        OX ox = new OX();
        ox.switchPlayer();
        assertEquals("O",ox.getCurrentPlayer());
        ox.switchPlayer();
        assertEquals("X",ox.getCurrentPlayer());
    }
    @Test
    public void checkWin1(){
        OX ox = new OX();
        ox.put(0,0);
        ox.put(0,1);
        ox.put(0,2);
        assertEquals(" 012\n0X--\n1X--\n2X--\n",ox.getTable());


    }
    @Test
    public void checkWin2(){
        OX ox = new OX();
        ox.put(0,0);
        ox.put(0,1);

        assertEquals(" 012\n0X--\n1X--\n2---\n",ox.getTable());


    }
    @Test
    public void checkWin3(){
        OX ox = new OX();
        ox.put(1,0);
        ox.put(1,1);
        ox.put(1,2);
        assertEquals(" 012\n0-X-\n1-X-\n2-X-\n",ox.getTable());


    }

   /*
    public void checkWin4(){

        OX ox = new OX();
        ox.put(0,0);
        ox.put(1,0);
        ox.put(2,0);
        assertEquals(" 012\n0XXX\n1---\n2---\n",ox.getTable());
        assertEquals(true,ox.checkWin(0,0));
        assertEquals(true,ox.checkWin(1,0));
        assertEquals(true,ox.checkWin(2,0));

    }
    */

}