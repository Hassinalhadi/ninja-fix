package g8;

import B9.ab;
import F8.q;
import J3.h;
import J3.r;
import J3.s;
import J3.x;
import Tf.n;
import a0.C0346af;
import android.media.CamcorderProfile;
import android.media.MediaExtractor;
import android.media.MediaMetadataRetriever;
import android.os.ParcelFileDescriptor;
import android.os.SystemClock;
import av.InterfaceC0684d;
import com.bumptech.glide.load.resource.bitmap.aa;
import com.google.android.gms.internal.measurement.C1297b3;
import com.google.android.gms.internal.measurement.C1317f3;
import com.google.android.gms.internal.measurement.C1327h3;
import com.google.android.gms.internal.measurement.C1362p2;
import com.google.android.gms.internal.measurement.C1369r2;
import com.google.android.gms.internal.measurement.C3;
import com.google.android.gms.internal.measurement.t3;
import com.google.android.gms.internal.measurement.x3;
import com.google.android.gms.internal.measurement.z3;
import com.google.android.gms.measurement.internal.ac;
import com.google.firebase.analytics.connector.internal.AnalyticsConnectorRegistrar;
import com.google.mlkit.common.sdkinternal.j;
import id.C1915c;
import java.io.File;
import java.io.InputStream;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class d implements E3.g, I7.e, H3.a, s, N5.a, Q7.d, W7.c, X7.a, T1.b, InterfaceC0684d, aa, com.google.android.gms.measurement.internal.aa {
    public final /* synthetic */ int alpha;

    public /* synthetic */ d(int i4) {
        this.alpha = i4;
    }

    public static n lima(String str) {
        char c3;
        int i4;
        char charAt;
        char c4 = 'A';
        Intrinsics.echo(str, "<this>");
        byte[] bArr = Tf.a.alpha;
        int length = str.length();
        while (true) {
            c3 = '\t';
            if (length <= 0 || !((charAt = str.charAt(length - 1)) == '=' || charAt == '\n' || charAt == '\r' || charAt == ' ' || charAt == '\t')) {
                break;
            }
            length--;
        }
        int i5 = (int) ((length * 6) / 8);
        byte[] bArr2 = new byte[i5];
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            if (i10 < length) {
                char charAt2 = str.charAt(i10);
                char c10 = c4;
                if (c4 <= charAt2 && charAt2 < '[') {
                    i4 = charAt2 - 'A';
                } else if ('a' <= charAt2 && charAt2 < '{') {
                    i4 = charAt2 - 'G';
                } else if ('0' <= charAt2 && charAt2 < ':') {
                    i4 = charAt2 + 4;
                } else if (charAt2 != '+' && charAt2 != '-') {
                    if (charAt2 != '/' && charAt2 != '_') {
                        if (charAt2 != '\n' && charAt2 != '\r' && charAt2 != ' ' && charAt2 != c3) {
                            break;
                        }
                        i10++;
                        c4 = c10;
                        c3 = '\t';
                    } else {
                        i4 = 63;
                    }
                } else {
                    i4 = 62;
                }
                int i14 = i4 | (i12 << 6);
                i11++;
                if (i11 % 4 == 0) {
                    bArr2[i13] = (byte) (i14 >> 16);
                    int i15 = i13 + 2;
                    bArr2[i13 + 1] = (byte) (i14 >> 8);
                    i13 += 3;
                    bArr2[i15] = (byte) i14;
                }
                i12 = i14;
                i10++;
                c4 = c10;
                c3 = '\t';
            } else {
                int i16 = i11 % 4;
                if (i16 != 1) {
                    if (i16 != 2) {
                        if (i16 == 3) {
                            int i17 = i12 << 6;
                            int i18 = 1 + i13;
                            bArr2[i13] = (byte) (i17 >> 16);
                            i13 += 2;
                            bArr2[i18] = (byte) (i17 >> 8);
                        }
                    } else {
                        bArr2[i13] = (byte) ((i12 << 12) >> 16);
                        i13 = 1 + i13;
                    }
                    if (i13 != i5) {
                        bArr2 = Arrays.copyOf(bArr2, i13);
                        Intrinsics.delta(bArr2, "copyOf(...)");
                    }
                }
            }
        }
        bArr2 = null;
        if (bArr2 == null) {
            return null;
        }
        return new n(bArr2);
    }

    public static n mike(String str) {
        if (str.length() % 2 == 0) {
            int length = str.length() / 2;
            byte[] bArr = new byte[length];
            for (int i4 = 0; i4 < length; i4++) {
                int i5 = i4 * 2;
                bArr[i4] = (byte) (Uf.b.alpha(str.charAt(i5 + 1)) + (Uf.b.alpha(str.charAt(i5)) << 4));
            }
            return new n(bArr);
        }
        throw new IllegalArgumentException("Unexpected hex string: ".concat(str).toString());
    }

    public static W7.b november(U8.a aVar) {
        return new W7.b(System.currentTimeMillis() + 3600000, new q(8), new W7.a(true, false, false), 10.0d, 1.2d, 60);
    }

    public static n oscar(String str) {
        Intrinsics.echo(str, "<this>");
        byte[] bytes = str.getBytes(kotlin.text.a.alpha);
        Intrinsics.delta(bytes, "getBytes(...)");
        n nVar = new n(bytes);
        nVar.red = str;
        return nVar;
    }

    public static C0346af papa(List list) {
        return new C0346af(list, null, 0L, 9187343241974906880L, 0);
    }

    public static n quebec(int i4, byte[] bArr) {
        Intrinsics.echo(bArr, "<this>");
        if (i4 == -1234567890) {
            i4 = bArr.length;
        }
        Tf.b.echo(bArr.length, 0, i4);
        return new n(ArraysKt.copyOfRange(bArr, 0, i4));
    }

    @Override // Q7.d
    public void alpha() {
    }

    @Override // av.InterfaceC0684d
    public CamcorderProfile bravo(int i4, int i5) {
        return CamcorderProfile.get(i4, i5);
    }

    @Override // Q7.d
    public String charlie() {
        return null;
    }

    @Override // I7.e
    public Object create(I7.c cVar) {
        switch (this.alpha) {
            case 3:
                return AnalyticsConnectorRegistrar.lambda$getComponents$0(cVar);
            default:
                return new com.google.mlkit.common.sdkinternal.d(((ab) cVar).india(j.class));
        }
    }

    @Override // H3.a
    public File delta(E3.f fVar) {
        return null;
    }

    @Override // E3.g
    public void echo(byte[] bArr, Object obj, MessageDigest messageDigest) {
    }

    @Override // X7.a
    public StackTraceElement[] emerald(StackTraceElement[] stackTraceElementArr) {
        int i4;
        HashMap hashMap = new HashMap();
        StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[stackTraceElementArr.length];
        int i5 = 1;
        int i10 = 0;
        int i11 = 0;
        while (i10 < stackTraceElementArr.length) {
            StackTraceElement stackTraceElement = stackTraceElementArr[i10];
            Integer num = (Integer) hashMap.get(stackTraceElement);
            if (num != null) {
                int intValue = num.intValue();
                int i12 = i10 - intValue;
                if (i10 + i12 <= stackTraceElementArr.length) {
                    for (int i13 = 0; i13 < i12; i13++) {
                        if (stackTraceElementArr[intValue + i13].equals(stackTraceElementArr[i10 + i13])) {
                        }
                    }
                    int intValue2 = i10 - num.intValue();
                    if (i5 < 10) {
                        System.arraycopy(stackTraceElementArr, i10, stackTraceElementArr2, i11, intValue2);
                        i11 += intValue2;
                        i5++;
                    }
                    i4 = (intValue2 - 1) + i10;
                    hashMap.put(stackTraceElement, Integer.valueOf(i10));
                    i10 = i4 + 1;
                }
            }
            stackTraceElementArr2[i11] = stackTraceElementArr[i10];
            i11++;
            i5 = 1;
            i4 = i10;
            hashMap.put(stackTraceElement, Integer.valueOf(i10));
            i10 = i4 + 1;
        }
        StackTraceElement[] stackTraceElementArr3 = new StackTraceElement[i11];
        System.arraycopy(stackTraceElementArr2, 0, stackTraceElementArr3, 0, i11);
        if (i11 < stackTraceElementArr.length) {
            return stackTraceElementArr3;
        }
        return stackTraceElementArr;
    }

    @Override // com.bumptech.glide.load.resource.bitmap.aa
    public void foxtrot(MediaExtractor mediaExtractor, Object obj) {
        mediaExtractor.setDataSource(((ParcelFileDescriptor) obj).getFileDescriptor());
    }

    @Override // N5.a
    public long getTime() {
        return SystemClock.elapsedRealtime();
    }

    @Override // W7.c
    public W7.b golf(U8.a aVar, JSONObject jSONObject) {
        return november(aVar);
    }

    @Override // H3.a
    public void hotel(E3.f fVar, C1915c c1915c) {
    }

    @Override // av.InterfaceC0684d
    public boolean india(int i4, int i5) {
        return CamcorderProfile.hasProfile(i4, i5);
    }

    @Override // com.bumptech.glide.load.resource.bitmap.aa
    public void juliet(MediaMetadataRetriever mediaMetadataRetriever, Object obj) {
        mediaMetadataRetriever.setDataSource(((ParcelFileDescriptor) obj).getFileDescriptor());
    }

    @Override // Q7.d
    public void kilo(long j5, String str) {
    }

    @Override // J3.s
    public r sierra(x xVar) {
        return new J3.aa(xVar.bravo(h.class, InputStream.class), 1);
    }

    @Override // com.google.android.gms.measurement.internal.aa
    public Object zza() {
        switch (this.alpha) {
            case 20:
                List list = ac.alpha;
                Boolean bool = (Boolean) C1297b3.alpha.bravo();
                bool.getClass();
                return bool;
            case 21:
                List list2 = ac.alpha;
                Boolean bool2 = (Boolean) t3.alpha.bravo();
                bool2.getClass();
                return bool2;
            case 22:
                List list3 = ac.alpha;
                x3.purple.get();
                Boolean bool3 = (Boolean) z3.delta.bravo();
                bool3.getClass();
                return bool3;
            case 23:
                List list4 = ac.alpha;
                C1317f3.purple.get();
                Boolean bool4 = (Boolean) C1327h3.hotel.bravo();
                bool4.getClass();
                return bool4;
            case 24:
                List list5 = ac.alpha;
                Boolean bool5 = (Boolean) C3.alpha.bravo();
                bool5.getClass();
                return bool5;
            case 25:
                List list6 = ac.alpha;
                C1362p2.purple.get();
                return Integer.valueOf((int) ((Long) C1369r2.f6685a.bravo()).longValue());
            case 26:
                List list7 = ac.alpha;
                C1317f3.purple.get();
                Boolean bool6 = (Boolean) C1327h3.golf.bravo();
                bool6.getClass();
                return bool6;
            case 27:
                List list8 = ac.alpha;
                C1362p2.purple.get();
                Long l10 = (Long) C1369r2.bravo.bravo();
                l10.getClass();
                return l10;
            case 28:
                List list9 = ac.alpha;
                C1362p2.purple.get();
                return Integer.valueOf((int) ((Long) C1369r2.gray.bravo()).longValue());
            default:
                List list10 = ac.alpha;
                C1362p2.purple.get();
                Long l11 = (Long) C1369r2.f6694k.bravo();
                l11.getClass();
                return l11;
        }
    }
}
