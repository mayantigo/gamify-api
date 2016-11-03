package com.estudillos.gamify.races;


/**
 * Represents a race in gamify.
 * @author mayantigo
 */
public final class Race {
    private final String id;
    private final String name;
    private final String description;

    /**
     * Default constructor.
     * @param id Id of the race
     * @param name Name of the race
     * @param description Description of the race
     */
    public Race(
            final String id,
            final String name,
            final String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    /**
     * Gets the id of the race.
     * @return Id of the race
     */
    public String id() {
        return this.id;
    }

    /**
     * Gets the name of the race
     * @return Name of the race
     */
    public String name() {
        return this.name;
    }

    /**
     * Gets the description
     * of the race.
     * @return Description of the race
     */
    public String description() {
        return this.description;
    }
}
