import java.util.ArrayList;



public class Rondas {
    private ArrayList <Partidos>partidos;
public Rondas(){
    partidos=new ArrayList<Partidos>();
}
public void agregarPartido(Partidos nuevo){
    partidos.add(nuevo);
}

    public ArrayList<Partidos> getPartidos() {
        return partidos;
    }
}
