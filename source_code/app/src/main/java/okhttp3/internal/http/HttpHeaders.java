package okhttp3.internal.http;

import Tf.k;
import Tf.n;
import com.clevertap.android.sdk.Constants;
import g8.d;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.c;
import kotlin.collections.t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a;
import kotlin.text.r;
import okhttp3.Challenge;
import okhttp3.Cookie;
import okhttp3.CookieJar;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.Response;
import okhttp3.internal._UtilCommonKt;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.platform.Platform;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a!\u0010\u000b\u001a\u00020\n*\u00020\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\bH\u0002¢\u0006\u0004\b\u000b\u0010\f\u001a\u0013\u0010\u000e\u001a\u00020\r*\u00020\u0007H\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u001b\u0010\u0012\u001a\u00020\r*\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0015\u0010\u0014\u001a\u0004\u0018\u00010\u0001*\u00020\u0007H\u0002¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0015\u0010\u0016\u001a\u0004\u0018\u00010\u0001*\u00020\u0007H\u0002¢\u0006\u0004\b\u0016\u0010\u0015\u001a!\u0010\u001b\u001a\u00020\n*\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u0011\u0010\u001e\u001a\u00020\r*\u00020\u001d¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u0017\u0010!\u001a\u00020\r2\u0006\u0010 \u001a\u00020\u001dH\u0007¢\u0006\u0004\b!\u0010\u001f\"\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$\"\u0014\u0010%\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010$¨\u0006&"}, d2 = {"Lokhttp3/Headers;", "", "headerName", "", "Lokhttp3/Challenge;", "parseChallenges", "(Lokhttp3/Headers;Ljava/lang/String;)Ljava/util/List;", "LTf/k;", "", "result", "", "readChallengeHeader", "(LTf/k;Ljava/util/List;)V", "", "skipCommasAndWhitespace", "(LTf/k;)Z", "", "prefix", "startsWith", "(LTf/k;B)Z", "readQuotedString", "(LTf/k;)Ljava/lang/String;", "readToken", "Lokhttp3/CookieJar;", "Lokhttp3/HttpUrl;", Constants.KEY_URL, "headers", "receiveHeaders", "(Lokhttp3/CookieJar;Lokhttp3/HttpUrl;Lokhttp3/Headers;)V", "Lokhttp3/Response;", "promisesBody", "(Lokhttp3/Response;)Z", "response", "hasBody", "LTf/n;", "QUOTED_STRING_DELIMITERS", "LTf/n;", "TOKEN_DELIMITERS", "okhttp"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HttpHeaders {

    @NotNull
    private static final n QUOTED_STRING_DELIMITERS;

    @NotNull
    private static final n TOKEN_DELIMITERS;

    static {
        n nVar = n.silver;
        QUOTED_STRING_DELIMITERS = d.oscar("\"\\");
        TOKEN_DELIMITERS = d.oscar("\t ,=");
    }

    @c
    public static final boolean hasBody(@NotNull Response response) {
        Intrinsics.echo(response, "response");
        return promisesBody(response);
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [Tf.k, java.lang.Object] */
    @NotNull
    public static final List<Challenge> parseChallenges(@NotNull Headers headers, @NotNull String headerName) {
        Intrinsics.echo(headers, "<this>");
        Intrinsics.echo(headerName, "headerName");
        ArrayList arrayList = new ArrayList();
        int size = headers.size();
        for (int i4 = 0; i4 < size; i4++) {
            if (headerName.equalsIgnoreCase(headers.name(i4))) {
                ?? obj = new Object();
                obj.n(headers.value(i4));
                try {
                    readChallengeHeader(obj, arrayList);
                } catch (EOFException e) {
                    Platform.INSTANCE.get().log("Unable to parse challenge", 5, e);
                }
            }
        }
        return arrayList;
    }

    public static final boolean promisesBody(@NotNull Response response) {
        Intrinsics.echo(response, "<this>");
        if (Intrinsics.areEqual(response.request().method(), "HEAD")) {
            return false;
        }
        int code = response.code();
        if (((code >= 100 && code < 200) || code == 204 || code == 304) && _UtilJvmKt.headersContentLength(response) == -1 && !"chunked".equalsIgnoreCase(Response.header$default(response, "Transfer-Encoding", null, 2, null))) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00b7, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00b7, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void readChallengeHeader(k kVar, List<Challenge> list) throws EOFException {
        String readToken;
        int skipAll;
        String readToken2;
        while (true) {
            String str = null;
            while (true) {
                if (str == null) {
                    skipCommasAndWhitespace(kVar);
                    str = readToken(kVar);
                    if (str == null) {
                        return;
                    }
                }
                boolean skipCommasAndWhitespace = skipCommasAndWhitespace(kVar);
                readToken = readToken(kVar);
                if (readToken == null) {
                    if (kVar.hotel()) {
                        list.add(new Challenge(str, t.alpha));
                        return;
                    }
                    return;
                }
                skipAll = _UtilCommonKt.skipAll(kVar, (byte) 61);
                boolean skipCommasAndWhitespace2 = skipCommasAndWhitespace(kVar);
                if (skipCommasAndWhitespace || (!skipCommasAndWhitespace2 && !kVar.hotel())) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    int skipAll2 = _UtilCommonKt.skipAll(kVar, (byte) 61) + skipAll;
                    while (true) {
                        if (readToken == null) {
                            readToken = readToken(kVar);
                            if (!skipCommasAndWhitespace(kVar)) {
                                skipAll2 = _UtilCommonKt.skipAll(kVar, (byte) 61);
                            }
                        }
                        if (skipAll2 != 0) {
                            if (skipAll2 <= 1 && !skipCommasAndWhitespace(kVar)) {
                                if (startsWith(kVar, (byte) 34)) {
                                    readToken2 = readQuotedString(kVar);
                                } else {
                                    readToken2 = readToken(kVar);
                                }
                                if (readToken2 != null && ((String) linkedHashMap.put(readToken, readToken2)) == null) {
                                    if (!skipCommasAndWhitespace(kVar) && !kVar.hotel()) {
                                        return;
                                    } else {
                                        readToken = null;
                                    }
                                } else {
                                    return;
                                }
                            } else {
                                return;
                            }
                        }
                    }
                    list.add(new Challenge(str, linkedHashMap));
                    str = readToken;
                }
            }
            StringBuilder tango = Q0.c.tango(readToken);
            tango.append(r.mike(skipAll, "="));
            Map singletonMap = Collections.singletonMap(null, tango.toString());
            Intrinsics.delta(singletonMap, "singletonMap(...)");
            list.add(new Challenge(str, (Map<String, String>) singletonMap));
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [Tf.k, java.lang.Object] */
    private static final String readQuotedString(k kVar) throws EOFException {
        if (kVar.readByte() == 34) {
            ?? obj = new Object();
            while (true) {
                long i4 = kVar.i(QUOTED_STRING_DELIMITERS);
                if (i4 == -1) {
                    return null;
                }
                if (kVar.juliet(i4) == 34) {
                    obj.write(kVar, i4);
                    kVar.readByte();
                    return obj.green();
                }
                if (kVar.purple == i4 + 1) {
                    return null;
                }
                obj.write(kVar, i4);
                kVar.readByte();
                obj.write(kVar, 1L);
            }
        } else {
            throw new IllegalArgumentException("Failed requirement.");
        }
    }

    private static final String readToken(k kVar) {
        long i4 = kVar.i(TOKEN_DELIMITERS);
        if (i4 == -1) {
            i4 = kVar.purple;
        }
        if (i4 != 0) {
            return kVar.gray(i4, a.alpha);
        }
        return null;
    }

    public static final void receiveHeaders(@NotNull CookieJar cookieJar, @NotNull HttpUrl url, @NotNull Headers headers) {
        Intrinsics.echo(cookieJar, "<this>");
        Intrinsics.echo(url, "url");
        Intrinsics.echo(headers, "headers");
        if (cookieJar != CookieJar.NO_COOKIES) {
            List<Cookie> parseAll = Cookie.INSTANCE.parseAll(url, headers);
            if (parseAll.isEmpty()) {
                return;
            }
            cookieJar.saveFromResponse(url, parseAll);
        }
    }

    private static final boolean skipCommasAndWhitespace(k kVar) {
        boolean z2 = false;
        while (!kVar.hotel()) {
            byte juliet = kVar.juliet(0L);
            if (juliet == 44) {
                kVar.readByte();
                z2 = true;
            } else {
                if (juliet != 32 && juliet != 9) {
                    break;
                }
                kVar.readByte();
            }
        }
        return z2;
    }

    private static final boolean startsWith(k kVar, byte b2) {
        if (!kVar.hotel() && kVar.juliet(0L) == b2) {
            return true;
        }
        return false;
    }
}
