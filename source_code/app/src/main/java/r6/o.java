package r6;

/* loaded from: classes2.dex */
public final class o {
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof o) {
            ((o) obj).getClass();
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return -228219804;
    }

    public final String toString() {
        return "MLKitLoggingOptions{libraryName=common, enableFirelog=true, firelogEventType=1}";
    }
}
