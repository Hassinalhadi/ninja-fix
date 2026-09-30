package n;

import Yb.C0331t0;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import ge.InterfaceC1775g;
import kotlin.jvm.functions.Function1;
import y.C3344D;
import y.C3353M;

/* loaded from: classes3.dex */
public final class T implements Xd.m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C2146v f12980a;
    public final /* synthetic */ ax alpha;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f12981b;
    public final /* synthetic */ C3344D purple;
    public final /* synthetic */ I0.aa red;
    public final /* synthetic */ boolean silver;
    public final /* synthetic */ boolean teal;
    public final /* synthetic */ I0.t white;
    public final /* synthetic */ j0 yellow;

    public T(ax axVar, C3344D c3344d, I0.aa aaVar, boolean z2, boolean z10, I0.t tVar, j0 j0Var, C2146v c2146v, int i4) {
        this.alpha = axVar;
        this.purple = c3344d;
        this.red = aaVar;
        this.silver = z2;
        this.teal = z10;
        this.white = tVar;
        this.yellow = j0Var;
        this.f12980a = c2146v;
        this.f12981b = i4;
    }

    @Override // Xd.m
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ((Number) obj3).intValue();
        C0585q c0585q = (C0585q) ((InterfaceC0581m) obj2);
        c0585q.purple(851809892);
        Object jade = c0585q.jade();
        androidx.compose.runtime.as asVar = C0580l.alpha;
        if (jade == asVar) {
            jade = new Object();
            c0585q.f(jade);
        }
        C3353M c3353m = (C3353M) jade;
        Object jade2 = c0585q.jade();
        if (jade2 == asVar) {
            jade2 = new Object();
            c0585q.f(jade2);
        }
        ax axVar = this.alpha;
        C3344D c3344d = this.purple;
        I0.aa aaVar = this.red;
        j0 j0Var = this.yellow;
        S s3 = new S(axVar, c3344d, aaVar, this.silver, this.teal, c3353m, this.white, j0Var, (ak) jade2, this.f12980a, this.f12981b);
        boolean india = c0585q.india(s3);
        Object jade3 = c0585q.jade();
        if (india || jade3 == asVar) {
            C0331t0 c0331t0 = new C0331t0(1, s3, S.class, "process", "process-ZmokQxo(Landroid/view/KeyEvent;)Z", 0, 16);
            c0585q.f(c0331t0);
            jade3 = c0331t0;
        }
        T.s alpha = androidx.compose.ui.input.key.a.alpha((Function1) ((InterfaceC1775g) jade3));
        c0585q.quebec(false);
        return alpha;
    }
}
