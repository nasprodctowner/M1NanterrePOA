package fr.parisnanterre.m1miage.pattern.state.simpleMachine.api;

public class MachineACafeContext {
    private MachineACafeState machineACafeState;
    private int sommeCourante;

    public int getSommeCourante() {
        return sommeCourante;
    }

    public void setSommeCourante(int sommeCourante) {
        this.sommeCourante = sommeCourante;
    }

    public MachineACafeContext() {
        machineACafeState = new MachineACafeStateInitial();
        sommeCourante = 0;
    }

    public void give(int argent, int choix){

        if(choix == 0){

        if (sommeCourante+argent>=10){
            machineACafeState = new MachineACafeStateChoix();
            machineACafeState.askCoeffe(this);

        }  else{
            machineACafeState = new MachineACafeStateInitial();
            machineACafeState.askCoeffe(this);
        }
        sommeCourante += argent;
        }else if(choix == 1) {
            if (sommeCourante+argent >= 10) {
                machineACafeState = new MachineACafeStateChoix();
                machineACafeState.askTea(this);

            } else {
                machineACafeState = new MachineACafeStateInitial();
                machineACafeState.askTea(this);

            }
            sommeCourante += argent;
        }

    }

    public void setMachineACafeState(MachineACafeState machineACafeState){
        this.machineACafeState = machineACafeState;
    }

    public MachineACafeState getMachineACafeState() {
        return machineACafeState;
    }

}
