package cmd;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class read implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {



        try {
            Object objc = new JSONParser().parse(new FileReader("./plugins/output.json"));

            JSONObject job = (JSONObject) objc;

            String fName = String.valueOf(job.get(commandSender.getName()));

            int s2 = Integer.parseInt(fName);
            fName.replace(fName, String.valueOf(s2));
            commandSender.sendMessage("§8Votre balance s'estime " + String.valueOf(s2));


        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
// objc is convereted to JSON object








        return false;
    }
}
