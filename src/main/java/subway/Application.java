package subway;

import subway.domain.station.StationController;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        // TODO: 프로그램 구현
        StationController stationController = new StationController();
        stationController.setting();
        OutputView outputView = new OutputView();
        outputView.mainView();
        InputView inputView = new InputView();
        inputView.readFunction();

    }
}
