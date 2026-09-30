package yc;

import J2.n;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.f0;
import com.app.network.network.models.Shift;
import com.clevertap.android.sdk.variables.CTVariableUtils;
import delivery.samurai.android.R;
import java.text.NumberFormat;
import java.util.List;
import java.util.Locale;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.k;
import kotlin.text.StringsKt;
import s6.T6;
import t6.S3;
import x9.AbstractC3311e;

/* loaded from: classes2.dex */
public final class c extends AbstractC3311e {
    public final Context charlie;

    public c(Context context) {
        this.charlie = context;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x012e, code lost:
    
        if (r0 != null) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00a2, code lost:
    
        if (r12 != null) goto L39;
     */
    @Override // androidx.recyclerview.widget.az
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onBindViewHolder(f0 f0Var, int i4) {
        String str;
        double d4;
        String string;
        List<String> list;
        Object m206constructorimpl;
        C3416b holder = (C3416b) f0Var;
        Intrinsics.echo(holder, "holder");
        Object obj = this.alpha.get(i4);
        Intrinsics.delta(obj, "get(...)");
        Shift.PricingRule pricingRule = (Shift.PricingRule) obj;
        Context context = this.charlie;
        if (context == null) {
            context = holder.itemView.getContext();
        }
        String string2 = context.getString(R.string.empty_value);
        Intrinsics.delta(string2, "getString(...)");
        n nVar = holder.alpha;
        TextView textView = (TextView) nVar.silver;
        Intrinsics.checkNotNull(context);
        String messageKey = pricingRule.getMessageKey();
        if (messageKey != null) {
            str = StringsKt.b(messageKey).toString();
        } else {
            str = null;
        }
        if (str == null) {
            str = "";
        }
        String str2 = str;
        if (str2.length() > 0) {
            int identifier = context.getResources().getIdentifier(str2, CTVariableUtils.STRING, context.getPackageName());
            if (identifier != 0) {
                try {
                    Result.Companion companion = Result.INSTANCE;
                    m206constructorimpl = Result.m206constructorimpl(context.getString(identifier));
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.INSTANCE;
                    m206constructorimpl = Result.m206constructorimpl(ResultKt.createFailure(th));
                }
                if (m206constructorimpl instanceof k) {
                    m206constructorimpl = null;
                }
                String str3 = (String) m206constructorimpl;
                if (str3 != null) {
                    if (StringsKt.gray(str3)) {
                        str3 = null;
                    }
                    if (str3 != null) {
                        str2 = str3;
                    }
                }
            }
        } else {
            String prediction = pricingRule.getPrediction();
            if (prediction != null) {
                if (!StringsKt.gray(prediction)) {
                    str2 = prediction;
                } else {
                    str2 = null;
                }
            }
            str2 = context.getString(R.string.empty_value);
            Intrinsics.delta(str2, "getString(...)");
        }
        if (!StringsKt.gray(str2)) {
            string2 = str2;
        }
        textView.setText(string2);
        Locale locale = T6.alpha(context.getResources().getConfiguration()).alpha.get(0);
        if (locale == null) {
            locale = Locale.getDefault();
            Intrinsics.delta(locale, "getDefault(...)");
        }
        NumberFormat numberInstance = NumberFormat.getNumberInstance(locale);
        numberInstance.setMinimumFractionDigits(2);
        numberInstance.setMaximumFractionDigits(2);
        Double displayableAmount = pricingRule.getDisplayableAmount();
        if (displayableAmount != null) {
            d4 = displayableAmount.doubleValue();
        } else {
            d4 = 0.0d;
        }
        String format = numberInstance.format(d4);
        String string3 = context.getString(R.string.currency_sar);
        Intrinsics.delta(string3, "getString(...)");
        String string4 = context.getString(R.string.amount_with_currency, format, string3);
        Intrinsics.delta(string4, "getString(...)");
        ((TextView) nVar.purple).setText(string4);
        List<String> preconditionMessages = pricingRule.getPreconditionMessages();
        if (preconditionMessages != null) {
            if (!preconditionMessages.isEmpty()) {
                list = preconditionMessages;
            } else {
                list = null;
            }
            if (list != null) {
                string = CollectionsKt.maroon(list, "\n", null, null, null, 62);
            }
        }
        string = context.getString(R.string.empty_value);
        Intrinsics.delta(string, "getString(...)");
        ((TextView) nVar.red).setText(string);
    }

    @Override // androidx.recyclerview.widget.az
    public final f0 onCreateViewHolder(ViewGroup parent, int i4) {
        Intrinsics.echo(parent, "parent");
        View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_pricing_rule_item, parent, false);
        int i5 = R.id.tv_amount;
        TextView textView = (TextView) S3.bravo(R.id.tv_amount, inflate);
        if (textView != null) {
            i5 = R.id.tv_condition;
            TextView textView2 = (TextView) S3.bravo(R.id.tv_condition, inflate);
            if (textView2 != null) {
                i5 = R.id.tv_rule_name;
                TextView textView3 = (TextView) S3.bravo(R.id.tv_rule_name, inflate);
                if (textView3 != null) {
                    return new C3416b(new n((LinearLayout) inflate, textView, textView2, textView3));
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i5)));
    }
}
