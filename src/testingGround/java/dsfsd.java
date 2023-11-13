/* 1
import java.util.LinkedList;

class LLTasks {
    public static LinkedList<Object> revert(LinkedList<Object> ll) {
        LinkedList<Object> newLl = new LinkedList<Object>();

for (Object item : ll) {
  newLl.addFirst(item);
}

return newLl;


}
}
 */

/* 2
import java.util.LinkedList;

class MyQueue<T> { private LinkedList<T> elements = new LinkedList<>();


public void enqueue(T element){
    elements.add(element);
}

public T dequeue(){
    T first = elements.getFirst();
    elements.removeFirst();
    return first;
}

public T first(){
    return elements.getFirst();
}

public LinkedList<T> getElements() {
    return elements;
}

public void setElements(LinkedList<T> elements) {
    this.elements = elements;
}
}

 */

/* 3
import java.util.ArrayDeque;
import java.util.Deque;

class Calculator {

private ArrayDeque<Integer> results;

public Calculator() {
    results = new ArrayDeque<Integer>();
}

public int calculate(char op, int a, int b) {

    int result = 0;
    if (op == '+')
        result = a + b;
    else if (op == '-')
        result =  a - b;
    else if (op == '*')
        result =  a * b;
    else if (op == '/')
        result =  a / b;

    if (op == '<') {
        results.removeLast();
        result = results.removeLast();


    } else
            results.add(result);


            return result;
            }
            }
 */