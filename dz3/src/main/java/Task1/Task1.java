package Task1;

import Task2.ObjectBox;

public class Task1 {
    public static void main(String[] args) {

        Number n = 5.0;

        Number arr[] = {4.0, 5.0, 6.0};

        MathBox mathBox = new MathBox(arr);
        mathBox.dump();

        mathBox.addObject(n);
        mathBox.dump();

        mathBox.remove(4.0);
        mathBox.dump();

        mathBox.splitter(2.5);
        mathBox.dump();

        //MathBox наследник ObjectBox
        ObjectBox mathBox2 = new MathBox(arr);
        mathBox2.dump();

        Object testObjRight = new Integer(78);
        mathBox2.addObject(testObjRight);
        mathBox2.dump();

//        Проверка на то,что в коробку нельзя положить другой тип данных

//        Object testObjFalse = new Integer("String");
//        mathBox2.addObject(testObjFalse);
//        mathBox2.dump();

        Number arr1[] = {23};
        Number arr2[] = {23};

        MathBox m1 = new MathBox(arr1);
        MathBox m2 = new MathBox(arr2);

        boolean boxes = m1.equals(m2);
        boolean hashes = m1.hashCode() == m2.hashCode();

        System.out.println("MathBoxes равны: " + boxes);
        System.out.println("Хэши MathBoxes равны:" + hashes);

    }
}
