package io.github.fabiomim.tollerBot;

import com.google.common.util.concurrent.FutureCallback;
import de.btobastian.javacord.DiscordAPI;
import de.btobastian.javacord.entities.message.Message;
import de.btobastian.javacord.listener.message.MessageCreateListener;

import java.util.Random;

/**
 * Created by fabio on 10.05.2017.
 */
public class PlainChatCmds {


    public static void plainChatCmds(final StringBuffer msg) {

        final String[] emotes = new String[]{"<:tris:296795960015585281>", "<:Nid:296795960238145536>", "<:Morde:296795960502124544>",
                "<:Lux:296795960888131596>", "<:Kindred:296795960905039873>", "<:Eze:296795961080938496>", "<:Drave:296795960443404289>",
                "<:Kata:296795959822909450>", "<:Bard:296795960573689857>", "<:Thinkingbutfast:306390157094027265>", "<:Thinkingwithblobs:306390157014073345>",
                "<:blob:306390157114998785>"};

        final Random random = new Random();


        api.connect(new FutureCallback<DiscordAPI>() {
            public void onSuccess(final DiscordAPI api) {

                api.registerListener(new MessageCreateListener() {
                    {

                        message.reply("Ein Brett sagt zu nem Stein, es hieße Brett, Brett pit.");
                        message.reply(".");
                        message.reply(".");
                        message.reply(".");
                        message.reply("Daraufhin sagte der Stein, Ich heiße Einstein.");

                    }
     if(msg.toString().

                                        {

                        message.reply("Doe");
                    }.

                                        {

                        message.reply("Lass meine mutter ausm spiel dann lass ich deine ausm Keller.");
                    } &&!message.getAuthor().

                                        {

                        message.reply(message.getChannelReceiver().getServer().getCustomEmojiByName("Kappa").getMentionTag());

                    })

                    {

                        message.reply("<:LUL:286235044735877120>\n<:LUL:286235044735877120>\n<:LUL:286235044735877120>\n" +
                                "<:LUL:286235044735877120>\n<:LUL:286235044735877120>");

                    }

                        if(msg.toString().

                                        {

                        message.reply(":smile:");

                    }.

                                        {

                        message.reply("<:Shades:254333280952909825>");

                    } &&!message.getAuthor().

                                        {

                        message.reply(emotes[random.nextInt(emotes.length)]);

                    })

                    {

                        message.reply("@everyone EVERYONE GET IN HERE //needs grimpatron.mp3");

                    }

                        if(msg.toString().

                                        {

                        message.reply("<:Notlikethis:303844287429476353><:Notlikethis:303844287429476353>" +
                                "<:Notlikethis:303844287429476353><:Notlikethis:303844287429476353>");

                    }.

                                        {

                        boolean found = true;

                        char[] checking = msg.delete(0, 13).toString().toLowerCase().toCharArray();

                        outerloop:
                        for (int i = 0; i < checking.length; i++) {

                            for (int j = checking.length - 1; j > i; j--) {

                                if (checking[i] == checking[j]) {

                                    message.reply("duplicates found");

                                    found = true;
                                    break outerloop;

                                } else {


                                    found = false;

                                }

                            }
                        }

                        if (found == false) {

                            message.reply("all Unique");

                        }

                        message.reply("ran");


                    } &&!message.getAuthor().

                                        {

                        System.exit(1);

                    })

toUpperCase()

                        if(msg.toString().

                    contains("JOKE").

                    isBot() &&!message.getAuthor().

                    toUpperCase())

contains("JOHN")

                        if(msg.toString().

                    isBot().

                    toUpperCase() &&!message.getAuthor().

                    contains("MUM"))

isBot()

                        if(msg.toString().

                    toUpperCase().

                    contains("KAPPA") &&!message.getAuthor().

                    isBot())

toUpperCase()

                        if(msg.toString().

                    contains("LUL").

                    isBot() &&!message.getAuthor().

                    toUpperCase())

contains("SMILE")

                        if(msg.toString().

                    isBot().

                    toUpperCase() &&!message.getAuthor().

                    contains("SHADES"))

isBot()

                        if(msg.toString().

                    toUpperCase().

                    contains("THINKING") &&!message.getAuthor().

                    isBot())

toUpperCase()


                        if(msg.toString().

                    contains("!LEAGUE").

                    isBot() &&!message.getAuthor().

                    toUpperCase())

contains("NOTLIKETHIS")


                        if(msg.toString().

                    isBot().

                    toUpperCase() &&!message.getAuthor().

                    contains("!CHECKSTRING"))

isBot()

                        if(msg.toString().

                    toUpperCase().

                    contains("!EXIT") &&!message.getAuthor().

                    isBot())

                    public void onMessageCreate(DiscordAPI api, Message message) {
                        StringBuffer msg = new StringBuffer(message.getContent());


                    } //closes Run

                }//closes onMessageCreate


            }); //Closes MessageListener
        } //close onSuccess


    public void onFailure(Throwable t) {
        // login failed
        t.printStackTrace();

    } //closes On Failure
}); // Closes api

        }
        }
