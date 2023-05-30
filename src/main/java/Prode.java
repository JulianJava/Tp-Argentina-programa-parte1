import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.*;
import java.util.Locale;
import java.util.Scanner;
public class Prode  {

    public TablaParticipantes prode(String url,String usuario,String contraseña) throws IOException, SQLException {
        Connection conn = DriverManager.getConnection(url,usuario,contraseña);
        Statement st= conn.createStatement();
        ResultSet rs=st.executeQuery("select * from prode");
        TablaParticipantes canParticipantes=new TablaParticipantes();

        while (rs.next()){
       String nombre= rs.getString("Nombre");
       int numeroRonda= rs.getInt("Ronda");
       String nombreeq1= rs.getString("Equipo1");
       String nombreeq2= rs.getString("Equipo2");
       int  resultadoprediccion= Integer.parseInt(rs.getString("Resultado"));

       Participante nuevo=new Participante(nombre,numeroRonda,nombreeq1,nombreeq2,resultadoprediccion);
       canParticipantes.agregarParticipante(nuevo);

        }
rs.close();
conn.close();
return canParticipantes;

    }
    public Rondas ronda1(String Resultados)throws IOException{
        Path archivo2 = Paths.get(Resultados);
        Scanner lector2 = new Scanner(archivo2);
         lector2.useDelimiter("[;\\n\\r]+");
        lector2.useLocale(Locale.forLanguageTag("es-AR"));
        Rondas ronda1=new Rondas();
        while(lector2.hasNextInt()){
            int numeroRondas=lector2.nextInt();
            int goleseq1= lector2.nextInt();
          String EQ1= lector2.next();
          String Eq2=lector2.next();
          int goleseq2= lector2.nextInt();
             Partidos nuevos =new Partidos(numeroRondas,goleseq1,EQ1,Eq2,goleseq2);
             ronda1.agregarPartido(nuevos);}
        lector2.close();
        return ronda1;



    }
}
