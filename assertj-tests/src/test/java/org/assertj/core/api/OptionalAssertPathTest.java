package org.assertj.core.api;

import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

public class OptionalAssertPathTest {

  // Path 1: Optional is empty
  @Test
  void should_fail_if_optional_is_empty() {
    Optional<String> empty = Optional.empty();
    assertThat(empty).isEmpty();
  }

  // Path 2: Optional is present
  @Test
  void should_pass_if_optional_is_present() {
    Optional<String> value = Optional.of("AssertJ");
    assertThat(value).isPresent();
    assertThat(value.get()).isEqualTo("AssertJ");
  }
}
