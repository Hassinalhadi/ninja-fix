package w8;

import C8.r;
import android.content.Context;
import android.content.res.Resources;
import com.google.maps.android.BuildConfig;
import java.net.URI;
import s6.AbstractC2746q0;
import u8.C3146a;

/* loaded from: classes2.dex */
public final class c extends e {
    public static final C3146a charlie = C3146a.delta();
    public final r alpha;
    public final Context bravo;

    public c(r rVar, Context context) {
        this.bravo = context;
        this.alpha = rVar;
    }

    @Override // w8.e
    public final boolean alpha() {
        boolean isEmpty;
        int i4;
        String str;
        r rVar = this.alpha;
        String ivory = rVar.ivory();
        if (ivory == null) {
            isEmpty = true;
        } else {
            isEmpty = ivory.trim().isEmpty();
        }
        C3146a c3146a = charlie;
        if (isEmpty) {
            c3146a.foxtrot("URL is missing:" + rVar.ivory());
            return false;
        }
        String ivory2 = rVar.ivory();
        URI uri = null;
        if (ivory2 != null) {
            try {
                uri = URI.create(ivory2);
            } catch (IllegalArgumentException | IllegalStateException e) {
                c3146a.golf("getResultUrl throws exception %s", e.getMessage());
            }
        }
        if (uri == null) {
            c3146a.foxtrot("URL cannot be parsed");
            return false;
        }
        Context context = this.bravo;
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("firebase_performance_whitelisted_domains", "array", context.getPackageName());
        if (identifier != 0) {
            C3146a.delta().alpha("Detected domain allowlist, only allowlisted domains will be measured.");
            if (AbstractC2746q0.alpha == null) {
                AbstractC2746q0.alpha = resources.getStringArray(identifier);
            }
            String host = uri.getHost();
            if (host != null) {
                for (String str2 : AbstractC2746q0.alpha) {
                    if (!host.contains(str2)) {
                    }
                }
                c3146a.foxtrot("URL fails allowlist rule: " + uri);
                return false;
            }
        }
        String host2 = uri.getHost();
        if (host2 != null && !host2.trim().isEmpty() && host2.length() <= 255) {
            String scheme = uri.getScheme();
            if (scheme == null || (!"http".equalsIgnoreCase(scheme) && !"https".equalsIgnoreCase(scheme))) {
                c3146a.foxtrot("URL scheme is null or invalid");
                return false;
            }
            if (uri.getUserInfo() == null) {
                int port = uri.getPort();
                if (port != -1 && port <= 0) {
                    c3146a.foxtrot("URL port is less than or equal to 0");
                    return false;
                }
                if (rVar.lavender()) {
                    i4 = rVar.crimson();
                } else {
                    i4 = 0;
                }
                if (i4 != 0 && i4 != 1) {
                    if (rVar.lime() && rVar.cyan() <= 0) {
                        c3146a.foxtrot("HTTP ResponseCode is a negative value:" + rVar.cyan());
                        return false;
                    }
                    if (rVar.magenta() && rVar.fuchsia() < 0) {
                        c3146a.foxtrot("Request Payload is a negative value:" + rVar.fuchsia());
                        return false;
                    }
                    if (rVar.maroon() && rVar.gold() < 0) {
                        c3146a.foxtrot("Response Payload is a negative value:" + rVar.gold());
                        return false;
                    }
                    if (rVar.jade() && rVar.bronze() > 0) {
                        if (rVar.navy() && rVar.gray() < 0) {
                            c3146a.foxtrot("Time to complete the request is a negative value:" + rVar.gray());
                            return false;
                        }
                        if (rVar.olive() && rVar.indigo() < 0) {
                            c3146a.foxtrot("Time from the start of the request to the start of the response is null or a negative value:" + rVar.indigo());
                            return false;
                        }
                        if (rVar.ochre() && rVar.green() > 0) {
                            if (rVar.lime()) {
                                return true;
                            }
                            c3146a.foxtrot("Did not receive a HTTP Response Code");
                            return false;
                        }
                        c3146a.foxtrot("Time from the start of the request to the end of the response is null, negative or zero:" + rVar.green());
                        return false;
                    }
                    c3146a.foxtrot("Start time of the request is null, or zero, or a negative value:" + rVar.bronze());
                    return false;
                }
                switch (rVar.crimson()) {
                    case 1:
                        str = "HTTP_METHOD_UNKNOWN";
                        break;
                    case 2:
                        str = "GET";
                        break;
                    case 3:
                        str = "PUT";
                        break;
                    case 4:
                        str = "POST";
                        break;
                    case 5:
                        str = "DELETE";
                        break;
                    case 6:
                        str = "HEAD";
                        break;
                    case 7:
                        str = "PATCH";
                        break;
                    case 8:
                        str = "OPTIONS";
                        break;
                    case 9:
                        str = "TRACE";
                        break;
                    case 10:
                        str = "CONNECT";
                        break;
                    default:
                        str = BuildConfig.TRAVIS;
                        break;
                }
                c3146a.foxtrot("HTTP Method is null or invalid: ".concat(str));
                return false;
            }
            c3146a.foxtrot("URL user info is null");
            return false;
        }
        c3146a.foxtrot("URL host is null or invalid");
        return false;
    }
}
