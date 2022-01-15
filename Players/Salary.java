package Players;

import java.io.IOException;

public interface Salary {
    final double BASIC_PAY = 2500;
    void getSalary() throws IOException;
    void write() throws IOException;
}
