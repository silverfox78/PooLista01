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
}
