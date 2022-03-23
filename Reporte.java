public class Reporte{

    private String cadena;
    private int numero;
    private String valor;
    public Reporte(String cadena, int numero, String valor) {
        this.cadena = cadena;
        this.numero = numero;
        this.valor = valor;
    }
    public static void main(String[] args) {
        System.out.println("Hola Reporte");
        System.out.println("Hola Inés");
    }
    public String getCadena() {
        return cadena;
    }
    public void setCadena(String cadena) {
        this.cadena = cadena;
    }
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public String getValor() {
        return valor;
    }
    public void setValor(String valor) {
        this.valor = valor;
    }


    
}