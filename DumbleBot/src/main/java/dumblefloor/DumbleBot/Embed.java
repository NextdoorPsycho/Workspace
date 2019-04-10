package dumblefloor.DumbleBot;

import java.awt.Color;
import java.time.OffsetDateTime;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class Embed extends ListenerAdapter {
	@Override
    public void onMessageReceived(MessageReceivedEvent e)
    {
        if (e.getMessage().getContentDisplay().equalsIgnoreCase("!Embed"))
        {
        	EmbedBuilder eb = new EmbedBuilder();
			eb.setTitle("title ~~(did you know you can have markdown here too?)~~", "https://discordapp.com");
			eb.setDescription(
					"this supports [named links](https://discordapp.com) on top of the previously shown subset of markdown. ```\nyes, even code blocks```");
			eb.setColor(new Color(13974448));
			eb.setTimestamp(OffsetDateTime.parse("2019-04-10T05:05:11.932Z"));
			eb.setFooter("footer text", "https://cdn.discordapp.com/embed/avatars/0.png");
			eb.setThumbnail("https://cdn.discordapp.com/embed/avatars/0.png");
			eb.setImage("https://cdn.discordapp.com/embed/avatars/0.png");
			eb.setAuthor("author name", "https://discordapp.com",
					"https://cdn.discordapp.com/embed/avatars/0.png");
			eb.addField("🤔", "some of these properties have certain limits...", false);
			eb.addField("😱", "try exceeding some of them!", false);
			eb.addField("🙄",
					"an informative error should show up, and this view will remain as-is until all issues are fixed",
					false);
			eb.addField("<:thonkang:219069250692841473>", "these last two", true);
			eb.addField("<:thonkang:219069250692841473>", "are inline fields", true);

            System.out.println("You asked for a test");
            e.getChannel().sendMessage("I Read you loud and clear!").queue();
            e.getChannel().sendMessage( eb.build()).queue();

            
        }
        else
        {
            return;
        }

    }
}