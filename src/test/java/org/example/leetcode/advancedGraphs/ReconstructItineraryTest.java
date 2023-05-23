package org.example.leetcode.advancedGraphs;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ReconstructItineraryTest {
  ReconstructItinerary solution = new ReconstructItinerary();

  @Test
  void findItinerary1() {
    List<List<String>> tickets = List.of(
        List.of("MUC", "LHR"),
        List.of("JFK", "MUC"),
        List.of("SFO", "SJC"),
        List.of("LHR", "SFO")
    );

    List<String> expected = List.of("JFK", "MUC", "LHR", "SFO", "SJC");
    List<String> result = solution.findItinerary(tickets);

    assertIterableEquals(expected, result);
  }

  @Test
  void findItinerary2() {
    List<List<String>> tickets = List.of(
        List.of("JFK", "SFO"),
        List.of("JFK", "ATL"),
        List.of("SFO", "ATL"),
        List.of("ATL", "JFK"),
        List.of("ATL", "SFO")
    );

    List<String> expected = List.of("JFK", "ATL", "JFK", "SFO", "ATL", "SFO");
    List<String> result = solution.findItinerary(tickets);

    assertIterableEquals(expected, result);
  }

  @Test
  void findItinerary3() {
    List<List<String>> tickets = List.of(
        List.of("JFK", "KUL"),
        List.of("JFK", "NRT"),
        List.of("NRT", "JFK")
    );

    List<String> expected = List.of("JFK", "NRT", "JFK", "KUL");
    List<String> result = solution.findItinerary(tickets);

    assertIterableEquals(expected, result);
  }

  @Test
  void findItinerary4() {
    List<List<String>> tickets = List.of(
        List.of("EZE", "AXA"),
        List.of("TIA", "ANU"),
        List.of("TIA", "ANU"),
        List.of("TIA", "JFK"),
        List.of("ANU", "JFK"),
        List.of("ANU", "EZE"),
        List.of("ANU", "TIA"),
        List.of("JFK", "ANU"),
        List.of("JFK", "TIA"),
        List.of("AXA", "TIA")
    );

//    List<String> expected = List.of("JFK", "NRT", "JFK", "KUL");
    List<String> result = solution.findItinerary(tickets);

    System.out.println(result);
//    assertIterableEquals(expected, result);
  }
}