## 一、代码工作原理：

####        ①Scene.java运行机制

- 相较于**W02**，在**Scene.java**中排序算法可以不由项目中的文件给出，而是由`SteganographyClassLoader`类对象读取图片中隐藏的class文件，通过一系列操作获得排序算法后赋值给`sorter`类对象而得，具体操作如下：

- `SteganographyClassLoader`继承自`ClassLoader`并**override**了该类的**findclass()**函数，这样，如果通过类加载器找不到目标，则经过重写的**findclass()**函数将调用**decodeByteArray()**函数读取图中隐写的class字节码信息，并调用**defineClass()**函数将获得的字节码转换生成一个class对象并返回，这也是为什么如果不删除`BubbleSorter.java`的话，即使图片并不是隐写术图，也能运行并得到正确结果的原因，因为类加载器可以直接找到目标，不需要读取图片内容。

- 当运行`Scene.java`时,`SteganographyClassLoader`对象通过上述操作读取图片，并调用**loadClass()**函数加载目标类，若无法直接找到目标类则读取图片字节码生成class对象并返回给`Class c`，并通过强制类型转换将`Class c`转换成排序算法`sorter`类，随后排序并写入文件过程与**W02**相同。

  #### ②SteganographyFactory.java运行机制

- 当运行`SteganographyFactory.java`文件时，通过`SteganographyFactory`类的**getSteganography()**函数将排序算法的java文件写入图片中，`SteganographyEncoder.java`文件帮助该函数实现将算法写入文件的过程，` DecodingException.java`负责在写入错误时输出错误信息

  

## 二、得到的两张图片

**具体两种算法的实现与生成的class文件我已将其放在S191220158文件夹下**

选择排序，链接为https://github.com/Da-Gen-Dui-Zhang-Lai-La/JAVA1/blob/main/example.SelectionSorter.png

![](https://github.com/Da-Gen-Dui-Zhang-Lai-La/JAVA1/blob/main/example.SelectionSorter.png)

插入排序，链接为https://github.com/Da-Gen-Dui-Zhang-Lai-La/JAVA1/blob/main/example.InsertSorter.png

![](https://github.com/Da-Gen-Dui-Zhang-Lai-La/JAVA1/blob/main/example.InsertSorter.png)

`（如果打不开图片可以在S191220158文件夹中找到相应图片）`



## 三、上传动画

选择排序：https://www.bilibili.com/video/BV1LU4y1w7qZ?spm_id_from=333.999.0.0

插入排序：https://www.bilibili.com/video/BV1gL4y167va?spm_id_from=333.999.0.0



## 四、联系同学

由于我用的java版本是java8，无法兼容java11以上的图片，因此很多同学的图片用不了，最后我采用的是191220142叶起厚同学的example.QuickSorter.png  (java8版本)，能正常使用，结果准确。（example.QuickSorter.png可直接在文件根目录中找到）







**如果有朋友发现java11无法正常运行java8的图片，请立即联系191220158！！！！**

**如果有朋友发现java11无法正常运行java8的图片，请立即联系191220158！！！！**

**如果有朋友发现java11无法正常运行java8的图片，请立即联系191220158！！！！**

