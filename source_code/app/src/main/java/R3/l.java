package R3;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.fragment.app.L;
import androidx.fragment.app.ai;
import androidx.fragment.app.an;
import bv.aw;
import com.bumptech.glide.load.resource.bitmap.u;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class l implements Handler.Callback {
    public static final g8.d echo = new g8.d(8);
    public volatile com.bumptech.glide.m alpha;
    public final f charlie;
    public final bv.e bravo = new aw(0);
    public final w.o delta = new w.o(echo);

    /* JADX WARN: Type inference failed for: r0v0, types: [bv.e, bv.aw] */
    public l() {
        f aVar;
        if (u.foxtrot && u.echo) {
            aVar = new e();
        } else {
            aVar = new W8.a(8);
        }
        this.charlie = aVar;
    }

    public static Activity alpha(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return alpha(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    public static void bravo(List list, bv.e eVar) {
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ai aiVar = (ai) it.next();
                if (aiVar != null && aiVar.getView() != null) {
                    eVar.put(aiVar.getView(), aiVar);
                    bravo(aiVar.getChildFragmentManager().charlie.foxtrot(), eVar);
                }
            }
        }
    }

    public final com.bumptech.glide.m charlie(Context context) {
        if (context != null) {
            char[] cArr = Y3.l.alpha;
            if (Looper.myLooper() == Looper.getMainLooper() && !(context instanceof Application)) {
                if (context instanceof an) {
                    return echo((an) context);
                }
                if (context instanceof ContextWrapper) {
                    ContextWrapper contextWrapper = (ContextWrapper) context;
                    if (contextWrapper.getBaseContext().getApplicationContext() != null) {
                        return charlie(contextWrapper.getBaseContext());
                    }
                }
            }
            if (this.alpha == null) {
                synchronized (this) {
                    try {
                        if (this.alpha == null) {
                            this.alpha = new com.bumptech.glide.m(com.bumptech.glide.b.alpha(context.getApplicationContext()), new u8.b(7), new com.google.mlkit.common.sdkinternal.b(8), context.getApplicationContext());
                        }
                    } finally {
                    }
                }
            }
            return this.alpha;
        }
        throw new IllegalArgumentException("You cannot start a load on a null Context");
    }

    public final com.bumptech.glide.m delta(ai aiVar) {
        boolean z2;
        Y3.f.charlie(aiVar.getContext(), "You cannot start a load on a fragment before it is attached or after it is destroyed");
        char[] cArr = Y3.l.alpha;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            return charlie(aiVar.getContext().getApplicationContext());
        }
        if (aiVar.getActivity() != null) {
            this.charlie.charlie(aiVar.getActivity());
        }
        L childFragmentManager = aiVar.getChildFragmentManager();
        Context context = aiVar.getContext();
        return this.delta.whiskey(context, com.bumptech.glide.b.alpha(context.getApplicationContext()), aiVar.getLifecycle(), childFragmentManager, aiVar.isVisible());
    }

    public final com.bumptech.glide.m echo(an anVar) {
        boolean z2;
        boolean z10;
        char[] cArr = Y3.l.alpha;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            return charlie(anVar.getApplicationContext());
        }
        if (!anVar.isDestroyed()) {
            this.charlie.charlie(anVar);
            Activity alpha = alpha(anVar);
            if (alpha != null && alpha.isFinishing()) {
                z10 = false;
            } else {
                z10 = true;
            }
            return this.delta.whiskey(anVar, com.bumptech.glide.b.alpha(anVar.getApplicationContext()), anVar.getLifecycle(), anVar.getSupportFragmentManager(), z10);
        }
        throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        return false;
    }
}
