package s6;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import androidx.recyclerview.widget.RecyclerView;
import delivery.samurai.android.R;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import me.AbstractC2120h;
import of.AbstractC2254i;
import pe.InterfaceC2326b;
import pe.InterfaceC2330f;
import pe.InterfaceC2334j;
import pe.InterfaceC2335k;
import pe.InterfaceC2345u;
import se.AbstractC2863m;
import se.C2871u;
import t6.AbstractC3032n3;
import x3.C3294a;

/* renamed from: s6.g5, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2661g5 {
    public static final void alpha(RecyclerView recyclerView, int i4, int i5) {
        recyclerView.addItemDecoration(new C3294a((int) recyclerView.getResources().getDimension(i4), (int) recyclerView.getResources().getDimension(i5), 0));
    }

    public static final void bravo(RecyclerView recyclerView, int i4, int i5) {
        Intrinsics.echo(recyclerView, "<this>");
        Drawable echo = AbstractC3032n3.echo(R.drawable.horizontal_divider, recyclerView.getContext());
        int dimensionPixelSize = recyclerView.getResources().getDimensionPixelSize(i5);
        int dimensionPixelSize2 = recyclerView.getResources().getDimensionPixelSize(i4);
        InsetDrawable insetDrawable = new InsetDrawable(echo, dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize);
        androidx.recyclerview.widget.aa aaVar = new androidx.recyclerview.widget.aa(recyclerView.getContext());
        aaVar.alpha = insetDrawable;
        recyclerView.addItemDecoration(aaVar);
    }

    public static final void charlie(RecyclerView recyclerView, int i4, int i5) {
        recyclerView.addItemDecoration(new C3294a((int) recyclerView.getResources().getDimension(i4), (int) recyclerView.getResources().getDimension(i5), 1));
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a5, code lost:
    
        if ((r4 instanceof se.ai) == false) goto L37;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String delta(InterfaceC2345u interfaceC2345u, int i4) {
        boolean z2;
        String bravo;
        boolean z10 = true;
        if ((i4 & 1) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if ((i4 & 2) == 0) {
            z10 = false;
        }
        Intrinsics.echo(interfaceC2345u, "<this>");
        StringBuilder sb2 = new StringBuilder();
        if (z10) {
            if (interfaceC2345u instanceof InterfaceC2334j) {
                bravo = "<init>";
            } else {
                bravo = ((AbstractC2863m) interfaceC2345u).getName().bravo();
                Intrinsics.delta(bravo, "name.asString()");
            }
            sb2.append(bravo);
        }
        sb2.append("(");
        C2871u g2 = interfaceC2345u.g();
        if (g2 != null) {
            kotlin.reflect.jvm.internal.impl.types.y type = g2.getType();
            Intrinsics.delta(type, "it.type");
            sb2.append(foxtrot(type));
        }
        Iterator it = interfaceC2345u.peach().iterator();
        while (it.hasNext()) {
            kotlin.reflect.jvm.internal.impl.types.y type2 = ((se.aq) it.next()).getType();
            Intrinsics.delta(type2, "parameter.type");
            sb2.append(foxtrot(type2));
        }
        sb2.append(")");
        if (z2) {
            if (!(interfaceC2345u instanceof InterfaceC2334j)) {
                kotlin.reflect.jvm.internal.impl.types.y returnType = interfaceC2345u.getReturnType();
                Intrinsics.checkNotNull(returnType);
                if (returnType != null) {
                    Ne.f fVar = AbstractC2120h.echo;
                    if (AbstractC2120h.beige(returnType, me.m.delta)) {
                        kotlin.reflect.jvm.internal.impl.types.y returnType2 = interfaceC2345u.getReturnType();
                        Intrinsics.checkNotNull(returnType2);
                        if (!kotlin.reflect.jvm.internal.impl.types.az.foxtrot(returnType2)) {
                        }
                    }
                    kotlin.reflect.jvm.internal.impl.types.y returnType3 = interfaceC2345u.getReturnType();
                    Intrinsics.checkNotNull(returnType3);
                    sb2.append(foxtrot(returnType3));
                } else {
                    AbstractC2120h.alpha(142);
                    throw null;
                }
            }
            sb2.append("V");
        }
        String sb3 = sb2.toString();
        Intrinsics.delta(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }

    public static final String echo(InterfaceC2326b interfaceC2326b) {
        InterfaceC2330f interfaceC2330f;
        se.ak akVar;
        Intrinsics.echo(interfaceC2326b, "<this>");
        if (!Qe.e.oscar(interfaceC2326b)) {
            InterfaceC2335k lima = interfaceC2326b.lima();
            if (lima instanceof InterfaceC2330f) {
                interfaceC2330f = (InterfaceC2330f) lima;
            } else {
                interfaceC2330f = null;
            }
            if (interfaceC2330f != null && !interfaceC2330f.getName().purple) {
                InterfaceC2326b alpha = interfaceC2326b.alpha();
                if (alpha instanceof se.ak) {
                    akVar = (se.ak) alpha;
                } else {
                    akVar = null;
                }
                if (akVar != null) {
                    return AbstractC2643e5.foxtrot(interfaceC2330f, delta(akVar, 3));
                }
            }
        }
        return null;
    }

    public static final Ge.k foxtrot(kotlin.reflect.jvm.internal.impl.types.y yVar) {
        Intrinsics.echo(yVar, "<this>");
        return (Ge.k) AbstractC2616b5.foxtrot(yVar, Ge.q.kilo, AbstractC2254i.bravo);
    }
}
