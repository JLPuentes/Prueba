import java.util.Scanner;
/**
 * A501 Reutilització de funcions, trobaTemperaturaMinima
 * @author Jose Luis Puentes Jimenez
 */
public class TrobarTemperaturaMinima {
    
    public static void main(String[] args){
        //Declarem el mètode principal en una funció secundaria.
        TrobarTemperaturaMinima programa = new TrobarTemperaturaMinima();
        programa.trobaTemperaturaMinima();
    
    }
    //Funció demana la entrada de temperatures i mostra la més baixa.
    private void trobaTemperaturaMinima() {
        //Demanem el nombre de temperatures ha entrar.
        int mida = (int) demanaNumero("Quantes temperatures vols omplir?");
        //Demanem que s'entri cada una de les temperatures.
        float[] temperatures = demanaNumsIGuardaAlArray("Entra el valor de les temperatures", mida);
        //Busquem la temperatura mínima.
        float minima = buscaMinim(temperatures);
        //Mostrem la temperatura mínima.
        System.out.println("La Temperatura mínima es: " + minima);
    }
    //Funció que demana i retorna un float, 
    //amb un missatge pasat per parèmetre que mostra per pantalla
    private float demanaNumero(String missatge){
        Scanner scanner = new Scanner(System.in);
        System.out.println(missatge);
        return scanner.nextFloat();
        
    }
    //Funció que mostrarà un missatge i crearà un array d'enters
    //passats per parametre. Després ens demanara entrar un float per 
    //cada posició del array. Ens retornarà el array omplert amb les dades entrades.
    private float[] demanaNumsIGuardaAlArray(String missatge, int midaArray){
        float[] arrayFloat = new float[midaArray];
        System.out.println(missatge);
        
        for (int i = 0; i < arrayFloat.length; i++){
            missatge = "Temperatura "+ (i+1) + ": ";
            arrayFloat[i] = demanaNumero(missatge);
        }
        return arrayFloat;
    }
    //Funció que retorna el numero mínim que hi ha dintre del array.
    private float buscaMinim(float[] arrayNums){
        int posMin = 0;
        for (int i = 1; i < arrayNums.length; i++){
            if (arrayNums[posMin] > arrayNums[i]){
                posMin = i;
            }
        }
        return arrayNums[posMin];
    }
    
}
