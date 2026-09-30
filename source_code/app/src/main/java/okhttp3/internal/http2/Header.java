package okhttp3.internal.http2;

import Tf.n;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\bB\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ$\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0018R\u0014\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Lokhttp3/internal/http2/Header;", "", "LTf/n;", "name", "value", "<init>", "(LTf/n;LTf/n;)V", "", "(Ljava/lang/String;Ljava/lang/String;)V", "(LTf/n;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "component1", "()LTf/n;", "component2", Constants.COPY_TYPE, "(LTf/n;LTf/n;)Lokhttp3/internal/http2/Header;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "LTf/n;", "hpackSize", "I", "Companion", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class Header {

    @NotNull
    public static final n PSEUDO_PREFIX;

    @NotNull
    public static final n RESPONSE_STATUS;

    @NotNull
    public static final String RESPONSE_STATUS_UTF8 = ":status";

    @NotNull
    public static final n TARGET_AUTHORITY;

    @NotNull
    public static final String TARGET_AUTHORITY_UTF8 = ":authority";

    @NotNull
    public static final n TARGET_METHOD;

    @NotNull
    public static final String TARGET_METHOD_UTF8 = ":method";

    @NotNull
    public static final n TARGET_PATH;

    @NotNull
    public static final String TARGET_PATH_UTF8 = ":path";

    @NotNull
    public static final n TARGET_SCHEME;

    @NotNull
    public static final String TARGET_SCHEME_UTF8 = ":scheme";
    public final int hpackSize;

    @NotNull
    public final n name;

    @NotNull
    public final n value;

    static {
        n nVar = n.silver;
        PSEUDO_PREFIX = g8.d.oscar(":");
        RESPONSE_STATUS = g8.d.oscar(RESPONSE_STATUS_UTF8);
        TARGET_METHOD = g8.d.oscar(TARGET_METHOD_UTF8);
        TARGET_PATH = g8.d.oscar(TARGET_PATH_UTF8);
        TARGET_SCHEME = g8.d.oscar(TARGET_SCHEME_UTF8);
        TARGET_AUTHORITY = g8.d.oscar(TARGET_AUTHORITY_UTF8);
    }

    public Header(@NotNull n name, @NotNull n value) {
        Intrinsics.echo(name, "name");
        Intrinsics.echo(value, "value");
        this.name = name;
        this.value = value;
        this.hpackSize = value.delta() + name.delta() + 32;
    }

    public static /* synthetic */ Header copy$default(Header header, n nVar, n nVar2, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            nVar = header.name;
        }
        if ((i4 & 2) != 0) {
            nVar2 = header.value;
        }
        return header.copy(nVar, nVar2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final n getName() {
        return this.name;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final n getValue() {
        return this.value;
    }

    @NotNull
    public final Header copy(@NotNull n name, @NotNull n value) {
        Intrinsics.echo(name, "name");
        Intrinsics.echo(value, "value");
        return new Header(name, value);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Header)) {
            return false;
        }
        Header header = (Header) other;
        return Intrinsics.areEqual(this.name, header.name) && Intrinsics.areEqual(this.value, header.value);
    }

    public int hashCode() {
        return this.value.hashCode() + (this.name.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return this.name.romeo() + ": " + this.value.romeo();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Header(@NotNull String name, @NotNull String value) {
        this(g8.d.oscar(name), g8.d.oscar(value));
        Intrinsics.echo(name, "name");
        Intrinsics.echo(value, "value");
        n nVar = n.silver;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Header(@NotNull n name, @NotNull String value) {
        this(name, g8.d.oscar(value));
        Intrinsics.echo(name, "name");
        Intrinsics.echo(value, "value");
        n nVar = n.silver;
    }
}
