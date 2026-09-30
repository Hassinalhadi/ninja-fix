package t2;

import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: t2.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2955a {
    public static final HashMap echo = new HashMap();
    public final boolean alpha;
    public final File bravo;
    public final Lock charlie;
    public FileChannel delta;

    public C2955a(String str, File file, boolean z2) {
        File file2;
        Lock lock;
        this.alpha = z2;
        if (file != null) {
            file2 = new File(file, str.concat(".lck"));
        } else {
            file2 = null;
        }
        this.bravo = file2;
        HashMap hashMap = echo;
        synchronized (hashMap) {
            try {
                Object obj = hashMap.get(str);
                if (obj == null) {
                    obj = new ReentrantLock();
                    hashMap.put(str, obj);
                }
                lock = (Lock) obj;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.charlie = lock;
    }

    public final void alpha(boolean z2) {
        this.charlie.lock();
        if (z2) {
            File file = this.bravo;
            try {
                if (file != null) {
                    File parentFile = file.getParentFile();
                    if (parentFile != null) {
                        parentFile.mkdirs();
                    }
                    FileChannel channel = new FileOutputStream(file).getChannel();
                    channel.lock();
                    this.delta = channel;
                    return;
                }
                throw new IOException("No lock directory was provided.");
            } catch (IOException e) {
                this.delta = null;
                Log.w("SupportSQLiteLock", "Unable to grab file lock.", e);
            }
        }
    }

    public final void bravo() {
        try {
            FileChannel fileChannel = this.delta;
            if (fileChannel != null) {
                fileChannel.close();
            }
        } catch (IOException unused) {
        }
        this.charlie.unlock();
    }
}
