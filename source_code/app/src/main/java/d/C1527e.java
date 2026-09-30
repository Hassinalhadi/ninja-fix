package d;

import com.clevertap.android.sdk.Constants;
import k.C1992d;
import kotlin.jvm.internal.Intrinsics;
import s6.AbstractC2743p6;
import vf.C3207k;

/* renamed from: d.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1527e {
    public final C1992d alpha;
    public final C3207k bravo;

    public C1527e(C1992d c1992d, C3207k c3207k) {
        this.alpha = c1992d;
        this.bravo = c3207k;
    }

    public final String toString() {
        String str;
        String str2;
        C3207k c3207k = this.bravo;
        vf.aa aaVar = (vf.aa) c3207k.teal.get(vf.aa.purple);
        if (aaVar != null) {
            str = aaVar.alpha;
        } else {
            str = null;
        }
        StringBuilder sb2 = new StringBuilder("Request@");
        int hashCode = hashCode();
        AbstractC2743p6.alpha(16);
        String num = Integer.toString(hashCode, 16);
        Intrinsics.delta(num, "toString(...)");
        sb2.append(num);
        if (str == null || (str2 = ao.ad.gray(Constants.AES_PREFIX, str, "](")) == null) {
            str2 = "(";
        }
        sb2.append(str2);
        sb2.append("currentBounds()=");
        sb2.append(this.alpha.invoke());
        sb2.append(", continuation=");
        sb2.append(c3207k);
        sb2.append(')');
        return sb2.toString();
    }
}
