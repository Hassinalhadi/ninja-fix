package B2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class u {
    public static final String alpha;
    public static final String[] bravo;

    static {
        String golf = A2.z.golf("WrkDbPathHelper");
        Intrinsics.delta(golf, "tagWithPrefix(\"WrkDbPathHelper\")");
        alpha = golf;
        bravo = new String[]{"-journal", "-shm", "-wal"};
    }
}
