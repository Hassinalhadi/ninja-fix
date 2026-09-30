package z3;

import kotlin.jvm.internal.Intrinsics;
import w9.i;

/* renamed from: z3.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3462a {
    public static i alpha;

    public static void alpha(String tag, int i4, String str, Throwable th) {
        if ((i4 & 4) != 0) {
            th = null;
        }
        Intrinsics.echo(tag, "tag");
        i iVar = alpha;
        if (iVar != null) {
            iVar.alpha(tag, str, th);
        }
    }
}
