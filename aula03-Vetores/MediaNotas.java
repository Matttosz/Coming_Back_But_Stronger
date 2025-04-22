import java.util.Scanner;

public class MediaNotas {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        double[][] NotasAlunos = new double[10][4]; 
        double[] MediaAluno = new double[10];

        for (int Notas = 0; Notas < 10; Notas++)
        {
            System.out.println("Aluno" + (Notas + 1) + ":");
            	for (int Aluno = 0; Aluno < 4; Aluno++)
            	{
                System.out.print("  Nota " + (Aluno + 1) + ": ");
                NotasAlunos[Notas][Aluno] = read.nextDouble();
            	}
        }

        for (int i = 0; i < 10; i++)
        {
            double soma = 0;
            for (int j = 0; j < 4; j++)
            {
                soma += NotasAlunos[i][j];
            }
            MediaAluno[i] = soma / 4.0;
        }

        System.out.println("\nMédias dos participantes:");
        for (int i = 0; i < 10; i++)
        {
            System.out.printf("Participante %d: %.2f\n", i + 1, MediaAluno[i]);
        }

        read.close();
    }
}
