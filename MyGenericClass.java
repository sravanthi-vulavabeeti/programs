class MyGenericClass<T> {
    private T data;

    public MyGenericClass(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }
}


class MyGenericMethods {
    public static <T> void printData(T data) {
        System.out.println("Data: " + data);
    }
}

public class Main {
    public static void main(String[] args) {
        
        MyGenericClass<Integer> intObj = new MyGenericClass<>(10);
        System.out.println("Integer data: " + intObj.getData());

        MyGenericClass<String> strObj = new MyGenericClass<>("Hello");
        System.out.println("String data: " + strObj.getData());

        
        MyGenericMethods.printData(20);
        MyGenericMethods.printData("World");
    }
}