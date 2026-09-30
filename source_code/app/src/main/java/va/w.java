package va;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import delivery.samurai.android.R;
import delivery.samurai.android.ui.auth.signin.presentation.SignInActivity;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class w extends ClickableSpan {
    public final /* synthetic */ SignInActivity alpha;
    public final /* synthetic */ String purple;

    public w(SignInActivity signInActivity, String str) {
        this.alpha = signInActivity;
        this.purple = str;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View widget) {
        Intrinsics.echo(widget, "widget");
        L9.d.coral(this.alpha, this.purple);
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint ds) {
        Intrinsics.echo(ds, "ds");
        super.updateDrawState(ds);
        ds.setColor(this.alpha.getColor(R.color.blue));
    }
}
