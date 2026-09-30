package B2;

import android.app.job.JobInfo;
import android.net.Uri;
import android.os.Build;
import android.os.LocaleList;
import android.text.style.LocaleSpan;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.ExtendedSSLSession;
import javax.net.ssl.SNIHostName;
import javax.net.ssl.SNIServerName;
import javax.net.ssl.SSLSession;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class v {
    public static /* bridge */ /* synthetic */ boolean amber(Object obj) {
        return obj instanceof SNIHostName;
    }

    public static /* bridge */ /* synthetic */ boolean azure(SSLSession sSLSession) {
        return sSLSession instanceof ExtendedSSLSession;
    }

    public static /* synthetic */ JobInfo.TriggerContentUri charlie(Uri uri, int i4) {
        return new JobInfo.TriggerContentUri(uri, i4);
    }

    public static /* synthetic */ LocaleSpan echo(LocaleList localeList) {
        return new LocaleSpan(localeList);
    }

    public static /* bridge */ /* synthetic */ ExtendedSSLSession lima(SSLSession sSLSession) {
        return (ExtendedSSLSession) sSLSession;
    }

    public static /* bridge */ /* synthetic */ SNIServerName mike(Object obj) {
        return (SNIServerName) obj;
    }

    public static /* synthetic */ void november() {
    }

    public static /* synthetic */ void oscar(I3.e eVar) {
        boolean isTerminated;
        if ((Build.VERSION.SDK_INT <= 23 || eVar != ForkJoinPool.commonPool()) && !(isTerminated = eVar.isTerminated())) {
            eVar.shutdown();
            boolean z2 = false;
            while (!isTerminated) {
                try {
                    isTerminated = eVar.awaitTermination(1L, TimeUnit.DAYS);
                } catch (InterruptedException unused) {
                    if (!z2) {
                        eVar.shutdownNow();
                        z2 = true;
                    }
                }
            }
            if (z2) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public static void papa(J7.f fVar) {
        if ((Build.VERSION.SDK_INT > 23 && fVar == ForkJoinPool.commonPool()) || fVar.alpha.isTerminated()) {
            return;
        }
        fVar.shutdown();
        throw null;
    }

    public static /* bridge */ /* synthetic */ void quebec(L0.f fVar, LocaleList localeList) {
        fVar.setTextLocales(localeList);
    }
}
