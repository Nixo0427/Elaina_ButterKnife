package kinffer.elaina.com.elaina_butterkinfe.ButterKnife.Annotation_Teach;


/**
 * 注解(Annotation)
 * 使用@interface声明的自定义类型，就是注解
 * 注解中没有方法体，但是与类相同的是都存在成员变量
 * 在注解中声明成员变量需要加() 也可以为成员变量增加初始值，使用default关键字即可
 * 如果成员变量加上了默认值，那么使用注解时可以不用为成员变量赋值(使用默认值)
 */


/**
 *
 * 根据注解是否包含成员变量，可以把Annotation分为如下两类：
 * (1)标记注解 标记注解指的时没有包含成员变量的注解，例如java内置的注解@Override注解。
 * (2)元数据注解 元数据注解指的是包含成员变量的注解，这类注解可以接受更多的元数据。
 * 例如，ButteerKnife的@BindView注解
 * 元注解详见对应的Annotation类
 */

public @interface Elaina_Base {
    String name() default "灰之魔女";
    int age() default 15;
    String Lv() default "旅人魔女";
}
