package zendesk.classic.messaging;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes.dex */
public enum EngineListRegistry {
    INSTANCE;

    private final Map<String, List<Engine>> enginesRegistry = new HashMap();

    EngineListRegistry() {
    }

    public String register(List<Engine> list) {
        String uuid = UUID.randomUUID().toString();
        this.enginesRegistry.put(uuid, list);
        return uuid;
    }

    public List<Engine> retrieveEngineList(String str) {
        return this.enginesRegistry.remove(str);
    }
}
