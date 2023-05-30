
import java.io.IOException;
import java.sql.SQLException;
import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) throws IOException, SQLException {
        Prode p = new Prode();
        TablaParticipantes canparticipantes = p.prode("jdbc:mysql://localhost/Prode006", "root", "spiderdance1");
        Rondas rondas1 = p.ronda1("C:\\Users\\Equipo\\IdeaProjects\\Trabajo Practico argentina programa\\src\\main\\resources\\resultados.csv.txt");
        int jugadorGanador = 0;
        int partidos = 0;
        int aciertos = 0;
        String ganador = "  ";
        for (int i = 0; i < canparticipantes.getTablaparticipantes().size(); i++) {
            if (partidos > rondas1.getPartidos().size() - 1) {
                if (aciertos > jugadorGanador) {
                    ganador = canparticipantes.getTablaparticipantes().get(i - 1).getNombre();
                }
                System.out.println(canparticipantes.getTablaparticipantes().get(i - 1).getNombre() + "  " + "obtuvo" + "  " + aciertos);
                partidos = 0;
                aciertos = 0;
            }
            if (canparticipantes.getTablaparticipantes().get(i).getResultadoPrediccion() == rondas1.getPartidos().get(partidos).resultadoPartido()) {
                aciertos++;
            }
            partidos++;

        }
        System.out.println("la persona que gano es " + ganador);
    }
}
