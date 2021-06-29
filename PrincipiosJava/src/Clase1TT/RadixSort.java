package Clase1TT;

import java.util.ArrayList;

public class RadixSort {

    public static void radixSort(int []arr)
    {
        String [] arrayString = StringUtil.toStringArray(arr);  //Point One -> Convert array to String
        int maxElementSize = StringUtil.maxLength(arrayString); //Get maxLength
        StringUtil.lNormalize(arrayString,'0'); //Point two -> Cast length element array
        for(int i=1; i<=maxElementSize; i++) { // Point six -> Repeat points 3 to 6 (Repeat for maxLength)
            ArrayList<ArrayList<String>> buckets = new ArrayList<>();//initialize a structure iterate
            for (int j = 0; j < 10; j ++) {
                buckets.add(new ArrayList<>()); //Point three -> Generate l0 to l9.
            }
            for (String valor : arrayString) { //iterate all de elements
                int index = Character.getNumericValue(valor.charAt(valor.length() - i)); //get the index for l0 ... l9
                buckets.get(index).add(valor);
                // Point Four -> loop element and add to l0...l9 by index (last, before last, etc)
            }
            int iterable = 0; // define iterable to set values in the origin array
            for(ArrayList<String> array: buckets){
                for(String element: array){
                    arrayString[iterable] = element;
                    iterable++;
                    // Point five -> loop l0...l9 and add to Origin array
                }
            }
        }
        int[] aux = StringUtil.toIntArray(arrayString);
        System.arraycopy(aux, 0, arr, 0, aux.length);
    }

    public static void main(String[] args)
    {
        int[] arr = {16223,898,13,906,235,23,9,1532,6388,2511,8};
        radixSort(arr);

        for(int i=0; i<arr.length;i++)
        {
            System.out.print(arr[i]+(i<arr.length-1?",":""));
        }
    }

}
