/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

/**
 *
 * @author markus
 */
import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.RetentionPolicy.RUNTIME;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import javax.inject.Qualifier;

public class Events {

    @Qualifier
    @Target({FIELD, PARAMETER})
    @Retention(RUNTIME)
    public @interface Added {
    }

    @Qualifier
    @Target({FIELD, PARAMETER})
    @Retention(RUNTIME)
    public @interface Deleted {
    }
}
