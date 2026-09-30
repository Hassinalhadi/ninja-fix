package okhttp3.internal;

import Lf.h;
import Q0.c;
import Tf.ag;
import Tf.ah;
import Tf.ao;
import Tf.b;
import Tf.k;
import Tf.l;
import Tf.m;
import Tf.n;
import Tf.u;
import com.airbnb.lottie.compose.LottieConstants;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.db.Column;
import com.clevertap.android.sdk.variables.CTVariableUtils;
import g8.d;
import java.io.Closeable;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.ab;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.x;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import s6.AbstractC2689j6;

@Metadata(d1 = {"\u0000º\u0001\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\f\n\u0002\b\t\n\u0002\u0010\u0005\n\u0002\b\u0003\n\u0002\u0010\n\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001aI\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000*\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u001a\u0010\u0005\u001a\u0016\u0012\u0006\b\u0000\u0012\u00020\u00010\u0003j\n\u0012\u0006\b\u0000\u0012\u00020\u0001`\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001aE\u0010\t\u001a\u00020\b*\b\u0012\u0004\u0012\u00020\u00010\u00002\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00002\u001a\u0010\u0005\u001a\u0016\u0012\u0006\b\u0000\u0012\u00020\u00010\u0003j\n\u0012\u0006\b\u0000\u0012\u00020\u0001`\u0004H\u0000¢\u0006\u0004\b\t\u0010\n\u001a9\u0010\r\u001a\u00020\f*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u000b\u001a\u00020\u00012\u0016\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00010\u0003j\b\u0012\u0004\u0012\u00020\u0001`\u0004H\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a'\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u000b\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a'\u0010\u0013\u001a\u00020\f*\u00020\u00012\b\b\u0002\u0010\u0011\u001a\u00020\f2\b\b\u0002\u0010\u0012\u001a\u00020\fH\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a'\u0010\u0015\u001a\u00020\f*\u00020\u00012\b\b\u0002\u0010\u0011\u001a\u00020\f2\b\b\u0002\u0010\u0012\u001a\u00020\fH\u0000¢\u0006\u0004\b\u0015\u0010\u0014\u001a%\u0010\u0016\u001a\u00020\u0001*\u00020\u00012\b\b\u0002\u0010\u0011\u001a\u00020\f2\b\b\u0002\u0010\u0012\u001a\u00020\f¢\u0006\u0004\b\u0016\u0010\u0017\u001a-\u0010\u0019\u001a\u00020\f*\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u00012\b\b\u0002\u0010\u0011\u001a\u00020\f2\b\b\u0002\u0010\u0012\u001a\u00020\f¢\u0006\u0004\b\u0019\u0010\u001a\u001a-\u0010\u0019\u001a\u00020\f*\u00020\u00012\u0006\u0010\u001c\u001a\u00020\u001b2\b\b\u0002\u0010\u0011\u001a\u00020\f2\b\b\u0002\u0010\u0012\u001a\u00020\f¢\u0006\u0004\b\u0019\u0010\u001d\u001a\u0013\u0010\u001e\u001a\u00020\f*\u00020\u0001H\u0000¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u0017\u0010!\u001a\u00020\b2\u0006\u0010 \u001a\u00020\u0001H\u0000¢\u0006\u0004\b!\u0010\"\u001a\u0013\u0010#\u001a\u00020\f*\u00020\u001bH\u0000¢\u0006\u0004\b#\u0010$\u001a\u001c\u0010'\u001a\u00020\f*\u00020%2\u0006\u0010&\u001a\u00020\fH\u0080\u0004¢\u0006\u0004\b'\u0010(\u001a\u001c\u0010'\u001a\u00020\f*\u00020)2\u0006\u0010&\u001a\u00020\fH\u0080\u0004¢\u0006\u0004\b'\u0010*\u001a\u001c\u0010'\u001a\u00020+*\u00020\f2\u0006\u0010&\u001a\u00020+H\u0080\u0004¢\u0006\u0004\b'\u0010,\u001a\u001b\u00100\u001a\u00020/*\u00020-2\u0006\u0010.\u001a\u00020\fH\u0000¢\u0006\u0004\b0\u00101\u001a\u0013\u00103\u001a\u00020\f*\u000202H\u0000¢\u0006\u0004\b3\u00104\u001a!\u00107\u001a\u00020/2\f\u00106\u001a\b\u0012\u0004\u0012\u00020/05H\u0080\bø\u0001\u0000¢\u0006\u0004\b7\u00108\u001a\u001b\u0010;\u001a\u00020\f*\u0002092\u0006\u0010:\u001a\u00020%H\u0000¢\u0006\u0004\b;\u0010<\u001a\u001d\u0010=\u001a\u00020\f*\u00020\u00012\b\b\u0002\u0010\u0011\u001a\u00020\fH\u0000¢\u0006\u0004\b=\u0010>\u001a\u0019\u0010@\u001a\u00020+*\u00020\u00012\u0006\u0010?\u001a\u00020+¢\u0006\u0004\b@\u0010A\u001a\u001d\u0010B\u001a\u00020\f*\u0004\u0018\u00010\u00012\u0006\u0010?\u001a\u00020\fH\u0000¢\u0006\u0004\bB\u0010>\u001a\u0015\u0010E\u001a\u00020/*\u00060Cj\u0002`D¢\u0006\u0004\bE\u0010F\u001a\u001b\u0010J\u001a\u00020\b*\u00020G2\u0006\u0010I\u001a\u00020HH\u0000¢\u0006\u0004\bJ\u0010K\u001a\u001b\u0010M\u001a\u00020/*\u00020G2\u0006\u0010L\u001a\u00020HH\u0000¢\u0006\u0004\bM\u0010N\u001a\u001b\u0010P\u001a\u00020/*\u00020G2\u0006\u0010O\u001a\u00020HH\u0000¢\u0006\u0004\bP\u0010N\u001a'\u0010T\u001a\u00020/\"\u0004\b\u0000\u0010Q*\b\u0012\u0004\u0012\u00028\u00000R2\u0006\u0010S\u001a\u00028\u0000H\u0000¢\u0006\u0004\bT\u0010U\u001a)\u0010[\u001a\u00020Z*\u00060Vj\u0002`W2\u0010\u0010Y\u001a\f\u0012\b\u0012\u00060Vj\u0002`W0XH\u0000¢\u0006\u0004\b[\u0010\\\u001a=\u0010a\u001a\b\u0012\u0004\u0012\u00028\u00000X\"\u0004\b\u0000\u0010]*\b\u0012\u0004\u0012\u00028\u00000^2\u0012\u0010`\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b0_H\u0080\bø\u0001\u0000¢\u0006\u0004\ba\u0010b\u001a'\u0010f\u001a\u00020/2\u0006\u0010c\u001a\u00020+2\u0006\u0010d\u001a\u00020+2\u0006\u0010e\u001a\u00020+H\u0000¢\u0006\u0004\bf\u0010g\u001a7\u0010i\u001a\b\u0012\u0004\u0012\u00028\u00000X\"\u0004\b\u0000\u0010]2\f\u0010h\u001a\b\u0012\u0004\u0012\u00028\u00000^2\f\u0010:\u001a\b\u0012\u0004\u0012\u00028\u00000^H\u0000¢\u0006\u0004\bi\u0010j\"\u0014\u0010l\u001a\u00020k8\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\bl\u0010m\"\u001a\u0010o\u001a\u00020n8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bo\u0010p\u001a\u0004\bq\u0010r\"\u0014\u0010s\u001a\u00020\u00018\u0000X\u0080T¢\u0006\u0006\n\u0004\bs\u0010t\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006u"}, d2 = {"", "", "other", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "comparator", "intersect", "([Ljava/lang/String;[Ljava/lang/String;Ljava/util/Comparator;)[Ljava/lang/String;", "", "hasIntersection", "([Ljava/lang/String;[Ljava/lang/String;Ljava/util/Comparator;)Z", "value", "", "indexOf", "([Ljava/lang/String;Ljava/lang/String;Ljava/util/Comparator;)I", "concat", "([Ljava/lang/String;Ljava/lang/String;)[Ljava/lang/String;", "startIndex", "endIndex", "indexOfFirstNonAsciiWhitespace", "(Ljava/lang/String;II)I", "indexOfLastNonAsciiWhitespace", "trimSubstring", "(Ljava/lang/String;II)Ljava/lang/String;", "delimiters", "delimiterOffset", "(Ljava/lang/String;Ljava/lang/String;II)I", "", "delimiter", "(Ljava/lang/String;CII)I", "indexOfControlOrNonAscii", "(Ljava/lang/String;)I", "name", "isSensitiveHeader", "(Ljava/lang/String;)Z", "parseHexDigit", "(C)I", "", "mask", "and", "(BI)I", "", "(SI)I", "", "(IJ)J", "LTf/l;", "medium", "", "writeMedium", "(LTf/l;I)V", "LTf/m;", "readMedium", "(LTf/m;)I", "Lkotlin/Function0;", "block", "ignoreIoExceptions", "(Lkotlin/jvm/functions/Function0;)V", "LTf/k;", "b", "skipAll", "(LTf/k;B)I", "indexOfNonWhitespace", "(Ljava/lang/String;I)I", "defaultValue", "toLongOrDefault", "(Ljava/lang/String;J)J", "toNonNegativeInt", "Ljava/io/Closeable;", "Lokio/Closeable;", "closeQuietly", "(Ljava/io/Closeable;)V", "LTf/u;", "LTf/ah;", CTVariableUtils.FILE, "isCivilized", "(LTf/u;LTf/ah;)Z", "path", "deleteIfExists", "(LTf/u;LTf/ah;)V", "directory", "deleteContents", "E", "", "element", "addIfAbsent", "(Ljava/util/List;Ljava/lang/Object;)V", "Ljava/lang/Exception;", "Lkotlin/Exception;", "", Constants.INAPP_SUPPRESSED, "", "withSuppressed", "(Ljava/lang/Exception;Ljava/util/List;)Ljava/lang/Throwable;", "T", "", "Lkotlin/Function1;", "predicate", "filterList", "(Ljava/lang/Iterable;Lkotlin/jvm/functions/Function1;)Ljava/util/List;", "arrayLength", "offset", Column.COUNT, "checkOffsetAndCount", "(JJJ)V", "a", "interleave", "(Ljava/lang/Iterable;Ljava/lang/Iterable;)Ljava/util/List;", "", "EMPTY_BYTE_ARRAY", "[B", "LTf/ag;", "UNICODE_BOMS", "LTf/ag;", "getUNICODE_BOMS", "()LTf/ag;", "USER_AGENT", "Ljava/lang/String;", "okhttp"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class _UtilCommonKt {

    @NotNull
    public static final byte[] EMPTY_BYTE_ARRAY = new byte[0];

    @NotNull
    private static final ag UNICODE_BOMS;

    @NotNull
    public static final String USER_AGENT = "okhttp/5.1.0";

    static {
        n nVar = n.silver;
        UNICODE_BOMS = b.foxtrot(d.mike("efbbbf"), d.mike("feff"), d.mike("fffe0000"), d.mike("fffe"), d.mike("0000feff"));
    }

    public static final <E> void addIfAbsent(@NotNull List<E> list, E e) {
        Intrinsics.echo(list, "<this>");
        if (!list.contains(e)) {
            list.add(e);
        }
    }

    public static final int and(byte b2, int i4) {
        return b2 & i4;
    }

    public static final void checkOffsetAndCount(long j5, long j6, long j7) {
        if ((j6 | j7) >= 0 && j6 <= j5 && j5 - j6 >= j7) {
            return;
        }
        StringBuilder uniform = c.uniform("length=", j5, ", offset=");
        uniform.append(j6);
        uniform.append(", count=");
        uniform.append(j6);
        throw new ArrayIndexOutOfBoundsException(uniform.toString());
    }

    public static final void closeQuietly(@NotNull Closeable closeable) {
        Intrinsics.echo(closeable, "<this>");
        try {
            closeable.close();
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception unused) {
        }
    }

    @NotNull
    public static final String[] concat(@NotNull String[] strArr, @NotNull String value) {
        Intrinsics.echo(strArr, "<this>");
        Intrinsics.echo(value, "value");
        Object[] copyOf = Arrays.copyOf(strArr, strArr.length + 1);
        Intrinsics.delta(copyOf, "copyOf(...)");
        String[] strArr2 = (String[]) copyOf;
        strArr2[strArr2.length - 1] = value;
        return strArr2;
    }

    public static final void deleteContents(@NotNull u uVar, @NotNull ah directory) {
        Intrinsics.echo(uVar, "<this>");
        Intrinsics.echo(directory, "directory");
        try {
            IOException iOException = null;
            for (ah ahVar : uVar.list(directory)) {
                try {
                    if (uVar.metadata(ahVar).bravo) {
                        deleteContents(uVar, ahVar);
                    }
                    uVar.delete(ahVar);
                } catch (IOException e) {
                    if (iOException == null) {
                        iOException = e;
                    }
                }
            }
            if (iOException != null) {
                throw iOException;
            }
        } catch (FileNotFoundException unused) {
        }
    }

    public static final void deleteIfExists(@NotNull u uVar, @NotNull ah path) {
        Intrinsics.echo(uVar, "<this>");
        Intrinsics.echo(path, "path");
        try {
            uVar.delete(path);
        } catch (FileNotFoundException unused) {
        }
    }

    public static final int delimiterOffset(@NotNull String str, @NotNull String delimiters, int i4, int i5) {
        Intrinsics.echo(str, "<this>");
        Intrinsics.echo(delimiters, "delimiters");
        while (i4 < i5) {
            if (StringsKt.black(delimiters, str.charAt(i4))) {
                return i4;
            }
            i4++;
        }
        return i5;
    }

    public static /* synthetic */ int delimiterOffset$default(String str, String str2, int i4, int i5, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            i4 = 0;
        }
        if ((i10 & 4) != 0) {
            i5 = str.length();
        }
        return delimiterOffset(str, str2, i4, i5);
    }

    @NotNull
    public static final <T> List<T> filterList(@NotNull Iterable<? extends T> iterable, @NotNull Function1<? super T, Boolean> predicate) {
        Intrinsics.echo(iterable, "<this>");
        Intrinsics.echo(predicate, "predicate");
        ArrayList arrayList = (List<T>) CollectionsKt.emptyList();
        for (T t5 : iterable) {
            if (predicate.invoke(t5).booleanValue()) {
                if (arrayList.isEmpty()) {
                    arrayList = new ArrayList();
                }
                x.bravo(arrayList);
                arrayList.add(t5);
            }
        }
        return (List<T>) arrayList;
    }

    @NotNull
    public static final ag getUNICODE_BOMS() {
        return UNICODE_BOMS;
    }

    public static final boolean hasIntersection(@NotNull String[] strArr, @Nullable String[] strArr2, @NotNull Comparator<? super String> comparator) {
        Intrinsics.echo(strArr, "<this>");
        Intrinsics.echo(comparator, "comparator");
        if (strArr.length != 0 && strArr2 != null && strArr2.length != 0) {
            for (String str : strArr) {
                h golf = x.golf(strArr2);
                while (golf.hasNext()) {
                    if (comparator.compare(str, (String) golf.next()) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static final void ignoreIoExceptions(@NotNull Function0<Unit> block) {
        Intrinsics.echo(block, "block");
        try {
            block.invoke();
        } catch (IOException unused) {
        }
    }

    public static final int indexOf(@NotNull String[] strArr, @NotNull String value, @NotNull Comparator<String> comparator) {
        Intrinsics.echo(strArr, "<this>");
        Intrinsics.echo(value, "value");
        Intrinsics.echo(comparator, "comparator");
        int length = strArr.length;
        for (int i4 = 0; i4 < length; i4++) {
            if (comparator.compare(strArr[i4], value) == 0) {
                return i4;
            }
        }
        return -1;
    }

    public static final int indexOfControlOrNonAscii(@NotNull String str) {
        Intrinsics.echo(str, "<this>");
        int length = str.length();
        for (int i4 = 0; i4 < length; i4++) {
            char charAt = str.charAt(i4);
            if (Intrinsics.golf(charAt, 31) <= 0 || Intrinsics.golf(charAt, 127) >= 0) {
                return i4;
            }
        }
        return -1;
    }

    public static final int indexOfFirstNonAsciiWhitespace(@NotNull String str, int i4, int i5) {
        Intrinsics.echo(str, "<this>");
        while (i4 < i5) {
            char charAt = str.charAt(i4);
            if (charAt != '\t' && charAt != '\n' && charAt != '\f' && charAt != '\r' && charAt != ' ') {
                return i4;
            }
            i4++;
        }
        return i5;
    }

    public static /* synthetic */ int indexOfFirstNonAsciiWhitespace$default(String str, int i4, int i5, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i4 = 0;
        }
        if ((i10 & 2) != 0) {
            i5 = str.length();
        }
        return indexOfFirstNonAsciiWhitespace(str, i4, i5);
    }

    public static final int indexOfLastNonAsciiWhitespace(@NotNull String str, int i4, int i5) {
        Intrinsics.echo(str, "<this>");
        int i10 = i5 - 1;
        if (i4 <= i10) {
            while (true) {
                char charAt = str.charAt(i10);
                if (charAt != '\t' && charAt != '\n' && charAt != '\f' && charAt != '\r' && charAt != ' ') {
                    return i10 + 1;
                }
                if (i10 == i4) {
                    break;
                }
                i10--;
            }
        }
        return i4;
    }

    public static /* synthetic */ int indexOfLastNonAsciiWhitespace$default(String str, int i4, int i5, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i4 = 0;
        }
        if ((i10 & 2) != 0) {
            i5 = str.length();
        }
        return indexOfLastNonAsciiWhitespace(str, i4, i5);
    }

    public static final int indexOfNonWhitespace(@NotNull String str, int i4) {
        Intrinsics.echo(str, "<this>");
        int length = str.length();
        while (i4 < length) {
            char charAt = str.charAt(i4);
            if (charAt != ' ' && charAt != '\t') {
                return i4;
            }
            i4++;
        }
        return str.length();
    }

    public static /* synthetic */ int indexOfNonWhitespace$default(String str, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i4 = 0;
        }
        return indexOfNonWhitespace(str, i4);
    }

    @NotNull
    public static final <T> List<T> interleave(@NotNull Iterable<? extends T> a6, @NotNull Iterable<? extends T> b2) {
        Intrinsics.echo(a6, "a");
        Intrinsics.echo(b2, "b");
        Iterator<? extends T> it = a6.iterator();
        Iterator<? extends T> it2 = b2.iterator();
        Ld.c hotel = ab.hotel();
        while (true) {
            if (!it.hasNext() && !it2.hasNext()) {
                return ab.alpha(hotel);
            }
            if (it.hasNext()) {
                hotel.add(it.next());
            }
            if (it2.hasNext()) {
                hotel.add(it2.next());
            }
        }
    }

    @NotNull
    public static final String[] intersect(@NotNull String[] strArr, @NotNull String[] other, @NotNull Comparator<? super String> comparator) {
        Intrinsics.echo(strArr, "<this>");
        Intrinsics.echo(other, "other");
        Intrinsics.echo(comparator, "comparator");
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            int length = other.length;
            int i4 = 0;
            while (true) {
                if (i4 >= length) {
                    break;
                }
                if (comparator.compare(str, other[i4]) == 0) {
                    arrayList.add(str);
                    break;
                }
                i4++;
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean isCivilized(@NotNull u uVar, @NotNull ah file) {
        Intrinsics.echo(uVar, "<this>");
        Intrinsics.echo(file, "file");
        ao sink = uVar.sink(file);
        try {
            uVar.delete(file);
            if (sink != null) {
                try {
                    sink.close();
                } catch (Throwable unused) {
                }
            }
            return true;
        } catch (IOException unused2) {
            if (sink != null) {
                try {
                    sink.close();
                } catch (Throwable th) {
                    th = th;
                    th = th;
                    if (th == null) {
                        uVar.delete(file);
                        return false;
                    }
                    throw th;
                }
            }
            th = null;
            th = th;
            if (th == null) {
            }
        } catch (Throwable th2) {
            th = th2;
            if (sink != null) {
                try {
                    sink.close();
                } catch (Throwable th3) {
                    AbstractC2689j6.charlie(th, th3);
                }
            }
            if (th == null) {
            }
        }
    }

    public static final boolean isSensitiveHeader(@NotNull String name) {
        Intrinsics.echo(name, "name");
        if (!name.equalsIgnoreCase("Authorization") && !name.equalsIgnoreCase("Cookie") && !name.equalsIgnoreCase("Proxy-Authorization") && !name.equalsIgnoreCase("Set-Cookie")) {
            return false;
        }
        return true;
    }

    public static final int parseHexDigit(char c3) {
        if ('0' <= c3 && c3 < ':') {
            return c3 - '0';
        }
        if ('a' <= c3 && c3 < 'g') {
            return c3 - 'W';
        }
        if ('A' > c3 || c3 >= 'G') {
            return -1;
        }
        return c3 - '7';
    }

    public static final int readMedium(@NotNull m mVar) throws IOException {
        Intrinsics.echo(mVar, "<this>");
        return and(mVar.readByte(), 255) | (and(mVar.readByte(), 255) << 16) | (and(mVar.readByte(), 255) << 8);
    }

    public static final int skipAll(@NotNull k kVar, byte b2) {
        Intrinsics.echo(kVar, "<this>");
        int i4 = 0;
        while (!kVar.hotel() && kVar.juliet(0L) == b2) {
            i4++;
            kVar.readByte();
        }
        return i4;
    }

    public static final long toLongOrDefault(@NotNull String str, long j5) {
        Intrinsics.echo(str, "<this>");
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return j5;
        }
    }

    public static final int toNonNegativeInt(@Nullable String str, int i4) {
        if (str != null) {
            try {
                long parseLong = Long.parseLong(str);
                if (parseLong > 2147483647L) {
                    return LottieConstants.IterateForever;
                }
                if (parseLong < 0) {
                    return 0;
                }
                return (int) parseLong;
            } catch (NumberFormatException unused) {
            }
        }
        return i4;
    }

    @NotNull
    public static final String trimSubstring(@NotNull String str, int i4, int i5) {
        Intrinsics.echo(str, "<this>");
        int indexOfFirstNonAsciiWhitespace = indexOfFirstNonAsciiWhitespace(str, i4, i5);
        String substring = str.substring(indexOfFirstNonAsciiWhitespace, indexOfLastNonAsciiWhitespace(str, indexOfFirstNonAsciiWhitespace, i5));
        Intrinsics.delta(substring, "substring(...)");
        return substring;
    }

    public static /* synthetic */ String trimSubstring$default(String str, int i4, int i5, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i4 = 0;
        }
        if ((i10 & 2) != 0) {
            i5 = str.length();
        }
        return trimSubstring(str, i4, i5);
    }

    @NotNull
    public static final Throwable withSuppressed(@NotNull Exception exc, @NotNull List<? extends Exception> suppressed) {
        Intrinsics.echo(exc, "<this>");
        Intrinsics.echo(suppressed, "suppressed");
        Iterator<? extends Exception> it = suppressed.iterator();
        while (it.hasNext()) {
            AbstractC2689j6.charlie(exc, it.next());
        }
        return exc;
    }

    public static final void writeMedium(@NotNull l lVar, int i4) throws IOException {
        Intrinsics.echo(lVar, "<this>");
        lVar.black((i4 >>> 16) & 255);
        lVar.black((i4 >>> 8) & 255);
        lVar.black(i4 & 255);
    }

    public static final int and(short s3, int i4) {
        return s3 & i4;
    }

    public static final int delimiterOffset(@NotNull String str, char c3, int i4, int i5) {
        Intrinsics.echo(str, "<this>");
        while (i4 < i5) {
            if (str.charAt(i4) == c3) {
                return i4;
            }
            i4++;
        }
        return i5;
    }

    public static final long and(int i4, long j5) {
        return j5 & i4;
    }

    public static /* synthetic */ int delimiterOffset$default(String str, char c3, int i4, int i5, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            i4 = 0;
        }
        if ((i10 & 4) != 0) {
            i5 = str.length();
        }
        return delimiterOffset(str, c3, i4, i5);
    }
}
