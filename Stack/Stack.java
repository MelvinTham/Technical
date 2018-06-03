package Stack;

public class Stack {
        int maxSize;
        int top;
        String [] arr;

        public Stack(int size){
            maxSize = size;
            top = 0;
            arr = new String [maxSize];
        }
        public String peek(){
            if(top>0) {
                return arr[top - 1];
            }
            else{
                return null;
            }
        }
        public void push(String p){
            if(top<maxSize) {
                arr[top]=p;
                top++;
            }
            else{
                System.out.println("Stack OverFlow");
            }
        }


        public String pop() {
            if (!this.isEmpty()) {
                String tmp = this.peek();
                arr[top-1] = null;
                top--;
                return tmp;
            }
            else{
                return null;
            }
        }
        public boolean isEmpty() {
            return top == 0 ? true:false;
        }
    public static void main(String[] args) {
        Stack stack = new Stack(10);
        stack.push("10");
        stack.push("20");

        System.out.println("first element is " + stack.peek());
        while(!stack.isEmpty()){
            String value = stack.pop();
            System.out.println(value);
        }

    }
}
