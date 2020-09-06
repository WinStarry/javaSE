# day13-02-notes

## 主要内容

- Collection集合
- 迭代器
- 增强for
- 泛型

## 学习目标

- 能够说出集合与数组的区别

- 说出Collection集合的常用功能

- 能够使用迭代器对集合进行取元素

- 能够说出集合的使用细节

- 能够使用集合存储自定义类型

- 能够使用foreach循环遍历集合

- 能够使用泛型定义集合对象

- 能够理解泛型上下限

- 能够阐述泛型通配符的作用



# 第一章 Collection集合

## 1.1 集合概述

**集合**：集合是```java```中提供的一种容器，可以用来存储多个数据。

集合和数组既然都是容器，它们的区别是：

* 数组的长度是固定的。集合的长度是可变的。
* 数组中存储的是同一类型的元素，可以存储基本数据类型值。集合存储的都是对象。而且对象的类型可以不一致。在开发中一般当对象多的时候，使用集合进行存储。

学习集合的目标：

1. 会使用集合存储数据
2. 会遍历集合，把数据取出来
3. 掌握每种集合的特性

## 1.2  集合框架

```javaSE```提供了满足各种需求的```API```，在使用这些```API```前，先了解其继承与接口操作架构，才能了解何时采用哪个类，以及类之间如何彼此合作，从而达到灵活应用。

集合按照其存储结构可以分为两大类，分别是单列集合`java.util.Collection`和双列集合`java.util.Map`。

* **Collection**：单列集合类的根接口，用于存储一系列符合某种规则的元素，它有两个重要的子接口，分别是`java.util.List`和`java.util.Set`。其中，`List`的特点是元素有序、元素可重复。`Set`的特点是元素无序，而且不可重复。`List`接口的主要实现类有`java.util.ArrayList`和`java.util.LinkedList`，`Set`接口的主要实现类有`java.util.HashSet`和`java.util.TreeSet`。

![集合框架的介绍](https://img2020.cnblogs.com/blog/1338161/202009/1338161-20200906173908795-1534032926.png)

集合本身是一个工具，它存放在```java.util```包中。在`Collection`接口定义着单列集合框架中最最共性的内容。

集合框架的学习方式：

1. 学习顶层：学习顶层接口/抽象类中共性的方法，所有子类都可以使用。
2. 使用底层：顶层不是接口就是抽象类，无法创建对象使用，需要使用底层的子类创建对象使用。

## 1.3 Collection 常用功能

```Collection```是所有单列集合的父接口，因此在```Collection```中定义了单列集合(```List```和```Set```)通用的一些方法，这些方法可用于操作所有的单列集合。方法如下：

* `public boolean add(E e)`：  把给定的对象添加到当前集合中 。
* `public void clear()` :清空集合中所有的元素。
* `public boolean remove(E e)`: 把给定的对象在当前集合中删除。
* `public boolean contains(E e)`: 判断当前集合中是否包含给定的对象。
* `public boolean isEmpty()`: 判断当前集合是否为空。
* `public int size()`: 返回集合中元素的个数。
* `public Object[] toArray()`: 把集合中的元素，存储到数组中。

方法演示：

~~~java
package com.yang.demo.demo01;

/*
    java.util.Collection接口
        所有单列集合的最顶层接口，里面定义了所有单列集合共性的方法。
        任意单列集合都可以使用Collection接口中的方法

    共性的方法：
        public boolean add(E e)：  把给定的对象添加到当前集合中。
        public void clear() :清空集合中所有的元素。
        public boolean remove(E e): 把给定的对象在当前集合中删除。
        public boolean contains(E e): 判断当前集合中是否包含给定的对象。
        public boolean isEmpty(): 判断当前集合是否为空。
        public int size(): 返回集合中元素的个数。
        public Object[] toArray(): 把集合中的元素，存储到数组中。

 */

import java.util.ArrayList;
import java.util.Collection;

/**
 * 使用Collection接口中的方法
 */
public class Demo01Collection {
    public static void main(String[] args) {
        //创建集合对象，可以使用多态
        Collection<String> coll = new ArrayList<>();
        System.out.println(coll);//[] 打印的不是地址，说明重写了toString()方法

        /*
            public boolean add(E e)：  把给定的对象添加到当前集合中。
            返回值是一个boolean值，一般都返回true，所以可以不用接受。
         */
        boolean b1=coll.add("张三");
        System.out.println("b1:"+b1);//b1:true
        System.out.println(coll);//[张三]
        coll.add("李四");
        coll.add("王五");
        coll.add("赵六");
        coll.add("田七");
        System.out.println(coll);//[张三, 李四, 王五, 赵六 , 田七]

        /*
            public boolean remove(E e): 把给定的对象在当前集合中删除。
            返回值是一个boolean值，
                集合中存在元素，删除元素，返回true
                集合中不存在元素，删除失败，返回false
         */
        boolean b2 = coll.remove("赵六");
        System.out.println("b2:"+b2);//b2:true
        boolean b3 = coll.remove("赵四");
        System.out.println("b3:"+b3);//b3:false
        System.out.println(coll);//[张三, 李四, 王五, 田七]

        /*
            public boolean contains(E e): 判断当前集合中是否包含给定的对象。
            包含返回 true
            不包含返回false
         */
        boolean b4 = coll.contains("李四");
        System.out.println("b4:"+b4);//b4:true


        /*
            public boolean isEmpty(): 判断当前集合是否为空。
            集合为空返回true，集合不为空返回false
         */
        boolean b6 = coll.isEmpty();
        System.out.println(b6);

        /*
            public int size(): 返回集合中元素的个数。

         */
        int size = coll.size();
        System.out.println("size:"+size);//size:4

        /*
            public Object[] toArray(): 把集合中的元素，存储到数组中
         */
        Object[] objects = coll.toArray();
        for (int i = 0; i < objects.length; i++) {
            System.out.println(objects[i]);
        }

        /*
            public void clear() :清空集合中所有的元素。但是不删除集合，集合还存在！
         */
        coll.clear();
        System.out.println(coll);//[]
    }
}

~~~

> tips: 有关`Collection`中的方法可不止上面这些，其他方法可以自行查看API学习。

# 第二章 Iterator迭代器

## 2.1 Iterator接口

在程序开发中，经常需要遍历集合中的所有元素。针对这种需求，JDK专门提供了一个接口`java.util.Iterator`。`Iterator`接口也是Java集合中的一员，但它与`Collection`、`Map`接口有所不同，`Collection`接口与`Map`接口主要用于存储元素，而`Iterator`主要用于迭代访问（即遍历）`Collection`中的元素，因此`Iterator`对象也被称为迭代器。

想要遍历`Collection`集合，那么就要获取该集合迭代器完成迭代操作，下面介绍一下获取迭代器的方法：

* `public Iterator iterator()`: 获取集合对应的迭代器，用来遍历集合中的元素的。

迭代的概念：

* **迭代**：即`Collection`集合元素的通用获取方式。在取元素之前先要判断集合中有没有元素，如果有，就把这个元素取出来，继续在判断，如果还有就再取出出来。一直把集合中的所有元素全部取出。这种取出方式专业术语称为迭代。

Iterator接口的常用方法如下：

* `public E next()`:返回迭代的下一个元素。
* `public boolean hasNext()`:如果仍有元素可以迭代，则返回 true。

```Iterator```迭代器的使用：

~~~java
package com.yang.demo.demo02Iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 *迭代器的使用
 */
public class Demo01Iterator {
    public static void main(String[] args) {
        //创建一个集合对象
        Collection<String> coll=new ArrayList<>();
        //向集合中添加元素
        coll.add("中国 ");
        coll.add("美国");
        coll.add("英国");
        coll.add("法国");

        /*
          1.使用Collection集合中的iterator()方法获取迭代器的实现类对象，使用Iterator接口接收（多态）。
          注意：
              Iterator接口也是有泛型的，迭代器的泛型接口跟着集合走，集合是什么泛型，迭代器就是什么泛型。
         */

        //多态 接口         实现类对象
        Iterator<String> it =coll.iterator();

        /*//2.使用Iterator接口中的hasNext()方法去判断还有没有下一个元素。
        boolean b = it.hasNext();
        System.out.println(b);

        //3.使用Iterator接口中的next()方法获取集合中的下一个元素。
        String s = it.next();
        System.out.println(s);*/

        //简化后的代码
        while(it.hasNext()){
            String s = it.next();
            System.out.println(s);
        }
    }
}
~~~

> tips: 在进行集合元素取出时，如果集合中已经没有元素了，还继续使用迭代器的next方法，将会发生```java.util.NoSuchElementException```没有集合元素的错误。

## 2.2 迭代器的实现原理

我们在之前案例已经完成了```Iterator```遍历集合的整个过程。当遍历集合时，首先通过调用t集合的```iterator()```方法获得迭代器对象，然后使用```hashNext()```方法判断集合中是否存在下一个元素，如果存在，则调用```next()```方法将元素取出，否则说明已到达了集合末尾，停止遍历元素。

```Iterator```迭代器对象在遍历集合时，内部采用指针的方式来跟踪集合中的元素，

在调用```Iterator```的```next()```方法之前，迭代器的索引位于第一个元素之前，不指向任何元素，当第一次调用迭代器的```next()```方法后，迭代器的索引会向后移动一位，指向第一个元素并将该元素返回，当再次调用```next()```方法时，迭代器的索引会指向第二个元素并将该元素返回，依此类推，直到```hasNext()```方法返回```false```，表示到达了集合的末尾，终止对元素的遍历。

## 2.3 增强for

增强`for`循环(也称`for each`循环)是**JDK1.5**以后出来的一个高级`for`循环，专门用来遍历数组和集合的。它的内部原理其实是个`Iterator`迭代器，所以在遍历的过程中，不能对集合中的元素进行增删操作。

格式：

~~~java
for(元素的数据类型  变量 : Collection集合or数组){ 
  	//写操作代码
}
~~~

增强for循环用于遍历Collection和数组。通常只进行遍历元素，不要在遍历的过程中对集合元素进行增删操作。

#### 遍历数组

~~~java
//使用增强for循环遍历数组
    private static void demo01() {
        int[] arr = {1, 2, 3, 4, 5};
        for (int i : arr) {
            System.out.println(i);
        }
    }
~~~

#### 遍历集合

~~~java
//使用增强for循环遍历集合
    private static void demo02(){
        ArrayList<String> list=new ArrayList<>();
        list.add("hello");
        list.add("world");
        list.add("java");
        list.add("python");

        for (String s : list) {
            System.out.println(s);
        }
    }
~~~

> tips: 新`for`循环必须有被遍历的目标。目标只能是`Collection`或者是数组。新式`for`仅仅作为遍历操作出现。

# 第三章 泛型

## 3.1  泛型概述

集合中是可以存放任意对象的，只要把对象存储集合后，那么这时他们都会被提升成`Object`类型。当我们在取出每一个对象，并且进行相应的操作，这时必须采用类型转换。

观察下面代码：

~~~java
public class GenericDemo {
	public static void main(String[] args) {
		Collection coll = new ArrayList();
		coll.add("abc");
		coll.add("itcast");
		coll.add(5);//由于集合没有做任何限定，任何类型都可以给其中存放
		Iterator it = coll.iterator();
		while(it.hasNext()){
			//需要打印每个字符串的长度,就要把迭代出来的对象转成String类型
			String str = (String) it.next();
			System.out.println(str.length());
		}
	}
}
~~~

程序在运行时发生了问题**```java.lang.ClassCastException```**。                                                                                             为什么会发生类型转换异常呢？                                                                                                                                       我们来分析下：由于集合中什么类型的元素都可以存储。导致取出时强转引发运行时 ```ClassCastException```。                                                                                                                                                       怎么来解决这个问题呢？                                                                                                                                                           `Collection`虽然可以存储各种对象，但实际上通常`Collection`只存储同一类型对象。例如都是存储字符串对象。因此在`JDK5`之后，新增了**泛型**(**`Generic`**)语法，让你在设计API时可以指定类或方法支持泛型，这样我们使用`API`的时候也变得更为简洁，并得到了编译时期的语法检查。

* **泛型**：可以在类或方法中预支地使用未知的类型。

> tips:一般在创建对象时，将未知的类型确定具体的类型。当没有指定泛型时，默认类型为Object类型。

## 3.2  使用泛型的好处

泛型带来的好处：

* 将运行时期的```ClassCastException```，转移到了编译时期变成了编译失败。
* 避免了类型强转的麻烦。

通过我们如下代码体验一下：

~~~java
public class GenericDemo2 {
	public static void main(String[] args) {
        Collection<String> list = new ArrayList<String>();
        list.add("abc");
        list.add("itcast");
        // list.add(5);//当集合明确类型后，存放类型不一致就会编译报错
        // 集合已经明确具体存放的元素类型，那么在使用迭代器的时候，迭代器也同样会知道具体遍历元素类型
        Iterator<String> it = list.iterator();
        while(it.hasNext()){
            String str = it.next();
            //当使用Iterator<String>控制元素类型后，就不需要强转了。获取到的元素直接就是String类型
            System.out.println(str.length());
        }
	}
}
~~~

> tips:泛型是数据类型的一部分，我们将类名与泛型合并一起看做数据类型。

## 3.3  泛型的定义与使用

在集合中会大量使用到泛型，这里来完整地学习泛型知识。

泛型，用来灵活地将数据类型应用到不同的类、方法、接口当中。将数据类型作为参数进行传递。

### 定义和使用含有泛型的类

定义格式：

~~~
修饰符 class 类名<代表泛型的变量> {  }
~~~

例如，API中的ArrayList集合：

~~~java
class ArrayList<E>{ 
    public boolean add(E e){ }

    public E get(int index){ }
   	....
}
~~~

使用泛型： 即什么时候确定泛型。

**在创建对象的时候确定泛型**

 例如，`ArrayList<String> list = new ArrayList<String>();`

此时，变量E的值就是String类型,那么我们的类型就可以理解为：

~~~java 
class ArrayList<String>{ 
     public boolean add(String e){ }

     public String get(int index){  }
     ...
}
~~~

再例如，`ArrayList<Integer> list = new ArrayList<Integer>();`

此时，变量```E```的值就是```Integer```类型,那么我们的类型就可以理解为：

~~~java
class ArrayList<Integer> { 
     public boolean add(Integer e) { }

     public Integer get(int index) {  }
     ...
}
~~~

举例自定义泛型类

~~~java
public class MyGenericClass<MVP> {
	//没有MVP类型，在这里代表 未知的一种数据类型 未来传递什么就是什么类型
	private MVP mvp;
     
    public void setMVP(MVP mvp) {
        this.mvp = mvp;
    }
     
    public MVP getMVP() {
        return mvp;
    }
}
~~~

使用:

~~~java
public class GenericClassDemo {
  	public static void main(String[] args) {		 
         // 创建一个泛型为String的类
         MyGenericClass<String> my = new MyGenericClass<String>();    	
         // 调用setMVP
         my.setMVP("大胡子登登");
         // 调用getMVP
         String mvp = my.getMVP();
         System.out.println(mvp);
         //创建一个泛型为Integer的类
         MyGenericClass<Integer> my2 = new MyGenericClass<Integer>(); 
         my2.setMVP(123);   	  
         Integer mvp2 = my2.getMVP();
    }
}
~~~

###  含有泛型的方法

定义格式：

~~~
修饰符 <代表泛型的变量> 返回值类型 方法名(参数){  }
~~~

例如，

~~~java
public class MyGenericMethod {	  
    public <MVP> void show(MVP mvp) {
    	System.out.println(mvp.getClass());
    }
    
    public <MVP> MVP show2(MVP mvp) {	
    	return mvp;
    }
}
~~~

使用格式：**调用方法时，确定泛型的类型**

~~~java
public class GenericMethodDemo {
    public static void main(String[] args) {
        // 创建对象
        MyGenericMethod mm = new MyGenericMethod();
        // 演示看方法提示
        mm.show("aaa");
        mm.show(123);
        mm.show(12.45);
    }
}
~~~

### 含有泛型的接口

定义格式：

~~~
//修饰符 interface 接口名<代表泛型的变量> {  }
public interface GenericInterface<I> {
}
~~~

例如，

~~~java
public interface GenericInterface<I> {
    public abstract void method(I i);
}
~~~

使用格式：

**1、定义类时确定泛型的类型**

```java
//含有泛型的接口第一种使用方式：定义接口的实现类，实现接口 ，指定接口的泛型
public interface Iterator<E>{
    E next();
}

//Scanner类实现了Iterator接口，并指定接口的泛型为String，所以重写的next()的方法泛型默认为String
public final class Scanner implements Iterator<String>{
    public String next();
}
```



例如

~~~java
public class GenericInterfaceImpl1 implements GenericInterface<String>{
    @Override
    public void method(String s) {
        System.out.println(s);
    }
}
~~~

```java
public class Demo04GenericInterface {
    public static void main(String[] args) {
        //创建GenericInterfaceImpl1对象
        GenericInterfaceImpl1 gi1=new GenericInterfaceImpl1();
        gi1.method("字符串");
    }
}
```

此时，泛型E的值就是```String```类型。

 **2、始终不确定泛型的类型，直到创建对象时，确定泛型的类型**

```java
//含有泛型的接口第二种使用方式：接口使用什么泛型，实现类就使用什么泛型，类跟着接口走
//就相当于创建了一个含有泛型的类，创建对象的时候确定泛型的类型
public interface List<E>{
    boolean add(E e);
    E get(int index);
}
public class ArrayList<E> implement List<E>{
    public boolean add(E e){}
    public E get(int index){}
}
```



 例如

~~~java
public class GenericInterfaceImpl2<I> implements GenericInterface<I> {
    @Override
    public void method(I i) {
        System.out.println(i);
    }
}
~~~

确定泛型：

~~~java
public class Demo04GenericInterface {
    public static void main(String[] args) { 
        //创建GenericInterfaceImpl2对象
        GenericInterfaceImpl2<Integer> gi2=new GenericInterfaceImpl2<>();
        gi2.method(18);
    }
}
~~~

## 3.4  泛型通配符

当使用泛型类或者接口时，传递的数据中，泛型类型不确定，可以通过通配符```<?>```表示。但是一旦使用泛型的通配符后，只能使用```Object```类中的共性方法，集合中元素自身方法无法使用。

#### 通配符基本使用

泛型的通配符:**不知道使用什么类型来接收的时候,此时可以使用?,?表示未知通配符。**

此时只能接受数据,不能往该集合中存储数据。

举个例子理解使用即可：

~~~java
package com.yang.demo.demo03Generic;

import java.util.ArrayList;
import java.util.Iterator;

/*
泛型的通配符
    ?:代表任意的数据类型
使用方式：
    不能创建对象使用
    只能作为方法的参数使用
 */
public class Demo05Generic {
    public static void main(String[] args) {
        ArrayList<Integer> list01=new ArrayList<>();
        list01.add(11);
        list01.add(22);

        ArrayList<String> list02=new ArrayList<>();
        list02.add("hello");
        list02.add("world");

        PrintArray(list01);
        System.out.println("================");
        PrintArray(list02);
    }

    /*
    定义一个方法，能遍历所有类型的ArrayList集合
    这是不清楚ArrayList集合使用什么数据类型，可以用泛型的通配符?来接收数据类型
    注意：
        泛型是没有继承概念的
     */
    public static void PrintArray(ArrayList<?> list){
        //使用迭代器遍历集合
        Iterator<?> it=list.iterator();
        while(it.hasNext()){
            //it.next()方法，取出的元素是Object,可以接收任意的数据类型
            Object obj = it.next();
            System.out.println(obj);
        }
    }
}
~~~

> tips:泛型不存在继承关系 Collection<Object> list = new ArrayList<String>();这种是错误的。

#### 通配符高级使用----受限泛型

之前设置泛型的时候，实际上是可以任意设置的，只要是类就可以设置。但是在```JAVA```的泛型中可以指定一个泛型的**上限**和**下限**。

**泛型的上限**：

* **格式**： `类型名称 <? extends 类 > 对象名称`
* **意义**： `只能接收该类型及其子类`

**泛型的下限**：

- **格式**： `类型名称 <? super 类 > 对象名称`
- **意义**： `只能接收该类型及其父类型`

比如：现已知```Object```类，```String``` 类，```Number```类，```Integer```类，其中```Number```是```Integer```的父类

~~~java
public static void main(String[] args) {
    Collection<Integer> list1 = new ArrayList<Integer>();
    Collection<String> list2 = new ArrayList<String>();
    Collection<Number> list3 = new ArrayList<Number>();
    Collection<Object> list4 = new ArrayList<Object>();
    
    getElement(list1);
    getElement(list2);//报错
    getElement(list3);
    getElement(list4);//报错
  
    getElement2(list1);//报错
    getElement2(list2);//报错
    getElement2(list3);
    getElement2(list4);
    
    /*
    类与类之间的继承关系
    Integer extends Number extends Object
    String extends Object
    */
  
}
// 泛型的上限：此时的泛型?，必须是Number类型或者Number类型的子类
public static void getElement1(Collection<? extends Number> coll){}
// 泛型的下限：此时的泛型?，必须是Number类型或者Number类型的父类
public static void getElement2(Collection<? super Number> coll){}
~~~

# 第四章 集合综合案例

## 4.1 案例介绍

按照斗地主的规则，完成洗牌发牌的动作。
具体规则：

使用54张牌打乱顺序,三个玩家参与游戏，三人交替摸牌，每人17张牌，最后三张留作底牌。

## 4.2 案例分析

* 准备牌：

  牌可以设计为一个```ArrayList<String>```,每个字符串为一张牌。
  每张牌由花色数字两部分组成，我们可以使用花色集合与数字集合嵌套迭代完成每张牌的组装。
  牌由```Collections```类的```shuffle()```方法进行随机排序。

* 发牌

  将每个人以及底牌设计为```ArrayList<String>```,将最后3张牌直接存放于底牌，剩余牌通过对3取模依次发牌。


* 看牌

  直接打印每个集合。

## 4.3 代码实现

~~~java
package com.yang.demo.demo04Test;


import java.util.ArrayList;
import java.util.Collections;

/*
斗地主综合案例
    1.准备牌
    2.洗牌
    3.发牌
    4.看牌
 */
public class DouDiZhu {
    public static void main(String[] args) {
        //1.准备牌
        //定义一个存储54张牌的ArrayList集合，泛型使用String
        ArrayList<String> poker = new ArrayList<>();
        //定义两个数组，一个数组存储牌的花色，一个数组存储牌的序号
        String[] colors = {"♥", "♠", "♦", "♣"};
        String[] numbers = {"2", "A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3"};
        //先把大王和小王存储到poker集合中
        poker.add("大王");
        poker.add("小王");
        //循环嵌套两个数组，组成52张牌
        for (String number : numbers) {
            for (String color : colors) {
//                System.out.println(color + number);
                //把组装好的牌存储到poker集合中
                poker.add(color+number);
            }
        }
//        System.out.println(poker);

        /*
        2.洗牌
        使用集合的工具类Collections中的shuffle()方法
        static void shuffle(List<?> list) 使用默认随机源对指定列表进行置换
         */
        Collections.shuffle(poker);
//        System.out.println(poker);

        /*
        3.发牌
         */
        //定义4个集合，存储玩家的牌和底牌
        ArrayList<String> player01=new ArrayList<>();
        ArrayList<String> player02=new ArrayList<>();
        ArrayList<String> player03=new ArrayList<>();
        ArrayList<String> dipai=new ArrayList<>();

        /*
        遍历poker集合，获取每一张牌
        使用poker集合的索引%3给3个玩家轮流发牌
        剩余3张牌给底牌
        注意：
            先判断底牌(i>=51),否则牌就没了
         */
        for (int i = 0; i < poker.size(); i++) {
            //获取每一张牌
            String p = poker.get(i);
            //轮流发牌
            if(i>=51){
                //该底牌发牌
                dipai.add(p);
            }else if (i%3==0){
                //给玩家1发牌
                player01.add(p);
            }else if (i%3==1){
                //给玩家2发牌
                player02.add(p);
            }else if (i%3==2){
                //给玩家3发牌
                player03.add(p);
            }
        }

        //4.看牌
        System.out.println("猪八戒"+player01);
        System.out.println("孙悟空"+player02);
        System.out.println("沙和尚"+player03);
        System.out.println("底牌"+dipai);
    }
}
~~~

