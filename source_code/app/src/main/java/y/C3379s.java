package y;

import android.content.Context;
import android.os.LocaleList;
import android.view.textclassifier.TextClassification;
import android.view.textclassifier.TextClassifier;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.E0;
import androidx.compose.runtime.t0;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: y.s, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3379s {
    public final Nd.h alpha;
    public final Context bravo;
    public final EnumC3381u charlie;
    public final K0.b delta;
    public TextClassifier foxtrot;
    public final Ef.c echo = Ef.d.alpha();
    public final androidx.compose.runtime.ax golf = C0564b.zulu(null);
    public final Object hotel = new Object();

    public C3379s(Nd.h hVar, Context context, EnumC3381u enumC3381u, K0.b bVar) {
        this.alpha = hVar;
        this.bravo = context;
        this.charlie = enumC3381u;
        this.delta = bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0083 A[Catch: all -> 0x00a0, TryCatch #0 {all -> 0x00a0, blocks: (B:24:0x0078, B:26:0x0083, B:28:0x008d, B:32:0x009a), top: B:23:0x0078 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object alpha(C3379s c3379s, CharSequence charSequence, long j5, TextClassifier textClassifier, Pd.c cVar) {
        C3373m c3373m;
        Od.a aVar;
        int i4;
        Ef.c cVar2;
        long j6;
        CharSequence charSequence2;
        TextClassifier textClassifier2;
        Ef.c cVar3;
        ao aoVar;
        TextClassification.Request.Builder defaultLocales;
        TextClassification.Request build;
        TextClassification classifyText;
        long j7;
        CharSequence charSequence3;
        boolean z2;
        c3379s.getClass();
        try {
            if (cVar instanceof C3373m) {
                c3373m = (C3373m) cVar;
                int i5 = c3373m.yellow;
                if ((i5 & RecyclerView.UNDEFINED_DURATION) != 0) {
                    c3373m.yellow = i5 - RecyclerView.UNDEFINED_DURATION;
                    Object obj = c3373m.teal;
                    aVar = Od.a.alpha;
                    i4 = c3373m.yellow;
                    androidx.compose.runtime.ax axVar = c3379s.golf;
                    cVar2 = c3379s.echo;
                    if (i4 == 0) {
                        if (i4 != 1) {
                            if (i4 == 2) {
                                j7 = c3373m.silver;
                                cVar2 = c3373m.red;
                                classifyText = vg.al.india(c3373m.purple);
                                charSequence3 = c3373m.alpha;
                                ResultKt.alpha(obj);
                                try {
                                    ((t0) axVar).setValue(new ao(charSequence3, j7, classifyText));
                                    cVar3.foxtrot(null);
                                    return Unit.INSTANCE;
                                } finally {
                                }
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        j6 = c3373m.silver;
                        cVar3 = c3373m.red;
                        textClassifier2 = vg.al.kilo(c3373m.purple);
                        charSequence2 = c3373m.alpha;
                        ResultKt.alpha(obj);
                    } else {
                        ResultKt.alpha(obj);
                        c3373m.alpha = charSequence;
                        c3373m.purple = textClassifier;
                        c3373m.red = cVar2;
                        j6 = j5;
                        c3373m.silver = j6;
                        c3373m.yellow = 1;
                        if (cVar2.delta(c3373m) != aVar) {
                            charSequence2 = charSequence;
                            textClassifier2 = textClassifier;
                            cVar3 = cVar2;
                        }
                        return aVar;
                    }
                    aoVar = (ao) ((t0) axVar).getValue();
                    if (aoVar != null) {
                        E0 e02 = AbstractC3380t.alpha;
                        if (D0.am.bravo(j6, aoVar.bravo) && Intrinsics.areEqual(charSequence2, aoVar.alpha)) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (z2) {
                            return Unit.INSTANCE;
                        }
                    }
                    cVar3.foxtrot(null);
                    q1.c.tango();
                    defaultLocales = q1.c.hotel(charSequence2, D0.am.foxtrot(j6), D0.am.echo(j6)).setDefaultLocales(c3379s.bravo());
                    build = defaultLocales.build();
                    classifyText = textClassifier2.classifyText(build);
                    c3373m.alpha = charSequence2;
                    c3373m.purple = classifyText;
                    c3373m.red = cVar2;
                    c3373m.silver = j6;
                    c3373m.yellow = 2;
                    if (cVar2.delta(c3373m) != aVar) {
                        j7 = j6;
                        charSequence3 = charSequence2;
                        ((t0) axVar).setValue(new ao(charSequence3, j7, classifyText));
                        cVar3.foxtrot(null);
                        return Unit.INSTANCE;
                    }
                    return aVar;
                }
            }
            aoVar = (ao) ((t0) axVar).getValue();
            if (aoVar != null) {
            }
            cVar3.foxtrot(null);
            q1.c.tango();
            defaultLocales = q1.c.hotel(charSequence2, D0.am.foxtrot(j6), D0.am.echo(j6)).setDefaultLocales(c3379s.bravo());
            build = defaultLocales.build();
            classifyText = textClassifier2.classifyText(build);
            c3373m.alpha = charSequence2;
            c3373m.purple = classifyText;
            c3373m.red = cVar2;
            c3373m.silver = j6;
            c3373m.yellow = 2;
            if (cVar2.delta(c3373m) != aVar) {
            }
            return aVar;
        } finally {
        }
        c3373m = new C3373m(c3379s, cVar);
        Object obj2 = c3373m.teal;
        aVar = Od.a.alpha;
        i4 = c3373m.yellow;
        androidx.compose.runtime.ax axVar2 = c3379s.golf;
        cVar2 = c3379s.echo;
        if (i4 == 0) {
        }
    }

    public final LocaleList bravo() {
        int collectionSizeOrDefault;
        K0.b bVar = this.delta;
        if (bVar != null) {
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(bVar, 10);
            ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
            Iterator it = bVar.alpha.iterator();
            while (it.hasNext()) {
                arrayList.add(((K0.a) it.next()).alpha);
            }
            Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
            return s1.af.echo((Locale[]) Arrays.copyOf(localeArr, localeArr.length));
        }
        s1.af.oscar();
        return s1.af.echo(new Locale[]{K0.d.alpha.delta().alpha().alpha});
    }
}
