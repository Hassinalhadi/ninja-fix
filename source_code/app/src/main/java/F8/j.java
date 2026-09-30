package F8;

import A2.af;
import A2.ao;
import android.text.format.DateUtils;
import com.google.android.gms.internal.measurement.J;
import com.google.android.gms.tasks.Task;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigFetchThrottledException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigServerException;
import com.google.firebase.remoteconfig.internal.ConfigFetchHttpClient;
import com.google.mlkit.vision.barcode.common.Barcode;
import com.zendesk.service.HttpConstants;
import i8.InterfaceC1904b;
import j8.C1946c;
import j8.InterfaceC1947d;
import java.net.HttpURLConnection;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import s6.V4;

/* loaded from: classes2.dex */
public final class j {
    public static final long india = TimeUnit.HOURS.toSeconds(12);
    public static final int[] juliet = {2, 4, 8, 16, 32, 64, 128, Barcode.FORMAT_QR_CODE};
    public final InterfaceC1947d alpha;
    public final InterfaceC1904b bravo;
    public final Executor charlie;
    public final Random delta;
    public final e echo;
    public final ConfigFetchHttpClient foxtrot;
    public final o golf;
    public final HashMap hotel;

    public j(InterfaceC1947d interfaceC1947d, InterfaceC1904b interfaceC1904b, Executor executor, Random random, e eVar, ConfigFetchHttpClient configFetchHttpClient, o oVar, HashMap hashMap) {
        this.alpha = interfaceC1947d;
        this.bravo = interfaceC1904b;
        this.charlie = executor;
        this.delta = random;
        this.echo = eVar;
        this.foxtrot = configFetchHttpClient;
        this.golf = oVar;
        this.hotel = hashMap;
    }

    public final G6.q alpha(long j5) {
        HashMap hashMap = new HashMap(this.hotel);
        hashMap.put("X-Firebase-RC-Fetch-Type", "BASE/1");
        return this.echo.bravo().foxtrot(this.charlie, new h(this, j5, hashMap));
    }

    public final i bravo(String str, String str2, Date date, HashMap hashMap) {
        String str3;
        try {
            HttpURLConnection bravo = this.foxtrot.bravo();
            ConfigFetchHttpClient configFetchHttpClient = this.foxtrot;
            HashMap echo = echo();
            Long l10 = null;
            String string = this.golf.alpha.getString("last_fetch_etag", null);
            F7.b bVar = (F7.b) this.bravo.get();
            if (bVar != null) {
                l10 = (Long) ((J) ((F7.c) bVar).alpha.purple).foxtrot(null, null, true).get("_fot");
            }
            i fetch = configFetchHttpClient.fetch(bravo, str, str2, echo, string, hashMap, l10, date, this.golf.bravo());
            g gVar = fetch.bravo;
            if (gVar != null) {
                o oVar = this.golf;
                long j5 = gVar.foxtrot;
                synchronized (oVar.bravo) {
                    oVar.alpha.edit().putLong("last_template_version", j5).apply();
                }
            }
            String str4 = fetch.charlie;
            if (str4 != null) {
                this.golf.echo(str4);
            }
            this.golf.delta(o.foxtrot, 0);
            return fetch;
        } catch (FirebaseRemoteConfigServerException e) {
            int httpStatusCode = e.getHttpStatusCode();
            o oVar2 = this.golf;
            if (httpStatusCode == 429 || httpStatusCode == 502 || httpStatusCode == 503 || httpStatusCode == 504) {
                int i4 = oVar2.alpha().alpha + 1;
                TimeUnit timeUnit = TimeUnit.MINUTES;
                int[] iArr = juliet;
                oVar2.delta(new Date(date.getTime() + (timeUnit.toMillis(iArr[Math.min(i4, iArr.length) - 1]) / 2) + this.delta.nextInt((int) r3)), i4);
            }
            n alpha = oVar2.alpha();
            int httpStatusCode2 = e.getHttpStatusCode();
            if (alpha.alpha <= 1 && httpStatusCode2 != 429) {
                int httpStatusCode3 = e.getHttpStatusCode();
                if (httpStatusCode3 != 401) {
                    if (httpStatusCode3 != 403) {
                        if (httpStatusCode3 != 429) {
                            if (httpStatusCode3 != 500) {
                                switch (httpStatusCode3) {
                                    case HttpConstants.HTTP_BAD_GATEWAY /* 502 */:
                                    case HttpConstants.HTTP_UNAVAILABLE /* 503 */:
                                    case HttpConstants.HTTP_GATEWAY_TIMEOUT /* 504 */:
                                        str3 = "The server is unavailable. Please try again later.";
                                        break;
                                    default:
                                        str3 = "The server returned an unexpected error.";
                                        break;
                                }
                            } else {
                                str3 = "There was an internal server error.";
                            }
                        } else {
                            throw new FirebaseRemoteConfigClientException("The throttled response from the server was not handled correctly by the FRC SDK.");
                        }
                    } else {
                        str3 = "The user is not authorized to access the project. Please make sure you are using the API key that corresponds to your Firebase project.";
                    }
                } else {
                    str3 = "The request did not have the required credentials. Please make sure your google-services.json is valid.";
                }
                throw new FirebaseRemoteConfigServerException(e.getHttpStatusCode(), "Fetch failed: ".concat(str3), e);
            }
            throw new FirebaseRemoteConfigFetchThrottledException(alpha.bravo.getTime());
        }
    }

    public final G6.q charlie(Task task, long j5, HashMap hashMap) {
        G6.q foxtrot;
        boolean before;
        Date date = new Date(System.currentTimeMillis());
        boolean juliet2 = task.juliet();
        o oVar = this.golf;
        Date date2 = null;
        if (juliet2) {
            Date date3 = new Date(oVar.alpha.getLong("last_fetch_time_in_millis", -1L));
            if (date3.equals(o.echo)) {
                before = false;
            } else {
                before = date.before(new Date(TimeUnit.SECONDS.toMillis(j5) + date3.getTime()));
            }
            if (before) {
                return V4.echo(new i(2, null, null));
            }
        }
        Date date4 = oVar.alpha().bravo;
        if (date.before(date4)) {
            date2 = date4;
        }
        Executor executor = this.charlie;
        if (date2 != null) {
            foxtrot = V4.delta(new FirebaseRemoteConfigFetchThrottledException(av.q.echo("Fetch is throttled. Please wait before calling fetch again: ", DateUtils.formatElapsedTime(TimeUnit.MILLISECONDS.toSeconds(date2.getTime() - date.getTime()))), date2.getTime()));
        } else {
            C1946c c1946c = (C1946c) this.alpha;
            G6.q delta = c1946c.delta();
            G6.q echo = c1946c.echo();
            foxtrot = V4.golf(delta, echo).foxtrot(executor, new af(this, delta, echo, date, hashMap));
        }
        return foxtrot.foxtrot(executor, new ao(3, this, date));
    }

    public final G6.q delta(int i4) {
        HashMap hashMap = new HashMap(this.hotel);
        hashMap.put("X-Firebase-RC-Fetch-Type", "REALTIME/" + i4);
        return this.echo.bravo().foxtrot(this.charlie, new ao(4, this, hashMap));
    }

    public final HashMap echo() {
        HashMap hashMap = new HashMap();
        F7.b bVar = (F7.b) this.bravo.get();
        if (bVar != null) {
            for (Map.Entry entry : ((J) ((F7.c) bVar).alpha.purple).foxtrot(null, null, false).entrySet()) {
                hashMap.put((String) entry.getKey(), entry.getValue().toString());
            }
        }
        return hashMap;
    }
}
