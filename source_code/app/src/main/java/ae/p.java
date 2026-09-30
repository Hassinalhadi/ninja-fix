package ae;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.T;
import androidx.lifecycle.an;
import delivery.samurai.android.R;
import kotlin.jvm.internal.Intrinsics;
import o2.C2194d;
import o2.C2195e;
import o2.InterfaceC2196f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import q2.C2406a;
import s6.AbstractC2609a7;

/* loaded from: classes3.dex */
public class p extends Dialog implements androidx.lifecycle.al, aj, InterfaceC2196f {

    @Nullable
    private an _lifecycleRegistry;

    @NotNull
    private final ai onBackPressedDispatcher;

    @NotNull
    private final C2195e savedStateRegistryController;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(Context context, int i4) {
        super(context, i4);
        Intrinsics.echo(context, "context");
        this.savedStateRegistryController = new C2195e(new C2406a(this, new kotlin.collections.n(8, this)));
        this.onBackPressedDispatcher = new ai(new A2.q(24, this));
    }

    public static void alpha(p pVar) {
        super.onBackPressed();
    }

    public static /* synthetic */ void getOnBackPressedDispatcher$annotations() {
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        Intrinsics.echo(view, "view");
        initializeViewTreeOwners();
        super.addContentView(view, layoutParams);
    }

    @Override // androidx.lifecycle.al
    @NotNull
    public androidx.lifecycle.ac getLifecycle() {
        an anVar = this._lifecycleRegistry;
        if (anVar == null) {
            an anVar2 = new an(this);
            this._lifecycleRegistry = anVar2;
            return anVar2;
        }
        return anVar;
    }

    @Override // ae.aj
    @NotNull
    public final ai getOnBackPressedDispatcher() {
        return this.onBackPressedDispatcher;
    }

    @Override // o2.InterfaceC2196f
    @NotNull
    public C2194d getSavedStateRegistry() {
        return this.savedStateRegistryController.bravo;
    }

    public void initializeViewTreeOwners() {
        Window window = getWindow();
        Intrinsics.checkNotNull(window);
        View decorView = window.getDecorView();
        Intrinsics.delta(decorView, "window!!.decorView");
        T.juliet(decorView, this);
        Window window2 = getWindow();
        Intrinsics.checkNotNull(window2);
        View decorView2 = window2.getDecorView();
        Intrinsics.delta(decorView2, "window!!.decorView");
        decorView2.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        Window window3 = getWindow();
        Intrinsics.checkNotNull(window3);
        View decorView3 = window3.getDecorView();
        Intrinsics.delta(decorView3, "window!!.decorView");
        AbstractC2609a7.delta(decorView3, this);
    }

    @Override // android.app.Dialog
    public void onBackPressed() {
        this.onBackPressedDispatcher.delta();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            ai aiVar = this.onBackPressedDispatcher;
            onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            Intrinsics.delta(onBackInvokedDispatcher, "onBackInvokedDispatcher");
            aiVar.echo = onBackInvokedDispatcher;
            aiVar.echo(aiVar.golf);
        }
        this.savedStateRegistryController.bravo(bundle);
        an anVar = this._lifecycleRegistry;
        if (anVar == null) {
            anVar = new an(this);
            this._lifecycleRegistry = anVar;
        }
        anVar.foxtrot(androidx.lifecycle.aa.ON_CREATE);
    }

    @Override // android.app.Dialog
    @NotNull
    public Bundle onSaveInstanceState() {
        Bundle onSaveInstanceState = super.onSaveInstanceState();
        Intrinsics.delta(onSaveInstanceState, "super.onSaveInstanceState()");
        this.savedStateRegistryController.charlie(onSaveInstanceState);
        return onSaveInstanceState;
    }

    @Override // android.app.Dialog
    public void onStart() {
        super.onStart();
        an anVar = this._lifecycleRegistry;
        if (anVar == null) {
            anVar = new an(this);
            this._lifecycleRegistry = anVar;
        }
        anVar.foxtrot(androidx.lifecycle.aa.ON_RESUME);
    }

    @Override // android.app.Dialog
    public void onStop() {
        an anVar = this._lifecycleRegistry;
        if (anVar == null) {
            anVar = new an(this);
            this._lifecycleRegistry = anVar;
        }
        anVar.foxtrot(androidx.lifecycle.aa.ON_DESTROY);
        this._lifecycleRegistry = null;
        super.onStop();
    }

    @Override // android.app.Dialog
    public void setContentView(int i4) {
        initializeViewTreeOwners();
        super.setContentView(i4);
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        Intrinsics.echo(view, "view");
        initializeViewTreeOwners();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        Intrinsics.echo(view, "view");
        initializeViewTreeOwners();
        super.setContentView(view, layoutParams);
    }
}
