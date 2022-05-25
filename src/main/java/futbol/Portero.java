package futbol;

public class Portero extends Futbolista{

    public short golesRecibidos;
    public byte dorsal;

    public Portero(String nombre, int edad, String posicion, short golesRecibidos, byte dorsal){
        super(nombre, edad, "Portero");
        this.golesRecibidos = golesRecibidos;
        this.dorsal = dorsal;
    }
     
    public String toString(){
        return "El futbolista " + nombre + " tiene " + edad + " y juega de " + posicion + " con el dorsal " + dorsal + ". Le han marcado " + goles;
    }

    public boolean jugarConLasManos(){
        return True;
    }

    public int compareTo(Portero portero){
        return Math.abs(this.golesRecibidos - portero.golesRecibidos());
    }

}

