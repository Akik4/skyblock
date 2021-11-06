package cmd;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.json.simple.JSONObject;

import java.io.FileWriter;
import java.io.IOException;

public class json implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        JSONObject jsonObject = new JSONObject();

        jsonObject.put(commandSender.getName(), "0");

        try {
            FileWriter file = new FileWriter("./plugins/output.json");
            file.write(jsonObject.toJSONString());
            file.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Bukkit.broadcastMessage(String.valueOf(jsonObject));
        return false;
    }
}
