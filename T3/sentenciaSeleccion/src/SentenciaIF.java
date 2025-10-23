public class SentenciaIF {

    public void examenAprobado(int nota){

        System.out.println("Procedemos a evaluar si un examen está aprobado");
        System.out.println("La nota que vamos a evaluar es "+nota);
        if(nota>=5){
            System.out.println("El examen está aprobado");
        } else {
            System.out.println("El examen está suspenso");
        }
        System.out.println("Terminando la evaluación del examen");
        System.out.println("Programa finalizado");


    }

    public void notaExamen(int nota){

        //suspenso - 0-4.99
        //aprobado - 5-7.99
        //notable - 8-8.99
        //sobresaliente - 9-9.99
        //MH - 10
        String resultadoExamen;
        if (nota>0 && nota<=10) {
            if (nota<5) {
                //System.out.println("El examen está suspenso");
                resultadoExamen="suspenso";
            } else if (nota < 8) {
                //System.out.println("El examen está aprobado");
                resultadoExamen="aprobado";
            } else if (nota < 9) {
              //  System.out.println("El examen es notable");
                resultadoExamen="notable";
            } else if (nota < 10) {
                //System.out.println("El examen es sobresaliente");
                resultadoExamen="sobresaliente";
            } else {
                //System.out.println("El examen es matricula");
                resultadoExamen="MH";
            }
        } else {
            //System.out.println("La nota no está en la escala correcta");
            resultadoExamen = "Fuera de rango";
        }

        System.out.println(resultadoExamen);
    }

}

