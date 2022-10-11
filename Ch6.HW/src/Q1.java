//1번

class MyPoint{
    int x,y;
    public MyPoint(int x, int y){
        this.x=x;
        this.y=y;
    }
    public String toString(){
        String tmp="Point ("+x+","+y+")";
        return tmp;
    }
    public boolean equals(MyPoint c){
        if(c.toString()==this.toString())
            return true;
        else
            return false;

    }


}

public class Q1 {

    public static void main(String[] args){
        MyPoint p= new MyPoint(3,50);
        MyPoint q =new MyPoint(4,50);
        System.out.println(p);
        if(p.equals(q))
            System.out.println("같은 점");
        else
            System.out.println("다른 점");
    }

}
