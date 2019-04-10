package dumblefloor.DumbleBot;

import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class MessageListener extends ListenerAdapter{
	@Override
	    public void onMessageReceived(MessageReceivedEvent e)
	    {
	        if (e.getMessage().getContentDisplay().equalsIgnoreCase("test"))
	        {

	        }
	        else
	        {
	            return;
	        }

	    }
}
