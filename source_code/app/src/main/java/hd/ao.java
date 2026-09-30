package hd;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes2.dex */
public final class ao {
    public Long alpha;
    public Long bravo;
    public Long charlie;

    static {
        kotlin.jvm.internal.u.alpha.bravo(ao.class);
        try {
            kotlin.jvm.internal.u.alpha(ao.class);
        } catch (Throwable unused) {
        }
        if (!StringsKt.gray("TimeoutConfiguration")) {
        } else {
            throw new IllegalArgumentException("Name can't be blank");
        }
    }

    public ao() {
        this.alpha = 0L;
        this.bravo = 0L;
        this.charlie = 0L;
        this.alpha = null;
        this.bravo = null;
        this.charlie = null;
    }

    public static void alpha(Long l10) {
        if (l10 != null && l10.longValue() <= 0) {
            throw new IllegalArgumentException("Only positive timeout values are allowed, for infinite timeout use HttpTimeoutConfig.INFINITE_TIMEOUT_MS");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ao.class != obj.getClass()) {
            return false;
        }
        ao aoVar = (ao) obj;
        if (Intrinsics.areEqual(this.alpha, aoVar.alpha) && Intrinsics.areEqual(this.bravo, aoVar.bravo) && Intrinsics.areEqual(this.charlie, aoVar.charlie)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i4;
        int i5;
        Long l10 = this.alpha;
        int i10 = 0;
        if (l10 != null) {
            i4 = l10.hashCode();
        } else {
            i4 = 0;
        }
        int i11 = i4 * 31;
        Long l11 = this.bravo;
        if (l11 != null) {
            i5 = l11.hashCode();
        } else {
            i5 = 0;
        }
        int i12 = (i11 + i5) * 31;
        Long l12 = this.charlie;
        if (l12 != null) {
            i10 = l12.hashCode();
        }
        return i12 + i10;
    }
}
