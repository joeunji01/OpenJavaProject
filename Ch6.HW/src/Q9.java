//9번
import java.util.Scanner;
import java.util.Random;

public class Q9 {

    public static String str(int i){
        switch (i){
            case 1:
                return "가위";
            case 2:
                return "바위";
            case 3:
                return "보";
            default:
                return "다시";
        }
    }

    public static void main(String[] args){
        Scanner scanner =new Scanner(System.in);
        while (true) {
            System.out.print("철수[가위(1), 바위(2), 보(3), 끝내기 4]>> ");
            int u=scanner.nextInt();
            int c=(int)(Math.random()*3+1);
            if(u==4)
                System.exit(0);
            System.out.println("철수("+str(u)+") : 컴퓨터("+str(c)+")");
            if(u==1&&c==3||u==2&&c==1||u==3&&c==2){
                System.out.println("철수가 이겼습니다.");
            }
            else if(u==c){
                System.out.println("비겼습니다.");
            }
            else{
                System.out.println("컴퓨터가 이겼습니다.");
            }
        }

    }


}
