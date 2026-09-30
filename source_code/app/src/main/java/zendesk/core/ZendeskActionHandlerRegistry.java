package zendesk.core;

import com.google.gson.q;
import com.zendesk.func.ZFunc1;
import com.zendesk.util.CollectionUtils;
import com.zendesk.util.StringUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
class ZendeskActionHandlerRegistry implements ActionHandlerRegistry {
    private static final Comparator<ActionHandler> PRIORITY_ACTION_HANDLER_COMPARATOR = new Comparator<ActionHandler>() { // from class: zendesk.core.ZendeskActionHandlerRegistry.2
        @Override // java.util.Comparator
        public int compare(ActionHandler actionHandler, ActionHandler actionHandler2) {
            return actionHandler2.getPriority() - actionHandler.getPriority();
        }
    };
    private List<ActionHandler> registry = new ArrayList();

    @Override // zendesk.core.ActionHandlerRegistry
    public void add(ActionHandler actionHandler) {
        if (actionHandler == null) {
            return;
        }
        this.registry.add(actionHandler);
    }

    @Override // zendesk.core.ActionHandlerRegistry
    public void clear() {
        this.registry.clear();
    }

    @Override // zendesk.core.ActionHandlerRegistry
    public ActionHandler handlerByAction(String str) {
        if (StringUtils.isEmpty(str)) {
            return null;
        }
        ArrayList arrayList = new ArrayList(this.registry);
        Collections.sort(arrayList, PRIORITY_ACTION_HANDLER_COMPARATOR);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ActionHandler actionHandler = (ActionHandler) it.next();
            if (actionHandler.canHandle(str)) {
                return actionHandler;
            }
        }
        return null;
    }

    @Override // zendesk.core.ActionHandlerRegistry
    public List<ActionHandler> handlersByAction(final String str) {
        if (StringUtils.isEmpty(str)) {
            return Collections.EMPTY_LIST;
        }
        List<ActionHandler> filter = CollectionUtils.filter(this.registry, new ZFunc1<ActionHandler, Boolean>() { // from class: zendesk.core.ZendeskActionHandlerRegistry.1
            @Override // com.zendesk.func.ZFunc1
            public Boolean apply(ActionHandler actionHandler) {
                return Boolean.valueOf(actionHandler.canHandle(str));
            }
        });
        Collections.sort(filter, PRIORITY_ACTION_HANDLER_COMPARATOR);
        return filter;
    }

    @Override // zendesk.core.ActionHandlerRegistry
    public void remove(ActionHandler actionHandler) {
        if (actionHandler == null) {
            return;
        }
        this.registry.remove(actionHandler);
    }

    @Override // zendesk.core.ActionHandlerRegistry
    public void updateSettings(Map<String, q> map) {
        for (ActionHandler actionHandler : this.registry) {
            if (actionHandler != null) {
                actionHandler.updateSettings(map);
            }
        }
    }
}
