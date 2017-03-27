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
public class Estacionamento {
    Principal prin = new Principal();
    Scanner teclado = new Scanner(System.in);
    String placaLiberar;
    
        int chamarMenu(){       
            int opcaoMenu;
            System.out.println("Digite a opção desejada");
            System.out.println("1 - Registrar novo cliente");
            System.out.println("2 - Liberar cliente/vaga");
            opcaoMenu = teclado.nextInt();
            
            if(opcaoMenu!=1&&opcaoMenu!=2&&opcaoMenu!=3){
                System.out.println("OPÇÃO INVÁLIDA!\n\n");
                chamarMenu();
            }
            return opcaoMenu;
    }
        
        public void iniciar(){
            for(int i=0;i<24;i++){
            prin.minhasVagas[i] = new VagaIndividual();
            prin.minhasVagas[i].vagaOcupada=false;
            prin.minhasVagas[i].horaEntrada=0;
            prin.minhasVagas[i].horaSaida=0;
            prin.minhasVagas[i].placa="";
        }
            teste();
    }
    
    public void teste(){
        if(chamarMenu()==1){
            for(int i=0;i<12;i++){
                if(prin.minhasVagas[i].vagaOcupada == false){
                    prin.minhasVagas[i].registrarCliente();
                    if(i<=11){
                        System.out.println("Orientação: Estacione na vaga E"+(i+1));
                        prin.minhasVagas[i].vagaOcupada=true;
                        break;
                    }else{
                        System.out.println("Orientação: Estacione na vaga D"+(i+1));
                        prin.minhasVagas[i].vagaOcupada=true;
                        break;
                    }
                }
            }
            teste();

        }else{
            teclado.nextLine();
            System.out.println("Digite a placa do cliente que deseja liberar: ");
            placaLiberar = teclado.nextLine();
            
            for(int i=0; i<24; i++){
                if(placaLiberar.equals(prin.minhasVagas[i].placa)){
                    prin.minhasVagas[i].liberarCliente();
                    teste();
                }
            }
            System.out.println("Placa não cadastrada no sistema! Escolha uma nova opção!");
            teste();
        }
    }
}


