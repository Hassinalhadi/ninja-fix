package xg;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonWriter;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import vg.m;

/* loaded from: classes2.dex */
public final class b implements m {
    public static final MediaType purple = MediaType.get("application/json; charset=UTF-8");
    public final JsonAdapter alpha;

    public b(JsonAdapter jsonAdapter) {
        this.alpha = jsonAdapter;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Tf.l, Tf.k, java.lang.Object] */
    @Override // vg.m
    public final Object bravo(Object obj) {
        ?? obj2 = new Object();
        this.alpha.toJson(JsonWriter.of(obj2), (JsonWriter) obj);
        return RequestBody.create(purple, obj2.november(obj2.purple));
    }
}
