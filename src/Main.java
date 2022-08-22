import java.util.Arrays;

public class Main {
    static boolean isCheck(int[] array,int value){
        for (int i:array){
            if (i == value){
                return true;
            }
        }
        return false;
    }

    static void repeat(int[] array){
        int index=0,arrayBoundary=0;
        int[] temp=new int[array.length];


         for (int i=0;i< array.length;i++){
            for (int j=0;j < array.length;j++){
               if ((i != j) && array[i] == array[j]){
                   if (!isCheck(temp,array[i])){
                       temp[index++]=array[i];
                       arrayBoundary++;
                   }
               }
        }
     }
        int[] finalArray=new int[arrayBoundary];

        for (int i=0;i<arrayBoundary;i++){
            finalArray[i]=temp[i];
        }
        repeatNumber(finalArray,array);
    }

    static void repeatNumber(int[] finalArray,int[]array){

        for (int i:finalArray){
            int count=0;
            for (int j:array){
                if (i==j){
                    count++;
                }
            }
            System.out.println(i + " Sayısı " + count + " kere tekrar edildi.");
        }
    }

    public static void main(String[] args) {
        int[] array={10,3,-5,9,10,-2,3,10,-5,9,10,-2,5,3,9,10,-2,10};
        repeat(array);

    }
}
