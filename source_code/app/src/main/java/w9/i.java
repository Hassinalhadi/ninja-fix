package w9;

import com.clevertap.android.sdk.Constants;
import kotlin.jvm.internal.Intrinsics;
import z3.InterfaceC3463b;

/* loaded from: classes2.dex */
public final class i implements InterfaceC3463b {
    public final void alpha(String tag, String str, Throwable th) {
        Intrinsics.echo(tag, "tag");
        K7.b.alpha().bravo("TAG -> " + tag + Constants.SEPARATOR_COMMA + str);
        if (th != null) {
            K7.b.alpha().charlie(th);
        }
    }
}
