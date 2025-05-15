import java.util.ArrayList;

public class stack<T> {
    ArrayList<T> st;
    int top=-1,size;

    stack(int size){
        this.size=size;
        this.st = new ArrayList<>(size);
    }
    void push(T x) {
        if(top+1==size){
            System.out.println("Stack overflow");
        }
        else {
            top++;
            if(st.size()>top){
                st.set(top,x);
            }
            else
             st.add(x);

        }
    }
    void pop () {
        if(top==-1){
            System.out.println("Underflow");
        }else{
            top--;
        }
    }

}
