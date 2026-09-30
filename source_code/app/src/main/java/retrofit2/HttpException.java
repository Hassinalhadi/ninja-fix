package retrofit2;

import java.util.Objects;
import okhttp3.Response;
import vg.aq;

/* loaded from: classes2.dex */
public class HttpException extends RuntimeException {
    private final int code;
    private final String message;
    private final transient aq<?> response;

    public HttpException(aq<?> aqVar) {
        super(getMessage(aqVar));
        this.code = aqVar.alpha.code();
        this.message = aqVar.alpha.message();
        this.response = aqVar;
    }

    private static String getMessage(aq<?> aqVar) {
        Objects.requireNonNull(aqVar, "response == null");
        StringBuilder sb2 = new StringBuilder("HTTP ");
        Response response = aqVar.alpha;
        sb2.append(response.code());
        sb2.append(" ");
        sb2.append(response.message());
        return sb2.toString();
    }

    public int code() {
        return this.code;
    }

    public String message() {
        return this.message;
    }

    public aq<?> response() {
        return this.response;
    }
}
