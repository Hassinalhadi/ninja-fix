package F;

import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import kotlin.Unit;
import kotlin.jvm.internal.Lambda;

/* renamed from: F.m, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0132m extends Lambda implements Xd.l {
    public final /* synthetic */ int alpha = 0;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f1147c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f1148d;
    public final /* synthetic */ P.d e;
    public final /* synthetic */ T.s purple;
    public final /* synthetic */ bz.an red;
    public final /* synthetic */ androidx.compose.runtime.ax silver;
    public final /* synthetic */ b.g0 teal;
    public final /* synthetic */ a0.as white;
    public final /* synthetic */ long yellow;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0132m(T.s sVar, bz.an anVar, androidx.compose.runtime.ax axVar, b.g0 g0Var, a0.as asVar, long j5, float f5, float f10, P.d dVar) {
        super(2);
        this.purple = sVar;
        this.red = anVar;
        this.silver = axVar;
        this.teal = g0Var;
        this.white = asVar;
        this.yellow = j5;
        this.f1147c = f5;
        this.f1148d = f10;
        this.e = dVar;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        switch (this.alpha) {
            case 0:
                InterfaceC0581m interfaceC0581m = (InterfaceC0581m) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    C0585q c0585q = (C0585q) interfaceC0581m;
                    if (c0585q.bronze()) {
                        c0585q.ochre();
                        return Unit.INSTANCE;
                    }
                }
                AbstractC0173x0.alpha(this.purple, this.red, this.silver, this.teal, this.white, this.yellow, this.f1147c, this.f1148d, this.e, interfaceC0581m, 384);
                return Unit.INSTANCE;
            default:
                ((Number) obj2).intValue();
                int cyan = C0564b.cyan(385);
                P.d dVar = this.e;
                bz.an anVar = this.red;
                float f5 = this.f1147c;
                float f10 = this.f1148d;
                AbstractC0173x0.alpha(this.purple, anVar, this.silver, this.teal, this.white, this.yellow, f5, f10, dVar, (InterfaceC0581m) obj, cyan);
                return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0132m(T.s sVar, bz.an anVar, androidx.compose.runtime.ax axVar, b.g0 g0Var, a0.as asVar, long j5, float f5, float f10, P.d dVar, int i4) {
        super(2);
        this.purple = sVar;
        this.red = anVar;
        this.silver = axVar;
        this.teal = g0Var;
        this.white = asVar;
        this.yellow = j5;
        this.f1147c = f5;
        this.f1148d = f10;
        this.e = dVar;
    }
}
