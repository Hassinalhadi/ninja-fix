package G;

import a0.C0354h;
import androidx.compose.runtime.D0;
import ao.ad;
import av.ah;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import s6.J4;
import t6.M2;

/* loaded from: classes3.dex */
public final class e extends Lambda implements Function1 {
    public final /* synthetic */ Function0 alpha;
    public final /* synthetic */ D0 purple;
    public final /* synthetic */ long red;
    public final /* synthetic */ C0354h silver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Function0 function0, D0 d02, long j5, C0354h c0354h) {
        super(1);
        this.alpha = function0;
        this.purple = d02;
        this.red = j5;
        this.silver = c0354h;
    }

    /* JADX WARN: Type inference failed for: r14v0, types: [java.lang.Object, G.a] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        long j5;
        c0.d dVar = (c0.d) obj;
        float floatValue = ((Number) this.alpha.invoke()).floatValue();
        float max = (Math.max(Math.min(1.0f, floatValue) - 0.4f, 0.0f) * 5) / 3;
        float charlie = J4.charlie(Math.abs(floatValue) - 1.0f, 0.0f, 2.0f);
        float pow = (((0.4f * max) - 0.25f) + (charlie - (((float) Math.pow(charlie, 2)) / 4))) * 0.5f;
        float f5 = 360;
        float f10 = pow * f5;
        float f11 = ((0.8f * max) + pow) * f5;
        float min = Math.min(1.0f, max);
        ?? obj2 = new Object();
        obj2.alpha = f11;
        obj2.bravo = min;
        float floatValue2 = ((Number) this.purple.getValue()).floatValue();
        long j6 = this.red;
        C0354h c0354h = this.silver;
        long orange = dVar.orange();
        J2.t lime = dVar.lime();
        long oscar = lime.oscar();
        lime.mike().golf();
        try {
            ((ah) lime.alpha).ochre(pow, orange);
            float lavender = dVar.lavender(l.bravo);
            float f12 = l.alpha;
            float lavender2 = (dVar.lavender(f12) / 2.0f) + lavender;
            long charlie2 = M2.charlie(dVar.bravo());
            int i4 = (int) (charlie2 >> 32);
            int i5 = (int) (charlie2 & 4294967295L);
            Z.c cVar = new Z.c(Float.intBitsToFloat(i4) - lavender2, Float.intBitsToFloat(i5) - lavender2, Float.intBitsToFloat(i4) + lavender2, Float.intBitsToFloat(i5) + lavender2);
            try {
                ad.foxtrot(dVar, j6, f10, f11 - f10, cVar.charlie(), cVar.bravo(), floatValue2, new c0.h(dVar.lavender(f12), 0.0f, 0, 0, null, 26), 768);
                l.charlie(dVar, c0354h, cVar, j6, floatValue2, obj2);
                ad.coral(lime, oscar);
                return Unit.INSTANCE;
            } catch (Throwable th) {
                th = th;
                j5 = oscar;
                ad.coral(lime, j5);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            j5 = oscar;
        }
    }
}
