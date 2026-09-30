package se;

import gf.C1791f;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import pe.AbstractC2340p;
import pe.C2339o;
import pe.InterfaceC2330f;
import pe.au;
import qe.InterfaceC2472h;

/* renamed from: se.q, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2867q extends AbstractC2860j {

    /* renamed from: a, reason: collision with root package name */
    public final C2866p f13757a;

    /* renamed from: b, reason: collision with root package name */
    public final ff.i f13758b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC2472h f13759c;
    public final kotlin.reflect.jvm.internal.impl.types.l yellow;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2867q(ff.l lVar, InterfaceC2330f interfaceC2330f, kotlin.reflect.jvm.internal.impl.types.ae aeVar, Ne.f fVar, ff.i iVar, InterfaceC2472h interfaceC2472h, pe.an anVar) {
        super(lVar, interfaceC2330f, fVar, anVar);
        if (lVar != null) {
            if (interfaceC2330f != null) {
                if (aeVar != null) {
                    if (fVar != null) {
                        if (iVar != null) {
                            this.f13759c = interfaceC2472h;
                            this.yellow = new kotlin.reflect.jvm.internal.impl.types.l(this, Collections.EMPTY_LIST, Collections.singleton(aeVar), lVar);
                            this.f13757a = new C2866p(this, lVar);
                            this.f13758b = iVar;
                            return;
                        }
                        victor(10);
                        throw null;
                    }
                    victor(9);
                    throw null;
                }
                victor(8);
                throw null;
            }
            victor(7);
            throw null;
        }
        victor(6);
        throw null;
    }

    public static C2867q cyan(ff.l lVar, InterfaceC2330f interfaceC2330f, Ne.f fVar, ff.i iVar, InterfaceC2472h interfaceC2472h, pe.an anVar) {
        if (lVar != null) {
            if (interfaceC2330f != null) {
                if (fVar != null) {
                    if (iVar != null) {
                        return new C2867q(lVar, interfaceC2330f, interfaceC2330f.oscar(), fVar, iVar, interfaceC2472h, anVar);
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
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i4) {
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                i5 = 2;
                break;
            default:
                i5 = 3;
                break;
        }
        Object[] objArr = new Object[i5];
        switch (i4) {
            case 1:
                objArr[0] = "enumClass";
                break;
            case 2:
            case 9:
                objArr[0] = "name";
                break;
            case 3:
            case 10:
                objArr[0] = "enumMemberNames";
                break;
            case 4:
            case 11:
                objArr[0] = "annotations";
                break;
            case 5:
            case 12:
                objArr[0] = "source";
                break;
            case 6:
            default:
                objArr[0] = "storageManager";
                break;
            case 7:
                objArr[0] = "containingClass";
                break;
            case 8:
                objArr[0] = "supertype";
                break;
            case 13:
                objArr[0] = "kotlinTypeRefiner";
                break;
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor";
                break;
        }
        switch (i4) {
            case 14:
                objArr[1] = "getUnsubstitutedMemberScope";
                break;
            case 15:
                objArr[1] = "getStaticScope";
                break;
            case 16:
                objArr[1] = "getConstructors";
                break;
            case 17:
                objArr[1] = "getTypeConstructor";
                break;
            case 18:
                objArr[1] = "getKind";
                break;
            case 19:
                objArr[1] = "getModality";
                break;
            case 20:
                objArr[1] = "getVisibility";
                break;
            case 21:
                objArr[1] = "getAnnotations";
                break;
            case 22:
                objArr[1] = "getDeclaredTypeParameters";
                break;
            case 23:
                objArr[1] = "getSealedSubclasses";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor";
                break;
        }
        switch (i4) {
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                objArr[2] = "<init>";
                break;
            case 13:
                objArr[2] = "getUnsubstitutedMemberScope";
                break;
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                break;
            default:
                objArr[2] = "create";
                break;
        }
        String format = String.format(str, objArr);
        switch (i4) {
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                throw new IllegalStateException(format);
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
        return 4;
    }

    @Override // pe.InterfaceC2330f
    public final Collection coral() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        victor(23);
        throw null;
    }

    @Override // pe.InterfaceC2348x
    public final boolean emerald() {
        return false;
    }

    @Override // qe.InterfaceC2465a
    public final InterfaceC2472h getAnnotations() {
        InterfaceC2472h interfaceC2472h = this.f13759c;
        if (interfaceC2472h != null) {
            return interfaceC2472h;
        }
        victor(21);
        throw null;
    }

    @Override // pe.InterfaceC2330f, pe.InterfaceC2338n, pe.InterfaceC2348x
    public final C2339o getVisibility() {
        C2339o c2339o = AbstractC2340p.echo;
        if (c2339o != null) {
            return c2339o;
        }
        victor(20);
        throw null;
    }

    @Override // pe.InterfaceC2330f, pe.InterfaceC2348x
    public final int golf() {
        return 1;
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
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        victor(22);
        throw null;
    }

    @Override // se.y
    public final Xe.n sierra(C1791f c1791f) {
        C2866p c2866p = this.f13757a;
        if (c2866p != null) {
            return c2866p;
        }
        victor(14);
        throw null;
    }

    @Override // pe.InterfaceC2330f
    public final au t() {
        return null;
    }

    @Override // pe.InterfaceC2332h
    public final kotlin.reflect.jvm.internal.impl.types.ap tango() {
        kotlin.reflect.jvm.internal.impl.types.l lVar = this.yellow;
        if (lVar != null) {
            return lVar;
        }
        victor(17);
        throw null;
    }

    public final String toString() {
        return "enum entry " + getName();
    }

    @Override // pe.InterfaceC2330f
    public final boolean uniform() {
        return false;
    }

    @Override // pe.InterfaceC2330f
    public final Collection xray() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        victor(16);
        throw null;
    }

    @Override // pe.InterfaceC2348x
    public final boolean y() {
        return false;
    }
}
