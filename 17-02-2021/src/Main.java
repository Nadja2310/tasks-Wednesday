import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        SolutionCut solt=new SolutionCut();
        List<Integer> numbers = Arrays.asList(2,4,8,10,11,14);
        Cut cut1=new Cut(1,5);
        Cut cut2=new Cut(2,5);
        Cut cut3=new Cut(3,5);
        Cut cut4=new Cut(10,15);
        List<Cut> listCuts = Arrays.asList(cut1,cut2,cut3,cut4);
        solt.solt(listCuts,numbers).forEach((key, value) -> System.out.println("Point " + key + " - " + value));;
    }
}
