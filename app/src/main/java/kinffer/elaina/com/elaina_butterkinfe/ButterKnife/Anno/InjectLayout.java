package kinffer.elaina.com.elaina_butterkinfe.ButterKnife.Anno;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


//  给Activity注入布局文件的注解
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface InjectLayout {
    int value () default -1;
}
