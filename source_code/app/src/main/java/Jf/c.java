package Jf;

import Lf.j;
import Nf.P;
import com.clevertap.android.sdk.Constants;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import s6.AbstractC2707l6;

/* loaded from: classes2.dex */
public final /* synthetic */ class c implements Function1 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ d purple;

    public /* synthetic */ c(d dVar, int i4) {
        this.alpha = i4;
        this.purple = dVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Lf.a buildSerialDescriptor = (Lf.a) obj;
        switch (this.alpha) {
            case 0:
                Intrinsics.echo(buildSerialDescriptor, "$this$buildSerialDescriptor");
                Lf.a.alpha(buildSerialDescriptor, Constants.KEY_TYPE, P.bravo);
                StringBuilder sb2 = new StringBuilder("kotlinx.serialization.Sealed<");
                d dVar = this.purple;
                sb2.append(dVar.alpha.kilo());
                sb2.append('>');
                Lf.a.alpha(buildSerialDescriptor, "value", AbstractC2707l6.charlie(sb2.toString(), j.bravo, new SerialDescriptor[0], new c(dVar, 1)));
                List list = dVar.bravo;
                Intrinsics.echo(list, "<set-?>");
                buildSerialDescriptor.bravo = list;
                return Unit.INSTANCE;
            default:
                Intrinsics.echo(buildSerialDescriptor, "$this$buildSerialDescriptor");
                for (Map.Entry entry : this.purple.echo.entrySet()) {
                    Lf.a.alpha(buildSerialDescriptor, (String) entry.getKey(), ((KSerializer) entry.getValue()).getDescriptor());
                }
                return Unit.INSTANCE;
        }
    }
}
