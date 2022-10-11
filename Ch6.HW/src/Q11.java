//11번
import java.util.Scanner;
import java.lang.StringBuffer;
import java.util.StringTokenizer;


public class Q11 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print(">>");
        String str=scanner.nextLine();
        StringBuffer sb=new StringBuffer(str);
        while(true) {
            System.out.print("명령: ");
            String order = scanner.next();
            if(order.equals("그만")) {
                System.out.println("종료합니다");
                break;
            }

            StringBuffer od = new StringBuffer(order);
            StringTokenizer st = new StringTokenizer(order, "!");
            if(st.countTokens()!=2) {
                System.out.println("잘못된 명령입니다!");
                continue;
            }
            String[] token =new String[2];
            token[0]= st.nextToken();
            token[1] = st.nextToken();
            int index=sb.indexOf(token[0]);

            if (str.contains(token[0])) {
                sb.replace(index,index+token[0].length(), token[1]);
                System.out.println(sb);
            }
            else {
                System.out.println("찾을 수 없습니다 !");
            }
        }

    }

}
