package fr.epsi.gravarmor.test;

import fr.epsi.gravarmor.model.BoxType;
import fr.epsi.gravarmor.model.LandBox;
import fr.epsi.gravarmor.model.Team;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class UnitTest {

    @Test
    @DisplayName("Test team name")
    public void testTeamName() {

        String teamName1 = "MaSuperTeam1";
        String teamName2 = "MaSuperTeam2";
        String teamName3 = "MaSuperTeam3";

        Team team1 = new Team(teamName1, new ArrayList<>());
        Team team2 = new Team(teamName2, new ArrayList<>());
        Team team3 = new Team(teamName3, new ArrayList<>());

        Assertions.assertEquals(teamName1, team1.getName());
        Assertions.assertEquals(teamName2, team2.getName());
        Assertions.assertEquals(teamName3, team3.getName());

        Assertions.assertNotEquals(team1.getName(), team2.getName());
        Assertions.assertNotEquals(team2.getName(), team3.getName());
        Assertions.assertNotEquals(team3.getName(), team1.getName());
    }

    @Test
    @DisplayName("Test box type")
    public void testBoxType() {

        BoxType boxType1 = BoxType.WATER;
        BoxType boxType2 = BoxType.HIDDEN;
        BoxType boxType3 = BoxType.QUICKSAND;

        LandBox landBox1 = new LandBox(boxType1);
        LandBox landBox2 = new LandBox(boxType2);
        LandBox landBox3 = new LandBox(boxType3);

        Assertions.assertEquals(boxType1, landBox1.getType());
        Assertions.assertEquals(boxType2, landBox2.getType());
        Assertions.assertEquals(boxType3, landBox3.getType());

        Assertions.assertNotEquals(landBox1.getType(), landBox2.getType());
        Assertions.assertNotEquals(landBox2.getType(), landBox3.getType());
        Assertions.assertNotEquals(landBox3.getType(), landBox1.getType());
    }
}
