package okhttp3.internal.url;

import Tf.k;
import com.checkout.components.card.utils.constants.ExpiryDateConstantsKt;
import com.clevertap.android.sdk.Constants;
import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.a;
import okhttp3.internal._UtilCommonKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0010\u0019\n\u0002\b\u0011\u001a]\u0010\u000f\u001a\u00020\u000e*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00072\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001ac\u0010\u0011\u001a\u00020\u0001*\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00012\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u00072\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fH\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a3\u0010\u0014\u001a\u00020\u000e*\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001aW\u0010\u0016\u001a\u00020\u0001*\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00012\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001a1\u0010\u0018\u001a\u00020\u0001*\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a#\u0010\u001a\u001a\u00020\u0007*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u001a\u0010\u001b\"\u001a\u0010\u001d\u001a\u00020\u001c8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0014\u0010!\u001a\u00020\u00018\u0000X\u0080T¢\u0006\u0006\n\u0004\b!\u0010\"\"\u0014\u0010#\u001a\u00020\u00018\u0000X\u0080T¢\u0006\u0006\n\u0004\b#\u0010\"\"\u0014\u0010$\u001a\u00020\u00018\u0000X\u0080T¢\u0006\u0006\n\u0004\b$\u0010\"\"\u0014\u0010%\u001a\u00020\u00018\u0000X\u0080T¢\u0006\u0006\n\u0004\b%\u0010\"\"\u0014\u0010&\u001a\u00020\u00018\u0000X\u0080T¢\u0006\u0006\n\u0004\b&\u0010\"\"\u0014\u0010'\u001a\u00020\u00018\u0000X\u0080T¢\u0006\u0006\n\u0004\b'\u0010\"\"\u0014\u0010(\u001a\u00020\u00018\u0000X\u0080T¢\u0006\u0006\n\u0004\b(\u0010\"\"\u0014\u0010)\u001a\u00020\u00018\u0000X\u0080T¢\u0006\u0006\n\u0004\b)\u0010\"\"\u0014\u0010*\u001a\u00020\u00018\u0000X\u0080T¢\u0006\u0006\n\u0004\b*\u0010\"\"\u0014\u0010+\u001a\u00020\u00018\u0000X\u0080T¢\u0006\u0006\n\u0004\b+\u0010\"\"\u0014\u0010,\u001a\u00020\u00018\u0000X\u0080T¢\u0006\u0006\n\u0004\b,\u0010\"¨\u0006-"}, d2 = {"LTf/k;", "", "input", "", Constants.INAPP_POSITION, Constants.KEY_LIMIT, "encodeSet", "", "alreadyEncoded", "strict", "plusIsSpace", "unicodeAllowed", "Ljava/nio/charset/Charset;", "charset", "", "writeCanonicalized", "(LTf/k;Ljava/lang/String;IILjava/lang/String;ZZZZLjava/nio/charset/Charset;)V", "canonicalizeWithCharset", "(Ljava/lang/String;IILjava/lang/String;ZZZZLjava/nio/charset/Charset;)Ljava/lang/String;", "encoded", "writePercentDecoded", "(LTf/k;Ljava/lang/String;IIZ)V", "canonicalize", "(Ljava/lang/String;IILjava/lang/String;ZZZZ)Ljava/lang/String;", "percentDecode", "(Ljava/lang/String;IIZ)Ljava/lang/String;", "isPercentEncoded", "(Ljava/lang/String;II)Z", "", "HEX_DIGITS", "[C", "getHEX_DIGITS", "()[C", "USERNAME_ENCODE_SET", "Ljava/lang/String;", "PASSWORD_ENCODE_SET", "PATH_SEGMENT_ENCODE_SET", "PATH_SEGMENT_ENCODE_SET_URI", "QUERY_ENCODE_SET", "QUERY_COMPONENT_REENCODE_SET", "QUERY_COMPONENT_ENCODE_SET", "QUERY_COMPONENT_ENCODE_SET_URI", "FORM_ENCODE_SET", "FRAGMENT_ENCODE_SET", "FRAGMENT_ENCODE_SET_URI", "okhttp"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class _UrlKt {

    @NotNull
    public static final String FORM_ENCODE_SET = " !\"#$&'()+,/:;<=>?@[\\]^`{|}~";

    @NotNull
    public static final String FRAGMENT_ENCODE_SET = "";

    @NotNull
    public static final String FRAGMENT_ENCODE_SET_URI = " \"#<>\\^`{|}";

    @NotNull
    private static final char[] HEX_DIGITS = {'0', ExpiryDateConstantsKt.EXPIRY_DATE_ZERO_POSITION_CHECK, ExpiryDateConstantsKt.EXPIRY_DATE_VALID_TEEN_MONTH_SUFFIX_CHECK, '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    @NotNull
    public static final String PASSWORD_ENCODE_SET = " \"':;<=>@[]^`{}|/\\?#";

    @NotNull
    public static final String PATH_SEGMENT_ENCODE_SET = " \"<>^`{}|/\\?#";

    @NotNull
    public static final String PATH_SEGMENT_ENCODE_SET_URI = "[]";

    @NotNull
    public static final String QUERY_COMPONENT_ENCODE_SET = " !\"#$&'(),/:;<=>?@[]\\^`{|}~";

    @NotNull
    public static final String QUERY_COMPONENT_ENCODE_SET_URI = "\\^`{|}";

    @NotNull
    public static final String QUERY_COMPONENT_REENCODE_SET = " \"'<>#&=";

    @NotNull
    public static final String QUERY_ENCODE_SET = " \"'<>#";

    @NotNull
    public static final String USERNAME_ENCODE_SET = " \"':;<=>@[]^`{}|/\\?#";

    @NotNull
    public static final String canonicalize(@NotNull String str, int i4, int i5, @NotNull String encodeSet, boolean z2, boolean z10, boolean z11, boolean z12) {
        Intrinsics.echo(str, "<this>");
        Intrinsics.echo(encodeSet, "encodeSet");
        return canonicalizeWithCharset$default(str, i4, i5, encodeSet, z2, z10, z11, z12, null, 128, null);
    }

    public static /* synthetic */ String canonicalize$default(String str, int i4, int i5, String str2, boolean z2, boolean z10, boolean z11, boolean z12, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i4 = 0;
        }
        if ((i10 & 2) != 0) {
            i5 = str.length();
        }
        if ((i10 & 8) != 0) {
            z2 = false;
        }
        if ((i10 & 16) != 0) {
            z10 = false;
        }
        if ((i10 & 32) != 0) {
            z11 = false;
        }
        if ((i10 & 64) != 0) {
            z12 = false;
        }
        return canonicalize(str, i4, i5, str2, z2, z10, z11, z12);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [Tf.k, java.lang.Object] */
    @NotNull
    public static final String canonicalizeWithCharset(@NotNull String str, int i4, int i5, @NotNull String encodeSet, boolean z2, boolean z10, boolean z11, boolean z12, @Nullable Charset charset) {
        Intrinsics.echo(str, "<this>");
        Intrinsics.echo(encodeSet, "encodeSet");
        int i10 = i4;
        while (i10 < i5) {
            int codePointAt = str.codePointAt(i10);
            if (codePointAt >= 32 && codePointAt != 127 && ((codePointAt < 128 || z12) && !StringsKt.black(encodeSet, (char) codePointAt) && ((codePointAt != 37 || (z2 && (!z10 || isPercentEncoded(str, i10, i5)))) && (codePointAt != 43 || !z11)))) {
                i10 += Character.charCount(codePointAt);
            } else {
                ?? obj = new Object();
                obj.l(i4, i10, str);
                writeCanonicalized(obj, str, i10, i5, encodeSet, z2, z10, z11, z12, charset);
                return obj.green();
            }
        }
        String substring = str.substring(i4, i5);
        Intrinsics.delta(substring, "substring(...)");
        return substring;
    }

    public static /* synthetic */ String canonicalizeWithCharset$default(String str, int i4, int i5, String str2, boolean z2, boolean z10, boolean z11, boolean z12, Charset charset, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i4 = 0;
        }
        if ((i10 & 2) != 0) {
            i5 = str.length();
        }
        if ((i10 & 8) != 0) {
            z2 = false;
        }
        if ((i10 & 16) != 0) {
            z10 = false;
        }
        if ((i10 & 32) != 0) {
            z11 = false;
        }
        if ((i10 & 64) != 0) {
            z12 = false;
        }
        if ((i10 & 128) != 0) {
            charset = null;
        }
        return canonicalizeWithCharset(str, i4, i5, str2, z2, z10, z11, z12, charset);
    }

    @NotNull
    public static final char[] getHEX_DIGITS() {
        return HEX_DIGITS;
    }

    public static final boolean isPercentEncoded(@NotNull String str, int i4, int i5) {
        Intrinsics.echo(str, "<this>");
        int i10 = i4 + 2;
        if (i10 < i5 && str.charAt(i4) == '%' && _UtilCommonKt.parseHexDigit(str.charAt(i4 + 1)) != -1 && _UtilCommonKt.parseHexDigit(str.charAt(i10)) != -1) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [Tf.k, java.lang.Object] */
    @NotNull
    public static final String percentDecode(@NotNull String str, int i4, int i5, boolean z2) {
        Intrinsics.echo(str, "<this>");
        for (int i10 = i4; i10 < i5; i10++) {
            char charAt = str.charAt(i10);
            if (charAt == '%' || (charAt == '+' && z2)) {
                ?? obj = new Object();
                obj.l(i4, i10, str);
                writePercentDecoded(obj, str, i10, i5, z2);
                return obj.green();
            }
        }
        String substring = str.substring(i4, i5);
        Intrinsics.delta(substring, "substring(...)");
        return substring;
    }

    public static /* synthetic */ String percentDecode$default(String str, int i4, int i5, boolean z2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i4 = 0;
        }
        if ((i10 & 2) != 0) {
            i5 = str.length();
        }
        if ((i10 & 4) != 0) {
            z2 = false;
        }
        return percentDecode(str, i4, i5, z2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [Tf.k] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    public static final void writeCanonicalized(@NotNull k kVar, @NotNull String input, int i4, int i5, @NotNull String encodeSet, boolean z2, boolean z10, boolean z11, boolean z12, @Nullable Charset charset) {
        Intrinsics.echo(kVar, "<this>");
        Intrinsics.echo(input, "input");
        Intrinsics.echo(encodeSet, "encodeSet");
        ?? r02 = 0;
        while (i4 < i5) {
            int codePointAt = input.codePointAt(i4);
            if (!z2 || (codePointAt != 9 && codePointAt != 10 && codePointAt != 12 && codePointAt != 13)) {
                String str = "+";
                if (codePointAt == 32 && encodeSet == FORM_ENCODE_SET) {
                    kVar.n("+");
                } else if (codePointAt == 43 && z11) {
                    if (!z2) {
                        str = "%2B";
                    }
                    kVar.n(str);
                } else if (codePointAt >= 32 && codePointAt != 127 && ((codePointAt < 128 || z12) && !StringsKt.black(encodeSet, (char) codePointAt) && (codePointAt != 37 || (z2 && (!z10 || isPercentEncoded(input, i4, i5)))))) {
                    kVar.p(codePointAt);
                } else {
                    if (r02 == 0) {
                        r02 = new Object();
                    }
                    if (charset != null && !Intrinsics.areEqual(charset, a.alpha)) {
                        r02.j(input, i4, Character.charCount(codePointAt) + i4, charset);
                    } else {
                        r02.p(codePointAt);
                    }
                    while (!r02.hotel()) {
                        byte readByte = r02.readByte();
                        kVar.pink(37);
                        char[] cArr = HEX_DIGITS;
                        kVar.pink(cArr[((readByte & 255) >> 4) & 15]);
                        kVar.pink(cArr[readByte & 15]);
                    }
                }
            }
            i4 += Character.charCount(codePointAt);
            r02 = r02;
        }
    }

    public static final void writePercentDecoded(@NotNull k kVar, @NotNull String encoded, int i4, int i5, boolean z2) {
        int i10;
        Intrinsics.echo(kVar, "<this>");
        Intrinsics.echo(encoded, "encoded");
        while (i4 < i5) {
            int codePointAt = encoded.codePointAt(i4);
            if (codePointAt == 37 && (i10 = i4 + 2) < i5) {
                int parseHexDigit = _UtilCommonKt.parseHexDigit(encoded.charAt(i4 + 1));
                int parseHexDigit2 = _UtilCommonKt.parseHexDigit(encoded.charAt(i10));
                if (parseHexDigit != -1 && parseHexDigit2 != -1) {
                    kVar.pink((parseHexDigit << 4) + parseHexDigit2);
                    i4 = Character.charCount(codePointAt) + i10;
                }
                kVar.p(codePointAt);
                i4 += Character.charCount(codePointAt);
            } else {
                if (codePointAt == 43 && z2) {
                    kVar.pink(32);
                    i4++;
                }
                kVar.p(codePointAt);
                i4 += Character.charCount(codePointAt);
            }
        }
    }
}
