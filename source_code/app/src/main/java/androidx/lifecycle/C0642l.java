package androidx.lifecycle;

import java.util.HashMap;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import o2.C2194d;

/* renamed from: androidx.lifecycle.l, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0642l implements aj {
    public final /* synthetic */ int alpha = 1;
    public final Object purple;
    public final Object red;

    public C0642l(InterfaceC0640j defaultLifecycleObserver, aj ajVar) {
        Intrinsics.echo(defaultLifecycleObserver, "defaultLifecycleObserver");
        this.purple = defaultLifecycleObserver;
        this.red = ajVar;
    }

    @Override // androidx.lifecycle.aj
    public final void onStateChanged(al alVar, aa aaVar) {
        switch (this.alpha) {
            case 0:
                int i4 = AbstractC0641k.$EnumSwitchMapping$0[aaVar.ordinal()];
                InterfaceC0640j interfaceC0640j = (InterfaceC0640j) this.purple;
                switch (i4) {
                    case 1:
                        interfaceC0640j.onCreate(alVar);
                        break;
                    case 2:
                        interfaceC0640j.onStart(alVar);
                        break;
                    case 3:
                        interfaceC0640j.onResume(alVar);
                        break;
                    case 4:
                        interfaceC0640j.onPause(alVar);
                        break;
                    case 5:
                        interfaceC0640j.onStop(alVar);
                        break;
                    case 6:
                        interfaceC0640j.onDestroy(alVar);
                        break;
                    case 7:
                        throw new IllegalArgumentException("ON_ANY must not been send by anybody");
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                aj ajVar = (aj) this.red;
                if (ajVar != null) {
                    ajVar.onStateChanged(alVar, aaVar);
                    return;
                }
                return;
            case 1:
                if (aaVar == aa.ON_START) {
                    ((ac) this.purple).charlie(this);
                    ((C2194d) this.red).delta();
                    return;
                }
                return;
            default:
                HashMap hashMap = ((C0634d) this.red).alpha;
                List list = (List) hashMap.get(aaVar);
                ak akVar = (ak) this.purple;
                C0634d.alpha(list, alVar, aaVar, akVar);
                C0634d.alpha((List) hashMap.get(aa.ON_ANY), alVar, aaVar, akVar);
                return;
        }
    }

    public C0642l(ak akVar) {
        this.purple = akVar;
        C0636f c0636f = C0636f.charlie;
        Class<?> cls = akVar.getClass();
        C0634d c0634d = (C0634d) c0636f.alpha.get(cls);
        this.red = c0634d == null ? c0636f.alpha(cls, null) : c0634d;
    }

    public C0642l(ac acVar, C2194d c2194d) {
        this.purple = acVar;
        this.red = c2194d;
    }
}
