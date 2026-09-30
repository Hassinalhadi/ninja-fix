package com.google.android.play.core.integrity;

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
        return (((int) 244414812765L) ^ 1000003) * 1000003;
    }

    public final String toString() {
        return "PrepareIntegrityTokenRequest{cloudProjectNumber=244414812773, webViewRequestMode=0}";
    }
}
