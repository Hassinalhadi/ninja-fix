package zendesk.support;

import Tf.b;
import com.google.gson.l;
import com.google.gson.reflect.TypeToken;
import com.zendesk.logger.Logger;
import com.zendesk.util.DigestUtils;
import i9.C1907c;
import i9.e;
import i9.f;
import java.io.IOException;
import java.io.Reader;
import java.lang.reflect.Type;
import zendesk.support.Streams;

/* loaded from: classes.dex */
public class SupportUiStorage {
    private static final int CACHE_INDEX = 0;
    private static final String LOG_TAG = "SupportUiStorage";
    public static final String REQUEST_MAPPER = "request_id_mapper";
    private final l gson;
    private final f storage;

    public SupportUiStorage(f fVar, l lVar) {
        this.storage = fVar;
        this.gson = lVar;
    }

    private static void abortEdit(C1907c c1907c) {
        Logger.w(LOG_TAG, "Unable to cache data", new Object[0]);
        if (c1907c != null) {
            try {
                c1907c.alpha();
            } catch (IOException e) {
                Logger.w(LOG_TAG, "Unable to abort write", e, new Object[0]);
            }
        }
    }

    private static String key(String str) {
        return DigestUtils.sha1(str);
    }

    public <E> E read(String str, final Type type) {
        E e;
        try {
            synchronized (this.storage) {
                e = (E) Streams.use(this.storage.golf(key(str)), new Streams.Use<E, e>() { // from class: zendesk.support.SupportUiStorage.1
                    @Override // zendesk.support.Streams.Use
                    public E use(e eVar) throws Exception {
                        Reader reader = Streams.toReader(b.juliet(eVar.alpha[0]));
                        l lVar = SupportUiStorage.this.gson;
                        Type type2 = type;
                        lVar.getClass();
                        return (E) lVar.charlie(reader, TypeToken.get(type2));
                    }
                });
            }
            return e;
        } catch (IOException unused) {
            Logger.w(LOG_TAG, "Unable to read from cache", new Object[0]);
            return null;
        }
    }

    public void write(String str, Object obj) {
        C1907c c1907c = null;
        try {
            synchronized (this.storage) {
                c1907c = this.storage.foxtrot(key(str));
            }
            if (c1907c != null) {
                Streams.toJson(this.gson, b.hotel(c1907c.bravo(0)), obj);
                boolean z2 = c1907c.charlie;
                f fVar = c1907c.delta;
                if (z2) {
                    f.charlie(fVar, c1907c, false);
                    fVar.blue(c1907c.alpha.alpha);
                } else {
                    f.charlie(fVar, c1907c, true);
                }
            }
        } catch (IOException unused) {
            abortEdit(c1907c);
        }
    }
}
