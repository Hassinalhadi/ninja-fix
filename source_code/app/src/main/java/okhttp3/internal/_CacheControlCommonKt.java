package okhttp3.internal;

import com.airbnb.lottie.compose.LottieConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.r;
import kotlin.time.b;
import kotlin.time.d;
import kotlin.time.g;
import okhttp3.CacheControl;
import okhttp3.Headers;
import org.jetbrains.annotations.NotNull;
import zendesk.support.GuideConstants;

@Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\f\u0010\u0003\u001a\u00020\u0004*\u00020\u0005H\u0000\u001a\f\u0010\u0006\u001a\u00020\u0002*\u00020\u0007H\u0000\u001a\f\u0010\b\u001a\u00020\u0002*\u00020\u0007H\u0000\u001a\f\u0010\t\u001a\u00020\u0002*\u00020\nH\u0000\u001a\f\u0010\u000b\u001a\u00020\n*\u00020\nH\u0000\u001a\f\u0010\f\u001a\u00020\n*\u00020\nH\u0000\u001a\f\u0010\r\u001a\u00020\n*\u00020\nH\u0000\u001a\f\u0010\u000e\u001a\u00020\n*\u00020\nH\u0000\u001a\f\u0010\u000f\u001a\u00020\n*\u00020\nH\u0000\u001a\u0014\u0010\u0010\u001a\u00020\u0002*\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0012H\u0000\u001a\u001e\u0010\u0013\u001a\u00020\u0004*\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u00012\b\b\u0002\u0010\u0015\u001a\u00020\u0004H\u0002¨\u0006\u0016"}, d2 = {"commonToString", "", "Lokhttp3/CacheControl;", "commonClampToInt", "", "", "commonForceNetwork", "Lokhttp3/CacheControl$Companion;", "commonForceCache", "commonBuild", "Lokhttp3/CacheControl$Builder;", "commonNoCache", "commonNoStore", "commonOnlyIfCached", "commonNoTransform", "commonImmutable", "commonParse", "headers", "Lokhttp3/Headers;", "indexOfElement", "characters", "startIndex", "okhttp"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class _CacheControlCommonKt {
    @NotNull
    public static final CacheControl commonBuild(@NotNull CacheControl.Builder builder) {
        Intrinsics.echo(builder, "<this>");
        return new CacheControl(builder.getNoCache(), builder.getNoStore(), builder.getMaxAgeSeconds(), -1, false, false, false, builder.getMaxStaleSeconds(), builder.getMinFreshSeconds(), builder.getOnlyIfCached(), builder.getNoTransform(), builder.getImmutable(), null);
    }

    public static final int commonClampToInt(long j5) {
        return j5 > 2147483647L ? LottieConstants.IterateForever : (int) j5;
    }

    @NotNull
    public static final CacheControl commonForceCache(@NotNull CacheControl.Companion companion) {
        Intrinsics.echo(companion, "<this>");
        CacheControl.Builder onlyIfCached = new CacheControl.Builder().onlyIfCached();
        int i4 = b.silver;
        return onlyIfCached.m234maxStaleLRDsOJo(g.papa(LottieConstants.IterateForever, d.teal)).build();
    }

    @NotNull
    public static final CacheControl commonForceNetwork(@NotNull CacheControl.Companion companion) {
        Intrinsics.echo(companion, "<this>");
        return new CacheControl.Builder().noCache().build();
    }

    @NotNull
    public static final CacheControl.Builder commonImmutable(@NotNull CacheControl.Builder builder) {
        Intrinsics.echo(builder, "<this>");
        builder.setImmutable$okhttp(true);
        return builder;
    }

    @NotNull
    public static final CacheControl.Builder commonNoCache(@NotNull CacheControl.Builder builder) {
        Intrinsics.echo(builder, "<this>");
        builder.setNoCache$okhttp(true);
        return builder;
    }

    @NotNull
    public static final CacheControl.Builder commonNoStore(@NotNull CacheControl.Builder builder) {
        Intrinsics.echo(builder, "<this>");
        builder.setNoStore$okhttp(true);
        return builder;
    }

    @NotNull
    public static final CacheControl.Builder commonNoTransform(@NotNull CacheControl.Builder builder) {
        Intrinsics.echo(builder, "<this>");
        builder.setNoTransform$okhttp(true);
        return builder;
    }

    @NotNull
    public static final CacheControl.Builder commonOnlyIfCached(@NotNull CacheControl.Builder builder) {
        Intrinsics.echo(builder, "<this>");
        builder.setOnlyIfCached$okhttp(true);
        return builder;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00d4  */
    @NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final CacheControl commonParse(@NotNull CacheControl.Companion companion, @NotNull Headers headers) {
        String str;
        int i4;
        int i5;
        int i10;
        String str2;
        Headers headers2 = headers;
        Intrinsics.echo(companion, "<this>");
        Intrinsics.echo(headers2, "headers");
        int size = headers2.size();
        boolean z2 = true;
        boolean z10 = true;
        int i11 = 0;
        String str3 = null;
        boolean z11 = false;
        boolean z12 = false;
        int i12 = -1;
        int i13 = -1;
        boolean z13 = false;
        boolean z14 = false;
        boolean z15 = false;
        int i14 = -1;
        int i15 = -1;
        boolean z16 = false;
        boolean z17 = false;
        boolean z18 = false;
        while (i11 < size) {
            String name = headers2.name(i11);
            String value = headers2.value(i11);
            if (r.hotel(name, GuideConstants.STANDARD_CACHING_HEADER, z2)) {
                if (str3 == null) {
                    str3 = value;
                    i4 = 0;
                    while (i4 < value.length()) {
                        int indexOfElement = indexOfElement(value, "=,;", i4);
                        String substring = value.substring(i4, indexOfElement);
                        boolean z19 = z2;
                        Intrinsics.delta(substring, "substring(...)");
                        String obj = StringsKt.b(substring).toString();
                        if (indexOfElement != value.length()) {
                            i5 = size;
                            if (value.charAt(indexOfElement) != ',' && value.charAt(indexOfElement) != ';') {
                                int indexOfNonWhitespace = _UtilCommonKt.indexOfNonWhitespace(value, indexOfElement + 1);
                                if (indexOfNonWhitespace < value.length() && value.charAt(indexOfNonWhitespace) == '\"') {
                                    int i16 = indexOfNonWhitespace + 1;
                                    int emerald = StringsKt.emerald(value, '\"', i16, 4);
                                    str2 = value.substring(i16, emerald);
                                    Intrinsics.delta(str2, "substring(...)");
                                    i10 = emerald + 1;
                                } else {
                                    i10 = indexOfElement(value, ",;", indexOfNonWhitespace);
                                    String substring2 = value.substring(indexOfNonWhitespace, i10);
                                    Intrinsics.delta(substring2, "substring(...)");
                                    str2 = StringsKt.b(substring2).toString();
                                }
                                if (!"no-cache".equalsIgnoreCase(obj)) {
                                    i4 = i10;
                                    z2 = z19;
                                    z11 = z2;
                                } else if ("no-store".equalsIgnoreCase(obj)) {
                                    i4 = i10;
                                    z2 = z19;
                                    z12 = z2;
                                } else {
                                    if ("max-age".equalsIgnoreCase(obj)) {
                                        i12 = _UtilCommonKt.toNonNegativeInt(str2, -1);
                                    } else if ("s-maxage".equalsIgnoreCase(obj)) {
                                        i13 = _UtilCommonKt.toNonNegativeInt(str2, -1);
                                    } else if ("private".equalsIgnoreCase(obj)) {
                                        i4 = i10;
                                        z2 = z19;
                                        z13 = z2;
                                    } else if ("public".equalsIgnoreCase(obj)) {
                                        i4 = i10;
                                        z2 = z19;
                                        z14 = z2;
                                    } else if ("must-revalidate".equalsIgnoreCase(obj)) {
                                        i4 = i10;
                                        z2 = z19;
                                        z15 = z2;
                                    } else if ("max-stale".equalsIgnoreCase(obj)) {
                                        i14 = _UtilCommonKt.toNonNegativeInt(str2, LottieConstants.IterateForever);
                                    } else if ("min-fresh".equalsIgnoreCase(obj)) {
                                        i15 = _UtilCommonKt.toNonNegativeInt(str2, -1);
                                    } else if ("only-if-cached".equalsIgnoreCase(obj)) {
                                        i4 = i10;
                                        z2 = z19;
                                        z16 = z2;
                                    } else if ("no-transform".equalsIgnoreCase(obj)) {
                                        i4 = i10;
                                        z2 = z19;
                                        z17 = z2;
                                    } else if ("immutable".equalsIgnoreCase(obj)) {
                                        i4 = i10;
                                        z2 = z19;
                                        z18 = z2;
                                    }
                                    i4 = i10;
                                    z2 = z19;
                                }
                                size = i5;
                            }
                        } else {
                            i5 = size;
                        }
                        i10 = indexOfElement + 1;
                        str2 = null;
                        if (!"no-cache".equalsIgnoreCase(obj)) {
                        }
                        size = i5;
                    }
                    i11++;
                    headers2 = headers;
                    z2 = z2;
                    size = size;
                }
            } else if (!r.hotel(name, "Pragma", z2)) {
                i11++;
                headers2 = headers;
                z2 = z2;
                size = size;
            }
            z10 = false;
            i4 = 0;
            while (i4 < value.length()) {
            }
            i11++;
            headers2 = headers;
            z2 = z2;
            size = size;
        }
        if (!z10) {
            str = null;
        } else {
            str = str3;
        }
        return new CacheControl(z11, z12, i12, i13, z13, z14, z15, i14, i15, z16, z17, z18, str);
    }

    @NotNull
    public static final String commonToString(@NotNull CacheControl cacheControl) {
        Intrinsics.echo(cacheControl, "<this>");
        String headerValue = cacheControl.getHeaderValue();
        if (headerValue == null) {
            StringBuilder sb2 = new StringBuilder();
            if (cacheControl.noCache()) {
                sb2.append("no-cache, ");
            }
            if (cacheControl.noStore()) {
                sb2.append("no-store, ");
            }
            if (cacheControl.maxAgeSeconds() != -1) {
                sb2.append("max-age=");
                sb2.append(cacheControl.maxAgeSeconds());
                sb2.append(", ");
            }
            if (cacheControl.sMaxAgeSeconds() != -1) {
                sb2.append("s-maxage=");
                sb2.append(cacheControl.sMaxAgeSeconds());
                sb2.append(", ");
            }
            if (cacheControl.getIsPrivate()) {
                sb2.append("private, ");
            }
            if (cacheControl.getIsPublic()) {
                sb2.append("public, ");
            }
            if (cacheControl.mustRevalidate()) {
                sb2.append("must-revalidate, ");
            }
            if (cacheControl.maxStaleSeconds() != -1) {
                sb2.append("max-stale=");
                sb2.append(cacheControl.maxStaleSeconds());
                sb2.append(", ");
            }
            if (cacheControl.minFreshSeconds() != -1) {
                sb2.append("min-fresh=");
                sb2.append(cacheControl.minFreshSeconds());
                sb2.append(", ");
            }
            if (cacheControl.onlyIfCached()) {
                sb2.append("only-if-cached, ");
            }
            if (cacheControl.noTransform()) {
                sb2.append("no-transform, ");
            }
            if (cacheControl.immutable()) {
                sb2.append("immutable, ");
            }
            if (sb2.length() == 0) {
                return "";
            }
            Intrinsics.delta(sb2.delete(sb2.length() - 2, sb2.length()), "delete(...)");
            String sb3 = sb2.toString();
            cacheControl.setHeaderValue$okhttp(sb3);
            return sb3;
        }
        return headerValue;
    }

    private static final int indexOfElement(String str, String str2, int i4) {
        int length = str.length();
        while (i4 < length) {
            if (StringsKt.black(str2, str.charAt(i4))) {
                return i4;
            }
            i4++;
        }
        return str.length();
    }

    public static /* synthetic */ int indexOfElement$default(String str, String str2, int i4, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            i4 = 0;
        }
        return indexOfElement(str, str2, i4);
    }
}
