package CW.cw10;

public class Main {
    public static void main(String[] args) {
        Employee john = convertToEmployee("1;John;Smith;2");
        System.out.println(john);
    }
private static Employee convertToEmployee(String str){
    String[] strings = str.split(";");
    return new Employee(Integer.parseInt(strings[0]),strings[1],strings[2],Integer.parseInt(strings[3]));
}
}

