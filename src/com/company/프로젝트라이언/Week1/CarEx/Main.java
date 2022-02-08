package CarEx;


import java.util.ArrayList;
import java.util.*;
public class Main {
    public static void main(String[] args) {
//        Driver unlicensed = new Driver("unlinensed", 0);

        Driver me = new Driver("me", 1);
        CarInterface car = new GoCart();
        car.setDriver(me);

        car = new SmallCar();
        car.setDriver(me);

        CarInterface anotherCar = new SmallCar();
        anotherCar.setDriver(me);

        ArrayList<CarInterface> arrayList = new ArrayList();
        Road route88 = new Road(arrayList);

        route88.addCar(car);
        route88.addCar(anotherCar);

        System.out.println(route88.toString());

    }
}
