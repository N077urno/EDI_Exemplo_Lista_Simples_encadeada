/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.projetolistaencadeada;

/**
 *
 * @author nando
 */
public class ProjetoListaEncadeada {

    public static void main(String[] args) {
        ListaLigada lista = new ListaLigada();
        
        Paciente p1 = new Paciente("Ana",20,'f');
        Paciente p2 = new Paciente("Joao",25,'m');
        Paciente p3 = new Paciente("Maria",17,'f');
        Paciente p4 = new Paciente("Jose",30,'m');
        Paciente p5 = new Paciente("Olivia",22,'f');
        
        lista.adiciona(p1);
        lista.adiciona(p3);
        lista.adiciona(p5);
        lista.adiciona(p2);
        lista.adiciona(p4);
        
        Paciente atual;
        
        for(int i=0; i < lista.tamanho();i++){
            atual = (Paciente)lista.pega(i);
            System.out.println("----------");
            System.out.println("Dados do Paciente..: "+i);
            System.out.println("Nome..: "+atual.nome);
            System.out.println("Idade..: "+atual.idade);
            System.out.println("Sexo..: "+atual.sexo);
            System.out.println("----------");
        }
        
        lista.removeDoComeco();
        
        Paciente p6 = new Paciente("Carla",18,'f');
        Paciente p7 = new Paciente("Carlos",18,'m');
        
        lista.adiciona(2, p6);
        lista.adiciona(1, p7);
        
        for(int i=0; i < lista.tamanho();i++){
            atual = (Paciente)lista.pega(i);
            System.out.println("----------");
            System.out.println("Dados do Paciente..: "+i);
            System.out.println("Nome..: "+atual.nome);
            System.out.println("Idade..: "+atual.idade);
            System.out.println("Sexo..: "+atual.sexo);
            System.out.println("----------");
        }
    }
}
