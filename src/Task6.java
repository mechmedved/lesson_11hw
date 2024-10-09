import java.util.ArrayList;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        for(int i=0;i<5;i++)
        {
            myList.add(sc.nextLine());
        }

        sc.close();

        System.out.println(findNearestLongerOrShortestLine(myList));
    }

    private static String findNearestLongerOrShortestLine(ArrayList<String> myList)
    {
        if (myList.isEmpty()) {
            throw new IllegalArgumentException("List must not be empty");
        }

        String maxString = myList.getFirst();
        String minString = myList.getFirst();
        int maxIndex = 0;
        int minIndex = 0;

        for (int i = 1; i < myList.size(); i++)
        {
            int currentLength = myList.get(i).length();

            if (currentLength > maxString.length())
            {
                maxString = myList.get(i);
                maxIndex = i;
            }

            if (currentLength < minString.length())
            {
                minString = myList.get(i);
                minIndex = i;
            }
        }

        return (maxIndex < minIndex) ? maxString : minString;
    }
}