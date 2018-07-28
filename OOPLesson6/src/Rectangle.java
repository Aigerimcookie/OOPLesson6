public class Rectangle {

    int length;
    int hight;


    void insert(int a, int b){
        length = a;
        hight = b;



    }

    void display(){

        System.out.println("Area: "+(length*hight));
    }
}

class TestRec {

    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.insert(2,3);
        r.display();
    }
}
