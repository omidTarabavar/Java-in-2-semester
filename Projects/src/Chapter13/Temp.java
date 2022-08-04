package Chapter13;


import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;

import java.util.ArrayList;

public class Temp {

    public static void main(String[] args) {
        Integer a = 20;
        SimpleGenericClass<Integer> integerSimpleGenericClass = new SimpleGenericClass<>();
        integerSimpleGenericClass.setValue(20);
        method(integerSimpleGenericClass);
    }
    static void method(SimpleGenericClass<? extends Number> genericClass){
        System.out.println(genericClass.getValue());
    }
}
