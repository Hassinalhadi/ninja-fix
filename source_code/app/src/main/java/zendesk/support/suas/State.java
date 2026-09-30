package zendesk.support.suas;

import java.io.Serializable;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class State implements Serializable {
    private final Map<String, Object> state;

    public State(Map<String, Object> map) {
        this.state = new HashMap(map);
    }

    private Collection<String> getStateKeys() {
        return this.state.keySet();
    }

    public static String keyForClass(Class cls) {
        return cls.getSimpleName();
    }

    public static State mergeStates(State state, State state2) {
        if (state2 != null) {
            State copy = state2.copy();
            for (String str : state.getStateKeys()) {
                if (copy.getState(str) == null) {
                    copy.updateKey(str, state.getState(str));
                }
            }
            return copy;
        }
        return state;
    }

    public State copy() {
        return new State(new HashMap(this.state));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return this.state.equals(((State) obj).state);
        }
        return false;
    }

    public Object getState(String str) {
        return this.state.get(str);
    }

    public int hashCode() {
        return this.state.hashCode();
    }

    public String toString() {
        return this.state.toString();
    }

    public void updateKey(String str, Object obj) {
        this.state.put(str, obj);
    }

    public <E> E getState(Class<E> cls) {
        E e = (E) this.state.get(keyForClass(cls));
        if (cls.isInstance(e)) {
            return e;
        }
        return null;
    }

    public <E> void updateKey(Class<E> cls, E e) {
        this.state.put(keyForClass(cls), e);
    }

    public State() {
        this.state = new HashMap();
    }

    public <E> E getState(String str, Class<E> cls) {
        E e = (E) this.state.get(str);
        if (cls.isInstance(e)) {
            return e;
        }
        return null;
    }

    public Map<String, Object> getState() {
        return this.state;
    }
}
