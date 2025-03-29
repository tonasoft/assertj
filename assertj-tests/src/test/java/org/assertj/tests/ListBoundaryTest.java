
package org.assertj.tests;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class ListBoundaryTest {

  // Test case for empty list (boundary: size = 0)
  @Test
  void testEmptyList() {
    List<String> emptyList = new ArrayList<>();

    // Assert that the list is empty
    Assertions.assertThat(emptyList)
      .isNotNull()
      .isEmpty();
  }

  // Test case for single-element list (boundary: size = 1)
  @Test
  void testSingleElementList() {
    List<String> singleItemList = List.of("AssertJ");

    // Assert that the list contains exactly one item
    Assertions.assertThat(singleItemList)
      .isNotNull()
      .hasSize(1)
      .contains("AssertJ");
  }

  // Test case for larger list (boundary: size = 1000 as upper bound sample)
  @Test
  void testLargeListBoundary() {
    List<Integer> largeList = new ArrayList<>();
    for (int i = 0; i < 1000; i++) {
      largeList.add(i);
    }

    // Assert that the list has 1000 elements
    Assertions.assertThat(largeList)
      .hasSize(1000)
      .contains(0, 500, 999); // Check key boundaries
  }
}
