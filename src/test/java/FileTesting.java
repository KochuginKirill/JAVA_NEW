import java.util.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
/*
public class Main {
    public static void main(String[] args) {
        HashMap<Character, Character> brackets = new HashMap<>();

        brackets.put('}', '{');
        brackets.put(']', '[');
        brackets.put(')', '(');


        Stack<Character> stack = new Stack<>();
        char[] chars = "[a+(1*3])".toCharArray();
        for (char myChar : chars) {
            if (brackets.containsValue(myChar)) {
                stack.push(myChar);
            } else if (brackets.containsKey(myChar)) {
                if (stack.isEmpty() || stack.pop() != brackets.get(myChar)) {
                    System.out.println("false");
                    return;
                }
            }
        }
        System.out.println(stack.isEmpty());
    }
}
*/
/*
import java.util.ArrayList;
import java.util.HashMap;

class PhoneBook {
    private static HashMap<String, ArrayList<Integer>> phoneBook = new HashMap<>();

    public void add(String name, Integer phoneNum) {
        ArrayList<Integer> newNumber = phoneBook.get(name);
        if (newNumber != null) {
            if(!newNumber.contains(phoneNum)) newNumber.add(phoneNum);
        } else {
            newNumber.add(phoneNum);
            phoneBook.put(name, newNumber);
        }
    }

    public ArrayList<Integer> find(String name) {
        return phoneBook.get(name);

    }

    public static HashMap<String, ArrayList<Integer>> getPhoneBook() {
        return phoneBook;

    }
}
*/

//int n =  sortLength;
//        for(int i = n/2 - 1; i>=0;i--)
//        {
//        int l = i * 2 + 1;
//        int r = i * 2 + 2;
//        int largest = i;
//        if(l < n && tree[l] > tree[largest]){
//        largest = l;
//        }
//        if(l < n && tree[r] > tree[largest]){
//        largest = r;
//        }
//        if(i != largest){
//        int temp = tree[i];
//        tree[i] = tree[largest];
//        tree[largest] = temp;
//        }
//        }
//
//        }
//
//
//        int n =  sortLength;
//        for(int i = n-1; i >=0; i--){
//        int temp = sortArray[i];
//        sortArray[i] = sortArray[0];
//        sortArray[0] = temp;
//        buildTree(sortArray);
//        }