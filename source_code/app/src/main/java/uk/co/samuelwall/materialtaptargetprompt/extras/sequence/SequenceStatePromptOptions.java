package uk.co.samuelwall.materialtaptargetprompt.extras.sequence;

import uk.co.samuelwall.materialtaptargetprompt.MaterialTapTargetPrompt;
import uk.co.samuelwall.materialtaptargetprompt.extras.PromptOptions;

/* loaded from: classes.dex */
public class SequenceStatePromptOptions extends SequenceState {
    private final PromptOptions promptOptions;

    public SequenceStatePromptOptions(PromptOptions promptOptions) {
        super(null);
        this.promptOptions = promptOptions;
    }

    @Override // uk.co.samuelwall.materialtaptargetprompt.extras.sequence.SequenceState
    public MaterialTapTargetPrompt getPrompt() {
        if (this.prompt == null) {
            this.prompt = this.promptOptions.create();
        }
        return this.prompt;
    }
}
