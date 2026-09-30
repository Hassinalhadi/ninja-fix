package i9;

import C3.h;
import ao.ad;
import com.clevertap.android.sdk.Constants;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class f implements Closeable, AutoCloseable {

    /* renamed from: h, reason: collision with root package name */
    public static final Pattern f12767h = Pattern.compile("[a-z0-9_-]{1,64}");

    /* renamed from: i, reason: collision with root package name */
    public static final C1905a f12768i = new OutputStream();
    public final File alpha;

    /* renamed from: b, reason: collision with root package name */
    public BufferedWriter f12770b;

    /* renamed from: d, reason: collision with root package name */
    public int f12772d;
    public final File purple;
    public final File red;
    public final File silver;
    public final long white;

    /* renamed from: a, reason: collision with root package name */
    public long f12769a = 0;

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f12771c = new LinkedHashMap(0, 0.75f, true);
    public long e = 0;

    /* renamed from: f, reason: collision with root package name */
    public final ThreadPoolExecutor f12773f = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue());

    /* renamed from: g, reason: collision with root package name */
    public final C3.b f12774g = new C3.b(4, this);
    public final int teal = 1;
    public final int yellow = 1;

    public f(File file, long j5) {
        this.alpha = file;
        this.purple = new File(file, "journal");
        this.red = new File(file, "journal.tmp");
        this.silver = new File(file, "journal.bkp");
        this.white = j5;
    }

    public static void charlie(f fVar, C1907c c1907c, boolean z2) {
        synchronized (fVar) {
            d dVar = c1907c.alpha;
            if (dVar.delta == c1907c) {
                if (z2 && !dVar.charlie) {
                    for (int i4 = 0; i4 < fVar.yellow; i4++) {
                        if (c1907c.bravo[i4]) {
                            if (!dVar.bravo(i4).exists()) {
                                c1907c.alpha();
                                return;
                            }
                        } else {
                            c1907c.alpha();
                            throw new IllegalStateException("Newly created entry didn't create value for index " + i4);
                        }
                    }
                }
                for (int i5 = 0; i5 < fVar.yellow; i5++) {
                    File bravo = dVar.bravo(i5);
                    if (z2) {
                        if (bravo.exists()) {
                            File alpha = dVar.alpha(i5);
                            bravo.renameTo(alpha);
                            long j5 = dVar.bravo[i5];
                            long length = alpha.length();
                            dVar.bravo[i5] = length;
                            fVar.f12769a = (fVar.f12769a - j5) + length;
                        }
                    } else {
                        echo(bravo);
                    }
                }
                fVar.f12772d++;
                dVar.delta = null;
                if (dVar.charlie | z2) {
                    dVar.charlie = true;
                    fVar.f12770b.write("CLEAN " + dVar.alpha + dVar.charlie() + '\n');
                    if (z2) {
                        fVar.e++;
                    }
                } else {
                    fVar.f12771c.remove(dVar.alpha);
                    fVar.f12770b.write("REMOVE " + dVar.alpha + '\n');
                }
                fVar.f12770b.flush();
                if (fVar.f12769a > fVar.white || fVar.juliet()) {
                    fVar.f12773f.submit(fVar.f12774g);
                }
                return;
            }
            throw new IllegalStateException();
        }
    }

    public static void crimson(File file, File file2, boolean z2) {
        if (z2) {
            echo(file2);
        }
        if (file.renameTo(file2)) {
        } else {
            throw new IOException();
        }
    }

    public static void echo(File file) {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    public static void green(String str) {
        if (f12767h.matcher(str).matches()) {
        } else {
            throw new IllegalArgumentException(ad.gray("keys must match regex [a-z0-9_-]{1,64}: \"", str, "\""));
        }
    }

    public static f papa(File file, long j5) {
        if (j5 > 0) {
            File file2 = new File(file, "journal.bkp");
            if (file2.exists()) {
                File file3 = new File(file, "journal");
                if (file3.exists()) {
                    file2.delete();
                } else {
                    crimson(file2, file3, false);
                }
            }
            f fVar = new f(file, j5);
            File file4 = fVar.purple;
            if (file4.exists()) {
                try {
                    fVar.uniform();
                    fVar.quebec();
                    fVar.f12770b = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file4, true), g.alpha));
                    return fVar;
                } catch (IOException e) {
                    System.out.println("DiskLruCache " + file + " is corrupt: " + e.getMessage() + ", removing");
                    fVar.close();
                    g.alpha(fVar.alpha);
                }
            }
            file.mkdirs();
            f fVar2 = new f(file, j5);
            fVar2.beige();
            return fVar2;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    public final void azure(String str) {
        String substring;
        int indexOf = str.indexOf(32);
        if (indexOf != -1) {
            int i4 = indexOf + 1;
            int indexOf2 = str.indexOf(32, i4);
            LinkedHashMap linkedHashMap = this.f12771c;
            if (indexOf2 == -1) {
                substring = str.substring(i4);
                if (indexOf == 6 && str.startsWith("REMOVE")) {
                    linkedHashMap.remove(substring);
                    return;
                }
            } else {
                substring = str.substring(i4, indexOf2);
            }
            d dVar = (d) linkedHashMap.get(substring);
            if (dVar == null) {
                dVar = new d(this, substring);
                linkedHashMap.put(substring, dVar);
            }
            if (indexOf2 != -1 && indexOf == 5 && str.startsWith("CLEAN")) {
                String[] split = str.substring(indexOf2 + 1).split(" ");
                dVar.charlie = true;
                dVar.delta = null;
                if (split.length == dVar.echo.yellow) {
                    for (int i5 = 0; i5 < split.length; i5++) {
                        try {
                            dVar.bravo[i5] = Long.parseLong(split[i5]);
                        } catch (NumberFormatException unused) {
                            throw new IOException("unexpected journal line: " + Arrays.toString(split));
                        }
                    }
                    return;
                }
                throw new IOException("unexpected journal line: " + Arrays.toString(split));
            }
            if (indexOf2 == -1 && indexOf == 5 && str.startsWith("DIRTY")) {
                dVar.delta = new C1907c(this, dVar);
                return;
            } else if (indexOf2 == -1 && indexOf == 4 && str.startsWith("READ")) {
                return;
            } else {
                throw new IOException("unexpected journal line: ".concat(str));
            }
        }
        throw new IOException("unexpected journal line: ".concat(str));
    }

    public final synchronized void beige() {
        try {
            BufferedWriter bufferedWriter = this.f12770b;
            if (bufferedWriter != null) {
                bufferedWriter.close();
            }
            BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.red), g.alpha));
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
                for (d dVar : this.f12771c.values()) {
                    if (dVar.delta != null) {
                        bufferedWriter2.write("DIRTY " + dVar.alpha + '\n');
                    } else {
                        bufferedWriter2.write("CLEAN " + dVar.alpha + dVar.charlie() + '\n');
                    }
                }
                bufferedWriter2.close();
                if (this.purple.exists()) {
                    crimson(this.purple, this.silver, true);
                }
                crimson(this.red, this.purple, false);
                this.silver.delete();
                this.f12770b = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.purple, true), g.alpha));
            } catch (Throwable th) {
                bufferedWriter2.close();
                throw th;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void blue(String str) {
        try {
            if (this.f12770b != null) {
                green(str);
                d dVar = (d) this.f12771c.get(str);
                if (dVar != null && dVar.delta == null) {
                    for (int i4 = 0; i4 < this.yellow; i4++) {
                        File alpha = dVar.alpha(i4);
                        if (alpha.exists() && !alpha.delete()) {
                            throw new IOException("failed to delete " + alpha);
                        }
                        long j5 = this.f12769a;
                        long[] jArr = dVar.bravo;
                        this.f12769a = j5 - jArr[i4];
                        jArr[i4] = 0;
                    }
                    this.f12772d++;
                    this.f12770b.append((CharSequence) ("REMOVE " + str + '\n'));
                    this.f12771c.remove(str);
                    if (juliet()) {
                        this.f12773f.submit(this.f12774g);
                    }
                    return;
                }
                return;
            }
            throw new IllegalStateException("cache is closed");
        } finally {
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        try {
            if (this.f12770b == null) {
                return;
            }
            Iterator it = new ArrayList(this.f12771c.values()).iterator();
            while (it.hasNext()) {
                C1907c c1907c = ((d) it.next()).delta;
                if (c1907c != null) {
                    c1907c.alpha();
                }
            }
            gray();
            this.f12770b.close();
            this.f12770b = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final C1907c foxtrot(String str) {
        synchronized (this) {
            try {
                if (this.f12770b != null) {
                    green(str);
                    d dVar = (d) this.f12771c.get(str);
                    if (dVar == null) {
                        dVar = new d(this, str);
                        this.f12771c.put(str, dVar);
                    } else if (dVar.delta != null) {
                        return null;
                    }
                    C1907c c1907c = new C1907c(this, dVar);
                    dVar.delta = c1907c;
                    this.f12770b.write("DIRTY " + str + '\n');
                    this.f12770b.flush();
                    return c1907c;
                }
                throw new IllegalStateException("cache is closed");
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized e golf(String str) {
        InputStream inputStream;
        if (this.f12770b != null) {
            green(str);
            d dVar = (d) this.f12771c.get(str);
            if (dVar == null) {
                return null;
            }
            if (!dVar.charlie) {
                return null;
            }
            InputStream[] inputStreamArr = new InputStream[this.yellow];
            for (int i4 = 0; i4 < this.yellow; i4++) {
                try {
                    inputStreamArr[i4] = new FileInputStream(dVar.alpha(i4));
                } catch (FileNotFoundException unused) {
                    for (int i5 = 0; i5 < this.yellow && (inputStream = inputStreamArr[i5]) != null; i5++) {
                        Charset charset = g.alpha;
                        try {
                            inputStream.close();
                        } catch (RuntimeException e) {
                            throw e;
                        } catch (Exception unused2) {
                        }
                    }
                    return null;
                }
            }
            this.f12772d++;
            this.f12770b.append((CharSequence) ("READ " + str + '\n'));
            if (juliet()) {
                this.f12773f.submit(this.f12774g);
            }
            return new e(inputStreamArr, dVar.bravo);
        }
        throw new IllegalStateException("cache is closed");
    }

    public final void gray() {
        while (this.f12769a > this.white) {
            blue((String) ((Map.Entry) this.f12771c.entrySet().iterator().next()).getKey());
        }
    }

    public final boolean juliet() {
        int i4 = this.f12772d;
        if (i4 >= 2000 && i4 >= this.f12771c.size()) {
            return true;
        }
        return false;
    }

    public final void quebec() {
        echo(this.red);
        Iterator it = this.f12771c.values().iterator();
        while (it.hasNext()) {
            d dVar = (d) it.next();
            C1907c c1907c = dVar.delta;
            int i4 = this.yellow;
            int i5 = 0;
            if (c1907c == null) {
                while (i5 < i4) {
                    this.f12769a += dVar.bravo[i5];
                    i5++;
                }
            } else {
                dVar.delta = null;
                while (i5 < i4) {
                    echo(dVar.alpha(i5));
                    echo(dVar.bravo(i5));
                    i5++;
                }
                it.remove();
            }
        }
    }

    public final void uniform() {
        h hVar = new h(new FileInputStream(this.purple), g.alpha, 1);
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
                        azure(hVar.echo());
                        i4++;
                    } catch (EOFException unused) {
                        this.f12772d = i4 - this.f12771c.size();
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
}
