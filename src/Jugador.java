
public class Jugador {
        private int id;
        private String nombre;
        private boolean mojado;

    public Jugador(int id) {
        this.id = id;
        this.nombre = "Jugador " + id;
        this.mojado = false;
    }
        
    public boolean disparo(RevolverAgua revolver){
        System.out.println(nombre + " se apunta con el revolver!");
        System.out.println("");
        revolver.siguienteChorro();
        if(revolver.mojar()){
            mojado = true;
            System.out.println("Mala suerte, " + nombre + " perdiste, has sido mojado");
            System.out.println("");
            return true;
        }else{
            System.out.println("Uffff, " + nombre + " te salvaste!");
            System.out.println("");
            return false;
        }
    }
    
    public boolean estaMojado() {
        return mojado;
    }

    public String toString() {
        return nombre;
    }
        
}
