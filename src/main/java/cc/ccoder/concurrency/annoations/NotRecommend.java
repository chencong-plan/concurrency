package cc.ccoder.concurrency.annoations;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 此注解用来标记【不推荐】的类或者写法
 *
 * @author chencong
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.SOURCE)
public @interface NotRecommend {

    String value() default "";
}
