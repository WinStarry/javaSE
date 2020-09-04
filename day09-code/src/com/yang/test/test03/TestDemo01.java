package com.yang.test.test03;

/**
 * @data 2020/9/4 -11:57
 */
public class TestDemo01 {
    public static void main(String[] args) {
//        向上转型
        Animal animal = new Cat();
        animal.eat();

/*//        向下转型
        Cat cat=(Cat)animal;
        cat.sleep();*/

        if(animal instanceof Cat){
            Cat cat1=(Cat)animal;
            cat1.sleep();
        }else if(animal instanceof Dog){
            Dog dog=(Dog)animal;
            dog.run();
        }

        test(animal);
        test(new Dog());
    }

    public static void test(Animal a){
        a.eat();
    }
}
