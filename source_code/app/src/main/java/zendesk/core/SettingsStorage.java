package zendesk.core;

import com.google.gson.q;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public interface SettingsStorage {
    boolean areSettingsUpToDate(long j5, TimeUnit timeUnit);

    void clear();

    Map<String, q> getRawSettings();

    <E> E getSettings(String str, Class<E> cls);

    boolean hasStoredSettings();

    void storeRawSettings(Map<String, q> map);
}
