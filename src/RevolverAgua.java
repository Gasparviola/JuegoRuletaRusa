
import java.util.Random;


public class RevolverAgua {
    
        //Estas dos posiciones, se generarán aleatoriamente
        private int posicionActualTambor; //(Posición del tambor que se dispara, puede que esté el agua o no)
        private int posicionAgua; //(La posición del tambor donde se encuentra el agua)

        public RevolverAgua() {
            this.posicionActualTambor = posicionActualTambor;
            this.posicionAgua = posicionAgua;
        }
        

        public int getPosicionActualTambor() {
            return posicionActualTambor;
        }

        public void setPosicionActualTambor(int posicionActualTambor) {
            this.posicionActualTambor = posicionActualTambor;
        }

        public int getPosicionAgua() {
            return posicionAgua;
        }

        public void setPosicionAgua(int posicionAgua) {
            this.posicionAgua = posicionAgua;
        }
        
        
        public void llenarRevolver(){
            Random rand = new Random();
            posicionActualTambor = rand.nextInt(6);
            posicionAgua = rand.nextInt(6);
        }
        
        public boolean mojar(){
            return posicionAgua == posicionActualTambor;
        }

        public void siguienteChorro(){
            posicionActualTambor = (posicionActualTambor + 1) % 6;
        }
        
        public String toString(){
            return "Posicion actual: " + posicionActualTambor + ", Posicion del agua: " + posicionAgua;
        }
           
}
