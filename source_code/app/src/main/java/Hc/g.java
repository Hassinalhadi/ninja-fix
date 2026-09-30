package Hc;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.L;
import androidx.recyclerview.widget.f0;
import delivery.samurai.android.R;
import delivery.samurai.android.ui.support.ZenDeskChatActivity;
import kotlin.jvm.internal.Intrinsics;
import s6.AbstractC2643e5;
import t6.S3;
import x9.AbstractC3311e;

/* loaded from: classes2.dex */
public final class g extends AbstractC3311e {
    public final int charlie;

    public g(int i4) {
        this.charlie = i4;
    }

    @Override // androidx.recyclerview.widget.az
    public final void onBindViewHolder(f0 f0Var, int i4) {
        FrameLayout.LayoutParams layoutParams;
        L supportFragmentManager;
        f holder = (f) f0Var;
        Intrinsics.echo(holder, "holder");
        View view = holder.itemView;
        J2.c cVar = holder.alpha;
        AbstractC2643e5.charlie((ImageView) cVar.red, (String) this.alpha.get(i4), 0, 6);
        ImageView imageView = (ImageView) cVar.red;
        ViewGroup.LayoutParams layoutParams2 = imageView.getLayoutParams();
        ZenDeskChatActivity zenDeskChatActivity = null;
        if (layoutParams2 instanceof FrameLayout.LayoutParams) {
            layoutParams = (FrameLayout.LayoutParams) layoutParams2;
        } else {
            layoutParams = null;
        }
        if (layoutParams != null) {
            layoutParams.gravity = this.charlie;
            imageView.setLayoutParams(layoutParams);
        }
        Context context = view.getContext();
        if (context instanceof ZenDeskChatActivity) {
            zenDeskChatActivity = (ZenDeskChatActivity) context;
        }
        if (zenDeskChatActivity != null && (supportFragmentManager = zenDeskChatActivity.getSupportFragmentManager()) != null) {
            imageView.setOnClickListener(new c(i4, 1, supportFragmentManager, this));
        }
    }

    @Override // androidx.recyclerview.widget.az
    public final f0 onCreateViewHolder(ViewGroup parent, int i4) {
        Intrinsics.echo(parent, "parent");
        View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_attachent_item, parent, false);
        CardView cardView = (CardView) inflate;
        ImageView imageView = (ImageView) S3.bravo(R.id.image, inflate);
        if (imageView != null) {
            return new f(new J2.c(3, cardView, imageView));
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(R.id.image)));
    }
}
