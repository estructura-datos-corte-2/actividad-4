import java.util.PriorityQueue;

public class SimulacionBanco {

    public static void main(String[] args) {

        Cola colaNormal = new Cola();

        PriorityQueue<Cliente> colaUrgente = new PriorityQueue<>(
            (a, b) -> a.tiempoLlegada - b.tiempoLlegada
        );

        int tiempoTotal = 20;
        int id = 1;

        int totalEspera = 0;
        int clientesAtendidos = 0;

        for (int tiempo = 0; tiempo < tiempoTotal; tiempo++) {

            System.out.println("Tiempo: " + tiempo);

            if (Math.random() < 0.6) {
                String tipo = Math.random() < 0.3 ? "urgente" : "normal";

                Cliente nuevo = new Cliente(id++, tipo, tiempo);

                if (tipo.equals("urgente")) {
                    colaUrgente.add(nuevo);
                    System.out.println("Llega cliente URGENTE ID: " + nuevo.id);
                } else {
                    colaNormal.encolar(nuevo);
                    System.out.println("Llega cliente normal ID: " + nuevo.id);
                }
            }

            Cliente atendido = null;

            if (!colaUrgente.isEmpty()) {
                atendido = colaUrgente.poll();
            } else if (!colaNormal.estaVacia()) {
                atendido = colaNormal.desencolar();
            }

            if (atendido != null) {
                int espera = tiempo - atendido.tiempoLlegada;
                totalEspera += espera;
                clientesAtendidos++;

                System.out.println("Atendiendo cliente ID: " + atendido.id +
                                   " Tipo: " + atendido.tipo +
                                   " Espera: " + espera);
            }

            System.out.println("----------------------");
        }

        System.out.println("Clientes atendidos: " + clientesAtendidos);

        if (clientesAtendidos > 0) {
            System.out.println("Tiempo promedio de espera: " +
                (double) totalEspera / clientesAtendidos);
        }
    }
}