/**
 * Created by Fabio on 14.04.2017.
 */


package io.github.fabiomim.tollerBot;

import com.google.common.util.concurrent.FutureCallback;
import de.btobastian.javacord.DiscordAPI;
import de.btobastian.javacord.Javacord;
import de.btobastian.javacord.entities.message.Message;
import de.btobastian.javacord.listener.message.MessageCreateListener;
import net.dean.jraw.RedditClient;
import net.dean.jraw.http.UserAgent;
import net.dean.jraw.http.oauth.Credentials;
import net.dean.jraw.http.oauth.OAuthData;
import net.dean.jraw.http.oauth.OAuthException;
import net.dean.jraw.models.Listing;
import net.dean.jraw.models.Submission;
import net.dean.jraw.paginators.SubredditPaginator;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;


public class Main_DiscordBot {
    public static void main(String[] args) throws IOException {


        System.out.print(Math.ceil(Math.random() * 240));


        BufferedReader br = new BufferedReader(new FileReader("Settings.txt"));
        String line = br.readLine();

        final String[] credential;

        credential = line.split(" ");

        br.close();

        final String[] emotes = new String[]{"<:tris:296795960015585281>", "<:Nid:296795960238145536>", "<:Morde:296795960502124544>",
                "<:Lux:296795960888131596>", "<:Kindred:296795960905039873>", "<:Eze:296795961080938496>", "<:Drave:296795960443404289>",
                "<:Kata:296795959822909450>", "<:Bard:296795960573689857>", "<:Thinkingbutfast:306390157094027265>", "<:Thinkingwithblobs:306390157014073345>",
                "<:blob:306390157114998785>"};

        final Random random = new Random();


        String token = credential[0];
        DiscordAPI api = Javacord.getApi(token, true);

        api.connect(new FutureCallback<DiscordAPI>() {
            public void onSuccess(final DiscordAPI api) {

                api.registerListener(new MessageCreateListener() {
                    public void onMessageCreate(DiscordAPI api, Message message) {
                        StringBuffer msg = new StringBuffer(message.getContent());

                        if (msg.toString().contains("!Reddit") && !message.getAuthor().isBot()) {

                            UserAgent myUserAgent = UserAgent.of("desktop", "io.github.fabiomim.tollerBot", "v0.0.1", credential[1]);

                            final RedditClient redditClient = new RedditClient(myUserAgent);

                            Credentials credentials = Credentials.script(credential[1], credential[2], credential[3], credential[4]);

                            OAuthData authData = null;

                            try {
                                authData = redditClient.getOAuthHelper().easyAuth(credentials);
                            } catch (OAuthException e) {
                                e.printStackTrace();
                            }

                            SubredditPaginator paginator = new SubredditPaginator(redditClient);

                            redditClient.authenticate(authData);

                            String[] reddarray;

                            reddarray = msg.toString().split(" ");

                            paginator.setLimit(5);

                            paginator.setSubreddit(reddarray[1]);

                            if (reddarray[1].equals("all")) {

                                Listing<Submission> submissions = paginator.next();

                                for (Submission s : submissions) {

                                    message.reply(" \n" + " \n" + " \n" + " \n" + "**" + s.getTitle() + "**" + "\n" + s.getUrl() + "\n" + "**" + s.getScore() + " Punkte." + "**"
                                            + "\n" + "**/r/" + s.getSubredditName() + "**");

                                }

                            } else {

                                Listing<Submission> submissions = paginator.next();

                                for (Submission s : submissions) {

                                    message.reply(" \n" + " \n" + " \n" + " \n" + "**" + s.getTitle() + "**" + "\n" + s.getUrl() + "\n" + "**" + s.getScore() + " Punkte." + "**");

                                }
                            }

                        }

                        if ((msg.toString().toUpperCase().contains("JOKE")) && (!message.getAuthor().isBot())) {
                            message.reply("Ein Brett sagt zu nem Stein, es hieße Brett, Brett pit.");
                            message.reply(".");
                            message.reply(".");
                            message.reply(".");
                            message.reply("Daraufhin sagte der Stein, Ich heiße Einstein.");
                        }

                        if ((msg.toString().toUpperCase().contains("JOHN")) && (!message.getAuthor().isBot())) {
                            message.reply("Doe");
                        }

                        if ((msg.toString().toUpperCase().contains("MUM")) && (!message.getAuthor().isBot())) {
                            message.reply("Lass meine mutter ausm spiel dann lass ich deine ausm Keller.");
                        }

                        if ((msg.toString().toUpperCase().contains("KAPPA")) && (!message.getAuthor().isBot())) {
                            message.reply(message.getChannelReceiver().getServer().getCustomEmojiByName("Kappa").getMentionTag());
                        }


                        if ((msg.toString().toUpperCase().contains("LUL")) && (!message.getAuthor().isBot())) {
                            message.reply("<:LUL:286235044735877120>\n<:LUL:286235044735877120>\n<:LUL:286235044735877120>\n<:LUL:286235044735877120>\n<:LUL:286235044735877120>");
                        }


                        if ((msg.toString().toUpperCase().contains("SMILE")) && (!message.getAuthor().isBot())) {
                            message.reply(":smile:");
                        }

                        if ((msg.toString().toUpperCase().contains("SHADES")) && (!message.getAuthor().isBot())) {
                            message.reply("<:Shades:254333280952909825>");
                        }


                        if ((msg.toString().toUpperCase().contains("THINKING")) && (!message.getAuthor().isBot())) {
                            message.reply(emotes[random.nextInt(emotes.length)]);
                        }

                        if ((msg.toString().toUpperCase().contains("!LEAGUE")) && (!message.getAuthor().isBot())) {
                            message.reply("@everyone EVERYONE GET IN HERE //needs grimpatron.mp3");
                        }
                    }
                });
            }






            public void onFailure(Throwable t) {
                // login failed
                t.printStackTrace();

            } //closes On Failure
        }); // Closes api


    } //closes Run

} //closes class










