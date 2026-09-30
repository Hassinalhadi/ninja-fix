package aa;

import A2.aa;
import A2.af;
import Ie.E;
import Ie.z;
import K2.i;
import androidx.lifecycle.au;
import cf.u;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import pe.AbstractC2340p;
import pe.C2339o;
import t6.AbstractC3003i;

/* renamed from: aa.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC0417a {
    public static final C2339o alpha(E e) {
        int i4;
        if (e == null) {
            i4 = -1;
        } else {
            i4 = u.$EnumSwitchMapping$2[e.ordinal()];
        }
        switch (i4) {
            case 1:
                C2339o INTERNAL = AbstractC2340p.delta;
                Intrinsics.delta(INTERNAL, "INTERNAL");
                return INTERNAL;
            case 2:
                C2339o PRIVATE = AbstractC2340p.alpha;
                Intrinsics.delta(PRIVATE, "PRIVATE");
                return PRIVATE;
            case 3:
                C2339o PRIVATE_TO_THIS = AbstractC2340p.bravo;
                Intrinsics.delta(PRIVATE_TO_THIS, "PRIVATE_TO_THIS");
                return PRIVATE_TO_THIS;
            case 4:
                C2339o PROTECTED = AbstractC2340p.charlie;
                Intrinsics.delta(PROTECTED, "PROTECTED");
                return PROTECTED;
            case 5:
                C2339o PUBLIC = AbstractC2340p.echo;
                Intrinsics.delta(PUBLIC, "PUBLIC");
                return PUBLIC;
            case 6:
                C2339o LOCAL = AbstractC2340p.foxtrot;
                Intrinsics.delta(LOCAL, "LOCAL");
                return LOCAL;
            default:
                C2339o PRIVATE2 = AbstractC2340p.alpha;
                Intrinsics.delta(PRIVATE2, "PRIVATE");
                return PRIVATE2;
        }
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [A2.aa, java.lang.Object] */
    public static final aa bravo(aa tracer, String label, i executor, Function0 function0) {
        Intrinsics.echo(tracer, "tracer");
        Intrinsics.echo(label, "label");
        Intrinsics.echo(executor, "executor");
        AbstractC3003i.alpha(new af(executor, tracer, label, function0, new au(aa.charlie)));
        return new Object();
    }

    public static final int charlie(z zVar) {
        int i4;
        if (zVar == null) {
            i4 = -1;
        } else {
            i4 = u.$EnumSwitchMapping$0[zVar.ordinal()];
        }
        if (i4 != 1) {
            int i5 = 2;
            if (i4 != 2) {
                i5 = 3;
                if (i4 != 3) {
                    i5 = 4;
                    if (i4 != 4) {
                    }
                }
            }
            return i5;
        }
        return 1;
    }
}
