package uk.co.samuelwall.materialtaptargetprompt.extras;

import android.graphics.Path;
import android.graphics.Rect;

/* loaded from: classes.dex */
public abstract class PromptBackground implements PromptUIElement {
    public Path getPath() {
        return null;
    }

    public abstract void prepare(PromptOptions promptOptions, boolean z2, Rect rect);

    public abstract void setColour(int i4);
}
