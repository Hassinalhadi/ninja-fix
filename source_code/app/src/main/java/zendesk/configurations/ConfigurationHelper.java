package zendesk.configurations;

import android.content.Intent;
import android.os.Bundle;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class ConfigurationHelper {
    private static ConfigurationHelper INSTANCE = new ConfigurationHelper();
    static String ZENDESK_CONFIGURATION = "ZENDESK_CONFIGURATION";

    public static ConfigurationHelper get() {
        return INSTANCE;
    }

    public List<Configuration> addSelfIfNotInList(List<Configuration> list, Configuration configuration) {
        ArrayList arrayList = new ArrayList(list);
        if (findConfigForType(list, configuration.getClass()) == null) {
            arrayList.add(configuration);
        }
        return arrayList;
    }

    public void addToBundle(Bundle bundle, Configuration configuration) {
        bundle.putSerializable(ZENDESK_CONFIGURATION, configuration);
    }

    public void addToIntent(Intent intent, Configuration configuration) {
        intent.putExtra(ZENDESK_CONFIGURATION, configuration);
    }

    public void addToMap(Map<String, Object> map, Configuration configuration) {
        map.put(ZENDESK_CONFIGURATION, configuration);
    }

    public List<Configuration> extractConfigsFromMap(Map<String, Object> map) {
        Configuration fromMap = fromMap(map, Configuration.class);
        if (fromMap != null) {
            return fromMap.getConfigurations();
        }
        return null;
    }

    public <E extends Configuration> E findConfigForType(List<Configuration> list, Class<E> cls) {
        Iterator<Configuration> it = list.iterator();
        while (it.hasNext()) {
            E e = (E) it.next();
            if (cls.isInstance(e)) {
                return e;
            }
        }
        return null;
    }

    public <E extends Configuration> E fromBundle(Bundle bundle, Class<E> cls) {
        if (bundle != null && bundle.containsKey(ZENDESK_CONFIGURATION)) {
            Serializable serializable = bundle.getSerializable(ZENDESK_CONFIGURATION);
            if (cls.isInstance(serializable)) {
                return (E) serializable;
            }
            return null;
        }
        return null;
    }

    public <E extends Configuration> E fromMap(Map<String, Object> map, Class<E> cls) {
        if (map != null && map.containsKey(ZENDESK_CONFIGURATION)) {
            Object obj = map.get(ZENDESK_CONFIGURATION);
            if (cls.isInstance(obj)) {
                return (E) obj;
            }
            return null;
        }
        return null;
    }
}
