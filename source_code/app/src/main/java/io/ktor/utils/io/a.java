package io.ktor.utils.io;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class a implements g {
    public final Throwable bravo;

    public a(Throwable th) {
        this.bravo = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && Intrinsics.areEqual(this.bravo, ((a) obj).bravo);
    }

    public final int hashCode() {
        Throwable th = this.bravo;
        if (th == null) {
            return 0;
        }
        return th.hashCode();
    }

    public final String toString() {
        return "Closed(cause=" + this.bravo + ')';
    }
}
