package a7;

import ae.C0423b;
import android.content.Context;
import android.view.View;
import android.view.animation.PathInterpolator;
import delivery.samurai.android.R;
import x2.q;

/* renamed from: a7.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0406a {
    public final PathInterpolator alpha = new PathInterpolator(0.1f, 0.1f, 0.0f, 1.0f);
    public final View bravo;
    public final int charlie;
    public final int delta;
    public final int echo;
    public C0423b foxtrot;

    public AbstractC0406a(View view) {
        this.bravo = view;
        Context context = view.getContext();
        this.charlie = q.echo(context, R.attr.motionDurationMedium2, 300);
        this.delta = q.echo(context, R.attr.motionDurationShort3, 150);
        this.echo = q.echo(context, R.attr.motionDurationShort2, 100);
    }
}
