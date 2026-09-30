package s6;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public abstract class A0 {
    public static final int alpha(j.m mVar, d.K k6) {
        long j5;
        if (k6 == d.K.alpha) {
            j5 = mVar.oscar & 4294967295L;
        } else {
            j5 = mVar.oscar >> 32;
        }
        return (int) j5;
    }

    public static final Be.c bravo(B9.ab abVar, Ee.b annotationsOwner) {
        Intrinsics.echo(abVar, "<this>");
        Intrinsics.echo(annotationsOwner, "annotationsOwner");
        return new Be.c(abVar, annotationsOwner, false);
    }
}
