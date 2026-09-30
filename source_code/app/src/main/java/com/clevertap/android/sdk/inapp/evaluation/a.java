package com.clevertap.android.sdk.inapp.evaluation;

import A0.ad;
import A0.k;
import X.c;
import a0.C0360n;
import a0.C0366t;
import c0.d;
import c0.h;
import d.P0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import n.al;
import t6.AbstractC3032n3;
import y.ag;
import y.ah;
import y.ai;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements Function1 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ long purple;

    public /* synthetic */ a(long j5, int i4) {
        this.alpha = i4;
        this.purple = j5;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean z2;
        boolean z10;
        switch (this.alpha) {
            case 0:
                return Boolean.valueOf(EvaluationManager.charlie(this.purple, ((Long) obj).longValue()));
            case 1:
                c cVar = (c) obj;
                float intBitsToFloat = Float.intBitsToFloat((int) (cVar.alpha.bravo() >> 32)) / 2.0f;
                return cVar.charlie(new P0(intBitsToFloat, AbstractC3032n3.delta(cVar, intBitsToFloat), new C0360n(this.purple, 5)));
            case 2:
                ((k) ((ad) obj)).hotel(ai.charlie, new ah(al.alpha, this.purple, ag.purple, true));
                return Unit.INSTANCE;
            case 3:
                p3.ag it = (p3.ag) obj;
                Intrinsics.echo(it, "it");
                if (this.purple - it.delta >= 60000) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                return Boolean.valueOf(z2);
            case 4:
                p3.ag it2 = (p3.ag) obj;
                Intrinsics.echo(it2, "it");
                if (it2.alpha.getTime() == this.purple) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                return Boolean.valueOf(z10);
            default:
                d Canvas = (d) obj;
                Intrinsics.echo(Canvas, "$this$Canvas");
                float intBitsToFloat2 = Float.intBitsToFloat((int) (Canvas.bravo() >> 32));
                float intBitsToFloat3 = Float.intBitsToFloat((int) (Canvas.bravo() & 4294967295L));
                float f5 = intBitsToFloat2 * 0.1f;
                float f10 = intBitsToFloat2 * 0.22f;
                float f11 = intBitsToFloat2 * 0.08f;
                long floatToRawIntBits = (Float.floatToRawIntBits(f11) & 4294967295L) | (Float.floatToRawIntBits(f11) << 32);
                long floatToRawIntBits2 = (Float.floatToRawIntBits(f11) & 4294967295L) | (Float.floatToRawIntBits(f11 + f10) << 32);
                long j5 = this.purple;
                ao.ad.juliet(Canvas, j5, floatToRawIntBits, floatToRawIntBits2, f5, 2, 480);
                ao.ad.juliet(Canvas, j5, (Float.floatToRawIntBits(f11) << 32) | (Float.floatToRawIntBits(f11) & 4294967295L), (Float.floatToRawIntBits(f11) << 32) | (Float.floatToRawIntBits(r18) & 4294967295L), f5, 2, 480);
                float f12 = (intBitsToFloat2 - f11) - f10;
                ao.ad.juliet(Canvas, j5, (Float.floatToRawIntBits(f12) << 32) | (Float.floatToRawIntBits(f11) & 4294967295L), (Float.floatToRawIntBits(r19) << 32) | (Float.floatToRawIntBits(f11) & 4294967295L), f5, 2, 480);
                ao.ad.juliet(Canvas, j5, (Float.floatToRawIntBits(r19) << 32) | (Float.floatToRawIntBits(f11) & 4294967295L), (Float.floatToRawIntBits(r19) << 32) | (Float.floatToRawIntBits(r18) & 4294967295L), f5, 2, 480);
                float f13 = (intBitsToFloat3 - f11) - f10;
                ao.ad.juliet(Canvas, j5, (Float.floatToRawIntBits(f11) << 32) | (Float.floatToRawIntBits(f13) & 4294967295L), (Float.floatToRawIntBits(f11) << 32) | (Float.floatToRawIntBits(r21) & 4294967295L), f5, 2, 480);
                ao.ad.juliet(Canvas, j5, (Float.floatToRawIntBits(f11) << 32) | (Float.floatToRawIntBits(r21) & 4294967295L), (Float.floatToRawIntBits(r18) << 32) | (Float.floatToRawIntBits(r21) & 4294967295L), f5, 2, 480);
                ao.ad.juliet(Canvas, j5, (Float.floatToRawIntBits(r19) << 32) | (Float.floatToRawIntBits(f13) & 4294967295L), (Float.floatToRawIntBits(r19) << 32) | (Float.floatToRawIntBits(r21) & 4294967295L), f5, 2, 480);
                ao.ad.juliet(Canvas, j5, (Float.floatToRawIntBits(f12) << 32) | (Float.floatToRawIntBits(r21) & 4294967295L), (Float.floatToRawIntBits(r19) << 32) | (Float.floatToRawIntBits(r21) & 4294967295L), f5, 2, 480);
                ao.ad.november(Canvas, j5, (Float.floatToRawIntBits((intBitsToFloat2 - r5) / 2.0f) << 32) | (Float.floatToRawIntBits((intBitsToFloat3 - f5) / 2.0f) & 4294967295L), (Float.floatToRawIntBits(f5) & 4294967295L) | (Float.floatToRawIntBits(0.62f * intBitsToFloat2) << 32), 0.0f, null, 120);
                ao.ad.november(Canvas, C0366t.juliet, (Float.floatToRawIntBits(intBitsToFloat2 * 0.3f) << 32) | (Float.floatToRawIntBits(0.3f * intBitsToFloat3) & 4294967295L), (Float.floatToRawIntBits(intBitsToFloat2 * 0.4f) << 32) | (Float.floatToRawIntBits(intBitsToFloat3 * 0.4f) & 4294967295L), 0.0f, new h(0.0f, 0.0f, 0, 0, null, 30), 104);
                return Unit.INSTANCE;
        }
    }
}
