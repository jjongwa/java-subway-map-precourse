package subway.domain.station;

public class StationController {
    public void setting(){
//        Station 교대역 = ;
//        Station 강남역 = ;
//        Station 역삼역 = ;
//        Station 남부터미널역 = ;
//        Station 양재역 = ;
//        Station 양재시민의숲역 = ;
//        Station 매봉역 = ;
        StationRepository.addStation(new Station("교대역"));
        StationRepository.addStation(new Station("강남역"));
        StationRepository.addStation(new Station("역삼역"));
        StationRepository.addStation(new Station("남부터미널역"));
        StationRepository.addStation(new Station("양재역"));
        StationRepository.addStation(new Station("양재시민의숲역"));
        StationRepository.addStation(new Station("매봉역"));
//        StationRepository.addStation(new Station("매"));
//        StationRepository.deleteStation("양재시민의숲역");

        for(int st = 0; st < StationRepository.stations().size(); st++){
            System.out.println(StationRepository.stations().get(st).getName());
        }
    }


}
