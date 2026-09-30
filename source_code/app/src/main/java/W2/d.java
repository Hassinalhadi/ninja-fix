package W2;

import a3.h;
import a3.p;
import android.graphics.Bitmap;
import com.airbnb.lottie.compose.LottieConstants;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.r;
import okhttp3.CacheControl;
import okhttp3.Headers;
import okhttp3.Request;

/* loaded from: classes3.dex */
public final class d {
    public final Request alpha;
    public final b bravo;
    public final Date charlie;
    public final String delta;
    public final Date echo;
    public final String foxtrot;
    public final Date golf;
    public final long hotel;
    public final long india;
    public final String juliet;
    public final int kilo;

    public d(Request request, b bVar) {
        int i4;
        this.alpha = request;
        this.bravo = bVar;
        this.kilo = -1;
        if (bVar != null) {
            this.hotel = bVar.charlie;
            this.india = bVar.delta;
            Headers headers = bVar.foxtrot;
            int size = headers.size();
            for (int i5 = 0; i5 < size; i5++) {
                String name = headers.name(i5);
                if (r.hotel(name, "Date", true)) {
                    this.charlie = headers.getDate("Date");
                    this.delta = headers.value(i5);
                } else if (r.hotel(name, "Expires", true)) {
                    this.golf = headers.getDate("Expires");
                } else if (r.hotel(name, "Last-Modified", true)) {
                    this.echo = headers.getDate("Last-Modified");
                    this.foxtrot = headers.value(i5);
                } else if (r.hotel(name, "ETag", true)) {
                    this.juliet = headers.value(i5);
                } else if (r.hotel(name, "Age", true)) {
                    String value = headers.value(i5);
                    Bitmap.Config[] configArr = h.alpha;
                    Long uniform = r.uniform(value);
                    if (uniform != null) {
                        long longValue = uniform.longValue();
                        if (longValue > 2147483647L) {
                            i4 = LottieConstants.IterateForever;
                        } else if (longValue < 0) {
                            i4 = 0;
                        } else {
                            i4 = (int) longValue;
                        }
                    } else {
                        i4 = -1;
                    }
                    this.kilo = i4;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x00e0, code lost:
    
        if (r4 > r16) goto L52;
     */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final e alpha() {
        long j5;
        long j6;
        Lazy lazy;
        CacheControl cacheControl;
        long j7;
        long j10;
        long j11;
        long j12;
        Request request = this.alpha;
        b bVar = this.bravo;
        if (bVar == null) {
            return new e(request, null);
        }
        if (request.isHttps() && !bVar.echo) {
            return new e(request, null);
        }
        ?? r4 = bVar.alpha;
        CacheControl cacheControl2 = (CacheControl) r4.getValue();
        if (!request.cacheControl().noStore() && !((CacheControl) r4.getValue()).noStore() && !Intrinsics.areEqual(bVar.foxtrot.get("Vary"), "*")) {
            CacheControl cacheControl3 = request.cacheControl();
            if (!cacheControl3.noCache()) {
                String str = "If-Modified-Since";
                if (request.header("If-Modified-Since") == null && request.header("If-None-Match") == null) {
                    long j13 = this.india;
                    Date date = this.charlie;
                    if (date != null) {
                        j5 = Math.max(0L, j13 - date.getTime());
                        j6 = 0;
                    } else {
                        j5 = 0;
                        j6 = 0;
                    }
                    int i4 = this.kilo;
                    if (i4 != -1) {
                        lazy = r4;
                        cacheControl = cacheControl2;
                        j5 = Math.max(j5, TimeUnit.SECONDS.toMillis(i4));
                    } else {
                        lazy = r4;
                        cacheControl = cacheControl2;
                    }
                    long j14 = this.hotel;
                    long longValue = j5 + (j13 - j14) + (((Number) p.alpha.invoke()).longValue() - j13);
                    Intrinsics.checkNotNull(bVar);
                    int maxAgeSeconds = ((CacheControl) lazy.getValue()).maxAgeSeconds();
                    Date date2 = this.echo;
                    if (maxAgeSeconds != -1) {
                        j7 = TimeUnit.SECONDS.toMillis(r2.maxAgeSeconds());
                    } else {
                        Date date3 = this.golf;
                        if (date3 != null) {
                            if (date != null) {
                                j13 = date.getTime();
                            }
                            j7 = date3.getTime() - j13;
                        } else {
                            if (date2 != null && request.url().query() == null) {
                                if (date != null) {
                                    j14 = date.getTime();
                                }
                                Intrinsics.checkNotNull(date2);
                                long time = j14 - date2.getTime();
                                if (time > j6) {
                                    j7 = time / 10;
                                }
                            }
                            j7 = j6;
                        }
                    }
                    if (cacheControl3.maxAgeSeconds() != -1) {
                        j10 = longValue;
                        j7 = Math.min(j7, TimeUnit.SECONDS.toMillis(cacheControl3.maxAgeSeconds()));
                    } else {
                        j10 = longValue;
                    }
                    if (cacheControl3.minFreshSeconds() != -1) {
                        j11 = TimeUnit.SECONDS.toMillis(cacheControl3.minFreshSeconds());
                    } else {
                        j11 = j6;
                    }
                    if (!cacheControl.mustRevalidate() && cacheControl3.maxStaleSeconds() != -1) {
                        j12 = TimeUnit.SECONDS.toMillis(cacheControl3.maxStaleSeconds());
                    } else {
                        j12 = j6;
                    }
                    if (!cacheControl.noCache() && j10 + j11 < j7 + j12) {
                        return new e(null, bVar);
                    }
                    String str2 = this.juliet;
                    if (str2 != null) {
                        Intrinsics.checkNotNull(str2);
                        str = "If-None-Match";
                    } else if (date2 != null) {
                        str2 = this.foxtrot;
                        Intrinsics.checkNotNull(str2);
                    } else if (date != null) {
                        str2 = this.delta;
                        Intrinsics.checkNotNull(str2);
                    } else {
                        return new e(request, null);
                    }
                    return new e(request.newBuilder().addHeader(str, str2).build(), bVar);
                }
            }
            return new e(request, null);
        }
        return new e(request, null);
    }
}
