package JavaDesignPatterns.State.Abuse;

public class StopWatch {
    private State currentState = new StoppedState(this);

    public void click() {
        currentState.click();
    }
    public State getCurrentState() {
        return currentState;
    }

    public void setCurrentState(State currentState) {
        this.currentState = currentState;
    }

    //    private  boolean isRunning;
//    public void click () {
//        if (isRunning) {
//            isRunning = false;
//            System.out.println("Stopped");
//        }else {
//            isRunning = true;
//            System.out.println("Running");
//        }

   // }
}
