package androidx.lifecycle;

import android.os.Bundle;
import android.view.View;
import delivery.samurai.android.R;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.NotImplementedError;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import o2.C2194d;
import o2.InterfaceC2193c;
import o2.InterfaceC2196f;
import s6.AbstractC2832z6;
import s6.S6;
import s6.W6;
import t6.B2;

/* loaded from: classes3.dex */
public abstract class T {
    public static final g7.f alpha = new g7.f(14);
    public static final g8.d bravo = new g8.d(14);
    public static final r6.u charlie = new r6.u(14);
    public static final V1.c delta = new Object();

    public static final void alpha(Y y10, C2194d registry, ac lifecycle) {
        Intrinsics.echo(registry, "registry");
        Intrinsics.echo(lifecycle, "lifecycle");
        Q q4 = (Q) y10.getCloseable("androidx.lifecycle.savedstate.vm.tag");
        if (q4 != null && !q4.red) {
            q4.charlie(lifecycle, registry);
            ab bravo2 = lifecycle.bravo();
            if (bravo2 != ab.purple && bravo2.compareTo(ab.silver) < 0) {
                lifecycle.alpha(new C0642l(lifecycle, registry));
            } else {
                registry.delta();
            }
        }
    }

    public static final P bravo(T1.c cVar) {
        U u4;
        P p4;
        Intrinsics.echo(cVar, "<this>");
        InterfaceC2196f interfaceC2196f = (InterfaceC2196f) cVar.alpha(alpha);
        if (interfaceC2196f != null) {
            d0 d0Var = (d0) cVar.alpha(bravo);
            if (d0Var != null) {
                Bundle bundle = (Bundle) cVar.alpha(charlie);
                String str = (String) cVar.alpha(b0.bravo);
                if (str != null) {
                    InterfaceC2193c bravo2 = interfaceC2196f.getSavedStateRegistry().bravo();
                    Bundle bundle2 = null;
                    if (bravo2 instanceof U) {
                        u4 = (U) bravo2;
                    } else {
                        u4 = null;
                    }
                    if (u4 != null) {
                        LinkedHashMap linkedHashMap = golf(d0Var).alpha;
                        P p5 = (P) linkedHashMap.get(str);
                        if (p5 == null) {
                            u4.bravo();
                            Bundle bundle3 = u4.charlie;
                            if (bundle3 != null && bundle3.containsKey(str)) {
                                Bundle bundle4 = bundle3.getBundle(str);
                                if (bundle4 == null) {
                                    bundle4 = S6.charlie((Pair[]) Arrays.copyOf(new Pair[0], 0));
                                }
                                bundle3.remove(str);
                                if (bundle3.isEmpty()) {
                                    u4.charlie = null;
                                }
                                bundle2 = bundle4;
                            }
                            if (bundle2 != null) {
                                bundle = bundle2;
                            }
                            if (bundle == null) {
                                p4 = new P();
                            } else {
                                ClassLoader classLoader = P.class.getClassLoader();
                                Intrinsics.checkNotNull(classLoader);
                                bundle.setClassLoader(classLoader);
                                p4 = new P(W6.kilo(bundle));
                            }
                            linkedHashMap.put(str, p4);
                            return p4;
                        }
                        return p5;
                    }
                    throw new IllegalStateException("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
                }
                throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_KEY`");
            }
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
        }
        throw new IllegalArgumentException("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
    }

    public static final void charlie(InterfaceC2196f interfaceC2196f) {
        Intrinsics.echo(interfaceC2196f, "<this>");
        ab bravo2 = interfaceC2196f.getLifecycle().bravo();
        if (bravo2 != ab.purple && bravo2 != ab.red) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (interfaceC2196f.getSavedStateRegistry().bravo() == null) {
            U u4 = new U(interfaceC2196f.getSavedStateRegistry(), (d0) interfaceC2196f);
            interfaceC2196f.getSavedStateRegistry().charlie("androidx.lifecycle.internal.SavedStateHandlesProvider", u4);
            interfaceC2196f.getLifecycle().alpha(new C0637g(1, u4));
        }
    }

    public static final al delta(View view) {
        al alVar;
        Intrinsics.echo(view, "<this>");
        while (view != null) {
            Object tag = view.getTag(R.id.view_tree_lifecycle_owner);
            if (tag instanceof al) {
                alVar = (al) tag;
            } else {
                alVar = null;
            }
            if (alVar != null) {
                return alVar;
            }
            Object charlie2 = B2.charlie(view);
            if (charlie2 instanceof View) {
                view = (View) charlie2;
            } else {
                view = null;
            }
        }
        return null;
    }

    public static final d0 echo(View view) {
        d0 d0Var;
        Intrinsics.echo(view, "<this>");
        while (view != null) {
            Object tag = view.getTag(R.id.view_tree_view_model_store_owner);
            if (tag instanceof d0) {
                d0Var = (d0) tag;
            } else {
                d0Var = null;
            }
            if (d0Var != null) {
                return d0Var;
            }
            Object charlie2 = B2.charlie(view);
            if (charlie2 instanceof View) {
                view = (View) charlie2;
            } else {
                view = null;
            }
        }
        return null;
    }

    public static final ag foxtrot(al alVar) {
        Intrinsics.echo(alVar, "<this>");
        ac lifecycle = alVar.getLifecycle();
        Intrinsics.echo(lifecycle, "<this>");
        while (true) {
            C0631a c0631a = lifecycle.alpha;
            ag agVar = (ag) ((AtomicReference) c0631a.alpha).get();
            if (agVar != null) {
                return agVar;
            }
            vf.a0 foxtrot = vf.ad.foxtrot();
            Cf.e eVar = vf.ao.alpha;
            ag agVar2 = new ag(lifecycle, AbstractC2832z6.charlie(foxtrot, Af.n.alpha.teal));
            AtomicReference atomicReference = (AtomicReference) c0631a.alpha;
            while (!atomicReference.compareAndSet(null, agVar2)) {
                if (atomicReference.get() != null) {
                    break;
                }
            }
            Cf.e eVar2 = vf.ao.alpha;
            vf.ad.zulu(agVar2, Af.n.alpha.teal, null, new af(agVar2, null), 2);
            return agVar2;
        }
    }

    public static final SavedStateHandlesVM golf(d0 d0Var) {
        Intrinsics.echo(d0Var, "<this>");
        b0 foxtrot = U8.a.foxtrot(d0Var, new S(0), 4);
        return (SavedStateHandlesVM) foxtrot.alpha.charlie(kotlin.jvm.internal.u.alpha.bravo(SavedStateHandlesVM.class), "androidx.lifecycle.internal.SavedStateHandlesVM");
    }

    public static final V1.a hotel(Y y10) {
        V1.a aVar;
        Intrinsics.echo(y10, "<this>");
        synchronized (delta) {
            aVar = (V1.a) y10.getCloseable("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY");
            if (aVar == null) {
                Nd.h hVar = Nd.i.alpha;
                try {
                    Cf.e eVar = vf.ao.alpha;
                    hVar = Af.n.alpha.teal;
                } catch (IllegalStateException | NotImplementedError unused) {
                }
                V1.a aVar2 = new V1.a(hVar.plus(vf.ad.foxtrot()));
                y10.addCloseable("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY", aVar2);
                aVar = aVar2;
            }
        }
        return aVar;
    }

    public static final Object india(ac acVar, Xd.l lVar, Pd.i iVar) {
        ab abVar = ab.alpha;
        ab abVar2 = ab.alpha;
        if (acVar.bravo() == ab.alpha) {
            return Unit.INSTANCE;
        }
        Object mike = vf.ad.mike(new L(acVar, lVar, null), iVar);
        if (mike == Od.a.alpha) {
            return mike;
        }
        return Unit.INSTANCE;
    }

    public static final void juliet(View view, al alVar) {
        Intrinsics.echo(view, "<this>");
        view.setTag(R.id.view_tree_lifecycle_owner, alVar);
    }

    public static final void kilo(View view, d0 d0Var) {
        Intrinsics.echo(view, "<this>");
        view.setTag(R.id.view_tree_view_model_store_owner, d0Var);
    }
}
