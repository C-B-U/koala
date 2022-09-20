import java.util.Scanner;

public class Q02
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int scores[] = new int[N]; //���� ���� ����

        for(int i=0;i<N;i++)
        {
            scores[i] = scanner.nextInt();
        }

        int Max = scores[0];

        for(int i=1; i<N; i++) //�ִ� ���� Max ã��
        {
            if(Max < scores[i])
            {
                Max = scores[i];
            }
        }

        double new_scores[] = new double[N]; //���۵� ����

        for(int i=0; i<N; i++)
        {
            new_scores[i] = ((double)scores[i]/Max)*100;
        }


        double sum = 0; //���۵� ������ ��

        
        for(int i=0;i<N;i++)
        {
            sum = sum + new_scores[i];
        }

        double avg = (double)sum/N; //���۵� ��� ����

        System.out.println(avg);

    }
}
