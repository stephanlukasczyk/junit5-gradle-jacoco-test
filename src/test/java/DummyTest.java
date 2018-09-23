import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class DummyTest {

  private Dummy dummy;
  private int a;
  private int b;

  @BeforeEach
  void setUp() {
    dummy = Dummy.create();
    a = 23;
    b = 42;
  }

  @Test
  @DisplayName("Check that the first input is maximum.")
  void test_firstIsMax() {
    int result = dummy.max(b, a);

    assertEquals(b, result);
  }

  @Test
  @DisplayName("Check that the second input is maximum.")
  void test_secondIsMax() {
    int result = dummy.max(a, b);

    assertEquals(b, result);
  }
}
