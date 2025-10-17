package edu.ucsb.cs156.spring.hello;

/**
 * A class with static methods to provide information about the developer.
 */

public class Developer {

    // This class is not meant to be instantiated
    // so we make the constructor private

    private Developer() {}
    
    /**
     * Get the name of the developer
     */

    public static String getName() {
        // had already changed name to mine. changed it back so tests pass
        
        return "TARANG";
    }

    /**
     * Get the github id of the developer
     * @return github id of the developer
     */

    public static String getGithubId() {

        return "tarang-netizen";
    }

    /**
     * Get the developers team
     * @return developers team as a Java object
     */
    
    public static Team getTeam() {

        Team team = new Team("f25-03");
        team.addMember("TARANG");
        team.addMember("ADAM YITAO");
        team.addMember("CHENCHANG");
        team.addMember("DYLAN");
        team.addMember("JOSHUA");
        team.addMember("TERRY");
        System.out.println("Team members: " + team); // 👈 this line prints the list (delete later)
        return team;
    }
}
