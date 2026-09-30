package bo;

import android.adservices.measurement.MeasurementManager;
import android.content.Context;
import androidx.camera.core.q;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import t6.a4;

/* loaded from: classes3.dex */
public final class d extends Lambda implements Function1 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Context purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(Context context, int i4) {
        super(1);
        this.alpha = i4;
        this.purple = context;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        MeasurementManager measurementManager;
        switch (this.alpha) {
            case 0:
                q cameraX = (q) obj;
                e eVar = e.golf;
                Intrinsics.delta(cameraX, "cameraX");
                eVar.delta = cameraX;
                Context bravo = a4.bravo(this.purple);
                Intrinsics.delta(bravo, "getApplicationContext(context)");
                eVar.echo = bravo;
                return eVar;
            default:
                Context it = (Context) obj;
                Intrinsics.echo(it, "it");
                Context context = this.purple;
                Intrinsics.echo(context, "context");
                measurementManager = MeasurementManager.get(context);
                Intrinsics.delta(measurementManager, "get(context)");
                return new i2.e(measurementManager);
        }
    }
}
