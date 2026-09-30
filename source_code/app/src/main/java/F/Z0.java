package F;

import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class Z0 extends Lambda implements Function1 {
    public final /* synthetic */ float alpha;
    public final /* synthetic */ long purple;
    public final /* synthetic */ C0103e2 red;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Z0(float f5, long j5, C0103e2 c0103e2) {
        super(1);
        this.alpha = f5;
        this.purple = j5;
        this.red = c0103e2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        androidx.compose.material3.internal.v vVar = (androidx.compose.material3.internal.v) obj;
        EnumC0107f2 enumC0107f2 = EnumC0107f2.alpha;
        float f5 = this.alpha;
        vVar.alpha.put(enumC0107f2, Float.valueOf(f5));
        int i4 = (int) (this.purple & 4294967295L);
        float f10 = i4;
        float f11 = f5 / 2;
        LinkedHashMap linkedHashMap = vVar.alpha;
        if (f10 > f11 && !this.red.alpha) {
            linkedHashMap.put(EnumC0107f2.red, Float.valueOf(f5 / 2.0f));
        }
        if (i4 != 0) {
            linkedHashMap.put(EnumC0107f2.purple, Float.valueOf(Math.max(0.0f, f5 - f10)));
        }
        return Unit.INSTANCE;
    }
}
