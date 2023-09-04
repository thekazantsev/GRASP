package highcohesion.good;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Data {
    private TemperatureData temperatureData;
    private TimeData timeData;

    public Data(int time, int temperature) {
        this.temperatureData = new TemperatureData(temperature);
        this.timeData = new TimeData(time);
    }

    // тут логика по работе как со временем, так и с температурой

}
