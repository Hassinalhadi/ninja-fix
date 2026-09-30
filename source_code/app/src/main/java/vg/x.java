package vg;

import okhttp3.MediaType;
import okhttp3.ResponseBody;

/* loaded from: classes2.dex */
public final class x extends ResponseBody {
    public final MediaType alpha;
    public final long purple;

    public x(MediaType mediaType, long j5) {
        this.alpha = mediaType;
        this.purple = j5;
    }

    @Override // okhttp3.ResponseBody
    /* renamed from: contentLength */
    public final long get$contentLength() {
        return this.purple;
    }

    @Override // okhttp3.ResponseBody
    /* renamed from: contentType */
    public final MediaType get$contentType() {
        return this.alpha;
    }

    @Override // okhttp3.ResponseBody
    /* renamed from: source */
    public final Tf.m getBodySource() {
        throw new IllegalStateException("Cannot read raw response body of a converted body.");
    }
}
