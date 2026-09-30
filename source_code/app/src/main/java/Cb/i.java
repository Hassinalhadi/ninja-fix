package Cb;

import androidx.compose.runtime.ax;
import com.checkout.components.card.ui.component.cardnumber.SchemeChoiceSelectionViewKt;
import com.checkout.components.ui.model.CardScheme;
import com.checkout.components.ui.view.CheckboxLabelViewKt;
import com.checkout.components.ui.view.InputContainerViewKt;
import com.checkout.components.ui.view.InputFieldViewKt;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import s0.an;
import x.C3276g;

/* loaded from: classes2.dex */
public final /* synthetic */ class i implements Function1 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ ax purple;

    public /* synthetic */ i(ax axVar, int i4) {
        this.alpha = i4;
        this.purple = axVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Unit CheckboxLabelViewPreview$lambda$11$lambda$10$lambda$8$lambda$7;
        Unit InputComponentContainerPreview$lambda$8$lambda$5$lambda$4;
        Unit InputFieldPreview$lambda$13$lambda$12$lambda$11;
        D0.g gVar;
        switch (this.alpha) {
            case 0:
                String it = (String) obj;
                Intrinsics.echo(it, "it");
                this.purple.setValue(it);
                return Unit.INSTANCE;
            case 1:
                this.purple.setValue((b) obj);
                return Unit.INSTANCE;
            case 2:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                this.purple.setValue(bool);
                return Unit.INSTANCE;
            case 3:
                String it2 = (String) obj;
                Intrinsics.echo(it2, "it");
                this.purple.setValue(it2);
                return Unit.INSTANCE;
            case 4:
                String it3 = (String) obj;
                Intrinsics.echo(it3, "it");
                this.purple.setValue(it3);
                return Unit.INSTANCE;
            case 5:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                this.purple.setValue(bool2);
                return Unit.INSTANCE;
            case 6:
                String it4 = (String) obj;
                Intrinsics.echo(it4, "it");
                this.purple.setValue(it4);
                return Unit.INSTANCE;
            case 7:
                String it5 = (String) obj;
                Intrinsics.echo(it5, "it");
                this.purple.setValue(it5);
                return Unit.INSTANCE;
            case 8:
                String it6 = (String) obj;
                Intrinsics.echo(it6, "it");
                this.purple.setValue(it6);
                return Unit.INSTANCE;
            case 9:
                String it7 = (String) obj;
                Intrinsics.echo(it7, "it");
                this.purple.setValue(it7);
                return Unit.INSTANCE;
            case 10:
                Boolean bool3 = (Boolean) obj;
                bool3.booleanValue();
                this.purple.setValue(bool3);
                return Unit.INSTANCE;
            case 11:
                Boolean bool4 = (Boolean) obj;
                bool4.booleanValue();
                this.purple.setValue(bool4);
                return Unit.INSTANCE;
            case 12:
                String it8 = (String) obj;
                Intrinsics.echo(it8, "it");
                this.purple.setValue(it8);
                return Unit.INSTANCE;
            case 13:
                String it9 = (String) obj;
                Intrinsics.echo(it9, "it");
                this.purple.setValue(it9);
                return Unit.INSTANCE;
            case 14:
                Boolean bool5 = (Boolean) obj;
                bool5.booleanValue();
                this.purple.setValue(bool5);
                return Unit.INSTANCE;
            case 15:
                String it10 = (String) obj;
                Intrinsics.echo(it10, "it");
                this.purple.setValue(it10);
                return Unit.INSTANCE;
            case 16:
                Boolean bool6 = (Boolean) obj;
                bool6.booleanValue();
                this.purple.setValue(bool6);
                return Unit.INSTANCE;
            case 17:
                Jc.p it11 = (Jc.p) obj;
                Intrinsics.echo(it11, "it");
                this.purple.setValue(it11);
                return Unit.INSTANCE;
            case 18:
                String it12 = (String) obj;
                Intrinsics.echo(it12, "it");
                this.purple.setValue(it12);
                return Unit.INSTANCE;
            case 19:
                an drawWithContent = (an) obj;
                Intrinsics.echo(drawWithContent, "$this$drawWithContent");
                if (((Boolean) this.purple.getValue()).booleanValue()) {
                    drawWithContent.charlie();
                }
                return Unit.INSTANCE;
            case 20:
                return SchemeChoiceSelectionViewKt.delta(this.purple, (CardScheme) obj);
            case 21:
                Float f5 = (Float) obj;
                f5.getClass();
                ((Function1) this.purple.getValue()).invoke(f5);
                return Unit.INSTANCE;
            case 22:
                Float f10 = (Float) obj;
                f10.getClass();
                return Float.valueOf(((Number) ((Function1) this.purple.getValue()).invoke(f10)).floatValue());
            case 23:
                String str = (String) obj;
                Intrinsics.echo(str, "new");
                StringBuilder sb2 = new StringBuilder();
                int length = str.length();
                for (int i4 = 0; i4 < length; i4++) {
                    char charAt = str.charAt(i4);
                    if (Character.isDigit(charAt) || charAt == '.') {
                        sb2.append(charAt);
                    }
                }
                String sb3 = sb2.toString();
                int emerald = StringsKt.emerald(sb3, '.', 0, 6);
                if (emerald >= 0) {
                    int i5 = emerald + 1;
                    String substring = sb3.substring(0, i5);
                    Intrinsics.delta(substring, "substring(...)");
                    String substring2 = sb3.substring(i5);
                    Intrinsics.delta(substring2, "substring(...)");
                    sb3 = substring.concat(kotlin.text.r.oscar(substring2, ".", ""));
                }
                this.purple.setValue(sb3);
                return Unit.INSTANCE;
            case 24:
                CheckboxLabelViewPreview$lambda$11$lambda$10$lambda$8$lambda$7 = CheckboxLabelViewKt.CheckboxLabelViewPreview$lambda$11$lambda$10$lambda$8$lambda$7(this.purple, ((Boolean) obj).booleanValue());
                return CheckboxLabelViewPreview$lambda$11$lambda$10$lambda$8$lambda$7;
            case 25:
                InputComponentContainerPreview$lambda$8$lambda$5$lambda$4 = InputContainerViewKt.InputComponentContainerPreview$lambda$8$lambda$5$lambda$4(this.purple, (String) obj);
                return InputComponentContainerPreview$lambda$8$lambda$5$lambda$4;
            case 26:
                InputFieldPreview$lambda$13$lambda$12$lambda$11 = InputFieldViewKt.InputFieldPreview$lambda$13$lambda$12$lambda$11(this.purple, (String) obj);
                return InputFieldPreview$lambda$13$lambda$12$lambda$11;
            case 27:
                C3276g c3276g = (C3276g) obj;
                if (c3276g.charlie) {
                    gVar = c3276g.bravo;
                } else {
                    gVar = c3276g.alpha;
                }
                this.purple.setValue(gVar);
                return Unit.INSTANCE;
            case 28:
                List list = (List) obj;
                ax axVar = this.purple;
                if (axVar != null) {
                    axVar.setValue(list);
                }
                return Unit.INSTANCE;
            default:
                ((Function1) this.purple.getValue()).invoke((Z.b) obj);
                return Unit.INSTANCE;
        }
    }
}
