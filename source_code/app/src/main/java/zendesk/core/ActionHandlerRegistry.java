package zendesk.core;

import com.google.gson.q;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public interface ActionHandlerRegistry {
    void add(ActionHandler actionHandler);

    void clear();

    ActionHandler handlerByAction(String str);

    List<ActionHandler> handlersByAction(String str);

    void remove(ActionHandler actionHandler);

    void updateSettings(Map<String, q> map);
}
