package Jf;

import D0.y;
import J2.l;
import Jb.aw;
import Nf.AbstractC0255m;
import Nf.L;
import Nf.ay;
import kotlin.jvm.functions.Function1;
import w.o;

/* loaded from: classes2.dex */
public abstract class g {
    public static final L alpha;
    public static final L bravo;
    public static final ay charlie;
    public static final ay delta;

    static {
        L lVar;
        L lVar2;
        ay oVar;
        ay oVar2;
        aw awVar = new aw(3);
        boolean z2 = AbstractC0255m.alpha;
        if (z2) {
            lVar = new J2.c(awVar);
        } else {
            lVar = new l((Function1) awVar);
        }
        alpha = lVar;
        aw awVar2 = new aw(4);
        if (z2) {
            lVar2 = new J2.c(awVar2);
        } else {
            lVar2 = new l((Function1) awVar2);
        }
        bravo = lVar2;
        y yVar = new y(24);
        if (z2) {
            oVar = new J2.e((Xd.l) yVar);
        } else {
            oVar = new o(yVar);
        }
        charlie = oVar;
        y yVar2 = new y(25);
        if (z2) {
            oVar2 = new J2.e((Xd.l) yVar2);
        } else {
            oVar2 = new o(yVar2);
        }
        delta = oVar2;
    }
}
