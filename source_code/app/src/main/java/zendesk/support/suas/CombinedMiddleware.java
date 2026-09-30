package zendesk.support.suas;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class CombinedMiddleware implements Middleware {
    private final Collection<Middleware> middleware;

    public CombinedMiddleware(Collection<Middleware> collection) {
        if (collection != null && collection.size() != 0) {
            this.middleware = collection;
        } else {
            this.middleware = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void loopThroughMiddleware(Action<?> action, final GetState getState, final Dispatcher dispatcher, final Continuation continuation, final Iterator<Middleware> it) {
        if (it.hasNext()) {
            it.next().onAction(action, getState, dispatcher, new Continuation() { // from class: zendesk.support.suas.CombinedMiddleware.1
                @Override // zendesk.support.suas.Continuation
                public void next(Action<?> action2) {
                    CombinedMiddleware.this.loopThroughMiddleware(action2, getState, dispatcher, continuation, it);
                }
            });
        } else {
            continuation.next(action);
        }
    }

    @Override // zendesk.support.suas.Middleware
    public void onAction(Action<?> action, GetState getState, Dispatcher dispatcher, Continuation continuation) {
        Collection<Middleware> collection = this.middleware;
        if (collection != null) {
            loopThroughMiddleware(action, getState, dispatcher, continuation, collection.iterator());
        } else {
            continuation.next(action);
        }
    }
}
