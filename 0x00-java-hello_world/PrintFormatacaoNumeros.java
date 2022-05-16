import java.util.Locale;
import java.text.NumberFormat;
public class PrintFormatacaoNumeros {
    public static void main(String[] args) {
        float taxa = 0.2456f;
        float valor = 7654.321f;
        NumberFormat n = NumberFormat.getInstance(new Locale("en","US")); //locale usaremos bastante nas aulas
        n.setMaximumFractionDigits(2);
        System.out.printf("Valor: R$ %s\nTaxa: %.2f%%\n", n.format(valor), taxa);
    }
}