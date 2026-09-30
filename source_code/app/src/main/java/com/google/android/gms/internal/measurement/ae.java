package com.google.android.gms.internal.measurement;

import com.google.maps.android.BuildConfig;

/* loaded from: classes2.dex */
public final class ae {
    public static final /* synthetic */ int bravo = 0;
    public final int alpha;

    public ae(int i4) {
        this.alpha = i4;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ae) {
            ae aeVar = (ae) obj;
            aeVar.getClass();
            int i4 = this.alpha;
            if (i4 != 0) {
                if (i4 == aeVar.alpha) {
                    return true;
                }
                return false;
            }
            throw null;
        }
        return false;
    }

    public final int hashCode() {
        int i4 = this.alpha;
        if (i4 != 0) {
            return ((i4 ^ (-485106924)) * 583896283) ^ 1;
        }
        throw null;
    }

    public final String toString() {
        String str;
        int i4 = this.alpha;
        if (i4 != 1) {
            if (i4 != 2) {
                if (i4 != 3) {
                    if (i4 != 4) {
                        str = BuildConfig.TRAVIS;
                    } else {
                        str = "NO_CHECKS";
                    }
                } else {
                    str = "SKIP_SECURITY_CHECK";
                }
            } else {
                str = "SKIP_COMPLIANCE_CHECK";
            }
        } else {
            str = "ALL_CHECKS";
        }
        return av.q.golf("FileComplianceOptions{fileOwner=, hasDifferentDmaOwner=false, fileChecks=", str, ", dataForwardingNotAllowedResolver=null, multipleProductIdGroupsResolver=null, filePurpose=", "READ_AND_WRITE", "}");
    }
}
