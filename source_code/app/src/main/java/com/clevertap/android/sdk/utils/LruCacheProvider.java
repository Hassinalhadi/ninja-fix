package com.clevertap.android.sdk.utils;

import android.util.LruCache;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u0002H\u00070\u0005\"\b\b\u0000\u0010\u0007*\u00020\u00012\u0006\u0010\b\u001a\u00020\t¨\u0006\n"}, d2 = {"Lcom/clevertap/android/sdk/utils/LruCacheProvider;", "", "<init>", "()V", "provide", "Landroid/util/LruCache;", "", "T", "maxSize", "", "clevertap-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LruCacheProvider {

    @NotNull
    public static final LruCacheProvider INSTANCE = new LruCacheProvider();

    private LruCacheProvider() {
    }

    @NotNull
    public final <T> LruCache<String, T> provide(final int maxSize) {
        return new LruCache<String, T>(maxSize) { // from class: com.clevertap.android.sdk.utils.LruCacheProvider$provide$$inlined$lruCache$default$1
            @Override // android.util.LruCache
            @Nullable
            public T create(@NotNull String key) {
                return null;
            }

            @Override // android.util.LruCache
            public void entryRemoved(boolean evicted, @NotNull String key, @NotNull T oldValue, @Nullable T newValue) {
            }

            @Override // android.util.LruCache
            public int sizeOf(@NotNull String key, @NotNull T value) {
                return CacheKt.sizeInKb(value);
            }
        };
    }
}
