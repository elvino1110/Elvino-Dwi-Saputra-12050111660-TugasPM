package ValidasiRumus;

public class StackRumus<T> {

    public T[] data;
    public int top = 0;

    public StackRumus (int n){
        data = (T[]) new Object[n];
    }
    public boolean isEmpty(){
        return top == 0;
    }
    public boolean isFull(){
        return top == data.length;
    }
    public void push(T nilai){
        if (!isFull()){
            data[top] = nilai;
            top++;
        } else {
            System.out.println("Stack Penuh!!");
        }
    }
    public T pop(){
        if (!isEmpty()){
            top--;
            T save = data[top];
            return save;
        } else if (top < -1){
            return (T) "Tidak Valid";
        } else {
            return null;
        }
    }
    public T peek(){
        if (!isEmpty()){
            return data[top - 1];
        } else {
            return null;
        }
    }
}
