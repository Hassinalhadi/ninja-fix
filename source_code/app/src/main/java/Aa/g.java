package Aa;

import Ce.r;
import Dc.v;
import F.C0143o2;
import I0.ad;
import Jb.C0200h;
import Jb.C0215x;
import Jb.b0;
import android.os.Trace;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.InputMethodManager;
import androidx.lifecycle.d0;
import delivery.samurai.android.ui.captainsuniforms.CaptainsUniformsFragment;
import delivery.samurai.android.ui.suspension.SuspensionFragment;
import id.C1915c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import s6.K4;
import s6.Q6;
import ue.C3158b;
import yf.InterfaceC3439i;

/* loaded from: classes2.dex */
public final class g extends Lambda implements Function0 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Object purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(int i4, Object obj) {
        super(0);
        this.alpha = i4;
        this.purple = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.alpha) {
            case 0:
                return (j) this.purple;
            case 1:
                return (d0) ((g) this.purple).invoke();
            case 2:
                return (n) this.purple;
            case 3:
                return (d0) ((g) this.purple).invoke();
            case 4:
                return (p) this.purple;
            case 5:
                return (d0) ((g) this.purple).invoke();
            case 6:
                B0.b bVar = (B0.b) this.purple;
                bVar.golf = null;
                Trace.beginSection("OnPositionedDispatch");
                try {
                    bVar.alpha();
                    Trace.endSection();
                    return Unit.INSTANCE;
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            case 7:
                return (Ba.n) this.purple;
            case 8:
                return (d0) ((g) this.purple).invoke();
            case 9:
                Ce.d dVar = (Ce.d) this.purple;
                Collection values = ((Map) K4.alpha(dVar.charlie.f924c, r.f921g[0])).values();
                ArrayList arrayList = new ArrayList();
                Iterator it = values.iterator();
                while (it.hasNext()) {
                    ef.p alpha = ((Be.a) dVar.bravo.purple).delta.alpha(dVar.charlie, (C3158b) it.next());
                    if (alpha != null) {
                        arrayList.add(alpha);
                    }
                }
                return (Xe.n[]) Q6.charlie(arrayList).toArray(new Xe.n[0]);
            case 10:
                return (d0) ((v) this.purple).invoke();
            case 11:
                return (d0) ((v) this.purple).invoke();
            case 12:
                return (Ea.g) this.purple;
            case 13:
                return (d0) ((g) this.purple).invoke();
            case 14:
                return Float.valueOf(((Q0.d) this.purple).lavender(125));
            case 15:
                return ((C0143o2) this.purple).kilo;
            case 16:
                return new F2.c[((InterfaceC3439i[]) this.purple).length];
            case 17:
                return Float.valueOf(((Number) ((G.v) this.purple).alpha.delta()).floatValue());
            case 18:
                return (CaptainsUniformsFragment) this.purple;
            case 19:
                return (d0) ((g) this.purple).invoke();
            case 20:
                return (Gc.q) this.purple;
            case 21:
                return (d0) ((g) this.purple).invoke();
            case 22:
                Object systemService = ((View) ((C1915c) this.purple).purple).getContext().getSystemService("input_method");
                Intrinsics.charlie(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                return (InputMethodManager) systemService;
            case 23:
                return new BaseInputConnection(((ad) this.purple).alpha, false);
            case 24:
                return (d0) ((C0200h) this.purple).invoke();
            case 25:
                return (C0215x) this.purple;
            case 26:
                return (d0) ((g) this.purple).invoke();
            case 27:
                return (d0) ((b0) this.purple).invoke();
            case 28:
                return (SuspensionFragment) this.purple;
            default:
                return (d0) ((g) this.purple).invoke();
        }
    }
}
