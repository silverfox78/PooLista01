public class Lista {
    private Nodo primero;

    public Nodo getPrimero() {
        return primero;
    }

    public void setPrimero(Nodo primero) {
        this.primero = primero;
    }

    public void push(Nodo n){
        n.setSiguiente(this.primero);
        this.primero = n;
    }

    public Nodo pop(){
        if (this.primero.equals(null)){
            return null;
        }
        Nodo retorno = this.primero;
        retorno.setSiguiente(null);
        this.primero = this.primero.getSiguiente();
        return retorno;
    }

    public Nodo peek(){
        return this.primero;
    }
}
