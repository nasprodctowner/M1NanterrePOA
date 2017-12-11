package fr.parisnanterre.m1miage.pattern.state.simpleMachine.api;

public class MachineACafeStateInitial implements MachineACafeState {

    @Override
    public void askCoeffe(MachineACafeContext context) {
        context.setMachineACafeState(new MachineACafeStateChoix());
        System.out.println("Le café coute 10 euros !");
    }

    @Override
    public void askTea(MachineACafeContext context) {
        context.setMachineACafeState(new MachineACafeStateChoix());
        System.out.println("Le thé coute 10 euros !");
    }

    @Override
    public String toString() {
        return "Etat initial";
    }
}
