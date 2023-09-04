package highcohesion.bad;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Data {
    private int temperature;
    private int time;

    private int calculateTimeDifference(int time) {
        return this.time - time;
    }

    private int calculateTemperatureDifference(int temperature) {
        return this.temperature - temperature;
    }
}

/**
 * Представленный класс содержит бизнес — логику по работе как с температурой, так и со временем.
 *  Они не имеют ничего общего, за исключением того, что собираются с одного датчика.
 * Если мы захотим переиспользовать бизнес — логику, связанную по работе только с температурой, то осуществить это легко не получится.
 * Если проводить параллели с принципами SOLID, то класс нарушает SRP: через него проходят две оси изменения.
 */
