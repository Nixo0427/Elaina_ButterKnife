package kinffer.elaina.com.elaina_butterkinfe.ButterKnife.Annotation_Teach;


import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * @Retention元注解
 * 这个注解定义了该注解可以保留多长时间。某些注解仅出现在源代码中，而被编译器丢弃；
 * 而另一些却被编译在class文件中；
 * 编译在class文件中的Annotation可能会被虚拟机忽略，而另一些在class被装载时将被读取
 * （请注意并不影响class的执行，因为Annotation与class在使用上是被分离的）。
 * 使用这个meta-Annotation可以对 Annotation的“生命周期”限制。
 * @Retention同样包含一个名为“value”的成员变量，
 * 该value成员变量是RetentionPolicy枚举类型。使用@Retention时，必须为其value指定值。
 *
 * value成员变量的值只能是如下3个：
 *
 * RetentionPolicy.SOURCE：Annotation只保留在源代码中，编译器编译时，直接丢弃这种Annotation。
 * RetentionPolicy.CLASS：编译器把Annotation记录在class文件中。当运行Java程序时，JVM中不再保留该Annotation。
 * RetentionPolicy.RUNTIME：编译器把Annotation记录在class文件中。当运行Java程序时，JVM会保留该Annotation，程序可以通过反射获取该Annotation的信息。
 *
 */


@Retention(RetentionPolicy.RUNTIME)
public @interface Elainna_Retention {

    String name() default "灰之魔女";
    int age() default 15;
    String Lv() default "旅人魔女";

}
