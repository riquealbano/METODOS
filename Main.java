
public class Main{
    public static class Metodos{
        
        // Metodo que indica se o número é positivo ou negativo
        public String positivoNegativo(int x){
            // Se x for maior ou igual a zero ele sera considerado positivo
            if (x>=0) {
                return ("o valor " +x+ " é positivo");
                // Em qualquer outro caso, ele sera negativo
            }else{
                return ("o valor " +x+ " é negativo");
            }
        }
        
        // Metodo que retira a média de 3 valores
        public double mediaAritmetica(double a, double b, double c){
            return (a+b+c)/3;
        }
        
        // Método que apresenta apenas o maior número
        public double maior(int a, int b, int c){
            if (a>b && a>c) {
                return(a);
            } else if (b>a && b>c) {
                return(b);
            } else {
                return(c); // Se nem A nem B forem as maiores, automaticamente C será a maior
            }
        }
        
        // metodo que soma duas variáveis (não entendi ao certo a questão)
        public int juntos(int a, int b){
            return (a)+(b);
        }
        
        // Método que separa minutos em qtd de horas e minutos, facilitando visualização
        public String horaMinuto(int min) {
            int horas = min / 60;
            int minutos = min % 60;
            return horas + " horas e " + minutos + " minutos";
        }
    
        // Método que possibilita calculo de qualquer fatorial
        public int fatorial(int num) {
            long fatorial = 1; // Usei de conhecimento que 0 fatorial seria 1
            for (int i = 1; i <= num; i++) {
                fatorial *= i;
            }
            return (int) fatorial;
            }
        }
    
    
    public static void main(String[] args) {
        
        // Criação do objeto "met"
        Metodos met = new Metodos();
        
        // Print de todos os métodos com seus valores
        System.out.println(met.positivoNegativo(-8));
        System.out.println("Média: " + met.mediaAritmetica(9, 15, 5));
        System.out.println("Maior número: " + met.maior(10, 20, 9));
        System.out.println("Soma: " + met.juntos(5, 6));
        System.out.println(met.horaMinuto(340));
        System.out.println("Fatorial: " + met.fatorial(4));	
    }
}
    