import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public @interface Todo {

    Class<? extends  Throwable> expected() default DefaultClass.class;

    Priority priority = Priority.LOW;
    Status status = Status.NOT_STARTED;

    static class DefaultClass extends Throwable {
        private DefaultClass() {
            String author;
            Status status;
            Priority priority;
        }
    }
}
