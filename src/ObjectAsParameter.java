


 class Test{
    int a;
    int b;

    Test(int a,int b){
        this.a=a;
        this.b=b;
    }

    Boolean equalto(Test o){
        if(o.a==a && o.b==b)
        return true;
        else
        return false;
    }
 }
public class ObjectAsParameter {

    public static void main(String[] args) {
        Test ob1 = new Test(2,6);
        Test ob2 = new Test(2,6);
        Test ob3 = new Test(0,3);

        System.out.println("ob1==ob2: " + ob1.equalto(ob2));
        System.out.println("ob1==ob3: " + ob1.equalto(ob3));
        
    }
}