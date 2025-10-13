package edu.ucsb.cs156.spring.hello;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class TeamTest {

    Team team;

    @BeforeEach
    public void setup() {
        team = new Team("test-team");    
    }

    @Test
    public void getName_returns_correct_name() {
       assert(team.getName().equals("test-team"));
    }
    @Test
    public void toString_returns_correct_string() {
        assertEquals("Team(name=test-team, members=[])", team.toString());
    }
    @Test
public void equals_returns_true_for_same_object() {
    Team t = new Team("test-team");
    assertTrue(t.equals(t)); // Case 1
}

@Test
public void equals_returns_false_for_different_class() {
    Team t = new Team("test-team");
    String notATeam = "not a team";
    assertFalse(t.equals(notATeam)); // Case 2
}

@Test
public void equals_returns_true_for_equal_teams() {
    Team t1 = new Team("test-team");
    t1.addMember("Alice");

    Team t2 = new Team("test-team");
    t2.addMember("Alice");

    assertTrue(t1.equals(t2)); // Case 3a
}

@Test
public void equals_returns_false_for_same_name_different_members() {
    Team t1 = new Team("test-team");
    t1.addMember("Alice");

    Team t2 = new Team("test-team");
    t2.addMember("Bob");

    assertFalse(t1.equals(t2)); // Case 3b
}

@Test
public void equals_returns_false_for_different_name_same_members() {
    Team t1 = new Team("team-one");
    t1.addMember("Alice");

    Team t2 = new Team("team-two");
    t2.addMember("Alice");

    assertFalse(t1.equals(t2)); // Case 3c
}

   
    // TODO: Add additional tests as needed to get to 100% jacoco line coverage, and
    // 100% mutation coverage (all mutants timed out or killed)

}
