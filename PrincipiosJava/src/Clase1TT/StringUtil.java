package Clase1TT;

public class StringUtil {
    // Retorna una cadena compuesta por n caracteres c
    public static String replicate(char c,int n)
    {
        String cadena = "";
        return lpad(cadena,n,c);
    }

    // Retorna una cadena de longitud n, compuesta por s
    // y precedida de tantos caracteres c como sea necesario
    // para completar la longitud mencionada
    public static String lpad(String s,int n,char c)
    {
        String aux = "";
        for (int i=s.length(); i<n; i++){
            aux = aux.concat(String.valueOf(c));
        }
        s = aux.concat(s);
        return s;
    }

    // Retorna un String[] conteniendo los elementos de arr
    // representados como cadenas de caracteres
    public static String[] toStringArray(int arr[])
    {
        String[] arrayString = new String[arr.length];
        for(int i=0; i<arr.length; i++){
            arrayString[i] = String.valueOf(arr[i]);
        }
        return arrayString;
    }

    // Retorna un String[] conteniendo los elementos de arr
    // representados como cadenas de caracteres
    public static int[] toIntArray(String arr[])
    {
        int[] arrayInt = new int[arr.length];
        for(int i=0; i<arr.length; i++){
            arrayInt[i] = Integer.valueOf(arr[i]).intValue();
        }
        return arrayInt;
    }


    // Retorna la longitud del elemento con mayor cantidad
    // de caracteres del array arr
    public static int maxLength(String arr[])
    {
        int maxElementos = 0;
        for (String elemento: arr) {
            if(elemento.length() > maxElementos){
                maxElementos = elemento.length();
            }
        }
        return maxElementos;
    }

    // Completa los elemento del arr agregando caracteres c
    // a la izquierda, dejando a todos con la longitud del mayor
    public static void lNormalize(String arr[],char c) {
        int cantCaracteres = maxLength(arr);
        for(int i=0; i<arr.length; i++){
            arr[i] = lpad(arr[i],cantCaracteres,'0');
        }
    }
}
