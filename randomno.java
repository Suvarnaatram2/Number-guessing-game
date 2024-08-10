import java.util.Scanner;
public class randomno {
   
        public static void main(String[] args) {
            int usernum  ; 
       Scanner sc= new Scanner(System.in);
       
       int  mynum =(int)(Math.random()*100);
      do {
        System.out.println("guess any no ");
         usernum=sc.nextInt();

        if(usernum == mynum){
            System.out.println("correct  no yeeee");
            break;
        }
        else if (usernum> mynum){
            System.out.println(" to greater no ");
        }else{
            System.out.println(" to small no ");
        }
      } while (usernum >= 0);
      System.out.println("my no was:");
      System.out.println(mynum);



    }

    
}
    

