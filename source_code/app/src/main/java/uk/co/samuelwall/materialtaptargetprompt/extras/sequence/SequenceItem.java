package uk.co.samuelwall.materialtaptargetprompt.extras.sequence;

import java.util.ArrayList;
import java.util.List;
import uk.co.samuelwall.materialtaptargetprompt.MaterialTapTargetPrompt;
import uk.co.samuelwall.materialtaptargetprompt.MaterialTapTargetSequence;

/* loaded from: classes.dex */
public class SequenceItem implements MaterialTapTargetPrompt.PromptStateChangeListener {
    private MaterialTapTargetSequence.SequenceCompleteListener sequenceListener;
    private final SequenceState sequenceState;
    final List<Integer> stateChangers = new ArrayList();

    public SequenceItem(SequenceState sequenceState) {
        this.sequenceState = sequenceState;
    }

    public void addStateChanger(int i4) {
        this.stateChangers.add(Integer.valueOf(i4));
    }

    public void clearStateChangers() {
        this.stateChangers.clear();
    }

    public void dismiss() {
        MaterialTapTargetPrompt prompt = this.sequenceState.getPrompt();
        if (prompt != null) {
            prompt.dismiss();
        }
    }

    public void finish() {
        MaterialTapTargetPrompt prompt = this.sequenceState.getPrompt();
        if (prompt != null) {
            prompt.finish();
        }
    }

    public SequenceState getState() {
        return this.sequenceState;
    }

    public void onItemComplete() {
        MaterialTapTargetSequence.SequenceCompleteListener sequenceCompleteListener = this.sequenceListener;
        if (sequenceCompleteListener != null) {
            sequenceCompleteListener.onSequenceComplete();
        }
    }

    @Override // uk.co.samuelwall.materialtaptargetprompt.MaterialTapTargetPrompt.PromptStateChangeListener
    public void onPromptStateChanged(MaterialTapTargetPrompt materialTapTargetPrompt, int i4) {
        if (this.stateChangers.contains(Integer.valueOf(i4))) {
            onItemComplete();
        }
    }

    public void removeStateChanger(int i4) {
        this.stateChangers.remove(Integer.valueOf(i4));
    }

    public void setSequenceListener(MaterialTapTargetSequence.SequenceCompleteListener sequenceCompleteListener) {
        this.sequenceListener = sequenceCompleteListener;
    }

    public void show() {
        MaterialTapTargetPrompt prompt = this.sequenceState.getPrompt();
        if (prompt != null) {
            show(prompt);
        } else {
            onItemComplete();
        }
    }

    public void show(MaterialTapTargetPrompt materialTapTargetPrompt) {
        materialTapTargetPrompt.show();
    }
}
