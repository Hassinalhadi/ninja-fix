package l2;

import androidx.work.impl.WorkDatabase_Impl;
import com.google.android.material.internal.ab;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: l2.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2054b extends Pd.i implements Xd.l {
    public xf.b alpha;
    public int purple;
    public final /* synthetic */ WorkDatabase_Impl red;
    public final /* synthetic */ ab silver;
    public final /* synthetic */ xf.e teal;
    public final /* synthetic */ J2.q white;
    public final /* synthetic */ xf.e yellow;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2054b(WorkDatabase_Impl workDatabase_Impl, ab abVar, xf.e eVar, J2.q qVar, xf.e eVar2, Nd.c cVar) {
        super(2, cVar);
        this.red = workDatabase_Impl;
        this.silver = abVar;
        this.teal = eVar;
        this.white = qVar;
        this.yellow = eVar2;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new C2054b(this.red, this.silver, this.teal, this.white, this.yellow, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((C2054b) create((vf.ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0121, code lost:
    
        if (r6.bravo(r14, r15) == r0) goto L50;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x010e A[Catch: all -> 0x0019, TRY_LEAVE, TryCatch #0 {all -> 0x0019, blocks: (B:7:0x0014, B:8:0x00fb, B:13:0x0106, B:15:0x010e, B:23:0x0026, B:56:0x00f4), top: B:2:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0124  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0121 -> B:8:0x00fb). Please report as a decompilation issue!!! */
    @Override // Pd.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        k kVar;
        xf.b bVar;
        WorkDatabase_Impl workDatabase_Impl;
        androidx.sqlite.db.framework.b bVar2;
        Od.a aVar = Od.a.alpha;
        int i4 = this.purple;
        ab abVar = this.silver;
        l lVar = this.red.delta;
        try {
            if (i4 != 0) {
                if (i4 != 1) {
                    if (i4 == 2) {
                        bVar = this.alpha;
                        ResultKt.alpha(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    bVar = this.alpha;
                    ResultKt.alpha(obj);
                    if (!((Boolean) obj).booleanValue()) {
                        bVar.delta();
                        Object call = this.white.call();
                        xf.e eVar = this.yellow;
                        this.alpha = bVar;
                        this.purple = 2;
                    } else {
                        lVar.bravo(abVar);
                        return Unit.INSTANCE;
                    }
                }
            } else {
                ResultKt.alpha(obj);
                lVar.getClass();
                String[] strArr = (String[]) abVar.purple;
                Ld.j jVar = new Ld.j();
                for (String str : strArr) {
                    Locale US = Locale.US;
                    Intrinsics.delta(US, "US");
                    String lowerCase = str.toLowerCase(US);
                    Intrinsics.delta(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                    HashMap hashMap = lVar.charlie;
                    if (hashMap.containsKey(lowerCase)) {
                        String lowerCase2 = str.toLowerCase(US);
                        Intrinsics.delta(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
                        Object obj2 = hashMap.get(lowerCase2);
                        Intrinsics.checkNotNull(obj2);
                        jVar.addAll((Collection) obj2);
                    } else {
                        jVar.add(str);
                    }
                }
                String[] strArr2 = (String[]) kotlin.collections.ab.bravo(jVar).toArray(new String[0]);
                ArrayList arrayList = new ArrayList(strArr2.length);
                for (String str2 : strArr2) {
                    LinkedHashMap linkedHashMap = lVar.delta;
                    Locale US2 = Locale.US;
                    Intrinsics.delta(US2, "US");
                    String lowerCase3 = str2.toLowerCase(US2);
                    Intrinsics.delta(lowerCase3, "this as java.lang.String).toLowerCase(locale)");
                    Integer num = (Integer) linkedHashMap.get(lowerCase3);
                    if (num != null) {
                        arrayList.add(num);
                    } else {
                        throw new IllegalArgumentException("There is no table with name ".concat(str2));
                    }
                }
                int[] y10 = CollectionsKt.y(arrayList);
                k kVar2 = new k(abVar, y10, strArr2);
                synchronized (lVar.juliet) {
                    kVar = (k) lVar.juliet.bravo(abVar, kVar2);
                }
                if (kVar == null && lVar.india.juliet(Arrays.copyOf(y10, y10.length)) && (bVar2 = (workDatabase_Impl = lVar.alpha).alpha) != null && bVar2.alpha.isOpen()) {
                    lVar.delta(workDatabase_Impl.hotel().lime());
                }
                bVar = new xf.b(this.teal);
            }
            this.alpha = bVar;
            this.purple = 1;
            obj = bVar.charlie(this);
            if (obj == aVar) {
                return aVar;
            }
            if (!((Boolean) obj).booleanValue()) {
            }
        } catch (Throwable th) {
            lVar.bravo(abVar);
            throw th;
        }
    }
}
