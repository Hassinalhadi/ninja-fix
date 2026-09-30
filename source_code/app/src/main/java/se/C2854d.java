package se;

import gf.C1791f;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.types.B;
import pe.InterfaceC2332h;

/* renamed from: se.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2854d extends Lambda implements Function1 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ ef.s purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2854d(ef.s sVar, int i4) {
        super(1);
        this.alpha = i4;
        this.purple = sVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean z2;
        switch (this.alpha) {
            case 0:
                ((C1791f) obj).getClass();
                ef.s descriptor = this.purple;
                Intrinsics.echo(descriptor, "descriptor");
                return null;
            default:
                B type = (B) obj;
                Intrinsics.delta(type, "type");
                if (!kotlin.reflect.jvm.internal.impl.types.c.india(type)) {
                    InterfaceC2332h kilo = type.green().kilo();
                    if ((kilo instanceof pe.aq) && !Intrinsics.areEqual(((pe.aq) kilo).lima(), this.purple)) {
                        z2 = true;
                        return Boolean.valueOf(z2);
                    }
                }
                z2 = false;
                return Boolean.valueOf(z2);
        }
    }
}
