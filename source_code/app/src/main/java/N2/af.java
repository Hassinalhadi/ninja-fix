package N2;

import android.content.Context;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import androidx.compose.runtime.as;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.jvm.internal.Intrinsics;
import q0.C2391j;
import q0.InterfaceC2392k;

/* loaded from: classes3.dex */
public abstract class af {
    public static final long alpha = Q0.b.hotel(0, 0, 0, 0);
    public static final Y2.e bravo;

    /* JADX WARN: Type inference failed for: r0v3, types: [Y2.e, java.lang.Object] */
    static {
        Y2.h hVar = Y2.h.charlie;
        bravo = new Object();
    }

    public static final X2.h alpha(Object obj, InterfaceC0581m interfaceC0581m) {
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.red(1087186730);
        if (obj instanceof X2.h) {
            X2.h hVar = (X2.h) obj;
            c0585q.quebec(false);
            return hVar;
        }
        Context context = (Context) c0585q.kilo(AndroidCompositionLocals_androidKt.bravo);
        c0585q.red(-1245195153);
        boolean golf = c0585q.golf(context) | c0585q.golf(obj);
        Object jade = c0585q.jade();
        if (golf || jade == C0580l.alpha) {
            X2.g gVar = new X2.g(context);
            gVar.charlie = obj;
            jade = gVar.alpha();
            c0585q.f(jade);
        }
        X2.h hVar2 = (X2.h) jade;
        c0585q.quebec(false);
        c0585q.quebec(false);
        return hVar2;
    }

    public static final X2.h bravo(Object obj, InterfaceC2392k interfaceC2392k, InterfaceC0581m interfaceC0581m) {
        Y2.i iVar;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.red(1677680258);
        boolean z2 = obj instanceof X2.h;
        if (z2) {
            X2.h hVar = (X2.h) obj;
            if (hVar.yankee.alpha != null) {
                c0585q.quebec(false);
                return hVar;
            }
        }
        c0585q.red(408306591);
        boolean areEqual = Intrinsics.areEqual(interfaceC2392k, C2391j.echo);
        as asVar = C0580l.alpha;
        if (areEqual) {
            iVar = bravo;
        } else {
            c0585q.red(408309406);
            Object jade = c0585q.jade();
            if (jade == asVar) {
                jade = new v();
                c0585q.f(jade);
            }
            iVar = (v) jade;
            c0585q.quebec(false);
        }
        c0585q.quebec(false);
        if (z2) {
            c0585q.red(-227230258);
            X2.h hVar2 = (X2.h) obj;
            c0585q.red(408312509);
            boolean golf = c0585q.golf(hVar2) | c0585q.golf(iVar);
            Object jade2 = c0585q.jade();
            if (golf || jade2 == asVar) {
                X2.g alpha2 = X2.h.alpha(hVar2);
                alpha2.mike = iVar;
                alpha2.oscar = null;
                alpha2.papa = null;
                alpha2.quebec = null;
                jade2 = alpha2.alpha();
                c0585q.f(jade2);
            }
            X2.h hVar3 = (X2.h) jade2;
            A0.z.papa(c0585q, false, false, false);
            return hVar3;
        }
        c0585q.red(-227066702);
        Context context = (Context) c0585q.kilo(AndroidCompositionLocals_androidKt.bravo);
        c0585q.red(408319118);
        boolean golf2 = c0585q.golf(context) | c0585q.golf(obj) | c0585q.golf(iVar);
        Object jade3 = c0585q.jade();
        if (golf2 || jade3 == asVar) {
            X2.g gVar = new X2.g(context);
            gVar.charlie = obj;
            gVar.mike = iVar;
            gVar.oscar = null;
            gVar.papa = null;
            gVar.quebec = null;
            jade3 = gVar.alpha();
            c0585q.f(jade3);
        }
        X2.h hVar4 = (X2.h) jade3;
        A0.z.papa(c0585q, false, false, false);
        return hVar4;
    }
}
