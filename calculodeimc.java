package calculdeimc;

import javax.swing.JOptionPane;

/**
 *
 * @author Luis Henrique
 */
import java.text.DecimalFormat;

public class Calculdeimc
{
    public static void main (String[] args)
    {
        String nome;
        float peso, altura;
        float imc;
        String resultado;
        
        nome =    JOptionPane.showInputDialog("Qual seu nome?");
        peso =    Float.parseFloat (JOptionPane.showInputDialog("Qual seu peso ?(KG):"));
        altura =  Float.parseFloat (JOptionPane.showInputDialog("Qual sua altura? (Informe em cm):"));
        
        imc = (float) (peso/Math.pow((altura/100),2));
        if (imc <= 17)
            resultado = "Você está muito abaixo do peso, atenção alimente-se melhor e de forma saudavel";
        else
            if(imc >= 17 && imc <=18.49)
                resultado = "Seu peso está um pouco abaixo, precisa ganhar um pouquinho mais de peso, mas não exagere!!";
        else
                if (imc >=18.50 && imc <= 24.99)
                    resultado = "Seu peso está normal, otimo continue assim";
        else
                    if (imc >= 25 && imc <=29.99)
                        resultado = "Você está acima do Peso, pratique exercicios e se alimente de forma saudavel";
        else
                    if (imc >= 30 && imc <=34.99)
                        resultado = "Nivél I de obesidade, fique atento !!";
         else
                    if (imc >= 35 && imc <=39.99)
                        resultado = "Nivel II de obesidade(Severa) fique atento !! ";
        else
                        resultado = "Obesidade móbida. fique atento!!";
        DecimalFormat df = new DecimalFormat("##.##");        
        JOptionPane.showMessageDialog(null,"Olá, "+nome+" o seu IMC é de ="+df.format(imc)+" - "+resultado);
                
    }
    
}