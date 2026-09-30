package Jc;

import T.s;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.InterfaceC0581m;
import com.app.network.network.models.ActiveSuspension;
import com.checkout.components.ui.mapper.InputFieldStyleToViewStyleMapper;
import com.checkout.components.ui.model.style.base.TextStyle;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import t6.T2;

/* loaded from: classes2.dex */
public final /* synthetic */ class i implements Xd.l {
    public final /* synthetic */ int alpha = 0;
    public final /* synthetic */ Object purple;
    public final /* synthetic */ boolean red;
    public final /* synthetic */ Object silver;
    public final /* synthetic */ Object teal;
    public final /* synthetic */ Object white;

    public /* synthetic */ i(ActiveSuspension activeSuspension, Kc.e eVar, boolean z2, Function0 function0, Function0 function02, int i4) {
        this.silver = activeSuspension;
        this.teal = eVar;
        this.red = z2;
        this.purple = function0;
        this.white = function02;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        Unit provideTextLabel$lambda$1;
        switch (this.alpha) {
            case 0:
                ((Integer) obj2).getClass();
                int cyan = C0564b.cyan(1);
                Function0 function0 = (Function0) this.purple;
                Function0 function02 = (Function0) this.white;
                o.hotel((ActiveSuspension) this.silver, (Kc.e) this.teal, this.red, function0, function02, (InterfaceC0581m) obj, cyan);
                return Unit.INSTANCE;
            case 1:
                ((Integer) obj2).getClass();
                int cyan2 = C0564b.cyan(1);
                T2.alpha(cyan2, (s) this.silver, (InterfaceC0581m) obj, (String) this.teal, (String) this.white, (Function0) this.purple, this.red);
                return Unit.INSTANCE;
            default:
                int intValue = ((Integer) obj2).intValue();
                InputFieldStyleToViewStyleMapper inputFieldStyleToViewStyleMapper = (InputFieldStyleToViewStyleMapper) this.white;
                provideTextLabel$lambda$1 = InputFieldStyleToViewStyleMapper.provideTextLabel$lambda$1((String) this.silver, (Integer) this.teal, (TextStyle) this.purple, this.red, inputFieldStyleToViewStyleMapper, (InterfaceC0581m) obj, intValue);
                return provideTextLabel$lambda$1;
        }
    }

    public /* synthetic */ i(String str, Integer num, TextStyle textStyle, boolean z2, InputFieldStyleToViewStyleMapper inputFieldStyleToViewStyleMapper) {
        this.silver = str;
        this.teal = num;
        this.purple = textStyle;
        this.red = z2;
        this.white = inputFieldStyleToViewStyleMapper;
    }

    public /* synthetic */ i(String str, Function0 function0, s sVar, boolean z2, String str2, int i4) {
        this.purple = function0;
        this.silver = sVar;
        this.red = z2;
        this.teal = str;
        this.white = str2;
    }
}
