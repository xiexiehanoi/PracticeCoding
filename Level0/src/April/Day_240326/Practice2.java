package April.Day_240326;

//실행되는 순서 3
abstract class Vehicle {
    String name;
    //spark가 val로 매개변수로 들어오고
    abstract public String getName(String val);

    public String getName() {
    	//마지막에 여기에 적용된다.
        return "Vehicle name: " + name;
    }
}

//실행되는 순서 2 전달받은 Spark
//상속
class Car extends Vehicle {
    public Car(String val) {
        name = super.name = val;
        //name = spark
    }

    public String getName(String val) {
        return "Car name: " + val;
        // val = spark이다.
    }
}

//실행되는 순서 1 => car메서드로 전달
public class Practice2 {
    public static void main(String[] args) {
        Vehicle obj = new Car("Spark");
        System.out.println(obj.getName());
    }
}
