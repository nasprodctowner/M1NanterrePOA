package fr.parisnanterre.m1miage.pattern.state.simpleMachine.api;

public class MachineACafeStateChoix implements MachineACafeState{

    @Override
    public void askCoeffe(MachineACafeContext context) {
        context.setMachineACafeState(new MachineACafeStateInitial());
        System.out.println("Un café !");
    }

    @Override
    public void askTea(MachineACafeContext context) {
        context.setMachineACafeState(new MachineACafeStateInitial());
        System.out.println("Un Thé !");
    }

    @Override
    public String toString() {
        return "Etat de choix";
    }

}
