package fr.parisnanterre.m1miage.pattern.state.simpleMachine.client;


import fr.parisnanterre.m1miage.pattern.state.simpleMachine.api.MachineACafeContext;

import java.util.Scanner;

public class Client {
    public static void main(String[] args){
        MachineACafeContext machineACafeContext = new MachineACafeContext();
        int choix;

        do {
            System.out.println("Somme courante : "+machineACafeContext.getSommeCourante()+"\n");

            Scanner sc = new Scanner(System.in);
            System.out.println("Veuillez choisir une boisson chaude - 10E (0 - café | 1 - thé) ");
            choix = sc.nextInt();

            System.out.println("Paiement ");
            int argent = sc.nextInt();

            machineACafeContext.give(argent, choix);

            System.out.println(machineACafeContext.getMachineACafeState()+"\n");
        }while (machineACafeContext.getMachineACafeState().toString().equals("Etat de choix"));

    }
}
