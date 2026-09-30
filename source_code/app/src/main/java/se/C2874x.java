package se;

import gf.C1791f;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.av;
import kotlin.reflect.jvm.internal.impl.types.ax;
import kotlin.reflect.jvm.internal.impl.types.az;
import pe.C2339o;
import pe.C2346v;
import pe.C2350z;
import pe.InterfaceC2330f;
import pe.InterfaceC2335k;
import pe.InterfaceC2336l;
import pe.InterfaceC2337m;
import pe.au;
import qe.InterfaceC2472h;

/* renamed from: se.x, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2874x extends y {
    public final y alpha;
    public final ax purple;
    public ax red;
    public ArrayList silver;
    public ArrayList teal;
    public kotlin.reflect.jvm.internal.impl.types.l white;

    public C2874x(y yVar, ax axVar) {
        this.alpha = yVar;
        this.purple = axVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c6 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00c2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void victor(int i4) {
        String str;
        int i5;
        String format;
        if (i4 != 2 && i4 != 3 && i4 != 5 && i4 != 6 && i4 != 8 && i4 != 10 && i4 != 13 && i4 != 23) {
            str = "@NotNull method %s.%s must not return null";
        } else {
            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        }
        if (i4 != 2 && i4 != 3 && i4 != 5 && i4 != 6 && i4 != 8 && i4 != 10 && i4 != 13 && i4 != 23) {
            i5 = 2;
        } else {
            i5 = 3;
        }
        Object[] objArr = new Object[i5];
        if (i4 != 2) {
            if (i4 != 3) {
                if (i4 != 5) {
                    if (i4 != 6) {
                        if (i4 != 8) {
                            if (i4 != 10) {
                                if (i4 != 13) {
                                    if (i4 != 23) {
                                        objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazySubstitutingClassDescriptor";
                                    } else {
                                        objArr[0] = "substitutor";
                                    }
                                    switch (i4) {
                                        case 2:
                                        case 3:
                                        case 5:
                                        case 6:
                                        case 8:
                                        case 10:
                                        case 13:
                                        case 23:
                                            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazySubstitutingClassDescriptor";
                                            break;
                                        case 4:
                                        case 7:
                                        case 9:
                                        case 11:
                                            objArr[1] = "getMemberScope";
                                            break;
                                        case 12:
                                        case 14:
                                            objArr[1] = "getUnsubstitutedMemberScope";
                                            break;
                                        case 15:
                                            objArr[1] = "getStaticScope";
                                            break;
                                        case 16:
                                            objArr[1] = "getDefaultType";
                                            break;
                                        case 17:
                                            objArr[1] = "getContextReceivers";
                                            break;
                                        case 18:
                                            objArr[1] = "getConstructors";
                                            break;
                                        case 19:
                                            objArr[1] = "getAnnotations";
                                            break;
                                        case 20:
                                            objArr[1] = "getName";
                                            break;
                                        case 21:
                                            objArr[1] = "getOriginal";
                                            break;
                                        case 22:
                                            objArr[1] = "getContainingDeclaration";
                                            break;
                                        case 24:
                                            objArr[1] = "substitute";
                                            break;
                                        case 25:
                                            objArr[1] = "getKind";
                                            break;
                                        case 26:
                                            objArr[1] = "getModality";
                                            break;
                                        case 27:
                                            objArr[1] = "getVisibility";
                                            break;
                                        case 28:
                                            objArr[1] = "getUnsubstitutedInnerClassesScope";
                                            break;
                                        case 29:
                                            objArr[1] = "getSource";
                                            break;
                                        case 30:
                                            objArr[1] = "getDeclaredTypeParameters";
                                            break;
                                        case 31:
                                            objArr[1] = "getSealedSubclasses";
                                            break;
                                        default:
                                            objArr[1] = "getTypeConstructor";
                                            break;
                                    }
                                    if (i4 == 2 && i4 != 3 && i4 != 5 && i4 != 6 && i4 != 8 && i4 != 10) {
                                        if (i4 != 13) {
                                            if (i4 == 23) {
                                                objArr[2] = "substitute";
                                            }
                                        } else {
                                            objArr[2] = "getUnsubstitutedMemberScope";
                                        }
                                    } else {
                                        objArr[2] = "getMemberScope";
                                    }
                                    format = String.format(str, objArr);
                                    if (i4 != 2 || i4 == 3 || i4 == 5 || i4 == 6 || i4 == 8 || i4 == 10 || i4 == 13 || i4 == 23) {
                                        throw new IllegalArgumentException(format);
                                    }
                                    throw new IllegalStateException(format);
                                }
                            }
                        }
                    }
                }
                objArr[0] = "typeSubstitution";
                switch (i4) {
                }
                if (i4 == 2) {
                }
                objArr[2] = "getMemberScope";
                format = String.format(str, objArr);
                if (i4 != 2) {
                }
                throw new IllegalArgumentException(format);
            }
            objArr[0] = "kotlinTypeRefiner";
            switch (i4) {
            }
            if (i4 == 2) {
            }
            objArr[2] = "getMemberScope";
            format = String.format(str, objArr);
            if (i4 != 2) {
            }
            throw new IllegalArgumentException(format);
        }
        objArr[0] = "typeArguments";
        switch (i4) {
        }
        if (i4 == 2) {
        }
        objArr[2] = "getMemberScope";
        format = String.format(str, objArr);
        if (i4 != 2) {
        }
        throw new IllegalArgumentException(format);
    }

    @Override // pe.InterfaceC2330f
    public final boolean B() {
        return this.alpha.B();
    }

    @Override // pe.InterfaceC2330f
    public final C2871u C() {
        throw new UnsupportedOperationException();
    }

    @Override // se.y, pe.InterfaceC2330f, pe.InterfaceC2335k, pe.InterfaceC2332h
    public final InterfaceC2330f alpha() {
        InterfaceC2330f alpha = this.alpha.alpha();
        if (alpha != null) {
            return alpha;
        }
        victor(21);
        throw null;
    }

    @Override // pe.InterfaceC2330f
    public final boolean azure() {
        return this.alpha.azure();
    }

    @Override // pe.InterfaceC2330f
    public final int c() {
        int c3 = this.alpha.c();
        if (c3 != 0) {
            return c3;
        }
        victor(25);
        throw null;
    }

    @Override // pe.InterfaceC2330f
    public final Collection coral() {
        Collection coral = this.alpha.coral();
        if (coral != null) {
            return coral;
        }
        victor(31);
        throw null;
    }

    public final ax crimson() {
        if (this.red == null) {
            ax axVar = this.purple;
            if (axVar.alpha.echo()) {
                this.red = axVar;
            } else {
                List parameters = this.alpha.tango().getParameters();
                this.silver = new ArrayList(parameters.size());
                this.red = kotlin.reflect.jvm.internal.impl.types.c.uniform(parameters, axVar.foxtrot(), this, this.silver);
                ArrayList arrayList = this.silver;
                Intrinsics.echo(arrayList, "<this>");
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : arrayList) {
                    if (!((pe.aq) obj).j()) {
                        arrayList2.add(obj);
                    }
                }
                this.teal = arrayList2;
            }
        }
        return this.red;
    }

    @Override // pe.ap
    public final InterfaceC2336l delta(ax axVar) {
        if (axVar != null) {
            if (axVar.alpha.echo()) {
                return this;
            }
            return new C2874x(this, ax.echo(axVar.foxtrot(), crimson().foxtrot()));
        }
        victor(23);
        throw null;
    }

    @Override // pe.InterfaceC2336l
    public final pe.an echo() {
        return pe.an.magenta;
    }

    @Override // pe.InterfaceC2348x
    public final boolean emerald() {
        return this.alpha.emerald();
    }

    @Override // se.y
    public final Xe.n foxtrot(av avVar, C1791f c1791f) {
        Xe.n foxtrot = this.alpha.foxtrot(avVar, c1791f);
        if (this.purple.alpha.echo()) {
            if (foxtrot != null) {
                return foxtrot;
            }
            victor(7);
            throw null;
        }
        return new Xe.t(foxtrot, crimson());
    }

    @Override // qe.InterfaceC2465a
    public final InterfaceC2472h getAnnotations() {
        InterfaceC2472h annotations = this.alpha.getAnnotations();
        if (annotations != null) {
            return annotations;
        }
        victor(19);
        throw null;
    }

    @Override // pe.InterfaceC2335k
    public final Ne.f getName() {
        Ne.f name = this.alpha.getName();
        if (name != null) {
            return name;
        }
        victor(20);
        throw null;
    }

    @Override // pe.InterfaceC2330f, pe.InterfaceC2338n, pe.InterfaceC2348x
    public final C2339o getVisibility() {
        C2339o visibility = this.alpha.getVisibility();
        if (visibility != null) {
            return visibility;
        }
        victor(27);
        throw null;
    }

    @Override // pe.InterfaceC2330f, pe.InterfaceC2348x
    public final int golf() {
        int golf = this.alpha.golf();
        if (golf != 0) {
            return golf;
        }
        victor(26);
        throw null;
    }

    @Override // pe.InterfaceC2330f
    public final boolean hotel() {
        return this.alpha.hotel();
    }

    @Override // pe.InterfaceC2333i
    public final boolean india() {
        return this.alpha.india();
    }

    @Override // pe.InterfaceC2348x
    public final boolean isExternal() {
        return this.alpha.isExternal();
    }

    @Override // pe.InterfaceC2330f
    public final boolean isInline() {
        return this.alpha.isInline();
    }

    @Override // pe.InterfaceC2330f
    public final C2859i lavender() {
        return this.alpha.lavender();
    }

    @Override // pe.InterfaceC2335k
    public final InterfaceC2335k lima() {
        InterfaceC2335k lima = this.alpha.lima();
        if (lima != null) {
            return lima;
        }
        victor(22);
        throw null;
    }

    @Override // pe.InterfaceC2330f
    public final Xe.n lime() {
        Xe.n lime = this.alpha.lime();
        if (lime != null) {
            return lime;
        }
        victor(15);
        throw null;
    }

    @Override // pe.InterfaceC2330f
    public final InterfaceC2330f maroon() {
        return this.alpha.maroon();
    }

    @Override // pe.InterfaceC2330f, pe.InterfaceC2332h
    public final kotlin.reflect.jvm.internal.impl.types.ae oscar() {
        kotlin.reflect.jvm.internal.impl.types.al echo;
        List echo2 = az.echo(tango().getParameters());
        InterfaceC2472h annotations = getAnnotations();
        if (annotations.isEmpty()) {
            kotlin.reflect.jvm.internal.impl.types.al.purple.getClass();
            echo = kotlin.reflect.jvm.internal.impl.types.al.red;
        } else {
            com.google.android.play.core.integrity.k kVar = kotlin.reflect.jvm.internal.impl.types.al.purple;
            List juliet = kotlin.collections.ab.juliet(new kotlin.reflect.jvm.internal.impl.types.j(annotations));
            kVar.getClass();
            echo = com.google.android.play.core.integrity.k.echo(juliet);
        }
        return kotlin.reflect.jvm.internal.impl.types.ab.delta(x(), echo2, echo, tango(), false);
    }

    @Override // pe.InterfaceC2330f, pe.InterfaceC2333i
    public final List papa() {
        crimson();
        ArrayList arrayList = this.teal;
        if (arrayList != null) {
            return arrayList;
        }
        victor(30);
        throw null;
    }

    @Override // pe.InterfaceC2335k
    public final Object quebec(InterfaceC2337m interfaceC2337m, Object obj) {
        return interfaceC2337m.jade(this, obj);
    }

    @Override // pe.InterfaceC2330f
    public final Xe.n red(av avVar) {
        Ue.e.india(Qe.e.delta(this));
        return foxtrot(avVar, C1791f.alpha);
    }

    @Override // pe.InterfaceC2330f
    public final Xe.n s() {
        Xe.n s3 = this.alpha.s();
        if (s3 != null) {
            return s3;
        }
        victor(28);
        throw null;
    }

    @Override // se.y
    public final Xe.n sierra(C1791f c1791f) {
        Xe.n sierra = this.alpha.sierra(c1791f);
        if (this.purple.alpha.echo()) {
            if (sierra != null) {
                return sierra;
            }
            victor(14);
            throw null;
        }
        return new Xe.t(sierra, crimson());
    }

    @Override // pe.InterfaceC2330f
    public final au t() {
        int collectionSizeOrDefault;
        au t5 = this.alpha.t();
        if (t5 == null) {
            return null;
        }
        boolean z2 = t5 instanceof C2346v;
        ax axVar = this.purple;
        if (z2) {
            C2346v c2346v = (C2346v) t5;
            kotlin.reflect.jvm.internal.impl.types.ae aeVar = (kotlin.reflect.jvm.internal.impl.types.ae) c2346v.bravo;
            if (aeVar != null && !axVar.alpha.echo()) {
                aeVar = (kotlin.reflect.jvm.internal.impl.types.ae) crimson().india(1, aeVar);
            }
            return new C2346v(c2346v.alpha, aeVar);
        }
        if (t5 instanceof C2350z) {
            ArrayList arrayList = ((C2350z) t5).alpha;
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10);
            ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Pair pair = (Pair) it.next();
                Ne.f fVar = (Ne.f) pair.first;
                kotlin.reflect.jvm.internal.impl.types.ae aeVar2 = (kotlin.reflect.jvm.internal.impl.types.ae) ((p000if.d) pair.second);
                if (aeVar2 != null && !axVar.alpha.echo()) {
                    aeVar2 = (kotlin.reflect.jvm.internal.impl.types.ae) crimson().india(1, aeVar2);
                }
                arrayList2.add(new Pair(fVar, aeVar2));
            }
            return new C2350z(arrayList2);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // pe.InterfaceC2332h
    public final kotlin.reflect.jvm.internal.impl.types.ap tango() {
        kotlin.reflect.jvm.internal.impl.types.ap tango = this.alpha.tango();
        if (this.purple.alpha.echo()) {
            if (tango != null) {
                return tango;
            }
            victor(0);
            throw null;
        }
        if (this.white == null) {
            ax crimson = crimson();
            Collection lima = tango.lima();
            ArrayList arrayList = new ArrayList(lima.size());
            Iterator it = lima.iterator();
            while (it.hasNext()) {
                arrayList.add(crimson.india(1, (kotlin.reflect.jvm.internal.impl.types.y) it.next()));
            }
            this.white = new kotlin.reflect.jvm.internal.impl.types.l(this, this.silver, arrayList, ff.l.echo);
        }
        kotlin.reflect.jvm.internal.impl.types.l lVar = this.white;
        if (lVar != null) {
            return lVar;
        }
        victor(1);
        throw null;
    }

    @Override // pe.InterfaceC2330f
    public final boolean uniform() {
        return this.alpha.uniform();
    }

    @Override // pe.InterfaceC2330f
    public final Xe.n x() {
        Ue.e.india(Qe.e.delta(this.alpha));
        return sierra(C1791f.alpha);
    }

    @Override // pe.InterfaceC2330f
    public final Collection xray() {
        Collection<C2859i> xray = this.alpha.xray();
        ArrayList arrayList = new ArrayList(xray.size());
        for (C2859i c2859i : xray) {
            C2859i c2859i2 = c2859i;
            c2859i2.getClass();
            C2869s f02 = c2859i2.f0(ax.bravo);
            f02.teal = c2859i.Y();
            f02.uniform(c2859i2.golf());
            f02.oscar(c2859i2.getVisibility());
            f02.delta(c2859i2.november());
            f02.f13764f = false;
            arrayList.add(((C2859i) f02.f13775q.c0(f02)).delta(crimson()));
        }
        return arrayList;
    }

    @Override // pe.InterfaceC2348x
    public final boolean y() {
        return this.alpha.y();
    }

    @Override // pe.InterfaceC2330f
    public final List z() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        victor(17);
        throw null;
    }
}
