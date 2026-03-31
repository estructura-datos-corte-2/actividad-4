public class Cliente {
    int id;
    String tipo; // "normal" o "urgente"
    int tiempoLlegada;

    public Cliente(int id, String tipo, int tiempoLlegada) {
        this.id = id;
        this.tipo = tipo;
        this.tiempoLlegada = tiempoLlegada;
    }
}