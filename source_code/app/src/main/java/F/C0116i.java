package F;

import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import kotlin.Unit;
import kotlin.jvm.internal.Lambda;

/* renamed from: F.i, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0116i extends Lambda implements Xd.l {
    public final /* synthetic */ Xd.l alpha;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f1130c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f1131d;
    public final /* synthetic */ P.d e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ P.d f1132f;
    public final /* synthetic */ P.d purple;
    public final /* synthetic */ P.d red;
    public final /* synthetic */ a0.as silver;
    public final /* synthetic */ long teal;
    public final /* synthetic */ float white;
    public final /* synthetic */ long yellow;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0116i(Xd.l lVar, P.d dVar, P.d dVar2, a0.as asVar, long j5, float f5, long j6, long j7, long j10, P.d dVar3, P.d dVar4) {
        super(2);
        this.alpha = lVar;
        this.purple = dVar;
        this.red = dVar2;
        this.silver = asVar;
        this.teal = j5;
        this.white = f5;
        this.yellow = j6;
        this.f1130c = j7;
        this.f1131d = j10;
        this.e = dVar3;
        this.f1132f = dVar4;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC0581m interfaceC0581m = (InterfaceC0581m) obj;
        if ((((Number) obj2).intValue() & 3) == 2) {
            C0585q c0585q = (C0585q) interfaceC0581m;
            if (c0585q.bronze()) {
                c0585q.ochre();
                return Unit.INSTANCE;
            }
        }
        P.d echo = P.e.echo(1163543932, new C0112h(this.e, this.f1132f, 1), interfaceC0581m);
        int i4 = H.d.alpha;
        AbstractC0128l.alpha(echo, null, this.alpha, this.purple, this.red, this.silver, this.teal, this.white, Q.delta(interfaceC0581m, 26), this.yellow, this.f1130c, this.f1131d, interfaceC0581m, 6);
        return Unit.INSTANCE;
    }
}
