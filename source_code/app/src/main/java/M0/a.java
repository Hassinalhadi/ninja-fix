package M0;

import B2.v;
import K0.b;
import Q0.d;
import Q0.p;
import Q0.q;
import a0.ao;
import android.os.Build;
import android.text.Spannable;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.LocaleSpan;
import android.text.style.RelativeSizeSpan;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.collections.CollectionsKt__IterablesKt;
import s1.af;

/* loaded from: classes3.dex */
public abstract class a {
    public static final float alpha(long j5, float f5, d dVar) {
        float charlie;
        long bravo = p.bravo(j5);
        if (q.alpha(bravo, 4294967296L)) {
            if (dVar.indigo() > 1.05d) {
                charlie = p.charlie(j5) / p.charlie(dVar.beige(f5));
            } else {
                return dVar.teal(j5);
            }
        } else if (q.alpha(bravo, 8589934592L)) {
            charlie = p.charlie(j5);
        } else {
            return Float.NaN;
        }
        return charlie * f5;
    }

    public static final void bravo(Spannable spannable, long j5, int i4, int i5) {
        if (j5 != 16) {
            spannable.setSpan(new ForegroundColorSpan(ao.beige(j5)), i4, i5, 33);
        }
    }

    public static final void charlie(Spannable spannable, long j5, d dVar, int i4, int i5) {
        long bravo = p.bravo(j5);
        if (q.alpha(bravo, 4294967296L)) {
            spannable.setSpan(new AbsoluteSizeSpan(Zd.a.delta(dVar.teal(j5)), false), i4, i5, 33);
        } else if (q.alpha(bravo, 8589934592L)) {
            spannable.setSpan(new RelativeSizeSpan(p.charlie(j5)), i4, i5, 33);
        }
    }

    public static final void delta(Spannable spannable, b bVar, int i4, int i5) {
        K0.a alpha;
        LocaleSpan localeSpan;
        int collectionSizeOrDefault;
        if (bVar != null) {
            int i10 = Build.VERSION.SDK_INT;
            List list = bVar.alpha;
            if (i10 >= 24) {
                collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(bVar, 10);
                ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((K0.a) it.next()).alpha);
                }
                Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
                localeSpan = v.echo(af.echo((Locale[]) Arrays.copyOf(localeArr, localeArr.length)));
            } else {
                if (list.isEmpty()) {
                    alpha = K0.d.alpha.delta().alpha();
                } else {
                    alpha = bVar.alpha();
                }
                localeSpan = new LocaleSpan(alpha.alpha);
            }
            spannable.setSpan(localeSpan, i4, i5, 33);
        }
    }
}
