package Uf;

import java.util.logging.Logger;
import kotlin.text.StringsKt;

/* loaded from: classes3.dex */
public abstract class n {
    public static final Logger alpha = Logger.getLogger("okio.Okio");

    public static final boolean alpha(AssertionError assertionError) {
        boolean z2;
        if (assertionError.getCause() != null) {
            String message = assertionError.getMessage();
            if (message != null) {
                z2 = StringsKt.beige(message, "getsockname failed", false);
            } else {
                z2 = false;
            }
            if (z2) {
                return true;
            }
        }
        return false;
    }
}
