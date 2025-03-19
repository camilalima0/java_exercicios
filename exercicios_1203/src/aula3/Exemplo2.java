/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula3;

/**
 *
 * @author marti
 */
public class Exemplo2 {

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Ze");
        Pessoa p2 = new Aluno("Maria", "23424234");
        Pessoa p3 = new Professor("Jao", "Doutor");
        Aluno a1 = (Aluno) p2;
        System.out.println(a1.getRa());
        System.out.println(p2.getNome());
        System.out.println(a1.pronomeTratamento("F"));
        
        Professor pr1 = (Professor) p3;
        System.out.println(pr1.getTitulo());
        System.out.println(pr1.getNome());
        System.out.println(pr1.pronomeTratamento("F"));
        
        System.out.println(p3.pronomeTratamento("M"));
        
        //Professor pr2 = (Professor) p2;
        
    }
}
