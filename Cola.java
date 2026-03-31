public class Cola {
    private Nodo frente, fin;

    public Cola() {
        frente = fin = null;
    }

    public boolean estaVacia() {
        return frente == null;
    }

    public void encolar(Cliente c) {
        Nodo nuevo = new Nodo(c);

        if (estaVacia()) {
            frente = fin = nuevo;
        } else {
            fin.siguiente = nuevo;
            fin = nuevo;
        }
    }

    public Cliente desencolar() {
        if (estaVacia()) return null;

        Cliente c = frente.dato;
        frente = frente.siguiente;

        if (frente == null) fin = null;

        return c;
    }
}