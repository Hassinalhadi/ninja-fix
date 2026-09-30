package w;

import A0.ad;
import D0.ae;
import D0.am;
import I0.aa;
import I0.ag;
import androidx.appcompat.widget.P0;
import androidx.compose.runtime.ax;
import androidx.compose.runtime.t0;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import n.e0;

/* renamed from: w.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C3229g implements Function1 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ C3230h purple;

    public /* synthetic */ C3229g(C3230h c3230h, int i4) {
        this.alpha = i4;
        this.purple = c3230h;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean z2 = true;
        C3230h c3230h = this.purple;
        switch (this.alpha) {
            case 0:
                ax axVar = c3230h.teal.tango;
                Boolean bool = Boolean.TRUE;
                ((t0) axVar).setValue(bool);
                ((t0) c3230h.teal.sierra).setValue(bool);
                C3230h.e(c3230h.teal, ((D0.g) obj).purple, c3230h.white, c3230h.yellow);
                return bool;
            case 1:
                List list = (List) obj;
                if (c3230h.teal.delta() != null) {
                    e0 delta = c3230h.teal.delta();
                    Intrinsics.checkNotNull(delta);
                    list.add(delta.alpha);
                } else {
                    z2 = false;
                }
                return Boolean.valueOf(z2);
            case 2:
                C3230h.e(c3230h.teal, ((D0.g) obj).purple, c3230h.white, c3230h.yellow);
                return Boolean.TRUE;
            default:
                D0.g replacement = (D0.g) obj;
                if (!c3230h.white && c3230h.yellow) {
                    ag agVar = c3230h.teal.echo;
                    if (agVar != null) {
                        List listOf = CollectionsKt.listOf(new Object(), new I0.a(replacement, 1));
                        n.ax axVar2 = c3230h.teal;
                        aa alpha = axVar2.delta.alpha(listOf);
                        agVar.alpha(null, alpha);
                        axVar2.victor.invoke(alpha);
                    } else {
                        aa aaVar = c3230h.silver;
                        String str = aaVar.alpha.purple;
                        int i4 = am.charlie;
                        long j5 = aaVar.bravo;
                        int i5 = (int) (j5 >> 32);
                        int i10 = (int) (j5 & 4294967295L);
                        Intrinsics.echo(str, "<this>");
                        Intrinsics.echo(replacement, "replacement");
                        if (i10 >= i5) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append((CharSequence) str, 0, i5);
                            sb2.append((CharSequence) replacement);
                            sb2.append((CharSequence) str, i10, str.length());
                            String obj2 = sb2.toString();
                            int length = replacement.purple.length() + ((int) (c3230h.silver.bravo >> 32));
                            c3230h.teal.victor.invoke(new aa(4, ae.bravo(length, length), obj2));
                        } else {
                            throw new IndexOutOfBoundsException(P0.azure(i10, i5, "End index (", ") is less than start index (", ")."));
                        }
                    }
                } else {
                    z2 = false;
                }
                return Boolean.valueOf(z2);
        }
    }

    public /* synthetic */ C3229g(C3230h c3230h, ad adVar) {
        this.alpha = 3;
        this.purple = c3230h;
    }
}
