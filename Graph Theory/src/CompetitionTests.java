import static org.junit.Assert.*;

import org.junit.Test;
/*
 * 
1. Justify the choice of the data structures used in 
	CompetitionDijkstra and CompetitionFloydWarshall
	
	I used 2D arrays in order to store the graph. They are the simplest data 
	structure to use and I found them the easiest to use for this problem.
	
	The Dijksta algorithm was easiest to implement with arrays. 
	It could also be implemented using priority queues however 2D arrays allowed us 
	to find the shortest path and was simpler to implement.
	
	The Floyd-Warshall algorithm is best solved by using matrices and as a result
	it is easiest to populate a 2D array to find the shortest path.
	
2. a) Explain theoretical differences in the performance of Dijkstra and Floyd-Warshall algorithms
      in the given problem.
      
      Dijkstra finds the shortest path from one source node, ie. by going from 
      point to point. When using array implementation Dijkstra would run in 
      O(V^2).
      
      Floyd-Warshall however finds the shorter path by searching through pairs
      of vertices. Floyd is much more exhaustive than Dijkstra meaning it suits 
      denser graphs. The Floyd-Warshall algorithm runs in O(V^3) which is slower
      however it is more suitable for this problem. This is because you are looking 
      for the longest route between any two vertices which allows you to calculate 
      the time needed for the competition.
      
   b)Also explain how would their relative performance be affected by the density of the graph. 
   Which would you choose in which set of circumstances and why?
   
     Floyd Warshall is better for denser graphs as it is more exhaustive and searches through
     in pairs.
     
     Dijkstra is better for sparser graphs as it goes through point by point and
     has a better runtime for repeated actions. It is also a continous algorithm.
 */
public class CompetitionTests {

    @Test
    public void testDijkstraConstructor() {
    	
    	CompetitionDijkstra map;
    	String filename = "tinyEWD.txt";
    	int sA = 60;
    	int sB = 80;
    	int sC = 50;
    	map = new CompetitionDijkstra(filename, sA, sB, sC);
    	assertEquals(38, map.timeRequiredforCompetition());
    	
    	CompetitionDijkstra map1;
    	String filename1 = "tinyEWD.txt";
    	int sA1 = 30;
    	int sB1 = 80;
    	int sC1 = 70;
    	map1 = new CompetitionDijkstra(filename1, sA1, sB1, sC1);
    	assertEquals(-1, map1.timeRequiredforCompetition());
    	
    	CompetitionDijkstra map2;
    	String filename2 = "tinyEWD.txt";
    	int sA2 = 50;
    	int sB2 = 30;
    	int sC2 = 70;
    	map2 = new CompetitionDijkstra(filename2, sA2, sB2, sC2);
    	assertEquals(-1, map2.timeRequiredforCompetition());
    	
    	CompetitionDijkstra map3;
    	String filename3 = "tinyEWD.txt";
    	int sA3 = 50;
    	int sB3 = 80;
    	int sC3 = 1120;
    	map3 = new CompetitionDijkstra(filename3, sA3, sB3, sC3);
    	assertEquals(-1, map3.timeRequiredforCompetition());
    	
    	CompetitionDijkstra map4;
    	String filename4 = "tinyEWD.txt";
    	int sA4 = 50;
    	int sB4 = 80;
    	int sC4 = 20;
    	map4 = new CompetitionDijkstra(filename4, sA4, sA4, sC4);
    	assertEquals(-1, map4.timeRequiredforCompetition());
    	
    	CompetitionDijkstra map5;
    	String filename5 = "tinyEWD.txt";
    	int sA5 = 50;
    	int sB5 = 130;
    	int sC5 = 70;
    	map5 = new CompetitionDijkstra(filename5, sA5, sB5, sC5);
    	assertEquals(-1, map5.timeRequiredforCompetition());
    	
    	CompetitionDijkstra map6;
    	String filename6 = "tinyEWD.txt";
    	int sA6 = 130;
    	int sB6 = 80;
    	int sC6 = 70;
    	map6 = new CompetitionDijkstra(filename6, sA6, sB6, sC6);
    	assertEquals(-1, map6.timeRequiredforCompetition());
    }

    @Test
    public void testFWConstructor() {
    	CompetitionFloydWarshall map;
    	String filename = "tinyEWD.txt";
    	int sA = 50;
    	int sB = 80;
    	int sC = 60;
    	map = new CompetitionFloydWarshall(filename, sA, sB, sC);
    	assertEquals(38, map.timeRequiredforCompetition());
    	
    	CompetitionFloydWarshall map1;
    	String filename1 = "tinyEWD.txt";
    	int sA1 = 30;
    	int sB1 = 80;
    	int sC1 = 70;
    	map1 = new CompetitionFloydWarshall(filename1, sA1, sB1, sC1);
    	assertEquals(-1, map1.timeRequiredforCompetition());
    	
    	CompetitionFloydWarshall map2;
    	String filename2 = "tinyEWD.txt";
    	int sA2 = 50;
    	int sB2 = 30;
    	int sC2 = 70;
    	map2 = new CompetitionFloydWarshall(filename2, sA2, sB2, sC2);
    	assertEquals(-1, map2.timeRequiredforCompetition());
    	
    	CompetitionFloydWarshall map3;
    	String filename3 = "tinyEWD.txt";
    	int sA3 = 50;
    	int sB3 = 80;
    	int sC3 = 1120;
    	map3 = new CompetitionFloydWarshall(filename3, sA3, sB3, sC3);
    	assertEquals(-1, map3.timeRequiredforCompetition());
    	
    	CompetitionFloydWarshall map4;
    	String filename4 = "tinyEWD.txt";
    	int sA4 = 50;
    	int sB4 = 80;
    	int sC4 = 20;
    	map4 = new CompetitionFloydWarshall(filename4, sA4, sA4, sC4);
    	assertEquals(-1, map4.timeRequiredforCompetition());
    	
    	CompetitionFloydWarshall map5;
    	String filename5 = "tinyEWD.txt";
    	int sA5 = 50;
    	int sB5 = 130;
    	int sC5 = 70;
    	map5 = new CompetitionFloydWarshall(filename5, sA5, sB5, sC5);
    	assertEquals(-1, map5.timeRequiredforCompetition());
    	
    	CompetitionFloydWarshall map6;
    	String filename6 = "tinyEWD.txt";
    	int sA6 = 130;
    	int sB6 = 80;
    	int sC6 = 70;
    	map6 = new CompetitionFloydWarshall(filename6, sA6, sB6, sC6);
    	assertEquals(-1, map6.timeRequiredforCompetition());
  
    }

    @Test
    public void testDijkstraFilenameError()
    {
    	CompetitionDijkstra map;
    	String filename = "tsha.txt";
    	int sA = 50;
    	int sB = 80;
    	int sC = 60;
    	map = new CompetitionDijkstra(filename, sA, sB, sC);
    	assertEquals(-1, map.timeRequiredforCompetition());
    }
    
    @Test
    public void testDijkstraMaxError()
    {
    	CompetitionDijkstra map;
    	String filename = "Max.txt";
    	int sA = 50;
    	int sB = 80;
    	int sC = 60;
    	map = new CompetitionDijkstra(filename, sA, sB, sC);
    	assertEquals(-1, map.timeRequiredforCompetition());
    }
    
    @Test
    public void testFloydWarshallMaxError()
    {
    	CompetitionFloydWarshall map;
    	String filename = "Max.txt";
    	int sA = 50;
    	int sB = 80;
    	int sC = 60;
    	map = new CompetitionFloydWarshall(filename, sA, sB, sC);
    	assertEquals(-1, map.timeRequiredforCompetition());
    }
    
    @Test
    public void testFloydWarshallFilenameError()
    {
    	CompetitionFloydWarshall map;
    	String filename = "tsha.txt";
    	int sA = 50;
    	int sB = 80;
    	int sC = 60;
    	map = new CompetitionFloydWarshall(filename, sA, sB, sC);
    	assertEquals(-1, map.timeRequiredforCompetition());
    }
    
    @Test
    public void testDijkstraNegativeSpeed()
    {
    	CompetitionDijkstra map;
    	String filename = "tinyEWD.txt";
    	int sA = 0;
    	int sB = 80;
    	int sC = 60;
    	map = new CompetitionDijkstra(filename, sA, sB, sC);
    	assertEquals(-1, map.timeRequiredforCompetition());
    	sA = -1;
    	sB = 0;
    	sC = -2;
    	map = new CompetitionDijkstra(filename, sA, sB, sC);
    	assertEquals(-1, map.timeRequiredforCompetition());
    }
    
    @Test
    public void testFloyWarshallNegativeSpeed()
    {
    	CompetitionFloydWarshall map;
    	String filename = "tinyEWD.txt";
    	int sA = 0;
    	int sB = 80;
    	int sC = 60;
    	map = new CompetitionFloydWarshall(filename, sA, sB, sC);
    	assertEquals(-1, map.timeRequiredforCompetition());
    	sA = -1;
    	sB = 0;
    	sC = -2;
    	map = new CompetitionFloydWarshall(filename, sA, sB, sC);
    	assertEquals(-1, map.timeRequiredforCompetition());
    }
}
