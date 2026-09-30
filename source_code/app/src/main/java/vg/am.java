package vg;

import okhttp3.MediaType;
import okhttp3.RequestBody;

/* loaded from: classes2.dex */
public final class am extends RequestBody {
    public final RequestBody alpha;
    public final MediaType bravo;

    public am(RequestBody requestBody, MediaType mediaType) {
        this.alpha = requestBody;
        this.bravo = mediaType;
    }

    @Override // okhttp3.RequestBody
    public final long contentLength() {
        return this.alpha.contentLength();
    }

    @Override // okhttp3.RequestBody
    /* renamed from: contentType */
    public final MediaType getContentType() {
        return this.bravo;
    }

    @Override // okhttp3.RequestBody
    public final void writeTo(Tf.l lVar) {
        this.alpha.writeTo(lVar);
    }
}
