package Lesson24AbstractDefaultStaticMethods;

public class Test2 {
    public static void main(String[] args) {
//     *   Figura f = new Figura();
        Figura f1 = new Kvadrat();
        System.out.println(f1.kolichestvoStoron);//0 --> f1 Figura --> kolvo storon = 0
        f1.ploshad();//100
    }
}
//abcstract
/* у абстрактного метода нет тела
   невозможео создать обьект абстрактного класса *
   если в классе есть абстракт метод то этот класс тоже должен быть абстракт
   абстракт класс может содержать или не сожержать абстрактные методы
   дочерний класс должен перезаписать все абстракт методы родительского класса или тоже быть абстракт
   Можно использовать reference variable abstract класса чтобы ссылатся на обьект дочернего
   класса который не является abstract
   abstract класс не может быть final
   переменные не могут быть abstract
   у abstract классов могут быть конструкторы
   любой перезаписанный метод может быть как abstract так и не abstract
   нельзя писать для методов final,static,private.
   abstract класс может extend конкретный класс
   класс extend конкретный класс может не перезаписывать методы предка конкретного класса
 */
abstract class Figura {
//    Figura(int kolichestvoStoron){
//        this.kolichestvoStoron = kolichestvoStoron;
//    }
    int kolichestvoStoron = 0;
   abstract void perimetr();
   abstract void ploshad();
   void showInfo(){
       System.out.println("eto figura");
   }
}

 class Kvadrat extends Figura {
    int kolichestvoStoron = 4;
    int storona1  = 10;

//    Kvadrat(int kolichestvoStoron) {
//        super(kolichestvoStoron);
//        this.kolichestvoStoron = kolichestvoStoron;
//    }
//     public abstract void perimetr();
    @Override
    public  void perimetr() {
        System.out.println("perimetr kvadrata = " + 4 * storona1);
    }

    public void ploshad () {
        System.out.println("ploshad kvadrata = " + storona1 * storona1);
    }
}

class Pryamougolnik extends Figura {
    int kolichestvoStoron = 4;
    int storona1  = 8;
    int storona2  = 5;

//    Pryamougolnik(int kolichestvoStoron) {
//        super(kolichestvoStoron);
//        this.kolichestvoStoron = kolichestvoStoron;
//    }

    @Override
    public void perimetr() {
        System.out.println("perimetr pramougolnika = " + 2 * (storona1 + storona2));
    }

    public void ploshad () {
        System.out.println("ploshad pramougolnika = " + storona1 * storona2);
    }
}

class Okrujnost extends Figura {
    int kolichestvoStoron = 0;
    int radius  = 3;

//    Okrujnost(int kolichestvoStoron) {
//        super(kolichestvoStoron);
//        this.kolichestvoStoron = kolichestvoStoron;
//    }

    @Override
    public void perimetr() {
        System.out.println("perimetr kruga = " + 2 * 3.14 * radius);
    }

    public void ploshad () {
        System.out.println("ploshad kruga = " + 3.14 * radius * radius);
    }
}
//у абстракт класса тоже может быть абстракт сабкласс
abstract class ChetirexUgolnik extends Figura {
//    ChetirexUgolnik(int kolichestvoStoron) {
//        super(kolichestvoStoron);
//        this.kolichestvoStoron = kolichestvoStoron;
//    }

    void def() {
        System.out.println("eto chetirexUgolnik");
    }
}