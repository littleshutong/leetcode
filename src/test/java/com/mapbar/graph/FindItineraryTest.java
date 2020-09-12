package com.mapbar.graph;

import com.mapbar.util.Assert;
import com.mapbar.util.PrintUtil;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindItineraryTest {

    FindItinerary332 findItinerary = new FindItinerary332();

    @Test
    public void findItinerary() {
        List<List<String>> ans = new ArrayList<>();
        ans.add(Arrays.asList("MUC", "LHR"));
        ans.add(Arrays.asList("JFK", "MUC"));
        ans.add(Arrays.asList("SFO", "SJC"));
        ans.add(Arrays.asList("LHR", "SFO"));
        Assert.assertEquals("JFK,MUC,LHR,SFO,SJC", PrintUtil.printList(findItinerary.findItinerary(ans)));
        ans.clear();
        ans.add(Arrays.asList("JFK","SFO"));
        ans.add(Arrays.asList("JFK","ATL"));
        ans.add(Arrays.asList("SFO","ATL"));
        ans.add(Arrays.asList("ATL","JFK"));
        ans.add(Arrays.asList("ATL","SFO"));
        Assert.assertEquals("JFK,ATL,JFK,SFO,ATL,SFO", PrintUtil.printList(findItinerary.findItinerary(ans)));
        ans.clear();
        ans.add(Arrays.asList("JFK","ANU"));
        ans.add(Arrays.asList("ANU","EZE"));
        ans.add(Arrays.asList("EZE","AXA"));
        ans.add(Arrays.asList("AXA","TIA"));
        ans.add(Arrays.asList("TIA","ANU"));
        ans.add(Arrays.asList("ANU","JFK"));
        ans.add(Arrays.asList("JFK","TIA"));
        ans.add(Arrays.asList("TIA","ANU"));
        ans.add(Arrays.asList("ANU","TIA"));
        ans.add(Arrays.asList("TIA","JFK"));
        Assert.assertEquals("JFK,ANU,EZE,AXA,TIA,ANU,JFK,TIA,ANU,TIA,JFK", PrintUtil.printList(findItinerary.findItinerary(ans)));
        ans.clear();
        ans.add(Arrays.asList("MUC", "LHR"));
        ans.add(Arrays.asList("JFK", "MUC"));
        ans.add(Arrays.asList("SFO", "SJC"));
        ans.add(Arrays.asList("LHR", "SFO"));
        Assert.assertEquals("JFK,MUC,LHR,SFO,SJC", PrintUtil.printList(findItinerary.findItinerary2(ans)));
        ans.clear();
        ans.add(Arrays.asList("JFK","SFO"));
        ans.add(Arrays.asList("JFK","ATL"));
        ans.add(Arrays.asList("SFO","ATL"));
        ans.add(Arrays.asList("ATL","JFK"));
        ans.add(Arrays.asList("ATL","SFO"));
        Assert.assertEquals("JFK,ATL,JFK,SFO,ATL,SFO", PrintUtil.printList(findItinerary.findItinerary2(ans)));
        ans.clear();
        ans.add(Arrays.asList("JFK","ANU"));
        ans.add(Arrays.asList("ANU","EZE"));
        ans.add(Arrays.asList("EZE","AXA"));
        ans.add(Arrays.asList("AXA","TIA"));
        ans.add(Arrays.asList("TIA","ANU"));
        ans.add(Arrays.asList("ANU","JFK"));
        ans.add(Arrays.asList("JFK","TIA"));
        ans.add(Arrays.asList("TIA","ANU"));
        ans.add(Arrays.asList("ANU","TIA"));
        ans.add(Arrays.asList("TIA","JFK"));
        Assert.assertEquals("JFK,ANU,EZE,AXA,TIA,ANU,JFK,TIA,ANU,TIA,JFK", PrintUtil.printList(findItinerary.findItinerary2(ans)));
        ans.clear();
        ans.add(Arrays.asList("MUC", "LHR"));
        ans.add(Arrays.asList("JFK", "MUC"));
        ans.add(Arrays.asList("SFO", "SJC"));
        ans.add(Arrays.asList("LHR", "SFO"));
        Assert.assertEquals("JFK,MUC,LHR,SFO,SJC", PrintUtil.printList(findItinerary.findItinerary3(ans)));
        ans.clear();
        ans.add(Arrays.asList("JFK","SFO"));
        ans.add(Arrays.asList("JFK","ATL"));
        ans.add(Arrays.asList("SFO","ATL"));
        ans.add(Arrays.asList("ATL","JFK"));
        ans.add(Arrays.asList("ATL","SFO"));
        Assert.assertEquals("JFK,ATL,JFK,SFO,ATL,SFO", PrintUtil.printList(findItinerary.findItinerary3(ans)));
        ans.clear();
        ans.add(Arrays.asList("JFK","ANU"));
        ans.add(Arrays.asList("ANU","EZE"));
        ans.add(Arrays.asList("EZE","AXA"));
        ans.add(Arrays.asList("AXA","TIA"));
        ans.add(Arrays.asList("TIA","ANU"));
        ans.add(Arrays.asList("ANU","JFK"));
        ans.add(Arrays.asList("JFK","TIA"));
        ans.add(Arrays.asList("TIA","ANU"));
        ans.add(Arrays.asList("ANU","TIA"));
        ans.add(Arrays.asList("TIA","JFK"));
        Assert.assertEquals("JFK,ANU,EZE,AXA,TIA,ANU,JFK,TIA,ANU,TIA,JFK", PrintUtil.printList(findItinerary.findItinerary3(ans)));
    }
}