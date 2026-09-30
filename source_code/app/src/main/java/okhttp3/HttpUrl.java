package okhttp3;

import ao.ad;
import av.q;
import com.clevertap.android.sdk.Constants;
import fe.C1713e;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.c;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.r;
import okhttp3.internal._HostnamesCommonKt;
import okhttp3.internal._UtilCommonKt;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import okhttp3.internal.url._UrlKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import s6.AbstractC2770s7;
import s6.J4;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\"\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u001b\u0018\u0000 K2\u00020\u0001:\u0002JKBc\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\n\u0012\u0010\u0010\u000b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0016\u001a\u00020\u0017H\u0007¢\u0006\u0002\b\rJ\r\u0010\u0018\u001a\u00020\u0019H\u0007¢\u0006\u0002\b\u001aJ\u0010\u0010#\u001a\u0004\u0018\u00010\u00032\u0006\u0010$\u001a\u00020\u0003J\u0016\u0010(\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\n2\u0006\u0010$\u001a\u00020\u0003J\u000e\u0010)\u001a\u00020\u00032\u0006\u0010*\u001a\u00020\bJ\u0010\u0010+\u001a\u0004\u0018\u00010\u00032\u0006\u0010*\u001a\u00020\bJ\u0006\u0010-\u001a\u00020\u0003J\u0010\u0010.\u001a\u0004\u0018\u00010\u00002\u0006\u0010/\u001a\u00020\u0003J\u0006\u00100\u001a\u000201J\u0010\u00100\u001a\u0004\u0018\u0001012\u0006\u0010/\u001a\u00020\u0003J\u0013\u00102\u001a\u00020\u00142\b\u00103\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u00104\u001a\u00020\bH\u0016J\b\u00105\u001a\u00020\u0003H\u0016J\b\u00106\u001a\u0004\u0018\u00010\u0003J\r\u0010\r\u001a\u00020\u0017H\u0007¢\u0006\u0002\b7J\r\u0010\u001a\u001a\u00020\u0019H\u0007¢\u0006\u0002\b8J\r\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0002\b9J\r\u0010\u001b\u001a\u00020\u0003H\u0007¢\u0006\u0002\b:J\r\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0002\b;J\r\u0010\u001c\u001a\u00020\u0003H\u0007¢\u0006\u0002\b<J\r\u0010\u0005\u001a\u00020\u0003H\u0007¢\u0006\u0002\b=J\r\u0010\u0006\u001a\u00020\u0003H\u0007¢\u0006\u0002\b>J\r\u0010\u0007\u001a\u00020\bH\u0007¢\u0006\u0002\b?J\r\u0010\u001d\u001a\u00020\bH\u0007¢\u0006\u0002\b@J\r\u0010\u001e\u001a\u00020\u0003H\u0007¢\u0006\u0002\bAJ\u0013\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00030\nH\u0007¢\u0006\u0002\bBJ\u0013\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\nH\u0007¢\u0006\u0002\bCJ\u000f\u0010 \u001a\u0004\u0018\u00010\u0003H\u0007¢\u0006\u0002\bDJ\u000f\u0010!\u001a\u0004\u0018\u00010\u0003H\u0007¢\u0006\u0002\bEJ\r\u0010\"\u001a\u00020\bH\u0007¢\u0006\u0002\bFJ\u0013\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00030&H\u0007¢\u0006\u0002\bGJ\u000f\u0010,\u001a\u0004\u0018\u00010\u0003H\u0007¢\u0006\u0002\bHJ\u000f\u0010\f\u001a\u0004\u0018\u00010\u0003H\u0007¢\u0006\u0002\bIR\u0013\u0010\u0002\u001a\u00020\u00038G¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0010R\u0013\u0010\u0004\u001a\u00020\u00038G¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0010R\u0013\u0010\u0005\u001a\u00020\u00038G¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0010R\u0013\u0010\u0006\u001a\u00020\u00038G¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0010R\u0013\u0010\u0007\u001a\u00020\b8G¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0011R\u0019\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\n8G¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0012R\u0018\u0010\u000b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0015\u0010\f\u001a\u0004\u0018\u00010\u00038G¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0010R\u000e\u0010\r\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0013\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0015R\u0011\u0010\u001b\u001a\u00020\u00038G¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0010R\u0011\u0010\u001c\u001a\u00020\u00038G¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0010R\u0011\u0010\u001d\u001a\u00020\b8G¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0011R\u0011\u0010\u001e\u001a\u00020\u00038G¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0010R\u0017\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00030\n8G¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0012R\u0013\u0010 \u001a\u0004\u0018\u00010\u00038G¢\u0006\u0006\u001a\u0004\b \u0010\u0010R\u0013\u0010!\u001a\u0004\u0018\u00010\u00038G¢\u0006\u0006\u001a\u0004\b!\u0010\u0010R\u0011\u0010\"\u001a\u00020\b8G¢\u0006\u0006\u001a\u0004\b\"\u0010\u0011R\u0017\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00030&8G¢\u0006\u0006\u001a\u0004\b%\u0010'R\u0013\u0010,\u001a\u0004\u0018\u00010\u00038G¢\u0006\u0006\u001a\u0004\b,\u0010\u0010¨\u0006L"}, d2 = {"Lokhttp3/HttpUrl;", "", "scheme", "", "username", "password", "host", "port", "", "pathSegments", "", "queryNamesAndValues", "fragment", Constants.KEY_URL, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "()Ljava/lang/String;", "()I", "()Ljava/util/List;", "isHttps", "", "()Z", "toUrl", "Ljava/net/URL;", "toUri", "Ljava/net/URI;", "uri", "encodedUsername", "encodedPassword", "pathSize", "encodedPath", "encodedPathSegments", "encodedQuery", "query", "querySize", "queryParameter", "name", "queryParameterNames", "", "()Ljava/util/Set;", "queryParameterValues", "queryParameterName", "index", "queryParameterValue", "encodedFragment", "redact", "resolve", "link", "newBuilder", "Lokhttp3/HttpUrl$Builder;", "equals", "other", "hashCode", "toString", "topPrivateDomain", "-deprecated_url", "-deprecated_uri", "-deprecated_scheme", "-deprecated_encodedUsername", "-deprecated_username", "-deprecated_encodedPassword", "-deprecated_password", "-deprecated_host", "-deprecated_port", "-deprecated_pathSize", "-deprecated_encodedPath", "-deprecated_encodedPathSegments", "-deprecated_pathSegments", "-deprecated_encodedQuery", "-deprecated_query", "-deprecated_querySize", "-deprecated_queryParameterNames", "-deprecated_encodedFragment", "-deprecated_fragment", "Builder", "Companion", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HttpUrl {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final String fragment;

    @NotNull
    private final String host;

    @NotNull
    private final String password;

    @NotNull
    private final List<String> pathSegments;
    private final int port;

    @Nullable
    private final List<String> queryNamesAndValues;

    @NotNull
    private final String scheme;

    @NotNull
    private final String url;

    @NotNull
    private final String username;

    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0005J\u000e\u0010$\u001a\u00020\u00002\u0006\u0010$\u001a\u00020\u0005J\u000e\u0010\n\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0005J\u000e\u0010%\u001a\u00020\u00002\u0006\u0010%\u001a\u00020\u0005J\u000e\u0010\r\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u0005J\u000e\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0005J\u000e\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0014J\u000e\u0010&\u001a\u00020\u00002\u0006\u0010'\u001a\u00020\u0005J\u000e\u0010(\u001a\u00020\u00002\u0006\u0010)\u001a\u00020\u0005J\u000e\u0010*\u001a\u00020\u00002\u0006\u0010+\u001a\u00020\u0005J\u000e\u0010,\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u0005J\u0018\u0010(\u001a\u00020\u00002\u0006\u0010)\u001a\u00020\u00052\u0006\u0010-\u001a\u00020.H\u0002J\u0016\u0010/\u001a\u00020\u00002\u0006\u00100\u001a\u00020\u00142\u0006\u0010'\u001a\u00020\u0005J\u0016\u00101\u001a\u00020\u00002\u0006\u00100\u001a\u00020\u00142\u0006\u0010+\u001a\u00020\u0005J\u000e\u00102\u001a\u00020\u00002\u0006\u00100\u001a\u00020\u0014J\u000e\u00103\u001a\u00020\u00002\u0006\u00103\u001a\u00020\u0005J\u0010\u00104\u001a\u00020\u00002\b\u00104\u001a\u0004\u0018\u00010\u0005J\u0010\u00105\u001a\u00020\u00002\b\u00105\u001a\u0004\u0018\u00010\u0005J\u0018\u00106\u001a\u00020\u00002\u0006\u00107\u001a\u00020\u00052\b\u00108\u001a\u0004\u0018\u00010\u0005J\u0018\u00109\u001a\u00020\u00002\u0006\u0010:\u001a\u00020\u00052\b\u0010;\u001a\u0004\u0018\u00010\u0005J\u0018\u0010<\u001a\u00020\u00002\u0006\u00107\u001a\u00020\u00052\b\u00108\u001a\u0004\u0018\u00010\u0005J\u0018\u0010=\u001a\u00020\u00002\u0006\u0010:\u001a\u00020\u00052\b\u0010;\u001a\u0004\u0018\u00010\u0005J\u000e\u0010>\u001a\u00020\u00002\u0006\u00107\u001a\u00020\u0005J\u000e\u0010?\u001a\u00020\u00002\u0006\u0010:\u001a\u00020\u0005J\u0010\u0010@\u001a\u00020A2\u0006\u0010B\u001a\u00020\u0005H\u0002J\u0010\u0010C\u001a\u00020\u00002\b\u0010C\u001a\u0004\u0018\u00010\u0005J\u0010\u0010!\u001a\u00020\u00002\b\u0010!\u001a\u0004\u0018\u00010\u0005J\r\u0010D\u001a\u00020\u0000H\u0000¢\u0006\u0002\bEJ\u0006\u0010F\u001a\u00020GJ\b\u0010H\u001a\u00020\u0014H\u0002J\b\u0010I\u001a\u00020\u0005H\u0016J\u001e\u0010J\u001a\u00020A*\b\u0012\u0004\u0012\u00020\u00050K2\n\u0010L\u001a\u00060Mj\u0002`NH\u0002J\u001f\u0010O\u001a\u00020\u00002\b\u0010P\u001a\u0004\u0018\u00010G2\u0006\u0010Q\u001a\u00020\u0005H\u0000¢\u0006\u0002\bRJ \u0010S\u001a\u00020A2\u0006\u0010Q\u001a\u00020\u00052\u0006\u0010T\u001a\u00020\u00142\u0006\u0010U\u001a\u00020\u0014H\u0002J0\u0010V\u001a\u00020A2\u0006\u0010Q\u001a\u00020\u00052\u0006\u0010W\u001a\u00020\u00142\u0006\u0010U\u001a\u00020\u00142\u0006\u0010X\u001a\u00020.2\u0006\u0010-\u001a\u00020.H\u0002J\b\u0010Y\u001a\u00020AH\u0002J\u0010\u0010Z\u001a\u00020.2\u0006\u0010Q\u001a\u00020\u0005H\u0002J\u0010\u0010[\u001a\u00020.2\u0006\u0010Q\u001a\u00020\u0005H\u0002J\u0014\u0010\\\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u001a*\u00020\u0005H\u0002J \u0010]\u001a\u00020\u00142\u0006\u0010Q\u001a\u00020\u00052\u0006\u0010W\u001a\u00020\u00142\u0006\u0010U\u001a\u00020\u0014H\u0002J\u001c\u0010^\u001a\u00020\u0014*\u00020\u00052\u0006\u0010W\u001a\u00020\u00142\u0006\u0010U\u001a\u00020\u0014H\u0002J \u0010_\u001a\u00020\u00142\u0006\u0010Q\u001a\u00020\u00052\u0006\u0010W\u001a\u00020\u00142\u0006\u0010U\u001a\u00020\u0014H\u0002J \u0010`\u001a\u00020\u00142\u0006\u0010Q\u001a\u00020\u00052\u0006\u0010W\u001a\u00020\u00142\u0006\u0010U\u001a\u00020\u0014H\u0002R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u0005X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u001a\u0010\r\u001a\u00020\u0005X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0007\"\u0004\b\u000f\u0010\tR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0005X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0007\"\u0004\b\u0012\u0010\tR\u001a\u0010\u0013\u001a\u00020\u0014X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00050\u001aX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR$\u0010\u001d\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u001aX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001c\"\u0004\b\u001f\u0010 R\u001c\u0010!\u001a\u0004\u0018\u00010\u0005X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0007\"\u0004\b#\u0010\t¨\u0006a"}, d2 = {"Lokhttp3/HttpUrl$Builder;", "", "<init>", "()V", "scheme", "", "getScheme$okhttp", "()Ljava/lang/String;", "setScheme$okhttp", "(Ljava/lang/String;)V", "encodedUsername", "getEncodedUsername$okhttp", "setEncodedUsername$okhttp", "encodedPassword", "getEncodedPassword$okhttp", "setEncodedPassword$okhttp", "host", "getHost$okhttp", "setHost$okhttp", "port", "", "getPort$okhttp", "()I", "setPort$okhttp", "(I)V", "encodedPathSegments", "", "getEncodedPathSegments$okhttp", "()Ljava/util/List;", "encodedQueryNamesAndValues", "getEncodedQueryNamesAndValues$okhttp", "setEncodedQueryNamesAndValues$okhttp", "(Ljava/util/List;)V", "encodedFragment", "getEncodedFragment$okhttp", "setEncodedFragment$okhttp", "username", "password", "addPathSegment", "pathSegment", "addPathSegments", "pathSegments", "addEncodedPathSegment", "encodedPathSegment", "addEncodedPathSegments", "alreadyEncoded", "", "setPathSegment", "index", "setEncodedPathSegment", "removePathSegment", "encodedPath", "query", "encodedQuery", "addQueryParameter", "name", "value", "addEncodedQueryParameter", "encodedName", "encodedValue", "setQueryParameter", "setEncodedQueryParameter", "removeAllQueryParameters", "removeAllEncodedQueryParameters", "removeAllCanonicalQueryParameters", "", "canonicalName", "fragment", "reencodeForUri", "reencodeForUri$okhttp", "build", "Lokhttp3/HttpUrl;", "effectivePort", "toString", "toPathString", "", "out", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "parse", "base", "input", "parse$okhttp", "resolvePath", "startPos", Constants.KEY_LIMIT, "push", Constants.INAPP_POSITION, "addTrailingSlash", "pop", "isDot", "isDotDot", "toQueryNamesAndValues", "schemeDelimiterOffset", "slashCount", "portColonOffset", "parsePort", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Builder {

        @Nullable
        private String encodedFragment;

        @Nullable
        private List<String> encodedQueryNamesAndValues;

        @Nullable
        private String host;

        @Nullable
        private String scheme;

        @NotNull
        private String encodedUsername = "";

        @NotNull
        private String encodedPassword = "";
        private int port = -1;

        @NotNull
        private final List<String> encodedPathSegments = CollectionsKt.white("");

        private final int effectivePort() {
            int i4 = this.port;
            if (i4 != -1) {
                return i4;
            }
            Companion companion = HttpUrl.INSTANCE;
            String str = this.scheme;
            Intrinsics.checkNotNull(str);
            return companion.defaultPort(str);
        }

        private final boolean isDot(String input) {
            if (Intrinsics.areEqual(input, ".") || r.hotel(input, "%2e", true)) {
                return true;
            }
            return false;
        }

        private final boolean isDotDot(String input) {
            if (Intrinsics.areEqual(input, "..") || r.hotel(input, "%2e.", true) || r.hotel(input, ".%2e", true) || r.hotel(input, "%2e%2e", true)) {
                return true;
            }
            return false;
        }

        private final int parsePort(String input, int pos, int limit) {
            int parseInt;
            try {
                parseInt = Integer.parseInt(_UrlKt.canonicalize$default(input, pos, limit, "", false, false, false, false, 120, null));
            } catch (NumberFormatException unused) {
            }
            if (1 > parseInt || parseInt >= 65536) {
                return -1;
            }
            return parseInt;
        }

        private final void pop() {
            if (this.encodedPathSegments.remove(r0.size() - 1).length() == 0 && !this.encodedPathSegments.isEmpty()) {
                this.encodedPathSegments.set(r0.size() - 1, "");
            } else {
                this.encodedPathSegments.add("");
            }
        }

        private final int portColonOffset(String input, int pos, int limit) {
            while (pos < limit) {
                char charAt = input.charAt(pos);
                if (charAt != ':') {
                    if (charAt != '[') {
                        pos++;
                    }
                    do {
                        pos++;
                        if (pos < limit) {
                        }
                        pos++;
                    } while (input.charAt(pos) != ']');
                    pos++;
                } else {
                    return pos;
                }
            }
            return limit;
        }

        private final void push(String input, int pos, int limit, boolean addTrailingSlash, boolean alreadyEncoded) {
            String canonicalize$default = _UrlKt.canonicalize$default(input, pos, limit, _UrlKt.PATH_SEGMENT_ENCODE_SET, alreadyEncoded, false, false, false, 112, null);
            if (!isDot(canonicalize$default)) {
                if (isDotDot(canonicalize$default)) {
                    pop();
                    return;
                }
                if (this.encodedPathSegments.get(r12.size() - 1).length() == 0) {
                    this.encodedPathSegments.set(r12.size() - 1, canonicalize$default);
                } else {
                    this.encodedPathSegments.add(canonicalize$default);
                }
                if (addTrailingSlash) {
                    this.encodedPathSegments.add("");
                }
            }
        }

        private final void removeAllCanonicalQueryParameters(String canonicalName) {
            List<String> list = this.encodedQueryNamesAndValues;
            Intrinsics.checkNotNull(list);
            int size = list.size() - 2;
            int alpha = AbstractC2770s7.alpha(size, 0, -2);
            if (alpha > size) {
                return;
            }
            while (true) {
                List<String> list2 = this.encodedQueryNamesAndValues;
                Intrinsics.checkNotNull(list2);
                if (Intrinsics.areEqual(canonicalName, list2.get(size))) {
                    List<String> list3 = this.encodedQueryNamesAndValues;
                    Intrinsics.checkNotNull(list3);
                    list3.remove(size + 1);
                    List<String> list4 = this.encodedQueryNamesAndValues;
                    Intrinsics.checkNotNull(list4);
                    list4.remove(size);
                    List<String> list5 = this.encodedQueryNamesAndValues;
                    Intrinsics.checkNotNull(list5);
                    if (list5.isEmpty()) {
                        this.encodedQueryNamesAndValues = null;
                        return;
                    }
                }
                if (size != alpha) {
                    size -= 2;
                } else {
                    return;
                }
            }
        }

        private final void resolvePath(String input, int startPos, int limit) {
            boolean z2;
            if (startPos != limit) {
                char charAt = input.charAt(startPos);
                if (charAt != '/' && charAt != '\\') {
                    List<String> list = this.encodedPathSegments;
                    list.set(list.size() - 1, "");
                } else {
                    this.encodedPathSegments.clear();
                    this.encodedPathSegments.add("");
                    startPos++;
                }
                int i4 = startPos;
                while (i4 < limit) {
                    int delimiterOffset = _UtilCommonKt.delimiterOffset(input, "/\\", i4, limit);
                    if (delimiterOffset < limit) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    String str = input;
                    push(str, i4, delimiterOffset, z2, true);
                    if (z2) {
                        i4 = delimiterOffset + 1;
                        input = str;
                    } else {
                        input = str;
                        i4 = delimiterOffset;
                    }
                }
            }
        }

        private final int schemeDelimiterOffset(String input, int pos, int limit) {
            if (limit - pos < 2) {
                return -1;
            }
            char charAt = input.charAt(pos);
            if ((Intrinsics.golf(charAt, 97) >= 0 && Intrinsics.golf(charAt, 122) <= 0) || (Intrinsics.golf(charAt, 65) >= 0 && Intrinsics.golf(charAt, 90) <= 0)) {
                while (true) {
                    pos++;
                    if (pos >= limit) {
                        break;
                    }
                    char charAt2 = input.charAt(pos);
                    if ('a' > charAt2 || charAt2 >= '{') {
                        if ('A' > charAt2 || charAt2 >= '[') {
                            if ('0' > charAt2 || charAt2 >= ':') {
                                if (charAt2 != '+' && charAt2 != '-' && charAt2 != '.') {
                                    if (charAt2 == ':') {
                                        return pos;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return -1;
        }

        private final int slashCount(String str, int i4, int i5) {
            int i10 = 0;
            while (i4 < i5) {
                char charAt = str.charAt(i4);
                if (charAt != '/' && charAt != '\\') {
                    break;
                }
                i10++;
                i4++;
            }
            return i10;
        }

        private final void toPathString(List<String> list, StringBuilder sb2) {
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                sb2.append('/');
                sb2.append(list.get(i4));
            }
        }

        private final List<String> toQueryNamesAndValues(String str) {
            ArrayList arrayList = new ArrayList();
            int i4 = 0;
            while (i4 <= str.length()) {
                int emerald = StringsKt.emerald(str, '&', i4, 4);
                if (emerald == -1) {
                    emerald = str.length();
                }
                int emerald2 = StringsKt.emerald(str, '=', i4, 4);
                if (emerald2 != -1 && emerald2 <= emerald) {
                    String substring = str.substring(i4, emerald2);
                    Intrinsics.delta(substring, "substring(...)");
                    arrayList.add(substring);
                    String substring2 = str.substring(emerald2 + 1, emerald);
                    Intrinsics.delta(substring2, "substring(...)");
                    arrayList.add(substring2);
                } else {
                    String substring3 = str.substring(i4, emerald);
                    Intrinsics.delta(substring3, "substring(...)");
                    arrayList.add(substring3);
                    arrayList.add(null);
                }
                i4 = emerald + 1;
            }
            return arrayList;
        }

        @NotNull
        public final Builder addEncodedPathSegment(@NotNull String encodedPathSegment) {
            Intrinsics.echo(encodedPathSegment, "encodedPathSegment");
            push(encodedPathSegment, 0, encodedPathSegment.length(), false, true);
            return this;
        }

        @NotNull
        public final Builder addEncodedPathSegments(@NotNull String encodedPathSegments) {
            Intrinsics.echo(encodedPathSegments, "encodedPathSegments");
            return addPathSegments(encodedPathSegments, true);
        }

        @NotNull
        public final Builder addEncodedQueryParameter(@NotNull String encodedName, @Nullable String encodedValue) {
            String str;
            Intrinsics.echo(encodedName, "encodedName");
            if (this.encodedQueryNamesAndValues == null) {
                this.encodedQueryNamesAndValues = new ArrayList();
            }
            List<String> list = this.encodedQueryNamesAndValues;
            Intrinsics.checkNotNull(list);
            list.add(_UrlKt.canonicalize$default(encodedName, 0, 0, _UrlKt.QUERY_COMPONENT_REENCODE_SET, true, false, true, false, 83, null));
            List<String> list2 = this.encodedQueryNamesAndValues;
            Intrinsics.checkNotNull(list2);
            if (encodedValue != null) {
                str = _UrlKt.canonicalize$default(encodedValue, 0, 0, _UrlKt.QUERY_COMPONENT_REENCODE_SET, true, false, true, false, 83, null);
            } else {
                str = null;
            }
            list2.add(str);
            return this;
        }

        @NotNull
        public final Builder addPathSegment(@NotNull String pathSegment) {
            Intrinsics.echo(pathSegment, "pathSegment");
            push(pathSegment, 0, pathSegment.length(), false, false);
            return this;
        }

        @NotNull
        public final Builder addPathSegments(@NotNull String pathSegments) {
            Intrinsics.echo(pathSegments, "pathSegments");
            return addPathSegments(pathSegments, false);
        }

        @NotNull
        public final Builder addQueryParameter(@NotNull String name, @Nullable String value) {
            String str;
            Intrinsics.echo(name, "name");
            if (this.encodedQueryNamesAndValues == null) {
                this.encodedQueryNamesAndValues = new ArrayList();
            }
            List<String> list = this.encodedQueryNamesAndValues;
            Intrinsics.checkNotNull(list);
            list.add(_UrlKt.canonicalize$default(name, 0, 0, _UrlKt.QUERY_COMPONENT_ENCODE_SET, false, false, true, false, 91, null));
            List<String> list2 = this.encodedQueryNamesAndValues;
            Intrinsics.checkNotNull(list2);
            if (value != null) {
                str = _UrlKt.canonicalize$default(value, 0, 0, _UrlKt.QUERY_COMPONENT_ENCODE_SET, false, false, true, false, 91, null);
            } else {
                str = null;
            }
            list2.add(str);
            return this;
        }

        @NotNull
        public final HttpUrl build() {
            int collectionSizeOrDefault;
            ArrayList arrayList;
            int collectionSizeOrDefault2;
            String str;
            String str2 = this.scheme;
            if (str2 != null) {
                String percentDecode$default = _UrlKt.percentDecode$default(this.encodedUsername, 0, 0, false, 7, null);
                String percentDecode$default2 = _UrlKt.percentDecode$default(this.encodedPassword, 0, 0, false, 7, null);
                String str3 = this.host;
                if (str3 != null) {
                    int effectivePort = effectivePort();
                    List<String> list = this.encodedPathSegments;
                    collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
                    ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault);
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(_UrlKt.percentDecode$default((String) it.next(), 0, 0, false, 7, null));
                    }
                    List<String> list2 = this.encodedQueryNamesAndValues;
                    String str4 = null;
                    if (list2 != null) {
                        collectionSizeOrDefault2 = CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10);
                        arrayList = new ArrayList(collectionSizeOrDefault2);
                        for (String str5 : list2) {
                            if (str5 != null) {
                                str = _UrlKt.percentDecode$default(str5, 0, 0, true, 3, null);
                            } else {
                                str = null;
                            }
                            arrayList.add(str);
                        }
                    } else {
                        arrayList = null;
                    }
                    String str6 = this.encodedFragment;
                    if (str6 != null) {
                        str4 = _UrlKt.percentDecode$default(str6, 0, 0, false, 7, null);
                    }
                    return new HttpUrl(str2, percentDecode$default, percentDecode$default2, str3, effectivePort, arrayList2, arrayList, str4, toString(), null);
                }
                throw new IllegalStateException("host == null");
            }
            throw new IllegalStateException("scheme == null");
        }

        @NotNull
        public final Builder encodedFragment(@Nullable String encodedFragment) {
            String str;
            if (encodedFragment != null) {
                str = _UrlKt.canonicalize$default(encodedFragment, 0, 0, "", true, false, false, true, 51, null);
            } else {
                str = null;
            }
            this.encodedFragment = str;
            return this;
        }

        @NotNull
        public final Builder encodedPassword(@NotNull String encodedPassword) {
            Intrinsics.echo(encodedPassword, "encodedPassword");
            this.encodedPassword = _UrlKt.canonicalize$default(encodedPassword, 0, 0, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, 115, null);
            return this;
        }

        @NotNull
        public final Builder encodedPath(@NotNull String encodedPath) {
            Intrinsics.echo(encodedPath, "encodedPath");
            if (r.quebec(encodedPath, "/", false)) {
                resolvePath(encodedPath, 0, encodedPath.length());
                return this;
            }
            throw new IllegalArgumentException("unexpected encodedPath: ".concat(encodedPath).toString());
        }

        @NotNull
        public final Builder encodedQuery(@Nullable String encodedQuery) {
            List<String> list;
            String canonicalize$default;
            if (encodedQuery != null && (canonicalize$default = _UrlKt.canonicalize$default(encodedQuery, 0, 0, _UrlKt.QUERY_ENCODE_SET, true, false, true, false, 83, null)) != null) {
                list = toQueryNamesAndValues(canonicalize$default);
            } else {
                list = null;
            }
            this.encodedQueryNamesAndValues = list;
            return this;
        }

        @NotNull
        public final Builder encodedUsername(@NotNull String encodedUsername) {
            Intrinsics.echo(encodedUsername, "encodedUsername");
            this.encodedUsername = _UrlKt.canonicalize$default(encodedUsername, 0, 0, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, 115, null);
            return this;
        }

        @NotNull
        public final Builder fragment(@Nullable String fragment) {
            String str;
            if (fragment != null) {
                str = _UrlKt.canonicalize$default(fragment, 0, 0, "", false, false, false, true, 59, null);
            } else {
                str = null;
            }
            this.encodedFragment = str;
            return this;
        }

        @Nullable
        /* renamed from: getEncodedFragment$okhttp, reason: from getter */
        public final String getEncodedFragment() {
            return this.encodedFragment;
        }

        @NotNull
        /* renamed from: getEncodedPassword$okhttp, reason: from getter */
        public final String getEncodedPassword() {
            return this.encodedPassword;
        }

        @NotNull
        public final List<String> getEncodedPathSegments$okhttp() {
            return this.encodedPathSegments;
        }

        @Nullable
        public final List<String> getEncodedQueryNamesAndValues$okhttp() {
            return this.encodedQueryNamesAndValues;
        }

        @NotNull
        /* renamed from: getEncodedUsername$okhttp, reason: from getter */
        public final String getEncodedUsername() {
            return this.encodedUsername;
        }

        @Nullable
        /* renamed from: getHost$okhttp, reason: from getter */
        public final String getHost() {
            return this.host;
        }

        /* renamed from: getPort$okhttp, reason: from getter */
        public final int getPort() {
            return this.port;
        }

        @Nullable
        /* renamed from: getScheme$okhttp, reason: from getter */
        public final String getScheme() {
            return this.scheme;
        }

        @NotNull
        public final Builder host(@NotNull String host) {
            Intrinsics.echo(host, "host");
            String canonicalHost = _HostnamesCommonKt.toCanonicalHost(_UrlKt.percentDecode$default(host, 0, 0, false, 7, null));
            if (canonicalHost != null) {
                this.host = canonicalHost;
                return this;
            }
            throw new IllegalArgumentException("unexpected host: ".concat(host));
        }

        @NotNull
        public final Builder parse$okhttp(@Nullable HttpUrl base, @NotNull String input) {
            int delimiterOffset;
            char c3;
            boolean z2;
            int i4;
            int i5;
            String input2 = input;
            Intrinsics.echo(input2, "input");
            int indexOfFirstNonAsciiWhitespace$default = _UtilCommonKt.indexOfFirstNonAsciiWhitespace$default(input2, 0, 0, 3, null);
            int indexOfLastNonAsciiWhitespace$default = _UtilCommonKt.indexOfLastNonAsciiWhitespace$default(input2, indexOfFirstNonAsciiWhitespace$default, 0, 2, null);
            int schemeDelimiterOffset = schemeDelimiterOffset(input2, indexOfFirstNonAsciiWhitespace$default, indexOfLastNonAsciiWhitespace$default);
            boolean z10 = true;
            if (schemeDelimiterOffset != -1) {
                if (r.papa(indexOfFirstNonAsciiWhitespace$default, input2, "https:", true)) {
                    this.scheme = "https";
                    indexOfFirstNonAsciiWhitespace$default += 6;
                } else if (r.papa(indexOfFirstNonAsciiWhitespace$default, input2, "http:", true)) {
                    this.scheme = "http";
                    indexOfFirstNonAsciiWhitespace$default += 5;
                } else {
                    StringBuilder sb2 = new StringBuilder("Expected URL scheme 'http' or 'https' but was '");
                    String substring = input2.substring(0, schemeDelimiterOffset);
                    Intrinsics.delta(substring, "substring(...)");
                    sb2.append(substring);
                    sb2.append('\'');
                    throw new IllegalArgumentException(sb2.toString());
                }
            } else if (base != null) {
                this.scheme = base.scheme();
            } else {
                if (input2.length() > 6) {
                    input2 = StringsKt.yellow(6, input2).concat("...");
                }
                throw new IllegalArgumentException(q.echo("Expected URL scheme 'http' or 'https' but no scheme was found for ", input2));
            }
            int slashCount = slashCount(input2, indexOfFirstNonAsciiWhitespace$default, indexOfLastNonAsciiWhitespace$default);
            char c4 = '?';
            char c10 = '#';
            if (slashCount < 2 && base != null && Intrinsics.areEqual(base.scheme(), this.scheme)) {
                this.encodedUsername = base.encodedUsername();
                this.encodedPassword = base.encodedPassword();
                this.host = base.host();
                this.port = base.port();
                this.encodedPathSegments.clear();
                this.encodedPathSegments.addAll(base.encodedPathSegments());
                if (indexOfFirstNonAsciiWhitespace$default == indexOfLastNonAsciiWhitespace$default || input2.charAt(indexOfFirstNonAsciiWhitespace$default) == '#') {
                    encodedQuery(base.encodedQuery());
                }
            } else {
                boolean z11 = false;
                boolean z12 = false;
                int i10 = indexOfFirstNonAsciiWhitespace$default + slashCount;
                while (true) {
                    delimiterOffset = _UtilCommonKt.delimiterOffset(input2, "@/\\?#", i10, indexOfLastNonAsciiWhitespace$default);
                    if (delimiterOffset != indexOfLastNonAsciiWhitespace$default) {
                        c3 = input2.charAt(delimiterOffset);
                    } else {
                        c3 = 65535;
                    }
                    if (c3 == 65535 || c3 == c10 || c3 == '/' || c3 == '\\' || c3 == c4) {
                        break;
                    }
                    if (c3 == '@') {
                        if (!z11) {
                            int delimiterOffset2 = _UtilCommonKt.delimiterOffset(input2, ':', i10, delimiterOffset);
                            z2 = z10;
                            String canonicalize$default = _UrlKt.canonicalize$default(input2, i10, delimiterOffset2, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, 112, null);
                            if (z12) {
                                canonicalize$default = this.encodedUsername + "%40" + canonicalize$default;
                            }
                            this.encodedUsername = canonicalize$default;
                            if (delimiterOffset2 != delimiterOffset) {
                                i5 = delimiterOffset;
                                this.encodedPassword = _UrlKt.canonicalize$default(input, delimiterOffset2 + 1, i5, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, 112, null);
                                z11 = z2;
                            } else {
                                i5 = delimiterOffset;
                            }
                            input2 = input;
                            i4 = i5;
                            z12 = z2;
                        } else {
                            z2 = z10;
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append(this.encodedPassword);
                            sb3.append("%40");
                            input2 = input;
                            i4 = delimiterOffset;
                            sb3.append(_UrlKt.canonicalize$default(input2, i10, delimiterOffset, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, 112, null));
                            this.encodedPassword = sb3.toString();
                        }
                        i10 = i4 + 1;
                        z10 = z2;
                        c10 = '#';
                        c4 = '?';
                    }
                }
                int portColonOffset = portColonOffset(input2, i10, delimiterOffset);
                int i11 = portColonOffset + 1;
                if (i11 < delimiterOffset) {
                    this.host = _HostnamesCommonKt.toCanonicalHost(_UrlKt.percentDecode$default(input2, i10, portColonOffset, false, 4, null));
                    int parsePort = parsePort(input2, i11, delimiterOffset);
                    this.port = parsePort;
                    if (parsePort == -1) {
                        StringBuilder sb4 = new StringBuilder("Invalid URL port: \"");
                        String substring2 = input2.substring(i11, delimiterOffset);
                        Intrinsics.delta(substring2, "substring(...)");
                        sb4.append(substring2);
                        sb4.append('\"');
                        throw new IllegalArgumentException(sb4.toString().toString());
                    }
                } else {
                    this.host = _HostnamesCommonKt.toCanonicalHost(_UrlKt.percentDecode$default(input2, i10, portColonOffset, false, 4, null));
                    Companion companion = HttpUrl.INSTANCE;
                    String str = this.scheme;
                    Intrinsics.checkNotNull(str);
                    this.port = companion.defaultPort(str);
                }
                if (this.host != null) {
                    indexOfFirstNonAsciiWhitespace$default = delimiterOffset;
                } else {
                    StringBuilder sb5 = new StringBuilder("Invalid URL host: \"");
                    String substring3 = input2.substring(i10, portColonOffset);
                    Intrinsics.delta(substring3, "substring(...)");
                    sb5.append(substring3);
                    sb5.append('\"');
                    throw new IllegalArgumentException(sb5.toString().toString());
                }
            }
            int delimiterOffset3 = _UtilCommonKt.delimiterOffset(input2, "?#", indexOfFirstNonAsciiWhitespace$default, indexOfLastNonAsciiWhitespace$default);
            resolvePath(input2, indexOfFirstNonAsciiWhitespace$default, delimiterOffset3);
            if (delimiterOffset3 < indexOfLastNonAsciiWhitespace$default && input2.charAt(delimiterOffset3) == '?') {
                int delimiterOffset4 = _UtilCommonKt.delimiterOffset(input2, '#', delimiterOffset3, indexOfLastNonAsciiWhitespace$default);
                this.encodedQueryNamesAndValues = toQueryNamesAndValues(_UrlKt.canonicalize$default(input2, delimiterOffset3 + 1, delimiterOffset4, _UrlKt.QUERY_ENCODE_SET, true, false, true, false, 80, null));
                delimiterOffset3 = delimiterOffset4;
            }
            if (delimiterOffset3 < indexOfLastNonAsciiWhitespace$default && input2.charAt(delimiterOffset3) == '#') {
                this.encodedFragment = _UrlKt.canonicalize$default(input2, delimiterOffset3 + 1, indexOfLastNonAsciiWhitespace$default, "", true, false, false, true, 48, null);
            }
            return this;
        }

        @NotNull
        public final Builder password(@NotNull String password) {
            Intrinsics.echo(password, "password");
            this.encodedPassword = _UrlKt.canonicalize$default(password, 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, 123, null);
            return this;
        }

        @NotNull
        public final Builder port(int port) {
            if (1 <= port && port < 65536) {
                this.port = port;
                return this;
            }
            throw new IllegalArgumentException(ad.zulu(port, "unexpected port: ").toString());
        }

        @NotNull
        public final Builder query(@Nullable String query) {
            List<String> list;
            String canonicalize$default;
            if (query != null && (canonicalize$default = _UrlKt.canonicalize$default(query, 0, 0, _UrlKt.QUERY_ENCODE_SET, false, false, true, false, 91, null)) != null) {
                list = toQueryNamesAndValues(canonicalize$default);
            } else {
                list = null;
            }
            this.encodedQueryNamesAndValues = list;
            return this;
        }

        @NotNull
        public final Builder reencodeForUri$okhttp() {
            String str;
            String str2;
            String str3 = this.host;
            String str4 = null;
            if (str3 != null) {
                str = new Regex("[\"<>^`{|}]").foxtrot(str3, "");
            } else {
                str = null;
            }
            this.host = str;
            int size = this.encodedPathSegments.size();
            for (int i4 = 0; i4 < size; i4++) {
                List<String> list = this.encodedPathSegments;
                list.set(i4, _UrlKt.canonicalize$default(list.get(i4), 0, 0, _UrlKt.PATH_SEGMENT_ENCODE_SET_URI, true, true, false, false, 99, null));
            }
            List<String> list2 = this.encodedQueryNamesAndValues;
            if (list2 != null) {
                int size2 = list2.size();
                for (int i5 = 0; i5 < size2; i5++) {
                    String str5 = list2.get(i5);
                    if (str5 != null) {
                        str2 = _UrlKt.canonicalize$default(str5, 0, 0, _UrlKt.QUERY_COMPONENT_ENCODE_SET_URI, true, true, true, false, 67, null);
                    } else {
                        str2 = null;
                    }
                    list2.set(i5, str2);
                }
            }
            String str6 = this.encodedFragment;
            if (str6 != null) {
                str4 = _UrlKt.canonicalize$default(str6, 0, 0, _UrlKt.FRAGMENT_ENCODE_SET_URI, true, true, false, true, 35, null);
            }
            this.encodedFragment = str4;
            return this;
        }

        @NotNull
        public final Builder removeAllEncodedQueryParameters(@NotNull String encodedName) {
            Intrinsics.echo(encodedName, "encodedName");
            if (this.encodedQueryNamesAndValues == null) {
                return this;
            }
            removeAllCanonicalQueryParameters(_UrlKt.canonicalize$default(encodedName, 0, 0, _UrlKt.QUERY_COMPONENT_REENCODE_SET, true, false, true, false, 83, null));
            return this;
        }

        @NotNull
        public final Builder removeAllQueryParameters(@NotNull String name) {
            Intrinsics.echo(name, "name");
            if (this.encodedQueryNamesAndValues == null) {
                return this;
            }
            removeAllCanonicalQueryParameters(_UrlKt.canonicalize$default(name, 0, 0, _UrlKt.QUERY_COMPONENT_ENCODE_SET, false, false, true, false, 91, null));
            return this;
        }

        @NotNull
        public final Builder removePathSegment(int index) {
            this.encodedPathSegments.remove(index);
            if (this.encodedPathSegments.isEmpty()) {
                this.encodedPathSegments.add("");
            }
            return this;
        }

        @NotNull
        public final Builder scheme(@NotNull String scheme) {
            Intrinsics.echo(scheme, "scheme");
            if (scheme.equalsIgnoreCase("http")) {
                this.scheme = "http";
                return this;
            }
            if (scheme.equalsIgnoreCase("https")) {
                this.scheme = "https";
                return this;
            }
            throw new IllegalArgumentException("unexpected scheme: ".concat(scheme));
        }

        public final void setEncodedFragment$okhttp(@Nullable String str) {
            this.encodedFragment = str;
        }

        public final void setEncodedPassword$okhttp(@NotNull String str) {
            Intrinsics.echo(str, "<set-?>");
            this.encodedPassword = str;
        }

        @NotNull
        public final Builder setEncodedPathSegment(int index, @NotNull String encodedPathSegment) {
            Intrinsics.echo(encodedPathSegment, "encodedPathSegment");
            String canonicalize$default = _UrlKt.canonicalize$default(encodedPathSegment, 0, 0, _UrlKt.PATH_SEGMENT_ENCODE_SET, true, false, false, false, 115, null);
            this.encodedPathSegments.set(index, canonicalize$default);
            if (!isDot(canonicalize$default) && !isDotDot(canonicalize$default)) {
                return this;
            }
            throw new IllegalArgumentException("unexpected path segment: ".concat(encodedPathSegment).toString());
        }

        public final void setEncodedQueryNamesAndValues$okhttp(@Nullable List<String> list) {
            this.encodedQueryNamesAndValues = list;
        }

        @NotNull
        public final Builder setEncodedQueryParameter(@NotNull String encodedName, @Nullable String encodedValue) {
            Intrinsics.echo(encodedName, "encodedName");
            removeAllEncodedQueryParameters(encodedName);
            addEncodedQueryParameter(encodedName, encodedValue);
            return this;
        }

        public final void setEncodedUsername$okhttp(@NotNull String str) {
            Intrinsics.echo(str, "<set-?>");
            this.encodedUsername = str;
        }

        public final void setHost$okhttp(@Nullable String str) {
            this.host = str;
        }

        @NotNull
        public final Builder setPathSegment(int index, @NotNull String pathSegment) {
            Intrinsics.echo(pathSegment, "pathSegment");
            String canonicalize$default = _UrlKt.canonicalize$default(pathSegment, 0, 0, _UrlKt.PATH_SEGMENT_ENCODE_SET, false, false, false, false, 123, null);
            if (!isDot(canonicalize$default) && !isDotDot(canonicalize$default)) {
                this.encodedPathSegments.set(index, canonicalize$default);
                return this;
            }
            throw new IllegalArgumentException("unexpected path segment: ".concat(pathSegment).toString());
        }

        public final void setPort$okhttp(int i4) {
            this.port = i4;
        }

        @NotNull
        public final Builder setQueryParameter(@NotNull String name, @Nullable String value) {
            Intrinsics.echo(name, "name");
            removeAllQueryParameters(name);
            addQueryParameter(name, value);
            return this;
        }

        public final void setScheme$okhttp(@Nullable String str) {
            this.scheme = str;
        }

        /* JADX WARN: Code restructure failed: missing block: B:30:0x0080, code lost:
        
            if (r1 != r4.defaultPort(r3)) goto L29;
         */
        @NotNull
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            String str = this.scheme;
            if (str != null) {
                sb2.append(str);
                sb2.append("://");
            } else {
                sb2.append("//");
            }
            if (this.encodedUsername.length() > 0 || this.encodedPassword.length() > 0) {
                sb2.append(this.encodedUsername);
                if (this.encodedPassword.length() > 0) {
                    sb2.append(':');
                    sb2.append(this.encodedPassword);
                }
                sb2.append('@');
            }
            String str2 = this.host;
            if (str2 != null) {
                Intrinsics.checkNotNull(str2);
                if (StringsKt.black(str2, ':')) {
                    sb2.append('[');
                    sb2.append(this.host);
                    sb2.append(']');
                } else {
                    sb2.append(this.host);
                }
            }
            if (this.port != -1 || this.scheme != null) {
                int effectivePort = effectivePort();
                String str3 = this.scheme;
                if (str3 != null) {
                    Companion companion = HttpUrl.INSTANCE;
                    Intrinsics.checkNotNull(str3);
                }
                sb2.append(':');
                sb2.append(effectivePort);
            }
            toPathString(this.encodedPathSegments, sb2);
            if (this.encodedQueryNamesAndValues != null) {
                sb2.append('?');
                Companion companion2 = HttpUrl.INSTANCE;
                List<String> list = this.encodedQueryNamesAndValues;
                Intrinsics.checkNotNull(list);
                companion2.toQueryString(list, sb2);
            }
            if (this.encodedFragment != null) {
                sb2.append('#');
                sb2.append(this.encodedFragment);
            }
            return sb2.toString();
        }

        @NotNull
        public final Builder username(@NotNull String username) {
            Intrinsics.echo(username, "username");
            this.encodedUsername = _UrlKt.canonicalize$default(username, 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, 123, null);
            return this;
        }

        private final Builder addPathSegments(String pathSegments, boolean alreadyEncoded) {
            boolean z2;
            Builder builder;
            String str;
            boolean z10;
            int i4 = 0;
            while (true) {
                int delimiterOffset = _UtilCommonKt.delimiterOffset(pathSegments, "/\\", i4, pathSegments.length());
                if (delimiterOffset < pathSegments.length()) {
                    z2 = true;
                    str = pathSegments;
                    z10 = alreadyEncoded;
                    builder = this;
                } else {
                    z2 = false;
                    builder = this;
                    str = pathSegments;
                    z10 = alreadyEncoded;
                }
                builder.push(str, i4, delimiterOffset, z2, z10);
                i4 = delimiterOffset + 1;
                if (i4 > str.length()) {
                    return builder;
                }
                pathSegments = str;
                alreadyEncoded = z10;
            }
        }
    }

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J \u0010\b\u001a\u00020\t*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\n2\n\u0010\u000b\u001a\u00060\fj\u0002`\rH\u0002J\u0011\u0010\u000e\u001a\u00020\u000f*\u00020\u0007H\u0007¢\u0006\u0002\b\u0010J\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u000f*\u00020\u0007H\u0007¢\u0006\u0002\b\u0012J\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u000f*\u00020\u0013H\u0007¢\u0006\u0002\b\u0010J\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u000f*\u00020\u0014H\u0007¢\u0006\u0002\b\u0010J\u0015\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u0007H\u0007¢\u0006\u0002\b\u0016J\u0017\u0010\u0012\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0015\u001a\u00020\u0007H\u0007¢\u0006\u0002\b\u0017J\u0017\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0015\u001a\u00020\u0013H\u0007¢\u0006\u0002\b\u0016J\u0017\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0018\u001a\u00020\u0014H\u0007¢\u0006\u0002\b\u0016¨\u0006\u0019"}, d2 = {"Lokhttp3/HttpUrl$Companion;", "", "<init>", "()V", "defaultPort", "", "scheme", "", "toQueryString", "", "", "out", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "toHttpUrl", "Lokhttp3/HttpUrl;", "get", "toHttpUrlOrNull", "parse", "Ljava/net/URL;", "Ljava/net/URI;", Constants.KEY_URL, "-deprecated_get", "-deprecated_parse", "uri", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void toQueryString(List<String> list, StringBuilder sb2) {
            C1713e golf = J4.golf(J4.hotel(0, list.size()), 2);
            int i4 = golf.alpha;
            int i5 = golf.purple;
            int i10 = golf.red;
            if ((i10 <= 0 || i4 > i5) && (i10 >= 0 || i5 > i4)) {
                return;
            }
            while (true) {
                String str = list.get(i4);
                String str2 = list.get(i4 + 1);
                if (i4 > 0) {
                    sb2.append('&');
                }
                sb2.append(str);
                if (str2 != null) {
                    sb2.append('=');
                    sb2.append(str2);
                }
                if (i4 != i5) {
                    i4 += i10;
                } else {
                    return;
                }
            }
        }

        @c
        @NotNull
        /* renamed from: -deprecated_get, reason: not valid java name */
        public final HttpUrl m284deprecated_get(@NotNull String url) {
            Intrinsics.echo(url, "url");
            return get(url);
        }

        @c
        @Nullable
        /* renamed from: -deprecated_parse, reason: not valid java name */
        public final HttpUrl m287deprecated_parse(@NotNull String url) {
            Intrinsics.echo(url, "url");
            return parse(url);
        }

        public final int defaultPort(@NotNull String scheme) {
            Intrinsics.echo(scheme, "scheme");
            if (Intrinsics.areEqual(scheme, "http")) {
                return 80;
            }
            if (Intrinsics.areEqual(scheme, "https")) {
                return 443;
            }
            return -1;
        }

        @NotNull
        public final HttpUrl get(@NotNull String str) {
            Intrinsics.echo(str, "<this>");
            return new Builder().parse$okhttp(null, str).build();
        }

        @Nullable
        public final HttpUrl parse(@NotNull String str) {
            Intrinsics.echo(str, "<this>");
            try {
                return get(str);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        private Companion() {
        }

        @c
        @Nullable
        /* renamed from: -deprecated_get, reason: not valid java name */
        public final HttpUrl m286deprecated_get(@NotNull URL url) {
            Intrinsics.echo(url, "url");
            return get(url);
        }

        @Nullable
        public final HttpUrl get(@NotNull URL url) {
            Intrinsics.echo(url, "<this>");
            String url2 = url.toString();
            Intrinsics.delta(url2, "toString(...)");
            return parse(url2);
        }

        @c
        @Nullable
        /* renamed from: -deprecated_get, reason: not valid java name */
        public final HttpUrl m285deprecated_get(@NotNull URI uri) {
            Intrinsics.echo(uri, "uri");
            return get(uri);
        }

        @Nullable
        public final HttpUrl get(@NotNull URI uri) {
            Intrinsics.echo(uri, "<this>");
            String uri2 = uri.toString();
            Intrinsics.delta(uri2, "toString(...)");
            return parse(uri2);
        }
    }

    public /* synthetic */ HttpUrl(String str, String str2, String str3, String str4, int i4, List list, List list2, String str5, String str6, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, i4, list, list2, str5, str6);
    }

    public static final int defaultPort(@NotNull String str) {
        return INSTANCE.defaultPort(str);
    }

    @NotNull
    public static final HttpUrl get(@NotNull String str) {
        return INSTANCE.get(str);
    }

    @Nullable
    public static final HttpUrl parse(@NotNull String str) {
        return INSTANCE.parse(str);
    }

    @c
    @Nullable
    /* renamed from: -deprecated_encodedFragment, reason: not valid java name */
    public final String m265deprecated_encodedFragment() {
        return encodedFragment();
    }

    @c
    @NotNull
    /* renamed from: -deprecated_encodedPassword, reason: not valid java name */
    public final String m266deprecated_encodedPassword() {
        return encodedPassword();
    }

    @c
    @NotNull
    /* renamed from: -deprecated_encodedPath, reason: not valid java name */
    public final String m267deprecated_encodedPath() {
        return encodedPath();
    }

    @c
    @NotNull
    /* renamed from: -deprecated_encodedPathSegments, reason: not valid java name */
    public final List<String> m268deprecated_encodedPathSegments() {
        return encodedPathSegments();
    }

    @c
    @Nullable
    /* renamed from: -deprecated_encodedQuery, reason: not valid java name */
    public final String m269deprecated_encodedQuery() {
        return encodedQuery();
    }

    @c
    @NotNull
    /* renamed from: -deprecated_encodedUsername, reason: not valid java name */
    public final String m270deprecated_encodedUsername() {
        return encodedUsername();
    }

    @c
    @Nullable
    /* renamed from: -deprecated_fragment, reason: not valid java name and from getter */
    public final String getFragment() {
        return this.fragment;
    }

    @c
    @NotNull
    /* renamed from: -deprecated_host, reason: not valid java name and from getter */
    public final String getHost() {
        return this.host;
    }

    @c
    @NotNull
    /* renamed from: -deprecated_password, reason: not valid java name and from getter */
    public final String getPassword() {
        return this.password;
    }

    @c
    @NotNull
    /* renamed from: -deprecated_pathSegments, reason: not valid java name */
    public final List<String> m274deprecated_pathSegments() {
        return this.pathSegments;
    }

    @c
    /* renamed from: -deprecated_pathSize, reason: not valid java name */
    public final int m275deprecated_pathSize() {
        return pathSize();
    }

    @c
    /* renamed from: -deprecated_port, reason: not valid java name and from getter */
    public final int getPort() {
        return this.port;
    }

    @c
    @Nullable
    /* renamed from: -deprecated_query, reason: not valid java name */
    public final String m277deprecated_query() {
        return query();
    }

    @c
    @NotNull
    /* renamed from: -deprecated_queryParameterNames, reason: not valid java name */
    public final Set<String> m278deprecated_queryParameterNames() {
        return queryParameterNames();
    }

    @c
    /* renamed from: -deprecated_querySize, reason: not valid java name */
    public final int m279deprecated_querySize() {
        return querySize();
    }

    @c
    @NotNull
    /* renamed from: -deprecated_scheme, reason: not valid java name and from getter */
    public final String getScheme() {
        return this.scheme;
    }

    @c
    @NotNull
    /* renamed from: -deprecated_uri, reason: not valid java name */
    public final URI m281deprecated_uri() {
        return uri();
    }

    @c
    @NotNull
    /* renamed from: -deprecated_url, reason: not valid java name */
    public final URL m282deprecated_url() {
        return url();
    }

    @c
    @NotNull
    /* renamed from: -deprecated_username, reason: not valid java name and from getter */
    public final String getUsername() {
        return this.username;
    }

    @Nullable
    public final String encodedFragment() {
        if (this.fragment == null) {
            return null;
        }
        String substring = this.url.substring(StringsKt.emerald(this.url, '#', 0, 6) + 1);
        Intrinsics.delta(substring, "substring(...)");
        return substring;
    }

    @NotNull
    public final String encodedPassword() {
        if (this.password.length() == 0) {
            return "";
        }
        String substring = this.url.substring(StringsKt.emerald(this.url, ':', this.scheme.length() + 3, 4) + 1, StringsKt.emerald(this.url, '@', 0, 6));
        Intrinsics.delta(substring, "substring(...)");
        return substring;
    }

    @NotNull
    public final String encodedPath() {
        int emerald = StringsKt.emerald(this.url, '/', this.scheme.length() + 3, 4);
        String str = this.url;
        String substring = this.url.substring(emerald, _UtilCommonKt.delimiterOffset(str, "?#", emerald, str.length()));
        Intrinsics.delta(substring, "substring(...)");
        return substring;
    }

    @NotNull
    public final List<String> encodedPathSegments() {
        int emerald = StringsKt.emerald(this.url, '/', this.scheme.length() + 3, 4);
        String str = this.url;
        int delimiterOffset = _UtilCommonKt.delimiterOffset(str, "?#", emerald, str.length());
        ArrayList arrayList = new ArrayList();
        while (emerald < delimiterOffset) {
            int i4 = emerald + 1;
            int delimiterOffset2 = _UtilCommonKt.delimiterOffset(this.url, '/', i4, delimiterOffset);
            String substring = this.url.substring(i4, delimiterOffset2);
            Intrinsics.delta(substring, "substring(...)");
            arrayList.add(substring);
            emerald = delimiterOffset2;
        }
        return arrayList;
    }

    @Nullable
    public final String encodedQuery() {
        if (this.queryNamesAndValues == null) {
            return null;
        }
        int emerald = StringsKt.emerald(this.url, '?', 0, 6) + 1;
        String str = this.url;
        String substring = this.url.substring(emerald, _UtilCommonKt.delimiterOffset(str, '#', emerald, str.length()));
        Intrinsics.delta(substring, "substring(...)");
        return substring;
    }

    @NotNull
    public final String encodedUsername() {
        if (this.username.length() == 0) {
            return "";
        }
        int length = this.scheme.length() + 3;
        String str = this.url;
        String substring = this.url.substring(length, _UtilCommonKt.delimiterOffset(str, ":@", length, str.length()));
        Intrinsics.delta(substring, "substring(...)");
        return substring;
    }

    public boolean equals(@Nullable Object other) {
        if ((other instanceof HttpUrl) && Intrinsics.areEqual(((HttpUrl) other).url, this.url)) {
            return true;
        }
        return false;
    }

    @Nullable
    public final String fragment() {
        return this.fragment;
    }

    public int hashCode() {
        return this.url.hashCode();
    }

    @NotNull
    public final String host() {
        return this.host;
    }

    public final boolean isHttps() {
        return Intrinsics.areEqual(this.scheme, "https");
    }

    @NotNull
    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.setScheme$okhttp(this.scheme);
        builder.setEncodedUsername$okhttp(encodedUsername());
        builder.setEncodedPassword$okhttp(encodedPassword());
        builder.setHost$okhttp(this.host);
        builder.setPort$okhttp(this.port != INSTANCE.defaultPort(this.scheme) ? this.port : -1);
        builder.getEncodedPathSegments$okhttp().clear();
        builder.getEncodedPathSegments$okhttp().addAll(encodedPathSegments());
        builder.encodedQuery(encodedQuery());
        builder.setEncodedFragment$okhttp(encodedFragment());
        return builder;
    }

    @NotNull
    public final String password() {
        return this.password;
    }

    @NotNull
    public final List<String> pathSegments() {
        return this.pathSegments;
    }

    public final int pathSize() {
        return this.pathSegments.size();
    }

    public final int port() {
        return this.port;
    }

    @Nullable
    public final String query() {
        if (this.queryNamesAndValues == null) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        INSTANCE.toQueryString(this.queryNamesAndValues, sb2);
        return sb2.toString();
    }

    @Nullable
    public final String queryParameter(@NotNull String name) {
        Intrinsics.echo(name, "name");
        List<String> list = this.queryNamesAndValues;
        if (list != null) {
            C1713e golf = J4.golf(J4.hotel(0, list.size()), 2);
            int i4 = golf.alpha;
            int i5 = golf.purple;
            int i10 = golf.red;
            if ((i10 > 0 && i4 <= i5) || (i10 < 0 && i5 <= i4)) {
                while (!Intrinsics.areEqual(name, this.queryNamesAndValues.get(i4))) {
                    if (i4 != i5) {
                        i4 += i10;
                    } else {
                        return null;
                    }
                }
                return this.queryNamesAndValues.get(i4 + 1);
            }
            return null;
        }
        return null;
    }

    @NotNull
    public final String queryParameterName(int index) {
        List<String> list = this.queryNamesAndValues;
        if (list != null) {
            String str = list.get(index * 2);
            Intrinsics.checkNotNull(str);
            return str;
        }
        throw new IndexOutOfBoundsException();
    }

    @NotNull
    public final Set<String> queryParameterNames() {
        if (this.queryNamesAndValues == null) {
            return u.alpha;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(this.queryNamesAndValues.size() / 2, 1.0f);
        C1713e golf = J4.golf(J4.hotel(0, this.queryNamesAndValues.size()), 2);
        int i4 = golf.alpha;
        int i5 = golf.purple;
        int i10 = golf.red;
        if ((i10 > 0 && i4 <= i5) || (i10 < 0 && i5 <= i4)) {
            while (true) {
                String str = this.queryNamesAndValues.get(i4);
                Intrinsics.checkNotNull(str);
                linkedHashSet.add(str);
                if (i4 == i5) {
                    break;
                }
                i4 += i10;
            }
        }
        Set<String> unmodifiableSet = Collections.unmodifiableSet(linkedHashSet);
        Intrinsics.delta(unmodifiableSet, "unmodifiableSet(...)");
        return unmodifiableSet;
    }

    @Nullable
    public final String queryParameterValue(int index) {
        List<String> list = this.queryNamesAndValues;
        if (list != null) {
            return list.get((index * 2) + 1);
        }
        throw new IndexOutOfBoundsException();
    }

    @NotNull
    public final List<String> queryParameterValues(@NotNull String name) {
        Intrinsics.echo(name, "name");
        if (this.queryNamesAndValues == null) {
            return CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList(4);
        C1713e golf = J4.golf(J4.hotel(0, this.queryNamesAndValues.size()), 2);
        int i4 = golf.alpha;
        int i5 = golf.purple;
        int i10 = golf.red;
        if ((i10 > 0 && i4 <= i5) || (i10 < 0 && i5 <= i4)) {
            while (true) {
                if (Intrinsics.areEqual(name, this.queryNamesAndValues.get(i4))) {
                    arrayList.add(this.queryNamesAndValues.get(i4 + 1));
                }
                if (i4 == i5) {
                    break;
                }
                i4 += i10;
            }
        }
        List<String> unmodifiableList = Collections.unmodifiableList(arrayList);
        Intrinsics.delta(unmodifiableList, "unmodifiableList(...)");
        return unmodifiableList;
    }

    public final int querySize() {
        List<String> list = this.queryNamesAndValues;
        if (list != null) {
            return list.size() / 2;
        }
        return 0;
    }

    @NotNull
    public final String redact() {
        Builder newBuilder = newBuilder("/...");
        Intrinsics.checkNotNull(newBuilder);
        return newBuilder.username("").password("").build().getUrl();
    }

    @Nullable
    public final HttpUrl resolve(@NotNull String link) {
        Intrinsics.echo(link, "link");
        Builder newBuilder = newBuilder(link);
        if (newBuilder != null) {
            return newBuilder.build();
        }
        return null;
    }

    @NotNull
    public final String scheme() {
        return this.scheme;
    }

    @NotNull
    /* renamed from: toString, reason: from getter */
    public String getUrl() {
        return this.url;
    }

    @Nullable
    public final String topPrivateDomain() {
        if (_HostnamesCommonKt.canParseAsIpAddress(this.host)) {
            return null;
        }
        return PublicSuffixDatabase.INSTANCE.get().getEffectiveTldPlusOne(this.host);
    }

    @NotNull
    public final URI uri() {
        String builder = newBuilder().reencodeForUri$okhttp().toString();
        try {
            return new URI(builder);
        } catch (URISyntaxException e) {
            try {
                URI create = URI.create(new Regex("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]").foxtrot(builder, ""));
                Intrinsics.checkNotNull(create);
                return create;
            } catch (Exception unused) {
                throw new RuntimeException(e);
            }
        }
    }

    @NotNull
    public final URL url() {
        try {
            return new URL(this.url);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }

    @NotNull
    public final String username() {
        return this.username;
    }

    private HttpUrl(String str, String str2, String str3, String str4, int i4, List<String> list, List<String> list2, String str5, String str6) {
        this.scheme = str;
        this.username = str2;
        this.password = str3;
        this.host = str4;
        this.port = i4;
        this.pathSegments = list;
        this.queryNamesAndValues = list2;
        this.fragment = str5;
        this.url = str6;
    }

    @Nullable
    public static final HttpUrl get(@NotNull URI uri) {
        return INSTANCE.get(uri);
    }

    @Nullable
    public static final HttpUrl get(@NotNull URL url) {
        return INSTANCE.get(url);
    }

    @Nullable
    public final Builder newBuilder(@NotNull String link) {
        Intrinsics.echo(link, "link");
        try {
            return new Builder().parse$okhttp(this, link);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }
}
