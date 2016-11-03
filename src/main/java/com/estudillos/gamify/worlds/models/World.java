package com.estudillos.gamify.worlds.models;

import com.estudillos.gamify.persistence.Entity;

/**
 * Represents a world in gamify.
 * @author mayantigo
 */
public final class World {
    private final String id;
    private final String name;
    private final String description;

    /**
     * Main constructor.
     * @param id Id of the world
     * @param name Name of the world
     * @param description Description of the world
     */
    public World(final String id, final String name, final String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    /**
     * Return the id of the world.
     * @return Id of the world
     */
    public String id() {
        return id;
    }

    /**
     * Returns the name of the world
     * @return Name of the world
     */
    public String name() {
        return this.name;
    }

    /**
     * Returns the description of
     * the world.
     * @return Description of the world
     */
    public String description() {
        return this.description;
    }
}
