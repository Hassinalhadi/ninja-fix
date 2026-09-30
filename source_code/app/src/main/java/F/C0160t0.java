package F;

import a0.InterfaceC0342ab;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* renamed from: F.t0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0160t0 extends Lambda implements Function1 {
    public final /* synthetic */ boolean alpha;
    public final /* synthetic */ bz.an purple;
    public final /* synthetic */ androidx.compose.runtime.ax red;
    public final /* synthetic */ bz.X silver;
    public final /* synthetic */ bz.X teal;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0160t0(boolean z2, bz.an anVar, androidx.compose.runtime.ax axVar, bz.X x4, bz.X x5) {
        super(1);
        this.alpha = z2;
        this.purple = anVar;
        this.red = axVar;
        this.silver = x4;
        this.teal = x5;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        float f5;
        InterfaceC0342ab interfaceC0342ab = (InterfaceC0342ab) obj;
        bz.an anVar = this.purple;
        float f10 = 0.8f;
        bz.X x4 = this.silver;
        float f11 = 1.0f;
        androidx.compose.runtime.ax axVar = anVar.red;
        boolean z2 = this.alpha;
        if (!z2) {
            f5 = ((Number) x4.getValue()).floatValue();
        } else if (((Boolean) ((androidx.compose.runtime.t0) axVar).getValue()).booleanValue()) {
            f5 = 1.0f;
        } else {
            f5 = 0.8f;
        }
        a0.ap apVar = (a0.ap) interfaceC0342ab;
        apVar.hotel(f5);
        if (!z2) {
            f10 = ((Number) x4.getValue()).floatValue();
        } else if (((Boolean) ((androidx.compose.runtime.t0) axVar).getValue()).booleanValue()) {
            f10 = 1.0f;
        }
        apVar.india(f10);
        if (!z2) {
            f11 = ((Number) this.teal.getValue()).floatValue();
        } else if (!((Boolean) ((androidx.compose.runtime.t0) axVar).getValue()).booleanValue()) {
            f11 = 0.0f;
        }
        apVar.charlie(f11);
        apVar.november(((a0.aw) this.red.getValue()).alpha);
        return Unit.INSTANCE;
    }
}
