package com.estudillos.gamify;

import com.estudillos.gamify.worlds.endpoints.Current;
import com.estudillos.gamify.worlds.endpoints.Login;
import com.estudillos.gamify.worlds.endpoints.Logout;
import org.takes.facets.fork.FkMethods;
import org.takes.http.Exit;
import org.takes.http.FtBasic;
import org.takes.facets.fork.FkRegex;
import org.takes.facets.fork.TkFork;

/**
 * Start app
 * @author mayantigo
 */
public final class App {

    /**
     * Main method to start the app
     * @param args Args
     * @throws Exception Some exception
     */
    public static void main(final String... args) throws Exception {
        new FtBasic(
                new TkFork(
                        new FkRegex(
                                "/login", new TkFork(new FkMethods("POST", new Login()))
                        ),
                        new FkRegex(
                                "/logout", new TkFork(
                                        new FkMethods(
                                                "POST", new Logout()))
                        ),
                        new FkRegex(
                                "/worlds", new TkFork(
                                        new FkMethods(
                                                "GET, PUT, POST, DELETE", new Current()))
                        ),
                        new FkRegex(
                                "/worlds/users/(?<user>[a-z]+)", new TkFork(
                                        new FkMethods(
                                                "GET, POST, DELETE", new Current()))
                        ),
                        new FkRegex(
                                "/worlds/users/", new TkFork(new FkMethods("PUT", new Current()))
                        ),
                        new FkRegex(
                                "/worlds/users/(?<user>[a-z]+)/badgets/(?<badget>[a-z]+)", new TkFork(
                                        new FkMethods("PUT", new Current()))
                        )
                ), 8080
        ).start(Exit.NEVER);
    }
}