public class NodoB<T> extends Nodo<T> {

    protected NodoB<T> prec;

    public NodoB() {
        super();
        prec = null;
    }

    public NodoB(T valore) {
        super(valore);
        prec = null;
    }

    public NodoB<T> getPrec(){
        return prec;
    }

    public void setPrec(NodoB<T> prec){
        this.prec = prec;
    }

    public NodoB<T> getSucc(){
        return(NodoB<T>)super.getSucc();
        
    }

    public void setSucc(NodoB<T> succ) {
        super.setSucc(succ);
    }

    @Override
    public String toString(){
        return valore.toString();
    }

}
