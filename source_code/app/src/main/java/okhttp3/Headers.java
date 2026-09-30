package okhttp3;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.c;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.r;
import okhttp3.internal._HeadersCommonKt;
import okhttp3.internal.http.DateFormattingKt;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\"\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010(\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0003\u0018\u0000 *2\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00020\u0001:\u0002)*B\u0017\b\u0000\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u00032\u0006\u0010\f\u001a\u00020\u0003H\u0086\u0002J\u0010\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\f\u001a\u00020\u0003J\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\f\u001a\u00020\u0003H\u0007J\r\u0010\u0011\u001a\u00020\u0012H\u0007¢\u0006\u0002\b\u0014J\u000e\u0010\f\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0012J\u000e\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0012J\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u0018J\u0014\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00030\u001a2\u0006\u0010\f\u001a\u00020\u0003J\u0006\u0010\u001b\u001a\u00020\u001cJ\u001b\u0010\u001d\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00020\u001eH\u0096\u0002J\u0006\u0010\u001f\u001a\u00020 J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$H\u0096\u0002J\b\u0010%\u001a\u00020\u0012H\u0016J\b\u0010&\u001a\u00020\u0003H\u0016J\u0018\u0010'\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u001a0(R\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005X\u0080\u0004¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0011\u001a\u00020\u00128G¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0013¨\u0006+"}, d2 = {"Lokhttp3/Headers;", "", "Lkotlin/Pair;", "", "namesAndValues", "", "<init>", "([Ljava/lang/String;)V", "getNamesAndValues$okhttp", "()[Ljava/lang/String;", "[Ljava/lang/String;", "get", "name", "getDate", "Ljava/util/Date;", "getInstant", "Ljava/time/Instant;", "size", "", "()I", "-deprecated_size", "index", "value", "names", "", "values", "", "byteCount", "", "iterator", "", "newBuilder", "Lokhttp3/Headers$Builder;", "equals", "", "other", "", "hashCode", "toString", "toMultimap", "", "Builder", "Companion", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Headers implements Iterable<Pair<? extends String, ? extends String>>, Yd.a {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final Headers EMPTY = new Headers(new String[0]);

    @NotNull
    private final String[] namesAndValues;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\t\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0006H\u0000¢\u0006\u0002\b\u000bJ\u000e\u0010\f\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0006J\u0016\u0010\f\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0006J\u0016\u0010\u000f\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0006J\u000e\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0012J\u0016\u0010\f\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0013J\u0018\u0010\f\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0014H\u0007J\u0019\u0010\u0015\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0013H\u0086\u0002J\u0019\u0010\u0015\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0014H\u0087\u0002J\u001d\u0010\t\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0006H\u0000¢\u0006\u0002\b\u000bJ\u000e\u0010\u0016\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u0006J\u0019\u0010\u0015\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0006H\u0086\u0002J\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u00062\u0006\u0010\r\u001a\u00020\u0006H\u0086\u0002J\u0006\u0010\u0018\u001a\u00020\u0012R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0019"}, d2 = {"Lokhttp3/Headers$Builder;", "", "<init>", "()V", "namesAndValues", "", "", "getNamesAndValues$okhttp", "()Ljava/util/List;", "addLenient", "line", "addLenient$okhttp", "add", "name", "value", "addUnsafeNonAscii", "addAll", "headers", "Lokhttp3/Headers;", "Ljava/util/Date;", "Ljava/time/Instant;", "set", "removeAll", "get", "build", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Builder {

        @NotNull
        private final List<String> namesAndValues = new ArrayList(20);

        @NotNull
        public final Builder add(@NotNull String line) {
            Intrinsics.echo(line, "line");
            int emerald = StringsKt.emerald(line, ':', 0, 6);
            if (emerald != -1) {
                String substring = line.substring(0, emerald);
                Intrinsics.delta(substring, "substring(...)");
                String obj = StringsKt.b(substring).toString();
                String substring2 = line.substring(emerald + 1);
                Intrinsics.delta(substring2, "substring(...)");
                add(obj, substring2);
                return this;
            }
            throw new IllegalArgumentException("Unexpected header: ".concat(line).toString());
        }

        @NotNull
        public final Builder addAll(@NotNull Headers headers) {
            Intrinsics.echo(headers, "headers");
            return _HeadersCommonKt.commonAddAll(this, headers);
        }

        @NotNull
        public final Builder addLenient$okhttp(@NotNull String line) {
            Intrinsics.echo(line, "line");
            int emerald = StringsKt.emerald(line, ':', 1, 4);
            if (emerald != -1) {
                String substring = line.substring(0, emerald);
                Intrinsics.delta(substring, "substring(...)");
                String substring2 = line.substring(emerald + 1);
                Intrinsics.delta(substring2, "substring(...)");
                addLenient$okhttp(substring, substring2);
                return this;
            }
            if (line.charAt(0) == ':') {
                String substring3 = line.substring(1);
                Intrinsics.delta(substring3, "substring(...)");
                addLenient$okhttp("", substring3);
                return this;
            }
            addLenient$okhttp("", line);
            return this;
        }

        @NotNull
        public final Builder addUnsafeNonAscii(@NotNull String name, @NotNull String value) {
            Intrinsics.echo(name, "name");
            Intrinsics.echo(value, "value");
            _HeadersCommonKt.headersCheckName(name);
            addLenient$okhttp(name, value);
            return this;
        }

        @NotNull
        public final Headers build() {
            return _HeadersCommonKt.commonBuild(this);
        }

        @Nullable
        public final String get(@NotNull String name) {
            Intrinsics.echo(name, "name");
            return _HeadersCommonKt.commonGet(this, name);
        }

        @NotNull
        public final List<String> getNamesAndValues$okhttp() {
            return this.namesAndValues;
        }

        @NotNull
        public final Builder removeAll(@NotNull String name) {
            Intrinsics.echo(name, "name");
            return _HeadersCommonKt.commonRemoveAll(this, name);
        }

        @NotNull
        public final Builder set(@NotNull String name, @NotNull Date value) {
            Intrinsics.echo(name, "name");
            Intrinsics.echo(value, "value");
            return set(name, DateFormattingKt.toHttpDateString(value));
        }

        @IgnoreJRERequirement
        @NotNull
        public final Builder set(@NotNull String name, @NotNull Instant value) {
            Date from;
            Intrinsics.echo(name, "name");
            Intrinsics.echo(value, "value");
            from = Date.from(value);
            Intrinsics.delta(from, "from(...)");
            return set(name, from);
        }

        @NotNull
        public final Builder set(@NotNull String name, @NotNull String value) {
            Intrinsics.echo(name, "name");
            Intrinsics.echo(value, "value");
            return _HeadersCommonKt.commonSet(this, name, value);
        }

        @NotNull
        public final Builder add(@NotNull String name, @NotNull String value) {
            Intrinsics.echo(name, "name");
            Intrinsics.echo(value, "value");
            return _HeadersCommonKt.commonAdd(this, name, value);
        }

        @NotNull
        public final Builder add(@NotNull String name, @NotNull Date value) {
            Intrinsics.echo(name, "name");
            Intrinsics.echo(value, "value");
            return add(name, DateFormattingKt.toHttpDateString(value));
        }

        @IgnoreJRERequirement
        @NotNull
        public final Builder add(@NotNull String name, @NotNull Instant value) {
            Date from;
            Intrinsics.echo(name, "name");
            Intrinsics.echo(value, "value");
            from = Date.from(value);
            Intrinsics.delta(from, "from(...)");
            return add(name, from);
        }

        @NotNull
        public final Builder addLenient$okhttp(@NotNull String name, @NotNull String value) {
            Intrinsics.echo(name, "name");
            Intrinsics.echo(value, "value");
            return _HeadersCommonKt.commonAddLenient(this, name, value);
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\u0006\u001a\u00020\u00052\u0012\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0\b\"\u00020\tH\u0007¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\n\u001a\u00020\u00052\u0012\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0\b\"\u00020\tH\u0007¢\u0006\u0004\b\f\u0010\u000bJ\u001d\u0010\r\u001a\u00020\u0005*\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\u000eH\u0007¢\u0006\u0002\b\nJ!\u0010\n\u001a\u00020\u00052\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\u000eH\u0007¢\u0006\u0002\b\fR\u0010\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lokhttp3/Headers$Companion;", "", "<init>", "()V", "EMPTY", "Lokhttp3/Headers;", "headersOf", "namesAndValues", "", "", "of", "([Ljava/lang/String;)Lokhttp3/Headers;", "-deprecated_of", "toHeaders", "", "headers", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @c
        @NotNull
        /* renamed from: -deprecated_of, reason: not valid java name */
        public final Headers m264deprecated_of(@NotNull String... namesAndValues) {
            Intrinsics.echo(namesAndValues, "namesAndValues");
            return of((String[]) Arrays.copyOf(namesAndValues, namesAndValues.length));
        }

        @NotNull
        public final Headers of(@NotNull String... namesAndValues) {
            Intrinsics.echo(namesAndValues, "namesAndValues");
            return _HeadersCommonKt.commonHeadersOf((String[]) Arrays.copyOf(namesAndValues, namesAndValues.length));
        }

        private Companion() {
        }

        @c
        @NotNull
        /* renamed from: -deprecated_of, reason: not valid java name */
        public final Headers m263deprecated_of(@NotNull Map<String, String> headers) {
            Intrinsics.echo(headers, "headers");
            return of(headers);
        }

        @NotNull
        public final Headers of(@NotNull Map<String, String> map) {
            Intrinsics.echo(map, "<this>");
            return _HeadersCommonKt.commonToHeaders(map);
        }
    }

    public Headers(@NotNull String[] namesAndValues) {
        Intrinsics.echo(namesAndValues, "namesAndValues");
        this.namesAndValues = namesAndValues;
    }

    @NotNull
    public static final Headers of(@NotNull Map<String, String> map) {
        return INSTANCE.of(map);
    }

    @c
    /* renamed from: -deprecated_size, reason: not valid java name */
    public final int m262deprecated_size() {
        return size();
    }

    public final long byteCount() {
        String[] strArr = this.namesAndValues;
        long length = strArr.length * 2;
        for (int i4 = 0; i4 < strArr.length; i4++) {
            length += this.namesAndValues[i4].length();
        }
        return length;
    }

    public boolean equals(@Nullable Object other) {
        return _HeadersCommonKt.commonEquals(this, other);
    }

    @Nullable
    public final String get(@NotNull String name) {
        Intrinsics.echo(name, "name");
        return _HeadersCommonKt.commonHeadersGet(this.namesAndValues, name);
    }

    @Nullable
    public final Date getDate(@NotNull String name) {
        Intrinsics.echo(name, "name");
        String str = get(name);
        if (str != null) {
            return DateFormattingKt.toHttpDateOrNull(str);
        }
        return null;
    }

    @IgnoreJRERequirement
    @Nullable
    public final Instant getInstant(@NotNull String name) {
        Instant instant;
        Intrinsics.echo(name, "name");
        Date date = getDate(name);
        if (date != null) {
            instant = date.toInstant();
            return instant;
        }
        return null;
    }

    @NotNull
    /* renamed from: getNamesAndValues$okhttp, reason: from getter */
    public final String[] getNamesAndValues() {
        return this.namesAndValues;
    }

    public int hashCode() {
        return _HeadersCommonKt.commonHashCode(this);
    }

    @Override // java.lang.Iterable
    @NotNull
    public Iterator<Pair<? extends String, ? extends String>> iterator() {
        return _HeadersCommonKt.commonIterator(this);
    }

    @NotNull
    public final String name(int index) {
        return _HeadersCommonKt.commonName(this, index);
    }

    @NotNull
    public final Set<String> names() {
        r.india();
        TreeSet treeSet = new TreeSet(String.CASE_INSENSITIVE_ORDER);
        int size = size();
        for (int i4 = 0; i4 < size; i4++) {
            treeSet.add(name(i4));
        }
        Set<String> unmodifiableSet = Collections.unmodifiableSet(treeSet);
        Intrinsics.delta(unmodifiableSet, "unmodifiableSet(...)");
        return unmodifiableSet;
    }

    @NotNull
    public final Builder newBuilder() {
        return _HeadersCommonKt.commonNewBuilder(this);
    }

    public final int size() {
        return this.namesAndValues.length / 2;
    }

    @NotNull
    public final Map<String, List<String>> toMultimap() {
        r.india();
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        int size = size();
        for (int i4 = 0; i4 < size; i4++) {
            String name = name(i4);
            Locale US = Locale.US;
            Intrinsics.delta(US, "US");
            String lowerCase = name.toLowerCase(US);
            Intrinsics.delta(lowerCase, "toLowerCase(...)");
            List list = (List) treeMap.get(lowerCase);
            if (list == null) {
                list = new ArrayList(2);
                treeMap.put(lowerCase, list);
            }
            list.add(value(i4));
        }
        return treeMap;
    }

    @NotNull
    public String toString() {
        return _HeadersCommonKt.commonToString(this);
    }

    @NotNull
    public final String value(int index) {
        return _HeadersCommonKt.commonValue(this, index);
    }

    @NotNull
    public final List<String> values(@NotNull String name) {
        Intrinsics.echo(name, "name");
        return _HeadersCommonKt.commonValues(this, name);
    }

    @NotNull
    public static final Headers of(@NotNull String... strArr) {
        return INSTANCE.of(strArr);
    }
}
