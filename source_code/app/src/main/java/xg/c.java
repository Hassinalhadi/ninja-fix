package xg;

import Tf.n;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import g8.d;
import okhttp3.ResponseBody;
import vg.m;

/* loaded from: classes2.dex */
public final class c implements m {
    public static final n purple;
    public final JsonAdapter alpha;

    static {
        n nVar = n.silver;
        purple = d.mike("EFBBBF");
    }

    public c(JsonAdapter jsonAdapter) {
        this.alpha = jsonAdapter;
    }

    @Override // vg.m
    public final Object bravo(Object obj) {
        ResponseBody responseBody = (ResponseBody) obj;
        Tf.m bodySource = responseBody.getBodySource();
        try {
            if (bodySource.whiskey(0L, purple)) {
                bodySource.india(r1.alpha.length);
            }
            JsonReader of2 = JsonReader.of(bodySource);
            Object fromJson = this.alpha.fromJson(of2);
            if (of2.peek() == JsonReader.Token.END_DOCUMENT) {
                responseBody.close();
                return fromJson;
            }
            throw new JsonDataException("JSON document was not fully consumed.");
        } catch (Throwable th) {
            responseBody.close();
            throw th;
        }
    }
}
