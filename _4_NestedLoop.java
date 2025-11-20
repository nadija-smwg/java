public class _4_NestedLoop {
    public static void main(String[] args) {
        int i ,j = 1 ;

        for (i = 1; i <= 10; i++){
            System.out.print("Tabale of "+ i + " is : ");
            for (j = 1; j <= 10; j++){
                int num = i * j ;
                System.out.print(num +" ");
            }
            System.out.print("\n");

        }
    }
}
