package t6;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: t6.i3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3007i3 {
    public static final /* synthetic */ int alpha = 0;

    public static void alpha(ae.ai aiVar, androidx.lifecycle.al alVar, Function1 function1, int i4) {
        if ((i4 & 1) != 0) {
            alVar = null;
        }
        Intrinsics.echo(aiVar, "<this>");
        Y1.q qVar = new Y1.q(function1);
        if (alVar != null) {
            aiVar.alpha(alVar, qVar);
        } else {
            aiVar.bravo(qVar);
        }
    }
}
