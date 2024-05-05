package JavaDesignPatterns.State.Abuse;

public class StoppedState implements State{
    private final StopWatch stopWatch;

    public StoppedState(StopWatch stopWatch) {
        this.stopWatch = stopWatch;


    }

    @Override
    public void click() {
        stopWatch.setCurrentState(new RunningState(stopWatch));
        System.out.println("Running");

    }
}
