package zendesk.support.request;

import java.io.Serializable;
import zendesk.support.suas.State;

/* loaded from: classes.dex */
class StateAndroidLifecycle implements Serializable {
    public static final int STARTED = 1;
    public static final int STOPPED = 2;
    private final int state;

    public StateAndroidLifecycle() {
        this.state = 1;
    }

    public static StateAndroidLifecycle fromState(State state) {
        StateAndroidLifecycle stateAndroidLifecycle = (StateAndroidLifecycle) state.getState(StateAndroidLifecycle.class);
        if (stateAndroidLifecycle != null) {
            return stateAndroidLifecycle;
        }
        return new StateAndroidLifecycle();
    }

    public int getState() {
        return this.state;
    }

    public String toString() {
        return Q0.c.quebec(new StringBuilder("AndroidLifeCycle{state="), this.state, '}');
    }

    public StateAndroidLifecycle(int i4) {
        this.state = i4;
    }
}
