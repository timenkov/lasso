package xyz.timenkov.lasso.config;

import java.lang.annotation.*;

/**
 * @author Fedor Timenkov
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface LassoConfig {
    String value() default "";
    // TODO ftimenkov: should be main annotation for configuring class as 'Config' object
}
