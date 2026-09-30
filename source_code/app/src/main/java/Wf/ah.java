package Wf;

import com.clevertap.android.sdk.Constants;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import s6.AbstractC2716m6;

/* loaded from: classes2.dex */
public final class ah extends Pd.i implements Function1 {
    public int alpha;
    public final /* synthetic */ x purple;
    public final /* synthetic */ v red;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ah(x xVar, v vVar, Nd.c cVar) {
        super(1, cVar);
        this.purple = xVar;
        this.red = vVar;
    }

    @Override // Pd.a
    public final Nd.c create(Nd.c cVar) {
        return new ah(this.purple, this.red, cVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((ah) create((Nd.c) obj)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        int collectionSizeOrDefault;
        int collectionSizeOrDefault2;
        Object obj2;
        Od.a aVar = Od.a.alpha;
        int i4 = this.alpha;
        if (i4 != 0) {
            if (i4 == 1) {
                ResultKt.alpha(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.alpha(obj);
            v vVar = this.red;
            String str = vVar.bravo;
            this.alpha = 1;
            InputStream alpha = this.purple.alpha(str);
            int i5 = (int) vVar.delta;
            byte[] bArr = new byte[i5];
            long j5 = 0;
            while (true) {
                long j6 = vVar.charlie;
                if (j5 >= j6) {
                    break;
                }
                try {
                    long skip = alpha.skip(j6 - j5);
                    if (skip == 0) {
                        break;
                    }
                    j5 += skip;
                } finally {
                }
            }
            int i10 = 0;
            while (i10 < i5) {
                int read = alpha.read(bArr, i10, i5 - i10);
                if (read <= 0) {
                    break;
                }
                i10 += read;
            }
            AbstractC2716m6.alpha(alpha, null);
            if (bArr == aVar) {
                return aVar;
            }
            obj = bArr;
        }
        List navy = StringsKt.navy(kotlin.text.r.foxtrot((byte[]) obj), new char[]{'|'});
        String str2 = (String) CollectionsKt.gold(navy);
        String str3 = (String) CollectionsKt.ochre(navy);
        if (Intrinsics.areEqual(str2, "plurals")) {
            Regex regex = ai.alpha;
            List<String> maroon = StringsKt.maroon(str3, new String[]{Constants.SEPARATOR_COMMA}, 6);
            collectionSizeOrDefault2 = CollectionsKt__IterablesKt.collectionSizeOrDefault(maroon, 10);
            int quebec = kotlin.collections.y.quebec(collectionSizeOrDefault2);
            if (quebec < 16) {
                quebec = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(quebec);
            for (String str4 : maroon) {
                String red = StringsKt.red(str4, ':');
                String pink = StringsKt.pink(':', str4, str4);
                Xf.a.alpha.getClass();
                Iterator it = Xf.a.red.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj2 = it.next();
                        if (kotlin.text.r.hotel(((Xf.a) obj2).name(), red, true)) {
                            break;
                        }
                    } else {
                        obj2 = null;
                        break;
                    }
                }
                Xf.a aVar2 = (Xf.a) obj2;
                Intrinsics.checkNotNull(aVar2);
                Pair pair = new Pair(aVar2, kotlin.text.r.foxtrot(Ud.c.alpha(Ud.c.foxtrot, pink)));
                linkedHashMap.put(pair.getFirst(), pair.getSecond());
            }
            return new ab(linkedHashMap);
        }
        if (Intrinsics.areEqual(str2, "string-array")) {
            Regex regex2 = ai.alpha;
            List maroon2 = StringsKt.maroon(str3, new String[]{Constants.SEPARATOR_COMMA}, 6);
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(maroon2, 10);
            ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
            Iterator it2 = maroon2.iterator();
            while (it2.hasNext()) {
                arrayList.add(kotlin.text.r.foxtrot(Ud.c.alpha(Ud.c.foxtrot, (String) it2.next())));
            }
            return new aa(arrayList);
        }
        Regex regex3 = ai.alpha;
        return new ac(kotlin.text.r.foxtrot(Ud.c.alpha(Ud.c.foxtrot, str3)));
    }
}
