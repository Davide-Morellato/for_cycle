public class App {
    public static void main(String[] args) {
        /*
         * CICLO FOR 
         * 
         * array
         * 
         * break & continue
         *          
         * for annidati (usati per gli array 2D)
         */


         /*
          * SINTASSI

            inizializzo il ciclo: for( condizione )
            contatore: int i = 0
            numero di iterazioni: i < x
            incremento/decremento: i++ / i--

            for(int i = 0; i < x; i++){}

          */

        //dichiaro un valore
        int x = 5;

        //inizializzo il ciclo
        for(int i = 0; i < x; i++){
            System.out.println("valore ad ogni iterazione: " + i); //stampo i valori per ogni iterazione (x) del ciclo
        }


        //
        //
        //dichiaro un array
        int[] numbers = {1, 2, 3, 4, 5};

        //ciclo l'array, scorrendolo per tutta la sua lunghezza (length)
        for(int i = 0; i < numbers.length; i++){ 

            int number = numbers[i]; //prendo il singolo elemento

            System.out.println("valore del singolo elemento dell'array: " + number); //stampo i singoli elementi dell'array
        }


        //////////////////////
        //
        // BREAK -> in seguito ad una condizione, permette di interrompere in quel dato momento il ciclo

        int y = 6;

        for(int i = 0; i < y; i++){
            //controllo
            //SE i == 4
                //ALLORA break (interrompi)
            if(i == 4){
                break;
            }

            System.out.println("break: " + i); //stampo i valori fino all'interruzione
        }

        

        /////////////////////
        //
        // CONTINUE -> in seguito ad una condizione, permette di saltare quel punto del ciclo, per poi proseguire

        int z = 7;

        for(int i = 0; i < z; i++){
            //controllo
            //SE i == 2
                //ALLORA continue (salta questo valore e prosegui)
            if(i == 2){
                continue;
            }

            System.out.println("continue: " + i); //stampo i valori saltando quello nella condizione del controllo
        }


        ////////////////////
        //
        // FOR ANNIDATI

        int k = 3;

        //inizializzo il PRIMO ciclo for
        for(int i = 0; i < k; i++){
            System.out.println("Valore primo ciclo: " + i);

            //inizializzo il SECONDO ciclo for (annidato)
            for(int j = 0; j < k; j++){
                System.out.println("Valore secondo ciclo: " + j);
            }
        }

        /* Ciò che verrà stampato in questo caso sarà:
         * 
         * PRIMA ITERAZIONE:
         *  primo ciclo: 0
         *      secondo ciclo: 0
         *      secondo ciclo: 1
         *      secondo ciclo: 2
         * 
         * SECONDA ITERAZIONE:
         *  primo ciclo: 1
         *      secondo ciclo: 0
         *      secondo ciclo: 1
         *      secondo ciclo: 2
         * 
         * TERZA ITERAZIONE:
         *  primo ciclo: 2
         *      secondo ciclo: 0
         *      secondo ciclo: 1
         *      secondo ciclo: 2
         */
    }
}
