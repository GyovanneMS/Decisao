import javax.swing.JOptionPane;

class Imc{
    public static void main(String args[]){
        JOptionPane jop = new JOptionPane();

        double altura = Double.parseDouble(jop.showInputDialog(null, "Digite sua altura"));
        double peso = Double.parseDouble(jop.showInputDialog(null, "Digite seu peso"));

        double imc = peso/Math.pow(altura,2);

        if(imc > 17 ){
            if(imc >= 18.49){
                if(imc >= 24.99){
                    if(imc >= 29.99){
                        if(imc >= 34.99){
                            if(imc >= 39.99 );
                        }
                        else{

                        }
                    }
                    else{

                    }
                }
                else{

                }
            }
            

            else{

            }
        }

        else{
            jop.showMessageDialog(null, "IMC = Abaixo de 17 Muito abaixo do peso");
        }
    }
}