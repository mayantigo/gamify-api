package com.estudillos.gamify.worlds.endpoints;

import org.takes.Request;
import org.takes.Response;
import org.takes.Take;
import org.takes.rs.RsText;

import java.io.IOException;

/**
 * Get the current world.
 * @author mayantigo
 */
public class Current implements Take {
    /**
     * {@inheritDoc}
     */
    public Response act(final Request request) throws IOException {
        System.out.println(request.body());
        return new RsText("");
    }
}
