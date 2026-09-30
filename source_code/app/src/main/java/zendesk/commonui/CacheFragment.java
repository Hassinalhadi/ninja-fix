package zendesk.commonui;

import androidx.fragment.app.C0606a;
import androidx.fragment.app.L;
import androidx.fragment.app.ai;
import androidx.fragment.app.an;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class CacheFragment extends ai {
    private static final String TAG = "CacheFragment";
    private final Map<String, Object> cache = new HashMap();

    /* loaded from: classes.dex */
    public interface Supplier<T> {
        T get();
    }

    public static CacheFragment from(an anVar) {
        L supportFragmentManager = anVar.getSupportFragmentManager();
        ai blue = supportFragmentManager.blue(TAG);
        if (blue instanceof CacheFragment) {
            return (CacheFragment) blue;
        }
        CacheFragment cacheFragment = new CacheFragment();
        cacheFragment.setRetainInstance(true);
        C0606a c0606a = new C0606a(supportFragmentManager);
        c0606a.delta(0, cacheFragment, TAG, 1);
        c0606a.india();
        return cacheFragment;
    }

    public boolean contains(String str) {
        return this.cache.containsKey(str);
    }

    public <T> T get(String str) {
        try {
            return (T) this.cache.get(str);
        } catch (Exception unused) {
            return null;
        }
    }

    public <T> T getOrDefault(String str, Supplier<T> supplier) {
        T t5 = (T) get(str);
        if (t5 != null) {
            return t5;
        }
        T t10 = supplier.get();
        put(str, t10);
        return t10;
    }

    public <T> void put(String str, T t5) {
        this.cache.put(str, t5);
    }

    public void remove(String str) {
        this.cache.remove(str);
    }

    public <T> T getOrDefault(String str, T t5) {
        T t10 = (T) get(str);
        return t10 != null ? t10 : t5;
    }
}
