package se;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.types.ax;
import pe.C2339o;
import pe.InterfaceC2317a;
import pe.InterfaceC2328d;
import pe.InterfaceC2330f;
import pe.InterfaceC2336l;
import pe.InterfaceC2338n;
import pe.InterfaceC2345u;
import qe.InterfaceC2472h;

/* loaded from: classes2.dex */
public abstract class af extends AbstractC2864n implements pe.ak {

    /* renamed from: a, reason: collision with root package name */
    public final pe.al f13714a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f13715b;

    /* renamed from: c, reason: collision with root package name */
    public final int f13716c;

    /* renamed from: d, reason: collision with root package name */
    public C2339o f13717d;
    public InterfaceC2345u e;
    public boolean teal;
    public final boolean white;
    public final int yellow;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public af(int i4, C2339o c2339o, pe.al alVar, InterfaceC2472h interfaceC2472h, Ne.f fVar, boolean z2, boolean z10, boolean z11, int i5, pe.an anVar) {
        super(alVar.lima(), interfaceC2472h, fVar, anVar);
        if (i4 != 0) {
            if (c2339o != null) {
                if (interfaceC2472h != null) {
                    if (anVar != null) {
                        this.e = null;
                        this.yellow = i4;
                        this.f13717d = c2339o;
                        this.f13714a = alVar;
                        this.teal = z2;
                        this.white = z10;
                        this.f13715b = z11;
                        this.f13716c = i5;
                        return;
                    }
                    D(5);
                    throw null;
                }
                D(3);
                throw null;
            }
            D(1);
            throw null;
        }
        D(0);
        throw null;
    }

    public static /* synthetic */ void D(int i4) {
        String str;
        int i5;
        switch (i4) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 7:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i4) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                i5 = 2;
                break;
            case 7:
            default:
                i5 = 3;
                break;
        }
        Object[] objArr = new Object[i5];
        switch (i4) {
            case 1:
                objArr[0] = "visibility";
                break;
            case 2:
                objArr[0] = "correspondingProperty";
                break;
            case 3:
                objArr[0] = "annotations";
                break;
            case 4:
                objArr[0] = "name";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyAccessorDescriptorImpl";
                break;
            case 7:
                objArr[0] = "substitutor";
                break;
            case 16:
                objArr[0] = "overriddenDescriptors";
                break;
            default:
                objArr[0] = "modality";
                break;
        }
        switch (i4) {
            case 6:
                objArr[1] = "getKind";
                break;
            case 7:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyAccessorDescriptorImpl";
                break;
            case 8:
                objArr[1] = "substitute";
                break;
            case 9:
                objArr[1] = "getTypeParameters";
                break;
            case 10:
                objArr[1] = "getModality";
                break;
            case 11:
                objArr[1] = "getVisibility";
                break;
            case 12:
                objArr[1] = "getCorrespondingVariable";
                break;
            case 13:
                objArr[1] = "getCorrespondingProperty";
                break;
            case 14:
                objArr[1] = "getContextReceiverParameters";
                break;
            case 15:
                objArr[1] = "getOverriddenDescriptors";
                break;
        }
        switch (i4) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                break;
            case 7:
                objArr[2] = "substitute";
                break;
            case 16:
                objArr[2] = "setOverriddenDescriptors";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i4) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                throw new IllegalStateException(format);
            case 7:
            default:
                throw new IllegalArgumentException(format);
        }
    }

    @Override // pe.InterfaceC2328d
    public final InterfaceC2328d A(InterfaceC2330f interfaceC2330f, int i4, C2339o c2339o) {
        throw new UnsupportedOperationException("Accessors must be copied by the corresponding property");
    }

    public final pe.al Z() {
        pe.al alVar = this.f13714a;
        if (alVar != null) {
            return alVar;
        }
        D(13);
        throw null;
    }

    @Override // pe.InterfaceC2326b
    public final C2871u a() {
        return Z().a();
    }

    public final ArrayList a0(boolean z2) {
        InterfaceC2338n charlie;
        ArrayList arrayList = new ArrayList(0);
        for (pe.al alVar : Z().mike()) {
            if (z2) {
                charlie = alVar.bravo();
            } else {
                charlie = alVar.charlie();
            }
            if (charlie != null) {
                arrayList.add(charlie);
            }
        }
        return arrayList;
    }

    @Override // pe.InterfaceC2326b
    public final boolean blue() {
        return false;
    }

    @Override // pe.InterfaceC2345u, pe.ap
    public final InterfaceC2345u delta(ax axVar) {
        if (axVar != null) {
            return this;
        }
        D(7);
        throw null;
    }

    @Override // pe.InterfaceC2348x
    public final boolean emerald() {
        return false;
    }

    @Override // pe.InterfaceC2326b
    public final C2871u g() {
        return Z().g();
    }

    @Override // pe.InterfaceC2326b
    public final List getTypeParameters() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        D(9);
        throw null;
    }

    @Override // pe.InterfaceC2338n, pe.InterfaceC2348x
    public final C2339o getVisibility() {
        C2339o c2339o = this.f13717d;
        if (c2339o != null) {
            return c2339o;
        }
        D(11);
        throw null;
    }

    @Override // pe.InterfaceC2348x
    public final int golf() {
        int i4 = this.yellow;
        if (i4 != 0) {
            return i4;
        }
        D(10);
        throw null;
    }

    @Override // pe.InterfaceC2348x
    public final boolean isExternal() {
        return this.white;
    }

    @Override // pe.InterfaceC2345u
    public final boolean isInfix() {
        return false;
    }

    @Override // pe.InterfaceC2345u
    public final boolean isInline() {
        return this.f13715b;
    }

    @Override // pe.InterfaceC2345u
    public final boolean isOperator() {
        return false;
    }

    @Override // pe.InterfaceC2345u
    public final boolean isSuspend() {
        return false;
    }

    @Override // pe.InterfaceC2345u
    public final boolean jade() {
        return false;
    }

    @Override // pe.InterfaceC2326b
    public final List l() {
        List l10 = Z().l();
        if (l10 != null) {
            return l10;
        }
        D(14);
        throw null;
    }

    @Override // pe.InterfaceC2328d
    public final int november() {
        int i4 = this.f13716c;
        if (i4 != 0) {
            return i4;
        }
        D(6);
        throw null;
    }

    @Override // pe.InterfaceC2326b
    public final Object orange(InterfaceC2317a interfaceC2317a) {
        return null;
    }

    @Override // pe.InterfaceC2345u
    public final boolean q() {
        return false;
    }

    @Override // pe.InterfaceC2328d
    public final void r(Collection collection) {
        if (collection != null) {
            return;
        }
        D(16);
        throw null;
    }

    @Override // pe.InterfaceC2345u
    public final boolean v() {
        return false;
    }

    @Override // pe.InterfaceC2348x
    public final boolean y() {
        return false;
    }

    @Override // pe.InterfaceC2345u
    public final InterfaceC2345u yellow() {
        return this.e;
    }

    @Override // pe.ap
    public final /* bridge */ /* synthetic */ InterfaceC2336l delta(ax axVar) {
        delta(axVar);
        return this;
    }
}
