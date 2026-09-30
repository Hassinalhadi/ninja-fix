package com.zendesk.service;

import com.zendesk.util.StringUtils;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import okhttp3.Headers;
import okhttp3.ResponseBody;
import vg.aq;

/* loaded from: classes2.dex */
public class RetrofitErrorResponse implements ErrorResponse {
    private static final String LOG_TAG = "RetrofitErrorResponse";
    private aq response;
    private Throwable throwable;

    private RetrofitErrorResponse(Throwable th) {
        this.throwable = th;
    }

    public static RetrofitErrorResponse response(aq aqVar) {
        return new RetrofitErrorResponse(aqVar);
    }

    public static RetrofitErrorResponse throwable(Throwable th) {
        return new RetrofitErrorResponse(th);
    }

    @Override // com.zendesk.service.ErrorResponse
    public String getReason() {
        Throwable th = this.throwable;
        if (th != null) {
            return th.getMessage();
        }
        StringBuilder sb2 = new StringBuilder();
        aq aqVar = this.response;
        if (aqVar != null) {
            if (StringUtils.hasLength(aqVar.alpha.message())) {
                sb2.append(this.response.alpha.message());
            } else {
                sb2.append(this.response.alpha.code());
            }
        }
        return sb2.toString();
    }

    @Override // com.zendesk.service.ErrorResponse
    public String getResponseBody() {
        ResponseBody responseBody;
        aq aqVar = this.response;
        if (aqVar != null && (responseBody = aqVar.charlie) != null) {
            try {
                return new String(responseBody.bytes(), "UTF-8");
            } catch (UnsupportedEncodingException unused) {
                throw new AssertionError("UTF-8 must be supported");
            } catch (IOException unused2) {
                return "";
            }
        }
        return "";
    }

    @Override // com.zendesk.service.ErrorResponse
    public String getResponseBodyType() {
        ResponseBody responseBody;
        aq aqVar = this.response;
        if (aqVar != null && (responseBody = aqVar.charlie) != null) {
            return responseBody.get$contentType().toString();
        }
        return "";
    }

    @Override // com.zendesk.service.ErrorResponse
    public List<Header> getResponseHeaders() {
        if (this.throwable != null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        aq aqVar = this.response;
        if (aqVar != null && aqVar.alpha.headers() != null && this.response.alpha.headers().size() > 0) {
            Headers headers = this.response.alpha.headers();
            for (String str : headers.names()) {
                arrayList.add(new Header(str, headers.get(str)));
            }
        }
        return arrayList;
    }

    @Override // com.zendesk.service.ErrorResponse
    public int getStatus() {
        aq aqVar = this.response;
        if (aqVar != null) {
            return aqVar.alpha.code();
        }
        return -1;
    }

    @Override // com.zendesk.service.ErrorResponse
    public String getUrl() {
        aq aqVar = this.response;
        if (aqVar != null && aqVar.alpha.request() != null && this.response.alpha.request().url() != null) {
            return this.response.alpha.request().url().getUrl();
        }
        return "";
    }

    @Override // com.zendesk.service.ErrorResponse
    public boolean isConversionError() {
        return isNetworkError();
    }

    @Override // com.zendesk.service.ErrorResponse
    public boolean isHttpError() {
        aq aqVar;
        if (this.throwable == null && (aqVar = this.response) != null && !aqVar.alpha.getIsSuccessful()) {
            return true;
        }
        return false;
    }

    @Override // com.zendesk.service.ErrorResponse
    public boolean isNetworkError() {
        Throwable th = this.throwable;
        if (th != null && (th instanceof IOException)) {
            return true;
        }
        return false;
    }

    private RetrofitErrorResponse(aq aqVar) {
        this.response = aqVar;
    }
}
