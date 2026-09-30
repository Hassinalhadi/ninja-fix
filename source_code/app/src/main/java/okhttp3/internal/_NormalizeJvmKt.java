package okhttp3.internal;

import com.clevertap.android.sdk.variables.CTVariableUtils;
import java.text.Normalizer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¨\u0006\u0003"}, d2 = {"normalizeNfc", "", CTVariableUtils.STRING, "okhttp"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class _NormalizeJvmKt {
    @NotNull
    public static final String normalizeNfc(@NotNull String string) {
        Intrinsics.echo(string, "string");
        String normalize = Normalizer.normalize(string, Normalizer.Form.NFC);
        Intrinsics.delta(normalize, "normalize(...)");
        return normalize;
    }
}
