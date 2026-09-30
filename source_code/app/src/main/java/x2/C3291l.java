package x2;

import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import androidx.fragment.app.RunnableC0617l;
import androidx.fragment.app.RunnableC0628x;
import androidx.fragment.app.d0;
import delivery.samurai.android.R;
import java.util.ArrayList;
import o1.C2188a;

/* renamed from: x2.l, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C3291l extends d0 {
    @Override // androidx.fragment.app.d0
    public final void alpha(View view, Object obj) {
        ((z) obj).bravo(view);
    }

    @Override // androidx.fragment.app.d0
    public final void bravo(Object obj, ArrayList arrayList) {
        z zVar = (z) obj;
        if (zVar != null) {
            int i4 = 0;
            if (zVar instanceof af) {
                af afVar = (af) zVar;
                int size = afVar.f14063y.size();
                while (i4 < size) {
                    bravo(afVar.jade(i4), arrayList);
                    i4++;
                }
                return;
            }
            if (d0.kilo(zVar.teal) && d0.kilo(zVar.white)) {
                int size2 = arrayList.size();
                while (i4 < size2) {
                    zVar.bravo((View) arrayList.get(i4));
                    i4++;
                }
            }
        }
    }

    @Override // androidx.fragment.app.d0
    public final void charlie(Object obj) {
        w wVar = (w) obj;
        wVar.alpha();
        wVar.delta.alpha((float) (wVar.golf.f14092r + 1));
    }

    @Override // androidx.fragment.app.d0
    public final void delta(Object obj, RunnableC0617l runnableC0617l) {
        w wVar = (w) obj;
        wVar.foxtrot = runnableC0617l;
        wVar.alpha();
        wVar.delta.alpha(0.0f);
    }

    @Override // androidx.fragment.app.d0
    public final void echo(ViewGroup viewGroup, Object obj) {
        ad.alpha(viewGroup, (z) obj);
    }

    @Override // androidx.fragment.app.d0
    public final boolean golf(Object obj) {
        return obj instanceof z;
    }

    @Override // androidx.fragment.app.d0
    public final Object hotel(Object obj) {
        if (obj != null) {
            return ((z) obj).clone();
        }
        return null;
    }

    @Override // androidx.fragment.app.d0
    public final Object india(ViewGroup viewGroup, Object obj) {
        z zVar = (z) obj;
        ArrayList arrayList = ad.charlie;
        if (arrayList.contains(viewGroup) || !viewGroup.isLaidOut() || Build.VERSION.SDK_INT < 34) {
            return null;
        }
        if (zVar.uniform()) {
            arrayList.add(viewGroup);
            z clone = zVar.clone();
            af afVar = new af();
            afVar.ivory(clone);
            ad.echo(viewGroup, afVar);
            viewGroup.setTag(R.id.transition_current_scene, null);
            ad.delta(viewGroup, afVar);
            viewGroup.invalidate();
            w wVar = new w(afVar);
            afVar.f14093s = wVar;
            afVar.alpha(wVar);
            return afVar.f14093s;
        }
        throw new IllegalArgumentException("The Transition must support seeking.");
    }

    @Override // androidx.fragment.app.d0
    public final boolean lima() {
        return true;
    }

    @Override // androidx.fragment.app.d0
    public final boolean mike(Object obj) {
        boolean uniform = ((z) obj).uniform();
        if (!uniform) {
            Log.v("FragmentManager", "Predictive back not available for AndroidX Transition " + obj + ". Please enable seeking support for the designated transition by overriding isSeekingSupported().");
        }
        return uniform;
    }

    @Override // androidx.fragment.app.d0
    public final Object november(Object obj, Object obj2, Object obj3) {
        z zVar = (z) obj;
        z zVar2 = (z) obj2;
        z zVar3 = (z) obj3;
        if (zVar != null && zVar2 != null) {
            af afVar = new af();
            afVar.ivory(zVar);
            afVar.ivory(zVar2);
            afVar.maroon(1);
            zVar = afVar;
        } else if (zVar == null) {
            if (zVar2 != null) {
                zVar = zVar2;
            } else {
                zVar = null;
            }
        }
        if (zVar3 != null) {
            af afVar2 = new af();
            if (zVar != null) {
                afVar2.ivory(zVar);
            }
            afVar2.ivory(zVar3);
            return afVar2;
        }
        return zVar;
    }

    @Override // androidx.fragment.app.d0
    public final Object oscar(Object obj, Object obj2) {
        af afVar = new af();
        if (obj != null) {
            afVar.ivory((z) obj);
        }
        afVar.ivory((z) obj2);
        return afVar;
    }

    @Override // androidx.fragment.app.d0
    public final void papa(Object obj, View view, ArrayList arrayList) {
        ((z) obj).alpha(new C3288i(view, arrayList));
    }

    @Override // androidx.fragment.app.d0
    public final void quebec(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2) {
        ((z) obj).alpha(new C3289j(this, obj2, arrayList, obj3, arrayList2));
    }

    @Override // androidx.fragment.app.d0
    public final void romeo(Object obj, float f5) {
        w wVar = (w) obj;
        boolean z2 = wVar.bravo;
        if (z2) {
            af afVar = wVar.golf;
            long j5 = afVar.f14092r;
            long j6 = f5 * ((float) j5);
            if (j6 == 0) {
                j6 = 1;
            }
            if (j6 == j5) {
                j6 = j5 - 1;
            }
            if (wVar.delta == null) {
                long j7 = wVar.alpha;
                if (j6 != j7 && z2) {
                    if (!wVar.charlie) {
                        if (j6 == 0 && j7 > 0) {
                            j6 = -1;
                        } else if (j6 == j5 && j7 < j5) {
                            j6 = j5 + 1;
                        }
                        if (j6 != j7) {
                            afVar.bronze(j6, j7);
                            wVar.alpha = j6;
                        }
                    }
                    long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                    B0.a aVar = wVar.echo;
                    int i4 = (aVar.bravo + 1) % 20;
                    aVar.bravo = i4;
                    ((long[]) aVar.charlie)[i4] = currentAnimationTimeMillis;
                    ((float[]) aVar.delta)[i4] = (float) j6;
                    return;
                }
                return;
            }
            throw new IllegalStateException("setCurrentPlayTimeMillis() called after animation has been started");
        }
    }

    @Override // androidx.fragment.app.d0
    public final void sierra(View view, Object obj) {
        if (view != null) {
            Rect rect = new Rect();
            d0.juliet(view, rect);
            ((z) obj).crimson(new C3287h(0, rect));
        }
    }

    @Override // androidx.fragment.app.d0
    public final void tango(Object obj, Rect rect) {
        ((z) obj).crimson(new C3287h(1, rect));
    }

    @Override // androidx.fragment.app.d0
    public final void uniform(androidx.fragment.app.ai aiVar, Object obj, C2188a c2188a, Runnable runnable) {
        victor(obj, c2188a, null, runnable);
    }

    @Override // androidx.fragment.app.d0
    public final void victor(Object obj, C2188a c2188a, RunnableC0628x runnableC0628x, Runnable runnable) {
        z zVar = (z) obj;
        A2.p pVar = new A2.p(runnableC0628x, zVar, runnable, 19);
        synchronized (c2188a) {
            while (c2188a.charlie) {
                try {
                    try {
                        c2188a.wait();
                    } catch (InterruptedException unused) {
                    }
                } finally {
                }
            }
            if (c2188a.bravo != pVar) {
                c2188a.bravo = pVar;
                if (c2188a.alpha) {
                    RunnableC0628x runnableC0628x2 = (RunnableC0628x) pVar.purple;
                    if (runnableC0628x2 == null) {
                        ((z) pVar.red).cancel();
                        ((Runnable) pVar.silver).run();
                    } else {
                        runnableC0628x2.run();
                    }
                }
            }
        }
        zVar.alpha(new C3290k(runnable));
    }

    @Override // androidx.fragment.app.d0
    public final void whiskey(Object obj, View view, ArrayList arrayList) {
        af afVar = (af) obj;
        ArrayList arrayList2 = afVar.white;
        arrayList2.clear();
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            d0.foxtrot(arrayList2, (View) arrayList.get(i4));
        }
        arrayList2.add(view);
        arrayList.add(view);
        bravo(afVar, arrayList);
    }

    @Override // androidx.fragment.app.d0
    public final void xray(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        af afVar = (af) obj;
        if (afVar != null) {
            ArrayList arrayList3 = afVar.white;
            arrayList3.clear();
            arrayList3.addAll(arrayList2);
            zulu(afVar, arrayList, arrayList2);
        }
    }

    @Override // androidx.fragment.app.d0
    public final Object yankee(Object obj) {
        if (obj == null) {
            return null;
        }
        af afVar = new af();
        afVar.ivory((z) obj);
        return afVar;
    }

    public final void zulu(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        int size;
        z zVar = (z) obj;
        int i4 = 0;
        if (zVar instanceof af) {
            af afVar = (af) zVar;
            int size2 = afVar.f14063y.size();
            while (i4 < size2) {
                zulu(afVar.jade(i4), arrayList, arrayList2);
                i4++;
            }
            return;
        }
        if (d0.kilo(zVar.teal)) {
            ArrayList arrayList3 = zVar.white;
            if (arrayList3.size() == arrayList.size() && arrayList3.containsAll(arrayList)) {
                if (arrayList2 == null) {
                    size = 0;
                } else {
                    size = arrayList2.size();
                }
                while (i4 < size) {
                    zVar.bravo((View) arrayList2.get(i4));
                    i4++;
                }
                for (int size3 = arrayList.size() - 1; size3 >= 0; size3--) {
                    zVar.beige((View) arrayList.get(size3));
                }
            }
        }
    }
}
