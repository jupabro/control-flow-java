import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;

public class ControlFlow {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.printf("%d multiplied by %d is %d%n", i , j , i*j);
            }
        }
    }
}
