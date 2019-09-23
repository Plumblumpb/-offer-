package 基础算法.A2堆栈和队列;

import java.util.*;

/**
 * Created with IDEA
 * author:plumblum
 * Date:2019/3/18
 * Time:11:29
 */
//队列实现栈
public class Main {


    class  MyStack{
        private LinkedList queue;
        private Queue q1;
        public  void push(int x){
            if (queue.isEmpty()){
                queue.add(x);
            }else{
                LinkedList demo = new LinkedList();
                while(!queue.isEmpty()){
                    demo.push(queue.peek());
                    queue.pop();
                }
                while(!demo.isEmpty()){
                    queue.push(queue.peek());
                    demo.pop();
                }
            }
        }

        public int pop(){
            int x = (int)queue.peek();
            queue.pop();
            return x;
        }

        public  int peek(){
            return (int)queue.peek();
        }

        public boolean empty(){
            return queue.isEmpty();
        }
    }
    class Myqueue{
        private Stack stack;

        public  void push(int x){
            if (stack.empty()){
                stack.push(x);
            }else {
                Stack s = new Stack();
                s.push(x);
                while(!stack.empty()){
                    s.push(stack.peek());
                    stack.pop();
                }
                while(!s.empty()){
                    stack.push(s.peek());
                    s.pop();
                }
            }

        }
        public int pop(){
            int x = (int)stack.peek();
            stack.pop();
            return x;

        }

        public int peek(){
            return (int)stack.peek();
        }
        public boolean emply(){
            return stack.empty();
        }
    }
    public static void main(String[] args) {
        PriorityQueue queue = new PriorityQueue();
//        PriorityQueue<Integer> pq = new PriorityQueue<>(new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return o2-o1;
//            }
//        });
        queue.add(1);
        queue.add(3);
        queue.add(2);
        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue.peek());
    }
}
