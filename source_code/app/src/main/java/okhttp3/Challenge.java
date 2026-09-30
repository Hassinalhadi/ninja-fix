package okhttp3;

import java.nio.charset.Charset;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.c;
import kotlin.collections.y;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pe.AbstractC2327c;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0014\u0010\u0004\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0004\b\u0006\u0010\u0007B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\tJ\u000e\u0010\u000f\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\rJ\r\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0002\b\u0010J\u001b\u0010\u0004\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u00030\u0005H\u0007¢\u0006\u0002\b\u0011J\u000f\u0010\b\u001a\u0004\u0018\u00010\u0003H\u0007¢\u0006\u0002\b\u0012J\r\u0010\f\u001a\u00020\rH\u0007¢\u0006\u0002\b\u0013J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u0003H\u0016R\u0013\u0010\u0002\u001a\u00020\u00038G¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\nR!\u0010\u0004\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u00030\u00058G¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u000bR\u0013\u0010\b\u001a\u0004\u0018\u00010\u00038G¢\u0006\u0006\u001a\u0004\b\b\u0010\nR\u0011\u0010\f\u001a\u00020\r8G¢\u0006\u0006\u001a\u0004\b\f\u0010\u000e¨\u0006\u001a"}, d2 = {"Lokhttp3/Challenge;", "", "scheme", "", "authParams", "", "<init>", "(Ljava/lang/String;Ljava/util/Map;)V", "realm", "(Ljava/lang/String;Ljava/lang/String;)V", "()Ljava/lang/String;", "()Ljava/util/Map;", "charset", "Ljava/nio/charset/Charset;", "()Ljava/nio/charset/Charset;", "withCharset", "-deprecated_scheme", "-deprecated_authParams", "-deprecated_realm", "-deprecated_charset", "equals", "", "other", "hashCode", "", "toString", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Challenge {

    @NotNull
    private final Map<String, String> authParams;

    @NotNull
    private final String scheme;

    public Challenge(@NotNull String scheme, @NotNull Map<String, String> authParams) {
        String str;
        Intrinsics.echo(scheme, "scheme");
        Intrinsics.echo(authParams, "authParams");
        this.scheme = scheme;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, String> entry : authParams.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (key != null) {
                Locale US = Locale.US;
                Intrinsics.delta(US, "US");
                str = key.toLowerCase(US);
                Intrinsics.delta(str, "toLowerCase(...)");
            } else {
                str = null;
            }
            linkedHashMap.put(str, value);
        }
        Map<String, String> unmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        Intrinsics.delta(unmodifiableMap, "unmodifiableMap(...)");
        this.authParams = unmodifiableMap;
    }

    @c
    @NotNull
    /* renamed from: -deprecated_authParams, reason: not valid java name */
    public final Map<String, String> m236deprecated_authParams() {
        return this.authParams;
    }

    @c
    @NotNull
    /* renamed from: -deprecated_charset, reason: not valid java name */
    public final Charset m237deprecated_charset() {
        return charset();
    }

    @c
    @Nullable
    /* renamed from: -deprecated_realm, reason: not valid java name */
    public final String m238deprecated_realm() {
        return realm();
    }

    @c
    @NotNull
    /* renamed from: -deprecated_scheme, reason: not valid java name and from getter */
    public final String getScheme() {
        return this.scheme;
    }

    @NotNull
    public final Map<String, String> authParams() {
        return this.authParams;
    }

    @NotNull
    public final Charset charset() {
        String str = this.authParams.get("charset");
        if (str != null) {
            try {
                Charset forName = Charset.forName(str);
                Intrinsics.delta(forName, "forName(...)");
                return forName;
            } catch (Exception unused) {
            }
        }
        return kotlin.text.a.delta;
    }

    public boolean equals(@Nullable Object other) {
        if (other instanceof Challenge) {
            Challenge challenge = (Challenge) other;
            if (Intrinsics.areEqual(challenge.scheme, this.scheme) && Intrinsics.areEqual(challenge.authParams, this.authParams)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        return this.authParams.hashCode() + AbstractC2327c.sierra(899, 31, this.scheme);
    }

    @Nullable
    public final String realm() {
        return this.authParams.get("realm");
    }

    @NotNull
    public final String scheme() {
        return this.scheme;
    }

    @NotNull
    public String toString() {
        return this.scheme + " authParams=" + this.authParams;
    }

    @NotNull
    public final Challenge withCharset(@NotNull Charset charset) {
        Intrinsics.echo(charset, "charset");
        LinkedHashMap amber = y.amber(this.authParams);
        amber.put("charset", charset.name());
        return new Challenge(this.scheme, amber);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Challenge(@NotNull String scheme, @NotNull String realm) {
        this(scheme, (Map<String, String>) r3);
        Intrinsics.echo(scheme, "scheme");
        Intrinsics.echo(realm, "realm");
        Map singletonMap = Collections.singletonMap("realm", realm);
        Intrinsics.delta(singletonMap, "singletonMap(...)");
    }
}
