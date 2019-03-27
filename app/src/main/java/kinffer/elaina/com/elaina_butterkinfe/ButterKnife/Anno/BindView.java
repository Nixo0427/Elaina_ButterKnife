package kinffer.elaina.com.elaina_butterkinfe.ButterKnife.Anno;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//  查找控件ID的注解
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.SOURCE)
public @interface BindView {
    int value() default -1;
}
