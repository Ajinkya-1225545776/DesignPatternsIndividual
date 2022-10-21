import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        ClassProductList real= new ClassProductList();
        for(Iterator iter = real.createIterator(); iter.hasNext();){
            String names=(String)iter.next();
            System.out.println("Class Product List is "+ names);

        }
    }
}