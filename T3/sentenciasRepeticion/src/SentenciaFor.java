public class SentenciaFor {

 public void sentenciaFor(){
     //inicial;final;incrementa. EN FINAL SIEMPRE MENOR O MENOR O IGUAL, NUNCA IGUAL
    /* for(int i=0; i<5; i++){
         System.out.println("Ejecutando línea");
     }*/

     //DECREMENTO
     for (int i = 100; i >= 0 ; i--) {

         if (i % 5 == 0){
             System.out.println("Ejecuciones "+i);
         }
         
     }
     
 }

 public void tablaMultiplicarNumero (int numero){
     //tabla del 6
     System.out.println("Procedemos a escribir la tabla de multiplicar del "+numero);

     for (int i = 0; i < 11; i++) {
         System.out.printf("%d * %d = %d%n",i, numero,i*numero); //la D es un número
     }


 }

public void todasTablas(){
     //1-10
    for (int i = 1; i < 11; i++) {

        System.out.println("Sacando la tabla del "+i);
        //1
        for (int j = 0; j < 11; j++) {
            System.out.printf("\t%d * %d = %d%n",j, i, i*j);
        }

    }
}

public void dibujarCuadrado(){

    for (int i = 0; i < 5; i++) { //fila
        for (int j = 0; j < 5; j++) { //columna
            if (i == 0 || i==4) {
                System.out.print("*");
            } else if (j==0 || j==4){
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
        System.out.println();
    }


}


//Sacar 


}
