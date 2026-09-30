package androidx.lifecycle;

import androidx.appcompat.widget.P0;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import yf.AbstractC3428A;

/* loaded from: classes3.dex */
public final class an extends ac {
    public final boolean bravo;
    public aq.a charlie;
    public ab delta;
    public final WeakReference echo;
    public int foxtrot;
    public boolean golf;
    public boolean hotel;
    public final ArrayList india;
    public final yf.N juliet;

    public an(al alVar, boolean z2) {
        this.bravo = z2;
        this.charlie = new aq.a();
        ab abVar = ab.purple;
        this.delta = abVar;
        this.india = new ArrayList();
        this.echo = new WeakReference(alVar);
        this.juliet = AbstractC3428A.charlie(abVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, androidx.lifecycle.am] */
    @Override // androidx.lifecycle.ac
    public final void alpha(ak observer) {
        aj ajVar;
        al alVar;
        ArrayList arrayList = this.india;
        int i4 = 0;
        Intrinsics.echo(observer, "observer");
        echo("addObserver");
        ab abVar = this.delta;
        ab abVar2 = ab.alpha;
        if (abVar != abVar2) {
            abVar2 = ab.purple;
        }
        ?? obj = new Object();
        Intrinsics.checkNotNull(observer);
        HashMap hashMap = ap.alpha;
        boolean z2 = observer instanceof aj;
        boolean z10 = observer instanceof InterfaceC0640j;
        if (z2 && z10) {
            ajVar = new C0642l((InterfaceC0640j) observer, (aj) observer);
        } else if (z10) {
            ajVar = new C0642l((InterfaceC0640j) observer, (aj) null);
        } else if (z2) {
            ajVar = (aj) observer;
        } else {
            Class<?> cls = observer.getClass();
            if (ap.bravo(cls) == 2) {
                Object obj2 = ap.bravo.get(cls);
                Intrinsics.checkNotNull(obj2);
                List list = (List) obj2;
                if (list.size() == 1) {
                    ap.alpha((Constructor) list.get(0), observer);
                    Intrinsics.echo(null, "generatedAdapter");
                    ajVar = new Object();
                } else {
                    int size = list.size();
                    InterfaceC0650u[] interfaceC0650uArr = new InterfaceC0650u[size];
                    for (int i5 = 0; i5 < size; i5++) {
                        ap.alpha((Constructor) list.get(i5), observer);
                        interfaceC0650uArr[i5] = null;
                    }
                    ajVar = new C0637g(i4, interfaceC0650uArr);
                }
            } else {
                ajVar = new C0642l(observer);
            }
        }
        obj.bravo = ajVar;
        obj.alpha = abVar2;
        if (((am) this.charlie.bravo(observer, obj)) != null || (alVar = (al) this.echo.get()) == null) {
            return;
        }
        if (this.foxtrot != 0 || this.golf) {
            i4 = 1;
        }
        ab delta = delta(observer);
        this.foxtrot++;
        while (obj.alpha.compareTo(delta) < 0 && this.charlie.teal.containsKey(observer)) {
            arrayList.add(obj.alpha);
            C0654y c0654y = aa.Companion;
            ab abVar3 = obj.alpha;
            c0654y.getClass();
            aa bravo = C0654y.bravo(abVar3);
            if (bravo != null) {
                obj.alpha(alVar, bravo);
                arrayList.remove(arrayList.size() - 1);
                delta = delta(observer);
            } else {
                throw new IllegalStateException("no event up from " + obj.alpha);
            }
        }
        if (i4 == 0) {
            india();
        }
        this.foxtrot--;
    }

    @Override // androidx.lifecycle.ac
    public final ab bravo() {
        return this.delta;
    }

    @Override // androidx.lifecycle.ac
    public final void charlie(ak observer) {
        Intrinsics.echo(observer, "observer");
        echo("removeObserver");
        this.charlie.delta(observer);
    }

    public final ab delta(ak akVar) {
        aq.c cVar;
        ab abVar;
        HashMap hashMap = this.charlie.teal;
        ab abVar2 = null;
        if (hashMap.containsKey(akVar)) {
            cVar = ((aq.c) hashMap.get(akVar)).silver;
        } else {
            cVar = null;
        }
        if (cVar != null) {
            abVar = ((am) cVar.purple).alpha;
        } else {
            abVar = null;
        }
        ArrayList arrayList = this.india;
        if (!arrayList.isEmpty()) {
            abVar2 = (ab) P0.amber(1, arrayList);
        }
        ab state1 = this.delta;
        Intrinsics.echo(state1, "state1");
        if (abVar == null || abVar.compareTo(state1) >= 0) {
            abVar = state1;
        }
        if (abVar2 != null && abVar2.compareTo(abVar) < 0) {
            return abVar2;
        }
        return abVar;
    }

    public final void echo(String str) {
        if (this.bravo && !ap.b.charlie().delta()) {
            throw new IllegalStateException(ao.ad.gray("Method ", str, " must be called on the main thread").toString());
        }
    }

    public final void foxtrot(aa event) {
        Intrinsics.echo(event, "event");
        echo("handleLifecycleEvent");
        golf(event.alpha());
    }

    public final void golf(ab next) {
        if (this.delta != next) {
            al alVar = (al) this.echo.get();
            ab current = this.delta;
            Intrinsics.echo(current, "current");
            Intrinsics.echo(next, "next");
            if (current == ab.purple && next == ab.alpha) {
                throw new IllegalStateException(("State must be at least '" + ab.red + "' to be moved to '" + next + "' in component " + alVar).toString());
            }
            ab abVar = ab.alpha;
            if (current == abVar && current != next) {
                throw new IllegalStateException(("State is '" + abVar + "' and cannot be moved to `" + next + "` in component " + alVar).toString());
            }
            this.delta = next;
            if (!this.golf && this.foxtrot == 0) {
                this.golf = true;
                india();
                this.golf = false;
                if (this.delta == abVar) {
                    this.charlie = new aq.a();
                    return;
                }
                return;
            }
            this.hotel = true;
        }
    }

    public final void hotel(ab state) {
        Intrinsics.echo(state, "state");
        echo("setCurrentState");
        golf(state);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0030, code lost:
    
        r7.hotel = false;
        r7.juliet.india(r7.delta);
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0039, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void india() {
        al alVar = (al) this.echo.get();
        if (alVar == null) {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
        }
        while (true) {
            aq.a aVar = this.charlie;
            if (aVar.silver != 0) {
                aq.c cVar = aVar.alpha;
                Intrinsics.checkNotNull(cVar);
                ab abVar = ((am) cVar.purple).alpha;
                aq.c cVar2 = this.charlie.purple;
                Intrinsics.checkNotNull(cVar2);
                ab abVar2 = ((am) cVar2.purple).alpha;
                if (abVar == abVar2 && this.delta == abVar2) {
                    break;
                }
                this.hotel = false;
                ab abVar3 = this.delta;
                aq.c cVar3 = this.charlie.alpha;
                Intrinsics.checkNotNull(cVar3);
                if (abVar3.compareTo(((am) cVar3.purple).alpha) < 0) {
                    aq.a aVar2 = this.charlie;
                    aq.b bVar = new aq.b(aVar2.purple, aVar2.alpha, 1);
                    aVar2.red.put(bVar, Boolean.FALSE);
                    while (bVar.hasNext() && !this.hotel) {
                        Map.Entry entry = (Map.Entry) bVar.next();
                        Intrinsics.checkNotNull(entry);
                        ak akVar = (ak) entry.getKey();
                        am amVar = (am) entry.getValue();
                        while (amVar.alpha.compareTo(this.delta) > 0 && !this.hotel && this.charlie.teal.containsKey(akVar)) {
                            C0654y c0654y = aa.Companion;
                            ab abVar4 = amVar.alpha;
                            c0654y.getClass();
                            aa alpha = C0654y.alpha(abVar4);
                            if (alpha != null) {
                                this.india.add(alpha.alpha());
                                amVar.alpha(alVar, alpha);
                                this.india.remove(r4.size() - 1);
                            } else {
                                throw new IllegalStateException("no event down from " + amVar.alpha);
                            }
                        }
                    }
                }
                aq.c cVar4 = this.charlie.purple;
                if (!this.hotel && cVar4 != null && this.delta.compareTo(((am) cVar4.purple).alpha) > 0) {
                    aq.a aVar3 = this.charlie;
                    aVar3.getClass();
                    aq.d dVar = new aq.d(aVar3);
                    aVar3.red.put(dVar, Boolean.FALSE);
                    while (dVar.hasNext() && !this.hotel) {
                        Map.Entry entry2 = (Map.Entry) dVar.next();
                        ak akVar2 = (ak) entry2.getKey();
                        am amVar2 = (am) entry2.getValue();
                        while (amVar2.alpha.compareTo(this.delta) < 0 && !this.hotel && this.charlie.teal.containsKey(akVar2)) {
                            this.india.add(amVar2.alpha);
                            C0654y c0654y2 = aa.Companion;
                            ab abVar5 = amVar2.alpha;
                            c0654y2.getClass();
                            aa bravo = C0654y.bravo(abVar5);
                            if (bravo != null) {
                                amVar2.alpha(alVar, bravo);
                                this.india.remove(r4.size() - 1);
                            } else {
                                throw new IllegalStateException("no event up from " + amVar2.alpha);
                            }
                        }
                    }
                }
            } else {
                break;
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public an(al provider) {
        this(provider, true);
        Intrinsics.echo(provider, "provider");
    }
}
