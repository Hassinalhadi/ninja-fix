package zendesk.configurations;

import android.content.Intent;
import android.os.Bundle;
import java.util.List;
import java.util.Map;

@Deprecated
/* loaded from: classes.dex */
public class ConfigurationUtil {
    private static ConfigurationHelper helper = new ConfigurationHelper();

    private ConfigurationUtil() {
    }

    public static List<Configuration> addSelfIfNotInList(List<Configuration> list, Configuration configuration) {
        return helper.addSelfIfNotInList(list, configuration);
    }

    public static void addToBundle(Bundle bundle, Configuration configuration) {
        helper.addToBundle(bundle, configuration);
    }

    public static void addToIntent(Intent intent, Configuration configuration) {
        helper.addToIntent(intent, configuration);
    }

    public static void addToMap(Map<String, Object> map, Configuration configuration) {
        helper.addToMap(map, configuration);
    }

    public static List<Configuration> extractConfigsFromMap(Map<String, Object> map) {
        return helper.extractConfigsFromMap(map);
    }

    public static <E extends Configuration> E findConfigForType(List<Configuration> list, Class<E> cls) {
        return (E) helper.findConfigForType(list, cls);
    }

    public static <E extends Configuration> E fromBundle(Bundle bundle, Class<E> cls) {
        return (E) helper.fromBundle(bundle, cls);
    }

    public static <E extends Configuration> E fromMap(Map<String, Object> map, Class<E> cls) {
        return (E) helper.fromMap(map, cls);
    }
}
