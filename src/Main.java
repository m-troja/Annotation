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

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world!");
    }



}