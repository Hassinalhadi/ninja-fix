package se;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import pe.C2339o;
import pe.InterfaceC2337m;
import qe.InterfaceC2472h;

/* loaded from: classes2.dex */
public final class ai extends af implements pe.ak {

    /* renamed from: f, reason: collision with root package name */
    public kotlin.reflect.jvm.internal.impl.types.y f13736f;

    /* renamed from: g, reason: collision with root package name */
    public final ai f13737g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ai(pe.al alVar, InterfaceC2472h interfaceC2472h, int i4, C2339o c2339o, boolean z2, boolean z10, boolean z11, int i5, ai aiVar, pe.an anVar) {
        super(i4, c2339o, alVar, interfaceC2472h, Ne.f.golf("<get-" + alVar.getName() + ">"), z2, z10, z11, i5, anVar);
        ai aiVar2;
        if (interfaceC2472h != null) {
            if (i4 != 0) {
                if (c2339o != null) {
                    if (i5 != 0) {
                        if (anVar != null) {
                            if (aiVar != null) {
                                aiVar2 = aiVar;
                            } else {
                                aiVar2 = this;
                            }
                            this.f13737g = aiVar2;
                            return;
                        }
                        D(5);
                        throw null;
                    }
                    D(4);
                    throw null;
                }
                D(3);
                throw null;
            }
            D(2);
            throw null;
        }
        D(1);
        throw null;
    }

    public static /* synthetic */ void D(int i4) {
        String str;
        int i5;
        if (i4 != 6 && i4 != 7 && i4 != 8) {
            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i4 != 6 && i4 != 7 && i4 != 8) {
            i5 = 3;
        } else {
            i5 = 2;
        }
        Object[] objArr = new Object[i5];
        switch (i4) {
            case 1:
                objArr[0] = "annotations";
                break;
            case 2:
                objArr[0] = "modality";
                break;
            case 3:
                objArr[0] = "visibility";
                break;
            case 4:
                objArr[0] = "kind";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
            case 7:
            case 8:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyGetterDescriptorImpl";
                break;
            default:
                objArr[0] = "correspondingProperty";
                break;
        }
        if (i4 != 6) {
            if (i4 != 7) {
                if (i4 != 8) {
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyGetterDescriptorImpl";
                } else {
                    objArr[1] = "getOriginal";
                }
            } else {
                objArr[1] = "getValueParameters";
            }
        } else {
            objArr[1] = "getOverriddenDescriptors";
        }
        if (i4 != 6 && i4 != 7 && i4 != 8) {
            objArr[2] = "<init>";
        }
        String format = String.format(str, objArr);
        if (i4 == 6 || i4 == 7 || i4 == 8) {
            throw new IllegalStateException(format);
        }
    }

    @Override // se.AbstractC2864n, se.AbstractC2863m, pe.InterfaceC2335k, pe.InterfaceC2332h
    /* renamed from: b0, reason: merged with bridge method [inline-methods] */
    public final ai alpha() {
        ai aiVar = this.f13737g;
        if (aiVar != null) {
            return aiVar;
        }
        D(8);
        throw null;
    }

    public final void c0(kotlin.reflect.jvm.internal.impl.types.y yVar) {
        if (yVar == null) {
            yVar = Z().getType();
        }
        this.f13736f = yVar;
    }

    @Override // pe.InterfaceC2326b
    public final kotlin.reflect.jvm.internal.impl.types.y getReturnType() {
        return this.f13736f;
    }

    @Override // pe.InterfaceC2328d, pe.InterfaceC2326b
    public final Collection mike() {
        return a0(true);
    }

    @Override // pe.InterfaceC2326b
    public final List peach() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        D(7);
        throw null;
    }

    @Override // pe.InterfaceC2335k
    public final Object quebec(InterfaceC2337m interfaceC2337m, Object obj) {
        return interfaceC2337m.gold(this, obj);
    }
}
