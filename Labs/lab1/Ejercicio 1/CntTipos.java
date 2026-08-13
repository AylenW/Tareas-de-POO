/* Construya una clase denominada CntTipos que imprima la cantidad parámetros de tipo entero (Integer), real (Double), cadena
(String) o lógico (Boolean) (tenga en cuenta los casos false/true o cualquier combinación de mayúsculas y minúsculas) que se
hayan leído por la línea de comandos.
Para determinar el tipo, intente realizar las conversiones utilizando los métodos provistos por las clases wrapper. Analice qué
excepciones pueden producirse. No intente parsear las expresiones como cadena.
Por ejemplo:
$ java CntTipos 1 2 3 3.5 true False TRUE hola que tal 1e10 NaN Infinity
Imprimir:
Integer: 3
Double: 4
Boolean: 3
String: 3*/
public class CntTipos {
    public static void main(String [] args){
        int cntInteger=0;
        int cntDouble=0;
        int cntBoolean=0;
        int cntString=0;

        for (String arg: args){
            if (esInteger(arg)){
                cntInteger++;
            }else if (esDouble(arg)) {
                cntDouble++;
            }else if (esBoolean(arg)){
                cntBoolean++;
            }else {
                cntString++;
            }
        }

        System.out.println("Integer: " + cntInteger);
        System.out.println("Double: " + cntDouble);
        System.out.println("Boolean: " + cntBoolean);
        System.out.println("String: " + cntString);
    }

    private static boolean esInteger(String arg){
       try{
            Integer.parseInt(arg);
            return true;
       }catch (NumberFormatException e){
            return false;
       }
    }

    public static boolean esDouble (String arg){
        try{
            Double.parseDouble(arg);
            return true;
        }catch (NumberFormatException e){
            return false;
        }
    }

    public static boolean esBoolean(String arg){
        try{
            Boolean.parseBoolean(arg);
            return true;
        }catch (NumberFormatException e){
            return false;
        }
    }
}