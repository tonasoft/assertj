package org.assertj.core.api;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

/**
 * Boundary Value Test for ListAssert.hasSize().
 * This test checks how AssertJ handles lists with boundary sizes.
 */
class ListAssert_hasSize_Test {

  // Lower boundary: empty list
  @Test
  void should_pass_if_list_is_empty() {
    List<String> emptyList = new ArrayList<>();
    assertThat(emptyList).hasSize(0);
  }

  // Nominal boundary: single item
  @Test
  void should_pass_if_list_has_one_item() {
    List<String> singleItem = List.of("AssertJ");
    assertThat(singleItem).hasSize(1);
  }

  // Upper boundary: large list
  @Test
  void should_pass_if_list_has_1000_items() {
    List<Integer> largeList = new ArrayList<>();
    for (int i = 0; i < 1000; i++) {
      largeList.add(i);
    }
    assertThat(largeList).hasSize(1000);
  }
}
