package kotlin.text;

import java.nio.charset.Charset;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class a {
    public static final Charset alpha;
    public static final Charset bravo;
    public static final Charset charlie;
    public static final Charset delta;
    public static volatile Charset echo;
    public static volatile Charset foxtrot;

    static {
        Charset forName = Charset.forName("UTF-8");
        Intrinsics.delta(forName, "forName(...)");
        alpha = forName;
        Intrinsics.delta(Charset.forName("UTF-16"), "forName(...)");
        Charset forName2 = Charset.forName("UTF-16BE");
        Intrinsics.delta(forName2, "forName(...)");
        bravo = forName2;
        Charset forName3 = Charset.forName("UTF-16LE");
        Intrinsics.delta(forName3, "forName(...)");
        charlie = forName3;
        Intrinsics.delta(Charset.forName("US-ASCII"), "forName(...)");
        Charset forName4 = Charset.forName("ISO-8859-1");
        Intrinsics.delta(forName4, "forName(...)");
        delta = forName4;
    }
}
