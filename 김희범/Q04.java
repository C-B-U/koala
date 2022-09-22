import java.util.Comparator;
import java.util.Scanner;
import java.util.Arrays;

public class Q04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt(); //���� ����
        int ary[][] = new int[N][2]; //2���� ����� ǥ���ϱ� ���� �迭

        for(int i=0; i<N; i++){
            ary[i][0] = scanner.nextInt(); //x��ǥ
            ary[i][1] = scanner.nextInt(); //y��ǥ
        }

        Arrays.sort(ary, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) { //o1,o2�� 2�����迭�� ���

                if(o1[0] != o2[0]){ //o1[0]�� x��ǥ, o1[1]�� y��ǥ
                    return o1[0] - o2[0]; //x��ǥ�� ���� ������ x��ǥ�� ���̸� ������ �������� ����
                }

                else{
                    return o1[1] - o2[1]; //x��ǥ�� ������ y��ǥ�� ���̸� ������ �������� ����
                }

            }
        });

        for(int i=0; i<N; i++){
            System.out.println(ary[i][0]+" "+ary[i][1]);
        }

        scanner.close();


    }
}

