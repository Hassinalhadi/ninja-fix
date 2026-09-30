package T0;

import android.view.WindowInsets;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import q0.z;
import s0.W;
import s0.al;
import s1.a0;
import s1.au;
import t0.C2930o;
import t0.C2946x;

/* loaded from: classes3.dex */
public final class c extends Lambda implements Function1 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ t purple;
    public final /* synthetic */ al red;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(t tVar, al alVar, int i4) {
        super(1);
        this.alpha = i4;
        this.purple = tVar;
        this.red = alVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        C2946x c2946x;
        WindowInsets golf;
        switch (this.alpha) {
            case 0:
                W w4 = (W) obj;
                if (w4 instanceof C2946x) {
                    c2946x = (C2946x) w4;
                } else {
                    c2946x = null;
                }
                t tVar = this.purple;
                if (c2946x != null) {
                    HashMap<j, al> holderToLayoutNode = c2946x.getAndroidViewsHandler$ui_release().getHolderToLayoutNode();
                    al alVar = this.red;
                    holderToLayoutNode.put(tVar, alVar);
                    c2946x.getAndroidViewsHandler$ui_release().addView(tVar);
                    c2946x.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().put(alVar, tVar);
                    tVar.setImportantForAccessibility(1);
                    au.november(tVar, new C2930o(c2946x, alVar, c2946x));
                }
                if (tVar.getView().getParent() != tVar) {
                    tVar.addView(tVar.getView());
                }
                return Unit.INSTANCE;
            case 1:
                l.delta(this.purple, this.red);
                return Unit.INSTANCE;
            default:
                t tVar2 = this.purple;
                l.delta(tVar2, this.red);
                ((C2946x) tVar2.red).f13912t = true;
                int[] iArr = tVar2.f2072g;
                int i4 = iArr[0];
                int i5 = iArr[1];
                tVar2.getView().getLocationOnScreen(iArr);
                long j5 = tVar2.f2073h;
                long kilo = ((z) obj).kilo();
                tVar2.f2073h = kilo;
                a0 a0Var = tVar2.f2074i;
                if (a0Var != null && ((i4 != iArr[0] || i5 != iArr[1] || !Q0.m.alpha(j5, kilo)) && (golf = tVar2.foxtrot(a0Var).golf()) != null)) {
                    tVar2.getView().dispatchApplyWindowInsets(golf);
                }
                return Unit.INSTANCE;
        }
    }
}
