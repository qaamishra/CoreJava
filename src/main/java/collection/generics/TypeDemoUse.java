package collection.generics;

import java.util.ArrayList;
import java.util.Arrays;

public class TypeDemoUse {
    public static void main(String[] args) {

        TypeDemo<Integer> intObj=new TypeDemo<>();
        intObj.value=9;
        intObj.showTheDataType();

        TypeDemo<Double> doubleObj=new TypeDemo<>();
        doubleObj.value=9.36;
        doubleObj.showTheDataType();

        //Compile time error as TypeDemo<AnyDataType extends Number>  this extends Number so it will accept integer,double
        //TypeDemo<String> stringObj=new TypeDemo<>();
        TypeDemo<Integer> plainObj=new TypeDemo<>();
        ArrayList<Integer> arrayList=new ArrayList<>();
        arrayList.addAll(Arrays.asList(20,30));

        plainObj.printArrayListExtends(arrayList);
        //Compile time error
        //plainObj.printArrayListSuper(arrayList);
        plainObj.printArrayListSuper2(arrayList);

    }
}
