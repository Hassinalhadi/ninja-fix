package n;

import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import s0.C2549i;
import s0.C2550j;
import s0.C2551k;
import s0.InterfaceC2552l;
import y.C3344D;

/* loaded from: classes3.dex */
public final class ab implements Xd.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Q0.d f12982a;
    public final /* synthetic */ C3344D alpha;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f12983b;
    public final /* synthetic */ ax purple;
    public final /* synthetic */ boolean red;
    public final /* synthetic */ boolean silver;
    public final /* synthetic */ Function1 teal;
    public final /* synthetic */ I0.aa white;
    public final /* synthetic */ I0.t yellow;

    public ab(C3344D c3344d, ax axVar, boolean z2, boolean z10, Function1 function1, I0.aa aaVar, I0.t tVar, Q0.d dVar, int i4) {
        this.alpha = c3344d;
        this.purple = axVar;
        this.red = z2;
        this.silver = z10;
        this.teal = function1;
        this.white = aaVar;
        this.yellow = tVar;
        this.f12982a = dVar;
        this.f12983b = i4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0099, code lost:
    
        if (r1 != false) goto L26;
     */
    @Override // Xd.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2) {
        boolean z2;
        InterfaceC0581m interfaceC0581m = (InterfaceC0581m) obj;
        int intValue = ((Number) obj2).intValue();
        boolean z10 = true;
        if ((intValue & 3) != 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        C0585q c0585q = (C0585q) interfaceC0581m;
        if (c0585q.magenta(intValue & 1, z2)) {
            I0.aa aaVar = this.white;
            ax axVar = this.purple;
            aa aaVar2 = new aa(axVar, this.teal, aaVar, this.yellow, this.f12982a, this.f12983b);
            T.p pVar = T.p.alpha;
            long j5 = c0585q.magenta;
            int i4 = (int) (j5 ^ (j5 >>> 32));
            androidx.compose.runtime.I mike = c0585q.mike();
            T.s charlie = T.a.charlie(pVar, c0585q);
            InterfaceC2552l.maroon.getClass();
            C2550j c2550j = C2551k.bravo;
            c0585q.white();
            if (c0585q.lime) {
                c0585q.lima(c2550j);
            } else {
                c0585q.i();
            }
            C0564b.blue(C2551k.foxtrot, c0585q, aaVar2);
            C0564b.blue(C2551k.echo, c0585q, mike);
            C2549i c2549i = C2551k.golf;
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i4))) {
                ao.ad.blue(i4, c0585q, i4, c2549i);
            }
            C0564b.blue(C2551k.delta, c0585q, charlie);
            c0585q.quebec(true);
            am alpha = axVar.alpha();
            am amVar = am.alpha;
            boolean z11 = this.red;
            if (alpha != amVar && axVar.charlie() != null) {
                q0.z charlie2 = axVar.charlie();
                Intrinsics.checkNotNull(charlie2);
                if (charlie2.india()) {
                }
            }
            z10 = false;
            C3344D c3344d = this.alpha;
            at.juliet(c3344d, z10, c0585q, 0);
            if (axVar.alpha() == am.red && !this.silver && z11) {
                c0585q.purple(-714666198);
                at.kilo(c3344d, c0585q, 0);
                c0585q.quebec(false);
            } else {
                c0585q.purple(-714589318);
                c0585q.quebec(false);
            }
        } else {
            c0585q.ochre();
        }
        return Unit.INSTANCE;
    }
}
