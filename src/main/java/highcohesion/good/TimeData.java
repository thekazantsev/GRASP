package highcohesion.good;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class TimeData {
    private int time;

    private int calculateTimeDifference(int time) {
        return this.time - time;
    }
}
