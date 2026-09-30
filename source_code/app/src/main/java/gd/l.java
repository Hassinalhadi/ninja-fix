package gd;

import io.ktor.client.engine.okhttp.StreamAdapterIOException;
import io.ktor.utils.io.t;
import java.io.IOException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import s6.AbstractC2689j6;

/* loaded from: classes2.dex */
public final class l extends RequestBody {
    public final Long alpha;
    public final Function0 bravo;

    public l(Long l10, Function0 function0) {
        this.alpha = l10;
        this.bravo = function0;
    }

    @Override // okhttp3.RequestBody
    public final long contentLength() {
        Long l10 = this.alpha;
        if (l10 != null) {
            return l10.longValue();
        }
        return -1L;
    }

    @Override // okhttp3.RequestBody
    /* renamed from: contentType */
    public final MediaType getContentType() {
        return null;
    }

    @Override // okhttp3.RequestBody
    public final boolean isOneShot() {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8 */
    @Override // okhttp3.RequestBody
    public final void writeTo(Tf.l sink) {
        ?? r62;
        Intrinsics.echo(sink, "sink");
        try {
            t tVar = (t) this.bravo.invoke();
            Intrinsics.echo(tVar, "<this>");
            Tf.f juliet = Tf.b.juliet(new Hd.b(0, tVar));
            Long th = null;
            try {
                Long valueOf = Long.valueOf(sink.f(juliet));
                try {
                    juliet.close();
                } catch (Throwable th2) {
                    th = th2;
                }
                Long l10 = th;
                th = valueOf;
                r62 = l10;
            } catch (Throwable th3) {
                try {
                    juliet.close();
                    r62 = th3;
                } catch (Throwable th4) {
                    AbstractC2689j6.charlie(th3, th4);
                    r62 = th3;
                }
            }
            if (r62 == 0) {
                th.getClass();
                return;
            }
            throw r62;
        } catch (IOException e) {
            throw e;
        } catch (Throwable th5) {
            throw new StreamAdapterIOException(th5);
        }
    }
}
