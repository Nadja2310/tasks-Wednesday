package telran;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class BoardTest {
    Board board=new Board();

    @Test
    void board_NumberOfColumns_1() {
        int[] columnSum={1};
        int[] rez={1,0};

        assertArrayEquals(board.solve(1,0,columnSum),rez);

    }
    @Test
    void board_NumberOfColumns_3() {
        int[] columnSum={1,0,2};
        int[] rez={1,0,1,0,0,1};
        assertArrayEquals(board.solve(2,1,columnSum),rez);

    }

    @Test
    void board_NumberOfColumns_6() {
        int[] columnSum={1,0,2,2,0,1};
        int[] rez={1,0,1,1,0,1,0,0,1,1,0,0};
        assertArrayEquals(board.solve(4,2,columnSum),rez);

    }
    @Test
    void board_NumberOfColumns_5() {
        int[] columnSum={2,1,1,0,1};
        int[] rez={1,0,1,0,1,1,1,0,0,0};
        assertArrayEquals(board.solve(3,2,columnSum),rez);

    }
}