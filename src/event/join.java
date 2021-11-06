package event;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.scoreboard.*;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class join implements Listener {

    @EventHandler
    public void onJoin(PlayerJoinEvent p){
        SetupScoreboard(p.getPlayer());

    }

    public static void SetupScoreboard(final Player player){
        Scoreboard scoreboard = Bukkit.getScoreboardManager().getNewScoreboard();
        final Objective objective = scoreboard.registerNewObjective("test", "dummy");

        objective.setDisplayName("Statistiques");
        objective.setDisplaySlot(DisplaySlot.SIDEBAR);

        player.setScoreboard(scoreboard);



        try {
            Object objc = new JSONParser().parse(new FileReader("./plugins/output.json"));

            JSONObject job = (JSONObject) objc;

            String fName = String.valueOf(job.get(player.getName()));
            if(fName == "null"){
                job.put(player.getName(), "0");
            } else {
                int s2 = Integer.parseInt(fName);
                fName.replace(fName, String.valueOf(s2));
                updateScoreboard(player, s2);
            }

            try {
                FileWriter file = new FileWriter("./plugins/output.json");
                file.write(job.toJSONString());
                file.close();
            } catch (IOException e) {
                e.printStackTrace();
            }




        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }
    public static void updateScoreboard(Player player, int Value){
        org.bukkit.scoreboard.Scoreboard scoreboard = player.getScoreboard();
        Objective objective = scoreboard.getObjective("test");

        Score score1 = objective.getScore("§aMoney : §d" + Value);
        score1.setScore(9);

       // objective.getScore(" §aMoney : §d" + Value +"€").setScore(0);
//        objective.getScore(" §aMoney : §d" + Value +"€").setScore(0);
        //objective.getScore("     §d" + Value + "    ").setScore(8);
    }
}
