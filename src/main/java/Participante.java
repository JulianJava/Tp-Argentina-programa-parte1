import java.util.ArrayList;

public class Participante {
   private int numeroRonda;
    private String nombre;
    private String nombreEquipo1;
    private String nombreEquipo2;
    private int resultadoPrediccion;

    Participante( String nombre,int numeroRonda,String nombreEquipo1,String nombreEquipo2,int resultadoPrediccion){
        this.nombre=nombre;
        this.numeroRonda=numeroRonda;
        this.nombreEquipo1=nombreEquipo1;
        this.nombreEquipo2=nombreEquipo2;
        this.resultadoPrediccion=resultadoPrediccion;

    }

    public String getNombre() {
        return nombre;
    }


    public int getResultadoPrediccion() {
        return resultadoPrediccion;
    }

    public String getNombreEquipo1() {
        return nombreEquipo1;
    }

    public String getNombreEquipo2() {
        return nombreEquipo2;
    }

    public int getNumeroRonda() {
        return numeroRonda;
    }
}
