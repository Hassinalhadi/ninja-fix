package X1;

import android.content.SharedPreferences;
import android.util.Log;
import av.q;
import com.checkout.components.redirecthandler.RedirectEventValues;
import delivery.samurai.android.AndroidApp;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileFilter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.zip.CRC32;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.http2.Http2Stream;
import t6.ad;

/* loaded from: classes3.dex */
public final class d implements Closeable, AutoCloseable {
    public final File alpha;
    public final long purple;
    public final File red;
    public final RandomAccessFile silver;
    public final FileChannel teal;
    public final FileLock white;

    public d(File file, File file2) {
        Log.i("MultiDex", "MultiDexExtractor(" + file.getPath() + ", " + file2.getPath() + ")");
        this.alpha = file;
        this.red = file2;
        this.purple = foxtrot(file);
        File file3 = new File(file2, "MultiDex.lock");
        RandomAccessFile randomAccessFile = new RandomAccessFile(file3, "rw");
        this.silver = randomAccessFile;
        try {
            FileChannel channel = randomAccessFile.getChannel();
            this.teal = channel;
            try {
                Log.i("MultiDex", "Blocking on lock " + file3.getPath());
                this.white = channel.lock();
                Log.i("MultiDex", file3.getPath() + " locked");
            } catch (IOException e) {
                e = e;
                charlie(this.teal);
                throw e;
            } catch (Error e4) {
                e = e4;
                charlie(this.teal);
                throw e;
            } catch (RuntimeException e5) {
                e = e5;
                charlie(this.teal);
                throw e;
            }
        } catch (IOException e10) {
            e = e10;
            charlie(this.silver);
            throw e;
        } catch (Error e11) {
            e = e11;
            charlie(this.silver);
            throw e;
        } catch (RuntimeException e12) {
            e = e12;
            charlie(this.silver);
            throw e;
        }
    }

    public static void charlie(Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException e) {
            Log.w("MultiDex", "Failed to close resource", e);
        }
    }

    public static void echo(ZipFile zipFile, ZipEntry zipEntry, c cVar, String str) {
        InputStream inputStream = zipFile.getInputStream(zipEntry);
        File createTempFile = File.createTempFile(q.echo("tmp-", str), ".zip", cVar.getParentFile());
        Log.i("MultiDex", "Extracting " + createTempFile.getPath());
        try {
            ZipOutputStream zipOutputStream = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(createTempFile)));
            try {
                ZipEntry zipEntry2 = new ZipEntry("classes.dex");
                zipEntry2.setTime(zipEntry.getTime());
                zipOutputStream.putNextEntry(zipEntry2);
                byte[] bArr = new byte[Http2.INITIAL_MAX_FRAME_SIZE];
                for (int read = inputStream.read(bArr); read != -1; read = inputStream.read(bArr)) {
                    zipOutputStream.write(bArr, 0, read);
                }
                zipOutputStream.closeEntry();
                zipOutputStream.close();
                if (createTempFile.setReadOnly()) {
                    Log.i("MultiDex", "Renaming to " + cVar.getPath());
                    if (createTempFile.renameTo(cVar)) {
                        charlie(inputStream);
                        createTempFile.delete();
                        return;
                    }
                    throw new IOException("Failed to rename \"" + createTempFile.getAbsolutePath() + "\" to \"" + cVar.getAbsolutePath() + "\"");
                }
                throw new IOException("Failed to mark readonly \"" + createTempFile.getAbsolutePath() + "\" (tmp of \"" + cVar.getAbsolutePath() + "\")");
            } catch (Throwable th) {
                zipOutputStream.close();
                throw th;
            }
        } catch (Throwable th2) {
            charlie(inputStream);
            createTempFile.delete();
            throw th2;
        }
    }

    public static long foxtrot(File file) {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
        try {
            E8.d alpha = ad.alpha(randomAccessFile);
            CRC32 crc32 = new CRC32();
            long j5 = alpha.bravo;
            randomAccessFile.seek(alpha.alpha);
            int min = (int) Math.min(Http2Stream.EMIT_BUFFER_SIZE, j5);
            byte[] bArr = new byte[Http2.INITIAL_MAX_FRAME_SIZE];
            int read = randomAccessFile.read(bArr, 0, min);
            while (read != -1) {
                crc32.update(bArr, 0, read);
                j5 -= read;
                if (j5 == 0) {
                    break;
                }
                read = randomAccessFile.read(bArr, 0, (int) Math.min(Http2Stream.EMIT_BUFFER_SIZE, j5));
            }
            long value = crc32.getValue();
            randomAccessFile.close();
            if (value == -1) {
                return value - 1;
            }
            return value;
        } catch (Throwable th) {
            randomAccessFile.close();
            throw th;
        }
    }

    public static void quebec(AndroidApp androidApp, long j5, long j6, ArrayList arrayList) {
        SharedPreferences.Editor edit = androidApp.getSharedPreferences("multidex.version", 4).edit();
        edit.putLong("timestamp", j5);
        edit.putLong("crc", j6);
        edit.putInt("dex.number", arrayList.size() + 1);
        Iterator it = arrayList.iterator();
        int i4 = 2;
        while (it.hasNext()) {
            c cVar = (c) it.next();
            edit.putLong(ao.ad.zulu(i4, "dex.crc."), cVar.alpha);
            edit.putLong("dex.time." + i4, cVar.lastModified());
            i4++;
        }
        edit.commit();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.white.release();
        this.teal.close();
        this.silver.close();
    }

    public final ArrayList golf(AndroidApp androidApp, boolean z2) {
        ArrayList arrayList;
        StringBuilder sb2 = new StringBuilder("MultiDexExtractor.load(");
        File file = this.alpha;
        sb2.append(file.getPath());
        sb2.append(", ");
        sb2.append(z2);
        sb2.append(", )");
        Log.i("MultiDex", sb2.toString());
        if (this.white.isValid()) {
            if (!z2) {
                SharedPreferences sharedPreferences = androidApp.getSharedPreferences("multidex.version", 4);
                long j5 = sharedPreferences.getLong("timestamp", -1L);
                long lastModified = file.lastModified();
                if (lastModified == -1) {
                    lastModified--;
                }
                if (j5 == lastModified && sharedPreferences.getLong("crc", -1L) == this.purple) {
                    try {
                        arrayList = juliet(androidApp);
                    } catch (IOException e) {
                        Log.w("MultiDex", "Failed to reload existing extracted secondary dex files, falling back to fresh extraction", e);
                        ArrayList papa = papa();
                        long lastModified2 = file.lastModified();
                        if (lastModified2 == -1) {
                            lastModified2--;
                        }
                        quebec(androidApp, lastModified2, this.purple, papa);
                        arrayList = papa;
                    }
                    Log.i("MultiDex", "load found " + arrayList.size() + " secondary dex files");
                    return arrayList;
                }
            }
            if (z2) {
                Log.i("MultiDex", "Forced extraction must be performed.");
            } else {
                Log.i("MultiDex", "Detected that extraction must be performed.");
            }
            ArrayList papa2 = papa();
            long lastModified3 = file.lastModified();
            if (lastModified3 == -1) {
                lastModified3--;
            }
            quebec(androidApp, lastModified3, this.purple, papa2);
            arrayList = papa2;
            Log.i("MultiDex", "load found " + arrayList.size() + " secondary dex files");
            return arrayList;
        }
        throw new IllegalStateException("MultiDexExtractor was closed");
    }

    public final ArrayList juliet(AndroidApp androidApp) {
        Log.i("MultiDex", "loading existing secondary dex files");
        String str = this.alpha.getName() + ".classes";
        SharedPreferences sharedPreferences = androidApp.getSharedPreferences("multidex.version", 4);
        int i4 = sharedPreferences.getInt("dex.number", 1);
        ArrayList arrayList = new ArrayList(i4 - 1);
        for (int i5 = 2; i5 <= i4; i5++) {
            c cVar = new c(this.red, str + i5 + ".zip");
            if (cVar.isFile()) {
                cVar.alpha = foxtrot(cVar);
                long j5 = sharedPreferences.getLong("dex.crc." + i5, -1L);
                long j6 = sharedPreferences.getLong("dex.time." + i5, -1L);
                long lastModified = cVar.lastModified();
                if (j6 == lastModified && j5 == cVar.alpha) {
                    arrayList.add(cVar);
                } else {
                    StringBuilder sb2 = new StringBuilder("Invalid extracted dex: ");
                    sb2.append(cVar);
                    sb2.append(" (key \"\"), expected modification time: ");
                    sb2.append(j6);
                    Q0.c.amber(sb2, ", modification time: ", lastModified, ", expected crc: ");
                    sb2.append(j5);
                    sb2.append(", file crc: ");
                    sb2.append(cVar.alpha);
                    throw new IOException(sb2.toString());
                }
            } else {
                throw new IOException("Missing extracted secondary dex file '" + cVar.getPath() + "'");
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.io.FileFilter, java.lang.Object] */
    public final ArrayList papa() {
        Throwable th;
        boolean z2;
        String str;
        StringBuilder sb2 = new StringBuilder();
        File file = this.alpha;
        sb2.append(file.getName());
        sb2.append(".classes");
        String sb3 = sb2.toString();
        ?? obj = new Object();
        File file2 = this.red;
        File[] listFiles = file2.listFiles((FileFilter) obj);
        String str2 = "MultiDex";
        if (listFiles == null) {
            Log.w("MultiDex", "Failed to list secondary dex dir content (" + file2.getPath() + ").");
        } else {
            for (File file3 : listFiles) {
                Log.i("MultiDex", "Trying to delete old file " + file3.getPath() + " of size " + file3.length());
                if (!file3.delete()) {
                    Log.w("MultiDex", "Failed to delete old file " + file3.getPath());
                } else {
                    Log.i("MultiDex", "Deleted old file " + file3.getPath());
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        ZipFile zipFile = new ZipFile(file);
        try {
            int i4 = 2;
            ZipEntry entry = zipFile.getEntry("classes2.dex");
            while (entry != null) {
                c cVar = new c(file2, sb3 + i4 + ".zip");
                arrayList.add(cVar);
                Log.i(str2, "Extraction is needed for file " + cVar);
                int i5 = 0;
                boolean z10 = false;
                while (i5 < 3 && !z10) {
                    int i10 = i5 + 1;
                    echo(zipFile, entry, cVar, sb3);
                    String str3 = str2;
                    try {
                        cVar.alpha = foxtrot(cVar);
                        z2 = true;
                        str2 = str3;
                    } catch (IOException e) {
                        try {
                            str2 = str3;
                            Log.w(str2, "Failed to read crc from " + cVar.getAbsolutePath(), e);
                            z2 = false;
                        } catch (Throwable th2) {
                            th = th2;
                            str2 = str3;
                            th = th;
                            try {
                                zipFile.close();
                                throw th;
                            } catch (IOException e4) {
                                Log.w(str2, "Failed to close resource", e4);
                                throw th;
                            }
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        str2 = str3;
                        zipFile.close();
                        throw th;
                    }
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("Extraction ");
                    if (z2) {
                        str = RedirectEventValues.RESULT_SUCCEEDED;
                    } else {
                        str = RedirectEventValues.RESULT_FAILED;
                    }
                    sb4.append(str);
                    sb4.append(" '");
                    sb4.append(cVar.getAbsolutePath());
                    sb4.append("': length ");
                    boolean z11 = z2;
                    sb4.append(cVar.length());
                    sb4.append(" - crc: ");
                    sb4.append(cVar.alpha);
                    Log.i(str2, sb4.toString());
                    if (!z11) {
                        cVar.delete();
                        if (cVar.exists()) {
                            Log.w(str2, "Failed to delete corrupted secondary dex '" + cVar.getPath() + "'");
                        }
                    }
                    i5 = i10;
                    z10 = z11;
                }
                if (z10) {
                    i4++;
                    entry = zipFile.getEntry("classes" + i4 + ".dex");
                } else {
                    throw new IOException("Could not create zip file " + cVar.getAbsolutePath() + " for secondary dex (" + i4 + ")");
                }
            }
            try {
                zipFile.close();
            } catch (IOException e5) {
                Log.w(str2, "Failed to close resource", e5);
            }
            return arrayList;
        } catch (Throwable th4) {
            th = th4;
        }
    }
}
