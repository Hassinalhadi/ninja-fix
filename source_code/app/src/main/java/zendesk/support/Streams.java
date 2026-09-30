package zendesk.support;

import Hd.b;
import Tf.ao;
import Tf.ap;
import Tf.j;
import Tf.m;
import androidx.fragment.app.f0;
import av.q;
import com.google.gson.JsonIOException;
import com.google.gson.l;
import com.google.gson.r;
import com.google.gson.reflect.TypeToken;
import com.zendesk.logger.Logger;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.lang.reflect.Type;

/* loaded from: classes.dex */
public class Streams {

    /* loaded from: classes.dex */
    public interface Use<R, P extends Closeable> {
        R use(P p4) throws Exception;
    }

    public static void closeQuietly(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    public static <T> T fromJson(final l lVar, ap apVar, final Type type) {
        return (T) use(toReader(apVar), new Use<T, Reader>() { // from class: zendesk.support.Streams.1
            @Override // zendesk.support.Streams.Use
            public T use(Reader reader) throws Exception {
                l lVar2 = l.this;
                Type type2 = type;
                lVar2.getClass();
                return (T) lVar2.charlie(reader, TypeToken.get(type2));
            }
        });
    }

    public static void toJson(final l lVar, ao aoVar, final Object obj) {
        use(toWriter(aoVar), new Use<Void, Writer>() { // from class: zendesk.support.Streams.2
            @Override // zendesk.support.Streams.Use
            public Void use(Writer writer) throws Exception {
                l lVar2 = l.this;
                Object obj2 = obj;
                if (obj2 != null) {
                    lVar2.getClass();
                    Class<?> cls = obj2.getClass();
                    try {
                        if (!q.kilo(writer)) {
                            writer = new f0(writer);
                        }
                        lVar2.kilo(obj2, cls, lVar2.hotel(writer));
                        return null;
                    } catch (IOException e) {
                        throw new JsonIOException(e);
                    }
                }
                r rVar = r.alpha;
                lVar2.getClass();
                try {
                    if (!q.kilo(writer)) {
                        writer = new f0(writer);
                    }
                    lVar2.juliet(lVar2.hotel(writer), rVar);
                    return null;
                } catch (IOException e4) {
                    throw new JsonIOException(e4);
                }
            }
        });
    }

    public static Reader toReader(ap apVar) {
        if (apVar instanceof m) {
            return new InputStreamReader(((m) apVar).C());
        }
        return new InputStreamReader(new b(2, Tf.b.charlie(apVar)));
    }

    public static Writer toWriter(ao aoVar) {
        if (aoVar instanceof Tf.l) {
            return new OutputStreamWriter(((Tf.l) aoVar).z());
        }
        return new OutputStreamWriter(new j(Tf.b.bravo(aoVar), 1));
    }

    public static <R, P extends Closeable> R use(P p4, Use<R, P> use) {
        if (p4 == null) {
            return null;
        }
        try {
            return use.use(p4);
        } catch (Exception e) {
            Logger.i("Streams", "Error using stream", e, new Object[0]);
            return null;
        } finally {
            closeQuietly(p4);
        }
    }
}
