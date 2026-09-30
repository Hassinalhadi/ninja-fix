package okhttp3;

import M.l;
import androidx.appcompat.widget.P0;
import com.clevertap.android.sdk.Constants;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.c;
import kotlin.collections.aa;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.i;
import kotlin.text.k;
import kotlin.text.r;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pe.AbstractC2327c;
import s6.AbstractC2770s7;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB/\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0007J\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0011\u001a\u00020\u0003J\r\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0002\b\u0012J\r\u0010\u0005\u001a\u00020\u0003H\u0007¢\u0006\u0002\b\u0013J\b\u0010\u0014\u001a\u00020\u0003H\u0016J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u00020\u00038G¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u000bR\u0013\u0010\u0005\u001a\u00020\u00038G¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u000bR\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\f¨\u0006\u001b"}, d2 = {"Lokhttp3/MediaType;", "", "mediaType", "", Constants.KEY_TYPE, "subtype", "parameterNamesAndValues", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V", "getMediaType$okhttp", "()Ljava/lang/String;", "[Ljava/lang/String;", "charset", "Ljava/nio/charset/Charset;", "defaultValue", "parameter", "name", "-deprecated_type", "-deprecated_subtype", "toString", "equals", "", "other", "hashCode", "", "Companion", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MediaType {

    @NotNull
    private static final String QUOTED = "\"([^\"]*)\"";

    @NotNull
    private static final String TOKEN = "([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)";

    @NotNull
    private final String mediaType;

    @NotNull
    private final String[] parameterNamesAndValues;

    @NotNull
    private final String subtype;

    @NotNull
    private final String type;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Regex TYPE_SUBTYPE = new Regex("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");

    @NotNull
    private static final Regex PARAMETER = new Regex(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\n\u001a\u00020\u000b*\u00020\u0005H\u0007¢\u0006\u0002\b\fJ\u0013\u0010\r\u001a\u0004\u0018\u00010\u000b*\u00020\u0005H\u0007¢\u0006\u0002\b\u000eJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0005H\u0007¢\u0006\u0002\b\u0010J\u0017\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000f\u001a\u00020\u0005H\u0007¢\u0006\u0002\b\u0011R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lokhttp3/MediaType$Companion;", "", "<init>", "()V", "TOKEN", "", "QUOTED", "TYPE_SUBTYPE", "Lkotlin/text/Regex;", "PARAMETER", "toMediaType", "Lokhttp3/MediaType;", "get", "toMediaTypeOrNull", "parse", "mediaType", "-deprecated_get", "-deprecated_parse", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @c
        @NotNull
        /* renamed from: -deprecated_get, reason: not valid java name */
        public final MediaType m290deprecated_get(@NotNull String mediaType) {
            Intrinsics.echo(mediaType, "mediaType");
            return get(mediaType);
        }

        @c
        @Nullable
        /* renamed from: -deprecated_parse, reason: not valid java name */
        public final MediaType m291deprecated_parse(@NotNull String mediaType) {
            Intrinsics.echo(mediaType, "mediaType");
            return parse(mediaType);
        }

        @NotNull
        public final MediaType get(@NotNull String str) {
            String str2;
            Intrinsics.echo(str, "<this>");
            k charlie = MediaType.TYPE_SUBTYPE.charlie(0, str);
            if (charlie != null) {
                String str3 = (String) ((aa) charlie.getGroupValues()).get(1);
                Locale locale = Locale.ROOT;
                String lowerCase = str3.toLowerCase(locale);
                Intrinsics.delta(lowerCase, "toLowerCase(...)");
                String lowerCase2 = ((String) ((aa) charlie.getGroupValues()).get(2)).toLowerCase(locale);
                Intrinsics.delta(lowerCase2, "toLowerCase(...)");
                ArrayList arrayList = new ArrayList();
                int i4 = charlie.bravo().purple;
                while (true) {
                    int i5 = i4 + 1;
                    if (i5 < str.length()) {
                        k charlie2 = MediaType.PARAMETER.charlie(i5, str);
                        if (charlie2 != null) {
                            l lVar = charlie2.charlie;
                            i bravo = lVar.bravo(1);
                            String str4 = null;
                            if (bravo != null) {
                                str2 = bravo.alpha;
                            } else {
                                str2 = null;
                            }
                            if (str2 == null) {
                                i4 = charlie2.bravo().purple;
                            } else {
                                i bravo2 = lVar.bravo(2);
                                if (bravo2 != null) {
                                    str4 = bravo2.alpha;
                                }
                                if (str4 == null) {
                                    i bravo3 = lVar.bravo(3);
                                    Intrinsics.checkNotNull(bravo3);
                                    str4 = bravo3.alpha;
                                } else if (StringsKt.orange(str4, '\'') && StringsKt.coral(str4, '\'') && str4.length() > 2) {
                                    str4 = str4.substring(1, str4.length() - 1);
                                    Intrinsics.delta(str4, "substring(...)");
                                }
                                arrayList.add(str2);
                                arrayList.add(str4);
                                i4 = charlie2.bravo().purple;
                            }
                        } else {
                            StringBuilder sb2 = new StringBuilder("Parameter is not formatted correctly: \"");
                            String substring = str.substring(i5);
                            Intrinsics.delta(substring, "substring(...)");
                            sb2.append(substring);
                            sb2.append("\" for: \"");
                            throw new IllegalArgumentException(P0.fuchsia(sb2, str, '\"').toString());
                        }
                    } else {
                        return new MediaType(str, lowerCase, lowerCase2, (String[]) arrayList.toArray(new String[0]));
                    }
                }
            } else {
                throw new IllegalArgumentException(AbstractC2327c.victor('\"', "No subtype found for: \"", str));
            }
        }

        @Nullable
        public final MediaType parse(@NotNull String str) {
            Intrinsics.echo(str, "<this>");
            try {
                return get(str);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        private Companion() {
        }
    }

    public MediaType(@NotNull String mediaType, @NotNull String type, @NotNull String subtype, @NotNull String[] parameterNamesAndValues) {
        Intrinsics.echo(mediaType, "mediaType");
        Intrinsics.echo(type, "type");
        Intrinsics.echo(subtype, "subtype");
        Intrinsics.echo(parameterNamesAndValues, "parameterNamesAndValues");
        this.mediaType = mediaType;
        this.type = type;
        this.subtype = subtype;
        this.parameterNamesAndValues = parameterNamesAndValues;
    }

    public static /* synthetic */ Charset charset$default(MediaType mediaType, Charset charset, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            charset = null;
        }
        return mediaType.charset(charset);
    }

    @NotNull
    public static final MediaType get(@NotNull String str) {
        return INSTANCE.get(str);
    }

    @Nullable
    public static final MediaType parse(@NotNull String str) {
        return INSTANCE.parse(str);
    }

    @c
    @NotNull
    /* renamed from: -deprecated_subtype, reason: not valid java name and from getter */
    public final String getSubtype() {
        return this.subtype;
    }

    @c
    @NotNull
    /* renamed from: -deprecated_type, reason: not valid java name and from getter */
    public final String getType() {
        return this.type;
    }

    @Nullable
    public final Charset charset() {
        return charset$default(this, null, 1, null);
    }

    public boolean equals(@Nullable Object other) {
        if ((other instanceof MediaType) && Intrinsics.areEqual(((MediaType) other).mediaType, this.mediaType)) {
            return true;
        }
        return false;
    }

    @NotNull
    /* renamed from: getMediaType$okhttp, reason: from getter */
    public final String getMediaType() {
        return this.mediaType;
    }

    public int hashCode() {
        return this.mediaType.hashCode();
    }

    @Nullable
    public final String parameter(@NotNull String name) {
        Intrinsics.echo(name, "name");
        int i4 = 0;
        int alpha = AbstractC2770s7.alpha(0, this.parameterNamesAndValues.length - 1, 2);
        if (alpha >= 0) {
            while (!r.hotel(this.parameterNamesAndValues[i4], name, true)) {
                if (i4 != alpha) {
                    i4 += 2;
                } else {
                    return null;
                }
            }
            return this.parameterNamesAndValues[i4 + 1];
        }
        return null;
    }

    @NotNull
    public final String subtype() {
        return this.subtype;
    }

    @NotNull
    public String toString() {
        return this.mediaType;
    }

    @NotNull
    public final String type() {
        return this.type;
    }

    @Nullable
    public final Charset charset(@Nullable Charset defaultValue) {
        String parameter = parameter("charset");
        if (parameter != null) {
            try {
            } catch (IllegalArgumentException unused) {
                return defaultValue;
            }
        }
        return Charset.forName(parameter);
    }
}
