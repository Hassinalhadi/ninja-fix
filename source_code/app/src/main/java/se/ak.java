package se;

import com.clevertap.android.sdk.Constants;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.types.ax;
import pe.C2339o;
import pe.InterfaceC2330f;
import pe.InterfaceC2335k;
import pe.InterfaceC2344t;
import pe.InterfaceC2345u;
import qe.C2470f;
import qe.C2471g;
import qe.InterfaceC2472h;

/* loaded from: classes2.dex */
public class ak extends AbstractC2870t {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ak(InterfaceC2335k interfaceC2335k, ak akVar, InterfaceC2472h interfaceC2472h, Ne.f fVar, int i4, pe.an anVar) {
        super(i4, fVar, interfaceC2335k, akVar, anVar, interfaceC2472h);
        if (interfaceC2335k != null) {
            if (interfaceC2472h != null) {
                if (fVar != null) {
                    if (i4 != 0) {
                        if (anVar != null) {
                            return;
                        } else {
                            D(4);
                            throw null;
                        }
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
        D(0);
        throw null;
    }

    public static /* synthetic */ void D(int i4) {
        String str;
        int i5;
        if (i4 != 13 && i4 != 18 && i4 != 23 && i4 != 24 && i4 != 29 && i4 != 30) {
            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i4 != 13 && i4 != 18 && i4 != 23 && i4 != 24 && i4 != 29 && i4 != 30) {
            i5 = 3;
        } else {
            i5 = 2;
        }
        Object[] objArr = new Object[i5];
        switch (i4) {
            case 1:
            case 6:
            case 27:
                objArr[0] = "annotations";
                break;
            case 2:
            case 7:
                objArr[0] = "name";
                break;
            case 3:
            case 8:
            case 26:
                objArr[0] = "kind";
                break;
            case 4:
            case 9:
            case 28:
                objArr[0] = "source";
                break;
            case 5:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 10:
            case 15:
            case 20:
                objArr[0] = "typeParameters";
                break;
            case 11:
            case 16:
            case 21:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case 12:
            case 17:
            case 22:
                objArr[0] = "visibility";
                break;
            case 13:
            case 18:
            case 23:
            case 24:
            case 29:
            case 30:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/SimpleFunctionDescriptorImpl";
                break;
            case 14:
            case 19:
                objArr[0] = "contextReceiverParameters";
                break;
            case 25:
                objArr[0] = "newOwner";
                break;
        }
        if (i4 != 13 && i4 != 18 && i4 != 23) {
            if (i4 != 24) {
                if (i4 != 29) {
                    if (i4 != 30) {
                        objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/SimpleFunctionDescriptorImpl";
                    } else {
                        objArr[1] = "newCopyBuilder";
                    }
                } else {
                    objArr[1] = Constants.COPY_TYPE;
                }
            } else {
                objArr[1] = "getOriginal";
            }
        } else {
            objArr[1] = "initialize";
        }
        switch (i4) {
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                objArr[2] = "create";
                break;
            case 10:
            case 11:
            case 12:
            case 14:
            case 15:
            case 16:
            case 17:
            case 19:
            case 20:
            case 21:
            case 22:
                objArr[2] = "initialize";
                break;
            case 13:
            case 18:
            case 23:
            case 24:
            case 29:
            case 30:
                break;
            case 25:
            case 26:
            case 27:
            case 28:
                objArr[2] = "createSubstitutedCopy";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        if (i4 == 13 || i4 == 18 || i4 == 23 || i4 == 24 || i4 == 29 || i4 == 30) {
            throw new IllegalStateException(format);
        }
    }

    public static ak k0(InterfaceC2330f interfaceC2330f, Ne.f fVar, int i4, pe.an anVar) {
        C2470f c2470f = C2471g.alpha;
        if (interfaceC2330f != null) {
            if (fVar != null) {
                if (i4 != 0) {
                    if (anVar != null) {
                        return new ak(interfaceC2330f, null, c2470f, fVar, i4, anVar);
                    }
                    D(9);
                    throw null;
                }
                D(8);
                throw null;
            }
            D(7);
            throw null;
        }
        D(5);
        throw null;
    }

    @Override // se.AbstractC2870t
    public AbstractC2870t b0(int i4, Ne.f fVar, InterfaceC2335k interfaceC2335k, InterfaceC2345u interfaceC2345u, pe.an anVar, InterfaceC2472h interfaceC2472h) {
        if (interfaceC2335k != null) {
            if (i4 != 0) {
                if (interfaceC2472h != null) {
                    ak akVar = (ak) interfaceC2345u;
                    if (fVar == null) {
                        fVar = getName();
                    }
                    return new ak(interfaceC2335k, akVar, interfaceC2472h, fVar, i4, anVar);
                }
                D(27);
                throw null;
            }
            D(26);
            throw null;
        }
        D(25);
        throw null;
    }

    @Override // se.AbstractC2870t, se.AbstractC2864n, se.AbstractC2863m, pe.InterfaceC2335k, pe.InterfaceC2332h
    /* renamed from: l0, reason: merged with bridge method [inline-methods] */
    public final ak alpha() {
        ak akVar = (ak) super.alpha();
        if (akVar != null) {
            return akVar;
        }
        D(24);
        throw null;
    }

    @Override // se.AbstractC2870t
    /* renamed from: m0, reason: merged with bridge method [inline-methods] */
    public final ak e0(C2871u c2871u, C2871u c2871u2, List list, List list2, List list3, kotlin.reflect.jvm.internal.impl.types.y yVar, int i4, C2339o c2339o) {
        if (list != null) {
            if (list2 != null) {
                if (list3 != null) {
                    if (c2339o != null) {
                        return n0(c2871u, c2871u2, list, list2, list3, yVar, i4, c2339o, null);
                    }
                    D(17);
                    throw null;
                }
                D(16);
                throw null;
            }
            D(15);
            throw null;
        }
        D(14);
        throw null;
    }

    public ak n0(C2871u c2871u, C2871u c2871u2, List list, List list2, List list3, kotlin.reflect.jvm.internal.impl.types.y yVar, int i4, C2339o c2339o, kotlin.collections.t tVar) {
        if (list != null) {
            if (list2 != null) {
                if (list3 != null) {
                    if (c2339o != null) {
                        super.e0(c2871u, c2871u2, list, list2, list3, yVar, i4, c2339o);
                        return this;
                    }
                    D(22);
                    throw null;
                }
                D(21);
                throw null;
            }
            D(20);
            throw null;
        }
        D(19);
        throw null;
    }

    @Override // se.AbstractC2870t, pe.InterfaceC2345u
    public InterfaceC2344t w() {
        return f0(ax.bravo);
    }
}
