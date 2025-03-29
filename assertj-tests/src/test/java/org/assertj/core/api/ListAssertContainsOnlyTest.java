package org.assertj.tests;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class ListAssertContainsOnlyTest {

  // Valid partition: matches expected elements
  @Test
  void testContainsOnlyValidPartition() {
    List<Integer> actual = List.of(1, 2, 3);
    Assertions.assertThat(actual).containsOnly(1, 2, 3);
  }

  // Invalid partition: has an extra element
  @Test
  void testContainsOnlyInvalidPartition() {
    List<Integer> actual = List.of(1, 2, 3, 4);
    Assertions.assertThat(actual).doesNotContain(5);
  }

  // Valid partition with duplicates
  @Test
  void testContainsOnlyWithDuplicates() {
    List<Integer> actual = List.of(1, 1, 2, 3);
    Assertions.assertThat(actual).containsOnly(1, 2, 3);
  }
}
