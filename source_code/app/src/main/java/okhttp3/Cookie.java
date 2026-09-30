package okhttp3;

import av.q;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.db.Column;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.c;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.r;
import okhttp3.internal._HostnamesCommonKt;
import okhttp3.internal._UtilCommonKt;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.http.DateFormattingKt;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pe.AbstractC2327c;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 *2\u00020\u0001:\u0002)*B[\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\n\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u000e\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u0016J\u0013\u0010\u0017\u001a\u00020\n2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0019\u001a\u00020\u001aH\u0017J\b\u0010\u001b\u001a\u00020\u0003H\u0016J\r\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0002\b\u001cJ\r\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0002\b\u001dJ\r\u0010\f\u001a\u00020\nH\u0007¢\u0006\u0002\b\u001eJ\r\u0010\u0005\u001a\u00020\u0006H\u0007¢\u0006\u0002\b\u001fJ\r\u0010\r\u001a\u00020\nH\u0007¢\u0006\u0002\b J\r\u0010\u0007\u001a\u00020\u0003H\u0007¢\u0006\u0002\b!J\r\u0010\b\u001a\u00020\u0003H\u0007¢\u0006\u0002\b\"J\r\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0002\b#J\r\u0010\t\u001a\u00020\nH\u0007¢\u0006\u0002\b$J\u0015\u0010\u001b\u001a\u00020\u00032\u0006\u0010%\u001a\u00020\nH\u0000¢\u0006\u0002\b&J\u0006\u0010'\u001a\u00020(R\u0013\u0010\u0002\u001a\u00020\u00038G¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0011R\u0013\u0010\u0004\u001a\u00020\u00038G¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0011R\u0013\u0010\u0005\u001a\u00020\u00068G¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0012R\u0013\u0010\u0007\u001a\u00020\u00038G¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0011R\u0013\u0010\b\u001a\u00020\u00038G¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0011R\u0013\u0010\t\u001a\u00020\n8G¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0013R\u0013\u0010\u000b\u001a\u00020\n8G¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0013R\u0013\u0010\f\u001a\u00020\n8G¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0013R\u0013\u0010\r\u001a\u00020\n8G¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0013R\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u00038G¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0011¨\u0006+"}, d2 = {"Lokhttp3/Cookie;", "", "name", "", "value", "expiresAt", "", "domain", "path", "secure", "", "httpOnly", "persistent", "hostOnly", "sameSite", "<init>", "(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;ZZZZLjava/lang/String;)V", "()Ljava/lang/String;", "()J", "()Z", "matches", Constants.KEY_URL, "Lokhttp3/HttpUrl;", "equals", "other", "hashCode", "", "toString", "-deprecated_name", "-deprecated_value", "-deprecated_persistent", "-deprecated_expiresAt", "-deprecated_hostOnly", "-deprecated_domain", "-deprecated_path", "-deprecated_httpOnly", "-deprecated_secure", "forObsoleteRfc2965", "toString$okhttp", "newBuilder", "Lokhttp3/Cookie$Builder;", "Builder", "Companion", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Cookie {

    @NotNull
    private final String domain;
    private final long expiresAt;
    private final boolean hostOnly;
    private final boolean httpOnly;

    @NotNull
    private final String name;

    @NotNull
    private final String path;
    private final boolean persistent;

    @Nullable
    private final String sameSite;
    private final boolean secure;

    @NotNull
    private final String value;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final Pattern YEAR_PATTERN = Pattern.compile("(\\d{2,4})[^\\d]*");
    private static final Pattern MONTH_PATTERN = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");
    private static final Pattern DAY_OF_MONTH_PATTERN = Pattern.compile("(\\d{1,2})[^\\d]*");
    private static final Pattern TIME_PATTERN = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003B\u0011\b\u0010\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0002\u0010\u0006J\u000e\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\t\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\bJ\u000e\u0010\n\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\f\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\bJ\u000e\u0010\u0014\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\bJ\u0018\u0010\f\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u000fH\u0002J\u000e\u0010\r\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\bJ\u0006\u0010\u000e\u001a\u00020\u0000J\u0006\u0010\u0010\u001a\u00020\u0000J\u000e\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\bJ\u0006\u0010\u0015\u001a\u00020\u0005R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lokhttp3/Cookie$Builder;", "", "<init>", "()V", "cookie", "Lokhttp3/Cookie;", "(Lokhttp3/Cookie;)V", "name", "", "value", "expiresAt", "", "domain", "path", "secure", "", "httpOnly", "persistent", "hostOnly", "sameSite", "hostOnlyDomain", "build", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Builder {

        @Nullable
        private String domain;
        private long expiresAt;
        private boolean hostOnly;
        private boolean httpOnly;

        @Nullable
        private String name;

        @NotNull
        private String path;
        private boolean persistent;

        @Nullable
        private String sameSite;
        private boolean secure;

        @Nullable
        private String value;

        public Builder() {
            this.expiresAt = DateFormattingKt.MAX_DATE;
            this.path = "/";
        }

        @NotNull
        public final Cookie build() {
            String str = this.name;
            if (str != null) {
                String str2 = this.value;
                if (str2 != null) {
                    long j5 = this.expiresAt;
                    String str3 = this.domain;
                    if (str3 != null) {
                        return new Cookie(str, str2, j5, str3, this.path, this.secure, this.httpOnly, this.persistent, this.hostOnly, this.sameSite, null);
                    }
                    throw new NullPointerException("builder.domain == null");
                }
                throw new NullPointerException("builder.value == null");
            }
            throw new NullPointerException("builder.name == null");
        }

        @NotNull
        public final Builder domain(@NotNull String domain) {
            Intrinsics.echo(domain, "domain");
            return domain(domain, false);
        }

        @NotNull
        public final Builder expiresAt(long expiresAt) {
            if (expiresAt <= 0) {
                expiresAt = Long.MIN_VALUE;
            }
            if (expiresAt > DateFormattingKt.MAX_DATE) {
                expiresAt = 253402300799999L;
            }
            this.expiresAt = expiresAt;
            this.persistent = true;
            return this;
        }

        @NotNull
        public final Builder hostOnlyDomain(@NotNull String domain) {
            Intrinsics.echo(domain, "domain");
            return domain(domain, true);
        }

        @NotNull
        public final Builder httpOnly() {
            this.httpOnly = true;
            return this;
        }

        @NotNull
        public final Builder name(@NotNull String name) {
            Intrinsics.echo(name, "name");
            if (Intrinsics.areEqual(StringsKt.b(name).toString(), name)) {
                this.name = name;
                return this;
            }
            throw new IllegalArgumentException("name is not trimmed");
        }

        @NotNull
        public final Builder path(@NotNull String path) {
            Intrinsics.echo(path, "path");
            if (r.quebec(path, "/", false)) {
                this.path = path;
                return this;
            }
            throw new IllegalArgumentException("path must start with '/'");
        }

        @NotNull
        public final Builder sameSite(@NotNull String sameSite) {
            Intrinsics.echo(sameSite, "sameSite");
            if (Intrinsics.areEqual(StringsKt.b(sameSite).toString(), sameSite)) {
                this.sameSite = sameSite;
                return this;
            }
            throw new IllegalArgumentException("sameSite is not trimmed");
        }

        @NotNull
        public final Builder secure() {
            this.secure = true;
            return this;
        }

        @NotNull
        public final Builder value(@NotNull String value) {
            Intrinsics.echo(value, "value");
            if (Intrinsics.areEqual(StringsKt.b(value).toString(), value)) {
                this.value = value;
                return this;
            }
            throw new IllegalArgumentException("value is not trimmed");
        }

        private final Builder domain(String domain, boolean hostOnly) {
            String canonicalHost = _HostnamesCommonKt.toCanonicalHost(domain);
            if (canonicalHost != null) {
                this.domain = canonicalHost;
                this.hostOnly = hostOnly;
                return this;
            }
            throw new IllegalArgumentException(q.echo("unexpected domain: ", domain));
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Builder(@NotNull Cookie cookie) {
            this();
            Intrinsics.echo(cookie, "cookie");
            this.name = cookie.name();
            this.value = cookie.value();
            this.expiresAt = cookie.expiresAt();
            this.domain = cookie.domain();
            this.path = cookie.path();
            this.secure = cookie.secure();
            this.httpOnly = cookie.httpOnly();
            this.persistent = cookie.persistent();
            this.hostOnly = cookie.hostOnly();
            this.sameSite = cookie.getSameSite();
        }
    }

    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0002J\u0018\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\rH\u0002J\u001a\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\rH\u0007J'\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\rH\u0000¢\u0006\u0002\b\u0018J \u0010\u0019\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002J(\u0010\u001e\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010 \u001a\u00020\u000bH\u0002J\u0010\u0010!\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\rH\u0002J\u0010\u0010\"\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\rH\u0002J\u001e\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00140$2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010%\u001a\u00020&H\u0007R\u0016\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n \u0006*\u0004\u0018\u00010\u00050\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n \u0006*\u0004\u0018\u00010\u00050\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n \u0006*\u0004\u0018\u00010\u00050\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Lokhttp3/Cookie$Companion;", "", "<init>", "()V", "YEAR_PATTERN", "Ljava/util/regex/Pattern;", "kotlin.jvm.PlatformType", "MONTH_PATTERN", "DAY_OF_MONTH_PATTERN", "TIME_PATTERN", "domainMatch", "", "urlHost", "", "domain", "pathMatch", Constants.KEY_URL, "Lokhttp3/HttpUrl;", "path", "parse", "Lokhttp3/Cookie;", "setCookie", "currentTimeMillis", "", "parse$okhttp", "parseExpires", "s", Constants.INAPP_POSITION, "", Constants.KEY_LIMIT, "dateCharacterOffset", "input", "invert", "parseMaxAge", "parseDomain", "parseAll", "", "headers", "Lokhttp3/Headers;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final int dateCharacterOffset(String input, int pos, int limit, boolean invert) {
            boolean z2;
            while (pos < limit) {
                char charAt = input.charAt(pos);
                if ((charAt >= ' ' || charAt == '\t') && charAt < 127 && (('0' > charAt || charAt >= ':') && (('a' > charAt || charAt >= '{') && (('A' > charAt || charAt >= '[') && charAt != ':')))) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (z2 == (!invert)) {
                    return pos;
                }
                pos++;
            }
            return limit;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean domainMatch(String urlHost, String domain) {
            if (Intrinsics.areEqual(urlHost, domain) || (r.golf(urlHost, domain, false) && urlHost.charAt((urlHost.length() - domain.length()) - 1) == '.' && !_HostnamesCommonKt.canParseAsIpAddress(urlHost))) {
                return true;
            }
            return false;
        }

        private final String parseDomain(String s3) {
            if (!r.golf(s3, ".", false)) {
                String canonicalHost = _HostnamesCommonKt.toCanonicalHost(StringsKt.lime(s3, "."));
                if (canonicalHost != null) {
                    return canonicalHost;
                }
                throw new IllegalArgumentException();
            }
            throw new IllegalArgumentException("Failed requirement.");
        }

        private final long parseExpires(String s3, int pos, int limit) {
            int dateCharacterOffset = dateCharacterOffset(s3, pos, limit, false);
            Matcher matcher = Cookie.TIME_PATTERN.matcher(s3);
            int i4 = -1;
            int i5 = -1;
            int i10 = -1;
            int i11 = -1;
            int i12 = -1;
            int i13 = -1;
            while (dateCharacterOffset < limit) {
                int dateCharacterOffset2 = dateCharacterOffset(s3, dateCharacterOffset + 1, limit, true);
                matcher.region(dateCharacterOffset, dateCharacterOffset2);
                if (i5 == -1 && matcher.usePattern(Cookie.TIME_PATTERN).matches()) {
                    String group = matcher.group(1);
                    Intrinsics.delta(group, "group(...)");
                    i5 = Integer.parseInt(group);
                    String group2 = matcher.group(2);
                    Intrinsics.delta(group2, "group(...)");
                    i12 = Integer.parseInt(group2);
                    String group3 = matcher.group(3);
                    Intrinsics.delta(group3, "group(...)");
                    i13 = Integer.parseInt(group3);
                } else if (i10 == -1 && matcher.usePattern(Cookie.DAY_OF_MONTH_PATTERN).matches()) {
                    String group4 = matcher.group(1);
                    Intrinsics.delta(group4, "group(...)");
                    i10 = Integer.parseInt(group4);
                } else if (i11 == -1 && matcher.usePattern(Cookie.MONTH_PATTERN).matches()) {
                    String group5 = matcher.group(1);
                    Intrinsics.delta(group5, "group(...)");
                    Locale US = Locale.US;
                    Intrinsics.delta(US, "US");
                    String lowerCase = group5.toLowerCase(US);
                    Intrinsics.delta(lowerCase, "toLowerCase(...)");
                    String pattern = Cookie.MONTH_PATTERN.pattern();
                    Intrinsics.delta(pattern, "pattern(...)");
                    i11 = StringsKt.fuchsia(pattern, lowerCase, 0, false, 6) / 4;
                } else if (i4 == -1 && matcher.usePattern(Cookie.YEAR_PATTERN).matches()) {
                    String group6 = matcher.group(1);
                    Intrinsics.delta(group6, "group(...)");
                    i4 = Integer.parseInt(group6);
                }
                dateCharacterOffset = dateCharacterOffset(s3, dateCharacterOffset2 + 1, limit, false);
            }
            if (70 <= i4 && i4 < 100) {
                i4 += 1900;
            }
            if (i4 >= 0 && i4 < 70) {
                i4 += 2000;
            }
            if (i4 >= 1601) {
                if (i11 != -1) {
                    if (1 <= i10 && i10 < 32) {
                        if (i5 >= 0 && i5 < 24) {
                            if (i12 >= 0 && i12 < 60) {
                                if (i13 >= 0 && i13 < 60) {
                                    GregorianCalendar gregorianCalendar = new GregorianCalendar(_UtilJvmKt.UTC);
                                    gregorianCalendar.setLenient(false);
                                    gregorianCalendar.set(1, i4);
                                    gregorianCalendar.set(2, i11 - 1);
                                    gregorianCalendar.set(5, i10);
                                    gregorianCalendar.set(11, i5);
                                    gregorianCalendar.set(12, i12);
                                    gregorianCalendar.set(13, i13);
                                    gregorianCalendar.set(14, 0);
                                    return gregorianCalendar.getTimeInMillis();
                                }
                                throw new IllegalArgumentException("Failed requirement.");
                            }
                            throw new IllegalArgumentException("Failed requirement.");
                        }
                        throw new IllegalArgumentException("Failed requirement.");
                    }
                    throw new IllegalArgumentException("Failed requirement.");
                }
                throw new IllegalArgumentException("Failed requirement.");
            }
            throw new IllegalArgumentException("Failed requirement.");
        }

        private final long parseMaxAge(String s3) {
            try {
                long parseLong = Long.parseLong(s3);
                if (parseLong <= 0) {
                    return Long.MIN_VALUE;
                }
                return parseLong;
            } catch (NumberFormatException e) {
                if (new Regex("-?\\d+").echo(s3)) {
                    if (r.quebec(s3, "-", false)) {
                        return Long.MIN_VALUE;
                    }
                    return Long.MAX_VALUE;
                }
                throw e;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean pathMatch(HttpUrl url, String path) {
            String encodedPath = url.encodedPath();
            if (!Intrinsics.areEqual(encodedPath, path)) {
                if (!r.quebec(encodedPath, path, false) || (!r.golf(path, "/", false) && encodedPath.charAt(path.length()) != '/')) {
                    return false;
                }
                return true;
            }
            return true;
        }

        @Nullable
        public final Cookie parse(@NotNull HttpUrl url, @NotNull String setCookie) {
            Intrinsics.echo(url, "url");
            Intrinsics.echo(setCookie, "setCookie");
            return parse$okhttp(System.currentTimeMillis(), url, setCookie);
        }

        @Nullable
        public final Cookie parse$okhttp(long currentTimeMillis, @NotNull HttpUrl url, @NotNull String setCookie) {
            long j5;
            long j6;
            String str;
            Intrinsics.echo(url, "url");
            Intrinsics.echo(setCookie, "setCookie");
            int delimiterOffset$default = _UtilCommonKt.delimiterOffset$default(setCookie, ';', 0, 0, 6, (Object) null);
            int delimiterOffset$default2 = _UtilCommonKt.delimiterOffset$default(setCookie, '=', 0, delimiterOffset$default, 2, (Object) null);
            String str2 = null;
            if (delimiterOffset$default2 != delimiterOffset$default) {
                String trimSubstring$default = _UtilCommonKt.trimSubstring$default(setCookie, 0, delimiterOffset$default2, 1, null);
                if (trimSubstring$default.length() != 0 && _UtilCommonKt.indexOfControlOrNonAscii(trimSubstring$default) == -1) {
                    String trimSubstring = _UtilCommonKt.trimSubstring(setCookie, delimiterOffset$default2 + 1, delimiterOffset$default);
                    if (_UtilCommonKt.indexOfControlOrNonAscii(trimSubstring) == -1) {
                        int i4 = delimiterOffset$default + 1;
                        int length = setCookie.length();
                        String str3 = null;
                        String str4 = null;
                        boolean z2 = false;
                        boolean z10 = false;
                        boolean z11 = false;
                        boolean z12 = true;
                        long j7 = -1;
                        long j10 = DateFormattingKt.MAX_DATE;
                        while (i4 < length) {
                            int delimiterOffset = _UtilCommonKt.delimiterOffset(setCookie, ';', i4, length);
                            int delimiterOffset2 = _UtilCommonKt.delimiterOffset(setCookie, '=', i4, delimiterOffset);
                            String trimSubstring2 = _UtilCommonKt.trimSubstring(setCookie, i4, delimiterOffset2);
                            if (delimiterOffset2 < delimiterOffset) {
                                str = _UtilCommonKt.trimSubstring(setCookie, delimiterOffset2 + 1, delimiterOffset);
                            } else {
                                str = "";
                            }
                            if (r.hotel(trimSubstring2, Column.EXPIRES, true)) {
                                try {
                                    j10 = parseExpires(str, 0, str.length());
                                } catch (NumberFormatException | IllegalArgumentException unused) {
                                }
                            } else if (r.hotel(trimSubstring2, "max-age", true)) {
                                j7 = parseMaxAge(str);
                            } else {
                                if (r.hotel(trimSubstring2, "domain", true)) {
                                    str2 = parseDomain(str);
                                    z12 = false;
                                } else if (r.hotel(trimSubstring2, "path", true)) {
                                    str3 = str;
                                } else if (r.hotel(trimSubstring2, "secure", true)) {
                                    z11 = true;
                                } else if (r.hotel(trimSubstring2, "httponly", true)) {
                                    z2 = true;
                                } else if (r.hotel(trimSubstring2, "samesite", true)) {
                                    str4 = str;
                                }
                                i4 = delimiterOffset + 1;
                            }
                            z10 = true;
                            i4 = delimiterOffset + 1;
                        }
                        if (j7 == Long.MIN_VALUE) {
                            j5 = Long.MIN_VALUE;
                        } else if (j7 != -1) {
                            if (j7 <= 9223372036854775L) {
                                j6 = j7 * 1000;
                            } else {
                                j6 = Long.MAX_VALUE;
                            }
                            long j11 = currentTimeMillis + j6;
                            if (j11 >= currentTimeMillis && j11 <= DateFormattingKt.MAX_DATE) {
                                j5 = j11;
                            } else {
                                j5 = 253402300799999L;
                            }
                        } else {
                            j5 = j10;
                        }
                        String host = url.host();
                        if (str2 == null) {
                            str2 = host;
                        } else if (!domainMatch(host, str2)) {
                            return null;
                        }
                        if (host.length() != str2.length() && PublicSuffixDatabase.INSTANCE.get().getEffectiveTldPlusOne(str2) == null) {
                            return null;
                        }
                        String str5 = "/";
                        if (str3 == null || !r.quebec(str3, "/", false)) {
                            String encodedPath = url.encodedPath();
                            int ivory = StringsKt.ivory(encodedPath, '/', 0, 6);
                            if (ivory != 0) {
                                str5 = encodedPath.substring(0, ivory);
                                Intrinsics.delta(str5, "substring(...)");
                            }
                            str3 = str5;
                        }
                        return new Cookie(trimSubstring$default, trimSubstring, j5, str2, str3, z11, z2, z10, z12, str4, null);
                    }
                }
            }
            return null;
        }

        @NotNull
        public final List<Cookie> parseAll(@NotNull HttpUrl url, @NotNull Headers headers) {
            Intrinsics.echo(url, "url");
            Intrinsics.echo(headers, "headers");
            List<String> values = headers.values("Set-Cookie");
            int size = values.size();
            List<Cookie> list = null;
            ArrayList arrayList = null;
            for (int i4 = 0; i4 < size; i4++) {
                Cookie parse = parse(url, values.get(i4));
                if (parse != null) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(parse);
                }
            }
            if (arrayList != null) {
                list = Collections.unmodifiableList(arrayList);
                Intrinsics.delta(list, "unmodifiableList(...)");
            }
            if (list == null) {
                return CollectionsKt.emptyList();
            }
            return list;
        }

        private Companion() {
        }
    }

    public /* synthetic */ Cookie(String str, String str2, long j5, String str3, String str4, boolean z2, boolean z10, boolean z11, boolean z12, String str5, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, j5, str3, str4, z2, z10, z11, z12, str5);
    }

    @Nullable
    public static final Cookie parse(@NotNull HttpUrl httpUrl, @NotNull String str) {
        return INSTANCE.parse(httpUrl, str);
    }

    @NotNull
    public static final List<Cookie> parseAll(@NotNull HttpUrl httpUrl, @NotNull Headers headers) {
        return INSTANCE.parseAll(httpUrl, headers);
    }

    @c
    @NotNull
    /* renamed from: -deprecated_domain, reason: not valid java name and from getter */
    public final String getDomain() {
        return this.domain;
    }

    @c
    /* renamed from: -deprecated_expiresAt, reason: not valid java name and from getter */
    public final long getExpiresAt() {
        return this.expiresAt;
    }

    @c
    /* renamed from: -deprecated_hostOnly, reason: not valid java name and from getter */
    public final boolean getHostOnly() {
        return this.hostOnly;
    }

    @c
    /* renamed from: -deprecated_httpOnly, reason: not valid java name and from getter */
    public final boolean getHttpOnly() {
        return this.httpOnly;
    }

    @c
    @NotNull
    /* renamed from: -deprecated_name, reason: not valid java name and from getter */
    public final String getName() {
        return this.name;
    }

    @c
    @NotNull
    /* renamed from: -deprecated_path, reason: not valid java name and from getter */
    public final String getPath() {
        return this.path;
    }

    @c
    /* renamed from: -deprecated_persistent, reason: not valid java name and from getter */
    public final boolean getPersistent() {
        return this.persistent;
    }

    @c
    /* renamed from: -deprecated_secure, reason: not valid java name and from getter */
    public final boolean getSecure() {
        return this.secure;
    }

    @c
    @NotNull
    /* renamed from: -deprecated_value, reason: not valid java name and from getter */
    public final String getValue() {
        return this.value;
    }

    @NotNull
    public final String domain() {
        return this.domain;
    }

    public boolean equals(@Nullable Object other) {
        if (other instanceof Cookie) {
            Cookie cookie = (Cookie) other;
            if (Intrinsics.areEqual(cookie.name, this.name) && Intrinsics.areEqual(cookie.value, this.value) && cookie.expiresAt == this.expiresAt && Intrinsics.areEqual(cookie.domain, this.domain) && Intrinsics.areEqual(cookie.path, this.path) && cookie.secure == this.secure && cookie.httpOnly == this.httpOnly && cookie.persistent == this.persistent && cookie.hostOnly == this.hostOnly && Intrinsics.areEqual(cookie.sameSite, this.sameSite)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final long expiresAt() {
        return this.expiresAt;
    }

    @IgnoreJRERequirement
    public int hashCode() {
        int i4;
        int i5;
        int i10;
        int i11;
        int sierra = AbstractC2327c.sierra(AbstractC2327c.sierra(527, 31, this.name), 31, this.value);
        long j5 = this.expiresAt;
        int sierra2 = AbstractC2327c.sierra(AbstractC2327c.sierra((sierra + ((int) (j5 ^ (j5 >>> 32)))) * 31, 31, this.domain), 31, this.path);
        int i12 = 1237;
        if (this.secure) {
            i4 = 1231;
        } else {
            i4 = 1237;
        }
        int i13 = (sierra2 + i4) * 31;
        if (this.httpOnly) {
            i5 = 1231;
        } else {
            i5 = 1237;
        }
        int i14 = (i13 + i5) * 31;
        if (this.persistent) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        int i15 = (i14 + i10) * 31;
        if (this.hostOnly) {
            i12 = 1231;
        }
        int i16 = (i15 + i12) * 31;
        String str = this.sameSite;
        if (str != null) {
            i11 = str.hashCode();
        } else {
            i11 = 0;
        }
        return i16 + i11;
    }

    public final boolean hostOnly() {
        return this.hostOnly;
    }

    public final boolean httpOnly() {
        return this.httpOnly;
    }

    public final boolean matches(@NotNull HttpUrl url) {
        boolean domainMatch;
        Intrinsics.echo(url, "url");
        if (!this.hostOnly) {
            domainMatch = INSTANCE.domainMatch(url.host(), this.domain);
        } else {
            domainMatch = Intrinsics.areEqual(url.host(), this.domain);
        }
        if (!domainMatch || !INSTANCE.pathMatch(url, this.path)) {
            return false;
        }
        if (this.secure && !url.isHttps()) {
            return false;
        }
        return true;
    }

    @NotNull
    public final String name() {
        return this.name;
    }

    @NotNull
    public final Builder newBuilder() {
        return new Builder(this);
    }

    @NotNull
    public final String path() {
        return this.path;
    }

    public final boolean persistent() {
        return this.persistent;
    }

    @Nullable
    /* renamed from: sameSite, reason: from getter */
    public final String getSameSite() {
        return this.sameSite;
    }

    public final boolean secure() {
        return this.secure;
    }

    @NotNull
    public String toString() {
        return toString$okhttp(false);
    }

    @NotNull
    public final String toString$okhttp(boolean forObsoleteRfc2965) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.name);
        sb2.append('=');
        sb2.append(this.value);
        if (this.persistent) {
            if (this.expiresAt == Long.MIN_VALUE) {
                sb2.append("; max-age=0");
            } else {
                sb2.append("; expires=");
                sb2.append(DateFormattingKt.toHttpDateString(new Date(this.expiresAt)));
            }
        }
        if (!this.hostOnly) {
            sb2.append("; domain=");
            if (forObsoleteRfc2965) {
                sb2.append(".");
            }
            sb2.append(this.domain);
        }
        sb2.append("; path=");
        sb2.append(this.path);
        if (this.secure) {
            sb2.append("; secure");
        }
        if (this.httpOnly) {
            sb2.append("; httponly");
        }
        if (this.sameSite != null) {
            sb2.append("; samesite=");
            sb2.append(this.sameSite);
        }
        String sb3 = sb2.toString();
        Intrinsics.delta(sb3, "toString(...)");
        return sb3;
    }

    @NotNull
    public final String value() {
        return this.value;
    }

    private Cookie(String str, String str2, long j5, String str3, String str4, boolean z2, boolean z10, boolean z11, boolean z12, String str5) {
        this.name = str;
        this.value = str2;
        this.expiresAt = j5;
        this.domain = str3;
        this.path = str4;
        this.secure = z2;
        this.httpOnly = z10;
        this.persistent = z11;
        this.hostOnly = z12;
        this.sameSite = str5;
    }
}
