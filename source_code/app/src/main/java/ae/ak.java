package ae;

import android.content.res.Resources;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class ak extends Lambda implements Function1 {
    public static final ak alpha = new Lambda(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean z2;
        Resources resources = (Resources) obj;
        Intrinsics.echo(resources, "resources");
        if ((resources.getConfiguration().uiMode & 48) == 32) {
            z2 = true;
        } else {
            z2 = false;
        }
        return Boolean.valueOf(z2);
    }
}
