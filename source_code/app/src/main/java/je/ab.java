package je;

import androidx.compose.runtime.C0590w;
import androidx.compose.runtime.t0;
import androidx.lifecycle.d0;
import delivery.samurai.android.ui.agreement.AgreementDetailFragment;
import delivery.samurai.android.ui.agreement.AgreementFragment;
import delivery.samurai.android.ui.points.presentation.PointsFragment;
import delivery.samurai.android.ui.redeem.presentation.RedeemFragment;
import delivery.samurai.android.ui.referralProgram.ReferYourFriendFragment;
import gf.C1791f;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import l0.C2047d;
import l0.C2050g;
import oe.C2237h;
import oe.C2238i;
import q0.C2379O;

/* loaded from: classes2.dex */
public final class ab extends Lambda implements Function0 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Object purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ab(int i4, Object obj) {
        super(0);
        this.alpha = i4;
        this.purple = obj;
    }

    /* JADX WARN: Type inference failed for: r0v77, types: [java.lang.Object, kotlin.jvm.functions.Function1] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int collectionSizeOrDefault;
        int hashCode;
        C0590w c0590w;
        switch (this.alpha) {
            case 0:
                return S.alpha(((af) this.purple).golf());
            case 1:
                return new ai((aj) this.purple);
            case 2:
                return new ak((al) this.purple);
            case 3:
                return new am((an) this.purple);
            case 4:
                List upperBounds = ((O) this.purple).alpha.getUpperBounds();
                Intrinsics.delta(upperBounds, "descriptor.upperBounds");
                collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(upperBounds, 10);
                ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
                Iterator it = upperBounds.iterator();
                while (it.hasNext()) {
                    arrayList.add(new N((kotlin.reflect.jvm.internal.impl.types.y) it.next(), null));
                }
                return arrayList;
            case 5:
                int i4 = 0;
                for (Map.Entry entry : ((Map) this.purple).entrySet()) {
                    String str = (String) entry.getKey();
                    Object value = entry.getValue();
                    if (value instanceof boolean[]) {
                        hashCode = Arrays.hashCode((boolean[]) value);
                    } else if (value instanceof char[]) {
                        hashCode = Arrays.hashCode((char[]) value);
                    } else if (value instanceof byte[]) {
                        hashCode = Arrays.hashCode((byte[]) value);
                    } else if (value instanceof short[]) {
                        hashCode = Arrays.hashCode((short[]) value);
                    } else if (value instanceof int[]) {
                        hashCode = Arrays.hashCode((int[]) value);
                    } else if (value instanceof float[]) {
                        hashCode = Arrays.hashCode((float[]) value);
                    } else if (value instanceof long[]) {
                        hashCode = Arrays.hashCode((long[]) value);
                    } else if (value instanceof double[]) {
                        hashCode = Arrays.hashCode((double[]) value);
                    } else if (value instanceof Object[]) {
                        hashCode = Arrays.hashCode((Object[]) value);
                    } else {
                        hashCode = value.hashCode();
                    }
                    i4 += hashCode ^ (str.hashCode() * 127);
                }
                return Integer.valueOf(i4);
            case 6:
                return new kotlin.reflect.jvm.internal.impl.types.f(((kotlin.reflect.jvm.internal.impl.types.i) this.purple).bravo());
            case 7:
                return kotlin.reflect.jvm.internal.impl.types.c.romeo(((kotlin.reflect.jvm.internal.impl.types.aj) this.purple).alpha);
            case 8:
                return hf.i.charlie(hf.h.f12738r, ((gd.a) this.purple).toString());
            case 9:
                return ((C2047d) this.purple).delta;
            case 10:
                return ((C2050g) this.purple).b();
            case 11:
                return ((A2.aj) this.purple).delta();
            case 12:
                return (AgreementDetailFragment) this.purple;
            case 13:
                return (d0) ((ab) this.purple).invoke();
            case 14:
                return (AgreementFragment) this.purple;
            case 15:
                return (d0) ((ab) this.purple).invoke();
            case 16:
                return (PointsFragment) this.purple;
            case 17:
                return (d0) ((ab) this.purple).invoke();
            case 18:
                return (na.c) this.purple;
            case 19:
                return (d0) ((ab) this.purple).invoke();
            case 20:
                return (RedeemFragment) this.purple;
            case 21:
                return (d0) ((ab) this.purple).invoke();
            case 22:
                C2238i c2238i = (C2238i) this.purple;
                me.k kVar = c2238i.foxtrot;
                if (kVar != null) {
                    C2237h c2237h = (C2237h) kVar.invoke();
                    c2238i.foxtrot = null;
                    return c2237h;
                }
                throw new AssertionError("JvmBuiltins instance has not been initialized properly");
            case 23:
                return (ReferYourFriendFragment) this.purple;
            case 24:
                return (d0) ((ab) this.purple).invoke();
            case 25:
                return (Xe.n) ((pe.am) this.purple).bravo.invoke(C1791f.alpha);
            case 26:
                q0.ae aeVar = (q0.ae) this.purple;
                if (!((Boolean) ((t0) aeVar.golf).getValue()).booleanValue() && (c0590w = aeVar.charlie) != null) {
                    c0590w.lima();
                }
                return Unit.INSTANCE;
            case 27:
                q0.al alpha = ((C2379O) this.purple).alpha();
                s0.al alVar = alpha.alpha;
                if (alpha.f13155g != ((J.e) ((J.b) alVar.papa()).purple).red) {
                    bv.al alVar2 = alpha.white;
                    Object[] objArr = alVar2.charlie;
                    long[] jArr = alVar2.alpha;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i5 = 0;
                        while (true) {
                            long j5 = jArr[i5];
                            if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i10 = 8 - ((~(i5 - length)) >>> 31);
                                for (int i11 = 0; i11 < i10; i11++) {
                                    if ((255 & j5) < 128) {
                                        ((q0.ae) objArr[(i5 << 3) + i11]).delta = true;
                                    }
                                    j5 >>= 8;
                                }
                                if (i10 != 8) {
                                }
                            }
                            if (i5 != length) {
                                i5++;
                            }
                        }
                    }
                    if (alVar.yellow != null) {
                        if (!alVar.f13306y.echo) {
                            s0.al.navy(alVar, false, 7);
                        }
                    } else if (!alVar.romeo()) {
                        s0.al.olive(alVar, false, 7);
                    }
                }
                return Unit.INSTANCE;
            case 28:
                return (qa.k) this.purple;
            default:
                return (d0) ((ab) this.purple).invoke();
        }
    }
}
