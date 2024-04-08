package org.enes.utility;


import org.enes.entity.Celebrity;
import org.enes.entity.CelebrityCharacteristics;
import org.enes.entity.Competitor;
import org.enes.repository.CelebrityCharacteristicsRepository;
import org.enes.repository.CelebrityRepository;
import org.enes.repository.CompetitionRepository;
import org.enes.repository.CompetitorRepository;
import org.enes.utility.enums.EGender;

import java.time.LocalDate;

public class DataImpl {
    CelebrityRepository celebrityRepository;
    CompetitionRepository competitionRepository;
    CompetitorRepository competitorRepository;
    CelebrityCharacteristicsRepository celebrityCharacteristicsRepository;

    public DataImpl(){
        this.celebrityRepository = new CelebrityRepository();
        this.competitionRepository = new CompetitionRepository();
        this.competitorRepository = new CompetitorRepository();
        this.celebrityCharacteristicsRepository = new CelebrityCharacteristicsRepository();
    }

    public void createData(){
        createCelebrities();
        createCompetitors();
    }

    private void createCelebrities() {
        CelebrityCharacteristics characteristics1 = CelebrityCharacteristics.builder()
                .gender(EGender.MALE)
                .height("157")
                .weight("78")
                .nationality("USA")
                .dateOfBirth(LocalDate.of(1979, 07, 06))
                .occupation("Actor")
                .netWorth("450 Million $$")
                .build();
        Celebrity celebrity1 = Celebrity.builder()
                .name("Kevin")
                .surname("Hart")
                .photoUrl("KH.url")
                .build();
        celebrity1.setCharacteristics(characteristics1);
        characteristics1.setCelebrity(celebrity1);
        celebrityRepository.save(celebrity1);
        celebrityCharacteristicsRepository.save(characteristics1);

        CelebrityCharacteristics characteristics2 = CelebrityCharacteristics.builder()
                .gender(EGender.MALE)
                .height("178")
                .weight("100")
                .nationality("USA")
                .dateOfBirth(LocalDate.of(1966, 6, 30))
                .occupation("Professional Boxer")
                .netWorth("1 Million $$")
                .build();
        Celebrity celebrity2 = Celebrity.builder()
                .name("Mike")
                .surname("Tyson")
                .photoUrl("MK.url")
                .build();
        celebrity2.setCharacteristics(characteristics2);
        characteristics2.setCelebrity(celebrity2);
        celebrityRepository.save(celebrity2);
        celebrityCharacteristicsRepository.save(characteristics2);

        CelebrityCharacteristics characteristics3 = CelebrityCharacteristics.builder()
                .gender(EGender.MALE)
                .height("182")
                .weight("80")
                .nationality("Brazil")
                .dateOfBirth(LocalDate.of(1980, 3, 21))
                .occupation("Footballer")
                .netWorth("93 Million $$")
                .build();
        Celebrity celebrity3 = Celebrity.builder()
                .name("Ronaldinho")
                .surname("Moreira")
                .photoUrl("RM.url")
                .build();
        celebrity3.setCharacteristics(characteristics3);
        characteristics3.setCelebrity(celebrity3);
        celebrityRepository.save(celebrity3);
        celebrityCharacteristicsRepository.save(characteristics3);

        CelebrityCharacteristics characteristics4 = CelebrityCharacteristics.builder()
                .gender(EGender.FEMALE)
                .height("175")
                .weight("63")
                .nationality("UK")
                .dateOfBirth(LocalDate.of(1988, 5, 5))
                .occupation("Musician")
                .netWorth("200 Million $$")
                .build();
        Celebrity celebrity4 = Celebrity.builder()
                .name("Adele")
                .surname("Adkins")
                .photoUrl("AP.url")
                .build();
        celebrity4.setCharacteristics(characteristics4);
        characteristics4.setCelebrity(celebrity4);
        celebrityRepository.save(celebrity4);
        celebrityCharacteristicsRepository.save(characteristics4);

        CelebrityCharacteristics characteristics5 = CelebrityCharacteristics.builder()
                .gender(EGender.MALE)
                .height("170")
                .weight("72")
                .nationality("Argentina")
                .dateOfBirth(LocalDate.of(1987, 6, 24))
                .occupation("Footballer")
                .netWorth("500 Million $$")
                .build();
        Celebrity celebrity5 = Celebrity.builder()
                .name("Lionel")
                .surname("Messi")
                .photoUrl("LM.url")
                .build();
        celebrity5.setCharacteristics(characteristics5);
        characteristics5.setCelebrity(celebrity5);
        celebrityRepository.save(celebrity5);
        celebrityCharacteristicsRepository.save(characteristics5);

        CelebrityCharacteristics characteristics6 = CelebrityCharacteristics.builder()
                .gender(EGender.FEMALE)
                .height("155")
                .weight("55")
                .nationality("USA")
                .dateOfBirth(LocalDate.of(1986, 3, 28))
                .occupation("Singer")
                .netWorth("180 Million $$")
                .build();
        Celebrity celebrity6 = Celebrity.builder()
                .name("Lady")
                .surname("Gaga")
                .photoUrl("LG.url")
                .build();
        celebrity6.setCharacteristics(characteristics6);
        characteristics6.setCelebrity(celebrity6);
        celebrityRepository.save(celebrity6);
        celebrityCharacteristicsRepository.save(characteristics6);

        CelebrityCharacteristics characteristics7 = CelebrityCharacteristics.builder()
                .gender(EGender.MALE)
                .height("188")
                .weight("80")
                .nationality("Canada")
                .dateOfBirth(LocalDate.of(1986, 10, 24))
                .occupation("Actor")
                .netWorth("200 Million $$")
                .build();
        Celebrity celebrity7 = Celebrity.builder()
                .name("Ryan")
                .surname("Reynolds")
                .photoUrl("RR.url")
                .build();
        celebrity7.setCharacteristics(characteristics7);
        characteristics7.setCelebrity(celebrity7);
        celebrityRepository.save(celebrity7);
        celebrityCharacteristicsRepository.save(characteristics7);

        CelebrityCharacteristics characteristics8 = CelebrityCharacteristics.builder()
                .gender(EGender.FEMALE)
                .height("180")
                .weight("58")
                .nationality("Australia")
                .dateOfBirth(LocalDate.of(1967, 6, 20))
                .occupation("Actress")
                .netWorth("250 Million $$")
                .build();
        Celebrity celebrity8 = Celebrity.builder()
                .name("Nicole")
                .surname("Kidman")
                .photoUrl("NK.url")
                .build();
        celebrity8.setCharacteristics(characteristics8);
        characteristics8.setCelebrity(celebrity8);
        celebrityRepository.save(celebrity8);
        celebrityCharacteristicsRepository.save(characteristics8);

        CelebrityCharacteristics characteristics9 = CelebrityCharacteristics.builder()
                .gender(EGender.MALE)
                .height("182")
                .weight("85")
                .nationality("Canada")
                .dateOfBirth(LocalDate.of(1986, 10, 24))
                .occupation("Rapper")
                .netWorth("150 Million $$")
                .build();
        Celebrity celebrity9 = Celebrity.builder()
                .name("Drake")
                .surname("Graham")
                .photoUrl("DG.url")
                .build();
        celebrity9.setCharacteristics(characteristics9);
        characteristics9.setCelebrity(celebrity9);
        celebrityRepository.save(celebrity9);
        celebrityCharacteristicsRepository.save(characteristics9);

        CelebrityCharacteristics characteristics10 = CelebrityCharacteristics.builder()
                .gender(EGender.MALE)
                .height("183")
                .weight("80")
                .nationality("UK")
                .dateOfBirth(LocalDate.of(1946, 3, 6))
                .occupation("Musician")
                .netWorth("180 Million $$")
                .build();
        Celebrity celebrity10 = Celebrity.builder()
                .name("David")
                .surname("Gilmour")
                .photoUrl("DG.url")
                .build();
        celebrity10.setCharacteristics(characteristics10);
        characteristics10.setCelebrity(celebrity10);
        celebrityRepository.save(celebrity10);
        celebrityCharacteristicsRepository.save(characteristics10);
    }
    private void createCompetitors(){
        for(int i = 0; i<5;i++) {
            Competitor competitor = new Competitor();
            competitor.setName("Competitor "+(i+1));
            competitor.setWins(0);
            competitorRepository.save(competitor);
        }
    }
}
