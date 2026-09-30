package jb;

import T.p;
import T.s;
import Xd.l;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.InterfaceC0581m;
import com.checkout.components.ui.model.state.TextLabelState;
import com.checkout.components.ui.model.style.view.TextLabelViewStyle;
import com.checkout.components.ui.view.InputFieldErrorMessageViewKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import s6.F5;
import s6.G5;

/* renamed from: jb.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C1956a implements l {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ long purple;
    public final /* synthetic */ int red;
    public final /* synthetic */ Object silver;
    public final /* synthetic */ Object teal;

    public /* synthetic */ C1956a(long j5, Object obj, Object obj2, int i4, int i5) {
        this.alpha = i5;
        this.purple = j5;
        this.silver = obj;
        this.teal = obj2;
        this.red = i4;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        switch (this.alpha) {
            case 0:
                ((Integer) obj2).getClass();
                int cyan = C0564b.cyan(this.red | 1);
                Function0 function0 = (Function0) this.silver;
                p pVar = (p) this.teal;
                F5.alpha(this.purple, function0, pVar, (InterfaceC0581m) obj, cyan);
                return Unit.INSTANCE;
            case 1:
                ((Integer) obj2).getClass();
                int cyan2 = C0564b.cyan(49);
                long j5 = this.purple;
                int i4 = this.red;
                G5.alpha((String) this.silver, (s) this.teal, j5, i4, (InterfaceC0581m) obj, cyan2);
                return Unit.INSTANCE;
            default:
                InterfaceC0581m interfaceC0581m = (InterfaceC0581m) obj;
                int intValue = ((Integer) obj2).intValue();
                return InputFieldErrorMessageViewKt.alpha(this.purple, (TextLabelViewStyle) this.silver, (TextLabelState) this.teal, this.red, interfaceC0581m, intValue);
        }
    }

    public /* synthetic */ C1956a(String str, s sVar, long j5, int i4, int i5) {
        this.alpha = 1;
        this.silver = str;
        this.teal = sVar;
        this.purple = j5;
        this.red = i4;
    }
}
