import javax.swing.JOptionPane;

class Validado{
    public static void main(String args[]){
        JOptionPane jop = new JOptionPane();

        int idade = Integer.parseInt(jop.showInputDialog(null, "Digite sua idade"));

        if(151 > idade && idade > 0){
            if (idade >= 18){
                jop.showMessageDialog(null, "É de maior, entrada valida");
            }

            else{
                jop.showMessageDialog(null, "É de menor, entrada invalida");
            }
            
        }

        else{
            jop.showMessageDialog(null, "invalido");
        }

    }    
}