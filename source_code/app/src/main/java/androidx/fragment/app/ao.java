package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import com.google.firebase.perf.metrics.Trace;
import java.util.HashMap;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import u8.C3146a;
import v8.C3178c;

/* loaded from: classes3.dex */
public final class ao {
    public final Object alpha;
    public final Cloneable bravo;

    public ao(L fragmentManager) {
        Intrinsics.echo(fragmentManager, "fragmentManager");
        this.alpha = fragmentManager;
        this.bravo = new CopyOnWriteArrayList();
    }

    public void alpha(ai f5, boolean z2) {
        Intrinsics.echo(f5, "f");
        ai aiVar = ((L) this.alpha).zulu;
        if (aiVar != null) {
            L parentFragmentManager = aiVar.getParentFragmentManager();
            Intrinsics.delta(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.papa.alpha(f5, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.bravo).iterator();
        while (it.hasNext()) {
            av avVar = (av) it.next();
            if (z2) {
                avVar.getClass();
            }
            r8.e eVar = avVar.alpha;
        }
    }

    public void bravo(ai f5, boolean z2) {
        Intrinsics.echo(f5, "f");
        L l10 = (L) this.alpha;
        an anVar = l10.xray.purple;
        ai aiVar = l10.zulu;
        if (aiVar != null) {
            L parentFragmentManager = aiVar.getParentFragmentManager();
            Intrinsics.delta(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.papa.bravo(f5, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.bravo).iterator();
        while (it.hasNext()) {
            av avVar = (av) it.next();
            if (z2) {
                avVar.getClass();
            }
            r8.e eVar = avVar.alpha;
        }
    }

    public void charlie(ai f5, boolean z2) {
        Intrinsics.echo(f5, "f");
        ai aiVar = ((L) this.alpha).zulu;
        if (aiVar != null) {
            L parentFragmentManager = aiVar.getParentFragmentManager();
            Intrinsics.delta(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.papa.charlie(f5, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.bravo).iterator();
        while (it.hasNext()) {
            av avVar = (av) it.next();
            if (z2) {
                avVar.getClass();
            }
            r8.e eVar = avVar.alpha;
        }
    }

    public void delta(ai f5, boolean z2) {
        Intrinsics.echo(f5, "f");
        ai aiVar = ((L) this.alpha).zulu;
        if (aiVar != null) {
            L parentFragmentManager = aiVar.getParentFragmentManager();
            Intrinsics.delta(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.papa.delta(f5, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.bravo).iterator();
        while (it.hasNext()) {
            av avVar = (av) it.next();
            if (z2) {
                avVar.getClass();
            }
            r8.e eVar = avVar.alpha;
        }
    }

    public void echo(ai f5, boolean z2) {
        Intrinsics.echo(f5, "f");
        ai aiVar = ((L) this.alpha).zulu;
        if (aiVar != null) {
            L parentFragmentManager = aiVar.getParentFragmentManager();
            Intrinsics.delta(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.papa.echo(f5, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.bravo).iterator();
        while (it.hasNext()) {
            av avVar = (av) it.next();
            if (z2) {
                avVar.getClass();
            }
            r8.e eVar = avVar.alpha;
        }
    }

    public void foxtrot(ai f5, boolean z2) {
        B8.e eVar;
        Intrinsics.echo(f5, "f");
        ai aiVar = ((L) this.alpha).zulu;
        if (aiVar != null) {
            L parentFragmentManager = aiVar.getParentFragmentManager();
            Intrinsics.delta(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.papa.foxtrot(f5, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.bravo).iterator();
        while (it.hasNext()) {
            av avVar = (av) it.next();
            if (z2) {
                avVar.getClass();
            }
            r8.e eVar2 = avVar.alpha;
            Object[] objArr = {f5.getClass().getSimpleName()};
            C3146a c3146a = r8.e.foxtrot;
            c3146a.bravo("FragmentMonitor %s.onFragmentPaused ", objArr);
            WeakHashMap weakHashMap = eVar2.alpha;
            if (!weakHashMap.containsKey(f5)) {
                c3146a.golf("FragmentMonitor: missed a fragment trace from %s", f5.getClass().getSimpleName());
            } else {
                Trace trace = (Trace) weakHashMap.get(f5);
                weakHashMap.remove(f5);
                r8.f fVar = eVar2.echo;
                boolean z10 = fVar.delta;
                C3146a c3146a2 = r8.f.echo;
                if (!z10) {
                    c3146a2.alpha("Cannot stop sub-recording because FrameMetricsAggregator is not recording");
                    eVar = new B8.e();
                } else {
                    HashMap hashMap = fVar.charlie;
                    if (!hashMap.containsKey(f5)) {
                        c3146a2.bravo("Sub-recording associated with key %s was not started or does not exist", f5.getClass().getSimpleName());
                        eVar = new B8.e();
                    } else {
                        C3178c c3178c = (C3178c) hashMap.remove(f5);
                        B8.e alpha = fVar.alpha();
                        if (!alpha.bravo()) {
                            c3146a2.bravo("stopFragment(%s): snapshot() failed", f5.getClass().getSimpleName());
                            eVar = new B8.e();
                        } else {
                            C3178c c3178c2 = (C3178c) alpha.alpha();
                            c3178c2.getClass();
                            eVar = new B8.e(new C3178c(c3178c2.alpha - c3178c.alpha, c3178c2.bravo - c3178c.bravo, c3178c2.charlie - c3178c.charlie));
                        }
                    }
                }
                if (!eVar.bravo()) {
                    c3146a.golf("onFragmentPaused: recorder failed to trace %s", f5.getClass().getSimpleName());
                } else {
                    B8.i.alpha(trace, (C3178c) eVar.alpha());
                    trace.stop();
                }
            }
        }
    }

    public void golf(ai f5, boolean z2) {
        Intrinsics.echo(f5, "f");
        L l10 = (L) this.alpha;
        an anVar = l10.xray.purple;
        ai aiVar = l10.zulu;
        if (aiVar != null) {
            L parentFragmentManager = aiVar.getParentFragmentManager();
            Intrinsics.delta(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.papa.golf(f5, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.bravo).iterator();
        while (it.hasNext()) {
            av avVar = (av) it.next();
            if (z2) {
                avVar.getClass();
            }
            r8.e eVar = avVar.alpha;
        }
    }

    public void hotel(ai f5, boolean z2) {
        Intrinsics.echo(f5, "f");
        ai aiVar = ((L) this.alpha).zulu;
        if (aiVar != null) {
            L parentFragmentManager = aiVar.getParentFragmentManager();
            Intrinsics.delta(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.papa.hotel(f5, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.bravo).iterator();
        while (it.hasNext()) {
            av avVar = (av) it.next();
            if (z2) {
                avVar.getClass();
            }
            r8.e eVar = avVar.alpha;
        }
    }

    public void india(ai f5, boolean z2) {
        String simpleName;
        Intrinsics.echo(f5, "f");
        ai aiVar = ((L) this.alpha).zulu;
        if (aiVar != null) {
            L parentFragmentManager = aiVar.getParentFragmentManager();
            Intrinsics.delta(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.papa.india(f5, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.bravo).iterator();
        while (it.hasNext()) {
            av avVar = (av) it.next();
            if (z2) {
                avVar.getClass();
            }
            r8.e eVar = avVar.alpha;
            r8.e.foxtrot.bravo("FragmentMonitor %s.onFragmentResumed", f5.getClass().getSimpleName());
            Trace trace = new Trace("_st_".concat(f5.getClass().getSimpleName()), eVar.charlie, eVar.bravo, eVar.delta);
            trace.start();
            if (f5.getParentFragment() == null) {
                simpleName = "No parent";
            } else {
                simpleName = f5.getParentFragment().getClass().getSimpleName();
            }
            trace.putAttribute("Parent_fragment", simpleName);
            if (f5.getActivity() != null) {
                trace.putAttribute("Hosting_activity", f5.getActivity().getClass().getSimpleName());
            }
            eVar.alpha.put(f5, trace);
            r8.f fVar = eVar.echo;
            boolean z10 = fVar.delta;
            C3146a c3146a = r8.f.echo;
            if (!z10) {
                c3146a.alpha("Cannot start sub-recording because FrameMetricsAggregator is not recording");
            } else {
                HashMap hashMap = fVar.charlie;
                if (hashMap.containsKey(f5)) {
                    c3146a.bravo("Cannot start sub-recording because one is already ongoing with the key %s", f5.getClass().getSimpleName());
                } else {
                    B8.e alpha = fVar.alpha();
                    if (!alpha.bravo()) {
                        c3146a.bravo("startFragment(%s): snapshot() failed", f5.getClass().getSimpleName());
                    } else {
                        hashMap.put(f5, (C3178c) alpha.alpha());
                    }
                }
            }
        }
    }

    public void juliet(ai f5, Bundle bundle, boolean z2) {
        Intrinsics.echo(f5, "f");
        ai aiVar = ((L) this.alpha).zulu;
        if (aiVar != null) {
            L parentFragmentManager = aiVar.getParentFragmentManager();
            Intrinsics.delta(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.papa.juliet(f5, bundle, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.bravo).iterator();
        while (it.hasNext()) {
            av avVar = (av) it.next();
            if (z2) {
                avVar.getClass();
            }
            r8.e eVar = avVar.alpha;
        }
    }

    public void kilo(ai f5, boolean z2) {
        Intrinsics.echo(f5, "f");
        ai aiVar = ((L) this.alpha).zulu;
        if (aiVar != null) {
            L parentFragmentManager = aiVar.getParentFragmentManager();
            Intrinsics.delta(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.papa.kilo(f5, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.bravo).iterator();
        while (it.hasNext()) {
            av avVar = (av) it.next();
            if (z2) {
                avVar.getClass();
            }
            r8.e eVar = avVar.alpha;
        }
    }

    public void lima(ai f5, boolean z2) {
        Intrinsics.echo(f5, "f");
        ai aiVar = ((L) this.alpha).zulu;
        if (aiVar != null) {
            L parentFragmentManager = aiVar.getParentFragmentManager();
            Intrinsics.delta(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.papa.lima(f5, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.bravo).iterator();
        while (it.hasNext()) {
            av avVar = (av) it.next();
            if (z2) {
                avVar.getClass();
            }
            r8.e eVar = avVar.alpha;
        }
    }

    public void mike(ai f5, View v4, boolean z2) {
        Intrinsics.echo(f5, "f");
        Intrinsics.echo(v4, "v");
        ai aiVar = ((L) this.alpha).zulu;
        if (aiVar != null) {
            L parentFragmentManager = aiVar.getParentFragmentManager();
            Intrinsics.delta(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.papa.mike(f5, v4, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.bravo).iterator();
        while (it.hasNext()) {
            av avVar = (av) it.next();
            if (z2) {
                avVar.getClass();
            }
            r8.e eVar = avVar.alpha;
        }
    }

    public void november(ai f5, boolean z2) {
        Intrinsics.echo(f5, "f");
        ai aiVar = ((L) this.alpha).zulu;
        if (aiVar != null) {
            L parentFragmentManager = aiVar.getParentFragmentManager();
            Intrinsics.delta(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.papa.november(f5, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.bravo).iterator();
        while (it.hasNext()) {
            av avVar = (av) it.next();
            if (z2) {
                avVar.getClass();
            }
            r8.e eVar = avVar.alpha;
        }
    }

    public ao(Animation animation) {
        this.alpha = animation;
        this.bravo = null;
    }

    public ao(Animator animator) {
        this.alpha = null;
        AnimatorSet animatorSet = new AnimatorSet();
        this.bravo = animatorSet;
        animatorSet.play(animator);
    }
}
