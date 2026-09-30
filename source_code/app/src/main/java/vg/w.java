package vg;

import java.io.IOException;
import okhttp3.MediaType;
import okhttp3.ResponseBody;

/* loaded from: classes2.dex */
public final class w extends ResponseBody {
    public final ResponseBody alpha;
    public final Tf.ak purple;
    public IOException red;

    public w(ResponseBody responseBody) {
        this.alpha = responseBody;
        this.purple = Tf.b.charlie(new O2.b(this, responseBody.getSource()));
    }

    @Override // okhttp3.ResponseBody, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.alpha.close();
    }

    @Override // okhttp3.ResponseBody
    /* renamed from: contentLength */
    public final long getContentLength() {
        return this.alpha.getContentLength();
    }

    @Override // okhttp3.ResponseBody
    /* renamed from: contentType */
    public final MediaType get$contentType() {
        return this.alpha.get$contentType();
    }

    @Override // okhttp3.ResponseBody
    /* renamed from: source */
    public final Tf.m getSource() {
        return this.purple;
    }
}
