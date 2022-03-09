import fr.lernejo.Sample;
import jdk.dynalink.Operation;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static fr.lernejo.Sample.Operation.ADD;
import static fr.lernejo.Sample.Operation.MULT;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatExceptionOfType;
import static org.junit.jupiter.api.Assertions.*;

class SampleTest {
    @Test
    void fact_neg_should_produce_an_exception() {
        assertThatExceptionOfType(IllegalArgumentException.class)
            .isThrownBy(() -> Sample.fact(-1));

    }

    @Test
    void fact_0_should_produce_1() {
        int quotient = Sample.fact(0); // (2)
        assertThat(quotient).as("fact(0) == 1")
            .isEqualTo(1); // (3)
    }
    @Test
    void fact_5_should_produce_120() {
        int quotient = Sample.fact(5); // (2)
        assertThat(quotient).as("fact(5) == 120")
            .isEqualTo(120); // (3)
    }

    @Test
    void mult_4_by_min5_should_produce_min20() {
        Sample.Operation operand = MULT;
        int quotient = Sample.op(operand,4,-5); // (2)
        assertThat(quotient).as("4*(-5) == -20")
            .isEqualTo(-20); // (3)
    }
    @Test
    void add_10_by_5_should_produce_2() {
        Sample.Operation operand = ADD;
        int quotient = Sample.op(operand,10,2); // (2)
        assertThat(quotient).as("10+ 2 == 12")
            .isEqualTo(12); // (3)
    }


}
