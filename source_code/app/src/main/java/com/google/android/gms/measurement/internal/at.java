package com.google.android.gms.measurement.internal;

import com.google.mlkit.vision.barcode.common.Barcode;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPOutputStream;

/* loaded from: classes2.dex */
public final class at implements Runnable {
    public final /* synthetic */ int alpha = 0;
    public final URL purple;
    public final byte[] red;
    public final String silver;
    public final Object teal;
    public final Map white;
    public final /* synthetic */ G3.a yellow;

    public at(au auVar, String str, URL url, byte[] bArr, Map map, as asVar) {
        this.yellow = auVar;
        V5.x.echo(str);
        V5.x.hotel(url);
        this.purple = url;
        this.red = bArr;
        this.teal = asVar;
        this.silver = str;
        this.white = map;
    }

    public void alpha(int i4, IOException iOException, byte[] bArr, Map map) {
        E e = ((G) ((C1466r0) this.yellow).alpha).f7508c;
        G.foxtrot(e);
        e.g0(new RunnableC1465q0(this, i4, iOException, bArr, map));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 13, insn: 0x0287: MOVE (r11 I:??[OBJECT, ARRAY]) = (r13 I:??[OBJECT, ARRAY]) (LINE:648), block:B:178:0x0285 */
    /* JADX WARN: Not initialized variable reg: 13, insn: 0x028a: MOVE (r12 I:??[OBJECT, ARRAY]) = (r13 I:??[OBJECT, ARRAY]) (LINE:651), block:B:175:0x0289 */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x02e5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x02b0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0163 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0141 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r8v25, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r8v26, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r8v35, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r8v37 */
    /* JADX WARN: Type inference failed for: r8v38 */
    /* JADX WARN: Type inference failed for: r8v39 */
    /* JADX WARN: Type inference failed for: r8v40 */
    /* JADX WARN: Type inference failed for: r8v42, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v49 */
    /* JADX WARN: Type inference failed for: r8v50 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i4;
        HttpURLConnection httpURLConnection;
        Map map;
        IOException iOException;
        int i5;
        Map map2;
        Throwable th;
        int responseCode;
        Map map3;
        Map map4;
        InputStream inputStream;
        ByteArrayOutputStream byteArrayOutputStream;
        int i10;
        HttpURLConnection httpURLConnection2;
        Map map5;
        Map map6;
        Map map7;
        Map map8;
        Map map9;
        Throwable th2;
        Map map10;
        IOException iOException2;
        ?? r82;
        ?? r83;
        Map map11;
        InputStream inputStream2;
        ?? hasNext;
        switch (this.alpha) {
            case 0:
                String str = this.silver;
                au auVar = (au) this.yellow;
                G g2 = (G) auVar.alpha;
                G g5 = (G) auVar.alpha;
                E e = g2.f7508c;
                G.foxtrot(e);
                e.a0();
                OutputStream outputStream = null;
                try {
                    URLConnection openConnection = this.purple.openConnection();
                    if (openConnection instanceof HttpURLConnection) {
                        httpURLConnection = (HttpURLConnection) openConnection;
                        httpURLConnection.setDefaultUseCaches(false);
                        g5.getClass();
                        httpURLConnection.setConnectTimeout(60000);
                        httpURLConnection.setReadTimeout(61000);
                        httpURLConnection.setInstanceFollowRedirects(false);
                        httpURLConnection.setDoInput(true);
                        try {
                            Map map12 = this.white;
                            if (map12 != null) {
                                for (Map.Entry entry : map12.entrySet()) {
                                    httpURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                                }
                            }
                            byte[] bArr = this.red;
                            if (bArr != null) {
                                au auVar2 = auVar.purple.yellow;
                                Z0.cyan(auVar2);
                                byte[] b02 = auVar2.b0(bArr);
                                ar arVar = g5.f7507b;
                                G.foxtrot(arVar);
                                a4.j jVar = arVar.f7636g;
                                int length = b02.length;
                                jVar.bravo(Integer.valueOf(length), "Uploading data. size");
                                httpURLConnection.setDoOutput(true);
                                httpURLConnection.addRequestProperty("Content-Encoding", "gzip");
                                httpURLConnection.setFixedLengthStreamingMode(length);
                                httpURLConnection.connect();
                                OutputStream outputStream2 = httpURLConnection.getOutputStream();
                                try {
                                    outputStream2.write(b02);
                                    outputStream2.close();
                                } catch (IOException e4) {
                                    iOException = e4;
                                    i5 = 0;
                                    map2 = null;
                                    outputStream = outputStream2;
                                    if (outputStream != null) {
                                        try {
                                            outputStream.close();
                                        } catch (IOException e5) {
                                            ar arVar2 = g5.f7507b;
                                            G.foxtrot(arVar2);
                                            arVar2.white.charlie(ar.e0(str), e5, "Error closing HTTP compressed POST connection output stream. appId");
                                        }
                                    }
                                    if (httpURLConnection != null) {
                                        httpURLConnection.disconnect();
                                    }
                                    E e10 = g5.f7508c;
                                    G.foxtrot(e10);
                                    e10.g0(new ap(this.silver, (as) this.teal, i5, iOException, (byte[]) null, map2));
                                    return;
                                } catch (Throwable th3) {
                                    th = th3;
                                    i4 = 0;
                                    map = null;
                                    outputStream = outputStream2;
                                    th = th;
                                    if (outputStream != null) {
                                        try {
                                            outputStream.close();
                                        } catch (IOException e11) {
                                            ar arVar3 = g5.f7507b;
                                            G.foxtrot(arVar3);
                                            arVar3.white.charlie(ar.e0(str), e11, "Error closing HTTP compressed POST connection output stream. appId");
                                        }
                                    }
                                    if (httpURLConnection != null) {
                                        httpURLConnection.disconnect();
                                    }
                                    E e12 = g5.f7508c;
                                    G.foxtrot(e12);
                                    e12.g0(new ap(this.silver, (as) this.teal, i4, (IOException) null, (byte[]) null, map));
                                    throw th;
                                }
                            }
                            responseCode = httpURLConnection.getResponseCode();
                        } catch (IOException e13) {
                            iOException = e13;
                            i5 = 0;
                            map2 = null;
                        } catch (Throwable th4) {
                            th = th4;
                            i4 = 0;
                            map = null;
                        }
                        try {
                            try {
                                Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
                                try {
                                    byteArrayOutputStream = new ByteArrayOutputStream();
                                    inputStream = httpURLConnection.getInputStream();
                                } catch (Throwable th5) {
                                    th = th5;
                                    inputStream = null;
                                }
                                try {
                                    byte[] bArr2 = new byte[Barcode.FORMAT_UPC_E];
                                    while (true) {
                                        int read = inputStream.read(bArr2);
                                        if (read > 0) {
                                            byteArrayOutputStream.write(bArr2, 0, read);
                                        } else {
                                            byte[] byteArray = byteArrayOutputStream.toByteArray();
                                            inputStream.close();
                                            httpURLConnection.disconnect();
                                            E e14 = g5.f7508c;
                                            G.foxtrot(e14);
                                            e14.g0(new ap(this.silver, (as) this.teal, responseCode, (IOException) null, byteArray, headerFields));
                                            return;
                                        }
                                    }
                                } catch (Throwable th6) {
                                    th = th6;
                                    if (inputStream != null) {
                                        inputStream.close();
                                    }
                                    throw th;
                                }
                            } catch (IOException e15) {
                                e = e15;
                                i5 = responseCode;
                                map2 = map4;
                                iOException = e;
                                if (outputStream != null) {
                                }
                                if (httpURLConnection != null) {
                                }
                                E e102 = g5.f7508c;
                                G.foxtrot(e102);
                                e102.g0(new ap(this.silver, (as) this.teal, i5, iOException, (byte[]) null, map2));
                                return;
                            } catch (Throwable th7) {
                                th = th7;
                                i4 = responseCode;
                                map = map3;
                                if (outputStream != null) {
                                }
                                if (httpURLConnection != null) {
                                }
                                E e122 = g5.f7508c;
                                G.foxtrot(e122);
                                e122.g0(new ap(this.silver, (as) this.teal, i4, (IOException) null, (byte[]) null, map));
                                throw th;
                            }
                        } catch (IOException e16) {
                            e = e16;
                            map2 = null;
                            i5 = responseCode;
                            iOException = e;
                            if (outputStream != null) {
                            }
                            if (httpURLConnection != null) {
                            }
                            E e1022 = g5.f7508c;
                            G.foxtrot(e1022);
                            e1022.g0(new ap(this.silver, (as) this.teal, i5, iOException, (byte[]) null, map2));
                            return;
                        } catch (Throwable th8) {
                            th = th8;
                            map = null;
                            i4 = responseCode;
                            if (outputStream != null) {
                            }
                            if (httpURLConnection != null) {
                            }
                            E e1222 = g5.f7508c;
                            G.foxtrot(e1222);
                            e1222.g0(new ap(this.silver, (as) this.teal, i4, (IOException) null, (byte[]) null, map));
                            throw th;
                        }
                    } else {
                        throw new IOException("Failed to obtain HTTP connection");
                    }
                } catch (IOException e17) {
                    iOException = e17;
                    i5 = 0;
                    httpURLConnection = null;
                    map2 = null;
                } catch (Throwable th9) {
                    th = th9;
                    i4 = 0;
                    httpURLConnection = null;
                    map = null;
                }
            default:
                String str2 = this.silver;
                C1466r0 c1466r0 = (C1466r0) this.yellow;
                G g10 = (G) c1466r0.alpha;
                G g11 = (G) c1466r0.alpha;
                E e18 = g10.f7508c;
                G.foxtrot(e18);
                e18.a0();
                try {
                    URLConnection openConnection2 = this.purple.openConnection();
                    if (openConnection2 instanceof HttpURLConnection) {
                        httpURLConnection2 = (HttpURLConnection) openConnection2;
                        httpURLConnection2.setDefaultUseCaches(false);
                        g11.getClass();
                        httpURLConnection2.setConnectTimeout(60000);
                        httpURLConnection2.setReadTimeout(61000);
                        httpURLConnection2.setInstanceFollowRedirects(false);
                        httpURLConnection2.setDoInput(true);
                        try {
                            try {
                                HashMap hashMap = (HashMap) this.white;
                                if (hashMap != null) {
                                    Iterator it = hashMap.entrySet().iterator();
                                    while (true) {
                                        hasNext = it.hasNext();
                                        if (hasNext != 0) {
                                            Map.Entry entry2 = (Map.Entry) it.next();
                                            httpURLConnection2.addRequestProperty((String) entry2.getKey(), (String) entry2.getValue());
                                        }
                                    }
                                }
                                byte[] bArr3 = this.red;
                                map11 = hasNext;
                                if (bArr3 != null) {
                                    try {
                                        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                                        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream2);
                                        gZIPOutputStream.write(bArr3);
                                        gZIPOutputStream.close();
                                        byteArrayOutputStream2.close();
                                        byte[] byteArray2 = byteArrayOutputStream2.toByteArray();
                                        ar arVar4 = g11.f7507b;
                                        G.foxtrot(arVar4);
                                        a4.j jVar2 = arVar4.f7636g;
                                        int length2 = byteArray2.length;
                                        jVar2.bravo(Integer.valueOf(length2), "Uploading data. size");
                                        httpURLConnection2.setDoOutput(true);
                                        httpURLConnection2.addRequestProperty("Content-Encoding", "gzip");
                                        httpURLConnection2.setFixedLengthStreamingMode(length2);
                                        httpURLConnection2.connect();
                                        ?? outputStream3 = httpURLConnection2.getOutputStream();
                                        try {
                                            outputStream3.write(byteArray2);
                                            outputStream3.close();
                                            map11 = outputStream3;
                                        } catch (IOException e19) {
                                            e = e19;
                                            i10 = 0;
                                            map8 = null;
                                            map10 = outputStream3;
                                            iOException2 = e;
                                            r83 = map10;
                                            if (r83 != 0) {
                                            }
                                            if (httpURLConnection2 != null) {
                                            }
                                            alpha(i10, iOException2, null, map8);
                                            return;
                                        } catch (Throwable th10) {
                                            th = th10;
                                            i10 = 0;
                                            map7 = null;
                                            map9 = outputStream3;
                                            th2 = th;
                                            r82 = map9;
                                            if (r82 != 0) {
                                            }
                                            if (httpURLConnection2 != null) {
                                            }
                                            alpha(i10, null, null, map7);
                                            throw th2;
                                        }
                                    } catch (IOException e20) {
                                        ar arVar5 = g11.f7507b;
                                        G.foxtrot(arVar5);
                                        arVar5.white.bravo(e20, "Failed to gzip post request content");
                                        throw e20;
                                    }
                                }
                                i10 = httpURLConnection2.getResponseCode();
                            } catch (IOException e21) {
                                e = e21;
                                i10 = 0;
                                map6 = null;
                                map8 = map6;
                                map10 = map6;
                                iOException2 = e;
                                r83 = map10;
                                if (r83 != 0) {
                                    try {
                                        r83.close();
                                    } catch (IOException e22) {
                                        ar arVar6 = g11.f7507b;
                                        G.foxtrot(arVar6);
                                        arVar6.white.charlie(ar.e0(str2), e22, "Error closing HTTP compressed POST connection output stream. appId");
                                    }
                                }
                                if (httpURLConnection2 != null) {
                                    httpURLConnection2.disconnect();
                                }
                                alpha(i10, iOException2, null, map8);
                                return;
                            }
                        } catch (Throwable th11) {
                            th = th11;
                            i10 = 0;
                            map5 = null;
                            map7 = map5;
                            map9 = map5;
                            th2 = th;
                            r82 = map9;
                            if (r82 != 0) {
                                try {
                                    r82.close();
                                } catch (IOException e23) {
                                    ar arVar7 = g11.f7507b;
                                    G.foxtrot(arVar7);
                                    arVar7.white.charlie(ar.e0(str2), e23, "Error closing HTTP compressed POST connection output stream. appId");
                                }
                            }
                            if (httpURLConnection2 != null) {
                                httpURLConnection2.disconnect();
                            }
                            alpha(i10, null, null, map7);
                            throw th2;
                        }
                        try {
                            try {
                                Map<String, List<String>> headerFields2 = httpURLConnection2.getHeaderFields();
                                try {
                                    ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
                                    inputStream2 = httpURLConnection2.getInputStream();
                                    try {
                                        byte[] bArr4 = new byte[Barcode.FORMAT_UPC_E];
                                        while (true) {
                                            int read2 = inputStream2.read(bArr4);
                                            if (read2 > 0) {
                                                byteArrayOutputStream3.write(bArr4, 0, read2);
                                            } else {
                                                byte[] byteArray3 = byteArrayOutputStream3.toByteArray();
                                                inputStream2.close();
                                                httpURLConnection2.disconnect();
                                                alpha(i10, null, byteArray3, headerFields2);
                                                return;
                                            }
                                        }
                                    } catch (Throwable th12) {
                                        th = th12;
                                        if (inputStream2 != null) {
                                            inputStream2.close();
                                        }
                                        throw th;
                                    }
                                } catch (Throwable th13) {
                                    th = th13;
                                    inputStream2 = null;
                                }
                            } catch (IOException e24) {
                                iOException2 = e24;
                                map8 = map11;
                                r83 = 0;
                                if (r83 != 0) {
                                }
                                if (httpURLConnection2 != null) {
                                }
                                alpha(i10, iOException2, null, map8);
                                return;
                            } catch (Throwable th14) {
                                th2 = th14;
                                map7 = map11;
                                r82 = 0;
                                if (r82 != 0) {
                                }
                                if (httpURLConnection2 != null) {
                                }
                                alpha(i10, null, null, map7);
                                throw th2;
                            }
                        } catch (IOException e25) {
                            iOException2 = e25;
                            r83 = 0;
                            map8 = null;
                            if (r83 != 0) {
                            }
                            if (httpURLConnection2 != null) {
                            }
                            alpha(i10, iOException2, null, map8);
                            return;
                        } catch (Throwable th15) {
                            th2 = th15;
                            r82 = 0;
                            map7 = null;
                            if (r82 != 0) {
                            }
                            if (httpURLConnection2 != null) {
                            }
                            alpha(i10, null, null, map7);
                            throw th2;
                        }
                    } else {
                        throw new IOException("Failed to obtain HTTP connection");
                    }
                } catch (IOException e26) {
                    e = e26;
                    i10 = 0;
                    httpURLConnection2 = null;
                    map6 = null;
                } catch (Throwable th16) {
                    th = th16;
                    i10 = 0;
                    httpURLConnection2 = null;
                    map5 = null;
                }
        }
    }

    public at(C1466r0 c1466r0, String str, URL url, byte[] bArr, HashMap hashMap, InterfaceC1463p0 interfaceC1463p0) {
        this.yellow = c1466r0;
        V5.x.echo(str);
        this.purple = url;
        this.red = bArr;
        this.teal = interfaceC1463p0;
        this.silver = str;
        this.white = hashMap;
    }
}
