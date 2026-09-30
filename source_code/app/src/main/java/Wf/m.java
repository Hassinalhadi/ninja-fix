package Wf;

import a0.C0352f;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.N;
import f0.AbstractC1680b;
import f0.C1679a;
import g0.AbstractC1722b;
import g0.C1726f;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import t0.AbstractC2901T;
import t6.AbstractC3067v;
import t6.AbstractC3072w;

/* loaded from: classes2.dex */
public abstract class m {
    public static final Lazy alpha = LazyKt.lazy(new Vc.i(4));
    public static final Lazy bravo = LazyKt.lazy(new Vc.i(5));
    public static final Lazy charlie = LazyKt.lazy(new Vc.i(6));
    public static final w.o delta = new w.o(18);

    public static final AbstractC1680b alpha(e resource, C0585q c0585q, int i4) {
        boolean z2;
        Intrinsics.echo(resource, "resource");
        c0585q.purple(-1508925367);
        N n5 = u.bravo;
        ((s) c0585q.kilo(n5)).getClass();
        r alpha2 = s.alpha(c0585q);
        c0585q.purple(-1389301971);
        int i5 = (i4 & 14) ^ 6;
        boolean z10 = true;
        if ((i5 > 4 && c0585q.golf(resource)) || (i4 & 6) == 4) {
            z2 = true;
        } else {
            z2 = false;
        }
        boolean golf = z2 | c0585q.golf(alpha2);
        Object jade = c0585q.jade();
        Object obj = C0580l.alpha;
        if (golf || jade == obj) {
            jade = u.alpha(resource, alpha2).bravo;
            c0585q.f(jade);
        }
        String str = (String) jade;
        c0585q.quebec(false);
        if (kotlin.text.r.golf(str, ".xml", true)) {
            c0585q.purple(-118556854);
            c0585q.purple(-1394399862);
            x charlie2 = AbstractC3067v.charlie(w.bravo, c0585q);
            Q0.d dVar = (Q0.d) c0585q.kilo(AbstractC2901T.hotel);
            c0585q.purple(1002154924);
            Object jade2 = c0585q.jade();
            if (jade2 == obj) {
                jade2 = new Vc.i(8);
                c0585q.f(jade2);
            }
            Function0 function0 = (Function0) jade2;
            c0585q.quebec(false);
            c0585q.purple(1002155875);
            if ((i5 <= 4 || !c0585q.golf(resource)) && (i4 & 6) != 4) {
                z10 = false;
            }
            boolean india = c0585q.india(charlie2) | z10 | c0585q.golf(dVar);
            Object jade3 = c0585q.jade();
            if (india || jade3 == obj) {
                jade3 = new l(resource, charlie2, dVar, null);
                c0585q.f(jade3);
            }
            c0585q.quebec(false);
            C1726f c1726f = (C1726f) AbstractC3072w.charlie(resource, charlie2, dVar, function0, (Xd.l) jade3, c0585q).getValue();
            c0585q.quebec(false);
            g0.aj bravo2 = AbstractC1722b.bravo(c1726f, c0585q);
            c0585q.quebec(false);
            c0585q.quebec(false);
            return bravo2;
        }
        if (kotlin.text.r.golf(str, ".svg", true)) {
            c0585q.purple(-118445595);
            c0585q.purple(1371694195);
            x charlie3 = AbstractC3067v.charlie(w.bravo, c0585q);
            Q0.d dVar2 = (Q0.d) c0585q.kilo(AbstractC2901T.hotel);
            c0585q.purple(-946505599);
            Object jade4 = c0585q.jade();
            if (jade4 == obj) {
                jade4 = new Vc.i(7);
                c0585q.f(jade4);
            }
            Function0 function02 = (Function0) jade4;
            c0585q.quebec(false);
            c0585q.purple(-946504685);
            if ((i5 <= 4 || !c0585q.golf(resource)) && (i4 & 6) != 4) {
                z10 = false;
            }
            boolean india2 = c0585q.india(charlie3) | z10 | c0585q.golf(dVar2);
            Object jade5 = c0585q.jade();
            if (india2 || jade5 == obj) {
                jade5 = new k(resource, charlie3, dVar2, null);
                c0585q.f(jade5);
            }
            c0585q.quebec(false);
            AbstractC1680b abstractC1680b = (AbstractC1680b) AbstractC3072w.charlie(resource, charlie3, dVar2, function02, (Xd.l) jade5, c0585q).getValue();
            A0.z.papa(c0585q, false, false, false);
            return abstractC1680b;
        }
        c0585q.purple(-118396429);
        c0585q.purple(1838739546);
        x charlie4 = AbstractC3067v.charlie(w.bravo, c0585q);
        c0585q.purple(707674437);
        ((s) c0585q.kilo(n5)).getClass();
        r alpha3 = s.alpha(c0585q);
        c0585q.quebec(false);
        c0585q.purple(1334347382);
        Object jade6 = c0585q.jade();
        if (jade6 == obj) {
            jade6 = new Vc.i(3);
            c0585q.f(jade6);
        }
        Function0 function03 = (Function0) jade6;
        c0585q.quebec(false);
        c0585q.purple(1334348812);
        if ((i5 <= 4 || !c0585q.golf(resource)) && (i4 & 6) != 4) {
            z10 = false;
        }
        boolean golf2 = c0585q.golf(alpha3) | z10 | c0585q.india(charlie4);
        Object jade7 = c0585q.jade();
        if (golf2 || jade7 == obj) {
            jade7 = new i(resource, alpha3, charlie4, null);
            c0585q.f(jade7);
        }
        c0585q.quebec(false);
        C0352f c0352f = (C0352f) AbstractC3072w.charlie(resource, charlie4, alpha3, function03, (Xd.l) jade7, c0585q).getValue();
        c0585q.quebec(false);
        C1679a c1679a = new C1679a(c0352f);
        c0585q.quebec(false);
        c0585q.quebec(false);
        return c1679a;
    }
}
