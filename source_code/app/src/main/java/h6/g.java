package h6;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* loaded from: classes2.dex */
public final class g implements j {
    public final /* synthetic */ FrameLayout alpha;
    public final /* synthetic */ LayoutInflater bravo;
    public final /* synthetic */ ViewGroup charlie;
    public final /* synthetic */ Bundle delta;
    public final /* synthetic */ AbstractC1811a echo;

    public g(AbstractC1811a abstractC1811a, FrameLayout frameLayout, LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.echo = abstractC1811a;
        this.alpha = frameLayout;
        this.bravo = layoutInflater;
        this.charlie = viewGroup;
        this.delta = bundle;
    }

    @Override // h6.j
    public final int alpha() {
        return 2;
    }

    @Override // h6.j
    public final void bravo() {
        FrameLayout frameLayout = this.alpha;
        frameLayout.removeAllViews();
        frameLayout.addView(this.echo.alpha.foxtrot(this.bravo, this.charlie, this.delta));
    }
}
