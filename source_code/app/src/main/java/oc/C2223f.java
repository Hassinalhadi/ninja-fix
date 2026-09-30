package oc;

import B9.Z0;
import B9.a1;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.f0;
import com.app.network.network.models.points.redeem.PointRewardResponse;
import com.checkout.components.card.utils.constants.ExpiryDateConstantsKt;
import delivery.samurai.android.R;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import n.Y;
import x9.AbstractC3311e;

/* renamed from: oc.f, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2223f extends AbstractC3311e {
    public final float charlie;
    public final Y delta;

    public C2223f(float f5, Y y10) {
        this.charlie = f5;
        this.delta = y10;
    }

    @Override // androidx.recyclerview.widget.az
    public final void onBindViewHolder(f0 f0Var, int i4) {
        boolean z2;
        boolean z10;
        final boolean z11;
        boolean z12;
        int points;
        Pair pair;
        int i5;
        float f5;
        int i10;
        LayerDrawable layerDrawable;
        C2222e holder = (C2222e) f0Var;
        Intrinsics.echo(holder, "holder");
        Object obj = this.alpha.get(i4);
        Intrinsics.delta(obj, "get(...)");
        final PointRewardResponse pointRewardResponse = (PointRewardResponse) obj;
        float f10 = this.charlie;
        final Y click = this.delta;
        Intrinsics.echo(click, "click");
        Z0 z02 = holder.alpha;
        a1 a1Var = (a1) z02;
        a1Var.f292o = pointRewardResponse;
        synchronized (a1Var) {
            a1Var.f316q |= 1;
        }
        a1Var.delta();
        a1Var.oscar();
        int usageLimit = pointRewardResponse.getUsageLimit() - pointRewardResponse.getUsageCount();
        if (usageLimit > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        double d4 = f10;
        if (d4 >= pointRewardResponse.getPoints()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 && z2) {
            z11 = true;
        } else {
            z11 = false;
        }
        boolean enabled = pointRewardResponse.getEnabled();
        if (d4 > pointRewardResponse.getPoints()) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (((float) pointRewardResponse.getPoints()) == 0.0f) {
            points = 0;
        } else {
            points = (int) ((d4 / pointRewardResponse.getPoints()) * 100);
            if (points > 100) {
                points = 100;
            }
            z02 = z02;
        }
        Context context = z02.red.getContext();
        Intrinsics.delta(context, "getContext(...)");
        int usageCount = pointRewardResponse.getUsageCount();
        int usageLimit2 = pointRewardResponse.getUsageLimit();
        if (usageLimit2 == 0) {
            pair = new Pair(g.alpha, context.getString(R.string.usage_unlimited));
        } else if (usageCount >= usageLimit2) {
            pair = new Pair(g.purple, context.getString(R.string.usage_none_left));
        } else {
            int i11 = usageLimit2 - usageCount;
            if (i11 == 1) {
                pair = new Pair(g.red, context.getString(R.string.usage_one_left));
            } else if (i11 <= 3) {
                pair = new Pair(g.silver, context.getString(R.string.usage_few_left, Integer.valueOf(i11)));
            } else if (usageCount == 0) {
                pair = new Pair(g.teal, context.getString(R.string.usage_all_available, Integer.valueOf(usageLimit2)));
            } else {
                pair = new Pair(g.white, context.getString(R.string.usage_some_left, Integer.valueOf(i11)));
            }
        }
        g gVar = (g) pair.first;
        z02.f290m.setText((String) pair.second);
        int ordinal = gVar.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        if (ordinal != 4 && ordinal != 5) {
                            throw new NoWhenBranchMatchedException();
                        }
                        i5 = R.color.colorGreen;
                    } else {
                        i5 = R.color.colorOrange;
                    }
                } else {
                    i5 = R.color.colorRed;
                }
            } else {
                i5 = R.color.gray;
            }
        } else {
            i5 = R.color.colorPrimary;
        }
        z02.f290m.setTextColor(z02.red.getContext().getColor(i5));
        if (!z10 && !enabled && z2) {
            z02.f285h.setVisibility(0);
            z02.f289l.setVisibility(0);
            z02.f288k.setVisibility(0);
            z02.f285h.setProgress(points);
            z02.f289l.setText(points + "%");
            z02.f288k.setText(((int) f10) + ExpiryDateConstantsKt.EXPIRY_DATE_SEPARATOR + ((int) pointRewardResponse.getPoints()));
            if (points < 50) {
                i10 = R.color.progress_red;
            } else if (points < 75) {
                i10 = R.color.progress_orange;
            } else if (points < 100) {
                i10 = R.color.progress_yellow;
            } else {
                i10 = R.color.progress_green;
            }
            Drawable progressDrawable = z02.f285h.getProgressDrawable();
            Drawable drawable = null;
            if (progressDrawable instanceof LayerDrawable) {
                layerDrawable = (LayerDrawable) progressDrawable;
            } else {
                layerDrawable = null;
            }
            if (layerDrawable != null) {
                Drawable findDrawableByLayerId = layerDrawable.findDrawableByLayerId(android.R.id.progress);
                if (findDrawableByLayerId != null) {
                    drawable = findDrawableByLayerId.mutate();
                }
                int color = z02.red.getContext().getColor(i10);
                if (drawable != null) {
                    drawable.setTint(color);
                }
            }
        } else {
            z02.f285h.setVisibility(8);
            z02.f289l.setVisibility(8);
            z02.f288k.setVisibility(8);
            z02.f288k.setText("");
        }
        z02.f283f.setEnabled(z11);
        LinearLayout linearLayout = z02.f283f;
        if (z11) {
            f5 = 1.0f;
        } else {
            f5 = 0.5f;
        }
        linearLayout.setAlpha(f5);
        z02.f286i.setText(String.valueOf((int) pointRewardResponse.getPoints()));
        z02.f283f.setOnClickListener(new View.OnClickListener() { // from class: oc.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (z11) {
                    click.invoke(pointRewardResponse);
                }
            }
        });
        if (enabled) {
            z02.f291n.setText(z02.red.getContext().getString(R.string.coming_soon));
            z02.f291n.setTextColor(z02.red.getContext().getColor(R.color.dark_gray));
            z02.f291n.setVisibility(0);
            z02.f283f.setEnabled(false);
            z02.f283f.setAlpha(0.3f);
            return;
        }
        if (usageLimit <= 0) {
            z02.f291n.setText(z02.red.getContext().getString(R.string.used));
            z02.f291n.setTextColor(z02.red.getContext().getColor(R.color.dark_gray));
            z02.f291n.setVisibility(0);
            z02.f283f.setEnabled(false);
            z02.f283f.setAlpha(0.3f);
            return;
        }
        if (z12) {
            z02.f291n.setText(z02.red.getContext().getString(R.string.enough_points_to_redeem));
            z02.f291n.setTextColor(z02.red.getContext().getColor(R.color.colorGreen));
            z02.f291n.setVisibility(0);
        } else {
            if (z10) {
                z02.f291n.setText(z02.red.getContext().getString(R.string.available));
                z02.f291n.setTextColor(z02.red.getContext().getColor(R.color.colorGreen));
                z02.f291n.setVisibility(0);
                return;
            }
            z02.f291n.setVisibility(8);
        }
    }

    @Override // androidx.recyclerview.widget.az
    public final f0 onCreateViewHolder(ViewGroup parent, int i4) {
        Intrinsics.echo(parent, "parent");
        LayoutInflater from = LayoutInflater.from(parent.getContext());
        int i5 = Z0.f282p;
        Z0 z02 = (Z0) z1.d.charlie(from, R.layout.row_redeem_item, parent, false);
        Intrinsics.delta(z02, "inflate(...)");
        return new C2222e(z02);
    }
}
