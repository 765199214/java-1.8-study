“元注解”？什么是“元注解”呢？

“元注解”是用来注解（动词）注解（名词）的注解（名词）。请感受汉语的博大精深。@Target、@Retention和@Documented就是所谓的元注解。

1）@Target

Target是目标的意思，@Target指定了注解运用的场景。都有哪些场景值呢？

ElementType.ANNOTATION_TYPE：可以给注解进行注解

ElementType.CONSTRUCTOR：可以给构造方法进行注解

ElementType.FIELD：可以给字段进行注解

ElementType.LOCAL_VARIABLE：可以给局部变量进行注解

ElementType.METHOD：可以给方法进行注解

ElementType.PACKAGE：可以给包进行注解

ElementType.PARAMETER：可以给方法内的参数进行注解

ElementType.TYPE：可以给类型进行注解，比如类、接口和枚举

2）@Retention

Retention这个单词的意思为保留期。也就是说，当@Retention应用到一个注解上的时候，它解释说明了这个注解的存活时间。来看它的取值范围。

RetentionPolicy.SOURCE：注解只在源码阶段保留，在编译器进行编译时它将被丢弃忽视。

RetentionPolicy.CLASS：注解只被保留到编译进行的时候，并不会被加载到 JVM 中。

RetentionPolicy.RUNTIME：注解可以保留到程序运行的时候，它会被加载进入到 JVM 中，所以在程序运行时可以获取到它们。

3）@Documented

Documented就比较容易理解，它和文档有关。作用就是能够将注解中的元素包含到 Javadoc 中。

当我们了解了元注解的概念后，再回头看一下@CrossOrigin的源码，是不是感觉清晰多了呢？

如果能够细致地读一读源码中的注释，你就会看到WebContextFilter类中出现的关键字，诸如Access-Control-Allow-Origin、Access-Control-Allow-Headers、Access-Control-Allow-Methods。也就是说，当我们通过@CrossOrigin对Controller类注解后，SpringMVC就能够在运行时对这个类自动加上解决跨域问题的过滤器。



注解是可以通过反射获取的。

1）可以通过 Class 对象的 isAnnotationPresent() 方法判断该类是否应用了某个指定的注解。

2）通过 getAnnotation() 方法来获取注解对象。

3）当获取到注解对象后，就可以获取使用注解时定义的属性值。

示例如下：

@CrossOrigin(origins = "http://qingmiaokeji.com", allowedHeaders = "accept,content-type", methods = { RequestMethod.GET, RequestMethod.POST })
public class TestController {
    public static void main(String[] args) {
        Class c = TestController.class;
 
        if (c.isAnnotationPresent(CrossOrigin.class)) {
            CrossOrigin crossOrigin = (CrossOrigin) c.getAnnotation(CrossOrigin.class);
 
            System.out.println(Arrays.asList(crossOrigin.allowedHeaders()));
            System.out.println(Arrays.asList(crossOrigin.methods()));
            System.out.println(Arrays.asList(crossOrigin.origins()));
        }
 
    }
}

 ———————————————— 
版权声明：本文为CSDN博主「沉默王二」的原创文章，遵循CC 4.0 by-sa版权协议，转载请附上原文出处链接及本声明。
原文链接：https://blog.csdn.net/qing_gee/article/details/88386705