package zendesk.core;

import Tf.aj;
import Tf.ak;
import Tf.ap;
import Tf.b;
import Tf.k;
import androidx.appcompat.widget.P0;
import com.zendesk.logger.Logger;
import com.zendesk.util.CollectionUtils;
import com.zendesk.util.DigestUtils;
import com.zendesk.util.StringUtils;
import i9.C1907c;
import i9.e;
import i9.f;
import i9.g;
import java.io.ByteArrayInputStream;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Locale;
import okhttp3.MediaType;
import okhttp3.ResponseBody;

/* loaded from: classes.dex */
class ZendeskDiskLruCache implements BaseStorage {
    private static final int CACHE_INDEX = 0;
    private static final int ITEMS_PER_KEY = 1;
    private static final String LOG_TAG = "DiskLruStorage";
    private static final int VERSION_ONE = 1;
    private final File directory;
    private final long maxSize;
    private final Serializer serializer;
    private f storage;

    public ZendeskDiskLruCache(File file, Serializer serializer, int i4) {
        this.directory = file;
        long j5 = i4;
        this.maxSize = j5;
        this.storage = openCache(file, j5);
        this.serializer = serializer;
    }

    private void close(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    private String getString(String str, int i4) {
        ak akVar;
        Throwable th;
        Tf.f fVar;
        String green;
        Closeable closeable = null;
        try {
            try {
                e golf = this.storage.golf(key(str));
                if (golf != null) {
                    try {
                        fVar = b.juliet(golf.alpha[i4]);
                        try {
                            akVar = b.charlie(fVar);
                            try {
                                try {
                                    ap apVar = akVar.alpha;
                                    k kVar = akVar.purple;
                                    kVar.f(apVar);
                                    closeable = fVar;
                                    green = kVar.green();
                                } catch (IOException e) {
                                    e = e;
                                    Logger.w(LOG_TAG, "Unable to read from cache", e, new Object[0]);
                                    close(fVar);
                                    close(akVar);
                                    return null;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                close(fVar);
                                close(akVar);
                                throw th;
                            }
                        } catch (IOException e4) {
                            e = e4;
                            akVar = null;
                        } catch (Throwable th3) {
                            th = th3;
                            akVar = null;
                            close(fVar);
                            close(akVar);
                            throw th;
                        }
                    } catch (IOException e5) {
                        e = e5;
                        fVar = null;
                        akVar = null;
                        Logger.w(LOG_TAG, "Unable to read from cache", e, new Object[0]);
                        close(fVar);
                        close(akVar);
                        return null;
                    }
                } else {
                    green = null;
                    akVar = null;
                }
                close(closeable);
                close(akVar);
                return green;
            } catch (IOException e10) {
                e = e10;
            }
        } catch (Throwable th4) {
            akVar = null;
            th = th4;
            fVar = null;
        }
    }

    private String key(String str) {
        return DigestUtils.sha1(str);
    }

    private String keyMediaType(String str) {
        Locale locale = Locale.US;
        return key(P0.crimson(str, "_content_type"));
    }

    private f openCache(File file, long j5) {
        try {
            return f.papa(file, j5);
        } catch (IOException unused) {
            Logger.w(LOG_TAG, "Unable to open cache", new Object[0]);
            return null;
        }
    }

    private void putString(String str, int i4, String str2) {
        try {
            write(str, i4, b.juliet(new ByteArrayInputStream(str2.getBytes("UTF-8"))));
        } catch (UnsupportedEncodingException e) {
            Logger.w(LOG_TAG, "Unable to encode string", e, new Object[0]);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [zendesk.core.ZendeskDiskLruCache] */
    /* JADX WARN: Type inference failed for: r6v0, types: [int] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.io.Closeable] */
    private void write(String str, int i4, ap apVar) {
        Tf.e eVar;
        C1907c foxtrot;
        aj ajVar = null;
        try {
            try {
                synchronized (this.directory) {
                    foxtrot = this.storage.foxtrot(key(str));
                }
                if (foxtrot != null) {
                    eVar = b.hotel(foxtrot.bravo(i4));
                    try {
                        ajVar = b.bravo(eVar);
                        ajVar.f(apVar);
                        ajVar.flush();
                        boolean z2 = foxtrot.charlie;
                        f fVar = foxtrot.delta;
                        if (z2) {
                            f.charlie(fVar, foxtrot, false);
                            fVar.blue(foxtrot.alpha.alpha);
                        } else {
                            f.charlie(fVar, foxtrot, true);
                        }
                    } catch (IOException e) {
                        e = e;
                        Logger.w(LOG_TAG, "Unable to cache data", e, new Object[0]);
                        close(ajVar);
                        close(eVar);
                        close(apVar);
                        return;
                    }
                } else {
                    eVar = null;
                }
                close(ajVar);
                close(eVar);
                close(apVar);
            } catch (Throwable th) {
                th = th;
                close(null);
                close(i4);
                close(apVar);
                throw th;
            }
        } catch (IOException e4) {
            e = e4;
            eVar = null;
        } catch (Throwable th2) {
            th = th2;
            i4 = 0;
            close(null);
            close(i4);
            close(apVar);
            throw th;
        }
    }

    @Override // zendesk.core.BaseStorage
    public void clear() {
        f fVar = this.storage;
        try {
            if (fVar != null) {
                try {
                    File file = fVar.alpha;
                    if (file != null && file.exists() && CollectionUtils.isNotEmpty(this.storage.alpha.listFiles())) {
                        f fVar2 = this.storage;
                        fVar2.close();
                        g.alpha(fVar2.alpha);
                    } else {
                        this.storage.close();
                    }
                    this.storage = openCache(this.directory, this.maxSize);
                } catch (IOException e) {
                    Logger.d(LOG_TAG, "Error clearing cache. Error: %s", e.getMessage());
                    this.storage = openCache(this.directory, this.maxSize);
                }
            }
        } catch (Throwable th) {
            this.storage = openCache(this.directory, this.maxSize);
            throw th;
        }
    }

    @Override // zendesk.core.BaseStorage
    public String get(String str) {
        if (this.storage == null) {
            return null;
        }
        return getString(str, 0);
    }

    @Override // zendesk.core.BaseStorage
    public void put(String str, String str2) {
        if (this.storage == null || StringUtils.isEmpty(str2)) {
            return;
        }
        putString(str, 0, str2);
    }

    @Override // zendesk.core.BaseStorage
    public void remove(String str) {
    }

    @Override // zendesk.core.BaseStorage
    public <E> E get(String str, Class<E> cls) {
        if (this.storage != null) {
            if (cls.equals(ResponseBody.class)) {
                try {
                    e golf = this.storage.golf(key(str));
                    if (golf != null) {
                        Tf.f juliet = b.juliet(golf.alpha[0]);
                        long j5 = golf.purple[0];
                        String string = getString(keyMediaType(str), 0);
                        return (E) ResponseBody.create(StringUtils.hasLength(string) ? MediaType.parse(string) : null, j5, b.charlie(juliet));
                    }
                } catch (IOException e) {
                    Logger.w(LOG_TAG, "Unable to read from cache", e, new Object[0]);
                }
            } else {
                return (E) this.serializer.deserialize(getString(str, 0), cls);
            }
        }
        return null;
    }

    @Override // zendesk.core.BaseStorage
    public void put(String str, Object obj) {
        if (this.storage == null) {
            return;
        }
        if (obj instanceof ResponseBody) {
            ResponseBody responseBody = (ResponseBody) obj;
            write(str, 0, responseBody.getSource());
            putString(keyMediaType(str), 0, responseBody.getMediaType().toString());
            return;
        }
        put(str, obj != null ? this.serializer.serialize(obj) : null);
    }

    public ZendeskDiskLruCache(File file, long j5, f fVar, Serializer serializer) {
        this.directory = file;
        this.maxSize = j5;
        this.storage = fVar;
        this.serializer = serializer;
    }
}
