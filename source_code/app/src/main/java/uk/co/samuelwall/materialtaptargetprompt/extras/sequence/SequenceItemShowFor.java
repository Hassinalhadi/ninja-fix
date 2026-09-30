package uk.co.samuelwall.materialtaptargetprompt.extras.sequence;

import uk.co.samuelwall.materialtaptargetprompt.MaterialTapTargetPrompt;

/* loaded from: classes.dex */
public class SequenceItemShowFor extends SequenceItem {
    private final long milliseconds;

    public SequenceItemShowFor(SequenceState sequenceState, long j5) {
        super(sequenceState);
        this.milliseconds = j5;
    }

    @Override // uk.co.samuelwall.materialtaptargetprompt.extras.sequence.SequenceItem
    public void show(MaterialTapTargetPrompt materialTapTargetPrompt) {
        materialTapTargetPrompt.showFor(this.milliseconds);
    }
}
