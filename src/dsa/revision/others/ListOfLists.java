package dsa.revision.others;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListOfLists {

    public static void main(String[] args) {

        String input = "Linux, Microsoft, ios, others\n"
                + "Oracle, mySQL, postgres\n"
                + "java, c++, python";

        String[] splittedInput = input.split("\n");
        List<List<String>> mainList = new ArrayList<>();
        for (String element : splittedInput) {
            List<String> itemsList = new ArrayList<>(Arrays.asList(element.split(", ")));
            mainList.add(itemsList);
        }

        for (List<String> list : mainList) {
            System.out.println(list);
        }
    }
}
