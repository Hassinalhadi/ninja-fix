package S2;

import O2.o;
import R2.m;
import a3.n;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.P0;
import androidx.recyclerview.widget.RecyclerView;
import coil.memory.MemoryCache$Key;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import vf.AbstractC3220y;
import vf.ad;

/* loaded from: classes3.dex */
public final class i implements j {
    public final M2.k alpha;
    public final n bravo;
    public final J2.c charlie;
    public final O7.j delta;

    public i(M2.k kVar, n nVar, J2.c cVar) {
        this.alpha = kVar;
        this.bravo = nVar;
        this.charlie = cVar;
        this.delta = new O7.j(9, kVar, cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00c5 -> B:10:0x00cc). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object alpha(i iVar, m mVar, M2.b bVar, X2.h hVar, Object obj, X2.k kVar, M2.c cVar, Pd.c cVar2) {
        b bVar2;
        i iVar2;
        int i4;
        X2.h hVar2;
        Object obj2;
        X2.k kVar2;
        M2.c cVar3;
        int i5;
        b bVar3;
        m mVar2;
        M2.b bVar4;
        List list;
        Pair pair;
        O2.n nVar;
        iVar.getClass();
        if (cVar2 instanceof b) {
            bVar2 = (b) cVar2;
            int i10 = bVar2.f2026v;
            if ((i10 & RecyclerView.UNDEFINED_DURATION) != 0) {
                bVar2.f2026v = i10 - RecyclerView.UNDEFINED_DURATION;
                iVar2 = iVar;
                Object obj3 = bVar2.f2024t;
                Od.a aVar = Od.a.alpha;
                i4 = bVar2.f2026v;
                String str = null;
                if (i4 == 0) {
                    if (i4 == 1) {
                        int i11 = bVar2.f2023s;
                        M2.c cVar4 = bVar2.yellow;
                        X2.k kVar3 = bVar2.white;
                        Object obj4 = bVar2.teal;
                        X2.h hVar3 = bVar2.silver;
                        M2.b bVar5 = bVar2.red;
                        m mVar3 = bVar2.purple;
                        i iVar3 = bVar2.alpha;
                        ResultKt.alpha(obj3);
                        b bVar6 = bVar2;
                        bVar4 = bVar5;
                        i5 = i11;
                        iVar2 = iVar3;
                        cVar3 = cVar4;
                        hVar2 = hVar3;
                        kVar2 = kVar3;
                        obj2 = obj4;
                        O2.g gVar = (O2.g) obj3;
                        cVar3.getClass();
                        if (gVar == null) {
                            O2.f fVar = mVar3.charlie;
                            o oVar = mVar3.alpha;
                            if (oVar instanceof O2.n) {
                                nVar = (O2.n) oVar;
                            } else {
                                nVar = null;
                            }
                            if (nVar != null) {
                                str = nVar.red;
                            }
                            return new a(gVar.alpha, gVar.bravo, fVar, str);
                        }
                        mVar2 = mVar3;
                        bVar3 = bVar6;
                        M2.k kVar4 = iVar2.alpha;
                        list = bVar4.echo;
                        if (i5 >= list.size()) {
                            O2.c cVar5 = (O2.c) list.get(i5);
                            cVar5.getClass();
                            pair = new Pair(new O2.e(mVar2.alpha, kVar2, cVar5.bravo, cVar5.alpha), Integer.valueOf(i5));
                        } else {
                            pair = null;
                        }
                        if (pair == null) {
                            O2.e eVar = (O2.e) pair.getFirst();
                            int intValue = ((Number) pair.getSecond()).intValue() + 1;
                            cVar3.getClass();
                            bVar3.alpha = iVar2;
                            bVar3.purple = mVar2;
                            bVar3.red = bVar4;
                            bVar3.silver = hVar2;
                            bVar3.teal = obj2;
                            bVar3.white = kVar2;
                            bVar3.yellow = cVar3;
                            bVar3.f2023s = intValue;
                            bVar3.f2026v = 1;
                            Object alpha = eVar.alpha(bVar3);
                            if (alpha == aVar) {
                                return aVar;
                            }
                            b bVar7 = bVar3;
                            mVar3 = mVar2;
                            obj3 = alpha;
                            i5 = intValue;
                            bVar6 = bVar7;
                            O2.g gVar2 = (O2.g) obj3;
                            cVar3.getClass();
                            if (gVar2 == null) {
                            }
                        } else {
                            throw new IllegalStateException(P0.bronze(obj2, "Unable to create a decoder that supports: ").toString());
                        }
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.alpha(obj3);
                    hVar2 = hVar;
                    obj2 = obj;
                    kVar2 = kVar;
                    cVar3 = cVar;
                    i5 = 0;
                    bVar3 = bVar2;
                    mVar2 = mVar;
                    bVar4 = bVar;
                    M2.k kVar42 = iVar2.alpha;
                    list = bVar4.echo;
                    if (i5 >= list.size()) {
                    }
                    if (pair == null) {
                    }
                }
            }
        }
        iVar2 = iVar;
        bVar2 = new b(iVar2, cVar2);
        Object obj32 = bVar2.f2024t;
        Od.a aVar2 = Od.a.alpha;
        i4 = bVar2.f2026v;
        String str2 = null;
        if (i4 == 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x017d, code lost:
    
        if (r12.juliet == false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0198, code lost:
    
        if (r1 == r7) goto L64;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e4 A[Catch: all -> 0x0053, TRY_LEAVE, TryCatch #0 {all -> 0x0053, blocks: (B:26:0x004e, B:27:0x0113, B:45:0x0068, B:47:0x00d9, B:49:0x00e4, B:54:0x00f7, B:67:0x0121, B:69:0x012a, B:71:0x01b2, B:72:0x01b7), top: B:8:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0121 A[Catch: all -> 0x0053, TryCatch #0 {all -> 0x0053, blocks: (B:26:0x004e, B:27:0x0113, B:45:0x0068, B:47:0x00d9, B:49:0x00e4, B:54:0x00f7, B:67:0x0121, B:69:0x012a, B:71:0x01b2, B:72:0x01b7), top: B:8:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0075  */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v3, types: [int] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object bravo(i iVar, X2.h hVar, Object obj, X2.k kVar, M2.c cVar, Pd.c cVar2) {
        c cVar3;
        Ref.ObjectRef objectRef;
        Object obj2;
        i iVar2;
        Object obj3;
        M2.c cVar4;
        Ref.ObjectRef objectRef2;
        Ref.ObjectRef objectRef3;
        Ref.ObjectRef objectRef4;
        Ref.ObjectRef objectRef5;
        X2.h hVar2;
        Object obj4;
        R2.e eVar;
        X2.h hVar3;
        Ref.ObjectRef objectRef6;
        M2.c cVar5;
        i iVar3;
        Ref.ObjectRef objectRef7;
        i iVar4;
        a aVar;
        Object obj5;
        m mVar;
        List list;
        Object obj6;
        Bitmap bitmap;
        iVar.getClass();
        try {
            if (cVar2 instanceof c) {
                cVar3 = (c) cVar2;
                int i4 = cVar3.f2030v;
                if ((i4 & RecyclerView.UNDEFINED_DURATION) != 0) {
                    cVar3.f2030v = i4 - RecyclerView.UNDEFINED_DURATION;
                    c cVar6 = cVar3;
                    Object obj7 = cVar6.f2028t;
                    Od.a aVar2 = Od.a.alpha;
                    objectRef = cVar6.f2030v;
                    m mVar2 = null;
                    BitmapDrawable bitmapDrawable = null;
                    if (objectRef == 0) {
                        if (objectRef != 1) {
                            if (objectRef != 2) {
                                if (objectRef == 3) {
                                    ResultKt.alpha(obj7);
                                    a aVar3 = (a) obj7;
                                    Drawable drawable = aVar3.alpha;
                                    if (drawable instanceof BitmapDrawable) {
                                        bitmapDrawable = (BitmapDrawable) drawable;
                                    }
                                    if (bitmapDrawable != null && (bitmap = bitmapDrawable.getBitmap()) != null) {
                                        bitmap.prepareToDraw();
                                    }
                                    return aVar3;
                                }
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            objectRef5 = cVar6.teal;
                            objectRef7 = (Ref.ObjectRef) cVar6.silver;
                            cVar5 = (M2.c) cVar6.red;
                            hVar3 = cVar6.purple;
                            iVar4 = cVar6.alpha;
                            ResultKt.alpha(obj7);
                            obj6 = obj7;
                            objectRef6 = objectRef7;
                            iVar3 = iVar4;
                            aVar = (a) obj6;
                            M2.c cVar7 = cVar5;
                            X2.h hVar4 = hVar3;
                            obj5 = objectRef5.alpha;
                            if (obj5 instanceof m) {
                                mVar = (m) obj5;
                            } else {
                                mVar = null;
                            }
                            if (mVar != null) {
                                a3.h.alpha(mVar.alpha);
                            }
                            X2.k kVar2 = (X2.k) objectRef6.alpha;
                            cVar6.alpha = null;
                            cVar6.purple = null;
                            cVar6.red = null;
                            cVar6.silver = null;
                            cVar6.teal = null;
                            cVar6.white = null;
                            cVar6.yellow = null;
                            cVar6.f2027s = null;
                            cVar6.f2030v = 3;
                            iVar3.getClass();
                            list = hVar4.foxtrot;
                            obj7 = aVar;
                            if (!list.isEmpty()) {
                                if (!(aVar.alpha instanceof BitmapDrawable)) {
                                    obj7 = aVar;
                                }
                                obj7 = ad.blue(hVar4.tango, new h(iVar3, aVar, kVar2, list, cVar7, hVar4, null), cVar6);
                            }
                        } else {
                            objectRef4 = cVar6.f2027s;
                            objectRef5 = cVar6.yellow;
                            Ref.ObjectRef objectRef8 = cVar6.white;
                            Ref.ObjectRef objectRef9 = cVar6.teal;
                            M2.c cVar8 = (M2.c) cVar6.silver;
                            Object obj8 = cVar6.red;
                            hVar2 = cVar6.purple;
                            i iVar5 = cVar6.alpha;
                            ResultKt.alpha(obj7);
                            objectRef3 = objectRef8;
                            objectRef2 = objectRef9;
                            cVar4 = cVar8;
                            obj3 = obj8;
                            iVar2 = iVar5;
                            obj4 = obj7;
                        }
                    } else {
                        ResultKt.alpha(obj7);
                        Ref.ObjectRef objectRef10 = new Ref.ObjectRef();
                        objectRef10.alpha = kVar;
                        Ref.ObjectRef objectRef11 = new Ref.ObjectRef();
                        objectRef11.alpha = iVar.alpha.hotel;
                        Ref.ObjectRef objectRef12 = new Ref.ObjectRef();
                        try {
                            objectRef10.alpha = iVar.charlie.black((X2.k) objectRef10.alpha);
                            hVar.getClass();
                            M2.b bVar = (M2.b) objectRef11.alpha;
                            X2.k kVar3 = (X2.k) objectRef10.alpha;
                            cVar6.alpha = iVar;
                            cVar6.purple = hVar;
                            cVar6.red = obj;
                            cVar6.silver = cVar;
                            cVar6.teal = objectRef10;
                            cVar6.white = objectRef11;
                            cVar6.yellow = objectRef12;
                            cVar6.f2027s = objectRef12;
                            cVar6.f2030v = 1;
                            Object charlie = iVar.charlie(bVar, hVar, obj, kVar3, cVar, cVar6);
                            if (charlie != aVar2) {
                                iVar2 = iVar;
                                obj3 = obj;
                                cVar4 = cVar;
                                objectRef2 = objectRef10;
                                objectRef3 = objectRef11;
                                objectRef4 = objectRef12;
                                objectRef5 = objectRef4;
                                hVar2 = hVar;
                                obj4 = charlie;
                            }
                            return aVar2;
                        } catch (Throwable th) {
                            th = th;
                            objectRef = objectRef12;
                            obj2 = objectRef.alpha;
                            if (obj2 instanceof m) {
                                mVar2 = (m) obj2;
                            }
                            if (mVar2 != null) {
                                a3.h.alpha(mVar2.alpha);
                            }
                            throw th;
                        }
                    }
                    objectRef4.alpha = obj4;
                    Object obj9 = objectRef5.alpha;
                    eVar = (R2.e) obj9;
                    if (!(eVar instanceof m)) {
                        AbstractC3220y abstractC3220y = hVar2.sierra;
                        Ref.ObjectRef objectRef13 = objectRef5;
                        X2.h hVar5 = hVar2;
                        try {
                            d dVar = new d(iVar2, objectRef13, objectRef3, hVar5, obj3, objectRef2, cVar4, null);
                            hVar3 = hVar5;
                            Ref.ObjectRef objectRef14 = objectRef2;
                            cVar5 = cVar4;
                            cVar6.alpha = iVar2;
                            cVar6.purple = hVar3;
                            cVar6.red = cVar5;
                            cVar6.silver = objectRef14;
                            cVar6.teal = objectRef5;
                            cVar6.white = null;
                            cVar6.yellow = null;
                            cVar6.f2027s = null;
                            cVar6.f2030v = 2;
                            Object blue = ad.blue(abstractC3220y, dVar, cVar6);
                            if (blue != aVar2) {
                                objectRef7 = objectRef14;
                                iVar4 = iVar2;
                                obj6 = blue;
                                objectRef6 = objectRef7;
                                iVar3 = iVar4;
                                aVar = (a) obj6;
                                M2.c cVar72 = cVar5;
                                X2.h hVar42 = hVar3;
                                obj5 = objectRef5.alpha;
                                if (obj5 instanceof m) {
                                }
                                if (mVar != null) {
                                }
                                X2.k kVar22 = (X2.k) objectRef6.alpha;
                                cVar6.alpha = null;
                                cVar6.purple = null;
                                cVar6.red = null;
                                cVar6.silver = null;
                                cVar6.teal = null;
                                cVar6.white = null;
                                cVar6.yellow = null;
                                cVar6.f2027s = null;
                                cVar6.f2030v = 3;
                                iVar3.getClass();
                                list = hVar42.foxtrot;
                                obj7 = aVar;
                                if (!list.isEmpty()) {
                                }
                            } else {
                                return aVar2;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            objectRef = objectRef13;
                            obj2 = objectRef.alpha;
                            if (obj2 instanceof m) {
                            }
                            if (mVar2 != null) {
                            }
                            throw th;
                        }
                    } else {
                        hVar3 = hVar2;
                        objectRef6 = objectRef2;
                        cVar5 = cVar4;
                        if (eVar instanceof R2.d) {
                            iVar3 = iVar2;
                            aVar = new a(((R2.d) obj9).alpha, ((R2.d) obj9).bravo, ((R2.d) obj9).charlie, null);
                            M2.c cVar722 = cVar5;
                            X2.h hVar422 = hVar3;
                            obj5 = objectRef5.alpha;
                            if (obj5 instanceof m) {
                            }
                            if (mVar != null) {
                            }
                            X2.k kVar222 = (X2.k) objectRef6.alpha;
                            cVar6.alpha = null;
                            cVar6.purple = null;
                            cVar6.red = null;
                            cVar6.silver = null;
                            cVar6.teal = null;
                            cVar6.white = null;
                            cVar6.yellow = null;
                            cVar6.f2027s = null;
                            cVar6.f2030v = 3;
                            iVar3.getClass();
                            list = hVar422.foxtrot;
                            obj7 = aVar;
                            if (!list.isEmpty()) {
                            }
                        } else {
                            throw new NoWhenBranchMatchedException();
                        }
                    }
                }
            }
            if (objectRef == 0) {
            }
            objectRef4.alpha = obj4;
            Object obj92 = objectRef5.alpha;
            eVar = (R2.e) obj92;
            if (!(eVar instanceof m)) {
            }
        } catch (Throwable th3) {
            th = th3;
        }
        cVar3 = new c(iVar, cVar2);
        c cVar62 = cVar3;
        Object obj72 = cVar62.f2028t;
        Od.a aVar22 = Od.a.alpha;
        objectRef = cVar62.f2030v;
        m mVar22 = null;
        BitmapDrawable bitmapDrawable2 = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00d6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00cc -> B:10:0x00ce). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object charlie(M2.b bVar, X2.h hVar, Object obj, X2.k kVar, M2.c cVar, Pd.c cVar2) {
        e eVar;
        i iVar;
        int i4;
        Object obj2;
        X2.k kVar2;
        M2.c cVar3;
        int i5;
        e eVar2;
        i iVar2;
        M2.b bVar2;
        X2.h hVar2;
        int size;
        Pair pair;
        m mVar;
        if (cVar2 instanceof e) {
            eVar = (e) cVar2;
            int i10 = eVar.f2034u;
            if ((i10 & RecyclerView.UNDEFINED_DURATION) != 0) {
                eVar.f2034u = i10 - RecyclerView.UNDEFINED_DURATION;
                iVar = this;
                Object obj3 = eVar.f2032s;
                Od.a aVar = Od.a.alpha;
                i4 = eVar.f2034u;
                if (i4 == 0) {
                    if (i4 == 1) {
                        int i11 = eVar.yellow;
                        M2.c cVar4 = eVar.white;
                        X2.k kVar3 = eVar.teal;
                        Object obj4 = eVar.silver;
                        X2.h hVar3 = eVar.red;
                        M2.b bVar3 = eVar.purple;
                        iVar2 = eVar.alpha;
                        ResultKt.alpha(obj3);
                        eVar2 = eVar;
                        hVar2 = hVar3;
                        i5 = i11;
                        obj2 = obj4;
                        cVar3 = cVar4;
                        kVar2 = kVar3;
                        R2.e eVar3 = (R2.e) obj3;
                        try {
                            cVar3.getClass();
                            if (eVar3 == null) {
                                return eVar3;
                            }
                            bVar2 = bVar3;
                            M2.k kVar4 = iVar2.alpha;
                            List list = bVar2.delta;
                            size = list.size();
                            while (true) {
                                if (i5 >= size) {
                                    Pair pair2 = (Pair) list.get(i5);
                                    R2.f fVar = (R2.f) pair2.first;
                                    if (((Class) pair2.second).isAssignableFrom(obj2.getClass())) {
                                        Intrinsics.charlie(fVar, "null cannot be cast to non-null type coil.fetch.Fetcher.Factory<kotlin.Any>");
                                        R2.g alpha = fVar.alpha(obj2, kVar2);
                                        if (alpha != null) {
                                            pair = new Pair(alpha, Integer.valueOf(i5));
                                            break;
                                        }
                                    }
                                    i5++;
                                } else {
                                    pair = null;
                                    break;
                                }
                            }
                            if (pair == null) {
                                R2.g gVar = (R2.g) pair.getFirst();
                                i5 = ((Number) pair.getSecond()).intValue() + 1;
                                cVar3.getClass();
                                eVar2.alpha = iVar2;
                                eVar2.purple = bVar2;
                                eVar2.red = hVar2;
                                eVar2.silver = obj2;
                                eVar2.teal = kVar2;
                                eVar2.white = cVar3;
                                eVar2.yellow = i5;
                                eVar2.f2034u = 1;
                                Object alpha2 = gVar.alpha(eVar2);
                                if (alpha2 == aVar) {
                                    return aVar;
                                }
                                bVar3 = bVar2;
                                obj3 = alpha2;
                                R2.e eVar32 = (R2.e) obj3;
                                cVar3.getClass();
                                if (eVar32 == null) {
                                }
                            } else {
                                throw new IllegalStateException(P0.bronze(obj2, "Unable to create a fetcher that supports: ").toString());
                            }
                        } catch (Throwable th) {
                            if (eVar32 instanceof m) {
                                mVar = (m) eVar32;
                            } else {
                                mVar = null;
                            }
                            if (mVar != null) {
                                a3.h.alpha(mVar.alpha);
                            }
                            throw th;
                        }
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.alpha(obj3);
                    obj2 = obj;
                    kVar2 = kVar;
                    cVar3 = cVar;
                    i5 = 0;
                    eVar2 = eVar;
                    iVar2 = iVar;
                    bVar2 = bVar;
                    hVar2 = hVar;
                    M2.k kVar42 = iVar2.alpha;
                    List list2 = bVar2.delta;
                    size = list2.size();
                    while (true) {
                        if (i5 >= size) {
                        }
                        i5++;
                    }
                    if (pair == null) {
                    }
                }
            }
        }
        iVar = this;
        eVar = new e(iVar, cVar2);
        Object obj32 = eVar.f2032s;
        Od.a aVar2 = Od.a.alpha;
        i4 = eVar.f2034u;
        if (i4 == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object delta(l lVar, Pd.c cVar) {
        f fVar;
        int i4;
        i iVar;
        V2.a aVar;
        i iVar2 = this;
        l lVar2 = lVar;
        int i5 = 1;
        O7.j jVar = iVar2.delta;
        if (cVar instanceof f) {
            fVar = (f) cVar;
            int i10 = fVar.teal;
            if ((i10 & RecyclerView.UNDEFINED_DURATION) != 0) {
                fVar.teal = i10 - RecyclerView.UNDEFINED_DURATION;
                f fVar2 = fVar;
                Object obj = fVar2.red;
                Od.a aVar2 = Od.a.alpha;
                i4 = fVar2.teal;
                if (i4 == 0) {
                    if (i4 == 1) {
                        l lVar3 = fVar2.purple;
                        iVar = fVar2.alpha;
                        try {
                            ResultKt.alpha(obj);
                            return obj;
                        } catch (Throwable th) {
                            th = th;
                            lVar2 = lVar3;
                        }
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.alpha(obj);
                    try {
                        X2.h hVar = (X2.h) lVar2.silver;
                        Object obj2 = hVar.bravo;
                        Y2.h hVar2 = (Y2.h) lVar2.white;
                        Bitmap.Config[] configArr = a3.h.alpha;
                        M2.c cVar2 = (M2.c) lVar2.yellow;
                        X2.k yankee = iVar2.charlie.yankee(hVar, hVar2);
                        Y2.g gVar = yankee.echo;
                        List list = iVar2.alpha.hotel.bravo;
                        int size = list.size();
                        int i11 = 0;
                        while (i11 < size) {
                            try {
                                Pair pair = (Pair) list.get(i11);
                                int i12 = i5;
                                U2.a aVar3 = (U2.a) pair.first;
                                if (((Class) pair.second).isAssignableFrom(obj2.getClass())) {
                                    Intrinsics.charlie(aVar3, "null cannot be cast to non-null type coil.map.Mapper<kotlin.Any, *>");
                                    Object alpha = aVar3.alpha(obj2, yankee);
                                    if (alpha != null) {
                                        obj2 = alpha;
                                    }
                                }
                                i11++;
                                i5 = i12;
                            } catch (Throwable th2) {
                                th = th2;
                                iVar2 = this;
                                iVar = iVar2;
                                if (th instanceof CancellationException) {
                                }
                            }
                        }
                        int i13 = i5;
                        try {
                            MemoryCache$Key foxtrot = jVar.foxtrot(hVar, obj2, yankee, cVar2);
                            if (foxtrot != null) {
                                aVar = jVar.delta(hVar, foxtrot, hVar2, gVar);
                            } else {
                                aVar = null;
                            }
                            if (aVar != null) {
                                return O7.j.golf(lVar2, hVar, foxtrot, aVar);
                            }
                            try {
                                AbstractC3220y abstractC3220y = hVar.romeo;
                                iVar2 = this;
                                g gVar2 = new g(iVar2, hVar, obj2, yankee, cVar2, foxtrot, lVar2, null);
                                fVar2.alpha = iVar2;
                                fVar2.purple = lVar2;
                                fVar2.teal = i13;
                                Object blue = ad.blue(abstractC3220y, gVar2, fVar2);
                                if (blue == aVar2) {
                                    return aVar2;
                                }
                                return blue;
                            } catch (Throwable th3) {
                                th = th3;
                                iVar2 = this;
                                iVar = iVar2;
                                if (th instanceof CancellationException) {
                                }
                            }
                        } catch (Throwable th4) {
                            th = th4;
                        }
                    } catch (Throwable th5) {
                        th = th5;
                    }
                }
                if (th instanceof CancellationException) {
                    J2.c cVar3 = iVar.charlie;
                    return J2.c.november((X2.h) lVar2.silver, th);
                }
                throw th;
            }
        }
        fVar = new f(iVar2, cVar);
        f fVar22 = fVar;
        Object obj3 = fVar22.red;
        Od.a aVar22 = Od.a.alpha;
        i4 = fVar22.teal;
        if (i4 == 0) {
        }
        if (th instanceof CancellationException) {
        }
    }
}
