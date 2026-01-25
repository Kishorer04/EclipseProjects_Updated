package stack;

import java.util.LinkedList;
import java.util.Queue;

class MyStack {
    
    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();
    
    public void push(int x) {
        // Push x first in empty q2
        q2.add(x);
        
        // Push all the remaining
        // elements in q1 to q2.
        while (!q1.isEmpty()) {
            q2.add(q1.peek());
            q1.remove();
        }
        
        // swap the names of two queues
        Queue<Integer> t = q1;
        q1 = q2;
        q2 = t;
    }
    
    public void pop() {
        // if no elements are there in q1
        if (q1.isEmpty())
            return;
        q1.remove();
    }
    
    public int top() {
        if (q1.isEmpty())
            return -1;
        return q1.peek();
    }
    
    public int size() { return q1.size(); }
}

public class StackUsingQueues {
    public static void main(String[] args) {
        MyStack st = new MyStack();
        st.push(1);
        st.push(2);
        st.push(3);
      
        System.out.println(st.top());
        st.pop();
        System.out.println(st.top());
        st.pop();
        System.out.println(st.top());
        
        System.out.println(st.size());
    }
}
