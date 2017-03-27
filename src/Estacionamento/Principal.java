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

public class Principal {
        
    public VagaIndividual[] minhasVagas = new VagaIndividual[24];
    public VagaIndividual novasVagas = new VagaIndividual();
    
    public static void main(String[] args) {
       Estacionamento est = new Estacionamento();
       est.iniciar();
    }
    
    
    

}
