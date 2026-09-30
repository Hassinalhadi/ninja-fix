package n;

import android.os.Build;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.E0;
import androidx.compose.runtime.InterfaceC0581m;
import h5.C1809a;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;
import t0.AbstractC2901T;

/* renamed from: n.p, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2141p {
    public static final E0 alpha = new androidx.compose.runtime.N(new C1809a(19));
    public static Boolean bravo;

    /* JADX WARN: Code restructure failed: missing block: B:32:0x003e, code lost:
    
        if (r14.golf(r11) == false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void alpha(D0.g gVar, D0.an anVar, H0.j jVar, List list, InterfaceC0581m interfaceC0581m, int i4) {
        boolean z2;
        boolean golf;
        Object jade;
        C0585q c0585q = (C0585q) interfaceC0581m;
        Executor executor = (Executor) c0585q.kilo(alpha);
        if (executor != null && bravo(gVar.purple.length())) {
            c0585q.purple(-518708178);
            Q0.n nVar = (Q0.n) c0585q.kilo(AbstractC2901T.november);
            Q0.d dVar = (Q0.d) c0585q.kilo(AbstractC2901T.hotel);
            boolean z10 = true;
            if (((i4 & 112) ^ 48) > 32) {
            }
            if ((i4 & 48) != 32) {
                z2 = false;
                boolean echo = z2 | c0585q.echo(nVar.ordinal()) | c0585q.india(list);
                if ((((i4 & 14) ^ 6) > 4 || !c0585q.golf(gVar)) && (i4 & 6) != 4) {
                    z10 = false;
                }
                golf = echo | z10 | c0585q.golf(dVar) | c0585q.india(jVar);
                jade = c0585q.jade();
                if (!golf || jade == C0580l.alpha) {
                    av.k kVar = new av.k(anVar, nVar, list, gVar, dVar, jVar);
                    c0585q.f(kVar);
                    jade = kVar;
                }
                executor.execute((Runnable) jade);
                c0585q.quebec(false);
                return;
            }
            z2 = true;
            boolean echo2 = z2 | c0585q.echo(nVar.ordinal()) | c0585q.india(list);
            if (((i4 & 14) ^ 6) > 4) {
            }
            z10 = false;
            golf = echo2 | z10 | c0585q.golf(dVar) | c0585q.india(jVar);
            jade = c0585q.jade();
            if (!golf) {
            }
            av.k kVar2 = new av.k(anVar, nVar, list, gVar, dVar, jVar);
            c0585q.f(kVar2);
            jade = kVar2;
            executor.execute((Runnable) jade);
            c0585q.quebec(false);
            return;
        }
        c0585q.purple(-517807721);
        c0585q.quebec(false);
    }

    public static final boolean bravo(int i4) {
        boolean z2;
        if (Build.VERSION.SDK_INT >= 28 && i4 >= 8 && i4 < 1000) {
            if (bravo == null) {
                if (Runtime.getRuntime().availableProcessors() >= 4) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                bravo = Boolean.valueOf(z2);
            }
            Boolean bool = bravo;
            Intrinsics.checkNotNull(bool);
            if (bool.booleanValue()) {
                return true;
            }
        }
        return false;
    }
}
