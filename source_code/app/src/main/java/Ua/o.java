package Ua;

import B9.ab;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import dagger.hilt.android.AndroidEntryPoint;
import delivery.samurai.android.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import t6.S3;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LUa/o;", "Lx9/a;", "<init>", "()V", "app_ProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@AndroidEntryPoint
/* loaded from: classes2.dex */
public final class o extends a {

    /* renamed from: u, reason: collision with root package name */
    public ab f2142u;

    @Override // x9.AbstractC3307a
    public final void azure() {
    }

    @Override // androidx.fragment.app.ai
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.echo(inflater, "inflater");
        View inflate = inflater.inflate(R.layout.bottom_sheet_location_permission_help, viewGroup, false);
        int i4 = R.id.btnClose;
        ImageButton imageButton = (ImageButton) S3.bravo(R.id.btnClose, inflate);
        if (imageButton != null) {
            i4 = R.id.headerContainer;
            if (((ConstraintLayout) S3.bravo(R.id.headerContainer, inflate)) != null) {
                i4 = R.id.iconHeader;
                if (((ImageView) S3.bravo(R.id.iconHeader, inflate)) != null) {
                    i4 = R.id.ll_action_buttons;
                    if (((LinearLayout) S3.bravo(R.id.ll_action_buttons, inflate)) != null) {
                        i4 = R.id.llHowToGrant;
                        if (((LinearLayout) S3.bravo(R.id.llHowToGrant, inflate)) != null) {
                            i4 = R.id.llWhyPrecise;
                            if (((LinearLayout) S3.bravo(R.id.llWhyPrecise, inflate)) != null) {
                                i4 = R.id.scroll_content;
                                if (((NestedScrollView) S3.bravo(R.id.scroll_content, inflate)) != null) {
                                    i4 = R.id.tvHeaderTitle;
                                    if (((TextView) S3.bravo(R.id.tvHeaderTitle, inflate)) != null) {
                                        i4 = R.id.tvHowToGrantContent;
                                        TextView textView = (TextView) S3.bravo(R.id.tvHowToGrantContent, inflate);
                                        if (textView != null) {
                                            i4 = R.id.tvHowToGrantTitle;
                                            TextView textView2 = (TextView) S3.bravo(R.id.tvHowToGrantTitle, inflate);
                                            if (textView2 != null) {
                                                i4 = R.id.tvWhyPreciseContent;
                                                TextView textView3 = (TextView) S3.bravo(R.id.tvWhyPreciseContent, inflate);
                                                if (textView3 != null) {
                                                    i4 = R.id.tvWhyPreciseTitle;
                                                    TextView textView4 = (TextView) S3.bravo(R.id.tvWhyPreciseTitle, inflate);
                                                    if (textView4 != null) {
                                                        ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
                                                        this.f2142u = new ab(constraintLayout, imageButton, textView, textView2, textView3, textView4);
                                                        Intrinsics.delta(constraintLayout, "getRoot(...)");
                                                        return constraintLayout;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i4)));
    }

    @Override // x9.AbstractC3307a, androidx.fragment.app.ai
    public final void onViewCreated(View view, Bundle bundle) {
        Intrinsics.echo(view, "view");
        super.onViewCreated(view, bundle);
        ab abVar = this.f2142u;
        if (abVar != null) {
            ((ImageButton) abVar.purple).setOnClickListener(new Fb.b(this, 16));
            ab abVar2 = this.f2142u;
            if (abVar2 != null) {
                ((TextView) abVar2.white).setText(getString(R.string.why_precise_location_title));
                ab abVar3 = this.f2142u;
                if (abVar3 != null) {
                    ((TextView) abVar3.teal).setText(getString(R.string.why_precise_location_content));
                    ab abVar4 = this.f2142u;
                    if (abVar4 != null) {
                        ((TextView) abVar4.silver).setText(getString(R.string.how_to_grant_precise_location_title));
                        ab abVar5 = this.f2142u;
                        if (abVar5 != null) {
                            ((TextView) abVar5.red).setText(getString(R.string.how_to_grant_precise_location_content));
                            return;
                        } else {
                            Intrinsics.lima("binding");
                            throw null;
                        }
                    }
                    Intrinsics.lima("binding");
                    throw null;
                }
                Intrinsics.lima("binding");
                throw null;
            }
            Intrinsics.lima("binding");
            throw null;
        }
        Intrinsics.lima("binding");
        throw null;
    }

    @Override // x9.AbstractC3307a
    public final int whiskey() {
        return 2;
    }
}
