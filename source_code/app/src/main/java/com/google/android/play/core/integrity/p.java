package com.google.android.play.core.integrity;

/* loaded from: classes2.dex */
public final class p {
    public final String alpha;
    public final p7.j bravo;

    public p(String str, p7.j jVar) {
        this.alpha = str;
        this.bravo = jVar;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof p) {
                p pVar = (p) obj;
                String str = this.alpha;
                if (str == null) {
                    if (pVar.alpha != null) {
                        return false;
                    }
                } else if (!str.equals(pVar.alpha)) {
                    return false;
                }
                if (this.bravo.equals(pVar.bravo)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        String str = this.alpha;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i4 = (hashCode ^ 1000003) * 1000003;
        this.bravo.getClass();
        return i4;
    }

    public final String toString() {
        return com.google.android.material.datepicker.j.lima(new StringBuilder("StandardIntegrityTokenRequest{requestHash="), this.alpha, ", verdictOptOut=", this.bravo.toString(), "}");
    }
}
