/*
 * COS 201 - Computer Programming I
 * Week 2 Practice Exercise: print() and println()
 *
 * Student: David Otokhina
 *
 * Prediction before running: print("COS ") does not move to a new
 * line, so "201" appears on the same line. println("201") then ends
 * that line, and "Java" appears on the next line:
 *     COS 201
 *     Java
 */
public class PrintExample {
    public static void main(String[] args) {
        System.out.print("COS ");
        System.out.println("201");
        System.out.println("Java");
    }
}
