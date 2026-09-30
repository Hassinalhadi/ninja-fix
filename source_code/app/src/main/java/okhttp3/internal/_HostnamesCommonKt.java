package okhttp3.internal;

import com.clevertap.android.sdk.Constants;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.r;
import okhttp3.internal.idn.IdnaMappingTableInstanceKt;
import okhttp3.internal.idn.Punycode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pe.AbstractC2327c;
import s6.J4;

@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\u001a\n\u0010\u0002\u001a\u00020\u0003*\u00020\u0004\u001a\f\u0010\u0005\u001a\u00020\u0003*\u00020\u0004H\u0000\u001a\f\u0010\u0006\u001a\u00020\u0003*\u00020\u0004H\u0000\u001a\"\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0000\u001a0\u0010\r\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000bH\u0000\u001a\u0010\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\bH\u0000\u001a\u0010\u0010\u0011\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\bH\u0000\u001a\u0010\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\bH\u0002\u001a\u0010\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\bH\u0000\u001a\u000e\u0010\u0014\u001a\u0004\u0018\u00010\u0004*\u00020\u0004H\u0000\u001a\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0016\u001a\u00020\u0004H\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"VERIFY_AS_IP_ADDRESS", "Lkotlin/text/Regex;", "canParseAsIpAddress", "", "", "containsInvalidLabelLengths", "containsInvalidHostnameAsciiCodes", "decodeIpv6", "", "input", Constants.INAPP_POSITION, "", Constants.KEY_LIMIT, "decodeIpv4Suffix", "address", "addressOffset", "inet6AddressToAscii", "canonicalizeInetAddress", "isMappedIpv4Address", "inet4AddressToAscii", "toCanonicalHost", "idnToAscii", "host", "okhttp"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class _HostnamesCommonKt {

    @NotNull
    private static final Regex VERIFY_AS_IP_ADDRESS = new Regex("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");

    public static final boolean canParseAsIpAddress(@NotNull String str) {
        Intrinsics.echo(str, "<this>");
        return VERIFY_AS_IP_ADDRESS.echo(str);
    }

    @NotNull
    public static final byte[] canonicalizeInetAddress(@NotNull byte[] address) {
        Intrinsics.echo(address, "address");
        if (isMappedIpv4Address(address)) {
            return ArraysKt.peach(address, J4.hotel(12, 16));
        }
        return address;
    }

    public static final boolean containsInvalidHostnameAsciiCodes(@NotNull String str) {
        Intrinsics.echo(str, "<this>");
        int length = str.length();
        for (int i4 = 0; i4 < length; i4++) {
            char charAt = str.charAt(i4);
            if (Intrinsics.golf(charAt, 31) <= 0 || Intrinsics.golf(charAt, 127) >= 0 || StringsKt.emerald(" #%/:?@[\\]", charAt, 0, 6) != -1) {
                return true;
            }
        }
        return false;
    }

    public static final boolean containsInvalidLabelLengths(@NotNull String str) {
        int i4;
        Intrinsics.echo(str, "<this>");
        int length = str.length();
        if (1 <= length && length < 254) {
            int i5 = 0;
            while (true) {
                int emerald = StringsKt.emerald(str, '.', i5, 4);
                if (emerald == -1) {
                    i4 = str.length() - i5;
                } else {
                    i4 = emerald - i5;
                }
                if (1 > i4 || i4 >= 64) {
                    break;
                }
                if (emerald == -1 || emerald == str.length() - 1) {
                    break;
                }
                i5 = emerald + 1;
            }
            return false;
        }
        return true;
    }

    public static final boolean decodeIpv4Suffix(@NotNull String input, int i4, int i5, @NotNull byte[] address, int i10) {
        Intrinsics.echo(input, "input");
        Intrinsics.echo(address, "address");
        int i11 = i10;
        while (i4 < i5) {
            if (i11 == address.length) {
                return false;
            }
            if (i11 != i10) {
                if (input.charAt(i4) != '.') {
                    return false;
                }
                i4++;
            }
            int i12 = i4;
            int i13 = 0;
            while (i12 < i5) {
                char charAt = input.charAt(i12);
                if (Intrinsics.golf(charAt, 48) < 0 || Intrinsics.golf(charAt, 57) > 0) {
                    break;
                }
                if ((i13 == 0 && i4 != i12) || (i13 = ((i13 * 10) + charAt) - 48) > 255) {
                    return false;
                }
                i12++;
            }
            if (i12 - i4 == 0) {
                return false;
            }
            address[i11] = (byte) i13;
            i11++;
            i4 = i12;
        }
        if (i11 != i10 + 4) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0052  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final byte[] decodeIpv6(@NotNull String input, int i4, int i5) {
        int i10;
        Intrinsics.echo(input, "input");
        byte[] bArr = new byte[16];
        int i11 = 0;
        int i12 = -1;
        int i13 = -1;
        while (true) {
            if (i4 >= i5) {
                break;
            }
            if (i11 != 16) {
                int i14 = i4 + 2;
                if (i14 <= i5 && r.papa(i4, input, "::", false)) {
                    if (i12 == -1) {
                        i11 += 2;
                        i12 = i11;
                        if (i14 == i5) {
                            break;
                        }
                        i13 = i14;
                        int i15 = 0;
                        i4 = i13;
                        while (i4 < i5) {
                        }
                        i10 = i4 - i13;
                        return i10 == 0 ? null : null;
                    }
                    return null;
                }
                if (i11 != 0) {
                    if (r.papa(i4, input, ":", false)) {
                        i4++;
                    } else if (r.papa(i4, input, ".", false) && decodeIpv4Suffix(input, i13, i5, bArr, i11 - 2)) {
                        i11 += 2;
                    } else {
                        return null;
                    }
                }
                i13 = i4;
                int i152 = 0;
                i4 = i13;
                while (i4 < i5) {
                    int parseHexDigit = _UtilCommonKt.parseHexDigit(input.charAt(i4));
                    if (parseHexDigit == -1) {
                        break;
                    }
                    i152 = (i152 << 4) + parseHexDigit;
                    i4++;
                }
                i10 = i4 - i13;
                if (i10 == 0 && i10 <= 4) {
                    int i16 = i11 + 1;
                    bArr[i11] = (byte) ((i152 >>> 8) & 255);
                    i11 += 2;
                    bArr[i16] = (byte) (i152 & 255);
                }
            } else {
                return null;
            }
        }
        if (i11 != 16) {
            if (i12 == -1) {
                return null;
            }
            ArraysKt.xray(16 - (i11 - i12), i12, i11, bArr, bArr);
            Arrays.fill(bArr, i12, (16 - i11) + i12, (byte) 0);
        }
        return bArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [Tf.k, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [Tf.l, Tf.k, java.lang.Object] */
    @Nullable
    public static final String idnToAscii(@NotNull String host) {
        Intrinsics.echo(host, "host");
        ?? obj = new Object();
        obj.n(host);
        ?? obj2 = new Object();
        while (!obj.hotel()) {
            if (!IdnaMappingTableInstanceKt.getIDNA_MAPPING_TABLE().map(obj.indigo(), obj2)) {
                return null;
            }
        }
        obj.n(_NormalizeJvmKt.normalizeNfc(obj2.green()));
        Punycode punycode = Punycode.INSTANCE;
        String decode = punycode.decode(obj.green());
        if (decode == null || !Intrinsics.areEqual(decode, _NormalizeJvmKt.normalizeNfc(decode))) {
            return null;
        }
        return punycode.encode(decode);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [Tf.k, java.lang.Object] */
    @NotNull
    public static final String inet4AddressToAscii(@NotNull byte[] address) {
        Intrinsics.echo(address, "address");
        if (address.length == 4) {
            ?? obj = new Object();
            obj.purple(_UtilCommonKt.and(address[0], 255));
            obj.pink(46);
            obj.purple(_UtilCommonKt.and(address[1], 255));
            obj.pink(46);
            obj.purple(_UtilCommonKt.and(address[2], 255));
            obj.pink(46);
            obj.purple(_UtilCommonKt.and(address[3], 255));
            return obj.green();
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [Tf.k, java.lang.Object] */
    @NotNull
    public static final String inet6AddressToAscii(@NotNull byte[] address) {
        Intrinsics.echo(address, "address");
        int i4 = -1;
        int i5 = 0;
        int i10 = 0;
        int i11 = 0;
        while (i10 < address.length) {
            int i12 = i10;
            while (i12 < 16 && address[i12] == 0 && address[i12 + 1] == 0) {
                i12 += 2;
            }
            int i13 = i12 - i10;
            if (i13 > i11 && i13 >= 4) {
                i4 = i10;
                i11 = i13;
            }
            i10 = i12 + 2;
        }
        ?? obj = new Object();
        while (i5 < address.length) {
            if (i5 == i4) {
                obj.pink(58);
                i5 += i11;
                if (i5 == 16) {
                    obj.pink(58);
                }
            } else {
                if (i5 > 0) {
                    obj.pink(58);
                }
                obj.silver((_UtilCommonKt.and(address[i5], 255) << 8) | _UtilCommonKt.and(address[i5 + 1], 255));
                i5 += 2;
            }
        }
        return obj.green();
    }

    private static final boolean isMappedIpv4Address(byte[] bArr) {
        if (bArr.length != 16) {
            return false;
        }
        for (int i4 = 0; i4 < 10; i4++) {
            if (bArr[i4] != 0) {
                return false;
            }
        }
        if (bArr[10] != -1 || bArr[11] != -1) {
            return false;
        }
        return true;
    }

    @Nullable
    public static final String toCanonicalHost(@NotNull String str) {
        byte[] decodeIpv6;
        Intrinsics.echo(str, "<this>");
        if (StringsKt.beige(str, ":", false)) {
            if (r.quebec(str, Constants.AES_PREFIX, false) && r.golf(str, Constants.AES_SUFFIX, false)) {
                decodeIpv6 = decodeIpv6(str, 1, str.length() - 1);
            } else {
                decodeIpv6 = decodeIpv6(str, 0, str.length());
            }
            if (decodeIpv6 != null) {
                byte[] canonicalizeInetAddress = canonicalizeInetAddress(decodeIpv6);
                if (canonicalizeInetAddress.length == 16) {
                    return inet6AddressToAscii(canonicalizeInetAddress);
                }
                if (canonicalizeInetAddress.length == 4) {
                    return inet4AddressToAscii(canonicalizeInetAddress);
                }
                throw new AssertionError(AbstractC2327c.victor('\'', "Invalid IPv6 address: '", str));
            }
        } else {
            String idnToAscii = idnToAscii(str);
            if (idnToAscii != null && idnToAscii.length() != 0 && !containsInvalidHostnameAsciiCodes(idnToAscii) && !containsInvalidLabelLengths(idnToAscii)) {
                return idnToAscii;
            }
        }
        return null;
    }
}
