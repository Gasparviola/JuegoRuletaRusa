
import java.util.ArrayList;


public class Juego {
        private ArrayList<Jugador> jugadores;
        private RevolverAgua revolver;
        
        public void llenarJuego(ArrayList<Jugador> jugadores , RevolverAgua revolver){
            this.jugadores = jugadores;
            this.revolver = revolver;
        }
        
        public void ronda(){
            int indiceJugadorActual = 0;
            while(true){
                Jugador jugadorActual = jugadores.get(indiceJugadorActual);
                boolean mojado = jugadorActual.disparo(revolver);
                
                if(mojado){
                   System.out.println("El juego ha terminado. " + jugadorActual + " has perdido.");
                   break;
                }
                indiceJugadorActual = (indiceJugadorActual + 1) % jugadores.size(); 
            //% jugadores.size(): Esto se conoce como el operador módulo. 
            // Lo que hace es obtener el residuo de la división entre el resultado de la suma y el tamaño total 
            //  de la lista de jugadores. Esto es crucial porque después de llegar al último jugador, 
            //   queremos volver al primero en un ciclo circular. El operador % asegura esto, 
            //    ya que cuando el índice llega al tamaño total de la lista, vuelve a 0 (el primer jugador),
            //    continuando así el ciclo
            }
        }
        
}
