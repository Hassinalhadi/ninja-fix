package uk.co.samuelwall.materialtaptargetprompt;

import java.util.ArrayList;
import java.util.List;
import uk.co.samuelwall.materialtaptargetprompt.extras.PromptOptions;
import uk.co.samuelwall.materialtaptargetprompt.extras.sequence.SequenceItem;
import uk.co.samuelwall.materialtaptargetprompt.extras.sequence.SequenceItemShowFor;
import uk.co.samuelwall.materialtaptargetprompt.extras.sequence.SequenceState;
import uk.co.samuelwall.materialtaptargetprompt.extras.sequence.SequenceStatePromptOptions;

/* loaded from: classes.dex */
public class MaterialTapTargetSequence {
    private SequenceCompleteListener mOnCompleteListener;
    private final List<SequenceItem> items = new ArrayList();
    int nextPromptIndex = -1;
    SequenceCompleteListener itemListener = new SequenceCompleteListener() { // from class: uk.co.samuelwall.materialtaptargetprompt.MaterialTapTargetSequence.1
        @Override // uk.co.samuelwall.materialtaptargetprompt.MaterialTapTargetSequence.SequenceCompleteListener
        public void onSequenceComplete() {
            SequenceItem sequenceItem = (SequenceItem) MaterialTapTargetSequence.this.items.get(MaterialTapTargetSequence.this.nextPromptIndex);
            sequenceItem.setSequenceListener(null);
            MaterialTapTargetPrompt prompt = sequenceItem.getState().getPrompt();
            if (prompt != null) {
                prompt.mView.mPromptOptions.setSequenceListener(null);
            }
            MaterialTapTargetSequence materialTapTargetSequence = MaterialTapTargetSequence.this;
            materialTapTargetSequence.nextPromptIndex++;
            int size = materialTapTargetSequence.items.size();
            MaterialTapTargetSequence materialTapTargetSequence2 = MaterialTapTargetSequence.this;
            int i4 = materialTapTargetSequence2.nextPromptIndex;
            if (size > i4) {
                materialTapTargetSequence2.show(i4);
            } else if (materialTapTargetSequence2.mOnCompleteListener != null) {
                MaterialTapTargetSequence.this.mOnCompleteListener.onSequenceComplete();
                MaterialTapTargetSequence.this.nextPromptIndex = -1;
            }
        }
    };

    /* loaded from: classes.dex */
    public interface SequenceCompleteListener {
        void onSequenceComplete();
    }

    private void addItem(SequenceItem sequenceItem) {
        sequenceItem.addStateChanger(4);
        sequenceItem.addStateChanger(6);
        this.items.add(sequenceItem);
    }

    public MaterialTapTargetSequence addPrompt(MaterialTapTargetPrompt materialTapTargetPrompt) {
        addItem(new SequenceItem(new SequenceState(materialTapTargetPrompt)));
        return this;
    }

    public MaterialTapTargetSequence dismiss() {
        int i4 = this.nextPromptIndex;
        if (i4 > -1 && i4 < this.items.size()) {
            SequenceItem sequenceItem = this.items.get(this.nextPromptIndex);
            sequenceItem.setSequenceListener(null);
            MaterialTapTargetPrompt prompt = sequenceItem.getState().getPrompt();
            if (prompt != null) {
                prompt.mView.mPromptOptions.setSequenceListener(null);
            }
            sequenceItem.dismiss();
        }
        return this;
    }

    public MaterialTapTargetSequence finish() {
        int i4 = this.nextPromptIndex;
        if (i4 > -1 && i4 < this.items.size()) {
            SequenceItem sequenceItem = this.items.get(this.nextPromptIndex);
            sequenceItem.setSequenceListener(null);
            MaterialTapTargetPrompt prompt = sequenceItem.getState().getPrompt();
            if (prompt != null) {
                prompt.mView.mPromptOptions.setSequenceListener(null);
            }
            sequenceItem.finish();
        }
        return this;
    }

    public SequenceItem get(int i4) {
        return this.items.get(i4);
    }

    public MaterialTapTargetSequence setSequenceCompleteListener(SequenceCompleteListener sequenceCompleteListener) {
        this.mOnCompleteListener = sequenceCompleteListener;
        return this;
    }

    public MaterialTapTargetSequence show() {
        this.nextPromptIndex = 0;
        if (!this.items.isEmpty()) {
            show(0);
            return this;
        }
        SequenceCompleteListener sequenceCompleteListener = this.mOnCompleteListener;
        if (sequenceCompleteListener != null) {
            sequenceCompleteListener.onSequenceComplete();
        }
        return this;
    }

    public MaterialTapTargetSequence showFromIndex(int i4) {
        dismiss();
        this.nextPromptIndex = i4;
        show(i4);
        return this;
    }

    public int size() {
        return this.items.size();
    }

    public MaterialTapTargetSequence addPrompt(MaterialTapTargetPrompt materialTapTargetPrompt, long j5) {
        addItem(new SequenceItemShowFor(new SequenceState(materialTapTargetPrompt), j5));
        return this;
    }

    public MaterialTapTargetSequence addPrompt(PromptOptions promptOptions) {
        addItem(new SequenceItem(new SequenceStatePromptOptions(promptOptions)));
        return this;
    }

    public MaterialTapTargetSequence addPrompt(PromptOptions promptOptions, long j5) {
        addItem(new SequenceItemShowFor(new SequenceStatePromptOptions(promptOptions), j5));
        return this;
    }

    public MaterialTapTargetSequence addPrompt(SequenceItem sequenceItem) {
        this.items.add(sequenceItem);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void show(int i4) {
        SequenceItem sequenceItem = this.items.get(i4);
        sequenceItem.setSequenceListener(this.itemListener);
        MaterialTapTargetPrompt prompt = sequenceItem.getState().getPrompt();
        if (prompt != null) {
            prompt.mView.mPromptOptions.setSequenceListener(sequenceItem);
        }
        sequenceItem.show();
    }
}
