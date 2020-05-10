package graphs_questions;

public class TownJudge {
	
	public int findJudge(int N, int[][] trust) {
        if(N == 1 && trust.length == 0)return 1;
        if(N == 0 || trust.length == 0)return -1;
        int[] indegree = new int[N];
        int[] outdegree = new int[N];
        for(int i = 0; i < trust.length; i++){
            indegree[trust[i][1] - 1]++;
            outdegree[trust[i][0] - 1]++;
        }
        for(int i = 0; i < N; i++){
            if(indegree[i] == N-1 && outdegree[i] == 0){
                return i + 1;
            }
        }
        return -1;
    }

}
