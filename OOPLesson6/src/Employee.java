public class Employee {

//    int id;
//    String name;
//    int age;
//
//    void insert (int i, String n, int a){
//
//    id = i;
//    name = n;
//    age = a;
//}
//
//    void display (){
//        System.out.println(id+" "+name+" "+age);
//    }
//}
//
//class TestEmployee{
//
//    public static void main(String[] args) {
//        Employee Tanir = new Employee();
//        Employee Aigerim = new Employee();
//        Employee Dinara = new Employee();
//
//        Tanir.insert(123, "Tanir", 22);
//        Tanir.display();
//        Aigerim.insert(456, "Aigerim", 23);
//        Aigerim.display();
//        Dinara.insert(789, "Dinara", 23);
//        Dinara.display();
//
//
//    }

    int id;
    String name;
    int age;

    Employee (int i, String n, int a) {
        id = i;
        name = n;
        age = a;

    }


        void display (){
            System.out.println(id+" "+name+" "+age);
        }


    public static void main(String[] args) {
        Employee tanir = new Employee(1,"Tanir", 25);

        tanir.display();
    }
}
