package se;

import com.clevertap.android.sdk.Constants;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import pe.C2339o;
import pe.InterfaceC2337m;
import qe.InterfaceC2472h;

/* loaded from: classes2.dex */
public final class aj extends af implements pe.ak {

    /* renamed from: f, reason: collision with root package name */
    public aq f13738f;

    /* renamed from: g, reason: collision with root package name */
    public final aj f13739g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aj(pe.al alVar, InterfaceC2472h interfaceC2472h, int i4, C2339o c2339o, boolean z2, boolean z10, boolean z11, int i5, aj ajVar, pe.an anVar) {
        super(i4, c2339o, alVar, interfaceC2472h, Ne.f.golf("<set-" + alVar.getName() + ">"), z2, z10, z11, i5, anVar);
        aj ajVar2;
        if (interfaceC2472h != null) {
            if (i4 != 0) {
                if (c2339o != null) {
                    if (i5 != 0) {
                        if (anVar != null) {
                            if (ajVar != null) {
                                ajVar2 = ajVar;
                            } else {
                                ajVar2 = this;
                            }
                            this.f13739g = ajVar2;
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
        switch (i4) {
            case 10:
            case 11:
            case 12:
            case 13:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i4) {
            case 10:
            case 11:
            case 12:
            case 13:
                i5 = 2;
                break;
            default:
                i5 = 3;
                break;
        }
        Object[] objArr = new Object[i5];
        switch (i4) {
            case 1:
            case 9:
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
                objArr[0] = "parameter";
                break;
            case 7:
                objArr[0] = "setterDescriptor";
                break;
            case 8:
                objArr[0] = Constants.KEY_TYPE;
                break;
            case 10:
            case 11:
            case 12:
            case 13:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertySetterDescriptorImpl";
                break;
            default:
                objArr[0] = "correspondingProperty";
                break;
        }
        switch (i4) {
            case 10:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 11:
                objArr[1] = "getValueParameters";
                break;
            case 12:
                objArr[1] = "getReturnType";
                break;
            case 13:
                objArr[1] = "getOriginal";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertySetterDescriptorImpl";
                break;
        }
        switch (i4) {
            case 6:
                objArr[2] = "initialize";
                break;
            case 7:
            case 8:
            case 9:
                objArr[2] = "createSetterParameter";
                break;
            case 10:
            case 11:
            case 12:
            case 13:
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i4) {
            case 10:
            case 11:
            case 12:
            case 13:
                throw new IllegalStateException(format);
            default:
                throw new IllegalArgumentException(format);
        }
    }

    public static aq b0(aj ajVar, kotlin.reflect.jvm.internal.impl.types.y yVar, InterfaceC2472h interfaceC2472h) {
        if (yVar != null) {
            if (interfaceC2472h != null) {
                return new aq(ajVar, null, 0, interfaceC2472h, Ne.h.golf, yVar, false, false, false, null, pe.an.magenta);
            }
            D(9);
            throw null;
        }
        D(8);
        throw null;
    }

    @Override // se.AbstractC2864n, se.AbstractC2863m, pe.InterfaceC2335k, pe.InterfaceC2332h
    /* renamed from: c0, reason: merged with bridge method [inline-methods] */
    public final aj alpha() {
        aj ajVar = this.f13739g;
        if (ajVar != null) {
            return ajVar;
        }
        D(13);
        throw null;
    }

    @Override // pe.InterfaceC2326b
    public final kotlin.reflect.jvm.internal.impl.types.y getReturnType() {
        return Ue.e.echo(this).victor();
    }

    @Override // pe.InterfaceC2328d, pe.InterfaceC2326b
    public final Collection mike() {
        return a0(false);
    }

    @Override // pe.InterfaceC2326b
    public final List peach() {
        aq aqVar = this.f13738f;
        if (aqVar != null) {
            List singletonList = Collections.singletonList(aqVar);
            if (singletonList != null) {
                return singletonList;
            }
            D(11);
            throw null;
        }
        throw new IllegalStateException();
    }

    @Override // pe.InterfaceC2335k
    public final Object quebec(InterfaceC2337m interfaceC2337m, Object obj) {
        return interfaceC2337m.india(this, obj);
    }
}
