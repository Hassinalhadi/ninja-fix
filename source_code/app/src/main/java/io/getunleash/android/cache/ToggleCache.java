package io.getunleash.android.cache;

import com.clevertap.android.sdk.Constants;
import io.getunleash.android.data.Toggle;
import io.getunleash.android.data.UnleashState;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H&J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0007\u001a\u00020\u0004H&J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH&¨\u0006\fÀ\u0006\u0003"}, d2 = {"Lio/getunleash/android/cache/ToggleCache;", "", "read", "", "", "Lio/getunleash/android/data/Toggle;", "get", Constants.KEY_KEY, "write", "", "state", "Lio/getunleash/android/data/UnleashState;", "unleashandroidsdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface ToggleCache {
    @Nullable
    Toggle get(@NotNull String key);

    @NotNull
    Map<String, Toggle> read();

    void write(@NotNull UnleashState state);
}
