package j2;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.os.Build;
import android.util.Log;
import androidx.appcompat.widget.P0;
import ao.ad;
import com.google.android.gms.measurement.internal.C1473v;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.Executor;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;

/* renamed from: j2.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1936c {
    public static final C1473v alpha = new C1473v(10);
    public static final byte[] bravo = {112, 114, 111, 0};
    public static final byte[] charlie = {112, 114, 109, 0};
    public static final byte[] delta = {48, 49, 53, 0};
    public static final byte[] echo = {48, 49, 48, 0};
    public static final byte[] foxtrot = {48, 48, 57, 0};
    public static final byte[] golf = {48, 48, 53, 0};
    public static final byte[] hotel = {48, 48, 49, 0};
    public static final byte[] india = {48, 48, 49, 0};
    public static final byte[] juliet = {48, 48, 50, 0};

    public static byte[] alpha(byte[] bArr) {
        Deflater deflater = new Deflater(1);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
            try {
                deflaterOutputStream.write(bArr);
                deflaterOutputStream.close();
                deflater.end();
                return byteArrayOutputStream.toByteArray();
            } finally {
            }
        } catch (Throwable th) {
            deflater.end();
            throw th;
        }
    }

    public static byte[] bravo(C1934a[] c1934aArr, byte[] bArr) {
        int i4 = 0;
        int i5 = 0;
        for (C1934a c1934a : c1934aArr) {
            i5 += ((((c1934a.golf * 2) + 7) & (-8)) / 8) + (c1934a.echo * 2) + delta(c1934a.alpha, c1934a.bravo, bArr).getBytes(StandardCharsets.UTF_8).length + 16 + c1934a.foxtrot;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(i5);
        if (Arrays.equals(bArr, foxtrot)) {
            int length = c1934aArr.length;
            while (i4 < length) {
                C1934a c1934a2 = c1934aArr[i4];
                quebec(byteArrayOutputStream, c1934a2, delta(c1934a2.alpha, c1934a2.bravo, bArr));
                papa(byteArrayOutputStream, c1934a2);
                i4++;
            }
        } else {
            for (C1934a c1934a3 : c1934aArr) {
                quebec(byteArrayOutputStream, c1934a3, delta(c1934a3.alpha, c1934a3.bravo, bArr));
            }
            int length2 = c1934aArr.length;
            while (i4 < length2) {
                papa(byteArrayOutputStream, c1934aArr[i4]);
                i4++;
            }
        }
        if (byteArrayOutputStream.size() == i5) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new IllegalStateException("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + i5);
    }

    public static boolean charlie(File file) {
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                return false;
            }
            boolean z2 = true;
            for (File file2 : listFiles) {
                if (charlie(file2) && z2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
            }
            return z2;
        }
        file.delete();
        return true;
    }

    public static String delta(String str, String str2, byte[] bArr) {
        Object obj;
        byte[] bArr2 = hotel;
        boolean equals = Arrays.equals(bArr, bArr2);
        byte[] bArr3 = golf;
        String str3 = "!";
        if (!equals && !Arrays.equals(bArr, bArr3)) {
            obj = "!";
        } else {
            obj = ":";
        }
        if (str.length() <= 0) {
            if ("!".equals(obj)) {
                return str2.replace(":", "!");
            }
            if (":".equals(obj)) {
                return str2.replace("!", ":");
            }
        } else {
            if (str2.equals("classes.dex")) {
                return str;
            }
            if (!str2.contains("!") && !str2.contains(":")) {
                if (!str2.endsWith(".apk")) {
                    StringBuilder tango = Q0.c.tango(str);
                    if (Arrays.equals(bArr, bArr2) || Arrays.equals(bArr, bArr3)) {
                        str3 = ":";
                    }
                    return P0.gold(tango, str3, str2);
                }
            } else {
                if ("!".equals(obj)) {
                    return str2.replace(":", "!");
                }
                if (":".equals(obj)) {
                    return str2.replace("!", ":");
                }
            }
        }
        return str2;
    }

    public static void echo(PackageInfo packageInfo, File file) {
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat")));
            try {
                dataOutputStream.writeLong(packageInfo.lastUpdateTime);
                dataOutputStream.close();
            } finally {
            }
        } catch (IOException unused) {
        }
    }

    public static byte[] foxtrot(InputStream inputStream, int i4) {
        byte[] bArr = new byte[i4];
        int i5 = 0;
        while (i5 < i4) {
            int read = inputStream.read(bArr, i5, i4 - i5);
            if (read >= 0) {
                i5 += read;
            } else {
                throw new IllegalStateException(ad.zulu(i4, "Not enough bytes to read: "));
            }
        }
        return bArr;
    }

    public static int[] golf(ByteArrayInputStream byteArrayInputStream, int i4) {
        int[] iArr = new int[i4];
        int i5 = 0;
        for (int i10 = 0; i10 < i4; i10++) {
            i5 += (int) mike(byteArrayInputStream, 2);
            iArr[i10] = i5;
        }
        return iArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x005d, code lost:
    
        if (r0.finished() == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0062, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006a, code lost:
    
        throw new java.lang.IllegalStateException("Inflater did not finish");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static byte[] hotel(FileInputStream fileInputStream, int i4, int i5) {
        Inflater inflater = new Inflater();
        try {
            byte[] bArr = new byte[i5];
            byte[] bArr2 = new byte[2048];
            int i10 = 0;
            int i11 = 0;
            while (!inflater.finished() && !inflater.needsDictionary() && i10 < i4) {
                int read = fileInputStream.read(bArr2);
                if (read >= 0) {
                    inflater.setInput(bArr2, 0, read);
                    try {
                        i11 += inflater.inflate(bArr, i11, i5 - i11);
                        i10 += read;
                    } catch (DataFormatException e) {
                        throw new IllegalStateException(e.getMessage());
                    }
                } else {
                    throw new IllegalStateException("Invalid zip data. Stream ended after $totalBytesRead bytes. Expected " + i4 + " bytes");
                }
            }
            throw new IllegalStateException("Didn't read enough bytes during decompression. expected=" + i4 + " actual=" + i10);
        } finally {
            inflater.end();
        }
    }

    public static C1934a[] india(FileInputStream fileInputStream, byte[] bArr, byte[] bArr2, C1934a[] c1934aArr) {
        byte[] bArr3 = india;
        if (Arrays.equals(bArr, bArr3)) {
            if (!Arrays.equals(delta, bArr2)) {
                if (Arrays.equals(bArr, bArr3)) {
                    int mike = (int) mike(fileInputStream, 1);
                    byte[] hotel2 = hotel(fileInputStream, (int) mike(fileInputStream, 4), (int) mike(fileInputStream, 4));
                    if (fileInputStream.read() <= 0) {
                        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(hotel2);
                        try {
                            C1934a[] juliet2 = juliet(byteArrayInputStream, mike, c1934aArr);
                            byteArrayInputStream.close();
                            return juliet2;
                        } catch (Throwable th) {
                            try {
                                byteArrayInputStream.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    }
                    throw new IllegalStateException("Content found after the end of file");
                }
                throw new IllegalStateException("Unsupported meta version");
            }
            throw new IllegalStateException("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
        }
        if (Arrays.equals(bArr, juliet)) {
            int mike2 = (int) mike(fileInputStream, 2);
            byte[] hotel3 = hotel(fileInputStream, (int) mike(fileInputStream, 4), (int) mike(fileInputStream, 4));
            if (fileInputStream.read() <= 0) {
                ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(hotel3);
                try {
                    C1934a[] kilo = kilo(byteArrayInputStream2, bArr2, mike2, c1934aArr);
                    byteArrayInputStream2.close();
                    return kilo;
                } catch (Throwable th3) {
                    try {
                        byteArrayInputStream2.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                    throw th3;
                }
            }
            throw new IllegalStateException("Content found after the end of file");
        }
        throw new IllegalStateException("Unsupported meta version");
    }

    public static C1934a[] juliet(ByteArrayInputStream byteArrayInputStream, int i4, C1934a[] c1934aArr) {
        if (byteArrayInputStream.available() == 0) {
            return new C1934a[0];
        }
        if (i4 == c1934aArr.length) {
            String[] strArr = new String[i4];
            int[] iArr = new int[i4];
            for (int i5 = 0; i5 < i4; i5++) {
                int mike = (int) mike(byteArrayInputStream, 2);
                iArr[i5] = (int) mike(byteArrayInputStream, 2);
                strArr[i5] = new String(foxtrot(byteArrayInputStream, mike), StandardCharsets.UTF_8);
            }
            for (int i10 = 0; i10 < i4; i10++) {
                C1934a c1934a = c1934aArr[i10];
                if (c1934a.bravo.equals(strArr[i10])) {
                    int i11 = iArr[i10];
                    c1934a.echo = i11;
                    c1934a.hotel = golf(byteArrayInputStream, i11);
                } else {
                    throw new IllegalStateException("Order of dexfiles in metadata did not match baseline");
                }
            }
            return c1934aArr;
        }
        throw new IllegalStateException("Mismatched number of dex files found in metadata");
    }

    public static C1934a[] kilo(ByteArrayInputStream byteArrayInputStream, byte[] bArr, int i4, C1934a[] c1934aArr) {
        String str;
        if (byteArrayInputStream.available() == 0) {
            return new C1934a[0];
        }
        if (i4 == c1934aArr.length) {
            for (int i5 = 0; i5 < i4; i5++) {
                mike(byteArrayInputStream, 2);
                String str2 = new String(foxtrot(byteArrayInputStream, (int) mike(byteArrayInputStream, 2)), StandardCharsets.UTF_8);
                long mike = mike(byteArrayInputStream, 4);
                int mike2 = (int) mike(byteArrayInputStream, 2);
                C1934a c1934a = null;
                if (c1934aArr.length > 0) {
                    int indexOf = str2.indexOf("!");
                    if (indexOf < 0) {
                        indexOf = str2.indexOf(":");
                    }
                    if (indexOf > 0) {
                        str = str2.substring(indexOf + 1);
                    } else {
                        str = str2;
                    }
                    int i10 = 0;
                    while (true) {
                        if (i10 >= c1934aArr.length) {
                            break;
                        }
                        if (c1934aArr[i10].bravo.equals(str)) {
                            c1934a = c1934aArr[i10];
                            break;
                        }
                        i10++;
                    }
                }
                if (c1934a != null) {
                    c1934a.delta = mike;
                    int[] golf2 = golf(byteArrayInputStream, mike2);
                    if (Arrays.equals(bArr, hotel)) {
                        c1934a.echo = mike2;
                        c1934a.hotel = golf2;
                    }
                } else {
                    throw new IllegalStateException("Missing profile key: ".concat(str2));
                }
            }
            return c1934aArr;
        }
        throw new IllegalStateException("Mismatched number of dex files found in metadata");
    }

    public static C1934a[] lima(FileInputStream fileInputStream, byte[] bArr, String str) {
        if (Arrays.equals(bArr, echo)) {
            int mike = (int) mike(fileInputStream, 1);
            byte[] hotel2 = hotel(fileInputStream, (int) mike(fileInputStream, 4), (int) mike(fileInputStream, 4));
            if (fileInputStream.read() <= 0) {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(hotel2);
                try {
                    C1934a[] november = november(byteArrayInputStream, str, mike);
                    byteArrayInputStream.close();
                    return november;
                } catch (Throwable th) {
                    try {
                        byteArrayInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            throw new IllegalStateException("Content found after the end of file");
        }
        throw new IllegalStateException("Unsupported version");
    }

    public static long mike(InputStream inputStream, int i4) {
        byte[] foxtrot2 = foxtrot(inputStream, i4);
        long j5 = 0;
        for (int i5 = 0; i5 < i4; i5++) {
            j5 += (foxtrot2[i5] & 255) << (i5 * 8);
        }
        return j5;
    }

    public static C1934a[] november(ByteArrayInputStream byteArrayInputStream, String str, int i4) {
        TreeMap treeMap;
        int i5;
        if (byteArrayInputStream.available() == 0) {
            return new C1934a[0];
        }
        C1934a[] c1934aArr = new C1934a[i4];
        for (int i10 = 0; i10 < i4; i10++) {
            int mike = (int) mike(byteArrayInputStream, 2);
            int mike2 = (int) mike(byteArrayInputStream, 2);
            c1934aArr[i10] = new C1934a(str, new String(foxtrot(byteArrayInputStream, mike), StandardCharsets.UTF_8), mike(byteArrayInputStream, 4), mike2, (int) mike(byteArrayInputStream, 4), (int) mike(byteArrayInputStream, 4), new int[mike2], new TreeMap());
        }
        for (int i11 = 0; i11 < i4; i11++) {
            C1934a c1934a = c1934aArr[i11];
            int available = byteArrayInputStream.available() - c1934a.foxtrot;
            int i12 = 0;
            while (true) {
                int available2 = byteArrayInputStream.available();
                treeMap = c1934a.india;
                if (available2 <= available) {
                    break;
                }
                i12 += (int) mike(byteArrayInputStream, 2);
                treeMap.put(Integer.valueOf(i12), 1);
                for (int mike3 = (int) mike(byteArrayInputStream, 2); mike3 > 0; mike3--) {
                    mike(byteArrayInputStream, 2);
                    int mike4 = (int) mike(byteArrayInputStream, 1);
                    if (mike4 != 6 && mike4 != 7) {
                        while (mike4 > 0) {
                            mike(byteArrayInputStream, 1);
                            for (int mike5 = (int) mike(byteArrayInputStream, 1); mike5 > 0; mike5--) {
                                mike(byteArrayInputStream, 2);
                            }
                            mike4--;
                        }
                    }
                }
            }
            if (byteArrayInputStream.available() == available) {
                c1934a.hotel = golf(byteArrayInputStream, c1934a.echo);
                int i13 = c1934a.golf;
                BitSet valueOf = BitSet.valueOf(foxtrot(byteArrayInputStream, (((i13 * 2) + 7) & (-8)) / 8));
                for (int i14 = 0; i14 < i13; i14++) {
                    if (valueOf.get(i14)) {
                        i5 = 2;
                    } else {
                        i5 = 0;
                    }
                    if (valueOf.get(i14 + i13)) {
                        i5 |= 4;
                    }
                    if (i5 != 0) {
                        Integer num = (Integer) treeMap.get(Integer.valueOf(i14));
                        if (num == null) {
                            num = 0;
                        }
                        treeMap.put(Integer.valueOf(i14), Integer.valueOf(i5 | num.intValue()));
                    }
                }
            } else {
                throw new IllegalStateException("Read too much data during profile line parse");
            }
        }
        return c1934aArr;
    }

    /* JADX WARN: Finally extract failed */
    public static boolean oscar(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr, C1934a[] c1934aArr) {
        long j5;
        ArrayList arrayList;
        int length;
        byte[] bArr2 = delta;
        int i4 = 0;
        if (Arrays.equals(bArr, bArr2)) {
            ArrayList arrayList2 = new ArrayList(3);
            ArrayList arrayList3 = new ArrayList(3);
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            try {
                victor(byteArrayOutputStream2, c1934aArr.length);
                int i5 = 2;
                int i10 = 2;
                for (C1934a c1934a : c1934aArr) {
                    uniform(byteArrayOutputStream2, c1934a.charlie, 4);
                    uniform(byteArrayOutputStream2, c1934a.delta, 4);
                    uniform(byteArrayOutputStream2, c1934a.golf, 4);
                    String delta2 = delta(c1934a.alpha, c1934a.bravo, bArr2);
                    Charset charset = StandardCharsets.UTF_8;
                    int length2 = delta2.getBytes(charset).length;
                    victor(byteArrayOutputStream2, length2);
                    i10 = i10 + 14 + length2;
                    byteArrayOutputStream2.write(delta2.getBytes(charset));
                }
                byte[] byteArray = byteArrayOutputStream2.toByteArray();
                if (i10 == byteArray.length) {
                    C1941h c1941h = new C1941h(1, byteArray, false);
                    byteArrayOutputStream2.close();
                    arrayList2.add(c1941h);
                    ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
                    int i11 = 0;
                    int i12 = 0;
                    while (i11 < c1934aArr.length) {
                        try {
                            C1934a c1934a2 = c1934aArr[i11];
                            victor(byteArrayOutputStream3, i11);
                            victor(byteArrayOutputStream3, c1934a2.echo);
                            i12 = i12 + 4 + (c1934a2.echo * i5);
                            int[] iArr = c1934a2.hotel;
                            int length3 = iArr.length;
                            int i13 = i4;
                            int i14 = i5;
                            int i15 = i13;
                            while (i15 < length3) {
                                int i16 = iArr[i15];
                                victor(byteArrayOutputStream3, i16 - i13);
                                i15++;
                                i13 = i16;
                            }
                            i11++;
                            i5 = i14;
                            i4 = 0;
                        } catch (Throwable th) {
                        }
                    }
                    byte[] byteArray2 = byteArrayOutputStream3.toByteArray();
                    if (i12 == byteArray2.length) {
                        C1941h c1941h2 = new C1941h(3, byteArray2, true);
                        byteArrayOutputStream3.close();
                        arrayList2.add(c1941h2);
                        byteArrayOutputStream3 = new ByteArrayOutputStream();
                        int i17 = 0;
                        int i18 = 0;
                        while (i17 < c1934aArr.length) {
                            try {
                                C1934a c1934a3 = c1934aArr[i17];
                                Iterator it = c1934a3.india.entrySet().iterator();
                                int i19 = 0;
                                while (it.hasNext()) {
                                    i19 |= ((Integer) ((Map.Entry) it.next()).getValue()).intValue();
                                }
                                ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
                                try {
                                    romeo(byteArrayOutputStream4, i19, c1934a3);
                                    byte[] byteArray3 = byteArrayOutputStream4.toByteArray();
                                    byteArrayOutputStream4.close();
                                    byteArrayOutputStream4 = new ByteArrayOutputStream();
                                    try {
                                        sierra(byteArrayOutputStream4, c1934a3);
                                        byte[] byteArray4 = byteArrayOutputStream4.toByteArray();
                                        byteArrayOutputStream4.close();
                                        victor(byteArrayOutputStream3, i17);
                                        int length4 = byteArray3.length + 2 + byteArray4.length;
                                        int i20 = i18 + 6;
                                        ArrayList arrayList4 = arrayList3;
                                        uniform(byteArrayOutputStream3, length4, 4);
                                        victor(byteArrayOutputStream3, i19);
                                        byteArrayOutputStream3.write(byteArray3);
                                        byteArrayOutputStream3.write(byteArray4);
                                        i18 = i20 + length4;
                                        i17++;
                                        arrayList3 = arrayList4;
                                    } finally {
                                    }
                                } finally {
                                }
                            } finally {
                                try {
                                    byteArrayOutputStream3.close();
                                    throw th;
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                            }
                        }
                        ArrayList arrayList5 = arrayList3;
                        byte[] byteArray5 = byteArrayOutputStream3.toByteArray();
                        if (i18 == byteArray5.length) {
                            C1941h c1941h3 = new C1941h(4, byteArray5, true);
                            byteArrayOutputStream3.close();
                            arrayList2.add(c1941h3);
                            long j6 = 4;
                            long size = j6 + j6 + 4 + (arrayList2.size() * 16);
                            uniform(byteArrayOutputStream, arrayList2.size(), 4);
                            int i21 = 0;
                            while (i21 < arrayList2.size()) {
                                C1941h c1941h4 = (C1941h) arrayList2.get(i21);
                                int i22 = c1941h4.alpha;
                                if (i22 != 1) {
                                    if (i22 != 2) {
                                        if (i22 != 3) {
                                            if (i22 != 4) {
                                                if (i22 == 5) {
                                                    j5 = 4;
                                                } else {
                                                    throw null;
                                                }
                                            } else {
                                                j5 = 3;
                                            }
                                        } else {
                                            j5 = 2;
                                        }
                                    } else {
                                        j5 = 1;
                                    }
                                } else {
                                    j5 = 0;
                                }
                                uniform(byteArrayOutputStream, j5, 4);
                                uniform(byteArrayOutputStream, size, 4);
                                byte[] bArr3 = c1941h4.bravo;
                                if (c1941h4.charlie) {
                                    long length5 = bArr3.length;
                                    byte[] alpha2 = alpha(bArr3);
                                    arrayList = arrayList5;
                                    arrayList.add(alpha2);
                                    uniform(byteArrayOutputStream, alpha2.length, 4);
                                    uniform(byteArrayOutputStream, length5, 4);
                                    length = alpha2.length;
                                } else {
                                    arrayList = arrayList5;
                                    arrayList.add(bArr3);
                                    uniform(byteArrayOutputStream, bArr3.length, 4);
                                    uniform(byteArrayOutputStream, 0L, 4);
                                    length = bArr3.length;
                                }
                                size += length;
                                i21++;
                                arrayList5 = arrayList;
                            }
                            ArrayList arrayList6 = arrayList5;
                            for (int i23 = 0; i23 < arrayList6.size(); i23++) {
                                byteArrayOutputStream.write((byte[]) arrayList6.get(i23));
                            }
                            return true;
                        }
                        throw new IllegalStateException("Expected size " + i18 + ", does not match actual size " + byteArray5.length);
                    }
                    throw new IllegalStateException("Expected size " + i12 + ", does not match actual size " + byteArray2.length);
                }
                throw new IllegalStateException("Expected size " + i10 + ", does not match actual size " + byteArray.length);
            } catch (Throwable th3) {
                try {
                    byteArrayOutputStream2.close();
                    throw th3;
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                    throw th3;
                }
            }
        }
        byte[] bArr4 = echo;
        if (Arrays.equals(bArr, bArr4)) {
            byte[] bravo2 = bravo(c1934aArr, bArr4);
            uniform(byteArrayOutputStream, c1934aArr.length, 1);
            uniform(byteArrayOutputStream, bravo2.length, 4);
            byte[] alpha3 = alpha(bravo2);
            uniform(byteArrayOutputStream, alpha3.length, 4);
            byteArrayOutputStream.write(alpha3);
            return true;
        }
        byte[] bArr5 = golf;
        if (Arrays.equals(bArr, bArr5)) {
            uniform(byteArrayOutputStream, c1934aArr.length, 1);
            for (C1934a c1934a4 : c1934aArr) {
                int size2 = c1934a4.india.size() * 4;
                String delta3 = delta(c1934a4.alpha, c1934a4.bravo, bArr5);
                Charset charset2 = StandardCharsets.UTF_8;
                victor(byteArrayOutputStream, delta3.getBytes(charset2).length);
                victor(byteArrayOutputStream, c1934a4.hotel.length);
                uniform(byteArrayOutputStream, size2, 4);
                uniform(byteArrayOutputStream, c1934a4.charlie, 4);
                byteArrayOutputStream.write(delta3.getBytes(charset2));
                Iterator it2 = c1934a4.india.keySet().iterator();
                while (it2.hasNext()) {
                    victor(byteArrayOutputStream, ((Integer) it2.next()).intValue());
                    victor(byteArrayOutputStream, 0);
                }
                for (int i24 : c1934a4.hotel) {
                    victor(byteArrayOutputStream, i24);
                }
            }
            return true;
        }
        byte[] bArr6 = foxtrot;
        if (Arrays.equals(bArr, bArr6)) {
            byte[] bravo3 = bravo(c1934aArr, bArr6);
            uniform(byteArrayOutputStream, c1934aArr.length, 1);
            uniform(byteArrayOutputStream, bravo3.length, 4);
            byte[] alpha4 = alpha(bravo3);
            uniform(byteArrayOutputStream, alpha4.length, 4);
            byteArrayOutputStream.write(alpha4);
            return true;
        }
        byte[] bArr7 = hotel;
        if (Arrays.equals(bArr, bArr7)) {
            victor(byteArrayOutputStream, c1934aArr.length);
            for (C1934a c1934a5 : c1934aArr) {
                String delta4 = delta(c1934a5.alpha, c1934a5.bravo, bArr7);
                Charset charset3 = StandardCharsets.UTF_8;
                victor(byteArrayOutputStream, delta4.getBytes(charset3).length);
                TreeMap treeMap = c1934a5.india;
                victor(byteArrayOutputStream, treeMap.size());
                victor(byteArrayOutputStream, c1934a5.hotel.length);
                uniform(byteArrayOutputStream, c1934a5.charlie, 4);
                byteArrayOutputStream.write(delta4.getBytes(charset3));
                Iterator it3 = treeMap.keySet().iterator();
                while (it3.hasNext()) {
                    victor(byteArrayOutputStream, ((Integer) it3.next()).intValue());
                }
                for (int i25 : c1934a5.hotel) {
                    victor(byteArrayOutputStream, i25);
                }
            }
            return true;
        }
        return false;
    }

    public static void papa(ByteArrayOutputStream byteArrayOutputStream, C1934a c1934a) {
        sierra(byteArrayOutputStream, c1934a);
        int[] iArr = c1934a.hotel;
        int length = iArr.length;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            int i10 = iArr[i4];
            victor(byteArrayOutputStream, i10 - i5);
            i4++;
            i5 = i10;
        }
        int i11 = c1934a.golf;
        byte[] bArr = new byte[(((i11 * 2) + 7) & (-8)) / 8];
        for (Map.Entry entry : c1934a.india.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            int intValue2 = ((Integer) entry.getValue()).intValue();
            if ((intValue2 & 2) != 0) {
                int i12 = intValue / 8;
                bArr[i12] = (byte) (bArr[i12] | (1 << (intValue % 8)));
            }
            if ((intValue2 & 4) != 0) {
                int i13 = intValue + i11;
                int i14 = i13 / 8;
                bArr[i14] = (byte) ((1 << (i13 % 8)) | bArr[i14]);
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void quebec(ByteArrayOutputStream byteArrayOutputStream, C1934a c1934a, String str) {
        Charset charset = StandardCharsets.UTF_8;
        victor(byteArrayOutputStream, str.getBytes(charset).length);
        victor(byteArrayOutputStream, c1934a.echo);
        uniform(byteArrayOutputStream, c1934a.foxtrot, 4);
        uniform(byteArrayOutputStream, c1934a.charlie, 4);
        uniform(byteArrayOutputStream, c1934a.golf, 4);
        byteArrayOutputStream.write(str.getBytes(charset));
    }

    public static void romeo(ByteArrayOutputStream byteArrayOutputStream, int i4, C1934a c1934a) {
        int bitCount = Integer.bitCount(i4 & (-2));
        int i5 = c1934a.golf;
        byte[] bArr = new byte[(((bitCount * i5) + 7) & (-8)) / 8];
        for (Map.Entry entry : c1934a.india.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            int intValue2 = ((Integer) entry.getValue()).intValue();
            int i10 = 0;
            for (int i11 = 1; i11 <= 4; i11 <<= 1) {
                if (i11 != 1 && (i11 & i4) != 0) {
                    if ((i11 & intValue2) == i11) {
                        int i12 = (i10 * i5) + intValue;
                        int i13 = i12 / 8;
                        bArr[i13] = (byte) ((1 << (i12 % 8)) | bArr[i13]);
                    }
                    i10++;
                }
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void sierra(ByteArrayOutputStream byteArrayOutputStream, C1934a c1934a) {
        int i4 = 0;
        for (Map.Entry entry : c1934a.india.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            if ((((Integer) entry.getValue()).intValue() & 1) != 0) {
                victor(byteArrayOutputStream, intValue - i4);
                victor(byteArrayOutputStream, 0);
                i4 = intValue;
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:(3:53|54|55)|57|(3:239|240|(4:242|243|244|245)(2:249|250))|59|(3:68|69|(3:76|77|(4:79|80|81|(1:75))(2:82|83))(3:(1:72)|73|(0)))|100|(2:104|(5:108|109|110|111|(2:113|114)(3:115|116|117))(2:106|107))|132|(1:134)(3:138|139|(13:143|144|145|146|147|148|149|150|152|(3:157|158|(9:160|(2:161|(1:163)(1:164))|165|166|167|168|169|170|171))|154|155|156)(2:141|142))|(1:136)|137) */
    /* JADX WARN: Code restructure failed: missing block: B:258:0x013a, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:259:0x013b, code lost:
    
        r20.charlie(7, r0);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01d9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0107 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x02f1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0174 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v55, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v26 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void tango(Context context, Executor executor, InterfaceC1935b interfaceC1935b, boolean z2) {
        boolean z10;
        FileInputStream fileInputStream;
        ?? r72;
        C1934a[] c1934aArr;
        C1934a[] c1934aArr2;
        C1934a[] c1934aArr3;
        byte[] bArr;
        ?? r73;
        boolean z11;
        boolean z12;
        Throwable th;
        Throwable th2;
        boolean z13;
        boolean z14;
        byte[] bArr2;
        ByteArrayOutputStream byteArrayOutputStream;
        int i4;
        F8.c cVar;
        FileInputStream delta2;
        boolean z15;
        boolean z16;
        boolean z17;
        Context applicationContext = context.getApplicationContext();
        String packageName = applicationContext.getPackageName();
        ApplicationInfo applicationInfo = applicationContext.getApplicationInfo();
        AssetManager assets = applicationContext.getAssets();
        String name = new File(applicationInfo.sourceDir).getName();
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
            File filesDir = context.getFilesDir();
            if (!z2) {
                File file = new File(filesDir, "profileinstaller_profileWrittenFor_lastUpdateTime.dat");
                if (file.exists()) {
                    try {
                        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
                        try {
                            long readLong = dataInputStream.readLong();
                            dataInputStream.close();
                            if (readLong == packageInfo.lastUpdateTime) {
                                z17 = true;
                            } else {
                                z17 = false;
                            }
                            if (z17) {
                                interfaceC1935b.charlie(2, null);
                            }
                        } finally {
                        }
                    } catch (IOException unused) {
                    }
                    if (z17) {
                        Log.d("ProfileInstaller", "Skipping profile installation for " + context.getPackageName());
                        AbstractC1940g.charlie(context, false);
                        return;
                    }
                }
                z17 = false;
                if (z17) {
                }
            }
            Log.d("ProfileInstaller", "Installing profile for " + context.getPackageName());
            File file2 = new File(new File("/data/misc/profiles/cur/0", packageName), "primary.prof");
            F8.c cVar2 = new F8.c(assets, executor, interfaceC1935b, name, file2);
            byte[] bArr3 = (byte[]) cVar2.delta;
            if (bArr3 == null) {
                cVar2.foxtrot(3, Integer.valueOf(Build.VERSION.SDK_INT));
            } else {
                if (file2.exists()) {
                    if (!file2.canWrite()) {
                        cVar2.foxtrot(4, null);
                    }
                    cVar2.alpha = true;
                    byte[] bArr4 = bravo;
                    try {
                        try {
                            fileInputStream = cVar2.delta(assets, "dexopt/baseline.prof");
                        } catch (FileNotFoundException e) {
                            interfaceC1935b.charlie(6, e);
                            fileInputStream = null;
                            r72 = 8;
                            r73 = 8;
                            if (fileInputStream != null) {
                            }
                            c1934aArr2 = (C1934a[]) cVar2.golf;
                            if (c1934aArr2 != null) {
                            }
                            InterfaceC1935b interfaceC1935b2 = (InterfaceC1935b) cVar2.charlie;
                            c1934aArr3 = (C1934a[]) cVar2.golf;
                            if (c1934aArr3 != null) {
                            }
                            bArr = (byte[]) cVar2.hotel;
                            if (bArr != null) {
                            }
                            if (z12) {
                            }
                            z14 = z12;
                            z15 = z13;
                            if (!z14) {
                            }
                            z16 = false;
                            AbstractC1940g.charlie(context, z16);
                        } catch (IOException e4) {
                            interfaceC1935b.charlie(7, e4);
                            fileInputStream = null;
                            r72 = 8;
                            r73 = 8;
                            if (fileInputStream != null) {
                            }
                            c1934aArr2 = (C1934a[]) cVar2.golf;
                            if (c1934aArr2 != null) {
                            }
                            InterfaceC1935b interfaceC1935b22 = (InterfaceC1935b) cVar2.charlie;
                            c1934aArr3 = (C1934a[]) cVar2.golf;
                            if (c1934aArr3 != null) {
                            }
                            bArr = (byte[]) cVar2.hotel;
                            if (bArr != null) {
                            }
                            if (z12) {
                            }
                            z14 = z12;
                            z15 = z13;
                            if (!z14) {
                            }
                            z16 = false;
                            AbstractC1940g.charlie(context, z16);
                        }
                        if (fileInputStream != null) {
                            try {
                                try {
                                } catch (IOException e5) {
                                    interfaceC1935b.charlie(7, e5);
                                    fileInputStream.close();
                                    c1934aArr = null;
                                    cVar2.golf = c1934aArr;
                                    c1934aArr2 = (C1934a[]) cVar2.golf;
                                    if (c1934aArr2 != null) {
                                    }
                                    InterfaceC1935b interfaceC1935b222 = (InterfaceC1935b) cVar2.charlie;
                                    c1934aArr3 = (C1934a[]) cVar2.golf;
                                    if (c1934aArr3 != null) {
                                    }
                                    bArr = (byte[]) cVar2.hotel;
                                    if (bArr != null) {
                                    }
                                    if (z12) {
                                    }
                                    z14 = z12;
                                    z15 = z13;
                                    if (!z14) {
                                    }
                                    z16 = false;
                                    AbstractC1940g.charlie(context, z16);
                                }
                            } catch (IllegalStateException e10) {
                                interfaceC1935b.charlie(8, e10);
                                fileInputStream.close();
                                c1934aArr = null;
                                cVar2.golf = c1934aArr;
                                c1934aArr2 = (C1934a[]) cVar2.golf;
                                if (c1934aArr2 != null) {
                                }
                                InterfaceC1935b interfaceC1935b2222 = (InterfaceC1935b) cVar2.charlie;
                                c1934aArr3 = (C1934a[]) cVar2.golf;
                                if (c1934aArr3 != null) {
                                }
                                bArr = (byte[]) cVar2.hotel;
                                if (bArr != null) {
                                }
                                if (z12) {
                                }
                                z14 = z12;
                                z15 = z13;
                                if (!z14) {
                                }
                                z16 = false;
                                AbstractC1940g.charlie(context, z16);
                            }
                            if (Arrays.equals(bArr4, foxtrot(fileInputStream, 4))) {
                                c1934aArr = lima(fileInputStream, foxtrot(fileInputStream, 4), (String) cVar2.foxtrot);
                                try {
                                    fileInputStream.close();
                                } catch (IOException e11) {
                                    interfaceC1935b.charlie(7, e11);
                                }
                                cVar2.golf = c1934aArr;
                            } else {
                                throw new IllegalStateException("Invalid magic");
                            }
                        }
                        c1934aArr2 = (C1934a[]) cVar2.golf;
                        if (c1934aArr2 != null && (i4 = Build.VERSION.SDK_INT) >= 24 && (i4 >= 31 || i4 == 24 || i4 == 25)) {
                            try {
                                delta2 = cVar2.delta(assets, "dexopt/baseline.profm");
                            } catch (FileNotFoundException e12) {
                                interfaceC1935b.charlie(9, e12);
                            } catch (IOException e13) {
                                interfaceC1935b.charlie(7, e13);
                            } catch (IllegalStateException e14) {
                                cVar2.golf = null;
                                interfaceC1935b.charlie(8, e14);
                            }
                            if (delta2 == null) {
                                try {
                                    if (Arrays.equals(charlie, foxtrot(delta2, 4))) {
                                        cVar2.golf = india(delta2, foxtrot(delta2, 4), bArr3, c1934aArr2);
                                        delta2.close();
                                        cVar = cVar2;
                                        if (cVar != null) {
                                            cVar2 = cVar;
                                        }
                                    } else {
                                        throw new IllegalStateException("Invalid magic");
                                    }
                                } finally {
                                }
                            } else {
                                if (delta2 != null) {
                                    delta2.close();
                                }
                                cVar = null;
                                if (cVar != null) {
                                }
                            }
                        }
                        InterfaceC1935b interfaceC1935b22222 = (InterfaceC1935b) cVar2.charlie;
                        c1934aArr3 = (C1934a[]) cVar2.golf;
                        if (c1934aArr3 != null && (bArr2 = (byte[]) cVar2.delta) != null) {
                            if (!cVar2.alpha) {
                                try {
                                    byteArrayOutputStream = new ByteArrayOutputStream();
                                    try {
                                        byteArrayOutputStream.write(bArr4);
                                        byteArrayOutputStream.write(bArr2);
                                    } finally {
                                    }
                                } catch (IOException e15) {
                                    interfaceC1935b22222.charlie(7, e15);
                                } catch (IllegalStateException e16) {
                                    interfaceC1935b22222.charlie(8, e16);
                                }
                                if (!oscar(byteArrayOutputStream, bArr2, c1934aArr3)) {
                                    interfaceC1935b22222.charlie(5, null);
                                    cVar2.golf = null;
                                    byteArrayOutputStream.close();
                                } else {
                                    cVar2.hotel = byteArrayOutputStream.toByteArray();
                                    byteArrayOutputStream.close();
                                    cVar2.golf = null;
                                }
                            } else {
                                throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                            }
                        }
                        bArr = (byte[]) cVar2.hotel;
                        if (bArr != null) {
                            z12 = false;
                            z13 = true;
                        } else {
                            try {
                                if (cVar2.alpha) {
                                    try {
                                        try {
                                            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
                                            try {
                                                try {
                                                    FileOutputStream fileOutputStream = new FileOutputStream((File) cVar2.echo);
                                                    try {
                                                        try {
                                                            FileChannel channel = fileOutputStream.getChannel();
                                                            try {
                                                                FileLock tryLock = channel.tryLock();
                                                                try {
                                                                    try {
                                                                        if (tryLock != null) {
                                                                            try {
                                                                                if (tryLock.isValid()) {
                                                                                    byte[] bArr5 = new byte[512];
                                                                                    while (true) {
                                                                                        int read = byteArrayInputStream.read(bArr5);
                                                                                        if (read <= 0) {
                                                                                            break;
                                                                                        } else {
                                                                                            fileOutputStream.write(bArr5, 0, read);
                                                                                        }
                                                                                    }
                                                                                    z13 = true;
                                                                                    cVar2.foxtrot(1, null);
                                                                                    tryLock.close();
                                                                                    channel.close();
                                                                                    fileOutputStream.close();
                                                                                    byteArrayInputStream.close();
                                                                                    cVar2.hotel = null;
                                                                                    cVar2.golf = null;
                                                                                    z12 = true;
                                                                                }
                                                                            } catch (Throwable th3) {
                                                                                th = th3;
                                                                                Throwable th4 = th;
                                                                                if (tryLock != null) {
                                                                                    try {
                                                                                        tryLock.close();
                                                                                        throw th4;
                                                                                    } catch (Throwable th5) {
                                                                                        th4.addSuppressed(th5);
                                                                                        throw th4;
                                                                                    }
                                                                                }
                                                                                throw th4;
                                                                            }
                                                                        }
                                                                        throw new IOException("Unable to acquire a lock on the underlying file channel.");
                                                                    } catch (Throwable th6) {
                                                                        th = th6;
                                                                        Throwable th7 = th;
                                                                        if (channel != null) {
                                                                            try {
                                                                                channel.close();
                                                                                throw th7;
                                                                            } catch (Throwable th8) {
                                                                                th7.addSuppressed(th8);
                                                                                throw th7;
                                                                            }
                                                                        }
                                                                        throw th7;
                                                                    }
                                                                } catch (Throwable th9) {
                                                                    th = th9;
                                                                }
                                                            } catch (Throwable th10) {
                                                                th = th10;
                                                            }
                                                        } catch (Throwable th11) {
                                                            th = th11;
                                                            th2 = th;
                                                            try {
                                                                fileOutputStream.close();
                                                                throw th2;
                                                            } catch (Throwable th12) {
                                                                th2.addSuppressed(th12);
                                                                throw th2;
                                                            }
                                                        }
                                                    } catch (Throwable th13) {
                                                        th = th13;
                                                        th2 = th;
                                                        fileOutputStream.close();
                                                        throw th2;
                                                    }
                                                } catch (Throwable th14) {
                                                    th = th14;
                                                    th = th;
                                                    try {
                                                        byteArrayInputStream.close();
                                                        throw th;
                                                    } catch (Throwable th15) {
                                                        th.addSuppressed(th15);
                                                        throw th;
                                                    }
                                                }
                                            } catch (Throwable th16) {
                                                th = th16;
                                                th = th;
                                                byteArrayInputStream.close();
                                                throw th;
                                            }
                                        } catch (FileNotFoundException e17) {
                                            e = e17;
                                            cVar2.foxtrot(6, e);
                                            z11 = r73;
                                            z12 = false;
                                            z13 = z11;
                                            if (z12) {
                                            }
                                            z14 = z12;
                                            z15 = z13;
                                            if (!z14) {
                                            }
                                            z16 = false;
                                            AbstractC1940g.charlie(context, z16);
                                        } catch (IOException e18) {
                                            e = e18;
                                            cVar2.foxtrot(7, e);
                                            z11 = r72;
                                            z12 = false;
                                            z13 = z11;
                                            if (z12) {
                                            }
                                            z14 = z12;
                                            z15 = z13;
                                            if (!z14) {
                                            }
                                            z16 = false;
                                            AbstractC1940g.charlie(context, z16);
                                        }
                                    } catch (FileNotFoundException e19) {
                                        e = e19;
                                        r73 = 1;
                                        cVar2.foxtrot(6, e);
                                        z11 = r73;
                                        z12 = false;
                                        z13 = z11;
                                        if (z12) {
                                        }
                                        z14 = z12;
                                        z15 = z13;
                                        if (!z14) {
                                        }
                                        z16 = false;
                                        AbstractC1940g.charlie(context, z16);
                                    } catch (IOException e20) {
                                        e = e20;
                                        r72 = 1;
                                        cVar2.foxtrot(7, e);
                                        z11 = r72;
                                        z12 = false;
                                        z13 = z11;
                                        if (z12) {
                                        }
                                        z14 = z12;
                                        z15 = z13;
                                        if (!z14) {
                                        }
                                        z16 = false;
                                        AbstractC1940g.charlie(context, z16);
                                    }
                                } else {
                                    throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                }
                            } finally {
                                cVar2.hotel = null;
                                cVar2.golf = null;
                            }
                        }
                        if (z12) {
                            echo(packageInfo, filesDir);
                        }
                        z14 = z12;
                        z15 = z13;
                    } finally {
                    }
                    r72 = 8;
                    r73 = 8;
                } else {
                    try {
                        if (!file2.createNewFile()) {
                            cVar2.foxtrot(4, null);
                        }
                        cVar2.alpha = true;
                        byte[] bArr42 = bravo;
                        fileInputStream = cVar2.delta(assets, "dexopt/baseline.prof");
                        r72 = 8;
                        r73 = 8;
                        if (fileInputStream != null) {
                        }
                        c1934aArr2 = (C1934a[]) cVar2.golf;
                        if (c1934aArr2 != null) {
                            delta2 = cVar2.delta(assets, "dexopt/baseline.profm");
                            if (delta2 == null) {
                            }
                        }
                        InterfaceC1935b interfaceC1935b222222 = (InterfaceC1935b) cVar2.charlie;
                        c1934aArr3 = (C1934a[]) cVar2.golf;
                        if (c1934aArr3 != null) {
                            if (!cVar2.alpha) {
                            }
                        }
                        bArr = (byte[]) cVar2.hotel;
                        if (bArr != null) {
                        }
                        if (z12) {
                        }
                        z14 = z12;
                        z15 = z13;
                    } catch (IOException unused2) {
                        z10 = true;
                        cVar2.foxtrot(4, null);
                    }
                }
                if (!z14 && z2) {
                    z16 = z15;
                } else {
                    z16 = false;
                }
                AbstractC1940g.charlie(context, z16);
            }
            z10 = true;
            z14 = false;
            z15 = z10;
            if (!z14) {
            }
            z16 = false;
            AbstractC1940g.charlie(context, z16);
        } catch (PackageManager.NameNotFoundException e21) {
            interfaceC1935b.charlie(7, e21);
            AbstractC1940g.charlie(context, false);
        }
    }

    public static void uniform(ByteArrayOutputStream byteArrayOutputStream, long j5, int i4) {
        byte[] bArr = new byte[i4];
        for (int i5 = 0; i5 < i4; i5++) {
            bArr[i5] = (byte) ((j5 >> (i5 * 8)) & 255);
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void victor(ByteArrayOutputStream byteArrayOutputStream, int i4) {
        uniform(byteArrayOutputStream, i4, 2);
    }
}
