package com.clevertap.android.sdk.utils;

import android.util.LruCache;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \u0015*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0002:\u0001\u0015B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00028\u0000¢\u0006\u0002\u0010\u000eJ\u0015\u0010\u000f\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\u0010J\u0015\u0010\u0011\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\u0010J\u0006\u0010\u0012\u001a\u00020\u0013J\u0006\u0010\u0014\u001a\u00020\nR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/clevertap/android/sdk/utils/InMemoryLruCache;", "T", "", "maxSize", "", "memoryCache", "Lcom/clevertap/android/sdk/utils/CacheMethods;", "<init>", "(ILcom/clevertap/android/sdk/utils/CacheMethods;)V", "add", "", Constants.KEY_KEY, "", "value", "(Ljava/lang/String;Ljava/lang/Object;)Z", "get", "(Ljava/lang/String;)Ljava/lang/Object;", "remove", "empty", "", "isEmpty", "Companion", "clevertap-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class InMemoryLruCache<T> {

    @NotNull
    public static final String TYPE_LRU = "TYPE_LRU";
    private final int maxSize;

    @NotNull
    private final CacheMethods<T> memoryCache;

    public InMemoryLruCache(int i4, @NotNull CacheMethods<T> memoryCache) {
        Intrinsics.echo(memoryCache, "memoryCache");
        this.maxSize = i4;
        this.memoryCache = memoryCache;
    }

    public final boolean add(@NotNull String key, @NotNull T value) {
        Intrinsics.echo(key, "key");
        Intrinsics.echo(value, "value");
        if (CacheKt.sizeInKb(value) > this.maxSize) {
            remove(key);
            return false;
        }
        this.memoryCache.add(key, value);
        return true;
    }

    public final void empty() {
        this.memoryCache.empty();
    }

    @Nullable
    public final T get(@NotNull String key) {
        Intrinsics.echo(key, "key");
        return this.memoryCache.get(key);
    }

    public final boolean isEmpty() {
        return this.memoryCache.isEmpty();
    }

    @Nullable
    public final T remove(@NotNull String key) {
        Intrinsics.echo(key, "key");
        return this.memoryCache.remove(key);
    }

    public /* synthetic */ InMemoryLruCache(int i4, CacheMethods cacheMethods, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(i4, (i5 & 2) != 0 ? new CacheMethods<T>(i4) { // from class: com.clevertap.android.sdk.utils.InMemoryLruCache.1
            private final LruCache<String, T> lru;

            {
                this.lru = LruCacheProvider.INSTANCE.provide(i4);
            }

            @Override // com.clevertap.android.sdk.utils.CacheMethods
            public boolean add(String key, T value) {
                Intrinsics.echo(key, "key");
                Intrinsics.echo(value, "value");
                this.lru.put(key, value);
                return true;
            }

            @Override // com.clevertap.android.sdk.utils.CacheMethods
            public void empty() {
                this.lru.evictAll();
            }

            @Override // com.clevertap.android.sdk.utils.CacheMethods
            public T get(String key) {
                Intrinsics.echo(key, "key");
                return this.lru.get(key);
            }

            public final LruCache<String, T> getLru() {
                return this.lru;
            }

            @Override // com.clevertap.android.sdk.utils.CacheMethods
            public boolean isEmpty() {
                if (this.lru.size() == 0) {
                    return true;
                }
                return false;
            }

            @Override // com.clevertap.android.sdk.utils.CacheMethods
            public T remove(String key) {
                Intrinsics.echo(key, "key");
                return this.lru.remove(key);
            }
        } : cacheMethods);
    }
}
