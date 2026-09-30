package zendesk.classic.messaging;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import zendesk.classic.messaging.Engine;

/* loaded from: classes.dex */
public abstract class ObservableEngine implements Engine {
    private final Set<Engine.UpdateObserver> updateObservers = new HashSet();

    @Override // zendesk.classic.messaging.Engine
    public boolean isConversationOngoing() {
        return false;
    }

    @Override // zendesk.classic.messaging.Engine
    public void notifyObservers(Update update) {
        Iterator<Engine.UpdateObserver> it = this.updateObservers.iterator();
        while (it.hasNext()) {
            it.next().update(update);
        }
    }

    @Override // zendesk.classic.messaging.Engine
    public boolean registerObserver(Engine.UpdateObserver updateObserver) {
        return this.updateObservers.add(updateObserver);
    }

    @Override // zendesk.classic.messaging.Engine
    public boolean unregisterObserver(Engine.UpdateObserver updateObserver) {
        return this.updateObservers.remove(updateObserver);
    }

    @Override // zendesk.classic.messaging.Engine
    public void isConversationOngoing(Engine.ConversationOnGoingCallback conversationOnGoingCallback) {
        conversationOnGoingCallback.onConversationOngoing(this, false);
    }
}
