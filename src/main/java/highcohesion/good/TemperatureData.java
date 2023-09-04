package highcohesion.good;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class TemperatureData {
    private int temperature;

    private int calculateTemperatureDifference(int temperature) {
        return this.temperature - temperature;
    }
}

/**
 * Таким образом, бизнес-логика в каждом из классов является «сильно зацепленной»,
 * эти классы легко переиспользовать, образуя любые комбинации.
 */
