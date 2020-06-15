package excondicional5;
    import java.util.Scanner;
public class ExCondicional5 {

    public static void main(String[] args) {
        double n1, n2, media1, media2, exame;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite a primeira nota");
        n1 = entrada.nextDouble();
        System.out.println("Digite a segunda nota");
        n2 = entrada.nextDouble();
        System.out.println("Digite a nota de exame");
        exame = entrada.nextDouble();
        media1 = (n1 + n2) / 2;
        media2 = (n1 + n2 + exame) / 2;
        if (media1 >= 7)
        {
            System.out.println("O aluno foi aprovado sem precisar do exame"+ media1);
        }
        else
        {
            if (media2 >= 5)
                System.out.println("O aluno foi aprovado com nota de exame"+ media2);
        }
        if (media2 < 5)
        {
            System.out.println("O aluno não foi aprovado"+ media2);
        }
    }   
}
