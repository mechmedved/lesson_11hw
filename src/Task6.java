import java.util.ArrayList;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        for(int i=0;i<5;i++){
            myList.add(sc.nextLine());
        }

        sc.close();

        int indexMax = myList.indexOf(maxString(myList));
        int indexMin = myList.indexOf(minString(myList));

        if(indexMax<indexMin){
            System.out.println(myList.get(indexMax));
        }
        else{
            System.out.println(myList.get(indexMin));
        }

    }

    private static String maxString(ArrayList<String> myList){

        int maxValue = myList.getFirst().length();
        String maxString = myList.getFirst();
        for(var value: myList){
            int currentLength = value.length();
            if(currentLength>maxValue){
                maxString = value;
            }
        }

        return maxString;
    }

    private static String minString(ArrayList<String> myList){

        int minValue = myList.getFirst().length();
        String minString = myList.getFirst();
        for(var value: myList){
            int currentLength = value.length();
            if(currentLength<minValue){
                minString = value;
            }
        }

        return minString;
    }
}
