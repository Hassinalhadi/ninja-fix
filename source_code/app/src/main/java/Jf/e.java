package Jf;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlinx.serialization.KSerializer;

@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes2.dex */
public @interface e {
    Class with() default KSerializer.class;
}
