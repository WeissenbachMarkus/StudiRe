/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import javax.inject.Qualifier;
/**
 *
 * @author markus
 */
public class TestQualifier {

    @Qualifier
    @Target({FIELD, TYPE})
    @Retention(RUNTIME)
    public @interface MyService {
    }
}
