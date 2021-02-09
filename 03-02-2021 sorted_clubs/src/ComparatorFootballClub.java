import java.util.Comparator;

public class ComparatorFootballClub implements Comparator<FootballClub> {
    @Override
    public int compare(FootballClub club1, FootballClub club2) {
        String countryClub1 = club1.getCountry();
        String countryClub2 = club2.getCountry();
        int achievedPointClub1 = club1.achievedPoint;
        int achievedPointClub2 = club2.achievedPoint;

        if (countryClub1.compareTo(countryClub2) == 0) {
            return achievedPointClub2 - achievedPointClub1;
        }
        return countryClub1.compareTo(countryClub2);
    }
}
