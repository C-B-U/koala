import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Day13_01 {
    static boolean visited[];
    static ArrayList<Integer>[] A;
    public static void main(String[] args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int n=Integer.parseInt(st.nextToken());
        int m=Integer.parseInt(st.nextToken());
        A=new ArrayList[n+1];
        visited=new boolean[n+1];
        for(int i=1;i<n+1;i++){
            A[i]=new ArrayList<Integer>();
        }

        for(int i=0;i<m;i++){
            st=new StringTokenizer(br.readLine());
            int s=Integer.parseInt(st.nextToken());
            int e=Integer.parseInt(st.nextToken());
            A[s].add(e);
            A[e].add(s);
        }
        int count=0;
        for(int i=1;i<n+1;i++){
            if(!visited[i]){
                count++;
                Dfs(i);
            }
        }
        System.out.print(count);
    }
    static void Dfs(int v){
        if(visited[v]){
            return;
        }
        visited[v]=true;
        for(int i:A[v]){
            if(visited[i]==false){
                Dfs(i);
            }
        }
    }
}