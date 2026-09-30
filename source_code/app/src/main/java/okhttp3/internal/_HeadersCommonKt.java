package okhttp3.internal;

import com.checkout.components.card.utils.constants.ExpiryDateConstantsKt;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.x;
import kotlin.text.StringsKt;
import okhttp3.Headers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import s6.AbstractC2743p6;
import s6.AbstractC2770s7;

@Metadata(d1 = {"\u0000X\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0004\n\u0002\u0010$\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000\u001a\u0014\u0010\u0005\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000\u001a\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007*\u00020\u00022\u0006\u0010\b\u001a\u00020\u0001H\u0000\u001a\u001e\u0010\t\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u000b0\n*\u00020\u0002H\u0000\u001a\f\u0010\f\u001a\u00020\r*\u00020\u0002H\u0000\u001a\u0016\u0010\u000e\u001a\u00020\u000f*\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0000\u001a\f\u0010\u0012\u001a\u00020\u0004*\u00020\u0002H\u0000\u001a\f\u0010\u0013\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a%\u0010\u0014\u001a\u0004\u0018\u00010\u00012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00010\u00162\u0006\u0010\b\u001a\u00020\u0001H\u0000¢\u0006\u0002\u0010\u0017\u001a\u001c\u0010\u0018\u001a\u00020\r*\u00020\r2\u0006\u0010\b\u001a\u00020\u00012\u0006\u0010\u0019\u001a\u00020\u0001H\u0000\u001a\u0014\u0010\u001a\u001a\u00020\r*\u00020\r2\u0006\u0010\u001b\u001a\u00020\u0002H\u0000\u001a\u001c\u0010\u001c\u001a\u00020\r*\u00020\r2\u0006\u0010\b\u001a\u00020\u00012\u0006\u0010\u0019\u001a\u00020\u0001H\u0000\u001a\u0014\u0010\u001d\u001a\u00020\r*\u00020\r2\u0006\u0010\b\u001a\u00020\u0001H\u0000\u001a\u001c\u0010\u001e\u001a\u00020\r*\u00020\r2\u0006\u0010\b\u001a\u00020\u00012\u0006\u0010\u0019\u001a\u00020\u0001H\u0000\u001a\u0016\u0010\u001f\u001a\u0004\u0018\u00010\u0001*\u00020\r2\u0006\u0010\b\u001a\u00020\u0001H\u0000\u001a\f\u0010 \u001a\u00020\u0002*\u00020\rH\u0000\u001a\u0010\u0010!\u001a\u00020\"2\u0006\u0010\b\u001a\u00020\u0001H\u0000\u001a\u0018\u0010#\u001a\u00020\"2\u0006\u0010\u0019\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u0001H\u0000\u001a\f\u0010$\u001a\u00020\u0001*\u00020%H\u0002\u001a!\u0010&\u001a\u00020\u00022\u0012\u0010'\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0016\"\u00020\u0001H\u0000¢\u0006\u0002\u0010(\u001a\u0018\u0010)\u001a\u00020\u0002*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010*H\u0000¨\u0006+"}, d2 = {"commonName", "", "Lokhttp3/Headers;", "index", "", "commonValue", "commonValues", "", "name", "commonIterator", "", "Lkotlin/Pair;", "commonNewBuilder", "Lokhttp3/Headers$Builder;", "commonEquals", "", "other", "", "commonHashCode", "commonToString", "commonHeadersGet", "namesAndValues", "", "([Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "commonAdd", "value", "commonAddAll", "headers", "commonAddLenient", "commonRemoveAll", "commonSet", "commonGet", "commonBuild", "headersCheckName", "", "headersCheckValue", "charCode", "", "commonHeadersOf", "inputNamesAndValues", "([Ljava/lang/String;)Lokhttp3/Headers;", "commonToHeaders", "", "okhttp"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class _HeadersCommonKt {
    private static final String charCode(char c3) {
        AbstractC2743p6.alpha(16);
        String num = Integer.toString(c3, 16);
        Intrinsics.delta(num, "toString(...)");
        if (num.length() < 2) {
            return ExpiryDateConstantsKt.EXPIRY_DATE_PREFIX_ZERO.concat(num);
        }
        return num;
    }

    @NotNull
    public static final Headers.Builder commonAdd(@NotNull Headers.Builder builder, @NotNull String name, @NotNull String value) {
        Intrinsics.echo(builder, "<this>");
        Intrinsics.echo(name, "name");
        Intrinsics.echo(value, "value");
        headersCheckName(name);
        headersCheckValue(value, name);
        commonAddLenient(builder, name, value);
        return builder;
    }

    @NotNull
    public static final Headers.Builder commonAddAll(@NotNull Headers.Builder builder, @NotNull Headers headers) {
        Intrinsics.echo(builder, "<this>");
        Intrinsics.echo(headers, "headers");
        int size = headers.size();
        for (int i4 = 0; i4 < size; i4++) {
            commonAddLenient(builder, headers.name(i4), headers.value(i4));
        }
        return builder;
    }

    @NotNull
    public static final Headers.Builder commonAddLenient(@NotNull Headers.Builder builder, @NotNull String name, @NotNull String value) {
        Intrinsics.echo(builder, "<this>");
        Intrinsics.echo(name, "name");
        Intrinsics.echo(value, "value");
        builder.getNamesAndValues$okhttp().add(name);
        builder.getNamesAndValues$okhttp().add(StringsKt.b(value).toString());
        return builder;
    }

    @NotNull
    public static final Headers commonBuild(@NotNull Headers.Builder builder) {
        Intrinsics.echo(builder, "<this>");
        return new Headers((String[]) builder.getNamesAndValues$okhttp().toArray(new String[0]));
    }

    public static final boolean commonEquals(@NotNull Headers headers, @Nullable Object obj) {
        Intrinsics.echo(headers, "<this>");
        if ((obj instanceof Headers) && Arrays.equals(headers.getNamesAndValues(), ((Headers) obj).getNamesAndValues())) {
            return true;
        }
        return false;
    }

    @Nullable
    public static final String commonGet(@NotNull Headers.Builder builder, @NotNull String name) {
        Intrinsics.echo(builder, "<this>");
        Intrinsics.echo(name, "name");
        int size = builder.getNamesAndValues$okhttp().size() - 2;
        int alpha = AbstractC2770s7.alpha(size, 0, -2);
        if (alpha <= size) {
            while (!name.equalsIgnoreCase(builder.getNamesAndValues$okhttp().get(size))) {
                if (size != alpha) {
                    size -= 2;
                } else {
                    return null;
                }
            }
            return builder.getNamesAndValues$okhttp().get(size + 1);
        }
        return null;
    }

    public static final int commonHashCode(@NotNull Headers headers) {
        Intrinsics.echo(headers, "<this>");
        return Arrays.hashCode(headers.getNamesAndValues());
    }

    @Nullable
    public static final String commonHeadersGet(@NotNull String[] namesAndValues, @NotNull String name) {
        Intrinsics.echo(namesAndValues, "namesAndValues");
        Intrinsics.echo(name, "name");
        int length = namesAndValues.length - 2;
        int alpha = AbstractC2770s7.alpha(length, 0, -2);
        if (alpha <= length) {
            while (!name.equalsIgnoreCase(namesAndValues[length])) {
                if (length != alpha) {
                    length -= 2;
                } else {
                    return null;
                }
            }
            return namesAndValues[length + 1];
        }
        return null;
    }

    @NotNull
    public static final Headers commonHeadersOf(@NotNull String... inputNamesAndValues) {
        Intrinsics.echo(inputNamesAndValues, "inputNamesAndValues");
        if (inputNamesAndValues.length % 2 == 0) {
            String[] strArr = (String[]) Arrays.copyOf(inputNamesAndValues, inputNamesAndValues.length);
            int length = strArr.length;
            int i4 = 0;
            for (int i5 = 0; i5 < length; i5++) {
                if (strArr[i5] != null) {
                    strArr[i5] = StringsKt.b(inputNamesAndValues[i5]).toString();
                } else {
                    throw new IllegalArgumentException("Headers cannot be null");
                }
            }
            int alpha = AbstractC2770s7.alpha(0, strArr.length - 1, 2);
            if (alpha >= 0) {
                while (true) {
                    String str = strArr[i4];
                    String str2 = strArr[i4 + 1];
                    headersCheckName(str);
                    headersCheckValue(str2, str);
                    if (i4 == alpha) {
                        break;
                    }
                    i4 += 2;
                }
            }
            return new Headers(strArr);
        }
        throw new IllegalArgumentException("Expected alternating header names and values");
    }

    @NotNull
    public static final Iterator<Pair<String, String>> commonIterator(@NotNull Headers headers) {
        Intrinsics.echo(headers, "<this>");
        int size = headers.size();
        Pair[] pairArr = new Pair[size];
        for (int i4 = 0; i4 < size; i4++) {
            pairArr[i4] = new Pair(headers.name(i4), headers.value(i4));
        }
        return x.golf(pairArr);
    }

    @NotNull
    public static final String commonName(@NotNull Headers headers, int i4) {
        Intrinsics.echo(headers, "<this>");
        String str = (String) ArraysKt.ivory(i4 * 2, headers.getNamesAndValues());
        if (str != null) {
            return str;
        }
        throw new IndexOutOfBoundsException("name[" + i4 + ']');
    }

    @NotNull
    public static final Headers.Builder commonNewBuilder(@NotNull Headers headers) {
        Intrinsics.echo(headers, "<this>");
        Headers.Builder builder = new Headers.Builder();
        CollectionsKt.amber(builder.getNamesAndValues$okhttp(), headers.getNamesAndValues());
        return builder;
    }

    @NotNull
    public static final Headers.Builder commonRemoveAll(@NotNull Headers.Builder builder, @NotNull String name) {
        Intrinsics.echo(builder, "<this>");
        Intrinsics.echo(name, "name");
        int i4 = 0;
        while (i4 < builder.getNamesAndValues$okhttp().size()) {
            if (name.equalsIgnoreCase(builder.getNamesAndValues$okhttp().get(i4))) {
                builder.getNamesAndValues$okhttp().remove(i4);
                builder.getNamesAndValues$okhttp().remove(i4);
                i4 -= 2;
            }
            i4 += 2;
        }
        return builder;
    }

    @NotNull
    public static final Headers.Builder commonSet(@NotNull Headers.Builder builder, @NotNull String name, @NotNull String value) {
        Intrinsics.echo(builder, "<this>");
        Intrinsics.echo(name, "name");
        Intrinsics.echo(value, "value");
        headersCheckName(name);
        headersCheckValue(value, name);
        builder.removeAll(name);
        commonAddLenient(builder, name, value);
        return builder;
    }

    @NotNull
    public static final Headers commonToHeaders(@NotNull Map<String, String> map) {
        Intrinsics.echo(map, "<this>");
        String[] strArr = new String[map.size() * 2];
        int i4 = 0;
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            String obj = StringsKt.b(key).toString();
            String obj2 = StringsKt.b(value).toString();
            headersCheckName(obj);
            headersCheckValue(obj2, obj);
            strArr[i4] = obj;
            strArr[i4 + 1] = obj2;
            i4 += 2;
        }
        return new Headers(strArr);
    }

    @NotNull
    public static final String commonToString(@NotNull Headers headers) {
        Intrinsics.echo(headers, "<this>");
        StringBuilder sb2 = new StringBuilder();
        int size = headers.size();
        for (int i4 = 0; i4 < size; i4++) {
            String name = headers.name(i4);
            String value = headers.value(i4);
            sb2.append(name);
            sb2.append(": ");
            if (_UtilCommonKt.isSensitiveHeader(name)) {
                value = "██";
            }
            sb2.append(value);
            sb2.append("\n");
        }
        return sb2.toString();
    }

    @NotNull
    public static final String commonValue(@NotNull Headers headers, int i4) {
        Intrinsics.echo(headers, "<this>");
        String str = (String) ArraysKt.ivory((i4 * 2) + 1, headers.getNamesAndValues());
        if (str != null) {
            return str;
        }
        throw new IndexOutOfBoundsException("value[" + i4 + ']');
    }

    @NotNull
    public static final List<String> commonValues(@NotNull Headers headers, @NotNull String name) {
        Intrinsics.echo(headers, "<this>");
        Intrinsics.echo(name, "name");
        int size = headers.size();
        List<String> list = null;
        ArrayList arrayList = null;
        for (int i4 = 0; i4 < size; i4++) {
            if (name.equalsIgnoreCase(headers.name(i4))) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(headers.value(i4));
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

    public static final void headersCheckName(@NotNull String name) {
        Intrinsics.echo(name, "name");
        if (name.length() > 0) {
            int length = name.length();
            for (int i4 = 0; i4 < length; i4++) {
                char charAt = name.charAt(i4);
                if ('!' > charAt || charAt >= 127) {
                    throw new IllegalArgumentException(("Unexpected char 0x" + charCode(charAt) + " at " + i4 + " in header name: " + name).toString());
                }
            }
            return;
        }
        throw new IllegalArgumentException("name is empty");
    }

    public static final void headersCheckValue(@NotNull String value, @NotNull String name) {
        String concat;
        Intrinsics.echo(value, "value");
        Intrinsics.echo(name, "name");
        int length = value.length();
        for (int i4 = 0; i4 < length; i4++) {
            char charAt = value.charAt(i4);
            if (charAt != '\t' && (' ' > charAt || charAt >= 127)) {
                StringBuilder sb2 = new StringBuilder("Unexpected char 0x");
                sb2.append(charCode(charAt));
                sb2.append(" at ");
                sb2.append(i4);
                sb2.append(" in ");
                sb2.append(name);
                sb2.append(" value");
                if (_UtilCommonKt.isSensitiveHeader(name)) {
                    concat = "";
                } else {
                    concat = ": ".concat(value);
                }
                sb2.append(concat);
                throw new IllegalArgumentException(sb2.toString().toString());
            }
        }
    }
}
