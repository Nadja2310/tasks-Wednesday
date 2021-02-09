import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class OperationTest {
    Operation operation = new Operation();

    @Test
    public void table() {

        List<FootballClub> listTest= Arrays.asList(
                new FootballClub("Germany","BVG",100),
                new FootballClub("Germany","Hertha",40),
                new FootballClub("Italy","Juventus",140),
                new FootballClub("Italy","Milan",100),
                new FootballClub("Italy","Lazio",40),
                new FootballClub("Spain","Barcelona",40));

        List<FootballClub> listFC= Arrays.asList(
                new FootballClub("Italy","Juventus",140),
                new FootballClub("Germany","BVG",100),
                new FootballClub("Italy","Milan",100),
                new FootballClub("Italy","Lazio",40),
                new FootballClub("Spain","Barcelona",40),
                new FootballClub("Germany","Hertha",40)
               );
        int i=0;
        //System.out.println(operation.table(listFC));
        List<FootballClub> sortListFC=operation.table(listFC);
        for (FootballClub elt: sortListFC) {
            FootballClub eltTest=listTest.get(i);
            assertEquals(eltTest.getCountry(),elt.getCountry());
            assertEquals(eltTest.achievedPoint,elt.achievedPoint);
            i++;
        }
        assertEquals(6,listFC.size());
    }
}