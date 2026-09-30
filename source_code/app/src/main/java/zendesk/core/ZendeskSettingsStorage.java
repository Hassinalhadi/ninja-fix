package zendesk.core;

import com.google.gson.q;
import com.zendesk.util.StringUtils;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
class ZendeskSettingsStorage implements SettingsStorage {
    private static final String LAST_UPDATE = "last_settings_update";
    private static final String RAWSETTTINGS_KEYSET = "rawsettings_keyset";
    private final BaseStorage settingsStorage;

    public ZendeskSettingsStorage(BaseStorage baseStorage) {
        this.settingsStorage = baseStorage;
    }

    @Override // zendesk.core.SettingsStorage
    public boolean areSettingsUpToDate(long j5, TimeUnit timeUnit) {
        Long l10;
        synchronized (this.settingsStorage) {
            l10 = (Long) this.settingsStorage.get(LAST_UPDATE, Long.class);
        }
        if (l10 != null && l10.longValue() != -1) {
            if (System.currentTimeMillis() - l10.longValue() < TimeUnit.MILLISECONDS.convert(j5, timeUnit)) {
                return true;
            }
        }
        return false;
    }

    @Override // zendesk.core.SettingsStorage
    public void clear() {
        synchronized (this.settingsStorage) {
            this.settingsStorage.clear();
        }
    }

    @Override // zendesk.core.SettingsStorage
    public Map<String, q> getRawSettings() {
        HashMap hashMap;
        synchronized (this.settingsStorage) {
            try {
                hashMap = new HashMap();
                Set<String> set = (Set) this.settingsStorage.get(RAWSETTTINGS_KEYSET, Set.class);
                if (set != null) {
                    for (String str : set) {
                        if (str != null) {
                            hashMap.put(str, (q) this.settingsStorage.get(str, q.class));
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return hashMap;
    }

    @Override // zendesk.core.SettingsStorage
    public <E> E getSettings(String str, Class<E> cls) {
        E e;
        synchronized (this.settingsStorage) {
            e = (E) this.settingsStorage.get(str, cls);
        }
        return e;
    }

    @Override // zendesk.core.SettingsStorage
    public boolean hasStoredSettings() {
        boolean hasLength;
        synchronized (this.settingsStorage) {
            hasLength = StringUtils.hasLength(this.settingsStorage.get(LAST_UPDATE));
        }
        return hasLength;
    }

    @Override // zendesk.core.SettingsStorage
    public void storeRawSettings(Map<String, q> map) {
        synchronized (this.settingsStorage) {
            try {
                this.settingsStorage.put(LAST_UPDATE, Long.valueOf(System.currentTimeMillis()));
                for (Map.Entry<String, q> entry : map.entrySet()) {
                    this.settingsStorage.put(entry.getKey(), entry.getValue());
                }
                this.settingsStorage.put(RAWSETTTINGS_KEYSET, map.keySet());
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
