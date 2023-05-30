public class Partidos {
    private int numeroRondas;
    private int golesEq1;
    private String eq1;
    private String eq2;
    private int golesEq2;
    private int resultado;
  Partidos(int numeroRondas,int golesEq1,String eq1,String eq2,int golesEq2){
     this.numeroRondas=numeroRondas;
      this.golesEq1=golesEq1;
      this.eq1=eq1;
      this.eq2=eq2;
      this.golesEq2=golesEq2;
  }

    public int resultadoPartido() {
       if(golesEq1>golesEq2){
           resultado=1;
       }
       if (golesEq2>golesEq1){
           resultado=2;
       }
       if (golesEq1==golesEq2){
           resultado=0;
       }

        return resultado;
    }

    public int getNumeroRondas() {
        return numeroRondas;
    }
}



