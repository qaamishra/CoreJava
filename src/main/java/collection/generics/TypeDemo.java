package collection.generics;

import java.util.ArrayList;

public class TypeDemo<AnyDataType extends Number> { //Replace AnyDataType with T

    AnyDataType value;

    public AnyDataType getValue() {
        return value;
    }

    public void setValue(AnyDataType value) {
        this.value = value;
    }

    public void showTheDataType(){
        System.out.println(value.getClass().getName());
    }

    public void printArrayListSuper(ArrayList<? super AnyDataType> arrayList){
        System.out.println("printArrayListSuper  "+arrayList);

    }

    public void printArrayListSuper2(ArrayList<? super Integer> arrayList){
        System.out.println("printArrayListSuper2  "+arrayList);

    }

    public void printArrayListExtends(ArrayList<? extends AnyDataType> arrayList){
        System.out.println("printArrayListExtends"+arrayList);
    }
}
