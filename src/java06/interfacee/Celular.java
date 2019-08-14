package java06.interfacee;

public class Celular implements IEletronico{
    private boolean ligado = false;

    @Override
    public void ligar(){
        if(!this.ligado){
            this.ligado = true;
            System.out.println("Celular da marca "+this.MARCA+" ligando...");
        }else{
            System.out.println("Celular da marca "+this.MARCA+" já ligado.");
        }
    }

    @Override
    public void desligar(){
        if(this.ligado){
            this.ligado = false;
            System.out.println("Celular da marca "+this.MARCA+" desligando...");
        }else{
            System.out.println("Celular da marca "+this.MARCA+" já desligado.");
        }
    }


}