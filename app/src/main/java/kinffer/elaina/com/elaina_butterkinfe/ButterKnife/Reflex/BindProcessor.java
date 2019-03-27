package kinffer.elaina.com.elaina_butterkinfe.ButterKnife.Reflex;


import android.app.Activity;
import android.support.annotation.NonNull;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import kinffer.elaina.com.elaina_butterkinfe.ButterKnife.Anno.BindView;
import kinffer.elaina.com.elaina_butterkinfe.ButterKnife.Anno.InjectLayout;

/**
 * 通过反射来实现注解功能
 */
public class BindProcessor {

    //处理@InjectLayout 注解
    public static void injectLayout(@NonNull Activity activity){
        Class<?> cls = activity.getClass();
        if (cls.isAnnotationPresent(InjectLayout.class)) {
            InjectLayout mId  = cls.getAnnotation(InjectLayout.class);
            int id = mId.value();
            try {
                Method method = cls.getMethod("setContentView",int.class);
                //对所有属性设置访问权限  当类中的成员变量为private时 必须设置此项
                method.setAccessible(true);
                method.invoke(activity,id);
            } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
                e.printStackTrace();
            }

        }

    }


    public static void bindView(@NonNull Activity activity){
        Class<?> cls = activity.getClass();
        //获取class中所有字段，因为控件一般情况都写成private
        //所以这里使用activityClass.getDeclaredFields();来获取 。
        Field[] declaredFields = cls.getDeclaredFields();
        for (Field field : declaredFields){
            //取到每一个属性
            BindView bindView = field.getAnnotation(BindView.class);
            int mId = bindView.value();
            try {
                Method method = cls.getMethod("findViewById", int.class);
                method.setAccessible(true);
                Object view = method.invoke(activity,mId);
                field.setAccessible(true);
                field.set(activity,view);
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            }
        }
    }

}
