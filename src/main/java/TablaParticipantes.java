import java.util.ArrayList;

public class TablaParticipantes {

        private ArrayList <Participante>tablaparticipantes;
        public TablaParticipantes(){
            tablaparticipantes=new ArrayList<Participante>();
        }
        public void agregarParticipante(Participante nuevo){
            tablaparticipantes.add(nuevo);
        }

    public ArrayList<Participante> getTablaparticipantes() {
        return tablaparticipantes;
    }
}
