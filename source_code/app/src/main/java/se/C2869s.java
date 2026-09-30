package se;

import com.clevertap.android.sdk.Constants;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.types.av;
import pe.C2339o;
import pe.InterfaceC2330f;
import pe.InterfaceC2335k;
import pe.InterfaceC2344t;
import pe.InterfaceC2345u;
import qe.InterfaceC2472h;

/* renamed from: se.s, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2869s implements InterfaceC2344t {

    /* renamed from: a, reason: collision with root package name */
    public final List f13760a;
    public av alpha;

    /* renamed from: b, reason: collision with root package name */
    public C2871u f13761b;

    /* renamed from: c, reason: collision with root package name */
    public C2871u f13762c;

    /* renamed from: d, reason: collision with root package name */
    public kotlin.reflect.jvm.internal.impl.types.y f13763d;
    public Ne.f e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f13764f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f13765g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f13766h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f13767i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f13768j;

    /* renamed from: k, reason: collision with root package name */
    public List f13769k;

    /* renamed from: l, reason: collision with root package name */
    public InterfaceC2472h f13770l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f13771m;

    /* renamed from: n, reason: collision with root package name */
    public final LinkedHashMap f13772n;

    /* renamed from: o, reason: collision with root package name */
    public Boolean f13773o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f13774p;
    public InterfaceC2335k purple;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ AbstractC2870t f13775q;
    public int red;
    public C2339o silver;
    public InterfaceC2345u teal;
    public int white;
    public List yellow;

    public C2869s(AbstractC2870t abstractC2870t, av avVar, InterfaceC2335k interfaceC2335k, int i4, C2339o c2339o, int i5, List list, List list2, C2871u c2871u, kotlin.reflect.jvm.internal.impl.types.y yVar) {
        if (avVar != null) {
            if (interfaceC2335k != null) {
                if (i4 != 0) {
                    if (c2339o != null) {
                        if (i5 != 0) {
                            if (list != null) {
                                if (list2 != null) {
                                    if (yVar != null) {
                                        this.f13775q = abstractC2870t;
                                        this.teal = null;
                                        this.f13762c = abstractC2870t.f13778c;
                                        this.f13764f = true;
                                        this.f13765g = false;
                                        this.f13766h = false;
                                        this.f13767i = false;
                                        this.f13768j = abstractC2870t.f13786l;
                                        this.f13769k = null;
                                        this.f13770l = null;
                                        this.f13771m = abstractC2870t.f13787m;
                                        this.f13772n = new LinkedHashMap();
                                        this.f13773o = null;
                                        this.f13774p = false;
                                        this.alpha = avVar;
                                        this.purple = interfaceC2335k;
                                        this.red = i4;
                                        this.silver = c2339o;
                                        this.white = i5;
                                        this.yellow = list;
                                        this.f13760a = list2;
                                        this.f13761b = c2871u;
                                        this.f13763d = yVar;
                                        this.e = null;
                                        return;
                                    }
                                    alpha(7);
                                    throw null;
                                }
                                alpha(6);
                                throw null;
                            }
                            alpha(5);
                            throw null;
                        }
                        alpha(4);
                        throw null;
                    }
                    alpha(3);
                    throw null;
                }
                alpha(2);
                throw null;
            }
            alpha(1);
            throw null;
        }
        alpha(0);
        throw null;
    }

    public static /* synthetic */ void alpha(int i4) {
        String str;
        int i5;
        switch (i4) {
            case 9:
            case 11:
            case 13:
            case 15:
            case 16:
            case 18:
            case 20:
            case 22:
            case 24:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 36:
            case 38:
            case 40:
            case 41:
            case 42:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 10:
            case 12:
            case 14:
            case 17:
            case 19:
            case 21:
            case 23:
            case 25:
            case 35:
            case 37:
            case 39:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i4) {
            case 9:
            case 11:
            case 13:
            case 15:
            case 16:
            case 18:
            case 20:
            case 22:
            case 24:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 36:
            case 38:
            case 40:
            case 41:
            case 42:
                i5 = 2;
                break;
            case 10:
            case 12:
            case 14:
            case 17:
            case 19:
            case 21:
            case 23:
            case 25:
            case 35:
            case 37:
            case 39:
            default:
                i5 = 3;
                break;
        }
        Object[] objArr = new Object[i5];
        switch (i4) {
            case 1:
                objArr[0] = "newOwner";
                break;
            case 2:
                objArr[0] = "newModality";
                break;
            case 3:
                objArr[0] = "newVisibility";
                break;
            case 4:
            case 14:
                objArr[0] = "kind";
                break;
            case 5:
                objArr[0] = "newValueParameterDescriptors";
                break;
            case 6:
                objArr[0] = "newContextReceiverParameters";
                break;
            case 7:
                objArr[0] = "newReturnType";
                break;
            case 8:
                objArr[0] = "owner";
                break;
            case 9:
            case 11:
            case 13:
            case 15:
            case 16:
            case 18:
            case 20:
            case 22:
            case 24:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 36:
            case 38:
            case 40:
            case 41:
            case 42:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl$CopyConfiguration";
                break;
            case 10:
                objArr[0] = "modality";
                break;
            case 12:
                objArr[0] = "visibility";
                break;
            case 17:
                objArr[0] = "name";
                break;
            case 19:
            case 21:
                objArr[0] = "parameters";
                break;
            case 23:
                objArr[0] = Constants.KEY_TYPE;
                break;
            case 25:
                objArr[0] = "contextReceiverParameters";
                break;
            case 35:
                objArr[0] = "additionalAnnotations";
                break;
            case 37:
            default:
                objArr[0] = "substitution";
                break;
            case 39:
                objArr[0] = "userDataKey";
                break;
        }
        switch (i4) {
            case 9:
                objArr[1] = "setOwner";
                break;
            case 10:
            case 12:
            case 14:
            case 17:
            case 19:
            case 21:
            case 23:
            case 25:
            case 35:
            case 37:
            case 39:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl$CopyConfiguration";
                break;
            case 11:
                objArr[1] = "setModality";
                break;
            case 13:
                objArr[1] = "setVisibility";
                break;
            case 15:
                objArr[1] = "setKind";
                break;
            case 16:
                objArr[1] = "setCopyOverrides";
                break;
            case 18:
                objArr[1] = "setName";
                break;
            case 20:
                objArr[1] = "setValueParameters";
                break;
            case 22:
                objArr[1] = "setTypeParameters";
                break;
            case 24:
                objArr[1] = "setReturnType";
                break;
            case 26:
                objArr[1] = "setContextReceiverParameters";
                break;
            case 27:
                objArr[1] = "setExtensionReceiverParameter";
                break;
            case 28:
                objArr[1] = "setDispatchReceiverParameter";
                break;
            case 29:
                objArr[1] = "setOriginal";
                break;
            case 30:
                objArr[1] = "setSignatureChange";
                break;
            case 31:
                objArr[1] = "setPreserveSourceElement";
                break;
            case 32:
                objArr[1] = "setDropOriginalInContainingParts";
                break;
            case 33:
                objArr[1] = "setHiddenToOvercomeSignatureClash";
                break;
            case 34:
                objArr[1] = "setHiddenForResolutionEverywhereBesideSupercalls";
                break;
            case 36:
                objArr[1] = "setAdditionalAnnotations";
                break;
            case 38:
                objArr[1] = "setSubstitution";
                break;
            case 40:
                objArr[1] = "putUserData";
                break;
            case 41:
                objArr[1] = "getSubstitution";
                break;
            case 42:
                objArr[1] = "setJustForTypeSubstitution";
                break;
        }
        switch (i4) {
            case 8:
                objArr[2] = "setOwner";
                break;
            case 9:
            case 11:
            case 13:
            case 15:
            case 16:
            case 18:
            case 20:
            case 22:
            case 24:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 36:
            case 38:
            case 40:
            case 41:
            case 42:
                break;
            case 10:
                objArr[2] = "setModality";
                break;
            case 12:
                objArr[2] = "setVisibility";
                break;
            case 14:
                objArr[2] = "setKind";
                break;
            case 17:
                objArr[2] = "setName";
                break;
            case 19:
                objArr[2] = "setValueParameters";
                break;
            case 21:
                objArr[2] = "setTypeParameters";
                break;
            case 23:
                objArr[2] = "setReturnType";
                break;
            case 25:
                objArr[2] = "setContextReceiverParameters";
                break;
            case 35:
                objArr[2] = "setAdditionalAnnotations";
                break;
            case 37:
                objArr[2] = "setSubstitution";
                break;
            case 39:
                objArr[2] = "putUserData";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i4) {
            case 9:
            case 11:
            case 13:
            case 15:
            case 16:
            case 18:
            case 20:
            case 22:
            case 24:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 36:
            case 38:
            case 40:
            case 41:
            case 42:
                throw new IllegalStateException(format);
            case 10:
            case 12:
            case 14:
            case 17:
            case 19:
            case 21:
            case 23:
            case 25:
            case 35:
            case 37:
            case 39:
            default:
                throw new IllegalArgumentException(format);
        }
    }

    @Override // pe.InterfaceC2344t
    public final InterfaceC2344t bravo(List list) {
        if (list != null) {
            this.yellow = list;
            return this;
        }
        alpha(19);
        throw null;
    }

    @Override // pe.InterfaceC2344t
    public final InterfaceC2345u build() {
        return this.f13775q.c0(this);
    }

    @Override // pe.InterfaceC2344t
    public final InterfaceC2344t delta(int i4) {
        if (i4 != 0) {
            this.white = i4;
            return this;
        }
        alpha(14);
        throw null;
    }

    @Override // pe.InterfaceC2344t
    public final InterfaceC2344t echo() {
        this.f13766h = true;
        return this;
    }

    @Override // pe.InterfaceC2344t
    public final InterfaceC2344t foxtrot(Ne.f fVar) {
        if (fVar != null) {
            this.e = fVar;
            return this;
        }
        alpha(17);
        throw null;
    }

    @Override // pe.InterfaceC2344t
    public final InterfaceC2344t hotel(kotlin.reflect.jvm.internal.impl.types.y yVar) {
        if (yVar != null) {
            this.f13763d = yVar;
            return this;
        }
        alpha(23);
        throw null;
    }

    @Override // pe.InterfaceC2344t
    public final InterfaceC2344t india(C2871u c2871u) {
        this.f13762c = c2871u;
        return this;
    }

    @Override // pe.InterfaceC2344t
    public final InterfaceC2344t kilo() {
        this.f13772n.put(Ae.f.f60z, Boolean.TRUE);
        return this;
    }

    @Override // pe.InterfaceC2344t
    public final InterfaceC2344t lima() {
        this.f13771m = true;
        return this;
    }

    @Override // pe.InterfaceC2344t
    public final InterfaceC2344t november() {
        this.f13764f = false;
        return this;
    }

    @Override // pe.InterfaceC2344t
    public final InterfaceC2344t oscar(C2339o c2339o) {
        if (c2339o != null) {
            this.silver = c2339o;
            return this;
        }
        alpha(12);
        throw null;
    }

    @Override // pe.InterfaceC2344t
    public final InterfaceC2344t quebec(List list) {
        if (list != null) {
            this.f13769k = list;
            return this;
        }
        alpha(21);
        throw null;
    }

    @Override // pe.InterfaceC2344t
    public final InterfaceC2344t romeo(InterfaceC2330f interfaceC2330f) {
        if (interfaceC2330f != null) {
            this.purple = interfaceC2330f;
            return this;
        }
        alpha(8);
        throw null;
    }

    @Override // pe.InterfaceC2344t
    public final InterfaceC2344t sierra() {
        this.f13768j = true;
        return this;
    }

    @Override // pe.InterfaceC2344t
    public final InterfaceC2344t uniform(int i4) {
        if (i4 != 0) {
            this.red = i4;
            return this;
        }
        alpha(10);
        throw null;
    }

    @Override // pe.InterfaceC2344t
    public final InterfaceC2344t victor(InterfaceC2472h interfaceC2472h) {
        if (interfaceC2472h != null) {
            this.f13770l = interfaceC2472h;
            return this;
        }
        alpha(35);
        throw null;
    }

    @Override // pe.InterfaceC2344t
    public final InterfaceC2344t xray() {
        this.f13765g = true;
        return this;
    }
}
