package uk.co.samuelwall.materialtaptargetprompt.extras;

import android.graphics.Canvas;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public interface PromptUIElement {
    boolean contains(float f5, float f10);

    void draw(Canvas canvas);

    void update(PromptOptions promptOptions, float f5, float f10);
}
