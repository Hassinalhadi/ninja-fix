package zendesk.support.suas;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class CombinedReducer {
    private final Collection<String> keys;
    private final Collection<Reducer> reducers;

    /* loaded from: classes.dex */
    public static class ReduceResult {
        private final State newState;
        private final Collection<String> updatedKeys;

        public ReduceResult(Collection<String> collection, State state) {
            this.updatedKeys = collection;
            this.newState = state;
        }

        public State getNewState() {
            return this.newState;
        }

        public Collection<String> getUpdatedKeys() {
            return this.updatedKeys;
        }
    }

    public CombinedReducer(Collection<Reducer> collection) {
        assertReducers(collection);
        this.reducers = collection;
        this.keys = getKeys(collection);
    }

    private void assertReducers(Collection<Reducer> collection) {
        if (collection != null && collection.size() != 0) {
            HashSet hashSet = new HashSet();
            Iterator<Reducer> it = collection.iterator();
            while (it.hasNext()) {
                hashSet.add(it.next().getStateKey());
            }
            if (hashSet.size() == collection.size()) {
                return;
            } else {
                throw new IllegalArgumentException("Two or more reducers are tied to the same key");
            }
        }
        throw new IllegalArgumentException("No reducers provided");
    }

    private Collection<String> getKeys(Collection<Reducer> collection) {
        HashSet hashSet = new HashSet();
        Iterator<Reducer> it = collection.iterator();
        while (it.hasNext()) {
            hashSet.add(it.next().getStateKey());
        }
        return hashSet;
    }

    public Collection<String> getAllKeys() {
        return this.keys;
    }

    public State getEmptyState() {
        HashMap hashMap = new HashMap(this.reducers.size());
        for (Reducer reducer : this.reducers) {
            hashMap.put(reducer.getStateKey(), reducer.getInitialState());
        }
        return new State(hashMap);
    }

    public ReduceResult reduce(State state, Action<?> action) {
        State state2 = new State();
        HashSet hashSet = new HashSet();
        for (Reducer reducer : this.reducers) {
            Object state3 = state.getState(reducer.getStateKey());
            Object reduce = reducer.reduce(state3, action);
            if (reduce != null) {
                state2.updateKey(reducer.getStateKey(), reduce);
                if (reduce != state3) {
                    hashSet.add(reducer.getStateKey());
                }
            } else {
                state2.updateKey(reducer.getStateKey(), state3);
            }
        }
        return new ReduceResult(hashSet, state2);
    }
}
