import java.util.Arrays;
import java.util.List;

public class _8_ForEachLoop {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("James","Larry","Tom","Lacy");

        for ( String name : names) {
            System.out.print(name + ", ");
        }
    }  
}
