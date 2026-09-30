package f1;

import KingArchersMougraphAlsopromas0.AlwaysMougraohSmootihbngmode;
import KingArchersMougraphAlsopromas0.hidden.Hidden0;
import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import androidx.lifecycle.al;
import androidx.lifecycle.an;
import bv.aw;
import s1.InterfaceC2577j;

/* compiled from: Dex2C */
/* loaded from: classes.dex */
public abstract class i extends Activity implements al, InterfaceC2577j {
    private final aw extraDataMap = new aw(0);
    private final an lifecycleRegistry = new an(this);

    static {
        AlwaysMougraohSmootihbngmode.registerNativesForClass(20, i.class);
        Hidden0.special_clinit_20_00(i.class);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public native boolean dispatchKeyEvent(KeyEvent keyEvent);

    @Override // android.app.Activity, android.view.Window.Callback
    public native boolean dispatchKeyShortcutEvent(KeyEvent keyEvent);

    @kotlin.c
    public native h getExtraData(Class cls);

    public native androidx.lifecycle.ac getLifecycle();

    @Override // android.app.Activity
    public native void onCreate(Bundle bundle);

    @Override // android.app.Activity
    public native void onSaveInstanceState(Bundle bundle);

    @kotlin.c
    public native void putExtraData(h hVar);

    public final native boolean shouldDumpInternalState(String[] strArr);

    @Override // s1.InterfaceC2577j
    public native boolean superDispatchKeyEvent(KeyEvent keyEvent);
}
