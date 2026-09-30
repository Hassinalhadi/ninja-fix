package Y1;

import android.os.Bundle;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class u implements Function1 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Bundle purple;

    public /* synthetic */ u(int i4, Bundle bundle) {
        this.alpha = i4;
        this.purple = bundle;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String argName = (String) obj;
        switch (this.alpha) {
            case 0:
                Intrinsics.echo(argName, "argName");
                Bundle source = this.purple;
                Intrinsics.echo(source, "source");
                return Boolean.valueOf(!source.containsKey(argName));
            default:
                Intrinsics.echo(argName, "key");
                Bundle source2 = this.purple;
                Intrinsics.echo(source2, "source");
                return Boolean.valueOf(!source2.containsKey(argName));
        }
    }
}
