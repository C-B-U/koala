package 강재혁;

import java.util.*;

public class Day15_26 {
    static boolean visited[];
    static ArrayList<Integer> A[];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int start = sc.nextInt();

        A = new ArrayList[N + 1];
        for (int i = 1; i <= N; i++) {
            A[i] = new ArrayList<Integer>();
        }
        for (int i = 0; i < M; i++) {
            int S = sc.nextInt();
            int E = sc.nextInt();
            A[S].add(E);
            A[E].add(S);
        }
        for (int i = 1; i <= N; i++) {
            Collections.sort(A[i]);
        }
        visited = new boolean[N + 1];
        DFS(start);
        System.out.println();
        visited = new boolean[N + 1];
        BFS(start);
        System.out.println();
    }

    public static void DFS(int Node) {
        System.out.print(Node + " ");
        visited[Node] = true;
        for (int i : A[Node]) {
            if (!visited[i]) {
                DFS(i);
            }
        }
    }

    public static void BFS(int Node) {
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(Node);
        visited[Node] = true;

        while (!queue.isEmpty()) {
            int nowNode = queue.poll();
            System.out.print(nowNode + " ");
            for (int i : A[nowNode]) {
                if (!visited[i]) {
                    visited[i] = true;
                    queue.add(i);
                }
            }
        }
    }
}
