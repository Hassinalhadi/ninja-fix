package zendesk.support.request;

import com.zendesk.util.CollectionUtils;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import zendesk.support.suas.State;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class StateAttachments implements Serializable {
    private final Set<StateRequestAttachment> allSelectedAttachments;
    private final List<StateRequestAttachment> selectedAttachments;

    /* loaded from: classes.dex */
    public static class Builder {
        private Set<StateRequestAttachment> attachmentNotSelectedButVisible;
        private List<StateRequestAttachment> selectedAttachments;

        public /* synthetic */ Builder(StateAttachments stateAttachments, int i4) {
            this(stateAttachments);
        }

        public Builder addAllSelectedAttachments(List<StateRequestAttachment> list) {
            Collections.reverse(list);
            this.attachmentNotSelectedButVisible.addAll(list);
            return this;
        }

        public StateAttachments build() {
            return new StateAttachments(this.selectedAttachments, this.attachmentNotSelectedButVisible);
        }

        public Builder setSelectedAttachments(List<StateRequestAttachment> list) {
            this.selectedAttachments = CollectionUtils.copyOf(list);
            return this;
        }

        private Builder(StateAttachments stateAttachments) {
            this.selectedAttachments = CollectionUtils.copyOf(stateAttachments.getSelectedAttachments());
            TreeSet treeSet = new TreeSet(new UriComparator());
            this.attachmentNotSelectedButVisible = treeSet;
            treeSet.addAll(stateAttachments.getAllSelectedAttachments());
        }
    }

    /* loaded from: classes.dex */
    public static class UriComparator implements Comparator<StateRequestAttachment>, Serializable {
        @Override // java.util.Comparator
        public int compare(StateRequestAttachment stateRequestAttachment, StateRequestAttachment stateRequestAttachment2) {
            return stateRequestAttachment.getLocalUri().compareTo(stateRequestAttachment2.getLocalUri());
        }
    }

    public StateAttachments(List<StateRequestAttachment> list, Set<StateRequestAttachment> set) {
        this.selectedAttachments = list;
        this.allSelectedAttachments = set;
    }

    public static StateAttachments fromState(State state) {
        Object state2 = state.getState("StateAttachments");
        if (state2 instanceof StateAttachments) {
            return (StateAttachments) state2;
        }
        return new StateAttachments();
    }

    public Set<StateRequestAttachment> getAllSelectedAttachments() {
        return this.allSelectedAttachments;
    }

    public List<StateRequestAttachment> getSelectedAttachments() {
        return this.selectedAttachments;
    }

    public Builder newBuilder() {
        return new Builder(this, 0);
    }

    public String toString() {
        return "Attachments{selectedAttachments=" + this.selectedAttachments + ", allSelectedAttachments=" + this.allSelectedAttachments + '}';
    }

    public StateAttachments() {
        this.selectedAttachments = new ArrayList();
        this.allSelectedAttachments = new TreeSet(new UriComparator());
    }
}
