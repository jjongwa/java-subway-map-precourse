package subway.domain.line;

import java.util.ArrayList;
import java.util.List;

public class Line {
    private String name;
    private List<String> lineStations = new ArrayList<>();

    public Line(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // 추가 기능 구현
    public void startSetting(String st, String end) {
        this.lineStations.add(st);
        this.lineStations.add(end);
    }

    public void appendStation(String station, int number) {
        if (number < 1 || number > lineStations.size() + 1)
            throw new IllegalArgumentException();

        lineStations.add(number - 1, station);
    }

    public boolean popStation(String station) {
        return lineStations.remove(station);
    }

}
