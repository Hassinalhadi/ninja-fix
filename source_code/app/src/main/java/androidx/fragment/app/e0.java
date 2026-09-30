package androidx.fragment.app;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import androidx.lifecycle.InterfaceC0651v;
import java.util.LinkedHashMap;
import o2.C2194d;
import o2.C2195e;
import o2.InterfaceC2196f;
import q2.C2406a;

/* loaded from: classes3.dex */
public final class e0 implements InterfaceC0651v, InterfaceC2196f, androidx.lifecycle.d0 {
    public final ai alpha;
    public final androidx.lifecycle.c0 purple;
    public final RunnableC0628x red;
    public androidx.lifecycle.a0 silver;
    public androidx.lifecycle.an teal = null;
    public C2195e white = null;

    public e0(ai aiVar, androidx.lifecycle.c0 c0Var, RunnableC0628x runnableC0628x) {
        this.alpha = aiVar;
        this.purple = c0Var;
        this.red = runnableC0628x;
    }

    public final void alpha(androidx.lifecycle.aa aaVar) {
        this.teal.foxtrot(aaVar);
    }

    public final void bravo() {
        if (this.teal == null) {
            this.teal = new androidx.lifecycle.an(this);
            C2195e c2195e = new C2195e(new C2406a(this, new kotlin.collections.n(8, this)));
            this.white = c2195e;
            c2195e.alpha();
            this.red.run();
        }
    }

    @Override // androidx.lifecycle.InterfaceC0651v
    public final T1.c getDefaultViewModelCreationExtras() {
        Application application;
        ai aiVar = this.alpha;
        Context applicationContext = aiVar.requireContext().getApplicationContext();
        while (true) {
            if (applicationContext instanceof ContextWrapper) {
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                }
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            } else {
                application = null;
                break;
            }
        }
        T1.e eVar = new T1.e(0);
        LinkedHashMap linkedHashMap = eVar.alpha;
        if (application != null) {
            linkedHashMap.put(androidx.lifecycle.Z.echo, application);
        }
        linkedHashMap.put(androidx.lifecycle.T.alpha, aiVar);
        linkedHashMap.put(androidx.lifecycle.T.bravo, this);
        if (aiVar.getArguments() != null) {
            linkedHashMap.put(androidx.lifecycle.T.charlie, aiVar.getArguments());
        }
        return eVar;
    }

    @Override // androidx.lifecycle.InterfaceC0651v
    public final androidx.lifecycle.a0 getDefaultViewModelProviderFactory() {
        Application application;
        ai aiVar = this.alpha;
        androidx.lifecycle.a0 defaultViewModelProviderFactory = aiVar.getDefaultViewModelProviderFactory();
        if (!defaultViewModelProviderFactory.equals(aiVar.mDefaultFactory)) {
            this.silver = defaultViewModelProviderFactory;
            return defaultViewModelProviderFactory;
        }
        if (this.silver == null) {
            Context applicationContext = aiVar.requireContext().getApplicationContext();
            while (true) {
                if (applicationContext instanceof ContextWrapper) {
                    if (applicationContext instanceof Application) {
                        application = (Application) applicationContext;
                        break;
                    }
                    applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
                } else {
                    application = null;
                    break;
                }
            }
            this.silver = new androidx.lifecycle.V(application, aiVar, aiVar.getArguments());
        }
        return this.silver;
    }

    @Override // androidx.lifecycle.al
    public final androidx.lifecycle.ac getLifecycle() {
        bravo();
        return this.teal;
    }

    @Override // o2.InterfaceC2196f
    public final C2194d getSavedStateRegistry() {
        bravo();
        return this.white.bravo;
    }

    @Override // androidx.lifecycle.d0
    public final androidx.lifecycle.c0 getViewModelStore() {
        bravo();
        return this.purple;
    }
}
