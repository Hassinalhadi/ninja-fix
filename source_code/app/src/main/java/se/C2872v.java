package se;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import pe.AbstractC2347w;
import pe.InterfaceC2321ad;
import s6.K4;
import t6.W1;

/* renamed from: se.v, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2872v extends Lambda implements Function0 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ C2873w purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2872v(C2873w c2873w, int i4) {
        super(0);
        this.alpha = i4;
        this.purple = c2873w;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int collectionSizeOrDefault;
        switch (this.alpha) {
            case 0:
                C2873w c2873w = this.purple;
                z zVar = c2873w.red;
                zVar.Y();
                return Boolean.valueOf(AbstractC2347w.hotel((C2862l) zVar.f13801d.getValue(), c2873w.silver));
            case 1:
                C2873w c2873w2 = this.purple;
                z zVar2 = c2873w2.red;
                zVar2.Y();
                return AbstractC2347w.india((C2862l) zVar2.f13801d.getValue(), c2873w2.silver);
            default:
                C2873w c2873w3 = this.purple;
                ff.i iVar = c2873w3.white;
                ge.v[] vVarArr = C2873w.f13797a;
                if (((Boolean) K4.alpha(iVar, vVarArr[1])).booleanValue()) {
                    return Xe.m.bravo;
                }
                List list = (List) K4.alpha(c2873w3.teal, vVarArr[0]);
                collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
                ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((InterfaceC2321ad) it.next()).olive());
                }
                z zVar3 = c2873w3.red;
                Ne.c cVar = c2873w3.silver;
                return W1.alpha("package view scope for " + cVar + " in " + zVar3.getName(), CollectionsKt.plus(arrayList, new al(zVar3, cVar)));
        }
    }
}
