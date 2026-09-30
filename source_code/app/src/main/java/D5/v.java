package D5;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.BufferedReader;
import java.io.IOException;

/* loaded from: classes3.dex */
public final class v {
    public final long alpha;

    public v(long j5) {
        this.alpha = j5;
    }

    public static v alpha(BufferedReader bufferedReader) {
        JsonReader jsonReader = new JsonReader(bufferedReader);
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                if (jsonReader.nextName().equals("nextRequestWaitMillis")) {
                    if (jsonReader.peek() == JsonToken.STRING) {
                        return new v(Long.parseLong(jsonReader.nextString()));
                    }
                    return new v(jsonReader.nextLong());
                }
                jsonReader.skipValue();
            }
            throw new IOException("Response is missing nextRequestWaitMillis field.");
        } finally {
            jsonReader.close();
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof v) {
            if (this.alpha == ((v) obj).alpha) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j5 = this.alpha;
        return ((int) (j5 ^ (j5 >>> 32))) ^ 1000003;
    }

    public final String toString() {
        return Q0.c.mike(this.alpha, "}", new StringBuilder("LogResponse{nextRequestWaitMillis="));
    }
}
