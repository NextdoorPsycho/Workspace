package dumblefloor.DumbleBot;

import javax.security.auth.login.LoginException;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;

public class App
{
    public static void main(String[] args)
            throws LoginException
    {
        JDA jda = new JDABuilder("NTY1MzMxNjM5NzYxMTA5MDM5.XK1ijQ.ajDDNeZK-L_WzqJ8fhhPxGp48E0").build();
        jda.addEventListener(new MessageListener());
        jda.addEventListener(new Embed()); 
        System.out.flush();
        try {
			Thread.sleep(800);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        System.out.println(" ▄▄▄·.▄▄ ·  ▄· ▄▌ ▄▄·  ▄ .▄       ▄▄▄· ▄▄▄· ▄▄▄▄▄ ▄ .▄\r\n" + 
        		"▐█ ▄█▐█ ▀. ▐█▪██▌▐█ ▌▪██▪▐█▪     ▐█ ▄█▐█ ▀█ •██  ██▪▐█\r\n" + 
        		" ██▀·▄▀▀▀█▄▐█▌▐█▪██ ▄▄██▀▐█ ▄█▀▄  ██▀·▄█▀▀█  ▐█.▪██▀▐█\r\n" + 
        		"▐█▪·•▐█▄▪▐█ ▐█▀·.▐███▌██▌▐▀▐█▌.▐▌▐█▪·•▐█ ▪▐▌ ▐█▌·██▌▐▀\r\n" + 
        		".▀    ▀▀▀▀   ▀ • ·▀▀▀ ▀▀▀ · ▀█▄▀▪.▀    ▀  ▀  ▀▀▀ ▀▀▀ ·");
        System.out.println("     ▐ ▄ ▄▄▄ .▐▄• ▄ ▄▄▄▄▄·▄▄▄▄              ▄▄▄  \r\n" + 
        		"    •█▌▐█▀▄.▀· █▌█▌▪•██  ██▪ ██ ▪     ▪     ▀▄ █·\r\n" + 
        		"    ▐█▐▐▌▐▀▀▪▄ ·██·  ▐█.▪▐█· ▐█▌ ▄█▀▄  ▄█▀▄ ▐▀▀▄ \r\n" + 
        		"    ██▐█▌▐█▄▄▌▪▐█·█▌ ▐█▌·██. ██ ▐█▌.▐▌▐█▌.▐▌▐█•█▌\r\n" + 
        		"    ▀▀ █▪ ▀▀▀ •▀▀ ▀▀ ▀▀▀ ▀▀▀▀▀•  ▀█▄▀▪ ▀█▄▀▪.▀  ▀");
        
        
        System.out.println("*                          .\r\n" + 
        		"               .          .                        .       |       .\r\n" + 
        		"                                                         --*--\r\n" + 
        		"                              _________                    |\r\n" + 
        		"         .               _|_ /_   _\r\n" + 
        		"         _______       _  |  |_| |      .\r\n" + 
        		"              | \\  _  |_\r\n" + 
        		"              |_/ |_|      .                                  .\r\n" + 
        		"           _____  ____  _________    _____ _____________\r\n" + 
        		"           \\    \\/    \\/         \\__/     V     ____    | \r\n" + 
        		"            \\      _      /|      __      |    |____|   |         .\r\n" + 
        		"    .        \\____/ \\___/  |_____|  |_____|_____________|\r\n" + 
        		"\r\n" + 
        		"             .                          .\r\n" + 
        		"                                                         .\r\n" + 
        		"                           *       .\r\n" + 
        		" :\r\n" + 
        		"                                .                   .             .\r\n" + 
        		"               *                  .");
        
        //ART NOW   
        
    }

   
}