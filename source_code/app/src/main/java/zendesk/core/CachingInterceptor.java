package zendesk.core;

import com.zendesk.logger.Logger;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* loaded from: classes.dex */
class CachingInterceptor implements Interceptor {
    private static final String LOG_TAG = "CachingInterceptor";
    private final BaseStorage cache;
    private final Map<String, Lock> locks = new HashMap();

    public CachingInterceptor(BaseStorage baseStorage) {
        this.cache = baseStorage;
    }

    private Response createResponse(int i4, Request request, ResponseBody responseBody) {
        Response.Builder builder = new Response.Builder();
        if (responseBody != null) {
            builder.body(responseBody);
        } else {
            Logger.w(LOG_TAG, "Response body is null", new Object[0]);
        }
        return builder.code(i4).message(request.method()).request(request).protocol(Protocol.HTTP_1_1).build();
    }

    private Response loadData(String str, Interceptor.Chain chain) throws IOException {
        int i4;
        ResponseBody body;
        ResponseBody responseBody = (ResponseBody) this.cache.get(str, ResponseBody.class);
        if (responseBody == null) {
            Logger.d(LOG_TAG, "Response not cached, loading it from the network. | %s", str);
            Response proceed = chain.proceed(chain.request());
            if (proceed.getIsSuccessful()) {
                MediaType mediaType = proceed.body().getMediaType();
                byte[] bytes = proceed.body().bytes();
                this.cache.put(str, ResponseBody.create(mediaType, bytes));
                body = ResponseBody.create(mediaType, bytes);
            } else {
                Logger.d(LOG_TAG, "Unable to load data from network. | %s", str);
                body = proceed.body();
            }
            i4 = proceed.code();
            responseBody = body;
        } else {
            i4 = 200;
        }
        return createResponse(i4, chain.request(), responseBody);
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) throws IOException {
        Lock reentrantLock;
        String url = chain.request().url().getUrl();
        synchronized (this.locks) {
            try {
                if (this.locks.containsKey(url)) {
                    reentrantLock = this.locks.get(url);
                } else {
                    reentrantLock = new ReentrantLock();
                    this.locks.put(url, reentrantLock);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        try {
            reentrantLock.lock();
            return loadData(url, chain);
        } finally {
            reentrantLock.unlock();
        }
    }
}
