package zendesk.support.suas;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import zendesk.support.suas.CombinedReducer;
import zendesk.support.suas.Listeners;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class SuasStore implements Store {
    private final Filter defaultFilter;
    private final Executor executor;
    private final CombinedMiddleware middleware;
    private final CombinedReducer reducer;
    private State state;
    private final AtomicBoolean isReducing = new AtomicBoolean(false);
    private final Set<Listener<Action<?>>> actionListener = Collections.synchronizedSet(new HashSet());
    private final Map<Listener, Listeners.StateListener> listenerStateListenerMap = new ConcurrentHashMap();

    /* loaded from: classes.dex */
    public class ActionListenerSubscription implements Subscription {
        private final Listener<Action<?>> listener;

        public /* synthetic */ ActionListenerSubscription(SuasStore suasStore, Listener listener, int i4) {
            this(listener);
        }

        @Override // zendesk.support.suas.Subscription
        public void addListener() {
            SuasStore.this.actionListener.add(this.listener);
        }

        @Override // zendesk.support.suas.Subscription
        public void informWithCurrentState() {
        }

        @Override // zendesk.support.suas.Subscription
        public void removeListener() {
            SuasStore.this.removeListener(this.listener);
        }

        private ActionListenerSubscription(Listener<Action<?>> listener) {
            this.listener = listener;
        }
    }

    /* loaded from: classes.dex */
    public class DefaultSubscription implements Subscription {
        private final Listener listener;
        private final Listeners.StateListener stateListener;

        public DefaultSubscription(Listeners.StateListener stateListener, Listener listener) {
            this.stateListener = stateListener;
            this.listener = listener;
        }

        @Override // zendesk.support.suas.Subscription
        public void addListener() {
            SuasStore.this.listenerStateListenerMap.put(this.listener, this.stateListener);
        }

        @Override // zendesk.support.suas.Subscription
        public void informWithCurrentState() {
            this.stateListener.update(null, SuasStore.this.getState(), true);
        }

        @Override // zendesk.support.suas.Subscription
        public void removeListener() {
            SuasStore.this.removeListener(this.listener);
        }
    }

    public SuasStore(State state, CombinedReducer combinedReducer, CombinedMiddleware combinedMiddleware, Filter<Object> filter, Executor executor) {
        this.state = state;
        this.reducer = combinedReducer;
        this.middleware = combinedMiddleware;
        this.defaultFilter = filter;
        this.executor = executor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyActionListener(Action<?> action) {
        Iterator<Listener<Action<?>>> it = this.actionListener.iterator();
        while (it.hasNext()) {
            it.next().update(action);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyListener(State state, State state2, Collection<String> collection) {
        for (Listeners.StateListener stateListener : this.listenerStateListenerMap.values()) {
            if (stateListener.getStateKey() == null || collection.contains(stateListener.getStateKey())) {
                stateListener.update(state, state2, false);
            }
        }
    }

    private Subscription registerListener(Listener listener, Listeners.StateListener stateListener) {
        DefaultSubscription defaultSubscription = new DefaultSubscription(stateListener, listener);
        defaultSubscription.addListener();
        return defaultSubscription;
    }

    @Override // zendesk.support.suas.Store
    public Subscription addActionListener(Listener<Action<?>> listener) {
        ActionListenerSubscription actionListenerSubscription = new ActionListenerSubscription(this, listener, 0);
        actionListenerSubscription.addListener();
        return actionListenerSubscription;
    }

    @Override // zendesk.support.suas.Store
    public <E> Subscription addListener(String str, Listener<E> listener) {
        return registerListener(listener, Listeners.create(str, this.defaultFilter, listener));
    }

    @Override // zendesk.support.suas.Dispatcher
    public synchronized void dispatch(final Action action) {
        this.executor.execute(new Runnable() { // from class: zendesk.support.suas.SuasStore.1
            @Override // java.lang.Runnable
            public void run() {
                SuasStore.this.notifyActionListener(action);
                CombinedMiddleware combinedMiddleware = SuasStore.this.middleware;
                Action<?> action2 = action;
                SuasStore suasStore = SuasStore.this;
                combinedMiddleware.onAction(action2, suasStore, suasStore, new Continuation() { // from class: zendesk.support.suas.SuasStore.1.1
                    @Override // zendesk.support.suas.Continuation
                    public void next(Action<?> action3) {
                        if (SuasStore.this.isReducing.compareAndSet(false, true)) {
                            State state = SuasStore.this.getState();
                            CombinedReducer.ReduceResult reduce = SuasStore.this.reducer.reduce(SuasStore.this.getState(), action3);
                            SuasStore.this.state = reduce.getNewState();
                            SuasStore.this.isReducing.set(false);
                            SuasStore suasStore2 = SuasStore.this;
                            suasStore2.notifyListener(state, suasStore2.getState(), reduce.getUpdatedKeys());
                            return;
                        }
                        throw new RuntimeException("You must not dispatch actions in your reducer. Seriously. (╯°□°）╯︵ ┻━┻");
                    }
                });
            }
        });
    }

    @Override // zendesk.support.suas.GetState
    public State getState() {
        return this.state.copy();
    }

    @Override // zendesk.support.suas.Store
    public void removeListener(Listener listener) {
        this.listenerStateListenerMap.remove(listener);
        this.actionListener.remove(listener);
    }

    @Override // zendesk.support.suas.Store
    public void reset(State state) {
        State state2 = getState();
        State mergeStates = State.mergeStates(this.reducer.getEmptyState(), state);
        this.state = mergeStates;
        notifyListener(state2, mergeStates, this.reducer.getAllKeys());
    }

    @Override // zendesk.support.suas.Store
    public <E> Subscription addListener(String str, Filter<E> filter, Listener<E> listener) {
        return registerListener(listener, Listeners.create(str, filter, listener));
    }

    @Override // zendesk.support.suas.Store
    public <E> Subscription addListener(StateSelector<E> stateSelector, Listener<E> listener) {
        return registerListener(listener, Listeners.create(stateSelector, (Filter<State>) this.defaultFilter, listener));
    }

    @Override // zendesk.support.suas.Store
    public <E> Subscription addListener(Filter<State> filter, StateSelector<E> stateSelector, Listener<E> listener) {
        return registerListener(listener, Listeners.create(stateSelector, filter, listener));
    }

    @Override // zendesk.support.suas.Store
    public <E> Subscription addListener(Class<E> cls, Listener<E> listener) {
        return registerListener(listener, Listeners.create(cls, this.defaultFilter, listener));
    }

    @Override // zendesk.support.suas.Store
    public <E> Subscription addListener(Class<E> cls, Filter<E> filter, Listener<E> listener) {
        return registerListener(listener, Listeners.create(cls, filter, listener));
    }

    @Override // zendesk.support.suas.Store
    public <E> Subscription addListener(String str, Class<E> cls, Listener<E> listener) {
        return registerListener(listener, Listeners.create(str, cls, this.defaultFilter, listener));
    }

    @Override // zendesk.support.suas.Store
    public <E> Subscription addListener(String str, Class<E> cls, Filter<E> filter, Listener<E> listener) {
        return registerListener(listener, Listeners.create(str, cls, filter, listener));
    }

    @Override // zendesk.support.suas.Store
    public Subscription addListener(Listener<State> listener) {
        return registerListener(listener, Listeners.create(this.defaultFilter, listener));
    }

    @Override // zendesk.support.suas.Store
    public Subscription addListener(Filter<State> filter, Listener<State> listener) {
        return registerListener(listener, Listeners.create(filter, listener));
    }
}
