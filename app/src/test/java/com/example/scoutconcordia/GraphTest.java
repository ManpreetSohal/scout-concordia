package com.example.scoutconcordia;

import com.example.scoutconcordia.DataStructures.Graph;
import com.google.android.gms.maps.model.LatLng;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class GraphTest {

    Graph g;
    LatLng coordinate1, coordinate2;

    @BeforeEach
    public void beforeEach() throws Exception {
        g = new Graph(3);
        coordinate1 = new LatLng(45.494619, -73.577376); // SGW
        coordinate2 = new LatLng(45.458423, -73.640460); // Loyola
    }

    @AfterEach
    public void afterEach() throws Exception {
        g = null;
        coordinate1 = null;
        coordinate2 = null;
    }

    @Test
    public void testReset() {
        g.insertVertex(coordinate1, 1);
        g.insertVertex(coordinate2, 1);
        assertNotNull(g.nodes());

        g.reset();
        assertNull(g.nodes());
    }

    // inserting elements

    @Test
    public void testInsertVertex() {
        assertTrue(g.insertVertex(coordinate1, 1));
        assertTrue(g.insertVertex(coordinate2, 1));
        assertTrue(g.insertVertex(coordinate1, 1));
        assertFalse(g.insertVertex(coordinate2, 1)); // should be false because exceeds graph size of 3
    }

    @Test
    public void testInsertEdge() {
        assertEquals(-1, g.insertEdge(coordinate1, coordinate2)); // -1 if point not in graph

        g.insertVertex(coordinate1, 1);
        g.insertVertex(coordinate2, 1);

        assertEquals(1, g.insertEdge(coordinate1, coordinate2)); // 1 if successful

        assertEquals(0, g.insertEdge(coordinate1, coordinate2)); // 0 if edge already exists
    }

    @Test
    public void testAreAdjacent() {
        assertFalse(g.areAdjacent(coordinate1, coordinate2));

        g.insertVertex(coordinate1, 1);

        assertFalse(g.areAdjacent(coordinate1, coordinate2));

        g.insertVertex(coordinate2, 1);
        g.insertEdge(coordinate1, coordinate2);

        assertTrue(g.areAdjacent(coordinate1, coordinate2)); // now that both points are connected, should be true
    }

    // removing elements

    @Test
    public void testReplace() {
        assertFalse(g.replace(coordinate1, coordinate2)); // shouldn't work because nothing is in the graph yet

        g.insertVertex(coordinate1, 1);

        assertTrue(g.replace(coordinate1, coordinate2));
    }

    @Test
    public void testRemoveEdge() {
        assertEquals(-1, g.removeEdge(coordinate1, coordinate2)); // nothing in the graph yet

        g.insertVertex(coordinate1, 1);
        g.insertVertex(coordinate2, 1);
        assertEquals(0, g.removeEdge(coordinate1, coordinate2)); // nodes aren't connected yet

        g.insertEdge(coordinate1, coordinate2);
        assertEquals(1, g.removeEdge(coordinate1, coordinate2));
    }

    @Test
    public void testRemoveVertex() {
        assertEquals(-1, g.removeVertex(coordinate1));

        g.insertVertex(coordinate1, 1);

        assertEquals(1, g.removeVertex(coordinate1));
    }

    @Test
    public void testIncidentVerticies() {
        g.insertVertex(coordinate1, 1);

        assertNotNull(g.incidentVerticies(coordinate1));
    }

    // checking all elements and shortest path

    @Test
    public void testVertices() {
        g.insertVertex(coordinate1, 1);

        assertNotNull(g.vertices());
    }

    @Test
    public void testBreathFirstSearch() {
        assertNull(g.breathFirstSearch(coordinate1, coordinate2));

        g.insertVertex(coordinate1, 1);
        g.insertVertex(coordinate2, 1);
        g.insertEdge(coordinate1, coordinate2);

        assertNotNull(g.breathFirstSearch(coordinate1, coordinate2));
    }

    // testing inner Node class

    @Test
    public void testNodeGetters() {
        Graph.Node node1 = g.new Node(coordinate1, 0, 1);
        assertEquals(1, node1.getType());
        assertEquals(coordinate1, node1.getElement());

        node1 = null;
    }

}
