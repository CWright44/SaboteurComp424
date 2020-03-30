package student_player;


import Saboteur.SaboteurBoard;
import Saboteur.SaboteurBoardState;
import Saboteur.cardClasses.SaboteurTile; //make sure i'm allowed to make this import ***
import Saboteur.SaboteurBoardState;
import java.util.*;

public class MyTools {
    public static double getSomething() {
        return Math.random();
    }

    //create a policy
    //55 cards total, subtract the ones you have in your dec, use valid move to prune even more
    //then you have likelihood of cards in opponent players deck
    public void createPolicy(){

    }


    public void generateHeuristicFunction(){


    }


    //pass in root node (tile) and find all viable children from which to select most promising
    public void selection (SaboteurTile parent){

        //call expansion passing in best tile found with evalutation Function
        expansion(evaluationFunction(parent),parent);
    }

    //to be used in selection method above
    //algorithm to select most promising child node from parent passed in through selection
    public ArrayList<SaboteurTile> evaluationFunction(SaboteurTile s){

        //place holders for now - must later come from tile passed in
        int NumWinsAfterIthMove=0;
        int constantC=0;
        double totalNumSimluations = 0;
        double totalNumSimulationsNodeAfter =0;
        Map<Double,SaboteurTile> getBestTile = new HashMap<>();

        //generate all children nodes aka cards that could potentially be played\

        /*
        for(Map.Entry entry : childNode.entrySet()){

            //store UCT algo of each in an arraylist
            double valueOfNode = NumWinsAfterIthMove/totalNumSimulationsNodeAfter + constantC*(Math.sqrt((Math.log(totalNumSimluations))/totalNumSimulationsNodeAfter));
            //store in arraylist
            getBestTile.put(c,valueOfNode);
        }

        //choose maximum value out of arraylist and return value associated to it in the hashmap
        Double max = Collections.max(getBestTile.values());
        //iterate through arraylist to get key (Tile) associated to highest potential value

        ArrayList<String> keys = new ArrayList<>();
        for (Map.Entry entry : getBestTile.entrySet()) {
            if (entry.getValue()==max) {
                keys.add((String) entry.getKey());
            }
        }

        //COME BACK TO THIS MUST RETURN OBJECT!!!
        return keys;
    */
        ArrayList<SaboteurTile> arr = new ArrayList<>();
        return arr;
    }

    public void expansion(ArrayList<SaboteurTile> s, SaboteurTile parent){

    //add child node to parent node


    }

    //simulations performed until optimal state reached - i.e. finding the gold nugget
    public void simulation (){


    }


    //backpropogation from new node to root node
    // the number of simulation stored in each node is incremented
    // if the new node’s simulation results in a win, then the number of wins is also incremented
    public void backPropogation (){



    }







}