package bx;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import q0.AbstractC2366B;
import q0.AbstractC2367C;

/* loaded from: classes3.dex */
public final class I extends Lambda implements Function1 {
    public final /* synthetic */ J alpha;
    public final /* synthetic */ long purple;
    public final /* synthetic */ int red;
    public final /* synthetic */ int silver;
    public final /* synthetic */ q0.ar teal;
    public final /* synthetic */ AbstractC2367C white;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I(J j5, long j6, int i4, int i5, q0.ar arVar, AbstractC2367C abstractC2367C) {
        super(1);
        this.alpha = j5;
        this.purple = j6;
        this.red = i4;
        this.silver = i5;
        this.teal = arVar;
        this.white = abstractC2367C;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        float f5;
        AbstractC2366B abstractC2366B = (AbstractC2366B) obj;
        this.alpha.getClass();
        long j5 = (this.red << 32) | (this.silver & 4294967295L);
        Q0.n layoutDirection = this.teal.getLayoutDirection();
        long j6 = this.purple;
        float f10 = (((int) (j5 >> 32)) - ((int) (j6 >> 32))) / 2.0f;
        float f11 = (((int) (j5 & 4294967295L)) - ((int) (j6 & 4294967295L))) / 2.0f;
        if (layoutDirection == Q0.n.alpha) {
            f5 = -1.0f;
        } else {
            f5 = (-1) * (-1.0f);
        }
        float f12 = 1;
        float f13 = (f5 + f12) * f10;
        float f14 = (f12 - 1.0f) * f11;
        AbstractC2366B.india(abstractC2366B, this.white, (Math.round(f14) & 4294967295L) | (Math.round(f13) << 32));
        return Unit.INSTANCE;
    }
}
