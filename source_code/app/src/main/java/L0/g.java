package L0;

import D0.m;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import delivery.samurai.android.R;
import delivery.samurai.android.ui.auth.signin.presentation.SignInActivity;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class g extends ClickableSpan {
    public final /* synthetic */ int alpha = 0;
    public final Object purple;

    public g(m mVar) {
        this.purple = mVar;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View widget) {
        switch (this.alpha) {
            case 0:
                ((m) this.purple).getClass();
                return;
            default:
                Intrinsics.echo(widget, "widget");
                return;
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(TextPaint ds) {
        switch (this.alpha) {
            case 1:
                Intrinsics.echo(ds, "ds");
                super.updateDrawState(ds);
                ds.setColor(((SignInActivity) this.purple).getColor(R.color.blue));
                return;
            default:
                super.updateDrawState(ds);
                return;
        }
    }

    public g(SignInActivity signInActivity) {
        this.purple = signInActivity;
    }
}
