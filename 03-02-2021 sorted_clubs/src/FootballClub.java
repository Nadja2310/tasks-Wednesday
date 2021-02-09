public class FootballClub {
    private String country;
    String name;
    int achievedPoint;

    @Override
    public String toString() {
        return "\n FootballClub{" +
                "country='" + country + '\'' +
                ", name='" + name + '\'' +
                ", achievedPoint=" + achievedPoint +
                '}';
    }

    public FootballClub(String country, String name, int achievedPoint) {
        this.country = country;
        this.name = name;
        this.achievedPoint = achievedPoint;
    }

    public String getCountry() {
        return country;
    }
}
