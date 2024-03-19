
import java.util.ArrayList;
import java.util.Scanner;


public class JuegoRuletaRusaMain {

    public static void main(String[] args) {
            // Creo el revolver de agua y lo lleno
            RevolverAgua revolver = new RevolverAgua();
            revolver.llenarRevolver();
            
            // Creo los jugadores
            ArrayList<Jugador> jugadores = new ArrayList<>();
            int numeroDeJugadores = 6; //Numero maximo de jugadores que pueden haber en la partida
            
            // Solicitamos al usuario el número de jugadores entre 1 y 6
            System.out.println("Ingrese el numero de jugadores (entre 1 y 6):");
            
            //Creo el scanner para ver que me pone el usuario
            Scanner leer = new Scanner(System.in);
            
            numeroDeJugadores = leer.nextInt();
            
           if(numeroDeJugadores < 1 || numeroDeJugadores > 6){
               numeroDeJugadores = 6;// Si está fuera del rango, ponemos el 6 por defecto
           }
            
           for (int i = 1; i <= numeroDeJugadores; i++) {
            jugadores.add(new Jugador(i));
           }
           
           // Creo el juego 
            Juego juego = new Juego();
            
            juego.llenarJuego(jugadores, revolver); //Se llenan los jugadores y el revolver tmb

            // Comienza el juego
            juego.ronda();
            
    }
}
