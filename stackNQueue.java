import java.util.LinkedList;
import java.util.Queue;

public class stackNQueue {
    public static void main(String[] args) {
        stack s = new stack();
        s.push(7);
        s.push(5);
        s.push(3);
        s.push(2);
        s.size();
        s.top();
        s.pop();
        s.size();
        s.top();
    }
}

class stack{
    Queue <Integer> q = new LinkedList<>();
    void push(int x){
        q.add(x);
        for(int i = 0; i < q.size() - 1; i++){
            q.add(q.remove());
        }
    }
    int pop(){
        return q.remove();
    }
    int top(){
        return q.peek();
    }
    int size(){
        return q.size();
    }
}
