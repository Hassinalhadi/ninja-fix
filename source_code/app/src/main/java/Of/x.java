package Of;

import com.google.maps.android.BuildConfig;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

@Jf.e(with = y.class)
/* loaded from: classes2.dex */
public final class x extends ae {

    @NotNull
    public static final x INSTANCE = new Object();

    @Override // Of.ae
    public final String alpha() {
        return BuildConfig.TRAVIS;
    }

    @NotNull
    public final KSerializer serializer() {
        return y.alpha;
    }
}
