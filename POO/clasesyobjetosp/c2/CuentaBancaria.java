package POO.clasesyobjetosp.c2;

public class CuentaBancaria {
    // 6. Crea una clase BankAccount con atributo balance y un método deposit() que sume el saldo.
    private String titular;
    private Double saldo;

    public CuentaBancaria(String titular,Double saldoinicial){
        this.titular=titular;
        this.saldo=saldoinicial;
    }

    public void Depositar(Double cantidad){
        if(cantidad<=0){
            saldo=saldo+0;
        }
        else{
            saldo=saldo+cantidad;
        }
    }

    public void Retirar(Double cantidad){
        if(cantidad<=saldo && saldo>0){
            saldo=saldo-cantidad;
            System.out.println("Tu saldo restante es: "+saldo);
        }else{
            System.out.println("Accion Rechazada");
        }
    }

    public void Mostrar(){
        System.out.println("El titular de la cuenta es: "+titular);
        System.out.println("Tu saldo actual es: "+saldo);
    }
}
