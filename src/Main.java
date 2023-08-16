import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Collections;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> listA = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            String names = scanner.nextLine();
            listA.add(names);
        }
        System.out.println(listA);


        ArrayList<String> listB = new ArrayList<>();
        for (int j = 0; j < 5; j++) {
            String names = scanner.nextLine();
            listB.add(names);
        }
        System.out.println(listB);
        Collections.reverse(listB);

        System.out.println("-----------------");

        ArrayList<String> allNames = new ArrayList<>();


        allNames.add(0, listA.get(0));
        allNames.add(1, listB.get(0));
        allNames.add(2, listA.get(1));
        allNames.add(3, listB.get(1));
        allNames.add(4, listA.get(2));
        allNames.add(5, listB.get(2));
        allNames.add(6, listA.get(3));
        allNames.add(7, listB.get(3));
        allNames.add(8, listA.get(4));
        allNames.add(9, listB.get(4));
        System.out.println("Список C: " + allNames);

        System.out.println("-------------");

        allNames.sort(Comparator.comparing(String::length));
        System.out.println(allNames);
    }
}