package com.google.android.material.internal;

import android.content.Context;
import android.text.TextPaint;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public final class x {
    public float charlie;
    public float delta;
    public final WeakReference foxtrot;
    public d7.e golf;
    public final TextPaint alpha = new TextPaint(1);
    public final R6.b bravo = new R6.b(1, this);
    public boolean echo = true;

    public x(w wVar) {
        this.foxtrot = new WeakReference(null);
        this.foxtrot = new WeakReference(wVar);
    }

    public final void alpha(String str) {
        float measureText;
        TextPaint textPaint = this.alpha;
        float f5 = 0.0f;
        if (str == null) {
            measureText = 0.0f;
        } else {
            measureText = textPaint.measureText((CharSequence) str, 0, str.length());
        }
        this.charlie = measureText;
        if (str != null) {
            f5 = Math.abs(textPaint.getFontMetrics().ascent);
        }
        this.delta = f5;
        this.echo = false;
    }

    public final void bravo(d7.e eVar, Context context) {
        if (this.golf != eVar) {
            this.golf = eVar;
            if (eVar != null) {
                TextPaint textPaint = this.alpha;
                R6.b bVar = this.bravo;
                eVar.echo(context, textPaint, bVar);
                w wVar = (w) this.foxtrot.get();
                if (wVar != null) {
                    textPaint.drawableState = wVar.getState();
                }
                eVar.delta(context, textPaint, bVar);
                this.echo = true;
            }
            w wVar2 = (w) this.foxtrot.get();
            if (wVar2 != null) {
                wVar2.alpha();
                wVar2.onStateChange(wVar2.getState());
            }
        }
    }
}
