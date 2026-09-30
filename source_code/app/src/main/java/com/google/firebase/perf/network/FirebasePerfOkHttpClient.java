package com.google.firebase.perf.network;

import A8.h;
import Nb.i;
import androidx.annotation.Keep;
import com.google.firebase.perf.util.Timer;
import java.io.IOException;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import v8.d;
import x8.g;

/* loaded from: classes2.dex */
public class FirebasePerfOkHttpClient {
    public static void alpha(Response response, d dVar, long j5, long j6) {
        Request request = response.request();
        if (request == null) {
            return;
        }
        dVar.lima(request.url().url().toString());
        dVar.echo(request.method());
        if (request.body() != null) {
            long contentLength = request.body().contentLength();
            if (contentLength != -1) {
                dVar.golf(contentLength);
            }
        }
        ResponseBody body = response.body();
        if (body != null) {
            long contentLength2 = body.getContentLength();
            if (contentLength2 != -1) {
                dVar.juliet(contentLength2);
            }
            MediaType mediaType = body.getMediaType();
            if (mediaType != null) {
                dVar.india(mediaType.toString());
            }
        }
        dVar.foxtrot(response.code());
        dVar.hotel(j5);
        dVar.kilo(j6);
        dVar.delta();
    }

    @Keep
    public static void enqueue(Call call, Callback callback) {
        Timer timer = new Timer();
        call.enqueue(new i(callback, h.f18l, timer, timer.alpha));
    }

    @Keep
    public static Response execute(Call call) throws IOException {
        d dVar = new d(h.f18l);
        Timer timer = new Timer();
        long j5 = timer.alpha;
        try {
            Response execute = call.execute();
            alpha(execute, dVar, j5, timer.charlie());
            return execute;
        } catch (IOException e) {
            Request request = call.request();
            if (request != null) {
                HttpUrl url = request.url();
                if (url != null) {
                    dVar.lima(url.url().toString());
                }
                if (request.method() != null) {
                    dVar.echo(request.method());
                }
            }
            dVar.hotel(j5);
            dVar.kilo(timer.charlie());
            g.charlie(dVar);
            throw e;
        }
    }
}
