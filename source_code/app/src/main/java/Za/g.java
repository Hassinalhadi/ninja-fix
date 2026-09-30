package Za;

import a0.C0355i;
import android.graphics.DashPathEffect;
import ao.ad;
import kotlin.Unit;
import kotlin.collections.o;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ob.p;
import t0.C2915g0;

/* loaded from: classes2.dex */
public final /* synthetic */ class g implements Function1 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ float purple;
    public final /* synthetic */ float red;
    public final /* synthetic */ float silver;
    public final /* synthetic */ float teal;

    public /* synthetic */ g(float f5, float f10, float f11, float f12, int i4) {
        this.alpha = i4;
        this.purple = f5;
        this.red = f10;
        this.silver = f11;
        this.teal = f12;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        float f5 = this.teal;
        float f10 = this.silver;
        float f11 = this.red;
        switch (this.alpha) {
            case 0:
                c0.d drawBehind = (c0.d) obj;
                Intrinsics.echo(drawBehind, "$this$drawBehind");
                float f12 = this.purple;
                float f13 = f12 / 2.0f;
                float intBitsToFloat = Float.intBitsToFloat((int) (drawBehind.bravo() >> 32)) - f12;
                long floatToRawIntBits = (Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawBehind.bravo() & 4294967295L)) - f12) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
                float charlie = Z.e.charlie(floatToRawIntBits) / 4;
                if (f11 <= charlie) {
                    charlie = f11;
                }
                ad.papa(drawBehind, p.echo, 0L, drawBehind.bravo(), (Float.floatToRawIntBits(f11) << 32) | (Float.floatToRawIntBits(f11) & 4294967295L), null, 240);
                ad.papa(drawBehind, Db.c.azure, (Float.floatToRawIntBits(f13) & 4294967295L) | (Float.floatToRawIntBits(f13) << 32), floatToRawIntBits, (Float.floatToRawIntBits(charlie) & 4294967295L) | (Float.floatToRawIntBits(charlie) << 32), new c0.h(f12, 0.0f, 0, 0, new C0355i(new DashPathEffect(new float[]{f10, f5}, 0.0f)), 14), 224);
                return Unit.INSTANCE;
            case 1:
                C2915g0 c2915g0 = (C2915g0) obj;
                c2915g0.alpha = "padding";
                Q0.g gVar = new Q0.g(this.purple);
                o oVar = c2915g0.charlie;
                oVar.bravo(gVar, "start");
                oVar.bravo(new Q0.g(f11), "top");
                oVar.bravo(new Q0.g(f10), "end");
                oVar.bravo(new Q0.g(f5), "bottom");
                return Unit.INSTANCE;
            default:
                c0.d drawBehind2 = (c0.d) obj;
                Intrinsics.echo(drawBehind2, "$this$drawBehind");
                float f14 = this.purple;
                float f15 = f14 / 2.0f;
                float intBitsToFloat2 = Float.intBitsToFloat((int) (drawBehind2.bravo() >> 32)) - f14;
                long floatToRawIntBits2 = (Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawBehind2.bravo() & 4294967295L)) - f14) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat2) << 32);
                float charlie2 = Z.e.charlie(floatToRawIntBits2) / 4;
                if (f11 <= charlie2) {
                    charlie2 = f11;
                }
                ad.papa(drawBehind2, p.echo, 0L, drawBehind2.bravo(), (Float.floatToRawIntBits(f11) << 32) | (Float.floatToRawIntBits(f11) & 4294967295L), null, 240);
                ad.papa(drawBehind2, Db.c.azure, (Float.floatToRawIntBits(f15) & 4294967295L) | (Float.floatToRawIntBits(f15) << 32), floatToRawIntBits2, (Float.floatToRawIntBits(charlie2) & 4294967295L) | (Float.floatToRawIntBits(charlie2) << 32), new c0.h(f14, 0.0f, 0, 0, new C0355i(new DashPathEffect(new float[]{f10, f5}, 0.0f)), 14), 224);
                return Unit.INSTANCE;
        }
    }
}
