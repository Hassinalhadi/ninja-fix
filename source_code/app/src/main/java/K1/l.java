package K1;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.appcompat.widget.P0;
import androidx.emoji2.text.EmojiCompatInitializer;
import androidx.lifecycle.InterfaceC0640j;
import androidx.lifecycle.ac;
import androidx.lifecycle.al;
import vf.I;

/* loaded from: classes3.dex */
public final class l implements InterfaceC0640j {
    public final /* synthetic */ int alpha = 0;
    public final ac purple;
    public final Object red;

    public l(ac acVar, I i4) {
        this.purple = acVar;
        this.red = i4;
    }

    private final void alpha(al alVar) {
    }

    private final void bravo(al alVar) {
    }

    private final void charlie(al alVar) {
    }

    private final void delta(al alVar) {
    }

    private final void echo(al alVar) {
    }

    @Override // androidx.lifecycle.InterfaceC0640j
    public final /* synthetic */ void onCreate(al alVar) {
        int i4 = this.alpha;
        P0.papa(alVar);
    }

    @Override // androidx.lifecycle.InterfaceC0640j
    public final void onDestroy(al alVar) {
        switch (this.alpha) {
            case 0:
                return;
            default:
                ((I) this.red).foxtrot(null);
                return;
        }
    }

    @Override // androidx.lifecycle.InterfaceC0640j
    public final void onPause(al alVar) {
        int i4 = this.alpha;
    }

    @Override // androidx.lifecycle.InterfaceC0640j
    public final void onResume(al alVar) {
        Handler handler;
        switch (this.alpha) {
            case 0:
                ((EmojiCompatInitializer) this.red).getClass();
                if (Build.VERSION.SDK_INT >= 28) {
                    handler = b.alpha(Looper.getMainLooper());
                } else {
                    handler = new Handler(Looper.getMainLooper());
                }
                handler.postDelayed(new n(0), 500L);
                this.purple.charlie(this);
                return;
            default:
                P0.sierra(alVar);
                return;
        }
    }

    @Override // androidx.lifecycle.InterfaceC0640j
    public final /* synthetic */ void onStart(al alVar) {
        int i4 = this.alpha;
        P0.tango(alVar);
    }

    @Override // androidx.lifecycle.InterfaceC0640j
    public final void onStop(al alVar) {
        int i4 = this.alpha;
    }

    public l(EmojiCompatInitializer emojiCompatInitializer, ac acVar) {
        this.red = emojiCompatInitializer;
        this.purple = acVar;
    }
}
