package x8;

import com.google.firebase.perf.util.Timer;
import org.apache.http.HttpResponse;
import org.apache.http.client.ResponseHandler;

/* loaded from: classes2.dex */
public final class f implements ResponseHandler {
    public final ResponseHandler alpha;
    public final Timer bravo;
    public final v8.d charlie;

    public f(ResponseHandler responseHandler, Timer timer, v8.d dVar) {
        this.alpha = responseHandler;
        this.bravo = timer;
        this.charlie = dVar;
    }

    @Override // org.apache.http.client.ResponseHandler
    public final Object handleResponse(HttpResponse httpResponse) {
        this.charlie.kilo(this.bravo.charlie());
        this.charlie.foxtrot(httpResponse.getStatusLine().getStatusCode());
        Long alpha = g.alpha(httpResponse);
        if (alpha != null) {
            this.charlie.juliet(alpha.longValue());
        }
        String bravo = g.bravo(httpResponse);
        if (bravo != null) {
            this.charlie.india(bravo);
        }
        this.charlie.delta();
        return this.alpha.handleResponse(httpResponse);
    }
}
