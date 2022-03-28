# Baseline of CS102A22S12

这里，我们将会对`Main.java`文件中的class进行解释

## Class QReader & QWiter



### What is Java Fast IO?

Some assignments on the Online Judge system may contain large size of input and output. The original input and output method is slow, so you may get `Runtime Error` or `Time Limit Exceed` in your submit records. With the help of Java Fast IO, the time consumed in the program will decrease, i.e., you are likely to get `Accept`.

### How to use?

把`Main.java`文件拷贝至本地，根据注释在指定地方写代码。在OJ上提交整个`Main.java`文件内的所有代码。

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

