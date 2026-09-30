package F;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class D1 extends Lambda implements Function1 {
    public final /* synthetic */ long alpha;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f1003c;
    public final /* synthetic */ c0.h purple;
    public final /* synthetic */ bz.ag red;
    public final /* synthetic */ bz.ag silver;
    public final /* synthetic */ bz.ag teal;
    public final /* synthetic */ bz.ag white;
    public final /* synthetic */ float yellow;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D1(float f5, long j5, long j6, bz.ag agVar, bz.ag agVar2, bz.ag agVar3, bz.ag agVar4, c0.h hVar) {
        super(1);
        this.alpha = j5;
        this.purple = hVar;
        this.red = agVar;
        this.silver = agVar2;
        this.teal = agVar3;
        this.white = agVar4;
        this.yellow = f5;
        this.f1003c = j6;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        float f5;
        c0.d dVar = (c0.d) obj;
        c0.h hVar = this.purple;
        G1.charlie(dVar, 0.0f, 360.0f, this.alpha, hVar);
        float floatValue = (((Number) this.red.getValue()).floatValue() * 216.0f) % 360.0f;
        float floatValue2 = ((Number) this.silver.getValue()).floatValue();
        bz.ag agVar = this.teal;
        float abs = Math.abs(floatValue2 - ((Number) agVar.getValue()).floatValue());
        float floatValue3 = ((Number) agVar.getValue()).floatValue() + ((Number) this.white.getValue()).floatValue() + (floatValue - 90.0f);
        if (hVar.charlie == 0) {
            f5 = 0.0f;
        } else {
            f5 = ((this.yellow / (G1.bravo / 2)) * 57.29578f) / 2.0f;
        }
        G1.charlie(dVar, floatValue3 + f5, Math.max(abs, 0.1f), this.f1003c, hVar);
        return Unit.INSTANCE;
    }
}
