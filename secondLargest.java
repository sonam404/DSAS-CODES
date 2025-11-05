package array.annonymus;

public class secondLargest {
    public static void main(String arg[]){
        int[] a=new int[]{10,4,7,13,2,9,8};
        int Smax=-1;
        int Max=-1;
        for(int i=0;i<a.length;i++){
            if(a[i]>Max){
                 Smax=Max;
                Max=a[i];
            }
            else if(a[i]>Smax && a[i]!=Max){
                Smax=a[i];
            }
        }System.out.println("MAX="+Max+"    "+"Smax="+Smax);

    }
}
