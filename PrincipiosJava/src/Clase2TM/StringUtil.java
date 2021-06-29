package Clase2TM;

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

    public static String rpad(String s, char c, int n){
        for (int i=s.length(); i<n; i++){
            s = s.concat(String.valueOf(c));
        }
        return s;
    }

    public static String ltrim(String s){
        int len = s.length();
        int st = 0;
        while ((st < len) && (s.charAt(st) <= ' ')) {
            st++;
        }
        return s.substring(st);
    }

    public static String rtrim(String s){
        int len = s.length();
        int st = 0;
        while ((st < len) && (s.charAt(len-1) <= ' ')) {
            len--;
        }
        return s.substring(st,len);
    }

    public static String trim(String s){
       s = ltrim(s);
       s = rtrim(s);
       return s;
    }

    public static int indexOfN(String s,char c,int n){
        int index = -1;
        int contador = 0;
        while( n != 0 && contador < s.length()){
            if(c == s.charAt(contador)){
                index = contador;
                n--;
            }
            contador++;
        }
        return index;
    }

}
