package org.example;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.requests.GatewayIntent;

import javax.security.auth.login.LoginException;
import java.util.Arrays;

public class AntiRickroll {

    public static final GatewayIntent[] INTENTS = {GatewayIntent.GUILD_BANS, GatewayIntent.MESSAGE_CONTENT, GatewayIntent.DIRECT_MESSAGES, GatewayIntent.GUILD_MESSAGES, GatewayIntent.GUILD_MESSAGE_REACTIONS, GatewayIntent.GUILD_VOICE_STATES, GatewayIntent.GUILD_MEMBERS, GatewayIntent.GUILD_PRESENCES};

    public static void main(String[] args) throws LoginException {

        JDA jda = JDABuilder.create("TOKEN", Arrays.asList(INTENTS))
                .setActivity(Activity.watching("villagers"))
                .addEventListeners(new RickrollDetector())
                .build();

    }
}


