package datastructure;
import java.util.*;
import java.util.LinkedList;

public class Graph {
	int node;
	ArrayList<ArrayList<Integer>> graph;
	Graph(int node)
	{
		this.node = node;
		graph = new ArrayList<ArrayList<Integer>>();
		for(int i=0;i<node;i++)
		{
			graph.add(new ArrayList<Integer>());
		}
	}
		public void addEdge(int u,int v)
		{
			graph.get(v).add(u);
			graph.get(u).add(v);
		}
		void printGraph()
		{
			for(int i=0;i<node;i++)
			{
				System.out.print("node"+i);
				for(int x:graph.get(i))
				{
					System.out.print("-->"+x);
				}
				System.out.println();
			}
		}
		void BFS(int start)
		{
			LinkedList<Integer> q = new LinkedList<Integer>();
			q.add(start);
			boolean[] visited = new boolean[node];
			System.out.print("BFS traversal :"+start+" ");
			for(int j=0;j<node;j++)
				visited[j]=false;
			visited[start] = true;
			int a=0;
			for(int i=a;i<node;i++)
			{
				i=start;
			   for(int x:graph.get(i))	
			   {   
				   if(visited[x]==false)
				   {
					   System.out.print(x+" ");
					   visited[x]=true;
					   start=x;
				   }
			   }
			   i=a;
			   a++;	
			}
		}
		void DFS(int start)
		{
			boolean visited[] = new boolean[node];
			for(int i=0;i<node;i++)
			{
				visited[i]=false;
			}
			System.out.print("DFS traverse :");
			DFStraverse(start,visited);
		}
		void DFStraverse(int start,boolean visited[])
		{
			visited[start]=true;
			System.out.print(start+" ");
			for(int j=start;j<node;j++)
			{
				for(int x:graph.get(j))
				{
					if(visited[x] == false)
					{
					DFStraverse(x,visited);
					}
				}	
			}
		}
	}
class Graph1{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of vertices : ");
		int V = sc.nextInt();
		System.out.println("Enter the number of edges : ");
		int E = sc.nextInt();
		Graph g = new Graph(V);
		for(int i=0;i<E;i++)
		{
			int u = sc.nextInt();
			int v = sc.nextInt();
			g.addEdge(u, v);
		}
		g.printGraph();
		System.out.println("Enter the starting vertex for BFS : ");
		int b=sc.nextInt();
		g.BFS(b);
		System.out.println("\nEnter the starting vertex for DFS : ");
		int d=sc.nextInt();
		g.DFS(d);
	}
}
//example for graph
/*
5
6
0
1
0
2
2
3
3
1
0
3
3
4
*/
