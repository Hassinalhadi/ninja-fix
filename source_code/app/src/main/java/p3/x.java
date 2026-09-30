package p3;

import android.content.Context;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l3.AbstractC2056a;

/* loaded from: classes3.dex */
public final /* synthetic */ class x extends kotlin.jvm.internal.i implements Function1 {
    public static final /* synthetic */ int alpha = 0;

    static {
        new kotlin.jvm.internal.i(1, AbstractC2056a.class, "isLocationAccuracyModeHigh", "isLocationAccuracyModeHigh(Landroid/content/Context;)Z", 1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Context p02 = (Context) obj;
        Intrinsics.echo(p02, "p0");
        return Boolean.valueOf(AbstractC2056a.charlie(p02));
    }
}
