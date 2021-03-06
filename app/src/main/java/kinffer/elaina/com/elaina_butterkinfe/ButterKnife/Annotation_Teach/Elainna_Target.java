package kinffer.elaina.com.elaina_butterkinfe.ButterKnife.Annotation_Teach;


import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 * (@Target元注解
 * 指定Annotation用于修饰哪些程序元素。
 * @Target也包含一个名为”value“的成员变量，该value成员变量类型为ElementType[ ]，
 * ElementType为枚举类型，值有如下几个：
 *
 * 简单来说Target是对Annotation权限做约束的
 * ElementType.TYPE：能修饰类、接口或枚举类型
 * ElementType.FIELD：能修饰成员变量
 * ElementType.METHOD：能修饰方法
 * ElementType.PARAMETER：能修饰参数
 * ElementType.CONSTRUCTOR：能修饰构造器
 * ElementType.LOCAL_VARIABLE：能修饰局部变量
 * ElementType.ANNOTATION_TYPE：能修饰注解
 * ElementType.PACKAGE：能修饰包
 */



//能修饰方法同时也能修饰成员变量
@Target({ElementType.FIELD,ElementType.METHOD})
public @interface Elainna_Target {

    String name() default "灰之魔女";
    int age() default 15;
    String Lv() default "旅人魔女";

}
