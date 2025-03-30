package org.example;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class ObjectAssertInstanceTest {

  @Test
  void should_pass_if_object_is_instance_of_expected_type() {
    Number obj = Integer.valueOf(42); // Definition of obj

    // Use of obj in assertion - expected to pass
    Assertions.assertThat(obj).isInstanceOf(Integer.class);
  }

  @Test
  void should_fail_if_object_is_not_instance_of_expected_type() {
    Number obj = Double.valueOf(3.14); // Definition of obj

    // Use of obj in assertion - should NOT be Integer
    Assertions.assertThat(obj).isNotInstanceOf(Integer.class);
  }
}
