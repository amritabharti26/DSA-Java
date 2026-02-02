package Array;

public class MergeTwoSortedArray {
    public static void main(String[] args) {
        int [] a ={1,3,5,6};
        int [] b ={4,7,8,9};
        int [] c = new int[a.length+b.length];
        for (int ele : c){
            System.out.print(ele+" ");
        }
        System.out.println();

        merge(c,a,b); // merge method call

        for (int ele : c){
            System.out.print(ele+" ");
        }
    }
    public static void merge(int[] c, int[] a, int[] b){
        int i =0, j=0, k=0; // tin pointer
        while(i<a.length && j<b.length){
            if(a[i]<b[j]){
                c[k++]=a[i++]; //1st way : pahle k me ith elem fill hua then dono bad gya
            }
            else c[k++]=b[j++];
        }
        while(j< b.length){ // a array khatam -> b ke  bache hue ele lo
            c[k++] = b[j++];
        }
        while(i< a.length){// b array khatam -> a ke  bache hue ele lo
            c[k++] = a[i++];
        }


    }
}
