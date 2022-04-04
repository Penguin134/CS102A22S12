# Baseline of CS102A22S12

这里，我们将会对`Main.java`文件中的class进行解释

**重要**：下面的提示供**学有余力**并且**对编程感兴趣**的同学参考，如果你对此不感兴趣，你可以忽略Hint1和Hint2，用传统方法解题。不过我们还是推荐你使用剩下的Class QReader & QWiter， 这样会让你的程序更容易Accept！

Hint 1：我们提供了两种特殊容器MaxHeap和MinHeap，你可以参考下文给出的说明使用它们，来解决寻找中位数的问题

Hint 2：我们提供了Java HashMap的使用说明，你可以参考并使用HashMap解决题目中的某些问题

## Class QReader & QWiter

### What is Java Fast IO?

Some assignments on the Online Judge system may contain large size of input and output. The original input and output method is slow, so you may get `Runtime Error` or `Time Limit Exceed` in your submit records. With the help of Java Fast IO, the time consumed in the program will decrease, i.e., you are likely to get `Accept`.

### How to use?

把`Main.java`文件拷贝至本地，根据注释在指定地方写代码。在OJ上提交整个`Main.java`文件内的所有代码。

我们已经学过了初步的面向对象编程，要想使用快读快写，我们首先要实例化对象，然后调用其方法。（参考代码中的注释）

Java快读支持字符串、（长）整形的读取，用法与`Scanner`完全一样。同时支持判断是否有输入。

快写的用法与`System.out.println()`完全一样。唯一区别是：快写不支持`System.out.printf()`的格式化输出。

### Acknowledgement

```
@author lowbieh : https://paste.ubuntu.com/p/6ybMcVXvz5/
```

## Class MaxHeap & Min Heap

### What is MaxHeap or MinHeap?

You can consider them as a special container. You can add integers into them and get some information about the integers. 

**You may need them to find the median.**

### How do they work?

To use them, first you should instantiate an object of these two classes, respectively. 

```java
MinHeap heap1 = new MinHeap();
MaxHeap heap2 = new MaxHeap();
```

#### MinHeap

You can add an integer `k` into it by `heap1.push(k)`

You can get the min value of all the integers you add by `heap1.getMin()`

You can remove the min integer by `heap1.pop()`

You can get the size of the container by `heap1.size()`

#### MaxHeap

You can add an integer `k` into it by `heap2.push(k)`

You can get the max value of all the integers you add by `heap2.getMax()`

You can remove the max integer by `heap2.pop()`

You can get the size of the container by `heap2.size()`

#### Attention

Do **NOT** use `pop()` when the container is empty! 

## Class HashMap

HashMap是Java中自带的一种容器，它可以帮你快速寻找Object.

Use the following code to build a mapping between a String Object and an integer.

```java
HashMap<String,Integer> map = new HashMap<>();
```

You may find some method helpful in this problem.

```java
map.put("SUSTech",1088); // Add a new mapping
map.remove("SUSTech"); // Delete a mapping
map.containsKey("SUSTech"); // Find an Object quickly
map.get("SUSTech"); // Returns the value to which the key is mapped
```

For more information about Java HashMap, you're encouraged to ask Professor **Baidu**.
