package androidx.lifecycle;

import android.app.Application;
import android.os.Bundle;
import ge.InterfaceC1772d;
import java.lang.reflect.Constructor;
import kotlin.jvm.internal.Intrinsics;
import o2.C2194d;
import o2.InterfaceC2196f;
import s6.W6;
import t6.AbstractC3013k;
import t6.AbstractC3062u;

/* loaded from: classes3.dex */
public final class V implements a0 {
    public final Application alpha;
    public final Z bravo;
    public final Bundle charlie;
    public final ac delta;
    public final C2194d echo;

    public V() {
        this.bravo = new Z(null);
    }

    public final Y alpha(Class modelClass, String str) {
        Constructor alpha;
        P p4;
        Y bravo;
        int i4 = 1;
        Intrinsics.echo(modelClass, "modelClass");
        ac acVar = this.delta;
        if (acVar != null) {
            boolean isAssignableFrom = AndroidViewModel.class.isAssignableFrom(modelClass);
            Application application = this.alpha;
            if (isAssignableFrom && application != null) {
                alpha = W.alpha(modelClass, W.alpha);
            } else {
                alpha = W.alpha(modelClass, W.bravo);
            }
            if (alpha == null) {
                if (application != null) {
                    return this.bravo.create(modelClass);
                }
                if (S.bravo == null) {
                    S.bravo = new S(i4);
                }
                S s3 = S.bravo;
                Intrinsics.checkNotNull(s3);
                s3.getClass();
                return AbstractC3013k.echo(modelClass);
            }
            C2194d registry = this.echo;
            Intrinsics.checkNotNull(registry);
            Intrinsics.echo(registry, "registry");
            Intrinsics.checkNotNull(str);
            Bundle alpha2 = registry.alpha(str);
            if (alpha2 == null) {
                alpha2 = this.charlie;
            }
            if (alpha2 == null) {
                p4 = new P();
            } else {
                ClassLoader classLoader = P.class.getClassLoader();
                Intrinsics.checkNotNull(classLoader);
                alpha2.setClassLoader(classLoader);
                p4 = new P(W6.kilo(alpha2));
            }
            Q q4 = new Q(str, p4);
            q4.charlie(acVar, registry);
            ab bravo2 = acVar.bravo();
            if (bravo2 != ab.purple && bravo2.compareTo(ab.silver) < 0) {
                acVar.alpha(new C0642l(acVar, registry));
            } else {
                registry.delta();
            }
            if (isAssignableFrom && application != null) {
                Intrinsics.checkNotNull(application);
                bravo = W.bravo(modelClass, alpha, application, p4);
            } else {
                bravo = W.bravo(modelClass, alpha, p4);
            }
            bravo.addCloseable("androidx.lifecycle.savedstate.vm.tag", q4);
            return bravo;
        }
        throw new UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
    }

    @Override // androidx.lifecycle.a0
    public final Y create(InterfaceC1772d modelClass, T1.c cVar) {
        Intrinsics.echo(modelClass, "modelClass");
        return create(AbstractC3062u.bravo(modelClass), cVar);
    }

    @Override // androidx.lifecycle.a0
    public final Y create(Class modelClass, T1.c extras) {
        Constructor alpha;
        Intrinsics.echo(modelClass, "modelClass");
        Intrinsics.echo(extras, "extras");
        String str = (String) extras.alpha(b0.bravo);
        if (str != null) {
            if (extras.alpha(T.alpha) != null && extras.alpha(T.bravo) != null) {
                Application application = (Application) extras.alpha(Z.echo);
                boolean isAssignableFrom = AndroidViewModel.class.isAssignableFrom(modelClass);
                if (isAssignableFrom && application != null) {
                    alpha = W.alpha(modelClass, W.alpha);
                } else {
                    alpha = W.alpha(modelClass, W.bravo);
                }
                if (alpha == null) {
                    return this.bravo.create(modelClass, extras);
                }
                return (!isAssignableFrom || application == null) ? W.bravo(modelClass, alpha, T.bravo(extras)) : W.bravo(modelClass, alpha, application, T.bravo(extras));
            }
            if (this.delta != null) {
                return alpha(modelClass, str);
            }
            throw new IllegalStateException("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
        }
        throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
    }

    public V(Application application, InterfaceC2196f interfaceC2196f, Bundle bundle) {
        Z z2;
        this.echo = interfaceC2196f.getSavedStateRegistry();
        this.delta = interfaceC2196f.getLifecycle();
        this.charlie = bundle;
        this.alpha = application;
        if (application != null) {
            if (Z.delta == null) {
                Z.delta = new Z(application);
            }
            z2 = Z.delta;
            Intrinsics.checkNotNull(z2);
        } else {
            z2 = new Z(null);
        }
        this.bravo = z2;
    }

    @Override // androidx.lifecycle.a0
    public final Y create(Class modelClass) {
        Intrinsics.echo(modelClass, "modelClass");
        String canonicalName = modelClass.getCanonicalName();
        if (canonicalName != null) {
            return alpha(modelClass, canonicalName);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }
}
