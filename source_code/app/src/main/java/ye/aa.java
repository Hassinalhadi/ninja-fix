package ye;

import kotlin.jvm.internal.Intrinsics;
import s6.E6;

/* loaded from: classes2.dex */
public abstract class aa {
    public static final Ne.c alpha;
    public static final Ne.b bravo;

    static {
        Ne.c cVar = new Ne.c("kotlin.jvm.JvmField");
        alpha = cVar;
        Ne.b.juliet(cVar);
        Ne.b.juliet(new Ne.c("kotlin.reflect.jvm.internal.ReflectionFactoryImpl"));
        bravo = Ne.b.echo("kotlin/jvm/internal/RepeatableContainer", false);
    }

    public static final String alpha(String propertyName) {
        Intrinsics.echo(propertyName, "propertyName");
        if (charlie(propertyName)) {
            return propertyName;
        }
        return "get" + E6.alpha(propertyName);
    }

    public static final String bravo(String str) {
        String alpha2;
        StringBuilder sb2 = new StringBuilder("set");
        if (charlie(str)) {
            alpha2 = str.substring(2);
            Intrinsics.delta(alpha2, "this as java.lang.String).substring(startIndex)");
        } else {
            alpha2 = E6.alpha(str);
        }
        sb2.append(alpha2);
        return sb2.toString();
    }

    public static final boolean charlie(String name) {
        Intrinsics.echo(name, "name");
        if (kotlin.text.r.quebec(name, "is", false) && name.length() != 2) {
            char charAt = name.charAt(2);
            if (Intrinsics.golf(97, charAt) > 0 || Intrinsics.golf(charAt, 122) > 0) {
                return true;
            }
        }
        return false;
    }
}
