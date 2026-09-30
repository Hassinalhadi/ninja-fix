package com.google.firebase.perf.network;

import A8.h;
import androidx.annotation.Keep;
import com.google.firebase.perf.util.Timer;
import java.io.IOException;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.protocol.HttpContext;
import pe.AbstractC2327c;
import v8.d;
import x8.f;
import x8.g;

/* loaded from: classes2.dex */
public class FirebasePerfHttpClient {
    @Keep
    public static HttpResponse execute(HttpClient httpClient, HttpUriRequest httpUriRequest) throws IOException {
        Timer timer = new Timer();
        d dVar = new d(h.f18l);
        try {
            dVar.lima(httpUriRequest.getURI().toString());
            dVar.echo(httpUriRequest.getMethod());
            Long alpha = g.alpha(httpUriRequest);
            if (alpha != null) {
                dVar.golf(alpha.longValue());
            }
            timer.echo();
            dVar.hotel(timer.alpha);
            HttpResponse execute = httpClient.execute(httpUriRequest);
            dVar.kilo(timer.charlie());
            dVar.foxtrot(execute.getStatusLine().getStatusCode());
            Long alpha2 = g.alpha(execute);
            if (alpha2 != null) {
                dVar.juliet(alpha2.longValue());
            }
            String bravo = g.bravo(execute);
            if (bravo != null) {
                dVar.india(bravo);
            }
            dVar.delta();
            return execute;
        } catch (IOException e) {
            AbstractC2327c.black(timer, dVar, dVar);
            throw e;
        }
    }

    @Keep
    public static HttpResponse execute(HttpClient httpClient, HttpUriRequest httpUriRequest, HttpContext httpContext) throws IOException {
        Timer timer = new Timer();
        d dVar = new d(h.f18l);
        try {
            dVar.lima(httpUriRequest.getURI().toString());
            dVar.echo(httpUriRequest.getMethod());
            Long alpha = g.alpha(httpUriRequest);
            if (alpha != null) {
                dVar.golf(alpha.longValue());
            }
            timer.echo();
            dVar.hotel(timer.alpha);
            HttpResponse execute = httpClient.execute(httpUriRequest, httpContext);
            dVar.kilo(timer.charlie());
            dVar.foxtrot(execute.getStatusLine().getStatusCode());
            Long alpha2 = g.alpha(execute);
            if (alpha2 != null) {
                dVar.juliet(alpha2.longValue());
            }
            String bravo = g.bravo(execute);
            if (bravo != null) {
                dVar.india(bravo);
            }
            dVar.delta();
            return execute;
        } catch (IOException e) {
            AbstractC2327c.black(timer, dVar, dVar);
            throw e;
        }
    }

    @Keep
    public static <T> T execute(HttpClient httpClient, HttpUriRequest httpUriRequest, ResponseHandler<T> responseHandler) throws IOException {
        Timer timer = new Timer();
        d dVar = new d(h.f18l);
        try {
            dVar.lima(httpUriRequest.getURI().toString());
            dVar.echo(httpUriRequest.getMethod());
            Long alpha = g.alpha(httpUriRequest);
            if (alpha != null) {
                dVar.golf(alpha.longValue());
            }
            timer.echo();
            dVar.hotel(timer.alpha);
            return (T) httpClient.execute(httpUriRequest, new f(responseHandler, timer, dVar));
        } catch (IOException e) {
            AbstractC2327c.black(timer, dVar, dVar);
            throw e;
        }
    }

    @Keep
    public static <T> T execute(HttpClient httpClient, HttpUriRequest httpUriRequest, ResponseHandler<T> responseHandler, HttpContext httpContext) throws IOException {
        Timer timer = new Timer();
        d dVar = new d(h.f18l);
        try {
            dVar.lima(httpUriRequest.getURI().toString());
            dVar.echo(httpUriRequest.getMethod());
            Long alpha = g.alpha(httpUriRequest);
            if (alpha != null) {
                dVar.golf(alpha.longValue());
            }
            timer.echo();
            dVar.hotel(timer.alpha);
            return (T) httpClient.execute(httpUriRequest, new f(responseHandler, timer, dVar), httpContext);
        } catch (IOException e) {
            AbstractC2327c.black(timer, dVar, dVar);
            throw e;
        }
    }

    @Keep
    public static HttpResponse execute(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest) throws IOException {
        Timer timer = new Timer();
        d dVar = new d(h.f18l);
        try {
            dVar.lima(httpHost.toURI() + httpRequest.getRequestLine().getUri());
            dVar.echo(httpRequest.getRequestLine().getMethod());
            Long alpha = g.alpha(httpRequest);
            if (alpha != null) {
                dVar.golf(alpha.longValue());
            }
            timer.echo();
            dVar.hotel(timer.alpha);
            HttpResponse execute = httpClient.execute(httpHost, httpRequest);
            dVar.kilo(timer.charlie());
            dVar.foxtrot(execute.getStatusLine().getStatusCode());
            Long alpha2 = g.alpha(execute);
            if (alpha2 != null) {
                dVar.juliet(alpha2.longValue());
            }
            String bravo = g.bravo(execute);
            if (bravo != null) {
                dVar.india(bravo);
            }
            dVar.delta();
            return execute;
        } catch (IOException e) {
            AbstractC2327c.black(timer, dVar, dVar);
            throw e;
        }
    }

    @Keep
    public static HttpResponse execute(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, HttpContext httpContext) throws IOException {
        Timer timer = new Timer();
        d dVar = new d(h.f18l);
        try {
            dVar.lima(httpHost.toURI() + httpRequest.getRequestLine().getUri());
            dVar.echo(httpRequest.getRequestLine().getMethod());
            Long alpha = g.alpha(httpRequest);
            if (alpha != null) {
                dVar.golf(alpha.longValue());
            }
            timer.echo();
            dVar.hotel(timer.alpha);
            HttpResponse execute = httpClient.execute(httpHost, httpRequest, httpContext);
            dVar.kilo(timer.charlie());
            dVar.foxtrot(execute.getStatusLine().getStatusCode());
            Long alpha2 = g.alpha(execute);
            if (alpha2 != null) {
                dVar.juliet(alpha2.longValue());
            }
            String bravo = g.bravo(execute);
            if (bravo != null) {
                dVar.india(bravo);
            }
            dVar.delta();
            return execute;
        } catch (IOException e) {
            AbstractC2327c.black(timer, dVar, dVar);
            throw e;
        }
    }

    @Keep
    public static <T> T execute(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, ResponseHandler<? extends T> responseHandler) throws IOException {
        Timer timer = new Timer();
        d dVar = new d(h.f18l);
        try {
            dVar.lima(httpHost.toURI() + httpRequest.getRequestLine().getUri());
            dVar.echo(httpRequest.getRequestLine().getMethod());
            Long alpha = g.alpha(httpRequest);
            if (alpha != null) {
                dVar.golf(alpha.longValue());
            }
            timer.echo();
            dVar.hotel(timer.alpha);
            return (T) httpClient.execute(httpHost, httpRequest, new f(responseHandler, timer, dVar));
        } catch (IOException e) {
            AbstractC2327c.black(timer, dVar, dVar);
            throw e;
        }
    }

    @Keep
    public static <T> T execute(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, ResponseHandler<? extends T> responseHandler, HttpContext httpContext) throws IOException {
        Timer timer = new Timer();
        d dVar = new d(h.f18l);
        try {
            dVar.lima(httpHost.toURI() + httpRequest.getRequestLine().getUri());
            dVar.echo(httpRequest.getRequestLine().getMethod());
            Long alpha = g.alpha(httpRequest);
            if (alpha != null) {
                dVar.golf(alpha.longValue());
            }
            timer.echo();
            dVar.hotel(timer.alpha);
            return (T) httpClient.execute(httpHost, httpRequest, new f(responseHandler, timer, dVar), httpContext);
        } catch (IOException e) {
            AbstractC2327c.black(timer, dVar, dVar);
            throw e;
        }
    }
}
