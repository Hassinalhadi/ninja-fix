package ye;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class q {
    public static final q alpha = new Object();

    public static final aj alpha(String internalName, String str, String str2, String str3) {
        ArrayList arrayList = am.alpha;
        Ne.f echo = Ne.f.echo(str);
        String jvmDescriptor = str + '(' + str2 + ')' + str3;
        Intrinsics.echo(internalName, "internalName");
        Intrinsics.echo(jvmDescriptor, "jvmDescriptor");
        return new aj(echo, internalName + '.' + jvmDescriptor);
    }
}
