package zendesk.core;

import android.util.LruCache;

/* loaded from: classes.dex */
class ZendeskLruMemoryCache implements MemoryCache {
    public final LruCache<String, Object> cache;

    public ZendeskLruMemoryCache() {
        this(new LruCache(50));
    }

    @Override // zendesk.core.MemoryCache
    public void clear() {
        this.cache.evictAll();
    }

    @Override // zendesk.core.MemoryCache
    public boolean contains(String str) {
        boolean z2;
        synchronized (this) {
            if (this.cache.get(str) != null) {
                z2 = true;
            } else {
                z2 = false;
            }
        }
        return z2;
    }

    @Override // zendesk.core.MemoryCache
    public <T> T get(String str) {
        T t5;
        synchronized (this) {
            t5 = (T) this.cache.get(str);
        }
        return t5;
    }

    @Override // zendesk.core.MemoryCache
    public <T> T getOrDefault(String str, T t5) {
        T t10 = (T) get(str);
        if (t10 != null) {
            return t10;
        }
        return t5;
    }

    @Override // zendesk.core.MemoryCache
    public void put(String str, Object obj) {
        synchronized (this) {
            this.cache.put(str, obj);
        }
    }

    @Override // zendesk.core.MemoryCache
    public void remove(String str) {
        synchronized (this) {
            this.cache.remove(str);
        }
    }

    public ZendeskLruMemoryCache(LruCache<String, Object> lruCache) {
        this.cache = lruCache;
    }
}
