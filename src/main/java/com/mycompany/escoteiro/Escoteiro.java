
package com.mycompany.escoteiro;


public class Escoteiro {

    
    private String posto;
    private int tempo;
    private int salario;
    private int subsidio;
    private int subsidioExtra;
    
    public Escoteiro(String posto, int tempo) {
        this.posto = posto;
        this.tempo = tempo;
    }
    
    public int getTempo(){
        return tempo;
    }
    public void setTempo(int tempo){
        this.tempo = tempo;
    }
    public String getPosto(){
        return posto;
    }
    public void setPosto(String posto){
        this.posto = posto;
    }
    
    public void calculaSubsidio(){
        if(this.getTempo()> 2){
            this.subsidio = 50;
        }else if(this.getTempo() <= 1){
            this.subsidio = 25;
        }else {
            this.subsidio = 35;
        }
    }
    
    public void calculaSubsidioExtra(){
        if(this.getPosto() == "LOBO"){
            this.subsidioExtra = 10;
        } else if (this.getPosto() == "URSO"){
            this.subsidioExtra = 15;
        } else if (this.getPosto() == "LEÃO"){
            this.subsidioExtra = 20;
        } else {
            this.subsidioExtra = 0;
        }
    }
    
    public int calculaSalario(){
        return this.salario = this.subsidio + this.subsidioExtra;
    }
}
