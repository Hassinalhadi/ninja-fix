package androidx.compose.foundation.layout;

import a2.C0393r;
import android.view.View;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.WeakHashMap;
import kotlin.jvm.functions.Function1;

/* renamed from: androidx.compose.foundation.layout.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0537c implements InterfaceC0539e, InterfaceC0541g {
    public final /* synthetic */ int alpha;

    public /* synthetic */ C0537c(int i4) {
        this.alpha = i4;
    }

    public static final C0535a delta(int i4, String str) {
        WeakHashMap weakHashMap = b0.whiskey;
        return new C0535a(i4, str);
    }

    public static final Z echo(int i4, String str) {
        WeakHashMap weakHashMap = b0.whiskey;
        return new Z(new az(0, 0, 0, 0), str);
    }

    public static b0 foxtrot(InterfaceC0581m interfaceC0581m) {
        b0 b0Var;
        C0585q c0585q = (C0585q) interfaceC0581m;
        View view = (View) c0585q.kilo(AndroidCompositionLocals_androidKt.foxtrot);
        WeakHashMap weakHashMap = b0.whiskey;
        synchronized (weakHashMap) {
            try {
                Object obj = weakHashMap.get(view);
                if (obj == null) {
                    obj = new b0(view);
                    weakHashMap.put(view, obj);
                }
                b0Var = (b0) obj;
            } catch (Throwable th) {
                throw th;
            }
        }
        boolean india = c0585q.india(b0Var) | c0585q.india(view);
        Object jade = c0585q.jade();
        if (india || jade == C0580l.alpha) {
            jade = new C0393r(7, b0Var, view);
            c0585q.f(jade);
        }
        C0564b.delta(b0Var, (Function1) jade, c0585q);
        return b0Var;
    }

    @Override // androidx.compose.foundation.layout.InterfaceC0539e, androidx.compose.foundation.layout.InterfaceC0541g
    public float alpha() {
        switch (this.alpha) {
            case 0:
                return 0;
            case 1:
                return 0;
            case 2:
                return 0;
            case 3:
                return 0;
            case 4:
                return 0;
            default:
                return 0;
        }
    }

    @Override // androidx.compose.foundation.layout.InterfaceC0541g
    public void bravo(Q0.d dVar, int i4, int[] iArr, int[] iArr2) {
        switch (this.alpha) {
            case 2:
                AbstractC0542h.charlie(i4, iArr, iArr2, false);
                return;
            default:
                AbstractC0542h.bravo(iArr, iArr2, false);
                return;
        }
    }

    @Override // androidx.compose.foundation.layout.InterfaceC0539e
    public void charlie(Q0.d dVar, int i4, int[] iArr, Q0.n nVar, int[] iArr2) {
        switch (this.alpha) {
            case 0:
                AbstractC0542h.bravo(iArr, iArr2, false);
                return;
            case 1:
                AbstractC0542h.charlie(i4, iArr, iArr2, false);
                return;
            case 2:
            default:
                if (nVar == Q0.n.alpha) {
                    AbstractC0542h.bravo(iArr, iArr2, false);
                    return;
                } else {
                    AbstractC0542h.charlie(i4, iArr, iArr2, true);
                    return;
                }
            case 3:
                if (nVar == Q0.n.alpha) {
                    AbstractC0542h.charlie(i4, iArr, iArr2, false);
                    return;
                } else {
                    AbstractC0542h.bravo(iArr, iArr2, true);
                    return;
                }
        }
    }

    public String toString() {
        switch (this.alpha) {
            case 0:
                return "AbsoluteArrangement#Left";
            case 1:
                return "AbsoluteArrangement#Right";
            case 2:
                return "Arrangement#Bottom";
            case 3:
                return "Arrangement#End";
            case 4:
                return "Arrangement#Start";
            case 5:
                return "Arrangement#Top";
            default:
                return super.toString();
        }
    }
}
