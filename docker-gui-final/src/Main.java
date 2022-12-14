import javax.swing.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
public class Main {

    //start images part ********************************************************************************************************
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
                System.out.println(ligne);
            }
            int codeDeSortie = processus.waitFor();
            System.out.println("\nstop avec erreur : " + codeDeSortie);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public static void inspectImage(String iName){
        String[] command = {"docker", "image","inspect",iName};
        ProcessBuilder processusBuilder = new ProcessBuilder(command);
        Map<String, String> env = processusBuilder.environment();
        String newEnvPAth = env.get("PATH") + ":/usr/local/bin/";
        env.replace("PATH", newEnvPAth);
        try {
            Process processus = processusBuilder.start();
            BufferedReader lecteur = new BufferedReader(new InputStreamReader(processus.getInputStream()));
            String ligne;
            while ((ligne = lecteur.readLine()) != null) {
                System.out.println(ligne);
            }
            int codeDeSortie = processus.waitFor();
            System.out.println("\nstop avec erreur : " + codeDeSortie);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public static void pullImage(String iName){
        String[] command = {"docker", "pull",iName};
        ProcessBuilder processusBuilder = new ProcessBuilder(command);
        Map<String, String> env = processusBuilder.environment();
        String newEnvPAth = env.get("PATH") + ":/usr/local/bin/";
        env.replace("PATH", newEnvPAth);
        try {
            Process processus = processusBuilder.start();
            BufferedReader lecteur = new BufferedReader(new InputStreamReader(processus.getInputStream()));
            String ligne;
            while ((ligne = lecteur.readLine()) != null) {
                System.out.println(ligne);
            }
            int codeDeSortie = processus.waitFor();
            System.out.println("\nstop avec erreur : " + codeDeSortie);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public static void removeImage(String iName){
        String[] command = {"docker", "image","rm",iName};
        ProcessBuilder processusBuilder = new ProcessBuilder(command);
        Map<String, String> env = processusBuilder.environment();
        String newEnvPAth = env.get("PATH") + ":/usr/local/bin/";
        env.replace("PATH", newEnvPAth);
        try {
            Process processus = processusBuilder.start();
            BufferedReader lecteur = new BufferedReader(new InputStreamReader(processus.getInputStream()));
            String ligne;
            while ((ligne = lecteur.readLine()) != null) {
                System.out.println(ligne);
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
            System.out.println(ligne);
        }
        int codeDeSortie = processus.waitFor();
        System.out.println("\nstop avec erreur : " + codeDeSortie);
    } catch (IOException e) {
        e.printStackTrace();
    } catch (InterruptedException e) {
        throw new RuntimeException(e);
    }
}
    public static void createContainer(String cName, String iName){
        String[] command = {"docker", "container","create","-it","--name",cName,iName};
        ProcessBuilder processusBuilder = new ProcessBuilder(command);
        Map<String, String> env = processusBuilder.environment();
        String newEnvPAth = env.get("PATH") + ":/usr/local/bin/";
        env.replace("PATH", newEnvPAth);
        try {
            Process processus = processusBuilder.start();
            BufferedReader lecteur = new BufferedReader(new InputStreamReader(processus.getInputStream()));
            String ligne;
            while ((ligne = lecteur.readLine()) != null) {
                System.out.println(ligne);
            }
            int codeDeSortie = processus.waitFor();
            System.out.println("\nstop avec erreur : " + codeDeSortie);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public static void startContainer(String cName){
        String[] command = {"docker", "container","start",cName};
        ProcessBuilder processusBuilder = new ProcessBuilder(command);
        Map<String, String> env = processusBuilder.environment();
        String newEnvPAth = env.get("PATH") + ":/usr/local/bin/";
        env.replace("PATH", newEnvPAth);
        try {
            Process processus = processusBuilder.start();
            BufferedReader lecteur = new BufferedReader(new InputStreamReader(processus.getInputStream()));
            String ligne;
            while ((ligne = lecteur.readLine()) != null) {
                System.out.println(ligne);
            }
            int codeDeSortie = processus.waitFor();
            System.out.println("\nstop avec erreur : " + codeDeSortie);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public static void killContainer(String cName){
        String[] command = {"docker", "container","kill",cName};
        ProcessBuilder processusBuilder = new ProcessBuilder(command);
        Map<String, String> env = processusBuilder.environment();
        String newEnvPAth = env.get("PATH") + ":/usr/local/bin/";
        env.replace("PATH", newEnvPAth);
        try {
            Process processus = processusBuilder.start();
            BufferedReader lecteur = new BufferedReader(new InputStreamReader(processus.getInputStream()));
            String ligne;
            while ((ligne = lecteur.readLine()) != null) {
                System.out.println(ligne);
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

    //start volumes part ********************************************************************************************************
    public static void loadVolumes(){
        String[] command = {"docker", "volume","ls"};
        ProcessBuilder processusBuilder = new ProcessBuilder(command);
        Map<String, String> env = processusBuilder.environment();
        String newEnvPAth = env.get("PATH") + ":/usr/local/bin/";
        env.replace("PATH", newEnvPAth);
        try {
            Process processus = processusBuilder.start();
            BufferedReader lecteur = new BufferedReader(new InputStreamReader(processus.getInputStream()));
            String ligne;
            while ((ligne = lecteur.readLine()) != null) {
                System.out.println(ligne);
//                handelVolumes(ligne);
            }
            int codeDeSortie = processus.waitFor();
            System.out.println("\nstop avec erreur : " + codeDeSortie);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public static void createVolume(){
        String[] command = {"docker", "volume","create"};
        ProcessBuilder processusBuilder = new ProcessBuilder(command);
        Map<String, String> env = processusBuilder.environment();
        String newEnvPAth = env.get("PATH") + ":/usr/local/bin/";
        env.replace("PATH", newEnvPAth);
        try {
            Process processus = processusBuilder.start();
            BufferedReader lecteur = new BufferedReader(new InputStreamReader(processus.getInputStream()));
            String ligne;
            while ((ligne = lecteur.readLine()) != null) {
                System.out.println(ligne);
            }
            int codeDeSortie = processus.waitFor();
            System.out.println("\nstop avec erreur : " + codeDeSortie);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public static void removeVolume(String nameV){
        String[] command = {"docker", "volume","rm",nameV};
        ProcessBuilder processusBuilder = new ProcessBuilder(command);
        Map<String, String> env = processusBuilder.environment();
        String newEnvPAth = env.get("PATH") + ":/usr/local/bin/";
        env.replace("PATH", newEnvPAth);
        try {
            Process processus = processusBuilder.start();
            BufferedReader lecteur = new BufferedReader(new InputStreamReader(processus.getInputStream()));
            String ligne;
            while ((ligne = lecteur.readLine()) != null) {
                System.out.println(ligne);
            }
            int codeDeSortie = processus.waitFor();
            System.out.println("\nstop avec erreur : " + codeDeSortie);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public static void inspectVolume(String nameV){
        String[] command = {"docker", "volume" ,"inspect",nameV};
        ProcessBuilder processusBuilder = new ProcessBuilder(command);
        Map<String, String> env = processusBuilder.environment();
        String newEnvPAth = env.get("PATH") + ":/usr/local/bin/";
        env.replace("PATH", newEnvPAth);
        try {
            Process processus = processusBuilder.start();
            BufferedReader lecteur = new BufferedReader(new InputStreamReader(processus.getInputStream()));
            String ligne;
            while ((ligne = lecteur.readLine()) != null) {
                System.out.println(ligne);
            }
            int codeDeSortie = processus.waitFor();
            System.out.println("\nstop avec erreur : " + codeDeSortie);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    //end volumes part ********************************************************************************************************
    //start networks part ********************************************************************************************************
    public static void loadNetworks(){
        String[] command = {"docker", "network","ls"};
        ProcessBuilder processusBuilder = new ProcessBuilder(command);
        Map<String, String> env = processusBuilder.environment();
        String newEnvPAth = env.get("PATH") + ":/usr/local/bin/";
        env.replace("PATH", newEnvPAth);
        try {
            Process processus = processusBuilder.start();
            BufferedReader lecteur = new BufferedReader(new InputStreamReader(processus.getInputStream()));
            String ligne;
            while ((ligne = lecteur.readLine()) != null) {
                System.out.println(ligne);
//                handelVolumes(ligne);
            }
            int codeDeSortie = processus.waitFor();
            System.out.println("\nstop avec erreur : " + codeDeSortie);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public static void createNetwork(){
        String[] command = {"docker", "network","create"};
        ProcessBuilder processusBuilder = new ProcessBuilder(command);
        Map<String, String> env = processusBuilder.environment();
        String newEnvPAth = env.get("PATH") + ":/usr/local/bin/";
        env.replace("PATH", newEnvPAth);
        try {
            Process processus = processusBuilder.start();
            BufferedReader lecteur = new BufferedReader(new InputStreamReader(processus.getInputStream()));
            String ligne;
            while ((ligne = lecteur.readLine()) != null) {
                System.out.println(ligne);
            }
            int codeDeSortie = processus.waitFor();
            System.out.println("\nstop avec erreur : " + codeDeSortie);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public static void removeNetwork(String nameV){
        String[] command = {"docker", "network","rm",nameV};
        ProcessBuilder processusBuilder = new ProcessBuilder(command);
        Map<String, String> env = processusBuilder.environment();
        String newEnvPAth = env.get("PATH") + ":/usr/local/bin/";
        env.replace("PATH", newEnvPAth);
        try {
            Process processus = processusBuilder.start();
            BufferedReader lecteur = new BufferedReader(new InputStreamReader(processus.getInputStream()));
            String ligne;
            while ((ligne = lecteur.readLine()) != null) {
                System.out.println(ligne);
            }
            int codeDeSortie = processus.waitFor();
            System.out.println("\nstop avec erreur : " + codeDeSortie);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public static void inspectNetwork(String nameV){
        String[] command = {"docker", "network" ,"inspect",nameV};
        ProcessBuilder processusBuilder = new ProcessBuilder(command);
        Map<String, String> env = processusBuilder.environment();
        String newEnvPAth = env.get("PATH") + ":/usr/local/bin/";
        env.replace("PATH", newEnvPAth);
        try {
            Process processus = processusBuilder.start();
            BufferedReader lecteur = new BufferedReader(new InputStreamReader(processus.getInputStream()));
            String ligne;
            while ((ligne = lecteur.readLine()) != null) {
                System.out.println(ligne);
            }
            int codeDeSortie = processus.waitFor();
            System.out.println("\nstop avec erreur : " + codeDeSortie);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    //end networks part ********************************************************************************************************
    public static void main(String[] args) throws IOException, InterruptedException {
        JFrame frame1 = new Home();
    }
}

