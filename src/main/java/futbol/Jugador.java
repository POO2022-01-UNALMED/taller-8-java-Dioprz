package futbol;

public class Jugador extends Futbolista{

    public short golesMarcados;
    public byte dorsal;

    public Jugador(String nombre, int edad, String posicion, short golesMarcados, byte dorsal){
        super(nombre, edad, posicion);
        this.golesMarcados = golesMarcados;
        this.dorsal = dorsal;
    }

    public Jugador(){
        //super() lo pone el compilador
        this.golesMarcados = 289;
        this.dorsal = 7;
    }

    public int compareTo(Futbolista futbolista){
        return Math.abs(this.edad - futbolista.getEdad());
    }

    public boolean jugarConLasManos(){
        return False;
    }

    public String toString(){
        return "El futbolista " + nombre + " tiene " + edad + " y juega de " + posicion + " con el dorsal " + dorsal + ". Ha marcado " + goles;
    }

}

