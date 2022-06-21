package Lesson12;

public class Car12 {
    int engine;
    int doorCount;

    Car12 (int engine, int doorCount) {
        this.engine = engine;
        this.doorCount = doorCount;
    }
}

class CarTest {
    public static void main(String[] args) {
        Car12 c1 = new Car12(5, 4);
        Car12 c2 = new Car12(3, 5);

        if (c1.engine > c2.engine){
            if (c1.doorCount> c2.doorCount){
                System.out.println("Mo6nost Dvigatela i kolvo dverey u 1 ma6iny bol6e");
            } else  {
                System.out.println("motor u 1 ma6iny mo6nee a dverey men6e");
            }
        }  else {
            System.out.println("mo6nost motora u 1 ma6iny men6e");
        }
    }
}
