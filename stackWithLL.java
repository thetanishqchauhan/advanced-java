public class stackWithLL {

    public static void main(String[] args) {
        // // Implementing stack using LL
        // stack st = new stack();
        // st.push(4);
        // st.push(2);
        // st.push(1);
        // System.out.println(st.top());
        // System.out.println(st.size());
        // st.push(7);
        // System.out.println(st.size());
        // System.out.println(st.pop());
        // System.out.println(st.top());
        // System.out.println(st.size());

        // Implementing queue using LL
        queue q = new queue();
        // q.push(7);
        // q.push(5);
        // q.push(4);
        // q.push(2);
        System.out.println("Size of queue: " + q.size());
        System.out.println("Top of queue: " + q.top());
        System.out.println("Element popped: " + q.pop());
        System.out.println("Top of queue: " + q.top());
        System.out.println("Size of queue: " + q.size());
    }
}

// Implementation of Stack and Queue using Linked List

// stack using LL
class stack{

    // Creating Node for LL
    private class Node{
        int data;
        Node next;

        // Constructors
        Node(int data1){
            data = data1;
            next = null;
        }
    }

    // Creating the stack using these nodes of LL
    Node top;
    int size;

    stack(){
        this.top = null;
        this.size = 0;
    }

    public void push(int x){
        Node temp = new Node(x);
        temp.next = top;
        top = temp;
        System.out.println("Element pushed: " + x);
        size += 1;
    }

    public int pop(){
        int topData = top.data;
        top = top.next;
        size = size - 1;
        System.out.print("Element popped: ");
        return topData;
    }

    public int top(){
        System.out.print("Top of the stack: ");
        return top.data;
    }

    public int size(){
        System.out.print("Size of the stack: ");
        return size;
    }

}

// queue using LL
class queue{

    // creating a node for LL
    class Node{
        int data;
        Node next;
        Node(int data1){
            data = data1;
            next = null;
        }
    }

    // implementing the queue using nodes
    Node start;
    Node end;
    int size;
    queue(){
        this.start = null;
        this.end = null;
        this.size = 0;
    }

    void push(int x){
        Node temp = new Node(x);
        if(start == null && end == null){
            start = temp;
            end = temp;
        }
        else{
            end.next = temp;
            end = temp;
        }
        size += 1;
        System.out.println("Element pushed: " + x);
    }

    int pop(){
        if (start == null) {
            System.out.println("Queue is empty");
            return -1;
        }
        int startData = start.data;
        start = start.next;
        size -= 1;
        return startData;
    }

    int top(){
        if(start == null){
            System.out.println("Queue is empty");
            return -1;
        }
        return start.data;
    }

    int size(){
        return size;
    }

}
