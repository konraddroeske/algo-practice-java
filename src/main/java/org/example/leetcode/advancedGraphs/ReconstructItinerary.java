package org.example.leetcode.advancedGraphs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ReconstructItinerary {

  public List<String> findItinerary(List<List<String>> tickets) {
    List<List<String>> mutableTickets = new ArrayList<>(tickets);

    mutableTickets.sort((a, b) -> {
      if (a.get(0).equals(b.get(0))) {
        return a.get(1).compareTo(b.get(1));
      }

      return a.get(0).compareTo(b.get(0));
    });

    int totalEdges = mutableTickets.size();
    Map<String, List<String>> edges = new HashMap<>();
    List<String> path = new ArrayList<>(List.of("JFK"));

    for (List<String> edge : mutableTickets) {
      String tail = edge.get(0);
      String head = edge.get(1);

      // Handle edges
      List<String> heads = edges.getOrDefault(tail, new ArrayList<>());
      heads.add(head);
      edges.put(tail, heads);
    }

    dfs("JFK", edges, path, totalEdges);

    return path;
  }

  private Boolean dfs(
      String tail,
      Map<String, List<String>> edges,
      List<String> path,
      Integer totalEdges
  ) {
    if (path.size() == totalEdges + 1) {
      return true;
    }

    List<String> heads = edges.get(tail);

    if (heads == null) {
      return false;
    }

    List<String> temp = new ArrayList<>(heads);

    for (int i = 0; i < temp.size(); i++) {
      String head = temp.get(i);
      heads.remove(i);
      path.add(head);

      if (dfs(head, edges, path, totalEdges)) {
        return true;
      }

      heads.add(i, head);
      path.remove(path.size() - 1);
    }

    return false;
  }
}