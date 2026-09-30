package s6;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public abstract class A6 {
    public static final /* synthetic */ int alpha = 0;

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0031, code lost:
    
        if (r0.charAt(r1.length()) == '.') goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Ne.c alpha(Ne.c cVar, Ne.c prefix) {
        Intrinsics.echo(cVar, "<this>");
        Intrinsics.echo(prefix, "prefix");
        if (!Intrinsics.areEqual(cVar, prefix) && !prefix.delta()) {
            String bravo = cVar.bravo();
            String bravo2 = prefix.bravo();
            if (kotlin.text.r.quebec(bravo, bravo2, false)) {
            }
            return cVar;
        }
        if (!prefix.delta()) {
            if (Intrinsics.areEqual(cVar, prefix)) {
                Ne.c ROOT = Ne.c.charlie;
                Intrinsics.delta(ROOT, "ROOT");
                return ROOT;
            }
            String substring = cVar.bravo().substring(prefix.bravo().length() + 1);
            Intrinsics.delta(substring, "this as java.lang.String).substring(startIndex)");
            return new Ne.c(substring);
        }
        return cVar;
    }
}
