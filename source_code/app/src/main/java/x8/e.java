package x8;

import C8.p;
import C8.r;
import com.google.firebase.perf.util.Timer;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import pe.AbstractC2327c;
import u8.C3146a;

/* loaded from: classes2.dex */
public final class e {
    public static final C3146a foxtrot = C3146a.delta();
    public final HttpURLConnection alpha;
    public final v8.d bravo;
    public long charlie = -1;
    public long delta = -1;
    public final Timer echo;

    public e(HttpURLConnection httpURLConnection, Timer timer, v8.d dVar) {
        this.alpha = httpURLConnection;
        this.bravo = dVar;
        this.echo = timer;
        dVar.lima(httpURLConnection.getURL().toString());
    }

    public final void alpha() {
        long j5 = this.charlie;
        v8.d dVar = this.bravo;
        Timer timer = this.echo;
        if (j5 == -1) {
            timer.echo();
            long j6 = timer.alpha;
            this.charlie = j6;
            dVar.hotel(j6);
        }
        try {
            this.alpha.connect();
        } catch (IOException e) {
            AbstractC2327c.black(timer, dVar, dVar);
            throw e;
        }
    }

    public final Object bravo() {
        Timer timer = this.echo;
        india();
        HttpURLConnection httpURLConnection = this.alpha;
        int responseCode = httpURLConnection.getResponseCode();
        v8.d dVar = this.bravo;
        dVar.foxtrot(responseCode);
        try {
            Object content = httpURLConnection.getContent();
            if (content instanceof InputStream) {
                dVar.india(httpURLConnection.getContentType());
                return new C3306a((InputStream) content, dVar, timer);
            }
            dVar.india(httpURLConnection.getContentType());
            dVar.juliet(httpURLConnection.getContentLength());
            dVar.kilo(timer.charlie());
            dVar.delta();
            return content;
        } catch (IOException e) {
            AbstractC2327c.black(timer, dVar, dVar);
            throw e;
        }
    }

    public final Object charlie(Class[] clsArr) {
        Timer timer = this.echo;
        india();
        HttpURLConnection httpURLConnection = this.alpha;
        int responseCode = httpURLConnection.getResponseCode();
        v8.d dVar = this.bravo;
        dVar.foxtrot(responseCode);
        try {
            Object content = httpURLConnection.getContent(clsArr);
            if (content instanceof InputStream) {
                dVar.india(httpURLConnection.getContentType());
                return new C3306a((InputStream) content, dVar, timer);
            }
            dVar.india(httpURLConnection.getContentType());
            dVar.juliet(httpURLConnection.getContentLength());
            dVar.kilo(timer.charlie());
            dVar.delta();
            return content;
        } catch (IOException e) {
            AbstractC2327c.black(timer, dVar, dVar);
            throw e;
        }
    }

    public final InputStream delta() {
        HttpURLConnection httpURLConnection = this.alpha;
        v8.d dVar = this.bravo;
        india();
        try {
            dVar.foxtrot(httpURLConnection.getResponseCode());
        } catch (IOException unused) {
            foxtrot.alpha("IOException thrown trying to obtain the response code");
        }
        InputStream errorStream = httpURLConnection.getErrorStream();
        if (errorStream != null) {
            return new C3306a(errorStream, dVar, this.echo);
        }
        return errorStream;
    }

    public final InputStream echo() {
        Timer timer = this.echo;
        india();
        HttpURLConnection httpURLConnection = this.alpha;
        int responseCode = httpURLConnection.getResponseCode();
        v8.d dVar = this.bravo;
        dVar.foxtrot(responseCode);
        dVar.india(httpURLConnection.getContentType());
        try {
            InputStream inputStream = httpURLConnection.getInputStream();
            if (inputStream != null) {
                return new C3306a(inputStream, dVar, timer);
            }
            return inputStream;
        } catch (IOException e) {
            AbstractC2327c.black(timer, dVar, dVar);
            throw e;
        }
    }

    public final boolean equals(Object obj) {
        return this.alpha.equals(obj);
    }

    public final OutputStream foxtrot() {
        Timer timer = this.echo;
        v8.d dVar = this.bravo;
        try {
            OutputStream outputStream = this.alpha.getOutputStream();
            if (outputStream != null) {
                return new b(outputStream, dVar, timer);
            }
            return outputStream;
        } catch (IOException e) {
            AbstractC2327c.black(timer, dVar, dVar);
            throw e;
        }
    }

    public final int golf() {
        india();
        long j5 = this.delta;
        Timer timer = this.echo;
        v8.d dVar = this.bravo;
        if (j5 == -1) {
            long charlie = timer.charlie();
            this.delta = charlie;
            p pVar = dVar.silver;
            pVar.india();
            r.zulu((r) pVar.purple, charlie);
        }
        try {
            int responseCode = this.alpha.getResponseCode();
            dVar.foxtrot(responseCode);
            return responseCode;
        } catch (IOException e) {
            AbstractC2327c.black(timer, dVar, dVar);
            throw e;
        }
    }

    public final int hashCode() {
        return this.alpha.hashCode();
    }

    public final String hotel() {
        HttpURLConnection httpURLConnection = this.alpha;
        india();
        long j5 = this.delta;
        Timer timer = this.echo;
        v8.d dVar = this.bravo;
        if (j5 == -1) {
            long charlie = timer.charlie();
            this.delta = charlie;
            p pVar = dVar.silver;
            pVar.india();
            r.zulu((r) pVar.purple, charlie);
        }
        try {
            String responseMessage = httpURLConnection.getResponseMessage();
            dVar.foxtrot(httpURLConnection.getResponseCode());
            return responseMessage;
        } catch (IOException e) {
            AbstractC2327c.black(timer, dVar, dVar);
            throw e;
        }
    }

    public final void india() {
        long j5 = this.charlie;
        v8.d dVar = this.bravo;
        if (j5 == -1) {
            Timer timer = this.echo;
            timer.echo();
            long j6 = timer.alpha;
            this.charlie = j6;
            dVar.hotel(j6);
        }
        HttpURLConnection httpURLConnection = this.alpha;
        String requestMethod = httpURLConnection.getRequestMethod();
        if (requestMethod != null) {
            dVar.echo(requestMethod);
        } else if (httpURLConnection.getDoOutput()) {
            dVar.echo("POST");
        } else {
            dVar.echo("GET");
        }
    }

    public final String toString() {
        return this.alpha.toString();
    }
}
