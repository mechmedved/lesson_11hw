import java.util.ArrayList;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        for(int i=0;i<10;i++){
            myList.addFirst(sc.nextLine());
        }

        sc.close();

        for(var s:myList){
            System.out.println(s);
        }
    }
}
