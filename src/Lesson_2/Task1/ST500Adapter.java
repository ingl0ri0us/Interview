package Lesson_2.Task1;

import java.time.LocalDateTime;
import java.time.ZoneOffset;

public class ST500Adapter implements MeteoSensor {

    SensorTemperature sensorInfo;

    public ST500Adapter(SensorTemperature sensorInfo) {
        this.sensorInfo = sensorInfo;
    }

    @Override
    public int getId() {
        return sensorInfo.identifier();
    }

    @Override
    public Float getTemperature() {
        return (float) sensorInfo.temperature();
    }

    @Override
    public Float getHumidity() {
        return null;
    }

    @Override
    public Float getPressure() {
        return null;
    }

    @Override
    public LocalDateTime getDateTime() {
        return LocalDateTime
                .of(sensorInfo.year(),1,1,0,0,0,0)
                .plusDays(sensorInfo.day()-1)
                .plusSeconds(sensorInfo.second());
    }
}
