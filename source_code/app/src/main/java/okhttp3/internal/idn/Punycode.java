package okhttp3.internal.idn;

import Tf.k;
import Tf.n;
import com.airbnb.lottie.compose.LottieConstants;
import com.checkout.address.utils.NumberOnlyZipVisualTransformation;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.variables.CTVariableUtils;
import fe.C1713e;
import g8.d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.r;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import s6.J4;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0010\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ/\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000e\u0010\rJ'\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J#\u0010\u0014\u001a\u00020\u000b*\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J)\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00060\u0016*\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u001b\u0010\u001aR\u001a\u0010\u001c\u001a\u00020\u00048\u0006X\u0086D¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010!\u001a\u00020 8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0014\u0010%\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010'\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b'\u0010&R\u0014\u0010(\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b(\u0010&R\u0014\u0010)\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b)\u0010&R\u0014\u0010*\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b*\u0010&R\u0014\u0010+\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b+\u0010&R\u0014\u0010,\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b,\u0010&R\u0018\u0010/\u001a\u00020\u0006*\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.¨\u00060"}, d2 = {"Lokhttp3/internal/idn/Punycode;", "", "<init>", "()V", "", CTVariableUtils.STRING, "", Constants.INAPP_POSITION, Constants.KEY_LIMIT, "LTf/k;", "result", "", "encodeLabel", "(Ljava/lang/String;IILTf/k;)Z", "decodeLabel", "delta", "numpoints", "first", "adapt", "(IIZ)I", "requiresEncode", "(Ljava/lang/String;II)Z", "", "codePoints", "(Ljava/lang/String;II)Ljava/util/List;", "encode", "(Ljava/lang/String;)Ljava/lang/String;", "decode", "PREFIX_STRING", "Ljava/lang/String;", "getPREFIX_STRING", "()Ljava/lang/String;", "LTf/n;", "PREFIX", "LTf/n;", "getPREFIX", "()LTf/n;", "BASE", "I", "TMIN", "TMAX", "SKEW", "DAMP", "INITIAL_BIAS", "INITIAL_N", "getPunycodeDigit", "(I)I", "punycodeDigit", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Punycode {
    private static final int BASE = 36;
    private static final int DAMP = 700;
    private static final int INITIAL_BIAS = 72;
    private static final int INITIAL_N = 128;

    @NotNull
    private static final n PREFIX;
    private static final int SKEW = 38;
    private static final int TMAX = 26;
    private static final int TMIN = 1;

    @NotNull
    public static final Punycode INSTANCE = new Punycode();

    @NotNull
    private static final String PREFIX_STRING = "xn--";

    static {
        n nVar = n.silver;
        PREFIX = d.oscar("xn--");
    }

    private Punycode() {
    }

    private final int adapt(int delta, int numpoints, boolean first) {
        int i4;
        if (first) {
            i4 = delta / DAMP;
        } else {
            i4 = delta / 2;
        }
        int i5 = (i4 / numpoints) + i4;
        int i10 = 0;
        while (i5 > 455) {
            i5 /= 35;
            i10 += 36;
        }
        return ((i5 * 36) / (i5 + 38)) + i10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [char] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v6, types: [int] */
    private final List<Integer> codePoints(String str, int i4, int i5) {
        char c3;
        ArrayList arrayList = new ArrayList();
        while (i4 < i5) {
            int charAt = str.charAt(i4);
            if (55296 <= charAt && charAt < 57344) {
                int i10 = i4 + 1;
                if (i10 < i5) {
                    c3 = str.charAt(i10);
                } else {
                    c3 = 0;
                }
                if (!Character.isLowSurrogate(charAt) && Character.isLowSurrogate(c3)) {
                    charAt = 65536 + (((charAt & 1023) << 10) | (c3 & 1023));
                    i4 = i10;
                } else {
                    charAt = 63;
                }
            }
            arrayList.add(Integer.valueOf(charAt));
            i4++;
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean decodeLabel(String string, int pos, int limit, k result) {
        int i4;
        boolean z2;
        int i5;
        int i10;
        int i11 = 1;
        if (!r.lima(pos, 0, 4, string, PREFIX_STRING, true)) {
            result.l(pos, limit, string);
            return true;
        }
        int i12 = pos + 4;
        ArrayList arrayList = new ArrayList();
        int ivory = StringsKt.ivory(string, NumberOnlyZipVisualTransformation.HYPHEN, limit, 4);
        char c3 = 'a';
        char c4 = 'A';
        char c10 = '0';
        if (ivory >= i12) {
            while (i12 < ivory) {
                int i13 = i12 + 1;
                char charAt = string.charAt(i12);
                if (('a' <= charAt && charAt < '{') || (('A' <= charAt && charAt < '[') || (('0' <= charAt && charAt < ':') || charAt == '-'))) {
                    arrayList.add(Integer.valueOf(charAt));
                    i12 = i13;
                } else {
                    return false;
                }
            }
            i12++;
        }
        int i14 = 128;
        int i15 = 72;
        int i16 = 0;
        loop1: while (i12 < limit) {
            int i17 = i11;
            C1713e golf = J4.golf(J4.hotel(36, LottieConstants.IterateForever), 36);
            int i18 = golf.alpha;
            int i19 = golf.purple;
            int i20 = golf.red;
            if ((i20 > 0 && i18 <= i19) || (i20 < 0 && i19 <= i18)) {
                i4 = i16;
                int i21 = i17;
                while (i12 != limit) {
                    int i22 = i12 + 1;
                    char charAt2 = string.charAt(i12);
                    if (c3 <= charAt2 && charAt2 < '{') {
                        i5 = charAt2 - 'a';
                    } else if (c4 <= charAt2 && charAt2 < '[') {
                        i5 = charAt2 - 'A';
                    } else {
                        if (c10 > charAt2 || charAt2 >= ':') {
                            break loop1;
                        }
                        i5 = charAt2 - 22;
                    }
                    int i23 = i21;
                    int i24 = i5 * i23;
                    int i25 = i4;
                    if (i25 > LottieConstants.IterateForever - i24) {
                        break loop1;
                    }
                    i4 = i25 + i24;
                    if (i18 <= i15) {
                        i10 = i17;
                    } else if (i18 >= i15 + 26) {
                        i10 = 26;
                    } else {
                        i10 = i18 - i15;
                    }
                    if (i5 >= i10) {
                        int i26 = 36 - i10;
                        if (i23 > LottieConstants.IterateForever / i26) {
                            break loop1;
                        }
                        i21 = i23 * i26;
                        if (i18 != i19) {
                            i18 += i20;
                            i12 = i22;
                            c3 = 'a';
                            c4 = 'A';
                            c10 = '0';
                        }
                    }
                    i12 = i22;
                }
                return false;
            }
            i4 = i16;
            int i27 = i4 - i16;
            int size = arrayList.size() + 1;
            if (i16 == 0) {
                z2 = i17;
            } else {
                z2 = false;
            }
            i15 = adapt(i27, size, z2);
            int size2 = i4 / (arrayList.size() + 1);
            if (i14 > LottieConstants.IterateForever - size2) {
                return false;
            }
            i14 += size2;
            int size3 = i4 % (arrayList.size() + 1);
            if (i14 > 1114111) {
                return false;
            }
            arrayList.add(size3, Integer.valueOf(i14));
            i16 = size3 + 1;
            i11 = i17;
            c3 = 'a';
            c4 = 'A';
            c10 = '0';
        }
        boolean z10 = i11;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            result.p(((Number) it.next()).intValue());
        }
        return z10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean encodeLabel(String string, int pos, int limit, k result) {
        int i4;
        int i5;
        int i10;
        boolean z2;
        int i11 = 1;
        if (!requiresEncode(string, pos, limit)) {
            result.l(pos, limit, string);
            return true;
        }
        result.navy(PREFIX);
        List<Integer> codePoints = codePoints(string, pos, limit);
        Iterator<Integer> it = codePoints.iterator();
        int i12 = 0;
        while (true) {
            i4 = 128;
            if (!it.hasNext()) {
                break;
            }
            int intValue = it.next().intValue();
            if (intValue < 128) {
                result.pink(intValue);
                i12++;
            }
        }
        if (i12 > 0) {
            result.pink(45);
        }
        int i13 = 72;
        int i14 = 0;
        int i15 = i12;
        while (i15 < codePoints.size()) {
            Iterator<T> it2 = codePoints.iterator();
            if (it2.hasNext()) {
                Object next = it2.next();
                if (it2.hasNext()) {
                    int intValue2 = ((Number) next).intValue();
                    if (intValue2 < i4) {
                        intValue2 = Integer.MAX_VALUE;
                    }
                    do {
                        Object next2 = it2.next();
                        int intValue3 = ((Number) next2).intValue();
                        if (intValue3 < i4) {
                            intValue3 = Integer.MAX_VALUE;
                        }
                        if (intValue2 > intValue3) {
                            next = next2;
                            intValue2 = intValue3;
                        }
                    } while (it2.hasNext());
                }
                int intValue4 = ((Number) next).intValue();
                int i16 = (i15 + 1) * (intValue4 - i4);
                if (i14 <= LottieConstants.IterateForever - i16) {
                    int i17 = i14 + i16;
                    Iterator<Integer> it3 = codePoints.iterator();
                    while (it3.hasNext()) {
                        int intValue5 = it3.next().intValue();
                        if (intValue5 < intValue4) {
                            if (i17 != Integer.MAX_VALUE) {
                                i17++;
                            }
                        } else if (intValue5 == intValue4) {
                            C1713e golf = J4.golf(J4.hotel(36, LottieConstants.IterateForever), 36);
                            int i18 = golf.alpha;
                            int i19 = golf.purple;
                            int i20 = golf.red;
                            if ((i20 > 0 && i18 <= i19) || (i20 < 0 && i19 <= i18)) {
                                i10 = i17;
                                while (true) {
                                    if (i18 <= i13) {
                                        i5 = i11;
                                    } else {
                                        i5 = i11;
                                        if (i18 >= i13 + 26) {
                                            i11 = 26;
                                        } else {
                                            i11 = i18 - i13;
                                        }
                                    }
                                    if (i10 < i11) {
                                        break;
                                    }
                                    int i21 = i10 - i11;
                                    int i22 = 36 - i11;
                                    result.pink(getPunycodeDigit((i21 % i22) + i11));
                                    i10 = i21 / i22;
                                    if (i18 == i19) {
                                        break;
                                    }
                                    i18 += i20;
                                    i11 = i5;
                                }
                            } else {
                                i5 = i11;
                                i10 = i17;
                            }
                            result.pink(getPunycodeDigit(i10));
                            int i23 = i15 + 1;
                            if (i15 == i12) {
                                z2 = i5;
                            } else {
                                z2 = false;
                            }
                            i13 = adapt(i17, i23, z2);
                            i15 = i23;
                            i17 = 0;
                            i11 = i5;
                        }
                    }
                    i14 = i17 + 1;
                    i4 = intValue4 + 1;
                }
                return false;
            }
            throw new NoSuchElementException();
        }
        return i11;
    }

    private final int getPunycodeDigit(int i4) {
        if (i4 < 26) {
            return i4 + 97;
        }
        if (i4 < 36) {
            return i4 + 22;
        }
        throw new IllegalStateException(("unexpected digit: " + i4).toString());
    }

    private final boolean requiresEncode(String str, int i4, int i5) {
        while (i4 < i5) {
            if (str.charAt(i4) >= 128) {
                return true;
            }
            i4++;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [Tf.k, java.lang.Object] */
    @Nullable
    public final String decode(@NotNull String string) {
        int emerald;
        Intrinsics.echo(string, "string");
        int length = string.length();
        ?? obj = new Object();
        for (int i4 = 0; i4 < length; i4 = emerald + 1) {
            emerald = StringsKt.emerald(string, '.', i4, 4);
            if (emerald == -1) {
                emerald = length;
            }
            if (!decodeLabel(string, i4, emerald, obj)) {
                return null;
            }
            if (emerald >= length) {
                break;
            }
            obj.pink(46);
        }
        return obj.green();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [Tf.k, java.lang.Object] */
    @Nullable
    public final String encode(@NotNull String string) {
        int emerald;
        Intrinsics.echo(string, "string");
        int length = string.length();
        ?? obj = new Object();
        for (int i4 = 0; i4 < length; i4 = emerald + 1) {
            emerald = StringsKt.emerald(string, '.', i4, 4);
            if (emerald == -1) {
                emerald = length;
            }
            if (!encodeLabel(string, i4, emerald, obj)) {
                return null;
            }
            if (emerald >= length) {
                break;
            }
            obj.pink(46);
        }
        return obj.green();
    }

    @NotNull
    public final n getPREFIX() {
        return PREFIX;
    }

    @NotNull
    public final String getPREFIX_STRING() {
        return PREFIX_STRING;
    }
}
