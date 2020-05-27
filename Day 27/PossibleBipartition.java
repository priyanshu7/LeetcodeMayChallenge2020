package may2020;

import java.util.*;

public class PossibleBipartitation {
	
    public static boolean possibleBipartition(int N, int[][] dislikes) {
        Map<Integer, List<Integer>> graph = new HashMap<>();
        int[] visited = new int[N+1];
        for(int i = 1; i <= N; i++) {
        	graph.put(i, new ArrayList<Integer>());
        }
        for(int i = 0; i < dislikes.length; i++){
            graph.get(dislikes[i][0]).add(dislikes[i][1]);
            graph.get(dislikes[i][1]).add(dislikes[i][0]);
        }
        for(int i = 1; i <= N; i++) {
        	if(visited[i] == 0) {
        		visited[i] = 15;
            	Queue<Integer> q = new LinkedList<>();
            	q.offer(i);
            	while(!q.isEmpty()) {
            		int temp = q.poll();
            		for(int nbr : graph.get(temp)) {
            			if(visited[nbr] == 0) {
            				visited[nbr] = (visited[temp] == 15)? 16 : 15;
            				q.add(nbr);
            			}else if(visited[temp] == visited[nbr]) {
            				return false;
            			}
            		}
            	}
        	}
        }
        return true;
    }
    
    public static void main(String[] args) {
		int[][] arr = {{1,2},{2,4},{1,3}};
		System.out.println(possibleBipartition(4,arr));
	}

}
