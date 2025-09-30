import java.util.*;
public class Hero_villian {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int villian=sc.nextInt();
        int heros=sc.nextInt();
        int strengthHero=sc.nextInt();
        int[] arr=new int[villian];
        int sum=0;
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
            sum+=arr[i];
        }
        if(sum>strengthHero*heros){
            int newSum=0;
            int idx=0;
            int total=strengthHero*heros;;
            int capacity=strengthHero*heros;
            for(int i=arr.length-1;i>=0;i--){
                if(arr[i]<total){
                    idx=i;
                    newSum+=arr[i];
                    total-=arr[i];
                }
                if(newSum==capacity){
                    System.out.println(i);
                    return;
                }

            }
            System.out.println(idx);
            
        }
        else{
            System.out.println(0);
        }
        sc.close();
        
    }
}
