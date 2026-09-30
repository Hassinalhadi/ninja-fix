package Fe;

import Of.aa;
import Of.ae;
import Pf.y;
import Pf.z;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.maps.android.BuildConfig;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import s1.InterfaceC2566A;

/* loaded from: classes2.dex */
public final class d implements InterfaceC2566A {
    public boolean alpha;
    public int bravo;
    public final Object charlie;

    public d(Of.k kVar, Pf.a aVar) {
        this.charlie = aVar;
        this.alpha = kVar.charlie;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object charlie(d dVar, kotlin.b bVar, Pd.a aVar) {
        z zVar;
        int i4;
        byte golf;
        LinkedHashMap linkedHashMap;
        Pf.a aVar2;
        d dVar2;
        byte b2;
        LinkedHashMap linkedHashMap2;
        String juliet;
        if (aVar instanceof z) {
            zVar = (z) aVar;
            int i5 = zVar.yellow;
            if ((i5 & RecyclerView.UNDEFINED_DURATION) != 0) {
                zVar.yellow = i5 - RecyclerView.UNDEFINED_DURATION;
                Object obj = zVar.teal;
                Od.a aVar3 = Od.a.alpha;
                i4 = zVar.yellow;
                if (i4 == 0) {
                    if (i4 == 1) {
                        String str = zVar.silver;
                        linkedHashMap2 = zVar.red;
                        dVar2 = zVar.purple;
                        kotlin.b bVar2 = zVar.alpha;
                        ResultKt.alpha(obj);
                        linkedHashMap2.put(str, (Of.n) obj);
                        b2 = ((Pf.a) dVar2.charlie).foxtrot();
                        if (b2 != 4) {
                            if (b2 != 7) {
                                Pf.a.romeo((Pf.a) dVar2.charlie, "Expected end of the object or comma", 0, null, 6);
                                throw null;
                            }
                            Pf.a aVar4 = (Pf.a) dVar2.charlie;
                            if (b2 != 6) {
                                aVar4.golf((byte) 7);
                            } else if (b2 == 4) {
                                Pf.r.lima(aVar4, "object");
                                throw null;
                            }
                            return new aa(linkedHashMap2);
                        }
                        golf = b2;
                        dVar = dVar2;
                        linkedHashMap = linkedHashMap2;
                        bVar = bVar2;
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.alpha(obj);
                    Pf.a aVar5 = (Pf.a) dVar.charlie;
                    golf = aVar5.golf((byte) 6);
                    if (aVar5.whiskey() != 4) {
                        linkedHashMap = new LinkedHashMap();
                    } else {
                        Pf.a.romeo(aVar5, "Unexpected leading comma", 0, null, 6);
                        throw null;
                    }
                }
                aVar2 = (Pf.a) dVar.charlie;
                if (!aVar2.charlie()) {
                    if (dVar.alpha) {
                        juliet = aVar2.lima();
                    } else {
                        juliet = aVar2.juliet();
                    }
                    aVar2.golf((byte) 5);
                    Unit unit = Unit.INSTANCE;
                    zVar.alpha = bVar;
                    zVar.purple = dVar;
                    zVar.red = linkedHashMap;
                    zVar.silver = juliet;
                    zVar.yellow = 1;
                    bVar.getClass();
                    bVar.red = zVar;
                    bVar.purple = unit;
                    return aVar3;
                }
                byte b4 = golf;
                dVar2 = dVar;
                b2 = b4;
                linkedHashMap2 = linkedHashMap;
                Pf.a aVar42 = (Pf.a) dVar2.charlie;
                if (b2 != 6) {
                }
                return new aa(linkedHashMap2);
            }
        }
        zVar = new z(dVar, aVar);
        Object obj2 = zVar.teal;
        Od.a aVar32 = Od.a.alpha;
        i4 = zVar.yellow;
        if (i4 == 0) {
        }
        aVar2 = (Pf.a) dVar.charlie;
        if (!aVar2.charlie()) {
        }
    }

    @Override // s1.InterfaceC2566A
    public void alpha() {
        this.alpha = true;
    }

    @Override // s1.InterfaceC2566A
    public void bravo() {
        if (this.alpha) {
            return;
        }
        ActionBarContextView actionBarContextView = (ActionBarContextView) this.charlie;
        actionBarContextView.white = null;
        ActionBarContextView.bravo(actionBarContextView, this.bravo);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v7, types: [kotlin.b, java.lang.Object, Nd.c] */
    public Of.n delta() {
        Of.n aaVar;
        String juliet;
        Object obj;
        Pf.a aVar = (Pf.a) this.charlie;
        byte whiskey = aVar.whiskey();
        if (whiskey == 1) {
            return foxtrot(true);
        }
        if (whiskey == 0) {
            return foxtrot(false);
        }
        if (whiskey == 6) {
            int i4 = this.bravo + 1;
            this.bravo = i4;
            if (i4 == 200) {
                y yVar = new y(this, null);
                Unit unit = Unit.INSTANCE;
                Object obj2 = kotlin.a.alpha;
                ?? obj3 = new Object();
                obj3.alpha = yVar;
                obj3.purple = unit;
                obj3.red = obj3;
                Object obj4 = kotlin.a.alpha;
                obj3.silver = obj4;
                while (true) {
                    obj = obj3.silver;
                    Nd.c cVar = obj3.red;
                    if (cVar == null) {
                        break;
                    }
                    if (Intrinsics.areEqual(obj4, obj)) {
                        try {
                            y yVar2 = obj3.alpha;
                            Unit unit2 = obj3.purple;
                            kotlin.jvm.internal.x.echo(3, yVar2);
                            Object invoke = yVar2.invoke(obj3, unit2, cVar);
                            if (invoke != Od.a.alpha) {
                                cVar.resumeWith(Result.m206constructorimpl(invoke));
                            }
                        } catch (Throwable th) {
                            Result.Companion companion = Result.INSTANCE;
                            cVar.resumeWith(Result.m206constructorimpl(ResultKt.createFailure(th)));
                        }
                    } else {
                        obj3.silver = obj4;
                        cVar.resumeWith(obj);
                    }
                }
                ResultKt.alpha(obj);
                aaVar = (Of.n) obj;
            } else {
                byte golf = aVar.golf((byte) 6);
                if (aVar.whiskey() != 4) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    while (true) {
                        if (!aVar.charlie()) {
                            break;
                        }
                        if (this.alpha) {
                            juliet = aVar.lima();
                        } else {
                            juliet = aVar.juliet();
                        }
                        aVar.golf((byte) 5);
                        linkedHashMap.put(juliet, delta());
                        golf = aVar.foxtrot();
                        if (golf != 4) {
                            if (golf != 7) {
                                Pf.a.romeo(aVar, "Expected end of the object or comma", 0, null, 6);
                                throw null;
                            }
                        }
                    }
                    if (golf == 6) {
                        aVar.golf((byte) 7);
                    } else if (golf == 4) {
                        Pf.r.lima(aVar, "object");
                        throw null;
                    }
                    aaVar = new aa(linkedHashMap);
                } else {
                    Pf.a.romeo(aVar, "Unexpected leading comma", 0, null, 6);
                    throw null;
                }
            }
            this.bravo--;
            return aaVar;
        }
        if (whiskey == 8) {
            return echo();
        }
        Pf.a.romeo(aVar, "Cannot read Json element because of unexpected ".concat(Pf.r.romeo(whiskey)), 0, null, 6);
        throw null;
    }

    public Of.f echo() {
        boolean z2;
        Pf.a aVar = (Pf.a) this.charlie;
        byte foxtrot = aVar.foxtrot();
        if (aVar.whiskey() != 4) {
            ArrayList arrayList = new ArrayList();
            while (aVar.charlie()) {
                arrayList.add(delta());
                foxtrot = aVar.foxtrot();
                if (foxtrot != 4) {
                    if (foxtrot == 9) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    int i4 = aVar.alpha;
                    if (!z2) {
                        Pf.a.romeo(aVar, "Expected end of the array or comma", i4, null, 4);
                        throw null;
                    }
                }
            }
            if (foxtrot == 8) {
                aVar.golf((byte) 9);
            } else if (foxtrot == 4) {
                Pf.r.lima(aVar, "array");
                throw null;
            }
            return new Of.f(arrayList);
        }
        Pf.a.romeo(aVar, "Unexpected leading comma", 0, null, 6);
        throw null;
    }

    public ae foxtrot(boolean z2) {
        String lima;
        Pf.a aVar = (Pf.a) this.charlie;
        if (!this.alpha && z2) {
            lima = aVar.juliet();
        } else {
            lima = aVar.lima();
        }
        if (!z2 && Intrinsics.areEqual(lima, BuildConfig.TRAVIS)) {
            return Of.x.INSTANCE;
        }
        return new Of.u(lima, z2);
    }

    @Override // s1.InterfaceC2566A
    public void onAnimationStart() {
        ActionBarContextView.alpha((ActionBarContextView) this.charlie);
        this.alpha = false;
    }

    public d(FloatingActionButton floatingActionButton) {
        this.alpha = false;
        this.bravo = 0;
        this.charlie = floatingActionButton;
    }

    public d(kotlin.reflect.jvm.internal.impl.types.ae aeVar, int i4, boolean z2) {
        this.charlie = aeVar;
        this.bravo = i4;
        this.alpha = z2;
    }

    public d(ActionBarContextView actionBarContextView) {
        this.charlie = actionBarContextView;
        this.alpha = false;
    }
}
