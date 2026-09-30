package androidx.fragment.app;

import KingArchersMougraphAlsopromas0.AlwaysMougraohSmootihbngmode;
import KingArchersMougraphAlsopromas0.hidden.Hidden0;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;
import f1.InterfaceC1682b;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import r1.InterfaceC2482a;

/* compiled from: Dex2C */
/* loaded from: classes.dex */
public abstract class an extends ae.o implements InterfaceC1682b {
    static final String LIFECYCLE_TAG = "android:support:lifecycle";
    boolean mCreated;
    boolean mResumed;
    final ar mFragments = new ar(new am(this));
    final androidx.lifecycle.an mFragmentLifecycleRegistry = new androidx.lifecycle.an(this);
    boolean mStopped = true;

    static {
        AlwaysMougraohSmootihbngmode.registerNativesForClass(22, an.class);
        Hidden0.special_clinit_22_00(an.class);
    }

    public an() {
        final int i4 = 1;
        final int i5 = 0;
        getSavedStateRegistry().charlie(LIFECYCLE_TAG, new aj(i5, this));
        addOnConfigurationChangedListener(new InterfaceC2482a(this) { // from class: androidx.fragment.app.ak
            public final /* synthetic */ an bravo;

            {
                this.bravo = this;
            }

            @Override // r1.InterfaceC2482a
            public final void accept(Object obj) {
                switch (i5) {
                    case 0:
                        this.bravo.mFragments.alpha();
                        return;
                    default:
                        this.bravo.mFragments.alpha();
                        return;
                }
            }
        });
        addOnNewIntentListener(new InterfaceC2482a(this) { // from class: androidx.fragment.app.ak
            public final /* synthetic */ an bravo;

            {
                this.bravo = this;
            }

            @Override // r1.InterfaceC2482a
            public final void accept(Object obj) {
                switch (i4) {
                    case 0:
                        this.bravo.mFragments.alpha();
                        return;
                    default:
                        this.bravo.mFragments.alpha();
                        return;
                }
            }
        });
        addOnContextAvailableListener(new ag.b() { // from class: androidx.fragment.app.al
            @Override // ag.b
            public final void alpha(ae.o oVar) {
                am amVar = an.this.mFragments.alpha;
                amVar.silver.bravo(amVar, amVar, null);
            }
        });
    }

    public static native boolean delta(L l10);

    public final native View dispatchFragmentsOnCreateView(View view, String str, Context context, AttributeSet attributeSet);

    @Override // android.app.Activity
    public native void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    public native L getSupportFragmentManager();

    @Deprecated
    public native androidx.loader.app.a getSupportLoaderManager();

    public native void markFragmentsCreated();

    @Override // ae.o, android.app.Activity
    public native void onActivityResult(int i4, int i5, Intent intent);

    @Deprecated
    public native void onAttachFragment(ai aiVar);

    @Override // ae.o, f1.i, android.app.Activity
    public native void onCreate(Bundle bundle);

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public native View onCreateView(View view, String str, Context context, AttributeSet attributeSet);

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public native View onCreateView(String str, Context context, AttributeSet attributeSet);

    @Override // android.app.Activity
    public native void onDestroy();

    @Override // ae.o, android.app.Activity, android.view.Window.Callback
    public native boolean onMenuItemSelected(int i4, MenuItem menuItem);

    @Override // android.app.Activity
    public native void onPause();

    @Override // android.app.Activity
    public native void onPostResume();

    @Override // ae.o, android.app.Activity
    public native void onRequestPermissionsResult(int i4, String[] strArr, int[] iArr);

    @Override // android.app.Activity
    public native void onResume();

    public native void onResumeFragments();

    @Override // android.app.Activity
    public native void onStart();

    @Override // android.app.Activity
    public native void onStateNotSaved();

    @Override // android.app.Activity
    public native void onStop();

    public native void setEnterSharedElementCallback(f1.ag agVar);

    public native void setExitSharedElementCallback(f1.ag agVar);

    public native void startActivityFromFragment(ai aiVar, Intent intent, int i4);

    public native void startActivityFromFragment(ai aiVar, Intent intent, int i4, Bundle bundle);

    @Deprecated
    public native void startIntentSenderFromFragment(ai aiVar, IntentSender intentSender, int i4, Intent intent, int i5, int i10, int i11, Bundle bundle);

    public native void supportFinishAfterTransition();

    @Deprecated
    public native void supportInvalidateOptionsMenu();

    public native void supportPostponeEnterTransition();

    public native void supportStartPostponedEnterTransition();

    @Override // f1.InterfaceC1682b
    @Deprecated
    public final native void validateRequestPermissionsRequestCode(int i4);
}
