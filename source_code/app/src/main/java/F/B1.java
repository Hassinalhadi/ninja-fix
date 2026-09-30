package F;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class B1 extends Lambda implements Function1 {
    public final /* synthetic */ Function0 alpha;
    public final /* synthetic */ int purple;
    public final /* synthetic */ float red;
    public final /* synthetic */ float silver;
    public final /* synthetic */ long teal;
    public final /* synthetic */ c0.h white;
    public final /* synthetic */ long yellow;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B1(Function0 function0, int i4, float f5, float f10, long j5, c0.h hVar, long j6) {
        super(1);
        this.alpha = function0;
        this.purple = i4;
        this.red = f5;
        this.silver = f10;
        this.teal = j5;
        this.white = hVar;
        this.yellow = j6;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        c0.d dVar = (c0.d) obj;
        float floatValue = ((Number) this.alpha.invoke()).floatValue() * 360.0f;
        int i4 = this.purple;
        float f5 = this.red;
        if (i4 != 0 && Z.e.bravo(dVar.bravo()) <= Z.e.delta(dVar.bravo())) {
            f5 += this.silver;
        }
        float gold = (f5 / ((float) (dVar.gold(Z.e.delta(dVar.bravo())) * 3.141592653589793d))) * 360.0f;
        float min = Math.min(floatValue, gold) + 270.0f + floatValue;
        float min2 = (360.0f - floatValue) - (Math.min(floatValue, gold) * 2);
        long j5 = this.teal;
        c0.h hVar = this.white;
        G1.charlie(dVar, min, min2, j5, hVar);
        G1.charlie(dVar, 270.0f, floatValue, this.yellow, hVar);
        return Unit.INSTANCE;
    }
}
