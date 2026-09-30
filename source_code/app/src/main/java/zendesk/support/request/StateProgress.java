package zendesk.support.request;

import java.io.Serializable;
import zendesk.support.suas.State;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class StateProgress implements Serializable {
    private final int runningRequests;

    public StateProgress() {
        this.runningRequests = 0;
    }

    public static StateProgress fomState(State state) {
        StateProgress stateProgress = (StateProgress) state.getState(StateProgress.class);
        if (stateProgress != null) {
            return stateProgress;
        }
        return new StateProgress();
    }

    public StateProgress decrement() {
        int i4 = this.runningRequests;
        if (i4 > 0) {
            return new StateProgress(i4 - 1);
        }
        return new StateProgress(0);
    }

    public int getRunningRequests() {
        return this.runningRequests;
    }

    public StateProgress increment() {
        return new StateProgress(this.runningRequests + 1);
    }

    public String toString() {
        return Q0.c.quebec(new StringBuilder("Progress{runningRequests="), this.runningRequests, '}');
    }

    public StateProgress(int i4) {
        this.runningRequests = i4;
    }
}
