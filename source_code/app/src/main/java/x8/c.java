package x8;

import android.os.Build;
import com.google.firebase.perf.util.Timer;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.Permission;
import java.util.Map;

/* loaded from: classes2.dex */
public final class c extends HttpURLConnection {
    public final e alpha;

    public c(HttpURLConnection httpURLConnection, Timer timer, v8.d dVar) {
        super(httpURLConnection.getURL());
        this.alpha = new e(httpURLConnection, timer, dVar);
    }

    @Override // java.net.URLConnection
    public final void addRequestProperty(String str, String str2) {
        this.alpha.alpha.addRequestProperty(str, str2);
    }

    @Override // java.net.URLConnection
    public final void connect() {
        this.alpha.alpha();
    }

    @Override // java.net.HttpURLConnection
    public final void disconnect() {
        e eVar = this.alpha;
        long charlie = eVar.echo.charlie();
        v8.d dVar = eVar.bravo;
        dVar.kilo(charlie);
        dVar.delta();
        eVar.alpha.disconnect();
    }

    public final boolean equals(Object obj) {
        return this.alpha.alpha.equals(obj);
    }

    @Override // java.net.URLConnection
    public final boolean getAllowUserInteraction() {
        return this.alpha.alpha.getAllowUserInteraction();
    }

    @Override // java.net.URLConnection
    public final int getConnectTimeout() {
        return this.alpha.alpha.getConnectTimeout();
    }

    @Override // java.net.URLConnection
    public final Object getContent() {
        return this.alpha.bravo();
    }

    @Override // java.net.URLConnection
    public final String getContentEncoding() {
        e eVar = this.alpha;
        eVar.india();
        return eVar.alpha.getContentEncoding();
    }

    @Override // java.net.URLConnection
    public final int getContentLength() {
        e eVar = this.alpha;
        eVar.india();
        return eVar.alpha.getContentLength();
    }

    @Override // java.net.URLConnection
    public final long getContentLengthLong() {
        long contentLengthLong;
        e eVar = this.alpha;
        eVar.india();
        if (Build.VERSION.SDK_INT >= 24) {
            contentLengthLong = eVar.alpha.getContentLengthLong();
            return contentLengthLong;
        }
        return 0L;
    }

    @Override // java.net.URLConnection
    public final String getContentType() {
        e eVar = this.alpha;
        eVar.india();
        return eVar.alpha.getContentType();
    }

    @Override // java.net.URLConnection
    public final long getDate() {
        e eVar = this.alpha;
        eVar.india();
        return eVar.alpha.getDate();
    }

    @Override // java.net.URLConnection
    public final boolean getDefaultUseCaches() {
        return this.alpha.alpha.getDefaultUseCaches();
    }

    @Override // java.net.URLConnection
    public final boolean getDoInput() {
        return this.alpha.alpha.getDoInput();
    }

    @Override // java.net.URLConnection
    public final boolean getDoOutput() {
        return this.alpha.alpha.getDoOutput();
    }

    @Override // java.net.HttpURLConnection
    public final InputStream getErrorStream() {
        return this.alpha.delta();
    }

    @Override // java.net.URLConnection
    public final long getExpiration() {
        e eVar = this.alpha;
        eVar.india();
        return eVar.alpha.getExpiration();
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public final String getHeaderField(int i4) {
        e eVar = this.alpha;
        eVar.india();
        return eVar.alpha.getHeaderField(i4);
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public final long getHeaderFieldDate(String str, long j5) {
        e eVar = this.alpha;
        eVar.india();
        return eVar.alpha.getHeaderFieldDate(str, j5);
    }

    @Override // java.net.URLConnection
    public final int getHeaderFieldInt(String str, int i4) {
        e eVar = this.alpha;
        eVar.india();
        return eVar.alpha.getHeaderFieldInt(str, i4);
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public final String getHeaderFieldKey(int i4) {
        e eVar = this.alpha;
        eVar.india();
        return eVar.alpha.getHeaderFieldKey(i4);
    }

    @Override // java.net.URLConnection
    public final long getHeaderFieldLong(String str, long j5) {
        long headerFieldLong;
        e eVar = this.alpha;
        eVar.india();
        if (Build.VERSION.SDK_INT >= 24) {
            headerFieldLong = eVar.alpha.getHeaderFieldLong(str, j5);
            return headerFieldLong;
        }
        return 0L;
    }

    @Override // java.net.URLConnection
    public final Map getHeaderFields() {
        e eVar = this.alpha;
        eVar.india();
        return eVar.alpha.getHeaderFields();
    }

    @Override // java.net.URLConnection
    public final long getIfModifiedSince() {
        return this.alpha.alpha.getIfModifiedSince();
    }

    @Override // java.net.URLConnection
    public final InputStream getInputStream() {
        return this.alpha.echo();
    }

    @Override // java.net.HttpURLConnection
    public final boolean getInstanceFollowRedirects() {
        return this.alpha.alpha.getInstanceFollowRedirects();
    }

    @Override // java.net.URLConnection
    public final long getLastModified() {
        e eVar = this.alpha;
        eVar.india();
        return eVar.alpha.getLastModified();
    }

    @Override // java.net.URLConnection
    public final OutputStream getOutputStream() {
        return this.alpha.foxtrot();
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public final Permission getPermission() {
        e eVar = this.alpha;
        eVar.getClass();
        try {
            return eVar.alpha.getPermission();
        } catch (IOException e) {
            long charlie = eVar.echo.charlie();
            v8.d dVar = eVar.bravo;
            dVar.kilo(charlie);
            g.charlie(dVar);
            throw e;
        }
    }

    @Override // java.net.URLConnection
    public final int getReadTimeout() {
        return this.alpha.alpha.getReadTimeout();
    }

    @Override // java.net.HttpURLConnection
    public final String getRequestMethod() {
        return this.alpha.alpha.getRequestMethod();
    }

    @Override // java.net.URLConnection
    public final Map getRequestProperties() {
        return this.alpha.alpha.getRequestProperties();
    }

    @Override // java.net.URLConnection
    public final String getRequestProperty(String str) {
        return this.alpha.alpha.getRequestProperty(str);
    }

    @Override // java.net.HttpURLConnection
    public final int getResponseCode() {
        return this.alpha.golf();
    }

    @Override // java.net.HttpURLConnection
    public final String getResponseMessage() {
        return this.alpha.hotel();
    }

    @Override // java.net.URLConnection
    public final URL getURL() {
        return this.alpha.alpha.getURL();
    }

    @Override // java.net.URLConnection
    public final boolean getUseCaches() {
        return this.alpha.alpha.getUseCaches();
    }

    public final int hashCode() {
        return this.alpha.alpha.hashCode();
    }

    @Override // java.net.URLConnection
    public final void setAllowUserInteraction(boolean z2) {
        this.alpha.alpha.setAllowUserInteraction(z2);
    }

    @Override // java.net.HttpURLConnection
    public final void setChunkedStreamingMode(int i4) {
        this.alpha.alpha.setChunkedStreamingMode(i4);
    }

    @Override // java.net.URLConnection
    public final void setConnectTimeout(int i4) {
        this.alpha.alpha.setConnectTimeout(i4);
    }

    @Override // java.net.URLConnection
    public final void setDefaultUseCaches(boolean z2) {
        this.alpha.alpha.setDefaultUseCaches(z2);
    }

    @Override // java.net.URLConnection
    public final void setDoInput(boolean z2) {
        this.alpha.alpha.setDoInput(z2);
    }

    @Override // java.net.URLConnection
    public final void setDoOutput(boolean z2) {
        this.alpha.alpha.setDoOutput(z2);
    }

    @Override // java.net.HttpURLConnection
    public final void setFixedLengthStreamingMode(int i4) {
        this.alpha.alpha.setFixedLengthStreamingMode(i4);
    }

    @Override // java.net.URLConnection
    public final void setIfModifiedSince(long j5) {
        this.alpha.alpha.setIfModifiedSince(j5);
    }

    @Override // java.net.HttpURLConnection
    public final void setInstanceFollowRedirects(boolean z2) {
        this.alpha.alpha.setInstanceFollowRedirects(z2);
    }

    @Override // java.net.URLConnection
    public final void setReadTimeout(int i4) {
        this.alpha.alpha.setReadTimeout(i4);
    }

    @Override // java.net.HttpURLConnection
    public final void setRequestMethod(String str) {
        this.alpha.alpha.setRequestMethod(str);
    }

    @Override // java.net.URLConnection
    public final void setRequestProperty(String str, String str2) {
        e eVar = this.alpha;
        eVar.getClass();
        if ("User-Agent".equalsIgnoreCase(str)) {
            eVar.bravo.white = str2;
        }
        eVar.alpha.setRequestProperty(str, str2);
    }

    @Override // java.net.URLConnection
    public final void setUseCaches(boolean z2) {
        this.alpha.alpha.setUseCaches(z2);
    }

    @Override // java.net.URLConnection
    public final String toString() {
        return this.alpha.alpha.toString();
    }

    @Override // java.net.HttpURLConnection
    public final boolean usingProxy() {
        return this.alpha.alpha.usingProxy();
    }

    @Override // java.net.URLConnection
    public final Object getContent(Class[] clsArr) {
        return this.alpha.charlie(clsArr);
    }

    @Override // java.net.URLConnection
    public final String getHeaderField(String str) {
        e eVar = this.alpha;
        eVar.india();
        return eVar.alpha.getHeaderField(str);
    }

    @Override // java.net.HttpURLConnection
    public final void setFixedLengthStreamingMode(long j5) {
        this.alpha.alpha.setFixedLengthStreamingMode(j5);
    }
}
