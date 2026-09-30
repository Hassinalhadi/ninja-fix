package com.zendesk.service;

import androidx.appcompat.widget.P0;
import av.q;
import com.google.maps.android.BuildConfig;
import com.zendesk.util.ObjectUtils;
import com.zendesk.util.StringUtils;
import okhttp3.Response;
import vg.aq;

/* loaded from: classes2.dex */
public class ZendeskException extends Exception {
    private final ErrorResponse errorResponse;

    public ZendeskException(Throwable th) {
        super(th);
        this.errorResponse = ErrorResponseAdapter.fromException(th);
    }

    private static String message(aq aqVar) {
        StringBuilder sb2 = new StringBuilder();
        if (aqVar != null) {
            Response response = aqVar.alpha;
            if (StringUtils.hasLength(response.message())) {
                sb2.append(response.message());
            } else {
                sb2.append(response.code());
            }
        }
        return sb2.toString();
    }

    public ErrorResponse errorResponse() {
        return this.errorResponse;
    }

    @Override // java.lang.Throwable
    public String toString() {
        String reason;
        ErrorResponse errorResponse = this.errorResponse;
        if (errorResponse == null) {
            reason = BuildConfig.TRAVIS;
        } else {
            reason = errorResponse.getReason();
        }
        String exc = super.toString();
        return P0.gold(q.india("ZendeskException{details=", exc, ",errorResponse=", reason, ",cause="), ObjectUtils.toString(getCause()), "}");
    }

    public ZendeskException(String str) {
        super(str);
        this.errorResponse = new ErrorResponseAdapter(getMessage());
    }

    public ZendeskException(ErrorResponse errorResponse) {
        super(errorResponse.getReason());
        this.errorResponse = errorResponse;
    }

    public ZendeskException(aq aqVar) {
        super(message(aqVar));
        this.errorResponse = RetrofitErrorResponse.response(aqVar);
    }
}
