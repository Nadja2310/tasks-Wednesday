import java.util.*;

public class Operation {

    public List<FootballClub> table(List<FootballClub> footballClubList) {
        List<FootballClub> copySort = new ArrayList<>(footballClubList);

        ComparatorFootballClub comparator = new ComparatorFootballClub();
        Collections.sort(copySort, comparator);

        return copySort;
    }
}