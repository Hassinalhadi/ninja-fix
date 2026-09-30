package zendesk.core;

import android.content.SharedPreferences;
import com.zendesk.util.StringUtils;

/* loaded from: classes.dex */
class SharedPreferencesStorage implements BaseStorage {
    private final Serializer serializer;
    private final SharedPreferences sharedPreferences;

    public SharedPreferencesStorage(SharedPreferences sharedPreferences, Serializer serializer) {
        this.sharedPreferences = sharedPreferences;
        this.serializer = serializer;
    }

    @Override // zendesk.core.BaseStorage
    public void clear() {
        this.sharedPreferences.edit().clear().apply();
    }

    @Override // zendesk.core.BaseStorage
    public String get(String str) {
        return this.sharedPreferences.getString(str, null);
    }

    public long getLong(String str) {
        return this.sharedPreferences.getLong(str, 0L);
    }

    @Override // zendesk.core.BaseStorage
    public void put(String str, String str2) {
        if (StringUtils.hasLength(str)) {
            this.sharedPreferences.edit().putString(str, str2).apply();
        }
    }

    @Override // zendesk.core.BaseStorage
    public void remove(String str) {
        if (StringUtils.hasLength(str)) {
            this.sharedPreferences.edit().remove(str).apply();
        }
    }

    @Override // zendesk.core.BaseStorage
    public <E> E get(String str, Class<E> cls) {
        return (E) this.serializer.deserialize(get(str), cls);
    }

    @Override // zendesk.core.BaseStorage
    public void put(String str, Object obj) {
        if (StringUtils.hasLength(str)) {
            put(str, obj != null ? this.serializer.serialize(obj) : null);
        }
    }
}
