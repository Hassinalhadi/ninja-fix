package p1;

import android.util.Base64;
import com.google.android.material.datepicker.j;
import java.util.List;

/* loaded from: classes3.dex */
public final class d {
    public final String alpha;
    public final String bravo;
    public final String charlie;
    public final List delta;
    public final String echo;
    public final String foxtrot;
    public final String golf;

    public d(String str, String str2, String str3, List list, String str4, String str5) {
        str.getClass();
        this.alpha = str;
        str2.getClass();
        this.bravo = str2;
        this.charlie = str3;
        list.getClass();
        this.delta = list;
        this.echo = str4;
        this.foxtrot = str5;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append("-");
        sb2.append(str2);
        sb2.append("-");
        sb2.append(str3);
        this.golf = j.lima(sb2, "-", str4, "-", str5);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("FontRequest {mProviderAuthority: " + this.alpha + ", mProviderPackage: " + this.bravo + ", mQuery: " + this.charlie + ", mSystemFont: " + this.echo + ", mVariationSettings: " + this.foxtrot + ", mCertificates:");
        int i4 = 0;
        while (true) {
            List list = this.delta;
            if (i4 < list.size()) {
                sb2.append(" [");
                List list2 = (List) list.get(i4);
                for (int i5 = 0; i5 < list2.size(); i5++) {
                    sb2.append(" \"");
                    sb2.append(Base64.encodeToString((byte[]) list2.get(i5), 0));
                    sb2.append("\"");
                }
                sb2.append(" ]");
                i4++;
            } else {
                sb2.append("}mCertificatesArray: 0");
                return sb2.toString();
            }
        }
    }
}
