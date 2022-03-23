package br.ulbra.classes;

import javax.swing.JOptionPane;

/**
 *
 * @author Priscila Butzke
 */
public class Aluno {
    private String nome;
    private double notas[];
    
    public Aluno(){
        notas = new double[3]; // caso precise de mais notas, basta alterar o valor.
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNotas(int i) { // precisa ser alterado quando tem vetor
        return notas[i];
    }

    public void setNotas(double nota, int i) { // precisa ser alterado quando tem vetor
        this.notas[i] = nota;
    }
    
    public int getSize(){
        return notas.length; // legth retora o tamanho do vetor
    }
    public double calcularMedia(){
        double ac=0; //ac pega a soma de todas as notas
        int i;
        for (i=0; i<getSize();i++){
            ac = ac + notas[i];  
        }
        ac = ac /i;
        return ac;
    }
    public String toString(){
        String resp = "Boletim \n";    
        resp +="--------------------\n"
        + "Nome: " +getNome();
        String resp1="";
        for (int i=0; i<getSize();i++){
            resp1+= "\nNota " + (i+1)+": "
                    +getNotas(i);
    }
    resp += resp1 +"\n--------------------\n"
            +"Média: " +calcularMedia();
        return resp;
        
    }
    public static void main(String[] args) {
        Aluno a = new Aluno();
        /* Metodo 1 para setar o nome e as notas:
        a.setNome("Priscila");
        a.setNotas(7, 0); //nota 7 possição 0
        a.setNotas(8, 1); // nota 8 posição 1
        a.setNotas(4.8, 2); */
        
        //metodo 2 para digitar o nome e as notas no console
        
        a.setNome(JOptionPane.showInputDialog("Digite o nome do aluno: "));
        
        for (int i=0; i<a.getSize(); i++){
        a.setNotas(Double.parseDouble(JOptionPane.showInputDialog("Digite as notas: ")), i);
        }
        JOptionPane.showMessageDialog(null, a.toString());
    }
}
