package se;

import gf.C1791f;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import pe.AbstractC2340p;
import pe.C2339o;
import pe.InterfaceC2330f;
import pe.InterfaceC2335k;
import pe.au;
import qe.C2471g;
import qe.InterfaceC2472h;

/* renamed from: se.k, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2861k extends AbstractC2860j {

    /* renamed from: a, reason: collision with root package name */
    public final int f13753a;

    /* renamed from: b, reason: collision with root package name */
    public final kotlin.reflect.jvm.internal.impl.types.l f13754b;

    /* renamed from: c, reason: collision with root package name */
    public Xe.n f13755c;

    /* renamed from: d, reason: collision with root package name */
    public Set f13756d;
    public C2859i e;
    public final int yellow;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C2861k(InterfaceC2335k interfaceC2335k, Ne.f fVar, int i4, int i5, List list, ff.l lVar) {
        super(lVar, interfaceC2335k, fVar, r0);
        pe.ao aoVar = pe.an.magenta;
        if (interfaceC2335k != null) {
            if (fVar != null) {
                if (i4 != 0) {
                    if (i5 != 0) {
                        if (list != null) {
                            if (lVar != null) {
                                this.yellow = i4;
                                this.f13753a = i5;
                                this.f13754b = new kotlin.reflect.jvm.internal.impl.types.l(this, Collections.EMPTY_LIST, list, lVar);
                                return;
                            }
                            victor(6);
                            throw null;
                        }
                        victor(4);
                        throw null;
                    }
                    victor(3);
                    throw null;
                }
                victor(2);
                throw null;
            }
            victor(1);
            throw null;
        }
        victor(0);
        throw null;
    }

    public static /* synthetic */ void victor(int i4) {
        String str;
        int i5;
        switch (i4) {
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 12:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i4) {
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                i5 = 2;
                break;
            case 12:
            default:
                i5 = 3;
                break;
        }
        Object[] objArr = new Object[i5];
        switch (i4) {
            case 1:
                objArr[0] = "name";
                break;
            case 2:
                objArr[0] = "modality";
                break;
            case 3:
                objArr[0] = "kind";
                break;
            case 4:
                objArr[0] = "supertypes";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
                objArr[0] = "storageManager";
                break;
            case 7:
                objArr[0] = "unsubstitutedMemberScope";
                break;
            case 8:
                objArr[0] = "constructors";
                break;
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorImpl";
                break;
            case 12:
                objArr[0] = "kotlinTypeRefiner";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i4) {
            case 9:
                objArr[1] = "getAnnotations";
                break;
            case 10:
                objArr[1] = "getTypeConstructor";
                break;
            case 11:
                objArr[1] = "getConstructors";
                break;
            case 12:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorImpl";
                break;
            case 13:
                objArr[1] = "getUnsubstitutedMemberScope";
                break;
            case 14:
                objArr[1] = "getStaticScope";
                break;
            case 15:
                objArr[1] = "getKind";
                break;
            case 16:
                objArr[1] = "getModality";
                break;
            case 17:
                objArr[1] = "getVisibility";
                break;
            case 18:
                objArr[1] = "getDeclaredTypeParameters";
                break;
            case 19:
                objArr[1] = "getSealedSubclasses";
                break;
        }
        switch (i4) {
            case 7:
            case 8:
                objArr[2] = "initialize";
                break;
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                break;
            case 12:
                objArr[2] = "getUnsubstitutedMemberScope";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i4) {
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                throw new IllegalStateException(format);
            case 12:
            default:
                throw new IllegalArgumentException(format);
        }
    }

    @Override // pe.InterfaceC2330f
    public final boolean B() {
        return false;
    }

    @Override // pe.InterfaceC2330f
    public final boolean azure() {
        return false;
    }

    @Override // pe.InterfaceC2330f
    public final int c() {
        int i4 = this.f13753a;
        if (i4 != 0) {
            return i4;
        }
        victor(15);
        throw null;
    }

    @Override // pe.InterfaceC2330f
    public final Collection coral() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        victor(19);
        throw null;
    }

    public final void cyan(Xe.n nVar, Set set, C2859i c2859i) {
        this.f13755c = nVar;
        this.f13756d = set;
        this.e = c2859i;
    }

    @Override // pe.InterfaceC2348x
    public final boolean emerald() {
        return false;
    }

    @Override // qe.InterfaceC2465a
    public final InterfaceC2472h getAnnotations() {
        return C2471g.alpha;
    }

    @Override // pe.InterfaceC2330f, pe.InterfaceC2338n, pe.InterfaceC2348x
    public final C2339o getVisibility() {
        C2339o c2339o = AbstractC2340p.echo;
        if (c2339o != null) {
            return c2339o;
        }
        victor(17);
        throw null;
    }

    @Override // pe.InterfaceC2330f, pe.InterfaceC2348x
    public final int golf() {
        int i4 = this.yellow;
        if (i4 != 0) {
            return i4;
        }
        victor(16);
        throw null;
    }

    @Override // pe.InterfaceC2330f
    public final boolean hotel() {
        return false;
    }

    @Override // pe.InterfaceC2333i
    public final boolean india() {
        return false;
    }

    @Override // pe.InterfaceC2330f
    public final boolean isInline() {
        return false;
    }

    @Override // pe.InterfaceC2330f
    public final C2859i lavender() {
        return this.e;
    }

    @Override // pe.InterfaceC2330f
    public final Xe.n lime() {
        return Xe.m.bravo;
    }

    @Override // pe.InterfaceC2330f
    public final InterfaceC2330f maroon() {
        return null;
    }

    @Override // pe.InterfaceC2330f, pe.InterfaceC2333i
    public final List papa() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        victor(18);
        throw null;
    }

    @Override // se.y
    public final Xe.n sierra(C1791f c1791f) {
        Xe.n nVar = this.f13755c;
        if (nVar != null) {
            return nVar;
        }
        victor(13);
        throw null;
    }

    @Override // pe.InterfaceC2330f
    public final au t() {
        return null;
    }

    @Override // pe.InterfaceC2332h
    public final kotlin.reflect.jvm.internal.impl.types.ap tango() {
        kotlin.reflect.jvm.internal.impl.types.l lVar = this.f13754b;
        if (lVar != null) {
            return lVar;
        }
        victor(10);
        throw null;
    }

    public String toString() {
        return "class " + getName();
    }

    @Override // pe.InterfaceC2330f
    public final boolean uniform() {
        return false;
    }

    @Override // pe.InterfaceC2330f
    public final Collection xray() {
        Set set = this.f13756d;
        if (set != null) {
            return set;
        }
        victor(11);
        throw null;
    }

    @Override // pe.InterfaceC2348x
    public final boolean y() {
        return false;
    }
}
