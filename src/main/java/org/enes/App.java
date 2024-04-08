package org.enes;

import org.enes.controller.CelebrityController;
import org.enes.controller.CompetitionController;
import org.enes.controller.CompetitorController;
import org.enes.entity.Celebrity;
import org.enes.entity.Competition;
import org.enes.entity.Competitor;
import org.enes.utility.DataImpl;

import java.util.*;

public class App {
    static Scanner scanner = new Scanner(System.in);
    CelebrityController celebrityController;
    CompetitionController competitionController;
    CompetitorController competitorController;

    public App(){
        this.competitorController = new CompetitorController();
        this.competitionController = new CompetitionController();
        this.celebrityController = new CelebrityController();
    }
    public static void main(String[] args) {
        DataImpl data = new DataImpl();
        data.createData();
        new App().whoAmIApp();


    }


    private void whoAmIApp(){
        System.out.println("Welcome to Who Am I Game!!");
        System.out.println("Please choose an option from menu;");
        int selection = -1;
        List<Celebrity> allCelebrities = celebrityController.findAll();
        while(selection!=0) {
            System.out.println("1- New Game");
            System.out.println("0- Exit");
            System.out.print("Your choice: ");
            selection = Integer.parseInt(scanner.nextLine());

            switch (selection){
                case 1:{
                    newGame(allCelebrities);
                    break;
                }
                case 0:{
                    System.out.println("Thanks for playing...");
                    break;
                }
                default:{
                    System.out.println("Please enter a valid option...");
                }
            }
        }
    }
    private void newGame(List<Celebrity> allCelebrities) {
        List<Competitor> allCompetitors = competitorController.findAll();

        List<Celebrity> celebrityList = new ArrayList<>();
        List<Competitor> competitorList = new ArrayList<>();
        Competition competition = new Competition();
        int competitorCount = 0;
        int celebrityCount = 0;
        Boolean isCorrectAnswer = false;
        String answer = "";

        System.out.print("How many Competitors will compete? : ");
        competitorCount = Integer.parseInt(scanner.nextLine());
        if(competitorCount > allCompetitors.size()){
            competitorList = allCompetitors;
        } else {
            for(int i = 0; i<competitorCount;i++){
                competitorList.add(allCompetitors.get(i));
            }
        }

        System.out.print("How many Celebrities do you wish to guess? : ");
        celebrityCount = Integer.parseInt(scanner.nextLine());

        if(celebrityCount > allCelebrities.size()){
            celebrityList = allCelebrities;
        } else {
            Collections.shuffle(allCelebrities);
            celebrityList.addAll(allCelebrities.subList(0,celebrityCount));
        }
        competition.setCelebrityList(celebrityList);

        Map<Competitor,Integer> scoreCard = new LinkedHashMap<>();
        for (int i =0; i<competitorList.size();i++){
            scoreCard.put(competitorList.get(i),0);
        }

        for(int i = 0;i<celebrityList.size();i++){
            Collections.shuffle(competitorList);
            System.out.println("Round #"+(i+1));
            System.out.println(competition.getCelebrityList().get(i).getCharacteristics());
            System.out.println("Guess the celebrity! ");
            isCorrectAnswer = false;
            while(!isCorrectAnswer){
                for (int j = 0;j<competitorList.size();j++){
                    System.out.print(competitorList.get(j).getName()+"'s answer : ");
                    answer = scanner.nextLine();
                    if(answer.equalsIgnoreCase(celebrityList.get(i).getName()+" "+celebrityList.get(i).getSurname())){
                        System.out.println("Correct answer!!! ");
                        System.out.println(celebrityList.get(i).getName()+"\n"+celebrityList.get(i).getSurname()+"\n"+celebrityList.get(i).getPhotoUrl());
                        scoreCard.put(competitorList.get(j),scoreCard.get(competitorList.get(j))+1);
                        isCorrectAnswer = true;
                        System.out.println("\nScoreboard:");
                        scoreCard.forEach((competitor,score)-> {
                            System.out.println(competitor.getName() +" : "+ score + " points");
                        });
                        break;
                    };
                }
            }
        }
        Competitor winner = findWinner(scoreCard);
        System.out.println("Winner: " + winner.getName()+" with " + scoreCard.get(winner)+ " points!");
        winner.setWins(winner.getWins()+1);
        competitorController.updateWinner(winner);
        competition.setWinner(winner);
        competitionController.save(competition);
    }

    private static Competitor findWinner(Map<Competitor, Integer> scoreCard) {
        List<Map.Entry<Competitor, Integer>> entries = new ArrayList<>(scoreCard.entrySet());

        entries.sort(Map.Entry.<Competitor, Integer>comparingByValue().reversed());

        return entries.get(0).getKey();
    }
}
