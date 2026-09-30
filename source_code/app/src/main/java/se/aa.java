package se;

import ff.C1717b;
import gf.C1791f;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import oe.C2240k;
import pe.C2339o;
import pe.InterfaceC2330f;
import pe.au;
import qe.C2471g;
import qe.InterfaceC2472h;

/* loaded from: classes2.dex */
public final class aa extends AbstractC2860j {

    /* renamed from: a, reason: collision with root package name */
    public int f13709a;

    /* renamed from: b, reason: collision with root package name */
    public C2339o f13710b;

    /* renamed from: c, reason: collision with root package name */
    public kotlin.reflect.jvm.internal.impl.types.l f13711c;

    /* renamed from: d, reason: collision with root package name */
    public ArrayList f13712d;
    public final ArrayList e;

    /* renamed from: f, reason: collision with root package name */
    public final C1717b f13713f;
    public final int yellow;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public aa(C2240k c2240k, Ne.f fVar, C1717b c1717b) {
        super(c1717b, c2240k, fVar, r0);
        pe.ao aoVar = pe.an.magenta;
        if (fVar != null) {
            if (c1717b != null) {
                this.e = new ArrayList();
                this.f13713f = c1717b;
                this.yellow = 2;
                return;
            }
            victor(4);
            throw null;
        }
        victor(2);
        throw null;
    }

    public static /* synthetic */ void victor(int i4) {
        String str;
        int i5;
        switch (i4) {
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i4) {
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                i5 = 2;
                break;
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            default:
                i5 = 3;
                break;
        }
        Object[] objArr = new Object[i5];
        switch (i4) {
            case 1:
                objArr[0] = "kind";
                break;
            case 2:
                objArr[0] = "name";
                break;
            case 3:
                objArr[0] = "source";
                break;
            case 4:
                objArr[0] = "storageManager";
                break;
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/MutableClassDescriptor";
                break;
            case 6:
                objArr[0] = "modality";
                break;
            case 9:
                objArr[0] = "visibility";
                break;
            case 12:
                objArr[0] = "supertype";
                break;
            case 14:
                objArr[0] = "typeParameters";
                break;
            case 16:
                objArr[0] = "kotlinTypeRefiner";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i4) {
            case 5:
                objArr[1] = "getAnnotations";
                break;
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/MutableClassDescriptor";
                break;
            case 7:
                objArr[1] = "getModality";
                break;
            case 8:
                objArr[1] = "getKind";
                break;
            case 10:
                objArr[1] = "getVisibility";
                break;
            case 11:
                objArr[1] = "getTypeConstructor";
                break;
            case 13:
                objArr[1] = "getConstructors";
                break;
            case 15:
                objArr[1] = "getDeclaredTypeParameters";
                break;
            case 17:
                objArr[1] = "getUnsubstitutedMemberScope";
                break;
            case 18:
                objArr[1] = "getStaticScope";
                break;
            case 19:
                objArr[1] = "getSealedSubclasses";
                break;
        }
        switch (i4) {
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                break;
            case 6:
                objArr[2] = "setModality";
                break;
            case 9:
                objArr[2] = "setVisibility";
                break;
            case 12:
                objArr[2] = "addSupertype";
                break;
            case 14:
                objArr[2] = "setTypeParameterDescriptors";
                break;
            case 16:
                objArr[2] = "getUnsubstitutedMemberScope";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i4) {
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                throw new IllegalStateException(format);
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
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
        int i4 = this.yellow;
        if (i4 != 0) {
            return i4;
        }
        victor(8);
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
        C2339o c2339o = this.f13710b;
        if (c2339o != null) {
            return c2339o;
        }
        victor(10);
        throw null;
    }

    @Override // pe.InterfaceC2330f, pe.InterfaceC2348x
    public final int golf() {
        int i4 = this.f13709a;
        if (i4 != 0) {
            return i4;
        }
        victor(7);
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
        return null;
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
        ArrayList arrayList = this.f13712d;
        if (arrayList != null) {
            return arrayList;
        }
        victor(15);
        throw null;
    }

    @Override // se.y
    public final Xe.n sierra(C1791f c1791f) {
        return Xe.m.bravo;
    }

    @Override // pe.InterfaceC2330f
    public final au t() {
        return null;
    }

    @Override // pe.InterfaceC2332h
    public final kotlin.reflect.jvm.internal.impl.types.ap tango() {
        kotlin.reflect.jvm.internal.impl.types.l lVar = this.f13711c;
        if (lVar != null) {
            return lVar;
        }
        victor(11);
        throw null;
    }

    public final String toString() {
        return AbstractC2863m.X(this);
    }

    @Override // pe.InterfaceC2330f
    public final boolean uniform() {
        return false;
    }

    @Override // pe.InterfaceC2330f
    public final Collection xray() {
        Set set = Collections.EMPTY_SET;
        if (set != null) {
            return set;
        }
        victor(13);
        throw null;
    }

    @Override // pe.InterfaceC2348x
    public final boolean y() {
        return false;
    }
}
