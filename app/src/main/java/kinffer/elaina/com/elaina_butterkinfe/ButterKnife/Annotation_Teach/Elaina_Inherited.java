package kinffer.elaina.com.elaina_butterkinfe.ButterKnife.Annotation_Teach;


import java.lang.annotation.Inherited;

/**
 * (4)@Inherited
 * @Inherited是一个标记注解，指定注解具有继承性。
 * 要注意的是它并不是说注解本身可以继承，而是说如果一个父类被 @Inherited 注解过的注解进行注解的话，
 * 那么如果它的子类没有被任何注解应用的话，那么这个子类就继承了父类的注解。
 */
@Inherited
public @interface Elaina_Inherited {
    String name() default "灰之魔女";
    int age() default 15;
    String Lv() default "旅人魔女";
}
//
//@Elaina_Inherited
//public class A{
//    此时A协有Inherited注解，所以如果他的子类没有使用其他注解，
//    那么也会跟随父类A继承到Elaina_Inherited注解
//}

//
//public class B extends A{
//    B也协有Elaina_Inherited注解
//}