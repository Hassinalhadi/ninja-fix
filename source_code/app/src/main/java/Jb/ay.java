package Jb;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final /* synthetic */ class ay implements kotlin.jvm.internal.f {
    public final /* synthetic */ Function0 alpha;

    public ay(Function0 function0) {
        this.alpha = function0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ay) || ((ay) obj) == null) {
            return false;
        }
        return Intrinsics.areEqual(this.alpha, ((kotlin.jvm.internal.f) obj).getFunctionDelegate());
    }

    @Override // kotlin.jvm.internal.f
    public final kotlin.e getFunctionDelegate() {
        return this.alpha;
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
