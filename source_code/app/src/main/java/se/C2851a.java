package se;

import Lb.W;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.types.az;

/* renamed from: se.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2851a implements Function0 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ AbstractC2852b purple;

    public /* synthetic */ C2851a(AbstractC2852b abstractC2852b, int i4) {
        this.alpha = i4;
        this.purple = abstractC2852b;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        AbstractC2852b abstractC2852b = this.purple;
        switch (this.alpha) {
            case 0:
                Xe.n x4 = abstractC2852b.x();
                W w4 = new W(8, this);
                hf.f fVar = az.alpha;
                if (hf.i.foxtrot(abstractC2852b)) {
                    return hf.i.charlie(hf.h.f12725d, abstractC2852b.toString());
                }
                kotlin.reflect.jvm.internal.impl.types.ap tango = abstractC2852b.tango();
                if (tango != null) {
                    if (x4 != null) {
                        List echo = az.echo(tango.getParameters());
                        kotlin.reflect.jvm.internal.impl.types.al.purple.getClass();
                        return kotlin.reflect.jvm.internal.impl.types.ab.echo(kotlin.reflect.jvm.internal.impl.types.al.red, tango, echo, false, x4, w4);
                    }
                    az.alpha(13);
                    throw null;
                }
                az.alpha(12);
                throw null;
            case 1:
                return new Xe.i(abstractC2852b.x());
            default:
                return new C2871u(abstractC2852b);
        }
    }
}
