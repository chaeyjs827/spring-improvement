package persys.web.proxyPatternTest;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/*
 * 이 부분은 그냥 어노태이션을 등록 해주는 부분이라 생각 하면 됨.
 * 아무런 로직을 수행하지 않고 @Aspect 를 사용하는 구현체에서 실제 로직을 추가해야함.
 */

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface TryAnno {

}
