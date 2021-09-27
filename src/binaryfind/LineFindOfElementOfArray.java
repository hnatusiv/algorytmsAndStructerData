package binaryfind;

public class LineFindOfElementOfArray {
    public static void main(String[] args) {
        int[]arrayLine= {56,87,4,5,6,0,4,2,12,76,345,654,23,-98};
        int k=11;
        System.out.println("Index k in arrayLine  =  " + findLine(arrayLine,k));
    }
  //O(n)
    private static int findLine(int[] arrayLine , int k) {
        for (int i = 0; i < arrayLine.length; i++) {
            if (arrayLine[i]==k)
                return i;

        }
        return -1;
    }
}
