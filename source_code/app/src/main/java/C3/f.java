package C3;

import Aa.m;
import android.os.Build;
import android.os.StrictMode;
import com.clevertap.android.sdk.Constants;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class f implements Closeable, AutoCloseable {
    public final File alpha;

    /* renamed from: b, reason: collision with root package name */
    public BufferedWriter f785b;

    /* renamed from: d, reason: collision with root package name */
    public int f787d;
    public final File purple;
    public final File red;
    public final File silver;
    public final long white;

    /* renamed from: a, reason: collision with root package name */
    public long f784a = 0;

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f786c = new LinkedHashMap(0, 0.75f, true);
    public long e = 0;

    /* renamed from: f, reason: collision with root package name */
    public final ThreadPoolExecutor f788f = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), (ThreadFactory) new Object());

    /* renamed from: g, reason: collision with root package name */
    public final b f789g = new b(0, this);
    public final int teal = 1;
    public final int yellow = 1;

    /* JADX WARN: Type inference failed for: r15v0, types: [java.lang.Object, java.util.concurrent.ThreadFactory] */
    public f(File file, long j5) {
        this.alpha = file;
        this.purple = new File(file, "journal");
        this.red = new File(file, "journal.tmp");
        this.silver = new File(file, "journal.bkp");
        this.white = j5;
    }

    public static void charlie(f fVar, d dVar, boolean z2) {
        synchronized (fVar) {
            e eVar = (e) dVar.red;
            if (eVar.foxtrot == dVar) {
                if (z2 && !eVar.echo) {
                    for (int i4 = 0; i4 < fVar.yellow; i4++) {
                        if (((boolean[]) dVar.purple)[i4]) {
                            if (!eVar.delta[i4].exists()) {
                                dVar.bravo();
                                return;
                            }
                        } else {
                            dVar.bravo();
                            throw new IllegalStateException("Newly created entry didn't create value for index " + i4);
                        }
                    }
                }
                for (int i5 = 0; i5 < fVar.yellow; i5++) {
                    File file = eVar.delta[i5];
                    if (z2) {
                        if (file.exists()) {
                            File file2 = eVar.charlie[i5];
                            file.renameTo(file2);
                            long j5 = eVar.bravo[i5];
                            long length = file2.length();
                            eVar.bravo[i5] = length;
                            fVar.f784a = (fVar.f784a - j5) + length;
                        }
                    } else {
                        foxtrot(file);
                    }
                }
                fVar.f787d++;
                eVar.foxtrot = null;
                if (eVar.echo | z2) {
                    eVar.echo = true;
                    fVar.f785b.append((CharSequence) "CLEAN");
                    fVar.f785b.append(' ');
                    fVar.f785b.append((CharSequence) eVar.alpha);
                    fVar.f785b.append((CharSequence) eVar.alpha());
                    fVar.f785b.append('\n');
                    if (z2) {
                        fVar.e++;
                    }
                } else {
                    fVar.f786c.remove(eVar.alpha);
                    fVar.f785b.append((CharSequence) "REMOVE");
                    fVar.f785b.append(' ');
                    fVar.f785b.append((CharSequence) eVar.alpha);
                    fVar.f785b.append('\n');
                }
                juliet(fVar.f785b);
                if (fVar.f784a > fVar.white || fVar.quebec()) {
                    fVar.f788f.submit(fVar.f789g);
                }
                return;
            }
            throw new IllegalStateException();
        }
    }

    public static void echo(BufferedWriter bufferedWriter) {
        StrictMode.ThreadPolicy.Builder permitUnbufferedIo;
        if (Build.VERSION.SDK_INT < 26) {
            bufferedWriter.close();
            return;
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        permitUnbufferedIo = new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo();
        StrictMode.setThreadPolicy(permitUnbufferedIo.build());
        try {
            bufferedWriter.close();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public static void foxtrot(File file) {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    public static void gray(File file, File file2, boolean z2) {
        if (z2) {
            foxtrot(file2);
        }
        if (file.renameTo(file2)) {
        } else {
            throw new IOException();
        }
    }

    public static void juliet(BufferedWriter bufferedWriter) {
        StrictMode.ThreadPolicy.Builder permitUnbufferedIo;
        if (Build.VERSION.SDK_INT < 26) {
            bufferedWriter.flush();
            return;
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        permitUnbufferedIo = new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo();
        StrictMode.setThreadPolicy(permitUnbufferedIo.build());
        try {
            bufferedWriter.flush();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public static f uniform(File file, long j5) {
        if (j5 > 0) {
            File file2 = new File(file, "journal.bkp");
            if (file2.exists()) {
                File file3 = new File(file, "journal");
                if (file3.exists()) {
                    file2.delete();
                } else {
                    gray(file2, file3, false);
                }
            }
            f fVar = new f(file, j5);
            if (fVar.purple.exists()) {
                try {
                    fVar.beige();
                    fVar.azure();
                    return fVar;
                } catch (IOException e) {
                    System.out.println("DiskLruCache " + file + " is corrupt: " + e.getMessage() + ", removing");
                    fVar.close();
                    i.alpha(fVar.alpha);
                }
            }
            file.mkdirs();
            f fVar2 = new f(file, j5);
            fVar2.crimson();
            return fVar2;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    public final void azure() {
        foxtrot(this.red);
        Iterator it = this.f786c.values().iterator();
        while (it.hasNext()) {
            e eVar = (e) it.next();
            d dVar = eVar.foxtrot;
            int i4 = this.yellow;
            int i5 = 0;
            if (dVar == null) {
                while (i5 < i4) {
                    this.f784a += eVar.bravo[i5];
                    i5++;
                }
            } else {
                eVar.foxtrot = null;
                while (i5 < i4) {
                    foxtrot(eVar.charlie[i5]);
                    foxtrot(eVar.delta[i5]);
                    i5++;
                }
                it.remove();
            }
        }
    }

    public final void beige() {
        File file = this.purple;
        h hVar = new h(new FileInputStream(file), i.alpha, 0);
        try {
            String echo = hVar.echo();
            String echo2 = hVar.echo();
            String echo3 = hVar.echo();
            String echo4 = hVar.echo();
            String echo5 = hVar.echo();
            if ("libcore.io.DiskLruCache".equals(echo) && "1".equals(echo2) && Integer.toString(this.teal).equals(echo3) && Integer.toString(this.yellow).equals(echo4) && "".equals(echo5)) {
                int i4 = 0;
                while (true) {
                    try {
                        blue(hVar.echo());
                        i4++;
                    } catch (EOFException unused) {
                        this.f787d = i4 - this.f786c.size();
                        if (hVar.white == -1) {
                            crimson();
                        } else {
                            this.f785b = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file, true), i.alpha));
                        }
                        try {
                            hVar.close();
                            return;
                        } catch (RuntimeException e) {
                            throw e;
                        } catch (Exception unused2) {
                            return;
                        }
                    }
                }
            } else {
                throw new IOException("unexpected journal header: [" + echo + ", " + echo2 + ", " + echo4 + ", " + echo5 + Constants.AES_SUFFIX);
            }
        } catch (Throwable th) {
            try {
                hVar.close();
            } catch (RuntimeException e4) {
                throw e4;
            } catch (Exception unused3) {
            }
            throw th;
        }
    }

    public final void blue(String str) {
        String substring;
        int indexOf = str.indexOf(32);
        if (indexOf != -1) {
            int i4 = indexOf + 1;
            int indexOf2 = str.indexOf(32, i4);
            LinkedHashMap linkedHashMap = this.f786c;
            if (indexOf2 == -1) {
                substring = str.substring(i4);
                if (indexOf == 6 && str.startsWith("REMOVE")) {
                    linkedHashMap.remove(substring);
                    return;
                }
            } else {
                substring = str.substring(i4, indexOf2);
            }
            e eVar = (e) linkedHashMap.get(substring);
            if (eVar == null) {
                eVar = new e(this, substring);
                linkedHashMap.put(substring, eVar);
            }
            if (indexOf2 != -1 && indexOf == 5 && str.startsWith("CLEAN")) {
                String[] split = str.substring(indexOf2 + 1).split(" ");
                eVar.echo = true;
                eVar.foxtrot = null;
                if (split.length == eVar.golf.yellow) {
                    for (int i5 = 0; i5 < split.length; i5++) {
                        try {
                            eVar.bravo[i5] = Long.parseLong(split[i5]);
                        } catch (NumberFormatException unused) {
                            throw new IOException("unexpected journal line: " + Arrays.toString(split));
                        }
                    }
                    return;
                }
                throw new IOException("unexpected journal line: " + Arrays.toString(split));
            }
            if (indexOf2 == -1 && indexOf == 5 && str.startsWith("DIRTY")) {
                eVar.foxtrot = new d(this, eVar);
                return;
            } else if (indexOf2 == -1 && indexOf == 4 && str.startsWith("READ")) {
                return;
            } else {
                throw new IOException("unexpected journal line: ".concat(str));
            }
        }
        throw new IOException("unexpected journal line: ".concat(str));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        try {
            if (this.f785b == null) {
                return;
            }
            Iterator it = new ArrayList(this.f786c.values()).iterator();
            while (it.hasNext()) {
                d dVar = ((e) it.next()).foxtrot;
                if (dVar != null) {
                    dVar.bravo();
                }
            }
            green();
            echo(this.f785b);
            this.f785b = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void crimson() {
        try {
            BufferedWriter bufferedWriter = this.f785b;
            if (bufferedWriter != null) {
                echo(bufferedWriter);
            }
            BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.red), i.alpha));
            try {
                bufferedWriter2.write("libcore.io.DiskLruCache");
                bufferedWriter2.write("\n");
                bufferedWriter2.write("1");
                bufferedWriter2.write("\n");
                bufferedWriter2.write(Integer.toString(this.teal));
                bufferedWriter2.write("\n");
                bufferedWriter2.write(Integer.toString(this.yellow));
                bufferedWriter2.write("\n");
                bufferedWriter2.write("\n");
                for (e eVar : this.f786c.values()) {
                    if (eVar.foxtrot != null) {
                        bufferedWriter2.write("DIRTY " + eVar.alpha + '\n');
                    } else {
                        bufferedWriter2.write("CLEAN " + eVar.alpha + eVar.alpha() + '\n');
                    }
                }
                echo(bufferedWriter2);
                if (this.purple.exists()) {
                    gray(this.purple, this.silver, true);
                }
                gray(this.red, this.purple, false);
                this.silver.delete();
                this.f785b = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.purple, true), i.alpha));
            } catch (Throwable th) {
                echo(bufferedWriter2);
                throw th;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final d golf(String str) {
        synchronized (this) {
            try {
                if (this.f785b != null) {
                    e eVar = (e) this.f786c.get(str);
                    if (eVar == null) {
                        eVar = new e(this, str);
                        this.f786c.put(str, eVar);
                    } else if (eVar.foxtrot != null) {
                        return null;
                    }
                    d dVar = new d(this, eVar);
                    eVar.foxtrot = dVar;
                    this.f785b.append((CharSequence) "DIRTY");
                    this.f785b.append(' ');
                    this.f785b.append((CharSequence) str);
                    this.f785b.append('\n');
                    juliet(this.f785b);
                    return dVar;
                }
                throw new IllegalStateException("cache is closed");
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void green() {
        while (this.f784a > this.white) {
            String str = (String) ((Map.Entry) this.f786c.entrySet().iterator().next()).getKey();
            synchronized (this) {
                try {
                    if (this.f785b != null) {
                        e eVar = (e) this.f786c.get(str);
                        if (eVar != null && eVar.foxtrot == null) {
                            for (int i4 = 0; i4 < this.yellow; i4++) {
                                File file = eVar.charlie[i4];
                                if (file.exists() && !file.delete()) {
                                    throw new IOException("failed to delete " + file);
                                }
                                long j5 = this.f784a;
                                long[] jArr = eVar.bravo;
                                this.f784a = j5 - jArr[i4];
                                jArr[i4] = 0;
                            }
                            this.f787d++;
                            this.f785b.append((CharSequence) "REMOVE");
                            this.f785b.append(' ');
                            this.f785b.append((CharSequence) str);
                            this.f785b.append('\n');
                            this.f786c.remove(str);
                            if (quebec()) {
                                this.f788f.submit(this.f789g);
                            }
                        }
                    } else {
                        throw new IllegalStateException("cache is closed");
                    }
                } finally {
                }
            }
        }
    }

    public final synchronized m papa(String str) {
        if (this.f785b != null) {
            e eVar = (e) this.f786c.get(str);
            if (eVar == null) {
                return null;
            }
            if (!eVar.echo) {
                return null;
            }
            for (File file : eVar.charlie) {
                if (!file.exists()) {
                    return null;
                }
            }
            this.f787d++;
            this.f785b.append((CharSequence) "READ");
            this.f785b.append(' ');
            this.f785b.append((CharSequence) str);
            this.f785b.append('\n');
            if (quebec()) {
                this.f788f.submit(this.f789g);
            }
            return new m(7, eVar.charlie);
        }
        throw new IllegalStateException("cache is closed");
    }

    public final boolean quebec() {
        int i4 = this.f787d;
        if (i4 >= 2000 && i4 >= this.f786c.size()) {
            return true;
        }
        return false;
    }
}
