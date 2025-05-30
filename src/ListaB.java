public class ListaB<T> {

    protected NodoB<T> head;
    protected NodoB<T> tail;

    public ListaB(){
        head = tail = null;
    }

    public void addHead(T valore){
        NodoB<T> newnode = new NodoB<T>(valore);
        newnode.setSucc(head);
        if(head != null){
            head.setPrec(newnode);
        } else {
            tail = newnode;
        }

        head = newnode;
    }

    public void addTail(T valore) {
        NodoB<T> newnode = new NodoB<T>
    }

    
}
