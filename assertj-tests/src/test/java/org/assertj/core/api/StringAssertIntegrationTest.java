package org.example;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringAssertIntegrationTest {

  @Test
  void should_pass_when_string_matches_all_conditions() {
    String sentence = "AssertJ makes testing easier.";

    Assertions.assertThat(sentence)
      .startsWith("AssertJ")
      .contains("testing")
      .endsWith("easier.");
  }

  @Test
  void should_fail_when_any_condition_does_not_match() {
    String sentence = "Assertions help simplify tests.";

    Assertions.assertThat(sentence)
      .doesNotContain("difficult")
      .startsWith("Assertions")
      .endsWith("tests.");
  }
}
