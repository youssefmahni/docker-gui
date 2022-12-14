import javax.swing.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Map;
public class Main {

    //start images part ********************************************************************************************************
    static String[][] imagesData ;
    static ArrayList<String[]> arrayListOfImages = new ArrayList<>();
    static String[] imageLine = new String[5];
    static String[] imagesTitles = {"REPOSITORY", "TAG", "IMAGE ID", "CREATED", "SIZE"};
    public static void handelImages(String phrase) {
        String phrase2 = phrase.replaceAll(" {5}","|");
        phrase2 = phrase2.replaceAll(" {4}","|");
        phrase2 = phrase2.replaceAll(" {3}","|");
        phrase2 = phrase2.replaceAll(" {2}","|");
        for (int i = 0; i <5 ; i++) {
            try{
                String helper = phrase2.substring(0,phrase2.indexOf("|"));
                imageLine[i]=helper;
            }catch(Exception e){
                imageLine[i]=phrase2;
            }
            phrase2 = phrase2.substring(phrase2.indexOf("|")+1);
        }
            arrayListOfImages.add(imageLine);
            imagesData=arrayListOfImages.toArray(new String[][]{});
    }
    public static void loadImages(){
        String[] command = {"docker", "images"};
        ProcessBuilder processusBuilder = new ProcessBuilder(command);
        Map<String, String> env = processusBuilder.environment();
        String newEnvPAth = env.get("PATH") + ":/usr/local/bin/";
        env.replace("PATH", newEnvPAth);
        try {
            Process processus = processusBuilder.start();
            BufferedReader lecteur = new BufferedReader(new InputStreamReader(processus.getInputStream()));
            String ligne;
            while ((ligne = lecteur.readLine()) != null) {
//                System.out.println(ligne);
                handelImages(ligne);
            }
            int codeDeSortie = processus.waitFor();
            System.out.println("\nstop avec erreur : " + codeDeSortie);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    //end images part *********************************************************************************************************

    //start containers part ********************************************************************************************************
    static String[][] containersData ;
    static ArrayList<String[]> arrayListOfContainers = new ArrayList<>();
    static String[] containerLine = new String[7];
    static String[] containersTitles = {"CONTAINER ID", "IMAGE", "COMMAND", "CREATED", "STATUS", "PORTS","NAMES" };
    public static void handelContainers(String phrase) {
        String phrase2 = phrase.replaceAll(" {5}","|");
        phrase2 = phrase2.replaceAll(" {4}","|");
        phrase2 = phrase2.replaceAll(" {3}","|");
        phrase2 = phrase2.replaceAll(" {2}","|");
        for (int i = 0; i <7 ; i++) {
            try{
                String helper = phrase2.substring(0,phrase2.indexOf("|"));
                containerLine[i]=helper;
            }catch(Exception e){
                containerLine[i]=phrase2;
            }
            phrase2 = phrase2.substring(phrase2.indexOf("|")+1);
        }
            arrayListOfContainers.add(containerLine);
            containersData=arrayListOfContainers.toArray(new String[][]{});

    }
    public static void loadContainers(){
        String[] command = {"docker", "ps"};
        ProcessBuilder processusBuilder = new ProcessBuilder(command);
        Map<String, String> env = processusBuilder.environment();
        String newEnvPAth = env.get("PATH") + ":/usr/local/bin/";
        env.replace("PATH", newEnvPAth);
        try {
            Process processus = processusBuilder.start();
            BufferedReader lecteur = new BufferedReader(new InputStreamReader(processus.getInputStream()));
            String ligne;
            while ((ligne = lecteur.readLine()) != null) {
//                System.out.println(ligne);
                handelContainers(ligne);
            }
            int codeDeSortie = processus.waitFor();
            System.out.println("\nstop avec erreur : " + codeDeSortie);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    //end containers part ********************************************************************************************************



    public static void main(String[] args) throws IOException, InterruptedException {
        JFrame frame1 = new Home();
        loadImages();
        loadContainers();
    }
}

