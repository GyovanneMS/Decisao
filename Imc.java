import javax.swing.JOptionPane;

class Imc{
    public static void main(String args[]){
        JOptionPane jop = new JOptionPane();

        double altura = Double.parseDouble(jop.showInputDialog(null, "Digite sua altura"));
        double peso = Double.parseDouble(jop.showInputDialog(null, "Digite seu peso"));

        double imc = peso/Math.pow(altura,2);

        if(imc < 17 ){
            jop.showMessageDialog(null, "IMC = Abaixo de 17 Muito abaixo do peso");
        }

    }
}