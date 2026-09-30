package G;

import a0.InterfaceC0342ab;
import a0.ap;
import a0.as;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class j extends Lambda implements Function1 {
    public final /* synthetic */ v alpha;
    public final /* synthetic */ boolean purple;
    public final /* synthetic */ float red;
    public final /* synthetic */ float silver;
    public final /* synthetic */ as teal;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(v vVar, boolean z2, float f5, float f10, as asVar) {
        super(1);
        this.alpha = vVar;
        this.purple = z2;
        this.red = f5;
        this.silver = f10;
        this.teal = asVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean z2;
        InterfaceC0342ab interfaceC0342ab = (InterfaceC0342ab) obj;
        v vVar = this.alpha;
        float f5 = 0.0f;
        if (((Number) vVar.alpha.delta()).floatValue() <= 0.0f && !this.purple) {
            z2 = false;
        } else {
            z2 = true;
        }
        float floatValue = ((Number) vVar.alpha.delta()).floatValue();
        ap apVar = (ap) interfaceC0342ab;
        apVar.getClass();
        apVar.oscar((floatValue * Q0.c.bravo(apVar, this.red)) - Z.e.bravo(apVar.f2581h));
        if (z2) {
            f5 = apVar.f2582i.alpha() * this.silver;
        }
        apVar.juliet(f5);
        apVar.kilo(this.teal);
        apVar.foxtrot(true);
        return Unit.INSTANCE;
    }
}
