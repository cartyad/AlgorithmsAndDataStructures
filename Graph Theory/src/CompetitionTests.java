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
    
    @Test
    public void testInputA()
    {
    	CompetitionDijkstra mapD;
    	CompetitionFloydWarshall mapFW;
    	String filename = "input-A.txt";
    	int sA = 60;
    	int sB = 80;
    	int sC = 50;
    	mapD = new CompetitionDijkstra(filename, sA, sB, sC);
    	mapFW = new CompetitionFloydWarshall(filename, sA, sB, sC);
    }
    
    @Test
    public void testInputB()
    {
    	CompetitionDijkstra mapD;
    	CompetitionFloydWarshall mapFW;
    	String filename = "input-B.txt";
    	int sA = 60;
    	int sB = 80;
    	int sC = 50;
    	mapD = new CompetitionDijkstra(filename, sA, sB, sC);
    	mapFW = new CompetitionFloydWarshall(filename, sA, sB, sC);
    	assertEquals(10000, mapD.timeRequiredforCompetition());
    	assertEquals(10000, mapFW.timeRequiredforCompetition());
    }
    
    @Test
    public void testInputC()
    {
    	CompetitionDijkstra mapD;
    	CompetitionFloydWarshall mapFW;
    	String filename = "input-C.txt";
    	int sA = 60;
    	int sB = 80;
    	int sC = 50;
    	mapD = new CompetitionDijkstra(filename, sA, sB, sC);
    	mapFW = new CompetitionFloydWarshall(filename, sA, sB, sC);
    }
    
    @Test
    public void testInputD()
    {
    	CompetitionDijkstra mapD;
    	CompetitionFloydWarshall mapFW;
    	String filename = "input-D.txt";
    	int sA = 60;
    	int sB = 80;
    	int sC = 50;
    	mapD = new CompetitionDijkstra(filename, sA, sB, sC);
    	mapFW = new CompetitionFloydWarshall(filename, sA, sB, sC);
    }
    
   /* @Test
    public void testInputE()
    {
    	CompetitionDijkstra mapD;
    	CompetitionFloydWarshall mapFW;
    	String filename = "input-E.txt";
    	int sA = 60;
    	int sB = 80;
    	int sC = 50;
    	mapD = new CompetitionDijkstra(filename, sA, sB, sC);
    	mapFW = new CompetitionFloydWarshall(filename, sA, sB, sC);
    }*/
    
    @Test
    public void testInputF()
    {
    	CompetitionDijkstra mapD;
    	CompetitionFloydWarshall mapFW;
    	String filename = "input-F.txt";
    	int sA = 60;
    	int sB = 80;
    	int sC = 50;
    	mapD = new CompetitionDijkstra(filename, sA, sB, sC);
    	mapFW = new CompetitionFloydWarshall(filename, sA, sB, sC);
    }
    
    @Test
    public void testInputG()
    {
    	CompetitionDijkstra mapD;
    	CompetitionFloydWarshall mapFW;
    	String filename = "input-G.txt";
    	int sA = 60;
    	int sB = 80;
    	int sC = 50;
    	mapD = new CompetitionDijkstra(filename, sA, sB, sC);
    	mapFW = new CompetitionFloydWarshall(filename, sA, sB, sC);
    }
    
   /* @Test
    public void testInputH()
    {
    	CompetitionDijkstra mapD;
    	CompetitionFloydWarshall mapFW;
    	String filename = "input-H.txt";
    	int sA = 60;
    	int sB = 80;
    	int sC = 50;
    	mapD = new CompetitionDijkstra(filename, sA, sB, sC);
    	mapFW = new CompetitionFloydWarshall(filename, sA, sB, sC);
    }*/
    
    @Test
    public void testInputI()
    {
    	CompetitionDijkstra mapD;
    	CompetitionFloydWarshall mapFW;
    	String filename = "input-I.txt";
    	int sA = 60;
    	int sB = 80;
    	int sC = 50;
    	mapD = new CompetitionDijkstra(filename, sA, sB, sC);
    	mapFW = new CompetitionFloydWarshall(filename, sA, sB, sC);
    }
    
    @Test
    public void testInputJ()
    {
    	CompetitionDijkstra mapD;
    	CompetitionFloydWarshall mapFW;
    	String filename = "input-J.txt";
    	int sA = 10;
    	int sB = 20;
    	int sC = 15;
    	mapD = new CompetitionDijkstra(filename, sA, sB, sC);
    	mapFW = new CompetitionFloydWarshall(filename, sA, sB, sC);
    	assertEquals(-1, mapD.timeRequiredforCompetition());
    	assertEquals(-1, mapFW.timeRequiredforCompetition());
    }
    
    @Test
    public void testInputK()
    {
    	CompetitionDijkstra mapD;
    	CompetitionFloydWarshall mapFW;
    	String filename = "input-K.txt";
    	int sA = 60;
    	int sB = 80;
    	int sC = 50;
    	mapD = new CompetitionDijkstra(filename, sA, sB, sC);
    	mapFW = new CompetitionFloydWarshall(filename, sA, sB, sC);
    }
    
    @Test
    public void testInputL()
    {
    	CompetitionDijkstra mapD;
    	CompetitionFloydWarshall mapFW;
    	String filename = "input-L.txt";
    	int sA = 60;
    	int sB = 80;
    	int sC = 50;
    	mapD = new CompetitionDijkstra(filename, sA, sB, sC);
    	mapFW = new CompetitionFloydWarshall(filename, sA, sB, sC);
    }
    
    @Test
    public void testInputM()
    {
    	CompetitionDijkstra mapD;
    	CompetitionFloydWarshall mapFW;
    	String filename = "input-M.txt";
    	int sA = 60;
    	int sB = 80;
    	int sC = 50;
    	mapD = new CompetitionDijkstra(filename, sA, sB, sC);
    	mapFW = new CompetitionFloydWarshall(filename, sA, sB, sC);
    }
    
    @Test
    public void testInputN()
    {
    	CompetitionDijkstra mapD;
    	CompetitionFloydWarshall mapFW;
    	String filename = "input-N.txt";
    	int sA = 60;
    	int sB = 80;
    	int sC = 50;
    	mapD = new CompetitionDijkstra(filename, sA, sB, sC);
    	mapFW = new CompetitionFloydWarshall(filename, sA, sB, sC);
    }
    
}
