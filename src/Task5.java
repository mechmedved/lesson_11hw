import java.util.ArrayList;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        for(int i=0;i<5;i++){
            myList.addFirst(sc.nextLine());
        }

        sc.close();

        for (int i = 0; i < 13; i++) {
            var last = myList.remove(myList.size()-1);
            myList.addFirst(last);
        }

        for(var s:myList){
            System.out.println(s);
        }
    }
}