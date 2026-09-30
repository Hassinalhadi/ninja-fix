package tc;

import android.content.Context;
import android.media.SoundPool;
import androidx.lifecycle.RunnableC0643m;
import kotlin.Unit;
import yf.InterfaceC3440j;

/* renamed from: tc.g, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3102g implements InterfaceC3440j {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ C3105j purple;

    public /* synthetic */ C3102g(C3105j c3105j, int i4) {
        this.alpha = i4;
        this.purple = c3105j;
    }

    @Override // yf.InterfaceC3440j
    public final Object emit(Object obj, Nd.c cVar) {
        Context context;
        final int i4 = 1;
        final C3105j c3105j = this.purple;
        switch (this.alpha) {
            case 0:
                AbstractC3112q abstractC3112q = (AbstractC3112q) obj;
                if (abstractC3112q instanceof C3111p) {
                    final int i5 = 0;
                    c3105j.tango().runOnUiThread(new Runnable() { // from class: tc.f
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i5) {
                                case 0:
                                    c3105j.tango().bronze();
                                    return;
                                default:
                                    c3105j.tango().tango();
                                    return;
                            }
                        }
                    });
                } else {
                    c3105j.tango().runOnUiThread(new Runnable() { // from class: tc.f
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i4) {
                                case 0:
                                    c3105j.tango().bronze();
                                    return;
                                default:
                                    c3105j.tango().tango();
                                    return;
                            }
                        }
                    });
                    if ((abstractC3112q instanceof C3110o) && !c3105j.f13964y) {
                        c3105j.f13964y = true;
                        if (c3105j.isAdded() && !c3105j.isRemoving() && (context = c3105j.getContext()) != null) {
                            SoundPool soundPool = W9.d.alpha;
                            W9.d.alpha(context, W9.e.e);
                        }
                    }
                }
                return Unit.INSTANCE;
            default:
                String str = (String) obj;
                if (str != null) {
                    c3105j.tango().runOnUiThread(new RunnableC0643m(27, c3105j, str));
                    c3105j.azure().delta.india(null);
                }
                return Unit.INSTANCE;
        }
    }
}
