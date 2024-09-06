package reflection;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class Annotation {
	@Retention(RetentionPolicy.RUNTIME)
	public @interface LogExecute
	{
	    String msg() default "Executed Time";
	}

}
