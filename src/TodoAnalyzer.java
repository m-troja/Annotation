/*
 * Implement Annotation that allow you to track progress.
 * Annotation name is ‘Todo’
 * Annotation has next elements:
 * author - String type
 * priority - Priority Enum type (LOW, MEDIUM, HIGH)
 * status - Status Enum Type (STARTED, NOT_STARTED)
 * Declare Priority and Status enum INSIDE Todo annotation
 *         Default Priority is LOW
 *         Default status is NOT_STARTED
 *         For author element there is no default value
 * Annotation can be applied to methods only
 * Annotation should be available during the runtime
 * Create TodoAnalyzer class
 * Declare getTodoReport() method in TodoAnalyzer class
 * Method returns String that contains Todo report following specific format described below
 *                 The method should take Class object to analyze as method argument
 *                 Method returns String of each method analysis divided by new line separator. Each line should have the next format:
 * method name: <HERE METHOD NAME>, author: <HERE AUTHOR>, priority: <HERE PRIORITY>, status: <HERE STATUS>
 */

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.stream.Collectors;

public class TodoAnalyzer {

    public TodoAnalyzer(){};
    public String getTodoReport(Class<? extends Object> clazz) {
        return Arrays.stream(clazz.getDeclaredMethods())
                .filter(method -> method.getAnnotation(Todo.class) != null)
                .map(method -> {
                    var todoAnnotation = method.getAnnotation(Todo.class);
                    return "method name: " + method.getName()
                            + ", author: " + todoAnnotation.author()
                            + ", priority: " + todoAnnotation.priority()
                            + ", status: " + todoAnnotation.status();
                })
                .collect(Collectors.joining(System.lineSeparator()));
    }
    public static void main(String[] args) {
        TodoSamples todoSample = new TodoSamples();
        Class sampleClass = todoSample.getClass();
        TodoAnalyzer analyzer = new TodoAnalyzer();
        String analyzedString = analyzer.getTodoReport(sampleClass);
        System.out.println(analyzedString);
    }
}