package subway.domain.station;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Station {
    private String name;
    private List<String> line = new ArrayList<>();

    public Station(String name) {
        checkNameLength(name);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // 추가 기능 구현
    private void checkNameLength(String name) {
        if (name.length() < 2)
            throw new IllegalArgumentException();
    }

    public boolean hasLine() {
        return this.line.size() > 0;
    }

    public void addLine(String lineName) {
        this.line.add(lineName);
    }

    public void deleteLine(String lineName) {
        this.line.remove(lineName);
    }
}