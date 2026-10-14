package POO.clasesyobjetosp.c2;

public class CuentaBancaria {
    // 6. Crea una clase BankAccount con atributo balance y un método deposit() que sume el saldo.
    private String titular;
    private Double saldo;
    private String nip;

    public CuentaBancaria(String titular,Double saldoinicial,String nip){
        this.titular=titular;
        this.saldo=saldoinicial;
        this.nip=nip;
    }
    //validarnip lo que hace es comparar el nip que vas a guardar con el que vas a introducir
    public boolean validarnip(String nipingresado){
        return this.nip.equals(nipingresado);
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
