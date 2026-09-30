package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.content.pm.Signature;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.os.ext.SdkExtensions;
import android.text.TextUtils;
import android.util.Log;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.db.Column;
import com.google.maps.android.BuildConfig;
import com.google.mlkit.vision.barcode.common.Barcode;
import com.zendesk.service.HttpConstants;
import f2.C1689b;
import f2.C1690c;
import g6.C1754b;
import h2.C1803d;
import java.io.ByteArrayInputStream;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Random;
import java.util.TreeSet;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import javax.security.auth.x500.X500Principal;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class d1 extends P {

    /* renamed from: b, reason: collision with root package name */
    public static final String[] f7657b = {"firebase_", "google_", "ga_"};

    /* renamed from: c, reason: collision with root package name */
    public static final String[] f7658c = {"_err"};

    /* renamed from: a, reason: collision with root package name */
    public Integer f7659a;
    public SecureRandom red;
    public final AtomicLong silver;
    public int teal;
    public C1803d white;
    public Boolean yellow;

    public d1(G g2) {
        super(g2);
        this.f7659a = null;
        this.silver = new AtomicLong(0L);
    }

    public static boolean C0(String str, String[] strArr) {
        V5.x.hotel(strArr);
        for (String str2 : strArr) {
            if (Objects.equals(str, str2)) {
                return true;
            }
        }
        return false;
    }

    public static boolean E0(String str) {
        String str2 = (String) ac.f7602j.alpha(null);
        if (!str2.equals("*") && !Arrays.asList(str2.split(Constants.SEPARATOR_COMMA)).contains(str)) {
            return false;
        }
        return true;
    }

    public static boolean N0(Object obj) {
        if (!(obj instanceof Parcelable[]) && !(obj instanceof ArrayList) && !(obj instanceof Bundle)) {
            return false;
        }
        return true;
    }

    public static boolean Q0(String str) {
        if (!TextUtils.isEmpty(str) && str.startsWith("_")) {
            return true;
        }
        return false;
    }

    public static boolean R0(String str) {
        V5.x.echo(str);
        if (str.charAt(0) == '_' && !str.equals("_ep")) {
            return false;
        }
        return true;
    }

    public static boolean S0(Context context) {
        ActivityInfo receiverInfo;
        V5.x.hotel(context);
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (receiverInfo = packageManager.getReceiverInfo(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementReceiver"), 0)) != null) {
                if (receiverInfo.enabled) {
                    return true;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    public static boolean T0(Context context, String str) {
        ServiceInfo serviceInfo;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (serviceInfo = packageManager.getServiceInfo(new ComponentName(context, str), 0)) != null) {
                if (serviceInfo.enabled) {
                    return true;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    public static boolean U0(Context context) {
        V5.x.hotel(context);
        if (Build.VERSION.SDK_INT >= 24) {
            return T0(context, "com.google.android.gms.measurement.AppMeasurementJobService");
        }
        return T0(context, "com.google.android.gms.measurement.AppMeasurementService");
    }

    public static byte[] X0(Parcelable parcelable) {
        if (parcelable == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        try {
            parcelable.writeToParcel(obtain, 0);
            return obtain.marshall();
        } finally {
            obtain.recycle();
        }
    }

    public static final boolean Y0(int i4, Bundle bundle) {
        if (bundle != null && bundle.getLong("_err") == 0) {
            bundle.putLong("_err", i4);
            return true;
        }
        return false;
    }

    public static String g0(String str, int i4, boolean z2) {
        if (str != null) {
            if (str.codePointCount(0, str.length()) > i4) {
                if (z2) {
                    return String.valueOf(str.substring(0, str.offsetByCodePoints(0, i4))).concat("...");
                }
            } else {
                return str;
            }
        }
        return null;
    }

    public static long g1(byte[] bArr) {
        boolean z2;
        V5.x.hotel(bArr);
        int length = bArr.length;
        int i4 = 0;
        if (length > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        V5.x.kilo(z2);
        long j5 = 0;
        for (int i5 = length - 1; i5 >= 0 && i5 >= bArr.length - 8; i5--) {
            j5 += (bArr[i5] & 255) << i4;
            i4 += 8;
        }
        return j5;
    }

    public static MessageDigest h0() {
        MessageDigest messageDigest;
        for (int i4 = 0; i4 < 2; i4++) {
            try {
                messageDigest = MessageDigest.getInstance("MD5");
            } catch (NoSuchAlgorithmException unused) {
            }
            if (messageDigest != null) {
                return messageDigest;
            }
        }
        return null;
    }

    public static ArrayList j0(List list) {
        if (list == null) {
            return new ArrayList(0);
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzai zzaiVar = (zzai) it.next();
            Bundle bundle = new Bundle();
            bundle.putString("app_id", zzaiVar.alpha);
            bundle.putString("origin", zzaiVar.purple);
            bundle.putLong("creation_timestamp", zzaiVar.silver);
            bundle.putString("name", zzaiVar.red.purple);
            Object o5 = zzaiVar.red.o();
            V5.x.hotel(o5);
            W.echo(bundle, o5);
            bundle.putBoolean("active", zzaiVar.teal);
            String str = zzaiVar.white;
            if (str != null) {
                bundle.putString("trigger_event_name", str);
            }
            zzbh zzbhVar = zzaiVar.yellow;
            if (zzbhVar != null) {
                bundle.putString("timed_out_event_name", zzbhVar.alpha);
                zzbf zzbfVar = zzbhVar.purple;
                if (zzbfVar != null) {
                    bundle.putBundle("timed_out_event_params", zzbfVar.o());
                }
            }
            bundle.putLong("trigger_timeout", zzaiVar.f7693a);
            zzbh zzbhVar2 = zzaiVar.f7694b;
            if (zzbhVar2 != null) {
                bundle.putString("triggered_event_name", zzbhVar2.alpha);
                zzbf zzbfVar2 = zzbhVar2.purple;
                if (zzbfVar2 != null) {
                    bundle.putBundle("triggered_event_params", zzbfVar2.o());
                }
            }
            bundle.putLong("triggered_timestamp", zzaiVar.red.red);
            bundle.putLong("time_to_live", zzaiVar.f7695c);
            zzbh zzbhVar3 = zzaiVar.f7696d;
            if (zzbhVar3 != null) {
                bundle.putString("expired_event_name", zzbhVar3.alpha);
                zzbf zzbfVar3 = zzbhVar3.purple;
                if (zzbfVar3 != null) {
                    bundle.putBundle("expired_event_params", zzbfVar3.o());
                }
            }
            arrayList.add(bundle);
        }
        return arrayList;
    }

    public static void m0(C1474v0 c1474v0, Bundle bundle, boolean z2) {
        if (bundle != null && c1474v0 != null) {
            if (bundle.containsKey("_sc") && !z2) {
                z2 = false;
            } else {
                String str = c1474v0.alpha;
                if (str != null) {
                    bundle.putString("_sn", str);
                } else {
                    bundle.remove("_sn");
                }
                String str2 = c1474v0.bravo;
                if (str2 != null) {
                    bundle.putString("_sc", str2);
                } else {
                    bundle.remove("_sc");
                }
                bundle.putLong("_si", c1474v0.charlie);
                return;
            }
        }
        if (bundle != null && c1474v0 == null && z2) {
            bundle.remove("_sn");
            bundle.remove("_sc");
            bundle.remove("_si");
        }
    }

    public static void q0(androidx.core.widget.f fVar, String str, int i4, String str2, String str3, int i5) {
        Bundle bundle = new Bundle();
        Y0(i4, bundle);
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            bundle.putString(str2, str3);
        }
        if (i4 == 6 || i4 == 7 || i4 == 2) {
            bundle.putLong("_el", i5);
        }
        fVar.bronze(str, "_err", bundle);
    }

    public final int A0(String str) {
        boolean equals = "_ldl".equals(str);
        G g2 = (G) this.alpha;
        if (equals) {
            g2.getClass();
            return 2048;
        }
        if (Column.ID.equals(str)) {
            g2.getClass();
            return Barcode.FORMAT_QR_CODE;
        }
        if ("_lgclid".equals(str)) {
            g2.getClass();
            return 100;
        }
        g2.getClass();
        return 36;
    }

    public final Object B0(int i4, Object obj, boolean z2, boolean z10) {
        long j5;
        if (obj != null) {
            if (!(obj instanceof Long)) {
                if (obj instanceof Double) {
                    return obj;
                }
                if (obj instanceof Integer) {
                    return Long.valueOf(((Integer) obj).intValue());
                }
                if (obj instanceof Byte) {
                    return Long.valueOf(((Byte) obj).byteValue());
                }
                if (obj instanceof Short) {
                    return Long.valueOf(((Short) obj).shortValue());
                }
                if (obj instanceof Boolean) {
                    if (true != ((Boolean) obj).booleanValue()) {
                        j5 = 0;
                    } else {
                        j5 = 1;
                    }
                    return Long.valueOf(j5);
                }
                if (obj instanceof Float) {
                    return Double.valueOf(((Float) obj).doubleValue());
                }
                if (!(obj instanceof String) && !(obj instanceof Character) && !(obj instanceof CharSequence)) {
                    if (z10) {
                        if ((obj instanceof Bundle[]) || (obj instanceof Parcelable[])) {
                            ArrayList arrayList = new ArrayList();
                            for (Parcelable parcelable : (Parcelable[]) obj) {
                                if (parcelable instanceof Bundle) {
                                    Bundle j12 = j1((Bundle) parcelable);
                                    if (!j12.isEmpty()) {
                                        arrayList.add(j12);
                                    }
                                }
                            }
                            return arrayList.toArray(new Bundle[arrayList.size()]);
                        }
                        return null;
                    }
                    return null;
                }
                return g0(obj.toString(), i4, z2);
            }
            return obj;
        }
        return null;
    }

    public final void D0(String str, String str2, Bundle bundle, List list, boolean z2) {
        int i4;
        int i5;
        String str3;
        ar arVar;
        String str4;
        int z02;
        List list2 = list;
        if (bundle != null) {
            G g2 = (G) this.alpha;
            d1 d1Var = ((G) g2.yellow.alpha).e;
            G.delta(d1Var);
            if (true != d1Var.P0(231100000)) {
                i4 = 0;
            } else {
                i4 = 35;
            }
            Iterator it = new TreeSet(bundle.keySet()).iterator();
            int i10 = 0;
            boolean z10 = false;
            while (it.hasNext()) {
                String str5 = (String) it.next();
                if (list2 != null && list2.contains(str5)) {
                    i5 = 0;
                } else {
                    if (!z2) {
                        i5 = c1(str5);
                    } else {
                        i5 = 0;
                    }
                    if (i5 == 0) {
                        i5 = b1(str5);
                    }
                }
                if (i5 != 0) {
                    if (i5 == 3) {
                        str3 = str5;
                    } else {
                        str3 = null;
                    }
                    l0(bundle, i5, str5, str3);
                    bundle.remove(str5);
                } else {
                    boolean N02 = N0(bundle.get(str5));
                    ar arVar2 = g2.f7507b;
                    if (N02) {
                        G.foxtrot(arVar2);
                        arVar2.f7634d.delta("Nested Bundle parameters are not allowed; discarded. event name, param name, child param name", str, str2, str5);
                        z02 = 22;
                        arVar = arVar2;
                        str4 = null;
                    } else {
                        arVar = arVar2;
                        str4 = null;
                        z02 = z0(str, str5, bundle.get(str5), bundle, list2, z2, false);
                    }
                    if (z02 != 0 && !"_ev".equals(str5)) {
                        l0(bundle, z02, str5, bundle.get(str5));
                        bundle.remove(str5);
                    } else if (R0(str5) && !C0(str5, W.hotel)) {
                        i10++;
                        boolean P02 = P0(231100000);
                        am amVar = g2.f7510f;
                        if (!P02) {
                            G.foxtrot(arVar);
                            arVar.f7631a.charlie(amVar.delta(str), amVar.bravo(bundle), "Item array not supported on client's version of Google Play Services (Android Only)");
                            Y0(23, bundle);
                            bundle.remove(str5);
                        } else {
                            ar arVar3 = arVar;
                            if (i10 > i4) {
                                if (!g2.yellow.j0(str4, ac.f7605k0) || !z10) {
                                    G.foxtrot(arVar3);
                                    arVar3.f7631a.charlie(amVar.delta(str), amVar.bravo(bundle), "Item can't contain more than " + i4 + " item-scoped custom params");
                                }
                                Y0(28, bundle);
                                bundle.remove(str5);
                                list2 = list;
                                z10 = true;
                            }
                        }
                    }
                }
                list2 = list;
            }
        }
    }

    public final boolean F0(String str, String str2) {
        G g2 = (G) this.alpha;
        boolean j02 = g2.yellow.j0(null, ac.f7601i0);
        String str3 = g2.purple;
        ar arVar = g2.f7507b;
        if (j02) {
            if (!TextUtils.isEmpty(str)) {
                if (!W0(str)) {
                    if (TextUtils.isEmpty(str3)) {
                        G.foxtrot(arVar);
                        arVar.f7631a.bravo(ar.e0(str), "Invalid google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI. provided id");
                        return false;
                    }
                } else {
                    return true;
                }
            } else if (TextUtils.isEmpty(str3)) {
                G.foxtrot(arVar);
                arVar.f7631a.alpha("Missing google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI");
                return false;
            }
        } else if (!TextUtils.isEmpty(str)) {
            if (!W0(str)) {
                if (TextUtils.isEmpty(str3)) {
                    G.foxtrot(arVar);
                    arVar.f7631a.bravo(ar.e0(str), "Invalid google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI. provided id");
                    return false;
                }
            } else {
                return true;
            }
        } else {
            if (!TextUtils.isEmpty(str2)) {
                if (!W0(str2)) {
                    G.foxtrot(arVar);
                    arVar.f7631a.bravo(ar.e0(str2), "Invalid admob_app_id. Analytics disabled.");
                    return false;
                }
                return true;
            }
            if (TextUtils.isEmpty(str3)) {
                G.foxtrot(arVar);
                arVar.f7631a.alpha("Missing google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI");
            }
        }
        return false;
    }

    public final boolean G0(int i4, String str, String str2) {
        G g2 = (G) this.alpha;
        if (str2 == null) {
            ar arVar = g2.f7507b;
            G.foxtrot(arVar);
            arVar.f7631a.bravo(str, "Name is required and can't be null. Type");
            return false;
        }
        if (str2.codePointCount(0, str2.length()) > i4) {
            ar arVar2 = g2.f7507b;
            G.foxtrot(arVar2);
            arVar2.f7631a.delta("Name is too long. Type, maximum supported length, name", str, Integer.valueOf(i4), str2);
            return false;
        }
        return true;
    }

    public final boolean H0(String str, String[] strArr, String[] strArr2, String str2) {
        G g2 = (G) this.alpha;
        if (str2 == null) {
            ar arVar = g2.f7507b;
            G.foxtrot(arVar);
            arVar.f7631a.bravo(str, "Name is required and can't be null. Type");
            return false;
        }
        String[] strArr3 = f7657b;
        for (int i4 = 0; i4 < 3; i4++) {
            if (str2.startsWith(strArr3[i4])) {
                ar arVar2 = g2.f7507b;
                G.foxtrot(arVar2);
                arVar2.f7631a.charlie(str, str2, "Name starts with reserved prefix. Type, name");
                return false;
            }
        }
        if (strArr != null && C0(str2, strArr)) {
            if (strArr2 == null || !C0(str2, strArr2)) {
                ar arVar3 = g2.f7507b;
                G.foxtrot(arVar3);
                arVar3.f7631a.charlie(str, str2, "Name is reserved. Type, name");
                return false;
            }
            return true;
        }
        return true;
    }

    public final boolean I0(String str, String str2, int i4, Object obj) {
        if (obj == null || (obj instanceof Long) || (obj instanceof Float) || (obj instanceof Integer) || (obj instanceof Byte) || (obj instanceof Short) || (obj instanceof Boolean) || (obj instanceof Double)) {
            return true;
        }
        if (!(obj instanceof String) && !(obj instanceof Character) && !(obj instanceof CharSequence)) {
            return false;
        }
        String obj2 = obj.toString();
        if (obj2.codePointCount(0, obj2.length()) > i4) {
            ar arVar = ((G) this.alpha).f7507b;
            G.foxtrot(arVar);
            arVar.f7634d.delta("Value is too long; discarded. Value kind, name, value length", str, str2, Integer.valueOf(obj2.length()));
            return false;
        }
        return true;
    }

    public final boolean J0(String str, String str2) {
        G g2 = (G) this.alpha;
        if (str2 == null) {
            ar arVar = g2.f7507b;
            G.foxtrot(arVar);
            arVar.f7631a.bravo(str, "Name is required and can't be null. Type");
            return false;
        }
        if (str2.length() == 0) {
            ar arVar2 = g2.f7507b;
            G.foxtrot(arVar2);
            arVar2.f7631a.bravo(str, "Name is required and can't be empty. Type");
            return false;
        }
        int codePointAt = str2.codePointAt(0);
        if (!Character.isLetter(codePointAt)) {
            if (codePointAt == 95) {
                codePointAt = 95;
            } else {
                ar arVar3 = g2.f7507b;
                G.foxtrot(arVar3);
                arVar3.f7631a.charlie(str, str2, "Name must start with a letter or _ (underscore). Type, name");
                return false;
            }
        }
        int length = str2.length();
        int charCount = Character.charCount(codePointAt);
        while (charCount < length) {
            int codePointAt2 = str2.codePointAt(charCount);
            if (codePointAt2 != 95 && !Character.isLetterOrDigit(codePointAt2)) {
                ar arVar4 = g2.f7507b;
                G.foxtrot(arVar4);
                arVar4.f7631a.charlie(str, str2, "Name must consist of letters, digits or _ (underscores). Type, name");
                return false;
            }
            charCount += Character.charCount(codePointAt2);
        }
        return true;
    }

    public final boolean K0(String str, String str2) {
        G g2 = (G) this.alpha;
        if (str2 == null) {
            ar arVar = g2.f7507b;
            G.foxtrot(arVar);
            arVar.f7631a.bravo(str, "Name is required and can't be null. Type");
            return false;
        }
        if (str2.length() == 0) {
            ar arVar2 = g2.f7507b;
            G.foxtrot(arVar2);
            arVar2.f7631a.bravo(str, "Name is required and can't be empty. Type");
            return false;
        }
        int codePointAt = str2.codePointAt(0);
        if (!Character.isLetter(codePointAt)) {
            ar arVar3 = g2.f7507b;
            G.foxtrot(arVar3);
            arVar3.f7631a.charlie(str, str2, "Name must start with a letter. Type, name");
            return false;
        }
        int length = str2.length();
        int charCount = Character.charCount(codePointAt);
        while (charCount < length) {
            int codePointAt2 = str2.codePointAt(charCount);
            if (codePointAt2 != 95 && !Character.isLetterOrDigit(codePointAt2)) {
                ar arVar4 = g2.f7507b;
                G.foxtrot(arVar4);
                arVar4.f7631a.charlie(str, str2, "Name must consist of letters, digits or _ (underscores). Type, name");
                return false;
            }
            charCount += Character.charCount(codePointAt2);
        }
        return true;
    }

    public final boolean L0(String str) {
        W();
        G g2 = (G) this.alpha;
        if (C1754b.alpha(g2.alpha).purple.checkCallingOrSelfPermission(str) == 0) {
            return true;
        }
        ar arVar = g2.f7507b;
        G.foxtrot(arVar);
        arVar.f7635f.bravo(str, "Permission not granted");
        return false;
    }

    public final boolean M0(String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            return true;
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return ((G) this.alpha).yellow.a0("debug.firebase.analytics.app").equals(str);
    }

    public final boolean O0(Context context, String str) {
        Signature[] signatureArr;
        G g2 = (G) this.alpha;
        X500Principal x500Principal = new X500Principal("CN=Android Debug,O=Android,C=US");
        try {
            PackageInfo charlie = C1754b.alpha(context).charlie(64, str);
            if (charlie != null && (signatureArr = charlie.signatures) != null && signatureArr.length > 0) {
                return ((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(signatureArr[0].toByteArray()))).getSubjectX500Principal().equals(x500Principal);
            }
            return true;
        } catch (PackageManager.NameNotFoundException e) {
            ar arVar = g2.f7507b;
            G.foxtrot(arVar);
            arVar.white.bravo(e, "Package name not found");
            return true;
        } catch (CertificateException e4) {
            ar arVar2 = g2.f7507b;
            G.foxtrot(arVar2);
            arVar2.white.bravo(e4, "Error obtaining certificate");
            return true;
        }
    }

    public final boolean P0(int i4) {
        Boolean bool = ((G) this.alpha).mike().teal;
        if (e1() < i4 / 1000) {
            if (bool == null || bool.booleanValue()) {
                return false;
            }
            return true;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x007f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0080 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean V0(String str, String str2, String str3, String str4) {
        if (((G) this.alpha).yellow.j0(null, ac.f7601i0)) {
            boolean isEmpty = TextUtils.isEmpty(str);
            boolean isEmpty2 = TextUtils.isEmpty(str2);
            if (!isEmpty && !isEmpty2) {
                V5.x.hotel(str);
                if (!str.equals(str2)) {
                    return true;
                }
            }
            return false;
        }
        boolean isEmpty3 = TextUtils.isEmpty(str);
        boolean isEmpty4 = TextUtils.isEmpty(str2);
        if (!isEmpty3 && !isEmpty4) {
            V5.x.hotel(str);
            if (!str.equals(str2)) {
            }
        } else {
            if (!isEmpty3 || !isEmpty4 ? !(isEmpty3 ? TextUtils.isEmpty(str3) || !str3.equals(str4) : !TextUtils.isEmpty(str4) && (TextUtils.isEmpty(str3) || !str3.equals(str4))) : !(TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4) ? !TextUtils.isEmpty(str4) : !str3.equals(str4))) {
                return false;
            }
            return true;
        }
    }

    public final boolean W0(String str) {
        String str2;
        V5.x.hotel(str);
        if (true != ((G) this.alpha).yellow.j0(null, ac.f7601i0)) {
            str2 = "^(1:\\d+:android:[a-f0-9]+|ca-app-pub-.*)$";
        } else {
            str2 = "^1:\\d+:android:[a-f0-9]+$";
        }
        return str.matches(str2);
    }

    @Override // com.google.android.gms.measurement.internal.P
    public final boolean X() {
        return true;
    }

    public final int Z0(Object obj, String str) {
        boolean I02;
        if ("_ldl".equals(str)) {
            I02 = I0("user property referrer", str, A0(str), obj);
        } else {
            I02 = I0("user property", str, A0(str), obj);
        }
        if (I02) {
            return 0;
        }
        return 7;
    }

    public final Bundle a0(String str, Bundle bundle, List list, boolean z2) {
        int i4;
        int i5;
        String str2;
        String str3;
        List list2 = list;
        boolean C02 = C0(str, W.delta);
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = new Bundle(bundle);
        G g2 = (G) this.alpha;
        d1 d1Var = ((G) g2.yellow.alpha).e;
        G.delta(d1Var);
        if (d1Var.P0(201500000)) {
            i4 = 100;
        } else {
            i4 = 25;
        }
        int i10 = i4;
        Iterator it = new TreeSet(bundle.keySet()).iterator();
        int i11 = 0;
        boolean z10 = false;
        while (it.hasNext()) {
            String str4 = (String) it.next();
            if (list2 != null && list2.contains(str4)) {
                i5 = 0;
            } else {
                if (!z2) {
                    i5 = c1(str4);
                } else {
                    i5 = 0;
                }
                if (i5 == 0) {
                    i5 = b1(str4);
                }
            }
            if (i5 != 0) {
                if (i5 == 3) {
                    str3 = str4;
                } else {
                    str3 = null;
                }
                l0(bundle2, i5, str4, str3);
                bundle2.remove(str4);
            } else {
                int z02 = z0(str, str4, bundle.get(str4), bundle2, list2, z2, C02);
                if (z02 == 17) {
                    l0(bundle2, 17, str4, Boolean.FALSE);
                } else if (z02 != 0 && !"_ev".equals(str4)) {
                    if (z02 == 21) {
                        str2 = str;
                    } else {
                        str2 = str4;
                    }
                    l0(bundle2, z02, str2, bundle.get(str4));
                    bundle2.remove(str4);
                }
                if (R0(str4) && (i11 = i11 + 1) > i10) {
                    if (!g2.yellow.j0(null, ac.f7605k0) || !z10) {
                        String delta = av.q.delta(i10, "Event can't contain more than ", " params");
                        ar arVar = g2.f7507b;
                        G.foxtrot(arVar);
                        am amVar = g2.f7510f;
                        arVar.f7631a.charlie(amVar.delta(str), amVar.bravo(bundle), delta);
                    }
                    Y0(5, bundle2);
                    bundle2.remove(str4);
                    z10 = true;
                }
            }
            list2 = list;
        }
        return bundle2;
    }

    public final int a1(String str) {
        if (!J0(com.clevertap.android.sdk.leanplum.Constants.CHARGED_EVENT_PARAM, str)) {
            return 2;
        }
        if (!H0(com.clevertap.android.sdk.leanplum.Constants.CHARGED_EVENT_PARAM, W.alpha, W.bravo, str)) {
            return 13;
        }
        ((G) this.alpha).getClass();
        if (!G0(40, com.clevertap.android.sdk.leanplum.Constants.CHARGED_EVENT_PARAM, str)) {
            return 2;
        }
        return 0;
    }

    public final C1803d b0() {
        int i4;
        int i5;
        int alpha;
        i2.e eVar;
        Object obj;
        if (this.white == null) {
            Context context = ((G) this.alpha).alpha;
            Intrinsics.echo(context, "context");
            StringBuilder sb2 = new StringBuilder("AdServicesInfo.version=");
            int i10 = Build.VERSION.SDK_INT;
            C1690c c1690c = C1690c.alpha;
            int i11 = 0;
            if (i10 >= 33) {
                i4 = c1690c.alpha();
            } else {
                i4 = 0;
            }
            sb2.append(i4);
            Log.d("MeasurementManager", sb2.toString());
            if (i10 >= 33) {
                i5 = c1690c.alpha();
            } else {
                i5 = 0;
            }
            C1803d c1803d = null;
            if (i5 >= 5) {
                Object systemService = context.getSystemService((Class<Object>) E0.a.papa());
                Intrinsics.delta(systemService, "context.getSystemService…ementManager::class.java)");
                eVar = new i2.e(i2.c.golf(systemService));
            } else {
                C1689b c1689b = C1689b.alpha;
                if (i10 != 31 && i10 != 32) {
                    alpha = 0;
                } else {
                    alpha = c1689b.alpha();
                }
                if (alpha >= 9) {
                    try {
                        obj = new bo.d(context, 1).invoke(context);
                    } catch (NoClassDefFoundError unused) {
                        StringBuilder sb3 = new StringBuilder("Unable to find adservices code, check manifest for uses-library tag, versionS=");
                        int i12 = Build.VERSION.SDK_INT;
                        if (i12 == 31 || i12 == 32) {
                            i11 = c1689b.alpha();
                        }
                        sb3.append(i11);
                        Log.d("MeasurementManager", sb3.toString());
                        obj = null;
                    }
                    eVar = (i2.e) obj;
                } else {
                    eVar = null;
                }
            }
            if (eVar != null) {
                c1803d = new C1803d(eVar);
            }
            this.white = c1803d;
        }
        return this.white;
    }

    public final int b1(String str) {
        if (!J0("event param", str)) {
            return 3;
        }
        if (!H0("event param", null, null, str)) {
            return 14;
        }
        ((G) this.alpha).getClass();
        if (!G0(40, "event param", str)) {
            return 3;
        }
        return 0;
    }

    public final zzbh c0(String str, Bundle bundle, String str2, long j5, boolean z2) {
        Bundle bundle2;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (a1(str) == 0) {
            if (bundle != null) {
                bundle2 = new Bundle(bundle);
            } else {
                bundle2 = new Bundle();
            }
            bundle2.putString("_o", str2);
            Bundle a02 = a0(str, bundle2, Collections.singletonList("_o"), true);
            if (z2) {
                a02 = j1(a02);
            }
            V5.x.hotel(a02);
            return new zzbh(str, new zzbf(a02), str2, j5);
        }
        G g2 = (G) this.alpha;
        ar arVar = g2.f7507b;
        G.foxtrot(arVar);
        arVar.white.bravo(g2.f7510f.foxtrot(str), "Invalid conditional property event name");
        throw new IllegalArgumentException();
    }

    public final int c1(String str) {
        if (!K0("event param", str)) {
            return 3;
        }
        if (!H0("event param", null, null, str)) {
            return 14;
        }
        ((G) this.alpha).getClass();
        if (!G0(40, "event param", str)) {
            return 3;
        }
        return 0;
    }

    public final Object d0(Object obj, String str) {
        boolean equals = "_ev".equals(str);
        int i4 = HttpConstants.HTTP_INTERNAL_ERROR;
        G g2 = (G) this.alpha;
        if (equals) {
            g2.yellow.getClass();
            return B0(Math.max(HttpConstants.HTTP_INTERNAL_ERROR, Barcode.FORMAT_QR_CODE), obj, true, true);
        }
        if (Q0(str)) {
            g2.yellow.getClass();
            i4 = Math.max(HttpConstants.HTTP_INTERNAL_ERROR, Barcode.FORMAT_QR_CODE);
        } else {
            g2.yellow.getClass();
        }
        return B0(i4, obj, false, true);
    }

    public final int d1(String str) {
        if (!J0("user property", str)) {
            return 6;
        }
        if (!H0("user property", W.india, null, str)) {
            return 15;
        }
        ((G) this.alpha).getClass();
        if (!G0(24, "user property", str)) {
            return 6;
        }
        return 0;
    }

    public final Object e0(Object obj, String str) {
        if ("_ldl".equals(str)) {
            return B0(A0(str), obj, true, false);
        }
        return B0(A0(str), obj, false, false);
    }

    public final int e1() {
        if (this.f7659a == null) {
            this.f7659a = Integer.valueOf(com.google.android.gms.common.d.getInstance().getApkVersion(((G) this.alpha).alpha) / 1000);
        }
        return this.f7659a.intValue();
    }

    public final String f0() {
        byte[] bArr = new byte[16];
        i0().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new BigInteger(1, bArr));
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long f1() {
        int extensionVersion;
        int i4;
        long j5;
        int extensionVersion2;
        Object e;
        Integer num;
        W();
        G g2 = (G) this.alpha;
        aj india = g2.india();
        ar arVar = g2.f7507b;
        if (!E0(india.c0())) {
            return 0L;
        }
        int i5 = Build.VERSION.SDK_INT;
        boolean z2 = false;
        Integer num2 = null;
        if (i5 >= 30) {
            extensionVersion = SdkExtensions.getExtensionVersion(30);
            if (extensionVersion < 4) {
                j5 = 8;
            } else {
                if (i5 >= 30) {
                    extensionVersion2 = SdkExtensions.getExtensionVersion(30);
                    if (extensionVersion2 > 3) {
                        i4 = SdkExtensions.getExtensionVersion(1000000);
                        if (i4 >= ((Integer) ac.f7591d.alpha(null)).intValue()) {
                            j5 = 16;
                        } else {
                            j5 = 0;
                        }
                    }
                }
                i4 = 0;
                if (i4 >= ((Integer) ac.f7591d.alpha(null)).intValue()) {
                }
            }
        } else {
            j5 = 4;
        }
        if (!L0("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")) {
            j5 |= 2;
        }
        if (j5 == 0) {
            if (this.yellow == null) {
                C1803d b02 = b0();
                if (b02 != null) {
                    try {
                        num = (Integer) b02.bravo().get(10000L, TimeUnit.MILLISECONDS);
                        if (num != null) {
                            try {
                                if (num.intValue() == 1) {
                                    z2 = true;
                                }
                            } catch (InterruptedException e4) {
                                e = e4;
                                num2 = num;
                                G.foxtrot(arVar);
                                arVar.f7632b.bravo(e, "Measurement manager api exception");
                                this.yellow = Boolean.FALSE;
                                num = num2;
                                G.foxtrot(arVar);
                                arVar.f7636g.bravo(num, "Measurement manager api status result");
                                z2 = this.yellow.booleanValue();
                                if (!z2) {
                                }
                                if (j5 == 0) {
                                }
                            } catch (CancellationException e5) {
                                e = e5;
                                num2 = num;
                                G.foxtrot(arVar);
                                arVar.f7632b.bravo(e, "Measurement manager api exception");
                                this.yellow = Boolean.FALSE;
                                num = num2;
                                G.foxtrot(arVar);
                                arVar.f7636g.bravo(num, "Measurement manager api status result");
                                z2 = this.yellow.booleanValue();
                                if (!z2) {
                                }
                                if (j5 == 0) {
                                }
                            } catch (ExecutionException e10) {
                                e = e10;
                                num2 = num;
                                G.foxtrot(arVar);
                                arVar.f7632b.bravo(e, "Measurement manager api exception");
                                this.yellow = Boolean.FALSE;
                                num = num2;
                                G.foxtrot(arVar);
                                arVar.f7636g.bravo(num, "Measurement manager api status result");
                                z2 = this.yellow.booleanValue();
                                if (!z2) {
                                }
                                if (j5 == 0) {
                                }
                            } catch (TimeoutException e11) {
                                e = e11;
                                num2 = num;
                                G.foxtrot(arVar);
                                arVar.f7632b.bravo(e, "Measurement manager api exception");
                                this.yellow = Boolean.FALSE;
                                num = num2;
                                G.foxtrot(arVar);
                                arVar.f7636g.bravo(num, "Measurement manager api status result");
                                z2 = this.yellow.booleanValue();
                                if (!z2) {
                                }
                                if (j5 == 0) {
                                }
                            }
                        }
                        this.yellow = Boolean.valueOf(z2);
                    } catch (InterruptedException | CancellationException | ExecutionException | TimeoutException e12) {
                        e = e12;
                    }
                    G.foxtrot(arVar);
                    arVar.f7636g.bravo(num, "Measurement manager api status result");
                }
                if (!z2) {
                    j5 = 64;
                }
            }
            z2 = this.yellow.booleanValue();
            if (!z2) {
            }
        }
        if (j5 == 0) {
            return 1L;
        }
        return j5;
    }

    public final long h1() {
        long andIncrement;
        long j5;
        AtomicLong atomicLong = this.silver;
        if (atomicLong.get() == 0) {
            synchronized (atomicLong) {
                long nanoTime = System.nanoTime();
                ((G) this.alpha).f7511g.getClass();
                long nextLong = new Random(nanoTime ^ System.currentTimeMillis()).nextLong();
                int i4 = this.teal + 1;
                this.teal = i4;
                j5 = nextLong + i4;
            }
            return j5;
        }
        AtomicLong atomicLong2 = this.silver;
        synchronized (atomicLong2) {
            atomicLong2.compareAndSet(-1L, 1L);
            andIncrement = atomicLong2.getAndIncrement();
        }
        return andIncrement;
    }

    public final SecureRandom i0() {
        W();
        if (this.red == null) {
            this.red = new SecureRandom();
        }
        return this.red;
    }

    public final Bundle i1(Uri uri) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        if (uri == null) {
            return null;
        }
        try {
            if (uri.isHierarchical()) {
                str = uri.getQueryParameter("utm_campaign");
                str2 = uri.getQueryParameter("utm_source");
                str3 = uri.getQueryParameter("utm_medium");
                str4 = uri.getQueryParameter("gclid");
                str5 = uri.getQueryParameter("gbraid");
                str6 = uri.getQueryParameter("utm_id");
                str7 = uri.getQueryParameter("dclid");
                str8 = uri.getQueryParameter("srsltid");
                str9 = uri.getQueryParameter("sfmc_id");
            } else {
                str = null;
                str2 = null;
                str3 = null;
                str4 = null;
                str5 = null;
                str6 = null;
                str7 = null;
                str8 = null;
                str9 = null;
            }
            if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2) && TextUtils.isEmpty(str3) && TextUtils.isEmpty(str4) && TextUtils.isEmpty(str5) && TextUtils.isEmpty(str6) && TextUtils.isEmpty(str7) && TextUtils.isEmpty(str8) && TextUtils.isEmpty(str9)) {
                return null;
            }
            Bundle bundle = new Bundle();
            if (!TextUtils.isEmpty(str)) {
                str10 = "sfmc_id";
                bundle.putString("campaign", str);
            } else {
                str10 = "sfmc_id";
            }
            if (!TextUtils.isEmpty(str2)) {
                bundle.putString("source", str2);
            }
            if (!TextUtils.isEmpty(str3)) {
                bundle.putString("medium", str3);
            }
            if (!TextUtils.isEmpty(str4)) {
                bundle.putString("gclid", str4);
            }
            if (!TextUtils.isEmpty(str5)) {
                bundle.putString("gbraid", str5);
            }
            String queryParameter = uri.getQueryParameter("gad_source");
            if (!TextUtils.isEmpty(queryParameter)) {
                bundle.putString("gad_source", queryParameter);
            }
            String queryParameter2 = uri.getQueryParameter("utm_term");
            if (!TextUtils.isEmpty(queryParameter2)) {
                bundle.putString("term", queryParameter2);
            }
            String queryParameter3 = uri.getQueryParameter("utm_content");
            if (!TextUtils.isEmpty(queryParameter3)) {
                bundle.putString(Constants.KEY_CONTENT, queryParameter3);
            }
            String queryParameter4 = uri.getQueryParameter("aclid");
            if (!TextUtils.isEmpty(queryParameter4)) {
                bundle.putString("aclid", queryParameter4);
            }
            String queryParameter5 = uri.getQueryParameter("cp1");
            if (!TextUtils.isEmpty(queryParameter5)) {
                bundle.putString("cp1", queryParameter5);
            }
            String queryParameter6 = uri.getQueryParameter("anid");
            if (!TextUtils.isEmpty(queryParameter6)) {
                bundle.putString("anid", queryParameter6);
            }
            if (!TextUtils.isEmpty(str6)) {
                bundle.putString("campaign_id", str6);
            }
            if (!TextUtils.isEmpty(str7)) {
                bundle.putString("dclid", str7);
            }
            String queryParameter7 = uri.getQueryParameter("utm_source_platform");
            if (!TextUtils.isEmpty(queryParameter7)) {
                bundle.putString("source_platform", queryParameter7);
            }
            String queryParameter8 = uri.getQueryParameter("utm_creative_format");
            if (!TextUtils.isEmpty(queryParameter8)) {
                bundle.putString("creative_format", queryParameter8);
            }
            String queryParameter9 = uri.getQueryParameter("utm_marketing_tactic");
            if (!TextUtils.isEmpty(queryParameter9)) {
                bundle.putString("marketing_tactic", queryParameter9);
            }
            if (!TextUtils.isEmpty(str8)) {
                bundle.putString("srsltid", str8);
            }
            if (!TextUtils.isEmpty(str9)) {
                bundle.putString(str10, str9);
            }
            return bundle;
        } catch (UnsupportedOperationException e) {
            ar arVar = ((G) this.alpha).f7507b;
            G.foxtrot(arVar);
            arVar.f7632b.bravo(e, "Install referrer url isn't a hierarchical URI");
            return null;
        }
    }

    public final Bundle j1(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                Object d02 = d0(bundle.get(str), str);
                if (d02 == null) {
                    G g2 = (G) this.alpha;
                    ar arVar = g2.f7507b;
                    G.foxtrot(arVar);
                    arVar.f7634d.bravo(g2.f7510f.echo(str), "Param value can't be null");
                } else {
                    r0(bundle2, str, d02);
                }
            }
        }
        return bundle2;
    }

    public final void k0(Bundle bundle, long j5) {
        long j6 = bundle.getLong("_et");
        if (j6 != 0) {
            ar arVar = ((G) this.alpha).f7507b;
            G.foxtrot(arVar);
            arVar.f7632b.bravo(Long.valueOf(j6), "Params already contained engagement");
        } else {
            j6 = 0;
        }
        bundle.putLong("_et", j5 + j6);
    }

    public final void l0(Bundle bundle, int i4, String str, Object obj) {
        if (Y0(i4, bundle)) {
            ((G) this.alpha).getClass();
            bundle.putString("_ev", g0(str, 40, true));
            if (obj != null) {
                if ((obj instanceof String) || (obj instanceof CharSequence)) {
                    bundle.putLong("_el", obj.toString().length());
                }
            }
        }
    }

    public final void n0(Bundle bundle, Bundle bundle2) {
        if (bundle2 != null) {
            for (String str : bundle2.keySet()) {
                if (!bundle.containsKey(str)) {
                    d1 d1Var = ((G) this.alpha).e;
                    G.delta(d1Var);
                    d1Var.r0(bundle, str, bundle2.get(str));
                }
            }
        }
    }

    public final void o0(Parcelable[] parcelableArr, int i4) {
        V5.x.hotel(parcelableArr);
        for (Parcelable parcelable : parcelableArr) {
            Bundle bundle = (Bundle) parcelable;
            Iterator it = new TreeSet(bundle.keySet()).iterator();
            int i5 = 0;
            boolean z2 = false;
            while (it.hasNext()) {
                String str = (String) it.next();
                if (R0(str) && !C0(str, W.hotel) && (i5 = i5 + 1) > i4) {
                    G g2 = (G) this.alpha;
                    if (!g2.yellow.j0(null, ac.f7605k0) || !z2) {
                        ar arVar = g2.f7507b;
                        G.foxtrot(arVar);
                        am amVar = g2.f7510f;
                        arVar.f7631a.charlie(amVar.echo(str), amVar.bravo(bundle), "Param can't contain more than " + i4 + " item-scoped custom parameters");
                    }
                    Y0(28, bundle);
                    bundle.remove(str);
                    z2 = true;
                }
            }
        }
    }

    public final void p0(Nb.i iVar, int i4) {
        Bundle bundle = (Bundle) iVar.teal;
        Iterator it = new TreeSet(bundle.keySet()).iterator();
        int i5 = 0;
        boolean z2 = false;
        while (it.hasNext()) {
            String str = (String) it.next();
            if (R0(str) && (i5 = i5 + 1) > i4) {
                G g2 = (G) this.alpha;
                if (!g2.yellow.j0(null, ac.f7605k0) || !z2) {
                    String delta = av.q.delta(i4, "Event can't contain more than ", " params");
                    ar arVar = g2.f7507b;
                    G.foxtrot(arVar);
                    am amVar = g2.f7510f;
                    arVar.f7631a.charlie(amVar.delta((String) iVar.red), amVar.bravo(bundle), delta);
                    Y0(5, bundle);
                }
                bundle.remove(str);
                z2 = true;
            }
        }
    }

    public final void r0(Bundle bundle, String str, Object obj) {
        String str2;
        if (bundle != null) {
            if (obj instanceof Long) {
                bundle.putLong(str, ((Long) obj).longValue());
                return;
            }
            if (obj instanceof String) {
                bundle.putString(str, String.valueOf(obj));
                return;
            }
            if (obj instanceof Double) {
                bundle.putDouble(str, ((Double) obj).doubleValue());
                return;
            }
            if (obj instanceof Bundle[]) {
                bundle.putParcelableArray(str, (Bundle[]) obj);
                return;
            }
            if (str != null) {
                if (obj != null) {
                    str2 = obj.getClass().getSimpleName();
                } else {
                    str2 = null;
                }
                G g2 = (G) this.alpha;
                ar arVar = g2.f7507b;
                G.foxtrot(arVar);
                arVar.f7634d.charlie(g2.f7510f.echo(str), str2, "Not putting event parameter. Invalid value type. name, type");
            }
        }
    }

    public final void s0(com.google.android.gms.internal.measurement.ao aoVar, boolean z2) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("r", z2);
        try {
            aoVar.november(bundle);
        } catch (RemoteException e) {
            ar arVar = ((G) this.alpha).f7507b;
            G.foxtrot(arVar);
            arVar.f7632b.bravo(e, "Error returning boolean value to wrapper");
        }
    }

    public final void t0(com.google.android.gms.internal.measurement.ao aoVar, ArrayList arrayList) {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("r", arrayList);
        try {
            aoVar.november(bundle);
        } catch (RemoteException e) {
            ar arVar = ((G) this.alpha).f7507b;
            G.foxtrot(arVar);
            arVar.f7632b.bravo(e, "Error returning bundle list to wrapper");
        }
    }

    public final void u0(com.google.android.gms.internal.measurement.ao aoVar, Bundle bundle) {
        try {
            aoVar.november(bundle);
        } catch (RemoteException e) {
            ar arVar = ((G) this.alpha).f7507b;
            G.foxtrot(arVar);
            arVar.f7632b.bravo(e, "Error returning bundle value to wrapper");
        }
    }

    public final void v0(com.google.android.gms.internal.measurement.ao aoVar, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("r", bArr);
        try {
            aoVar.november(bundle);
        } catch (RemoteException e) {
            ar arVar = ((G) this.alpha).f7507b;
            G.foxtrot(arVar);
            arVar.f7632b.bravo(e, "Error returning byte array to wrapper");
        }
    }

    public final void w0(com.google.android.gms.internal.measurement.ao aoVar, int i4) {
        Bundle bundle = new Bundle();
        bundle.putInt("r", i4);
        try {
            aoVar.november(bundle);
        } catch (RemoteException e) {
            ar arVar = ((G) this.alpha).f7507b;
            G.foxtrot(arVar);
            arVar.f7632b.bravo(e, "Error returning int value to wrapper");
        }
    }

    public final void x0(com.google.android.gms.internal.measurement.ao aoVar, long j5) {
        Bundle bundle = new Bundle();
        bundle.putLong("r", j5);
        try {
            aoVar.november(bundle);
        } catch (RemoteException e) {
            ar arVar = ((G) this.alpha).f7507b;
            G.foxtrot(arVar);
            arVar.f7632b.bravo(e, "Error returning long value to wrapper");
        }
    }

    public final void y0(String str, com.google.android.gms.internal.measurement.ao aoVar) {
        Bundle bundle = new Bundle();
        bundle.putString("r", str);
        try {
            aoVar.november(bundle);
        } catch (RemoteException e) {
            ar arVar = ((G) this.alpha).f7507b;
            G.foxtrot(arVar);
            arVar.f7632b.bravo(e, "Error returning string value to wrapper");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00c8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int z0(String str, String str2, Object obj, Bundle bundle, List list, boolean z2, boolean z10) {
        int i4;
        boolean Q02;
        int i5;
        Object obj2;
        int size;
        W();
        boolean N02 = N0(obj);
        G g2 = (G) this.alpha;
        int i10 = 0;
        if (N02) {
            if (z10) {
                if (!C0(str2, W.golf)) {
                    return 20;
                }
                H0 mike = g2.mike();
                mike.W();
                mike.X();
                if (mike.j0()) {
                    d1 d1Var = ((G) mike.alpha).e;
                    G.delta(d1Var);
                    if (d1Var.e1() < 200900) {
                        return 25;
                    }
                }
                boolean z11 = obj instanceof Parcelable[];
                if (z11) {
                    size = ((Parcelable[]) obj).length;
                } else if (obj instanceof ArrayList) {
                    size = ((ArrayList) obj).size();
                }
                if (size > 200) {
                    ar arVar = g2.f7507b;
                    G.foxtrot(arVar);
                    arVar.f7634d.delta("Parameter array is too long; discarded. Value kind, name, array length", "param", str2, Integer.valueOf(size));
                    i4 = 17;
                    if (z11) {
                        Parcelable[] parcelableArr = (Parcelable[]) obj;
                        if (parcelableArr.length > 200) {
                            bundle.putParcelableArray(str2, (Parcelable[]) Arrays.copyOf(parcelableArr, 200));
                        }
                    } else if (obj instanceof ArrayList) {
                        ArrayList arrayList = (ArrayList) obj;
                        if (arrayList.size() > 200) {
                            bundle.putParcelableArrayList(str2, new ArrayList<>(arrayList.subList(0, 200)));
                        }
                    }
                    Q02 = Q0(str);
                    i5 = HttpConstants.HTTP_INTERNAL_ERROR;
                    if (Q02 && !Q0(str2)) {
                        g2.yellow.getClass();
                    } else {
                        g2.yellow.getClass();
                        i5 = Math.max(HttpConstants.HTTP_INTERNAL_ERROR, Barcode.FORMAT_QR_CODE);
                    }
                    if (!I0("param", str2, i5, obj)) {
                        if (z10) {
                            if (obj instanceof Bundle) {
                                D0(str, str2, (Bundle) obj, list, z2);
                                return i4;
                            }
                            if (obj instanceof Parcelable[]) {
                                Parcelable[] parcelableArr2 = (Parcelable[]) obj;
                                int length = parcelableArr2.length;
                                while (i10 < length) {
                                    Parcelable parcelable = parcelableArr2[i10];
                                    if (!(parcelable instanceof Bundle)) {
                                        ar arVar2 = g2.f7507b;
                                        G.foxtrot(arVar2);
                                        arVar2.f7634d.charlie(parcelable.getClass(), str2, "All Parcelable[] elements must be of type Bundle. Value type, name");
                                        return 4;
                                    }
                                    D0(str, str2, (Bundle) parcelable, list, z2);
                                    i10++;
                                }
                            } else if (obj instanceof ArrayList) {
                                ArrayList arrayList2 = (ArrayList) obj;
                                int size2 = arrayList2.size();
                                while (i10 < size2) {
                                    Object obj3 = arrayList2.get(i10);
                                    if (!(obj3 instanceof Bundle)) {
                                        ar arVar3 = g2.f7507b;
                                        G.foxtrot(arVar3);
                                        if (obj3 != null) {
                                            obj2 = obj3.getClass();
                                        } else {
                                            obj2 = BuildConfig.TRAVIS;
                                        }
                                        arVar3.f7634d.charlie(obj2, str2, "All ArrayList elements must be of type Bundle. Value type, name");
                                        return 4;
                                    }
                                    D0(str, str2, (Bundle) obj3, list, z2);
                                    i10++;
                                }
                            } else {
                                return 4;
                            }
                        } else {
                            return 4;
                        }
                    }
                    return i4;
                }
            } else {
                return 21;
            }
        }
        i4 = 0;
        Q02 = Q0(str);
        i5 = HttpConstants.HTTP_INTERNAL_ERROR;
        if (Q02) {
        }
        g2.yellow.getClass();
        i5 = Math.max(HttpConstants.HTTP_INTERNAL_ERROR, Barcode.FORMAT_QR_CODE);
        if (!I0("param", str2, i5, obj)) {
        }
        return i4;
    }
}
