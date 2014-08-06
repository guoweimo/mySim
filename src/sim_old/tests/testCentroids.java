package sim_old.tests;

import sim_old.netgen.GMLFileReader;
import sim_old.routing.KSPTree;
import sim_old.tripgen.CentroidsDesignator;
import org.jgrapht.WeightedGraph;

/**
 * Created by kwai on 11/07/14.
 */
public class testCentroids {

    public static void main(String[] args){
        GMLFileReader reader = new GMLFileReader();
        reader.read("Data/east_milan.gml");

        KSPTree tree = new KSPTree(reader);
        WeightedGraph w_graph = tree.constructGraph();

        CentroidsDesignator cd = new CentroidsDesignator(reader,tree,w_graph,10,10);
        cd.designateCentroids();
    }

}
