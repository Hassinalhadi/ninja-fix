package Yb;

import androidx.compose.foundation.layout.C0554u;
import androidx.compose.foundation.layout.C0558y;
import com.app.network.network.models.TaskStatus;
import java.io.File;
import java.io.Serializable;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import q0.AbstractC2366B;
import q0.AbstractC2367C;

/* loaded from: classes2.dex */
public final /* synthetic */ class B0 implements Function1 {
    public final /* synthetic */ int alpha = 0;
    public final /* synthetic */ int purple;
    public final /* synthetic */ Object red;
    public final /* synthetic */ Object silver;
    public final /* synthetic */ Object teal;
    public final /* synthetic */ Serializable white;

    public /* synthetic */ B0(C0333u0 c0333u0, int i4, TaskStatus taskStatus, String str, File file) {
        this.red = c0333u0;
        this.purple = i4;
        this.silver = taskStatus;
        this.teal = str;
        this.white = file;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        androidx.compose.foundation.layout.P p4;
        int alpha;
        switch (this.alpha) {
            case 0:
                String it = (String) obj;
                Intrinsics.echo(it, "it");
                Q0.c.bronze((C0333u0) this.red, this.purple, (TaskStatus) this.silver, (String) this.teal, it, (File) this.white, null, 80);
                return Unit.INSTANCE;
            default:
                AbstractC2366B abstractC2366B = (AbstractC2366B) obj;
                AbstractC2367C[] abstractC2367CArr = (AbstractC2367C[]) this.red;
                int length = abstractC2367CArr.length;
                int i4 = 0;
                int i5 = 0;
                while (i4 < length) {
                    AbstractC2367C abstractC2367C = abstractC2367CArr[i4];
                    int i10 = i5 + 1;
                    Intrinsics.checkNotNull(abstractC2367C);
                    Object yankee = abstractC2367C.yankee();
                    C0558y c0558y = null;
                    if (yankee instanceof androidx.compose.foundation.layout.P) {
                        p4 = (androidx.compose.foundation.layout.P) yankee;
                    } else {
                        p4 = null;
                    }
                    Q0.n layoutDirection = ((q0.ar) this.teal).getLayoutDirection();
                    C0554u c0554u = (C0554u) this.silver;
                    c0554u.getClass();
                    if (p4 != null) {
                        c0558y = p4.charlie;
                    }
                    int i11 = this.purple;
                    if (c0558y != null) {
                        alpha = c0558y.foxtrot(i11 - abstractC2367C.alpha, layoutDirection);
                    } else {
                        alpha = c0554u.bravo.alpha(0, i11 - abstractC2367C.alpha, layoutDirection);
                    }
                    AbstractC2366B.hotel(abstractC2366B, abstractC2367C, alpha, ((int[]) this.white)[i5]);
                    i4++;
                    i5 = i10;
                }
                return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ B0(AbstractC2367C[] abstractC2367CArr, C0554u c0554u, int i4, q0.ar arVar, int[] iArr) {
        this.red = abstractC2367CArr;
        this.silver = c0554u;
        this.purple = i4;
        this.teal = arVar;
        this.white = iArr;
    }
}
