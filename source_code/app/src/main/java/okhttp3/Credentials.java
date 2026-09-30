package okhttp3;

import Tf.n;
import av.q;
import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\tH\u0007¨\u0006\n"}, d2 = {"Lokhttp3/Credentials;", "", "<init>", "()V", "basic", "", "username", "password", "charset", "Ljava/nio/charset/Charset;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Credentials {

    @NotNull
    public static final Credentials INSTANCE = new Credentials();

    private Credentials() {
    }

    @NotNull
    public static final String basic(@NotNull String username, @NotNull String password) {
        Intrinsics.echo(username, "username");
        Intrinsics.echo(password, "password");
        return basic$default(username, password, null, 4, null);
    }

    public static /* synthetic */ String basic$default(String str, String str2, Charset charset, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            charset = kotlin.text.a.delta;
        }
        return basic(str, str2, charset);
    }

    @NotNull
    public static final String basic(@NotNull String username, @NotNull String password, @NotNull Charset charset) {
        Intrinsics.echo(username, "username");
        Intrinsics.echo(password, "password");
        Intrinsics.echo(charset, "charset");
        String str = username + ':' + password;
        n nVar = n.silver;
        Intrinsics.echo(str, "<this>");
        byte[] bytes = str.getBytes(charset);
        Intrinsics.delta(bytes, "getBytes(...)");
        return q.echo("Basic ", new n(bytes).alpha());
    }
}
