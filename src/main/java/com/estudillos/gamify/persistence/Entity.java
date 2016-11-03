package com.estudillos.gamify.persistence;


/**
 * Base entity to persist in database.
 * @author mayantigo
 */
public abstract class Entity {
    /**
     * Save the current entity.
     * @return Current entity updated
     */
    public abstract Entity save();

    /**
     * Delete the current entity.
     */
    public abstract void delete();

    /**
     * Update the current entity.
     * @return Current entity updated
     */
    public abstract Entity update();
}
