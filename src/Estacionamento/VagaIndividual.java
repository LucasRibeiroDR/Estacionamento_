/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estacionamento;
import java.util.Scanner;

/**
 *
 * @author Lucas
 */
public class VagaIndividual {
    Scanner teclado = new Scanner(System.in);
    boolean vagaOcupada = false;
    String placa = "";
    int horaEntrada = 0;
    int horaSaida = 0;
    
    /*public VagaIndividual(){
        vagaOcupada = false;
        placa = "";
        horaEntrada = 0;
        horaSaida = 0;
    }*/
    
    void registrarCliente(){
        System.out.println("Digite a placa do cliente: ");
        placa = teclado.nextLine();
        
        System.out.println("Digite o horário de entrada do cliente: ");
        horaEntrada = teclado.nextInt();
        while(horaEntrada<8||horaEntrada>18){
            System.out.println("Horário inválida! Digite novamente a placa do cliente!");
            horaEntrada = teclado.nextInt();
        }
        teclado.nextLine();
    }
    
    void liberarCliente(){
        VagaIndividual vagas = new VagaIndividual();
        System.out.println("Digite o horario de saída do cliente: ");
        horaSaida = teclado.nextInt();
        while(horaEntrada<8||horaEntrada>18){
                System.out.println("Horário inválido! Digite novamente!");
                horaEntrada = teclado.nextInt();
            }
        System.out.println("Valor total: "+(4+(2*(horaSaida-horaEntrada))));
        vagaOcupada = false;
        horaEntrada=0;
        horaSaida=0;
        placa="";
        teclado.nextLine();
    }
}


