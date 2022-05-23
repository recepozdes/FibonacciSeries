import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int count=0,sum=0,sum1=1,temp;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Kaç elemanlı bir fibonacci dizisi oluşturulsun : ");
        int n = scanner.nextInt();
        do{
            if(count==0){
                System.out.print(sum+" ");
            }else if(count==1) {
                System.out.print(sum1 + " ");
            }
            else{
                temp=sum1;
                sum1=sum1+sum;
                sum=temp;
                System.out.print(sum1+" ");
            }


            count++;

        }while(count<n);


    }
}
