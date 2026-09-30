package s6;

import a0.C0366t;
import android.graphics.Color;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import com.app.network.network.models.TagDto;
import gb.C1762a;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public abstract class S4 {
    public static final void alpha(TagDto tag, T.p pVar, InterfaceC0581m interfaceC0581m, int i4) {
        int i5;
        boolean z2;
        T.p pVar2;
        long j5;
        long j6;
        C0366t charlie;
        C0366t charlie2;
        Intrinsics.echo(tag, "tag");
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(360063603);
        if (c0585q.india(tag)) {
            i5 = 4;
        } else {
            i5 = 2;
        }
        int i10 = i5 | i4 | 48;
        if ((i10 & 19) != 18) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q.magenta(i10 & 1, z2)) {
            pVar2 = T.p.alpha;
            H0.v vVar = ob.l.delta;
            String color = tag.getColor();
            if (color != null && (charlie2 = charlie(color)) != null) {
                j5 = charlie2.alpha;
            } else {
                j5 = ob.l.alpha;
            }
            long j7 = j5;
            String foregroundColor = tag.getForegroundColor();
            if (foregroundColor != null && (charlie = charlie(foregroundColor)) != null) {
                j6 = charlie.alpha;
            } else {
                j6 = ob.l.bravo;
            }
            long j10 = j6;
            String value = tag.getValue();
            String value2 = tag.getValue();
            if (value2 == null) {
                value2 = "";
            }
            T4.alpha(pVar2, value, value2, new C1762a(j7, j10, ob.l.charlie, ob.l.delta, ob.l.echo, ob.l.foxtrot, ob.l.golf), 2, c0585q, 24582, 0);
        } else {
            c0585q.ochre();
            pVar2 = pVar;
        }
        androidx.compose.runtime.Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new Cb.a(i4, 28, tag, pVar2);
        }
    }

    public static final Object bravo(Set set, Enum r22, Enum r32, Enum r4, boolean z2) {
        Enum r12;
        if (z2) {
            if (set.contains(r22)) {
                r12 = r22;
            } else if (set.contains(r32)) {
                r12 = r32;
            } else {
                r12 = null;
            }
            if (Intrinsics.areEqual(r12, r22) && Intrinsics.areEqual(r4, r32)) {
                return null;
            }
            if (r4 == null) {
                return r12;
            }
            return r4;
        }
        if (r4 != null) {
            set = CollectionsKt.D(kotlin.collections.ab.november(set, r4));
        }
        return CollectionsKt.l(set);
    }

    public static final C0366t charlie(String str) {
        try {
            return new C0366t(a0.ao.charlie(Color.parseColor(kotlin.text.r.oscar(str, "0x", "#"))));
        } catch (Exception unused) {
            return null;
        }
    }
}
