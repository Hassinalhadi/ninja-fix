package yc;

import J2.t;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.f0;
import com.app.network.network.models.Shift;
import delivery.samurai.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.r;
import t6.S3;
import x9.AbstractC3311e;

/* loaded from: classes2.dex */
public final class e extends AbstractC3311e {
    public final TreeMap charlie;

    public e(TreeMap treeMap) {
        this.charlie = treeMap;
    }

    @Override // androidx.recyclerview.widget.az
    public final void onBindViewHolder(f0 f0Var, int i4) {
        Integer num;
        Object obj;
        int color;
        String categoryColor;
        d holder = (d) f0Var;
        Intrinsics.echo(holder, "holder");
        Object obj2 = this.alpha.get(i4);
        Intrinsics.delta(obj2, "get(...)");
        EnumC3415a enumC3415a = (EnumC3415a) obj2;
        List list = (List) this.charlie.get(enumC3415a);
        if (list == null) {
            list = CollectionsKt.emptyList();
        }
        t tVar = holder.alpha;
        TextView textView = (TextView) tVar.red;
        CardView cardView = (CardView) tVar.alpha;
        textView.setText(cardView.getContext().getString(enumC3415a.alpha));
        Iterator it = list.iterator();
        while (true) {
            num = null;
            if (it.hasNext()) {
                obj = it.next();
                String categoryColor2 = ((Shift.PricingRule) obj).getCategoryColor();
                if (categoryColor2 != null && !StringsKt.gray(categoryColor2)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        Shift.PricingRule pricingRule = (Shift.PricingRule) obj;
        if (pricingRule != null && (categoryColor = pricingRule.getCategoryColor()) != null) {
            if (!r.quebec(categoryColor, "#", false)) {
                categoryColor = null;
            }
            if (categoryColor != null) {
                try {
                    num = Integer.valueOf(Color.parseColor(categoryColor));
                } catch (IllegalArgumentException unused) {
                }
                if (num != null) {
                    color = num.intValue();
                    ((View) tVar.purple).setBackgroundColor(color);
                    c cVar = holder.bravo;
                    ArrayList arrayList = cVar.alpha;
                    int size = arrayList.size();
                    arrayList.clear();
                    cVar.notifyItemRangeRemoved(0, size);
                    cVar.alpha(list);
                }
            }
        }
        color = cardView.getContext().getColor(enumC3415a.purple);
        ((View) tVar.purple).setBackgroundColor(color);
        c cVar2 = holder.bravo;
        ArrayList arrayList2 = cVar2.alpha;
        int size2 = arrayList2.size();
        arrayList2.clear();
        cVar2.notifyItemRangeRemoved(0, size2);
        cVar2.alpha(list);
    }

    /* JADX WARN: Type inference failed for: r6v13, types: [java.lang.Object, J2.t] */
    @Override // androidx.recyclerview.widget.az
    public final f0 onCreateViewHolder(ViewGroup parent, int i4) {
        Intrinsics.echo(parent, "parent");
        View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_pricing_rule_section, parent, false);
        int i5 = R.id.header_bar;
        View bravo = S3.bravo(R.id.header_bar, inflate);
        if (bravo != null) {
            i5 = R.id.rv_rules;
            RecyclerView recyclerView = (RecyclerView) S3.bravo(R.id.rv_rules, inflate);
            if (recyclerView != null) {
                i5 = R.id.table_header;
                if (((LinearLayout) S3.bravo(R.id.table_header, inflate)) != null) {
                    i5 = R.id.tv_category_title;
                    TextView textView = (TextView) S3.bravo(R.id.tv_category_title, inflate);
                    if (textView != null) {
                        i5 = R.id.tv_header_amount;
                        if (((TextView) S3.bravo(R.id.tv_header_amount, inflate)) != null) {
                            i5 = R.id.tv_header_condition;
                            if (((TextView) S3.bravo(R.id.tv_header_condition, inflate)) != null) {
                                i5 = R.id.tv_header_rule_name;
                                if (((TextView) S3.bravo(R.id.tv_header_rule_name, inflate)) != null) {
                                    ?? obj = new Object();
                                    obj.alpha = (CardView) inflate;
                                    obj.purple = bravo;
                                    obj.red = textView;
                                    d dVar = new d(obj);
                                    recyclerView.setAdapter(dVar.bravo);
                                    return dVar;
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i5)));
    }
}
