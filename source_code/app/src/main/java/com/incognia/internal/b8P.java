package com.incognia.internal;

import android.net.NetworkInfo;
import android.net.TrafficStats;
import android.os.SystemClock;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.google.mlkit.vision.barcode.common.Barcode;
import h9.C1823a;
import h9.ae;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.URLConnection;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import kotlin.Lazy;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.json.JSONException;
import org.json.JSONObject;
import s6.AbstractC2707l6;

/* loaded from: classes2.dex */
public final class b8P {

    /* renamed from: R, reason: collision with root package name */
    public static final byte[] f10148R = new byte[0];

    /* renamed from: J, reason: collision with root package name */
    public final W6 f10149J;
    public final uyN PqK;

    /* renamed from: V, reason: collision with root package name */
    public final AWI f10150V;

    /* renamed from: W, reason: collision with root package name */
    public final Lambda f10151W;

    /* renamed from: b, reason: collision with root package name */
    public final String f10152b;

    /* renamed from: f9, reason: collision with root package name */
    public final Function1 f10153f9;
    public final fP1 gmP;
    public final U8s olU;
    public final pl2 sVU;

    /* JADX WARN: Multi-variable type inference failed */
    public b8P(String str, Function1 function1, Function1 function12, pl2 pl2Var, fP1 fp1, W6 w62, uyN uyn, AWI awi, U8s u8s) {
        this.f10152b = str;
        this.f10151W = (Lambda) function1;
        this.f10153f9 = function12;
        this.sVU = pl2Var;
        this.gmP = fp1;
        this.f10149J = w62;
        this.PqK = uyn;
        this.f10150V = awi;
        this.olU = u8s;
        pl2Var.b(new C1823a(5));
    }

    public static final void b() {
        try {
            TrafficStats.setThreadStatsTag((int) Thread.currentThread().getId());
        } catch (Throwable unused) {
        }
    }

    public final void b(Object obj, boolean z2, Map map, APn aPn, e7L e7l) {
        this.sVU.b(new ae(this, e7l, map, obj, z2, aPn));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0096 A[Catch: all -> 0x0025, TryCatch #2 {all -> 0x0025, blocks: (B:3:0x0003, B:5:0x000d, B:7:0x001a, B:9:0x0022, B:11:0x003a, B:15:0x0047, B:16:0x004b, B:18:0x007d, B:22:0x0096, B:23:0x00a9, B:25:0x00ad, B:27:0x00b3, B:28:0x00b6, B:115:0x0028, B:117:0x0030), top: B:2:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00e7 A[Catch: all -> 0x00fd, LOOP:0: B:32:0x00e1->B:34:0x00e7, LOOP_END, TryCatch #5 {all -> 0x00fd, blocks: (B:31:0x00cb, B:32:0x00e1, B:34:0x00e7, B:36:0x0101, B:38:0x0113, B:42:0x012c, B:43:0x0130, B:46:0x0137, B:49:0x0146, B:62:0x0150, B:52:0x015c, B:55:0x0162, B:56:0x016c, B:57:0x0198, B:69:0x0157, B:70:0x015a, B:74:0x0176, B:75:0x0195, B:79:0x0186, B:80:0x018e, B:87:0x01a2, B:88:0x01a5, B:84:0x01a0, B:61:0x014c, B:66:0x0155, B:45:0x0134), top: B:30:0x00cb, inners: #0, #1, #3, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0113 A[Catch: all -> 0x00fd, TryCatch #5 {all -> 0x00fd, blocks: (B:31:0x00cb, B:32:0x00e1, B:34:0x00e7, B:36:0x0101, B:38:0x0113, B:42:0x012c, B:43:0x0130, B:46:0x0137, B:49:0x0146, B:62:0x0150, B:52:0x015c, B:55:0x0162, B:56:0x016c, B:57:0x0198, B:69:0x0157, B:70:0x015a, B:74:0x0176, B:75:0x0195, B:79:0x0186, B:80:0x018e, B:87:0x01a2, B:88:0x01a5, B:84:0x01a0, B:61:0x014c, B:66:0x0155, B:45:0x0134), top: B:30:0x00cb, inners: #0, #1, #3, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x012c A[Catch: all -> 0x00fd, TryCatch #5 {all -> 0x00fd, blocks: (B:31:0x00cb, B:32:0x00e1, B:34:0x00e7, B:36:0x0101, B:38:0x0113, B:42:0x012c, B:43:0x0130, B:46:0x0137, B:49:0x0146, B:62:0x0150, B:52:0x015c, B:55:0x0162, B:56:0x016c, B:57:0x0198, B:69:0x0157, B:70:0x015a, B:74:0x0176, B:75:0x0195, B:79:0x0186, B:80:0x018e, B:87:0x01a2, B:88:0x01a5, B:84:0x01a0, B:61:0x014c, B:66:0x0155, B:45:0x0134), top: B:30:0x00cb, inners: #0, #1, #3, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0144 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0174 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0181  */
    /* JADX WARN: Type inference failed for: r3v6, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.Lambda] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(b8P b8p, e7L e7l, Map map, Object obj, boolean z2, APn aPn) {
        cQM hOf;
        boolean z10;
        Object[] objArr;
        U8s u8s;
        HttpsURLConnection httpsURLConnection;
        Object[] objArr2;
        int responseCode;
        cQM hOf2;
        byte[] foxtrot;
        Map b2;
        HttpsURLConnection httpsURLConnection2 = null;
        r2 = null;
        Object obj2 = null;
        try {
            fP1 fp1 = b8p.gmP;
            if (fp1.f10414W.get()) {
                lhI lhi = fp1.f10415b;
                if (CnH.b(CnH.f8484b, 24, 0, 2) && lhi.olU.get()) {
                    z10 = lhi.f10835R;
                } else {
                    NetworkInfo activeNetworkInfo = lhi.f10834J.getActiveNetworkInfo();
                    z10 = activeNetworkInfo != null ? activeNetworkInfo.isConnectedOrConnecting() : false;
                }
            } else {
                z10 = true;
            }
            if (!z10) {
                e7l.b(new Xu(b8p.f10152b));
                return;
            }
            if (map == null) {
                map = b8p.PqK.f11509b;
            }
            String str = (String) wGk.zW.getValue();
            Lazy lazy = wGk.tmB;
            map.put(str, (String) lazy.getValue());
            byte[] f92 = ICR.f9((byte[]) b8p.f10151W.invoke(obj));
            map.put((String) wGk.eAe.getValue(), (String) lazy.getValue());
            try {
                try {
                    if (z2) {
                        if (((JSONObject) b8p.f10150V.f8363b.f9574b.get()).optBoolean(AWI.f8362W, true)) {
                            objArr = true;
                            if (objArr != false) {
                                map.put((String) wGk.xSi.getValue(), (String) wGk.A9U.getValue());
                            }
                            u8s = b8p.olU;
                            if (u8s != null && (b2 = u8s.b(f92)) != null) {
                                map.putAll(b2);
                            }
                            httpsURLConnection = (HttpsURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(new URL(b8p.f10152b).openConnection()));
                            httpsURLConnection.setReadTimeout(10000);
                            httpsURLConnection.setConnectTimeout(10000);
                            httpsURLConnection.setRequestMethod("POST");
                            httpsURLConnection.setDoOutput(true);
                            for (Map.Entry entry : map.entrySet()) {
                                httpsURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
                            }
                            httpsURLConnection.setChunkedStreamingMode(Barcode.FORMAT_UPC_E);
                            b8p.f10149J.getClass();
                            SystemClock.uptimeMillis();
                            httpsURLConnection.connect();
                            if (z2) {
                                if (((JSONObject) b8p.f10150V.f8363b.f9574b.get()).optBoolean(AWI.f8362W, true)) {
                                    objArr2 = true;
                                    if (objArr2 != false) {
                                        f92 = b8p.b(f92, httpsURLConnection);
                                    }
                                    OutputStream outputStream = httpsURLConnection.getOutputStream();
                                    outputStream.write(f92);
                                    outputStream.close();
                                    responseCode = httpsURLConnection.getResponseCode();
                                    if (200 > responseCode && responseCode < 400) {
                                        InputStream inputStream = httpsURLConnection.getInputStream();
                                        if (inputStream != null) {
                                            try {
                                                foxtrot = AbstractC2707l6.foxtrot(inputStream);
                                                inputStream.close();
                                            } finally {
                                            }
                                        } else {
                                            foxtrot = null;
                                        }
                                        if (b8p.f10153f9 != null && foxtrot != null) {
                                            obj2 = b8p.f10153f9.invoke(ICR.W(foxtrot));
                                        }
                                        aPn.onSuccess(obj2);
                                    } else {
                                        if (400 > responseCode && responseCode < 500) {
                                            hOf2 = new mKN(responseCode, b8p.f10152b, null, 4);
                                        } else if (500 > responseCode && responseCode <= Integer.MAX_VALUE) {
                                            hOf2 = new bWZ(responseCode, b8p.f10152b);
                                        } else {
                                            hOf2 = new HOf(b8p.f10152b, null);
                                        }
                                        e7l.b(hOf2);
                                    }
                                    httpsURLConnection.getHeaderFields();
                                    httpsURLConnection.disconnect();
                                    return;
                                }
                            }
                            objArr2 = false;
                            if (objArr2 != false) {
                            }
                            OutputStream outputStream2 = httpsURLConnection.getOutputStream();
                            outputStream2.write(f92);
                            outputStream2.close();
                            responseCode = httpsURLConnection.getResponseCode();
                            if (200 > responseCode) {
                            }
                            if (400 > responseCode) {
                            }
                            if (500 > responseCode) {
                            }
                            hOf2 = new HOf(b8p.f10152b, null);
                            e7l.b(hOf2);
                            httpsURLConnection.getHeaderFields();
                            httpsURLConnection.disconnect();
                            return;
                        }
                    }
                    outputStream2.write(f92);
                    outputStream2.close();
                    responseCode = httpsURLConnection.getResponseCode();
                    if (200 > responseCode) {
                    }
                    if (400 > responseCode) {
                    }
                    if (500 > responseCode) {
                    }
                    hOf2 = new HOf(b8p.f10152b, null);
                    e7l.b(hOf2);
                    httpsURLConnection.getHeaderFields();
                    httpsURLConnection.disconnect();
                    return;
                } finally {
                }
                httpsURLConnection.setReadTimeout(10000);
                httpsURLConnection.setConnectTimeout(10000);
                httpsURLConnection.setRequestMethod("POST");
                httpsURLConnection.setDoOutput(true);
                while (r9.hasNext()) {
                }
                httpsURLConnection.setChunkedStreamingMode(Barcode.FORMAT_UPC_E);
                b8p.f10149J.getClass();
                SystemClock.uptimeMillis();
                httpsURLConnection.connect();
                if (z2) {
                }
                objArr2 = false;
                if (objArr2 != false) {
                }
                OutputStream outputStream22 = httpsURLConnection.getOutputStream();
            } catch (Throwable th) {
                th = th;
                httpsURLConnection2 = httpsURLConnection;
                try {
                    if (th instanceof JSONException ? true : th instanceof IOException) {
                        hOf = new mKN(0, b8p.f10152b, th, 1);
                    } else if (th instanceof SocketTimeoutException) {
                        hOf = new Lsw(b8p.f10152b, th);
                    } else {
                        hOf = new HOf(b8p.f10152b, th);
                    }
                    b8p.getClass();
                    e7l.b(hOf);
                    if (httpsURLConnection2 != null) {
                        httpsURLConnection2.disconnect();
                        return;
                    }
                    return;
                } finally {
                    if (httpsURLConnection2 != null) {
                        httpsURLConnection2.disconnect();
                    }
                }
            }
            objArr = false;
            if (objArr != false) {
            }
            u8s = b8p.olU;
            if (u8s != null) {
                map.putAll(b2);
            }
            httpsURLConnection = (HttpsURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(new URL(b8p.f10152b).openConnection()));
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public /* synthetic */ b8P(String str, Function1 function1, lFn lfn, fP1 fp1, W6 w62, AWI awi, U8s u8s, int i4) {
        this(str, function1, (i4 & 4) != 0 ? null : lfn, new pl2(FD.f8653b, true), fp1, w62, new uyN(), awi, u8s);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r61v3 */
    /* JADX WARN: Type inference failed for: r61v4 */
    /* JADX WARN: Type inference failed for: r61v7 */
    public final byte[] b(byte[] bArr, HttpsURLConnection httpsURLConnection) {
        char c3;
        char c4;
        int i4;
        byte[] byteArray;
        ?? r61;
        AWI awi = this.f10150V;
        List b2 = ArraysKt.b(httpsURLConnection.getServerCertificates());
        boolean z2 = true;
        if (((JSONObject) awi.f8363b.f9574b.get()).optBoolean(AWI.f8362W, true)) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : b2) {
                boolean z10 = z2;
                if (obj instanceof X509Certificate) {
                    arrayList.add(obj);
                }
                z2 = z10;
            }
            boolean z11 = z2;
            byte[] bArr2 = new byte[0];
            int size = arrayList.size();
            int i5 = 0;
            int i10 = 0;
            while (i10 < size) {
                Object obj2 = arrayList.get(i10);
                i10++;
                int i11 = i5 + 1;
                if (i5 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                X509Certificate x509Certificate = (X509Certificate) obj2;
                if (i5 < 5) {
                    byte[] encoded = x509Certificate.getPublicKey().getEncoded();
                    t9 t9Var = new t9();
                    t9Var.b(encoded);
                    bArr2 = ArraysKt.ochre(bArr2, t9Var.b());
                }
                i5 = i11;
            }
            long currentTimeMillis = System.currentTimeMillis();
            c3 = 2;
            byte[] bArr3 = new byte[8];
            bArr3[0] = (byte) (currentTimeMillis >> 56);
            bArr3[z11 ? 1 : 0] = (byte) (currentTimeMillis >> 48);
            bArr3[2] = (byte) (currentTimeMillis >> 40);
            bArr3[3] = (byte) (currentTimeMillis >> 32);
            bArr3[4] = (byte) (currentTimeMillis >> 24);
            bArr3[5] = (byte) (currentTimeMillis >> 16);
            bArr3[6] = (byte) (currentTimeMillis >> 8);
            bArr3[7] = (byte) currentTimeMillis;
            byte[] ochre = ArraysKt.ochre(bArr3, bArr2);
            c4 = 3;
            i4 = 4;
            byte[] bArr4 = new byte[44];
            bArr4[0] = (byte) 63333;
            bArr4[z11 ? 1 : 0] = (byte) 130558308;
            bArr4[2] = (byte) 1653;
            bArr4[3] = (byte) 361;
            bArr4[4] = (byte) 105683504;
            bArr4[5] = (byte) 200907112;
            bArr4[6] = (byte) 2873;
            bArr4[7] = (byte) 349664617;
            bArr4[8] = (byte) 110;
            bArr4[9] = (byte) 96877;
            bArr4[10] = (byte) 116;
            bArr4[11] = (byte) 1780808;
            bArr4[12] = (byte) 402316621;
            bArr4[13] = (byte) 117;
            bArr4[14] = (byte) 5194;
            bArr4[15] = (byte) 841;
            bArr4[16] = (byte) 227188326;
            bArr4[17] = (byte) 855;
            bArr4[18] = (byte) 15210;
            bArr4[19] = (byte) 294190164;
            bArr4[20] = (byte) 16249;
            bArr4[21] = (byte) 486491765;
            bArr4[22] = (byte) 313291570;
            bArr4[23] = (byte) 404535;
            bArr4[24] = (byte) 8350549;
            bArr4[25] = (byte) 1406512;
            bArr4[26] = (byte) 570934;
            bArr4[27] = (byte) 75570;
            bArr4[28] = (byte) 325;
            bArr4[29] = (byte) 133735;
            bArr4[30] = (byte) 486968;
            bArr4[31] = (byte) 1215310;
            bArr4[32] = (byte) 620;
            bArr4[33] = (byte) 118127;
            bArr4[34] = (byte) 50041;
            bArr4[35] = (byte) 81340018;
            bArr4[36] = (byte) 2160730;
            bArr4[37] = (byte) 406062148;
            bArr4[38] = (byte) 87096;
            bArr4[39] = (byte) 8140394;
            bArr4[40] = (byte) 54111559;
            bArr4[41] = (byte) 26160244;
            bArr4[42] = (byte) 171883;
            bArr4[43] = (byte) 4579901;
            byte[] b4 = cT.b(0, bArr4);
            byte[] b6 = ICR.b();
            byte[] W5 = new F(b4, b6, null).W(ochre);
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                byteArrayOutputStream.write(b6);
                byteArrayOutputStream.write(W5);
                byteArray = byteArrayOutputStream.toByteArray();
                Arrays.fill(b4, (byte) 0);
                Arrays.fill(b6, (byte) 0);
                r61 = z11;
            } catch (IOException e) {
                throw new SecurityException(e);
            }
        } else {
            r61 = 1;
            i4 = 4;
            byteArray = null;
            c3 = 2;
            c4 = 3;
        }
        if (byteArray == null) {
            byteArray = f10148R;
        }
        int length = byteArray.length;
        byte[] bArr5 = new byte[i4];
        bArr5[0] = (byte) (length >> 24);
        bArr5[r61] = (byte) (length >> 16);
        bArr5[c3] = (byte) (length >> 8);
        bArr5[c4] = (byte) length;
        return ArraysKt.ochre(ArraysKt.ochre(bArr5, byteArray), bArr);
    }
}
