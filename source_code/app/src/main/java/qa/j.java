package qa;

import A0.s;
import A0.t;
import B9.ab;
import android.view.KeyEvent;
import androidx.lifecycle.InterfaceC0651v;
import androidx.lifecycle.a0;
import androidx.lifecycle.ac;
import androidx.lifecycle.d0;
import com.airbnb.lottie.compose.LottieConstants;
import delivery.samurai.android.ui.attendanceRegistry.AttendanceRegistryFragment;
import delivery.samurai.android.ui.score.ScoreFragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.types.ae;
import kotlin.reflect.jvm.internal.impl.types.ax;
import kotlin.reflect.jvm.internal.impl.types.y;
import qe.InterfaceC2472h;
import s0.C2546f;
import s0.C2562w;
import s0.L;
import s0.ai;
import s0.al;
import s0.ap;
import s0.au;
import s0.ay;
import s6.AbstractC2627c7;
import se.C2859i;
import se.C2871u;
import se.an;
import t0.AbstractC2902a;
import t0.C2933p0;
import t0.ad;
import t0.w0;
import t0.z0;
import t1.C2952d;
import t6.I2;
import tc.C3105j;
import wa.C3248d;

/* loaded from: classes2.dex */
public final class j extends Lambda implements Function0 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Object purple;
    public final /* synthetic */ Object red;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(int i4, Object obj, Object obj2) {
        super(0);
        this.alpha = i4;
        this.purple = obj;
        this.red = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v50, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v60, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v82, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        InterfaceC0651v interfaceC0651v;
        a0 defaultViewModelProviderFactory;
        InterfaceC0651v interfaceC0651v2;
        a0 defaultViewModelProviderFactory2;
        ax delta;
        int collectionSizeOrDefault;
        boolean dispatchKeyEvent;
        float f5;
        float f10;
        s sVar;
        al alVar;
        InterfaceC0651v interfaceC0651v3;
        a0 defaultViewModelProviderFactory3;
        InterfaceC0651v interfaceC0651v4;
        a0 defaultViewModelProviderFactory4;
        Z.c cVar;
        InterfaceC0651v interfaceC0651v5;
        a0 defaultViewModelProviderFactory5;
        switch (this.alpha) {
            case 0:
                d0 d0Var = (d0) this.red.getValue();
                if (d0Var instanceof InterfaceC0651v) {
                    interfaceC0651v = (InterfaceC0651v) d0Var;
                } else {
                    interfaceC0651v = null;
                }
                if (interfaceC0651v == null || (defaultViewModelProviderFactory = interfaceC0651v.getDefaultViewModelProviderFactory()) == null) {
                    return ((k) this.purple).getDefaultViewModelProviderFactory();
                }
                return defaultViewModelProviderFactory;
            case 1:
                ay ayVar = (ay) this.purple;
                ap apVar = ayVar.white;
                apVar.hotel = 0;
                J.e zulu = apVar.alpha.zulu();
                Object[] objArr = zulu.alpha;
                int i4 = zulu.red;
                for (int i5 = 0; i5 < i4; i5++) {
                    ay ayVar2 = ((al) objArr[i5]).f13306y.quebec;
                    Intrinsics.checkNotNull(ayVar2);
                    ayVar2.f13321a = ayVar2.f13322b;
                    ayVar2.f13322b = LottieConstants.IterateForever;
                    if (ayVar2.f13323c == ai.purple) {
                        ayVar2.f13323c = ai.red;
                    }
                }
                ayVar.fuchsia(C2546f.teal);
                C2562w c2562w = ayVar.golf().f13352L;
                ap apVar2 = ayVar.white;
                if (c2562w != null) {
                    boolean z2 = c2562w.f13312d;
                    J.b bVar = (J.b) apVar2.alpha.oscar();
                    int i10 = ((J.e) bVar.purple).red;
                    for (int i11 = 0; i11 < i10; i11++) {
                        au y10 = ((L) ((al) bVar.get(i11)).f13305x.foxtrot).y();
                        if (y10 != null) {
                            y10.f13312d = z2;
                        }
                    }
                }
                ((C2562w) this.red).i().delta();
                if (ayVar.golf().f13352L != null) {
                    J.b bVar2 = (J.b) apVar2.alpha.oscar();
                    int i12 = ((J.e) bVar2.purple).red;
                    for (int i13 = 0; i13 < i12; i13++) {
                        au y11 = ((L) ((al) bVar2.get(i13)).f13305x.foxtrot).y();
                        if (y11 != null) {
                            y11.f13312d = false;
                        }
                    }
                }
                J.e zulu2 = apVar2.alpha.zulu();
                Object[] objArr2 = zulu2.alpha;
                int i14 = zulu2.red;
                for (int i15 = 0; i15 < i14; i15++) {
                    ay ayVar3 = ((al) objArr2[i15]).f13306y.quebec;
                    Intrinsics.checkNotNull(ayVar3);
                    int i16 = ayVar3.f13321a;
                    int i17 = ayVar3.f13322b;
                    if (i16 != i17 && i17 == Integer.MAX_VALUE) {
                        ayVar3.b(true);
                    }
                }
                ayVar.fuchsia(C2546f.white);
                return Unit.INSTANCE;
            case 2:
                d0 d0Var2 = (d0) this.red.getValue();
                if (d0Var2 instanceof InterfaceC0651v) {
                    interfaceC0651v2 = (InterfaceC0651v) d0Var2;
                } else {
                    interfaceC0651v2 = null;
                }
                if (interfaceC0651v2 == null || (defaultViewModelProviderFactory2 = interfaceC0651v2.getDefaultViewModelProviderFactory()) == null) {
                    return ((AttendanceRegistryFragment) this.purple).getDefaultViewModelProviderFactory();
                }
                return defaultViewModelProviderFactory2;
            case 3:
                an anVar = (an) this.purple;
                ff.l lVar = anVar.f13741w;
                C2859i c2859i = (C2859i) this.red;
                InterfaceC2472h annotations = c2859i.getAnnotations();
                C2859i c2859i2 = (C2859i) this.red;
                int november = c2859i2.november();
                com.google.android.material.datepicker.j.sierra(november, "underlyingConstructorDescriptor.kind");
                ef.s sVar2 = anVar.f13742x;
                pe.an echo = sVar2.echo();
                Intrinsics.delta(echo, "typeAliasDescriptor.source");
                an anVar2 = new an(lVar, anVar.f13742x, c2859i, anVar, annotations, november, echo);
                an.f13740z.getClass();
                C2871u c2871u = null;
                if (sVar2.Z() == null) {
                    delta = null;
                } else {
                    delta = ax.delta(sVar2.a0());
                }
                if (delta == null) {
                    return null;
                }
                C2871u c2871u2 = c2859i2.f13778c;
                if (c2871u2 != null) {
                    c2871u = c2871u2.delta(delta);
                }
                List l10 = c2859i2.l();
                Intrinsics.delta(l10, "underlyingConstructorDes…contextReceiverParameters");
                collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(l10, 10);
                ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
                Iterator it = l10.iterator();
                while (it.hasNext()) {
                    arrayList.add(((C2871u) it.next()).delta(delta));
                }
                List papa = sVar2.papa();
                List peach = anVar.peach();
                y yVar = anVar.yellow;
                Intrinsics.checkNotNull(yVar);
                anVar2.e0(null, c2871u, arrayList, papa, peach, yVar, 1, sVar2.teal);
                return anVar2;
            case 4:
                dispatchKeyEvent = super/*android.view.ViewGroup*/.dispatchKeyEvent((KeyEvent) this.red);
                return Boolean.valueOf(dispatchKeyEvent);
            case 5:
                C2933p0 c2933p0 = (C2933p0) this.purple;
                A0.i iVar = c2933p0.teal;
                A0.i iVar2 = c2933p0.white;
                Float f11 = c2933p0.red;
                Float f12 = c2933p0.silver;
                if (iVar != null && f11 != null) {
                    f5 = ((Number) iVar.alpha.invoke()).floatValue() - f11.floatValue();
                } else {
                    f5 = 0.0f;
                }
                if (iVar2 != null && f12 != null) {
                    f10 = ((Number) iVar2.alpha.invoke()).floatValue() - f12.floatValue();
                } else {
                    f10 = 0.0f;
                }
                if (f5 != 0.0f || f10 != 0.0f) {
                    int i18 = c2933p0.alpha;
                    ad adVar = (ad) this.red;
                    int azure = adVar.azure(i18);
                    t tVar = (t) adVar.tango().bravo(adVar.november);
                    if (tVar != null) {
                        try {
                            C2952d c2952d = adVar.papa;
                            if (c2952d != null) {
                                c2952d.india(adVar.kilo(tVar));
                            }
                        } catch (IllegalStateException unused) {
                        }
                    }
                    t tVar2 = (t) adVar.tango().bravo(adVar.oscar);
                    if (tVar2 != null) {
                        try {
                            C2952d c2952d2 = adVar.quebec;
                            if (c2952d2 != null) {
                                c2952d2.india(adVar.kilo(tVar2));
                            }
                        } catch (IllegalStateException unused2) {
                        }
                    }
                    adVar.delta.invalidate();
                    t tVar3 = (t) adVar.tango().bravo(azure);
                    if (tVar3 != null && (sVar = tVar3.alpha) != null && (alVar = sVar.charlie) != null) {
                        if (iVar != null) {
                            adVar.sierra.hotel(azure, iVar);
                        }
                        if (iVar2 != null) {
                            adVar.tango.hotel(azure, iVar2);
                        }
                        adVar.xray(alVar);
                    }
                }
                if (iVar != null) {
                    c2933p0.red = (Float) iVar.alpha.invoke();
                }
                if (iVar2 != null) {
                    c2933p0.silver = (Float) iVar2.alpha.invoke();
                }
                return Unit.INSTANCE;
            case 6:
                ((AbstractC2902a) this.purple).removeOnAttachStateChangeListener((w0) this.red);
                return Unit.INSTANCE;
            case 7:
                ((AbstractC2902a) this.purple).removeOnAttachStateChangeListener((z0) this.red);
                return Unit.INSTANCE;
            case 8:
                ((ac) this.purple).charlie((Nb.f) this.red);
                return Unit.INSTANCE;
            case 9:
                d0 d0Var3 = (d0) this.red.getValue();
                if (d0Var3 instanceof InterfaceC0651v) {
                    interfaceC0651v3 = (InterfaceC0651v) d0Var3;
                } else {
                    interfaceC0651v3 = null;
                }
                if (interfaceC0651v3 == null || (defaultViewModelProviderFactory3 = interfaceC0651v3.getDefaultViewModelProviderFactory()) == null) {
                    return ((C3105j) this.purple).getDefaultViewModelProviderFactory();
                }
                return defaultViewModelProviderFactory3;
            case 10:
                d0 d0Var4 = (d0) this.red.getValue();
                if (d0Var4 instanceof InterfaceC0651v) {
                    interfaceC0651v4 = (InterfaceC0651v) d0Var4;
                } else {
                    interfaceC0651v4 = null;
                }
                if (interfaceC0651v4 == null || (defaultViewModelProviderFactory4 = interfaceC0651v4.getDefaultViewModelProviderFactory()) == null) {
                    return ((C3248d) this.purple).getDefaultViewModelProviderFactory();
                }
                return defaultViewModelProviderFactory4;
            case 11:
                Function0 function0 = (Function0) this.purple;
                if (function0 == null || (cVar = (Z.c) function0.invoke()) == null) {
                    L l11 = (L) this.red;
                    if (!l11.india()) {
                        l11 = null;
                    }
                    if (l11 == null) {
                        return null;
                    }
                    return I2.alpha(0L, AbstractC2627c7.bravo(l11.red));
                }
                return cVar;
            case 12:
                d0 d0Var5 = (d0) this.red.getValue();
                if (d0Var5 instanceof InterfaceC0651v) {
                    interfaceC0651v5 = (InterfaceC0651v) d0Var5;
                } else {
                    interfaceC0651v5 = null;
                }
                if (interfaceC0651v5 == null || (defaultViewModelProviderFactory5 = interfaceC0651v5.getDefaultViewModelProviderFactory()) == null) {
                    return ((ScoreFragment) this.purple).getDefaultViewModelProviderFactory();
                }
                return defaultViewModelProviderFactory5;
            default:
                ae oscar = ((Be.a) ((ab) this.purple).purple).oscar.silver.india(((ze.b) this.red).alpha).oscar();
                Intrinsics.delta(oscar, "c.module.builtIns.getBui…qName(fqName).defaultType");
                return oscar;
        }
    }
}
