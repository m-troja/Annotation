import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Todo {

    Class<? extends  Throwable> expected() default DefaultClass.class;

    Priority priority = Priority.LOW;
    Status status = Status.NOT_STARTED;

    public static class DefaultClass extends Throwable {
        private DefaultClass() {
            String author;
            Status status;
            Priority priority;
        }
    }
}
