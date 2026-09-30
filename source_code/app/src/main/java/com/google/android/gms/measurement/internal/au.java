package com.google.android.gms.measurement.internal;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.checkout.components.card.utils.constants.ExpiryDateConstantsKt;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.db.Column;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader$ParseException;
import com.google.android.gms.internal.measurement.AbstractC1380u1;
import com.google.android.gms.internal.measurement.AbstractC1388w1;
import com.google.android.gms.internal.measurement.C1;
import com.google.android.gms.internal.measurement.C1293b;
import com.google.android.gms.internal.measurement.C1317f3;
import com.google.android.gms.internal.measurement.C1348m0;
import com.google.android.gms.internal.measurement.C1360p0;
import com.google.android.gms.internal.measurement.C1367r0;
import com.google.android.gms.internal.measurement.C1368r1;
import com.google.android.gms.internal.measurement.C1375t0;
import com.google.android.gms.internal.measurement.C1379u0;
import com.google.android.gms.internal.measurement.C1383v0;
import com.google.android.gms.internal.measurement.C1391x0;
import com.google.android.gms.internal.measurement.C1395y0;
import com.google.android.gms.internal.measurement.D1;
import com.google.android.gms.internal.measurement.I1;
import com.google.android.gms.internal.measurement.U1;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.zip.GZIPOutputStream;

/* loaded from: classes2.dex */
public final class au extends U0 {
    public final /* synthetic */ int silver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ au(Z0 z02, int i4) {
        super(z02);
        this.silver = i4;
    }

    public static AbstractC1388w1 C0(AbstractC1388w1 abstractC1388w1, byte[] bArr) {
        C1368r1 c1368r1;
        C1368r1 c1368r12 = C1368r1.alpha;
        if (c1368r12 == null) {
            synchronized (C1368r1.class) {
                try {
                    c1368r1 = C1368r1.alpha;
                    if (c1368r1 == null) {
                        U1 u12 = U1.charlie;
                        c1368r1 = AbstractC1380u1.echo();
                        C1368r1.alpha = c1368r1;
                    }
                } finally {
                }
            }
            c1368r12 = c1368r1;
        }
        if (c1368r12 != null) {
            abstractC1388w1.getClass();
            abstractC1388w1.delta(bArr, bArr.length, c1368r12);
            return abstractC1388w1;
        }
        abstractC1388w1.getClass();
        int length = bArr.length;
        C1368r1 c1368r13 = C1368r1.alpha;
        U1 u13 = U1.charlie;
        abstractC1388w1.delta(bArr, length, C1368r1.bravo);
        return abstractC1388w1;
    }

    public static ArrayList G0(BitSet bitSet) {
        int length = (bitSet.length() + 63) / 64;
        ArrayList arrayList = new ArrayList(length);
        for (int i4 = 0; i4 < length; i4++) {
            long j5 = 0;
            for (int i5 = 0; i5 < 64; i5++) {
                int i10 = (i4 * 64) + i5;
                if (i10 >= bitSet.length()) {
                    break;
                }
                if (bitSet.get(i10)) {
                    j5 |= 1 << i5;
                }
            }
            arrayList.add(Long.valueOf(j5));
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0032, code lost:
    
        r5 = new java.util.ArrayList();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0038, code lost:
    
        if (r4 == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003a, code lost:
    
        r3 = (android.os.Parcelable[]) r3;
        r4 = r3.length;
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003e, code lost:
    
        if (r7 >= r4) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0040, code lost:
    
        r8 = r3[r7];
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0044, code lost:
    
        if ((r8 instanceof android.os.Bundle) == false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0046, code lost:
    
        r5.add(H0((android.os.Bundle) r8, false));
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004f, code lost:
    
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0080, code lost:
    
        r0.put(r2, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0054, code lost:
    
        if ((r3 instanceof java.util.ArrayList) == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0056, code lost:
    
        r3 = (java.util.ArrayList) r3;
        r4 = r3.size();
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x005d, code lost:
    
        if (r7 >= r4) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x005f, code lost:
    
        r8 = r3.get(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0065, code lost:
    
        if ((r8 instanceof android.os.Bundle) == false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0067, code lost:
    
        r5.add(H0((android.os.Bundle) r8, false));
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0070, code lost:
    
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0075, code lost:
    
        if ((r3 instanceof android.os.Bundle) == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0077, code lost:
    
        r5.add(H0((android.os.Bundle) r3, false));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static HashMap H0(Bundle bundle, boolean z2) {
        HashMap hashMap = new HashMap();
        Iterator<String> it = bundle.keySet().iterator();
        while (it.hasNext()) {
            String next = it.next();
            Object obj = bundle.get(next);
            boolean z10 = obj instanceof Parcelable[];
            if (!z10 && !(obj instanceof ArrayList) && !(obj instanceof Bundle)) {
                if (obj != null) {
                    hashMap.put(next, obj);
                }
            }
        }
        return hashMap;
    }

    public static boolean K0(C1 c12, int i4) {
        if (i4 < ((I1) c12).red * 64) {
            if (((1 << (i4 % 64)) & ((Long) ((I1) c12).get(i4 / 64)).longValue()) != 0) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static boolean a0(String str) {
        if (str != null && str.matches("([+-])?([0-9]+\\.?[0-9]*|[0-9]*\\.?[0-9]+)") && str.length() <= 310) {
            return true;
        }
        return false;
    }

    public static Bundle[] c0(D1 d12) {
        ArrayList arrayList = new ArrayList();
        Iterator it = d12.iterator();
        while (it.hasNext()) {
            C1395y0 c1395y0 = (C1395y0) it.next();
            if (c1395y0 != null) {
                Bundle bundle = new Bundle();
                for (C1395y0 c1395y02 : c1395y0.uniform()) {
                    if (c1395y02.emerald()) {
                        bundle.putString(c1395y02.sierra(), c1395y02.tango());
                    } else if (c1395y02.crimson()) {
                        bundle.putLong(c1395y02.sierra(), c1395y02.quebec());
                    } else if (c1395y02.bronze()) {
                        bundle.putDouble(c1395y02.sierra(), c1395y02.november());
                    }
                }
                if (!bundle.isEmpty()) {
                    arrayList.add(bundle);
                }
            }
        }
        return (Bundle[]) arrayList.toArray(new Bundle[arrayList.size()]);
    }

    public static final void d0(C1379u0 c1379u0, String str, Long l10) {
        List november = c1379u0.november();
        int i4 = 0;
        while (true) {
            if (i4 < november.size()) {
                if (str.equals(((C1395y0) november.get(i4)).sierra())) {
                    break;
                } else {
                    i4++;
                }
            } else {
                i4 = -1;
                break;
            }
        }
        C1391x0 romeo = C1395y0.romeo();
        romeo.india(str);
        romeo.hotel(l10.longValue());
        if (i4 >= 0) {
            c1379u0.golf();
            C1383v0.amber((C1383v0) c1379u0.purple, i4, (C1395y0) romeo.echo());
        } else {
            c1379u0.juliet(romeo);
        }
    }

    public static final Bundle e0(List list) {
        Bundle bundle = new Bundle();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C1395y0 c1395y0 = (C1395y0) it.next();
            String sierra = c1395y0.sierra();
            if (c1395y0.bronze()) {
                bundle.putDouble(sierra, c1395y0.november());
            } else if (c1395y0.coral()) {
                bundle.putFloat(sierra, c1395y0.oscar());
            } else if (c1395y0.emerald()) {
                bundle.putString(sierra, c1395y0.tango());
            } else if (c1395y0.crimson()) {
                bundle.putLong(sierra, c1395y0.quebec());
            }
        }
        return bundle;
    }

    public static final C1395y0 f0(C1383v0 c1383v0, String str) {
        for (C1395y0 c1395y0 : c1383v0.uniform()) {
            if (c1395y0.sierra().equals(str)) {
                return c1395y0;
            }
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [android.os.Bundle[], java.io.Serializable] */
    public static final Serializable g0(C1383v0 c1383v0, String str) {
        C1395y0 f02 = f0(c1383v0, str);
        if (f02 != null) {
            if (f02.emerald()) {
                return f02.tango();
            }
            if (f02.crimson()) {
                return Long.valueOf(f02.quebec());
            }
            if (f02.bronze()) {
                return Double.valueOf(f02.november());
            }
            if (f02.papa() > 0) {
                return c0((D1) f02.uniform());
            }
            return null;
        }
        return null;
    }

    public static final void j0(int i4, StringBuilder sb2) {
        for (int i5 = 0; i5 < i4; i5++) {
            sb2.append("  ");
        }
    }

    public static final void k0(Uri.Builder builder, String str, String str2, Set set) {
        if (!set.contains(str) && !TextUtils.isEmpty(str2)) {
            builder.appendQueryParameter(str, str2);
        }
    }

    public static final String l0(boolean z2, boolean z10, boolean z11) {
        StringBuilder sb2 = new StringBuilder();
        if (z2) {
            sb2.append("Dynamic ");
        }
        if (z10) {
            sb2.append("Sequence ");
        }
        if (z11) {
            sb2.append("Session-Scoped ");
        }
        return sb2.toString();
    }

    public static final void m0(Uri.Builder builder, String[] strArr, Bundle bundle, Set set) {
        for (String str : strArr) {
            String[] split = str.split(Constants.SEPARATOR_COMMA);
            String str2 = split[0];
            String str3 = split[split.length - 1];
            String string = bundle.getString(str2);
            if (string != null) {
                k0(builder, str3, string, set);
            }
        }
    }

    public static final void n0(StringBuilder sb2, String str, com.google.android.gms.internal.measurement.G0 g02) {
        Integer num;
        Integer num2;
        Long l10;
        if (g02 == null) {
            return;
        }
        j0(3, sb2);
        sb2.append(str);
        sb2.append(" {\n");
        if (g02.oscar() != 0) {
            j0(4, sb2);
            sb2.append("results: ");
            int i4 = 0;
            for (Long l11 : g02.uniform()) {
                int i5 = i4 + 1;
                if (i4 != 0) {
                    sb2.append(", ");
                }
                sb2.append(l11);
                i4 = i5;
            }
            sb2.append('\n');
        }
        if (g02.quebec() != 0) {
            j0(4, sb2);
            sb2.append("status: ");
            int i10 = 0;
            for (Long l12 : g02.whiskey()) {
                int i11 = i10 + 1;
                if (i10 != 0) {
                    sb2.append(", ");
                }
                sb2.append(l12);
                i10 = i11;
            }
            sb2.append('\n');
        }
        if (g02.november() != 0) {
            j0(4, sb2);
            sb2.append("dynamic_filter_timestamps: {");
            int i12 = 0;
            for (C1375t0 c1375t0 : g02.tango()) {
                int i13 = i12 + 1;
                if (i12 != 0) {
                    sb2.append(", ");
                }
                if (c1375t0.tango()) {
                    num2 = Integer.valueOf(c1375t0.november());
                } else {
                    num2 = null;
                }
                sb2.append(num2);
                sb2.append(":");
                if (c1375t0.sierra()) {
                    l10 = Long.valueOf(c1375t0.oscar());
                } else {
                    l10 = null;
                }
                sb2.append(l10);
                i12 = i13;
            }
            sb2.append("}\n");
        }
        if (g02.papa() != 0) {
            j0(4, sb2);
            sb2.append("sequence_filter_timestamps: {");
            int i14 = 0;
            for (com.google.android.gms.internal.measurement.I0 i02 : g02.victor()) {
                int i15 = i14 + 1;
                if (i14 != 0) {
                    sb2.append(", ");
                }
                if (i02.uniform()) {
                    num = Integer.valueOf(i02.oscar());
                } else {
                    num = null;
                }
                sb2.append(num);
                sb2.append(": [");
                Iterator it = i02.romeo().iterator();
                int i16 = 0;
                while (it.hasNext()) {
                    long longValue = ((Long) it.next()).longValue();
                    int i17 = i16 + 1;
                    if (i16 != 0) {
                        sb2.append(", ");
                    }
                    sb2.append(longValue);
                    i16 = i17;
                }
                sb2.append(Constants.AES_SUFFIX);
                i14 = i15;
            }
            sb2.append("}\n");
        }
        j0(3, sb2);
        sb2.append("}\n");
    }

    public static final void o0(StringBuilder sb2, int i4, String str, Object obj) {
        if (obj == null) {
            return;
        }
        j0(i4 + 1, sb2);
        sb2.append(str);
        sb2.append(": ");
        sb2.append(obj);
        sb2.append('\n');
    }

    public static final void p0(StringBuilder sb2, int i4, String str, com.google.android.gms.internal.measurement.T t5) {
        String str2;
        if (t5 == null) {
            return;
        }
        j0(i4, sb2);
        sb2.append(str);
        sb2.append(" {\n");
        if (t5.sierra()) {
            int xray = t5.xray();
            if (xray != 1) {
                if (xray != 2) {
                    if (xray != 3) {
                        if (xray != 4) {
                            str2 = "BETWEEN";
                        } else {
                            str2 = "EQUAL";
                        }
                    } else {
                        str2 = "GREATER_THAN";
                    }
                } else {
                    str2 = "LESS_THAN";
                }
            } else {
                str2 = "UNKNOWN_COMPARISON_TYPE";
            }
            o0(sb2, i4, "comparison_type", str2);
        }
        if (t5.uniform()) {
            o0(sb2, i4, "match_as_float", Boolean.valueOf(t5.romeo()));
        }
        if (t5.tango()) {
            o0(sb2, i4, "comparison_value", t5.oscar());
        }
        if (t5.whiskey()) {
            o0(sb2, i4, "min_comparison_value", t5.quebec());
        }
        if (t5.victor()) {
            o0(sb2, i4, "max_comparison_value", t5.papa());
        }
        j0(i4, sb2);
        sb2.append("}\n");
    }

    public static int q0(com.google.android.gms.internal.measurement.C0 c02, String str) {
        for (int i4 = 0; i4 < ((com.google.android.gms.internal.measurement.D0) c02.purple).M0(); i4++) {
            if (str.equals(((com.google.android.gms.internal.measurement.D0) c02.purple).papa(i4).sierra())) {
                return i4;
            }
        }
        return -1;
    }

    private final void r0() {
    }

    private final void s0() {
    }

    private final void t0() {
    }

    public static Bundle x0(Map map, boolean z2) {
        Bundle bundle = new Bundle();
        for (String str : map.keySet()) {
            Object obj = map.get(str);
            if (obj == null) {
                bundle.putString(str, null);
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Long) obj).longValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Double) obj).doubleValue());
            } else if (obj instanceof ArrayList) {
                if (z2) {
                    ArrayList arrayList = (ArrayList) obj;
                    ArrayList arrayList2 = new ArrayList();
                    int size = arrayList.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        arrayList2.add(x0((Map) arrayList.get(i4), false));
                    }
                    bundle.putParcelableArray(str, (Parcelable[]) arrayList2.toArray(new Parcelable[0]));
                }
            } else {
                bundle.putString(str, obj.toString());
            }
        }
        return bundle;
    }

    public static zzbh z0(C1293b c1293b) {
        String str;
        Object obj;
        Bundle x02 = x0(c1293b.charlie, true);
        if (x02.containsKey("_o") && (obj = x02.get("_o")) != null) {
            str = obj.toString();
        } else {
            str = "app";
        }
        String str2 = str;
        String delta = W.delta(c1293b.alpha, W.alpha, W.charlie);
        if (delta == null) {
            delta = c1293b.alpha;
        }
        return new zzbh(delta, new zzbf(x02), str2, c1293b.bravo);
    }

    public zzov A0(String str, com.google.android.gms.internal.measurement.C0 c02, C1379u0 c1379u0, String str2) {
        int indexOf;
        C1317f3.bravo();
        G g2 = (G) this.alpha;
        if (g2.yellow.j0(str, ac.f7574O)) {
            g2.f7511g.getClass();
            long currentTimeMillis = System.currentTimeMillis();
            ab abVar = ac.f7607m;
            C1440e c1440e = g2.yellow;
            String[] split = c1440e.i0(str, abVar).split(Constants.SEPARATOR_COMMA);
            HashSet hashSet = new HashSet(split.length);
            for (String str3 : split) {
                Objects.requireNonNull(str3);
                if (!hashSet.add(str3)) {
                    throw new IllegalArgumentException("duplicate element: ".concat(str3));
                }
            }
            Set unmodifiableSet = Collections.unmodifiableSet(hashSet);
            Z0 z02 = this.purple;
            W0 w02 = z02.f7540c;
            A a6 = w02.purple.alpha;
            Z0.cyan(a6);
            String m02 = a6.m0(str);
            Uri.Builder builder = new Uri.Builder();
            G g5 = (G) w02.alpha;
            builder.scheme(g5.yellow.i0(str, ac.f7594f));
            boolean isEmpty = TextUtils.isEmpty(m02);
            C1440e c1440e2 = g5.yellow;
            if (!isEmpty) {
                builder.authority(m02 + "." + c1440e2.i0(str, ac.f7596g));
            } else {
                builder.authority(c1440e2.i0(str, ac.f7596g));
            }
            builder.path(c1440e2.i0(str, ac.f7598h));
            k0(builder, "gmp_app_id", ((com.google.android.gms.internal.measurement.D0) c02.purple).azure(), unmodifiableSet);
            c1440e.d0();
            k0(builder, "gmp_version", String.valueOf(119002L), unmodifiableSet);
            String sierra = ((com.google.android.gms.internal.measurement.D0) c02.purple).sierra();
            ab abVar2 = ac.f7576R;
            boolean j02 = c1440e.j0(str, abVar2);
            A a8 = z02.alpha;
            if (j02) {
                Z0.cyan(a8);
                if (a8.a0(str)) {
                    sierra = "";
                }
            }
            k0(builder, "app_instance_id", sierra, unmodifiableSet);
            k0(builder, "rdid", ((com.google.android.gms.internal.measurement.D0) c02.purple).bronze(), unmodifiableSet);
            k0(builder, "bundle_id", c02.xray(), unmodifiableSet);
            String mike = c1379u0.mike();
            String delta = W.delta(mike, W.charlie, W.alpha);
            if (true != TextUtils.isEmpty(delta)) {
                mike = delta;
            }
            k0(builder, "app_event_name", mike, unmodifiableSet);
            k0(builder, "app_version", String.valueOf(((com.google.android.gms.internal.measurement.D0) c02.purple).E()), unmodifiableSet);
            String black = ((com.google.android.gms.internal.measurement.D0) c02.purple).black();
            if (c1440e.j0(str, abVar2)) {
                Z0.cyan(a8);
                if (a8.b0(str) && !TextUtils.isEmpty(black) && (indexOf = black.indexOf(".")) != -1) {
                    black = black.substring(0, indexOf);
                }
            }
            k0(builder, "os_version", black, unmodifiableSet);
            k0(builder, "timestamp", String.valueOf(c1379u0.india()), unmodifiableSet);
            String str4 = "1";
            if (((com.google.android.gms.internal.measurement.D0) c02.purple).z0()) {
                k0(builder, "lat", "1", unmodifiableSet);
            }
            k0(builder, "privacy_sandbox_version", String.valueOf(((com.google.android.gms.internal.measurement.D0) c02.purple).gray()), unmodifiableSet);
            k0(builder, "trigger_uri_source", "1", unmodifiableSet);
            k0(builder, "trigger_uri_timestamp", String.valueOf(currentTimeMillis), unmodifiableSet);
            k0(builder, "request_uuid", str2, unmodifiableSet);
            List<C1395y0> november = c1379u0.november();
            Bundle bundle = new Bundle();
            for (C1395y0 c1395y0 : november) {
                String sierra2 = c1395y0.sierra();
                if (c1395y0.bronze()) {
                    bundle.putString(sierra2, String.valueOf(c1395y0.november()));
                } else if (c1395y0.coral()) {
                    bundle.putString(sierra2, String.valueOf(c1395y0.oscar()));
                } else if (c1395y0.emerald()) {
                    bundle.putString(sierra2, c1395y0.tango());
                } else if (c1395y0.crimson()) {
                    bundle.putString(sierra2, String.valueOf(c1395y0.quebec()));
                }
            }
            m0(builder, c1440e.i0(str, ac.f7606l).split("\\|"), bundle, unmodifiableSet);
            List<com.google.android.gms.internal.measurement.M0> unmodifiableList = Collections.unmodifiableList(((com.google.android.gms.internal.measurement.D0) c02.purple).fuchsia());
            Bundle bundle2 = new Bundle();
            for (com.google.android.gms.internal.measurement.M0 m03 : unmodifiableList) {
                String sierra3 = m03.sierra();
                if (m03.beige()) {
                    bundle2.putString(sierra3, String.valueOf(m03.november()));
                } else if (m03.black()) {
                    bundle2.putString(sierra3, String.valueOf(m03.oscar()));
                } else if (m03.coral()) {
                    bundle2.putString(sierra3, m03.tango());
                } else if (m03.blue()) {
                    bundle2.putString(sierra3, String.valueOf(m03.papa()));
                }
            }
            m0(builder, c1440e.i0(str, ac.f7604k).split("\\|"), bundle2, unmodifiableSet);
            if (true != ((com.google.android.gms.internal.measurement.D0) c02.purple).y0()) {
                str4 = ExpiryDateConstantsKt.EXPIRY_DATE_PREFIX_ZERO;
            }
            k0(builder, "dma", str4, unmodifiableSet);
            if (!((com.google.android.gms.internal.measurement.D0) c02.purple).xray().isEmpty()) {
                k0(builder, "dma_cps", ((com.google.android.gms.internal.measurement.D0) c02.purple).xray(), unmodifiableSet);
            }
            if (((com.google.android.gms.internal.measurement.D0) c02.purple).B0()) {
                C1348m0 Z02 = ((com.google.android.gms.internal.measurement.D0) c02.purple).Z0();
                if (!Z02.azure().isEmpty()) {
                    k0(builder, "dl_gclid", Z02.azure(), unmodifiableSet);
                }
                if (!Z02.amber().isEmpty()) {
                    k0(builder, "dl_gbraid", Z02.amber(), unmodifiableSet);
                }
                if (!Z02.zulu().isEmpty()) {
                    k0(builder, "dl_gs", Z02.zulu(), unmodifiableSet);
                }
                if (Z02.victor() > 0) {
                    k0(builder, "dl_ss_ts", String.valueOf(Z02.victor()), unmodifiableSet);
                }
                if (!Z02.blue().isEmpty()) {
                    k0(builder, "mr_gclid", Z02.blue(), unmodifiableSet);
                }
                if (!Z02.black().isEmpty()) {
                    k0(builder, "mr_gbraid", Z02.black(), unmodifiableSet);
                }
                if (!Z02.beige().isEmpty()) {
                    k0(builder, "mr_gs", Z02.beige(), unmodifiableSet);
                }
                if (Z02.whiskey() > 0) {
                    k0(builder, "mr_click_ts", String.valueOf(Z02.whiskey()), unmodifiableSet);
                }
            }
            return new zzov(1, currentTimeMillis, builder.build().toString());
        }
        return null;
    }

    public C1383v0 B0(C1458n c1458n) {
        Bundle bundle;
        C1379u0 romeo = C1383v0.romeo();
        romeo.golf();
        C1383v0.azure(c1458n.echo, (C1383v0) romeo.purple);
        zzbf zzbfVar = c1458n.foxtrot;
        Iterator<String> it = zzbfVar.alpha.keySet().iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            bundle = zzbfVar.alpha;
            if (!hasNext) {
                break;
            }
            String next = it.next();
            C1391x0 romeo2 = C1395y0.romeo();
            romeo2.india(next);
            Object obj = bundle.get(next);
            V5.x.hotel(obj);
            I0(romeo2, obj);
            romeo.juliet(romeo2);
        }
        String str = c1458n.charlie;
        if (!TextUtils.isEmpty(str) && bundle.get("_o") == null) {
            C1391x0 romeo3 = C1395y0.romeo();
            romeo3.india("_o");
            romeo3.juliet(str);
            romeo.kilo((C1395y0) romeo3.echo());
        }
        return (C1383v0) romeo.echo();
    }

    public String D0(com.google.android.gms.internal.measurement.B0 b02) {
        Long l10;
        Long l11;
        String str;
        String str2;
        C1360p0 a12;
        StringBuilder tango = Q0.c.tango("\nbatch {\n");
        if (b02.azure()) {
            o0(tango, 0, "upload_subdomain", b02.sierra());
        }
        if (b02.amber()) {
            o0(tango, 0, "sgtm_join_id", b02.romeo());
        }
        for (com.google.android.gms.internal.measurement.D0 d02 : b02.tango()) {
            if (d02 != null) {
                j0(1, tango);
                tango.append("bundle {\n");
                if (d02.V()) {
                    o0(tango, 1, "protocol_version", Integer.valueOf(d02.J0()));
                }
                G g2 = (G) this.alpha;
                if (g2.yellow.j0(d02.romeo(), ac.f7564E) && d02.Y()) {
                    o0(tango, 1, "session_stitching_token", d02.coral());
                }
                o0(tango, 1, "platform", d02.blue());
                if (d02.Q()) {
                    o0(tango, 1, "gmp_version", Long.valueOf(d02.S0()));
                }
                if (d02.e0()) {
                    o0(tango, 1, "uploading_gmp_version", Long.valueOf(d02.Y0()));
                }
                if (d02.O()) {
                    o0(tango, 1, "dynamite_version", Long.valueOf(d02.Q0()));
                }
                if (d02.H()) {
                    o0(tango, 1, "config_version", Long.valueOf(d02.O0()));
                }
                o0(tango, 1, "gmp_app_id", d02.azure());
                o0(tango, 1, "admob_app_id", d02.quebec());
                o0(tango, 1, "app_id", d02.romeo());
                o0(tango, 1, "app_version", d02.uniform());
                if (d02.C0()) {
                    o0(tango, 1, "app_version_major", Integer.valueOf(d02.E()));
                }
                o0(tango, 1, "firebase_instance_id", d02.amber());
                if (d02.M()) {
                    o0(tango, 1, "dev_cert_hash", Long.valueOf(d02.P0()));
                }
                o0(tango, 1, "app_store", d02.tango());
                if (d02.d0()) {
                    o0(tango, 1, "upload_timestamp_millis", Long.valueOf(d02.X0()));
                }
                if (d02.a0()) {
                    o0(tango, 1, "start_timestamp_millis", Long.valueOf(d02.V0()));
                }
                if (d02.P()) {
                    o0(tango, 1, "end_timestamp_millis", Long.valueOf(d02.R0()));
                }
                if (d02.U()) {
                    o0(tango, 1, "previous_bundle_start_timestamp_millis", Long.valueOf(d02.U0()));
                }
                if (d02.T()) {
                    o0(tango, 1, "previous_bundle_end_timestamp_millis", Long.valueOf(d02.T0()));
                }
                o0(tango, 1, "app_instance_id", d02.sierra());
                o0(tango, 1, "resettable_device_id", d02.bronze());
                o0(tango, 1, "ds_id", d02.zulu());
                if (d02.S()) {
                    o0(tango, 1, "limited_ad_tracking", Boolean.valueOf(d02.z0()));
                }
                o0(tango, 1, "os_version", d02.black());
                o0(tango, 1, "device_model", d02.yankee());
                o0(tango, 1, "user_default_language", d02.crimson());
                if (d02.c0()) {
                    o0(tango, 1, "time_zone_offset_minutes", Integer.valueOf(d02.L0()));
                }
                if (d02.G()) {
                    o0(tango, 1, "bundle_sequential_index", Integer.valueOf(d02.E0()));
                }
                if (d02.L()) {
                    o0(tango, 1, "delivery_index", Integer.valueOf(d02.H0()));
                }
                if (d02.X()) {
                    o0(tango, 1, "service_upload", Boolean.valueOf(d02.A0()));
                }
                o0(tango, 1, "health_monitor", d02.beige());
                if (d02.W()) {
                    o0(tango, 1, "retry_counter", Integer.valueOf(d02.K0()));
                }
                if (d02.J()) {
                    o0(tango, 1, "consent_signals", d02.whiskey());
                }
                if (d02.R()) {
                    o0(tango, 1, "is_dma_region", Boolean.valueOf(d02.y0()));
                }
                if (d02.K()) {
                    o0(tango, 1, "core_platform_services", d02.xray());
                }
                if (d02.I()) {
                    o0(tango, 1, "consent_diagnostics", d02.victor());
                }
                if (d02.b0()) {
                    o0(tango, 1, "target_os_version", Long.valueOf(d02.W0()));
                }
                C1317f3.bravo();
                if (g2.yellow.j0(d02.romeo(), ac.f7574O)) {
                    o0(tango, 1, "ad_services_version", Integer.valueOf(d02.gray()));
                    if (d02.D0() && (a12 = d02.a1()) != null) {
                        j0(2, tango);
                        tango.append("attribution_eligibility_status {\n");
                        o0(tango, 2, "eligible", Boolean.valueOf(a12.yankee()));
                        o0(tango, 2, "no_access_adservices_attribution_permission", Boolean.valueOf(a12.amber()));
                        o0(tango, 2, "pre_r", Boolean.valueOf(a12.azure()));
                        o0(tango, 2, "r_extensions_too_old", Boolean.valueOf(a12.beige()));
                        o0(tango, 2, "adservices_extension_too_old", Boolean.valueOf(a12.xray()));
                        o0(tango, 2, "ad_storage_not_allowed", Boolean.valueOf(a12.whiskey()));
                        o0(tango, 2, "measurement_manager_disabled", Boolean.valueOf(a12.zulu()));
                        j0(2, tango);
                        tango.append("}\n");
                    }
                }
                if (d02.B0()) {
                    C1348m0 Z02 = d02.Z0();
                    j0(2, tango);
                    tango.append("ad_campaign_info {\n");
                    if (Z02.papa()) {
                        o0(tango, 2, "deep_link_gclid", Z02.azure());
                    }
                    if (Z02.oscar()) {
                        o0(tango, 2, "deep_link_gbraid", Z02.amber());
                    }
                    if (Z02.november()) {
                        o0(tango, 2, "deep_link_gad_source", Z02.zulu());
                    }
                    if (Z02.quebec()) {
                        o0(tango, 2, "deep_link_session_millis", Long.valueOf(Z02.victor()));
                    }
                    if (Z02.uniform()) {
                        o0(tango, 2, "market_referrer_gclid", Z02.blue());
                    }
                    if (Z02.tango()) {
                        o0(tango, 2, "market_referrer_gbraid", Z02.black());
                    }
                    if (Z02.sierra()) {
                        o0(tango, 2, "market_referrer_gad_source", Z02.beige());
                    }
                    if (Z02.romeo()) {
                        o0(tango, 2, "market_referrer_click_millis", Long.valueOf(Z02.whiskey()));
                    }
                    j0(2, tango);
                    tango.append("}\n");
                }
                if (d02.F()) {
                    o0(tango, 1, "batching_timestamp_millis", Long.valueOf(d02.N0()));
                }
                if (d02.Z()) {
                    com.google.android.gms.internal.measurement.K0 oscar = d02.oscar();
                    j0(2, tango);
                    tango.append("sgtm_diagnostics {\n");
                    int sierra = oscar.sierra();
                    if (sierra != 1) {
                        if (sierra != 2) {
                            if (sierra != 3) {
                                if (sierra != 4) {
                                    str = "SDK_SERVICE_UPLOAD";
                                } else {
                                    str = "PACKAGE_SERVICE_UPLOAD";
                                }
                            } else {
                                str = "SDK_CLIENT_UPLOAD";
                            }
                        } else {
                            str = "GA_UPLOAD";
                        }
                    } else {
                        str = "UPLOAD_TYPE_UNKNOWN";
                    }
                    o0(tango, 2, "upload_type", str);
                    o0(tango, 2, "client_upload_eligibility", ao.ad.indigo(oscar.oscar()));
                    int romeo = oscar.romeo();
                    if (romeo != 1) {
                        if (romeo != 2) {
                            if (romeo != 3) {
                                if (romeo != 4) {
                                    if (romeo != 5) {
                                        str2 = "NON_PLAY_MISSING_SGTM_SERVER_URL";
                                    } else {
                                        str2 = "MISSING_SGTM_PROXY_INFO";
                                    }
                                } else {
                                    str2 = "MISSING_SGTM_SETTINGS";
                                }
                            } else {
                                str2 = "NOT_IN_ROLLOUT";
                            }
                        } else {
                            str2 = "SERVICE_UPLOAD_ELIGIBLE";
                        }
                    } else {
                        str2 = "SERVICE_UPLOAD_ELIGIBILITY_UNKNOWN";
                    }
                    o0(tango, 2, "service_upload_eligibility", str2);
                    j0(2, tango);
                    tango.append("}\n");
                }
                D1<com.google.android.gms.internal.measurement.M0> fuchsia = d02.fuchsia();
                am amVar = g2.f7510f;
                if (fuchsia != null) {
                    for (com.google.android.gms.internal.measurement.M0 m02 : fuchsia) {
                        if (m02 != null) {
                            j0(2, tango);
                            tango.append("user_property {\n");
                            Double d4 = null;
                            if (m02.bronze()) {
                                l10 = Long.valueOf(m02.quebec());
                            } else {
                                l10 = null;
                            }
                            o0(tango, 2, "set_timestamp_millis", l10);
                            o0(tango, 2, "name", amVar.foxtrot(m02.sierra()));
                            o0(tango, 2, "string_value", m02.tango());
                            if (m02.blue()) {
                                l11 = Long.valueOf(m02.papa());
                            } else {
                                l11 = null;
                            }
                            o0(tango, 2, "int_value", l11);
                            if (m02.beige()) {
                                d4 = Double.valueOf(m02.november());
                            }
                            o0(tango, 2, "double_value", d4);
                            j0(2, tango);
                            tango.append("}\n");
                        }
                    }
                }
                D1<C1367r0> cyan = d02.cyan();
                if (cyan != null) {
                    for (C1367r0 c1367r0 : cyan) {
                        if (c1367r0 != null) {
                            j0(2, tango);
                            tango.append("audience_membership {\n");
                            if (c1367r0.whiskey()) {
                                o0(tango, 2, "audience_id", Integer.valueOf(c1367r0.november()));
                            }
                            if (c1367r0.xray()) {
                                o0(tango, 2, "new_audience", Boolean.valueOf(c1367r0.victor()));
                            }
                            n0(tango, "current_data", c1367r0.papa());
                            if (c1367r0.yankee()) {
                                n0(tango, "previous_data", c1367r0.quebec());
                            }
                            j0(2, tango);
                            tango.append("}\n");
                        }
                    }
                }
                D1<C1383v0> emerald = d02.emerald();
                if (emerald != null) {
                    for (C1383v0 c1383v0 : emerald) {
                        if (c1383v0 != null) {
                            j0(2, tango);
                            tango.append("event {\n");
                            o0(tango, 2, "name", amVar.delta(c1383v0.tango()));
                            if (c1383v0.bronze()) {
                                o0(tango, 2, "timestamp_millis", Long.valueOf(c1383v0.quebec()));
                            }
                            if (c1383v0.blue()) {
                                o0(tango, 2, "previous_timestamp_millis", Long.valueOf(c1383v0.papa()));
                            }
                            if (c1383v0.black()) {
                                o0(tango, 2, Column.COUNT, Integer.valueOf(c1383v0.november()));
                            }
                            if (c1383v0.oscar() != 0) {
                                h0(tango, 2, (D1) c1383v0.uniform());
                            }
                            j0(2, tango);
                            tango.append("}\n");
                        }
                    }
                }
                j0(1, tango);
                tango.append("}\n");
            }
        }
        tango.append("} // End-of-batch\n");
        return tango.toString();
    }

    public String E0(com.google.android.gms.internal.measurement.V v4) {
        StringBuilder tango = Q0.c.tango("\nproperty_filter {\n");
        if (v4.victor()) {
            o0(tango, 0, "filter_id", Integer.valueOf(v4.november()));
        }
        o0(tango, 0, "property_name", ((G) this.alpha).f7510f.foxtrot(v4.quebec()));
        String l02 = l0(v4.sierra(), v4.tango(), v4.uniform());
        if (!l02.isEmpty()) {
            o0(tango, 0, "filter_type", l02);
        }
        i0(tango, 1, v4.oscar());
        tango.append("}\n");
        return tango.toString();
    }

    public List F0(C1 c12, List list) {
        int i4;
        ArrayList arrayList = new ArrayList(c12);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            int intValue = num.intValue();
            G g2 = (G) this.alpha;
            if (intValue < 0) {
                ar arVar = g2.f7507b;
                G.foxtrot(arVar);
                arVar.f7632b.bravo(num, "Ignoring negative bit index to be cleared");
            } else {
                int intValue2 = num.intValue() / 64;
                if (intValue2 >= arrayList.size()) {
                    ar arVar2 = g2.f7507b;
                    G.foxtrot(arVar2);
                    arVar2.f7632b.charlie(num, Integer.valueOf(arrayList.size()), "Ignoring bit index greater than bitSet size");
                } else {
                    arrayList.set(intValue2, Long.valueOf(((Long) arrayList.get(intValue2)).longValue() & (~(1 << (num.intValue() % 64)))));
                }
            }
        }
        int size = arrayList.size();
        int size2 = arrayList.size() - 1;
        while (true) {
            int i5 = size2;
            i4 = size;
            size = i5;
            if (size < 0 || ((Long) arrayList.get(size)).longValue() != 0) {
                break;
            }
            size2 = size - 1;
        }
        return arrayList.subList(0, i4);
    }

    public void I0(C1391x0 c1391x0, Object obj) {
        c1391x0.golf();
        C1395y0.amber((C1395y0) c1391x0.purple);
        c1391x0.golf();
        C1395y0.yankee((C1395y0) c1391x0.purple);
        c1391x0.golf();
        C1395y0.xray((C1395y0) c1391x0.purple);
        c1391x0.golf();
        C1395y0.zulu((C1395y0) c1391x0.purple);
        if (obj instanceof String) {
            c1391x0.juliet((String) obj);
            return;
        }
        if (obj instanceof Long) {
            c1391x0.hotel(((Long) obj).longValue());
            return;
        }
        if (obj instanceof Double) {
            double doubleValue = ((Double) obj).doubleValue();
            c1391x0.golf();
            C1395y0.azure((C1395y0) c1391x0.purple, doubleValue);
            return;
        }
        if (obj instanceof Bundle[]) {
            ArrayList arrayList = new ArrayList();
            for (Bundle bundle : (Bundle[]) obj) {
                if (bundle != null) {
                    C1391x0 romeo = C1395y0.romeo();
                    for (String str : bundle.keySet()) {
                        C1391x0 romeo2 = C1395y0.romeo();
                        romeo2.india(str);
                        Object obj2 = bundle.get(str);
                        if (obj2 instanceof Long) {
                            romeo2.hotel(((Long) obj2).longValue());
                        } else if (obj2 instanceof String) {
                            romeo2.juliet((String) obj2);
                        } else if (obj2 instanceof Double) {
                            double doubleValue2 = ((Double) obj2).doubleValue();
                            romeo2.golf();
                            C1395y0.azure((C1395y0) romeo2.purple, doubleValue2);
                        }
                        romeo.golf();
                        C1395y0.whiskey((C1395y0) romeo.purple, (C1395y0) romeo2.echo());
                    }
                    if (((C1395y0) romeo.purple).papa() > 0) {
                        arrayList.add((C1395y0) romeo.echo());
                    }
                }
            }
            c1391x0.golf();
            C1395y0.victor((C1395y0) c1391x0.purple, arrayList);
            return;
        }
        ar arVar = ((G) this.alpha).f7507b;
        G.foxtrot(arVar);
        arVar.white.bravo(obj, "Ignoring invalid (type) event param value");
    }

    public void J0(com.google.android.gms.internal.measurement.L0 l02, Object obj) {
        V5.x.hotel(obj);
        l02.golf();
        com.google.android.gms.internal.measurement.M0.whiskey((com.google.android.gms.internal.measurement.M0) l02.purple);
        l02.golf();
        com.google.android.gms.internal.measurement.M0.victor((com.google.android.gms.internal.measurement.M0) l02.purple);
        l02.golf();
        com.google.android.gms.internal.measurement.M0.uniform((com.google.android.gms.internal.measurement.M0) l02.purple);
        if (obj instanceof String) {
            l02.golf();
            com.google.android.gms.internal.measurement.M0.azure((com.google.android.gms.internal.measurement.M0) l02.purple, (String) obj);
        } else if (obj instanceof Long) {
            long longValue = ((Long) obj).longValue();
            l02.golf();
            com.google.android.gms.internal.measurement.M0.yankee((com.google.android.gms.internal.measurement.M0) l02.purple, longValue);
        } else if (obj instanceof Double) {
            double doubleValue = ((Double) obj).doubleValue();
            l02.golf();
            com.google.android.gms.internal.measurement.M0.xray((com.google.android.gms.internal.measurement.M0) l02.purple, doubleValue);
        } else {
            ar arVar = ((G) this.alpha).f7507b;
            G.foxtrot(arVar);
            arVar.white.bravo(obj, "Ignoring invalid (type) user attribute value");
        }
    }

    public boolean L0(long j5, long j6) {
        if (j5 != 0 && j6 > 0) {
            ((G) this.alpha).f7511g.getClass();
            if (Math.abs(System.currentTimeMillis() - j5) <= j6) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override // com.google.android.gms.measurement.internal.U0
    public final void Z() {
        int i4 = this.silver;
    }

    public byte[] b0(byte[] bArr) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            ar arVar = ((G) this.alpha).f7507b;
            G.foxtrot(arVar);
            arVar.white.bravo(e, "Failed to gzip content");
            throw e;
        }
    }

    public void h0(StringBuilder sb2, int i4, D1 d12) {
        String str;
        String str2;
        Long l10;
        if (d12 != null) {
            int i5 = i4 + 1;
            Iterator it = d12.iterator();
            while (it.hasNext()) {
                C1395y0 c1395y0 = (C1395y0) it.next();
                if (c1395y0 != null) {
                    j0(i5, sb2);
                    sb2.append("param {\n");
                    Double d4 = null;
                    if (c1395y0.cyan()) {
                        str = ((G) this.alpha).f7510f.echo(c1395y0.sierra());
                    } else {
                        str = null;
                    }
                    o0(sb2, i5, "name", str);
                    if (c1395y0.emerald()) {
                        str2 = c1395y0.tango();
                    } else {
                        str2 = null;
                    }
                    o0(sb2, i5, "string_value", str2);
                    if (c1395y0.crimson()) {
                        l10 = Long.valueOf(c1395y0.quebec());
                    } else {
                        l10 = null;
                    }
                    o0(sb2, i5, "int_value", l10);
                    if (c1395y0.bronze()) {
                        d4 = Double.valueOf(c1395y0.november());
                    }
                    o0(sb2, i5, "double_value", d4);
                    if (c1395y0.papa() > 0) {
                        h0(sb2, i5, (D1) c1395y0.uniform());
                    }
                    j0(i5, sb2);
                    sb2.append("}\n");
                }
            }
        }
    }

    public void i0(StringBuilder sb2, int i4, com.google.android.gms.internal.measurement.P p4) {
        String str;
        if (p4 == null) {
            return;
        }
        j0(i4, sb2);
        sb2.append("filter {\n");
        if (p4.tango()) {
            o0(sb2, i4, "complement", Boolean.valueOf(p4.sierra()));
        }
        if (p4.victor()) {
            o0(sb2, i4, "param_name", ((G) this.alpha).f7510f.echo(p4.quebec()));
        }
        if (p4.whiskey()) {
            int i5 = i4 + 1;
            com.google.android.gms.internal.measurement.W papa = p4.papa();
            if (papa != null) {
                j0(i5, sb2);
                sb2.append("string_filter {\n");
                if (papa.uniform()) {
                    switch (papa.victor()) {
                        case 1:
                            str = "UNKNOWN_MATCH_TYPE";
                            break;
                        case 2:
                            str = "REGEXP";
                            break;
                        case 3:
                            str = "BEGINS_WITH";
                            break;
                        case 4:
                            str = "ENDS_WITH";
                            break;
                        case 5:
                            str = "PARTIAL";
                            break;
                        case 6:
                            str = "EXACT";
                            break;
                        default:
                            str = "IN_LIST";
                            break;
                    }
                    o0(sb2, i5, "match_type", str);
                }
                if (papa.tango()) {
                    o0(sb2, i5, "expression", papa.papa());
                }
                if (papa.sierra()) {
                    o0(sb2, i5, "case_sensitive", Boolean.valueOf(papa.romeo()));
                }
                if (papa.november() > 0) {
                    j0(i4 + 2, sb2);
                    sb2.append("expression_list {\n");
                    for (String str2 : papa.quebec()) {
                        j0(i4 + 3, sb2);
                        sb2.append(str2);
                        sb2.append("\n");
                    }
                    sb2.append("}\n");
                }
                j0(i5, sb2);
                sb2.append("}\n");
            }
        }
        if (p4.uniform()) {
            p0(sb2, i4 + 1, "number_filter", p4.oscar());
        }
        j0(i4, sb2);
        sb2.append("}\n");
    }

    public void u0(String str, V0 v0, com.google.android.gms.internal.measurement.B0 b02, as asVar) {
        String str2;
        URL url;
        byte[] charlie;
        E e;
        Map map;
        String str3 = v0.alpha;
        G g2 = (G) this.alpha;
        W();
        X();
        try {
            url = new URI(str3).toURL();
            this.purple.alpha();
            charlie = b02.charlie();
            e = g2.f7508c;
            G.foxtrot(e);
            map = v0.bravo;
            if (map == null) {
                map = Collections.EMPTY_MAP;
            }
            str2 = str;
        } catch (IllegalArgumentException | MalformedURLException | URISyntaxException unused) {
            str2 = str;
        }
        try {
            e.f0(new at(this, str2, url, charlie, map, asVar));
        } catch (IllegalArgumentException | MalformedURLException | URISyntaxException unused2) {
            ar arVar = g2.f7507b;
            G.foxtrot(arVar);
            arVar.white.charlie(ar.e0(str2), str3, "Failed to parse URL. Not uploading MeasurementBatch. appId");
        }
    }

    public boolean v0() {
        X();
        ConnectivityManager connectivityManager = (ConnectivityManager) ((G) this.alpha).alpha.getSystemService("connectivity");
        NetworkInfo networkInfo = null;
        if (connectivityManager != null) {
            try {
                networkInfo = connectivityManager.getActiveNetworkInfo();
            } catch (SecurityException unused) {
            }
        }
        if (networkInfo != null && networkInfo.isConnected()) {
            return true;
        }
        return false;
    }

    public long w0(byte[] bArr) {
        V5.x.hotel(bArr);
        G g2 = (G) this.alpha;
        d1 d1Var = g2.e;
        G.delta(d1Var);
        d1Var.W();
        MessageDigest h02 = d1.h0();
        if (h02 == null) {
            ar arVar = g2.f7507b;
            G.foxtrot(arVar);
            arVar.white.alpha("Failed to get MD5");
            return 0L;
        }
        return d1.g1(h02.digest(bArr));
    }

    public Parcelable y0(byte[] bArr, Parcelable.Creator creator) {
        Parcelable parcelable = null;
        if (bArr == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        try {
            try {
                obtain.unmarshall(bArr, 0, bArr.length);
                obtain.setDataPosition(0);
                parcelable = (Parcelable) creator.createFromParcel(obtain);
            } catch (SafeParcelReader$ParseException unused) {
                ar arVar = ((G) this.alpha).f7507b;
                G.foxtrot(arVar);
                arVar.white.alpha("Failed to load parcelable from buffer");
            }
            return parcelable;
        } finally {
            obtain.recycle();
        }
    }
}
