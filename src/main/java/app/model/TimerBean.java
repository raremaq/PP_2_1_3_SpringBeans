package app.model;

import org.springframework.stereotype.Component;

@Component
public class TimerBean {
    private Timer timer;

    public TimerBean() {
        this.timer = new Timer();
    }

    public Timer getTimer() {
        return timer;
    }
}
