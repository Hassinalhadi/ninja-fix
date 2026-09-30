package Kb;

import B9.ab;
import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.lifecycle.T;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.az;
import dagger.hilt.android.AndroidEntryPoint;
import delivery.samurai.android.R;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import n3.EnumC2159b;
import t6.S3;
import vf.ad;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LKb/h;", "Lx9/a;", "<init>", "()V", "app_ProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@AndroidEntryPoint
/* loaded from: classes2.dex */
public final class h extends d {

    /* renamed from: u, reason: collision with root package name */
    public ab f1697u;

    /* renamed from: v, reason: collision with root package name */
    public o3.g f1698v;

    public static c bronze(EnumC2159b enumC2159b) {
        switch (enumC2159b.ordinal()) {
            case 0:
                return c.alpha;
            case 1:
                return c.purple;
            case 2:
                return c.red;
            case 3:
                return c.silver;
            case 4:
                return c.teal;
            case 5:
                return c.white;
            case 6:
                return c.yellow;
            case 7:
                return c.f1677a;
            case 8:
                return c.f1678b;
            case 9:
                return c.f1679c;
            case 10:
                return c.f1680d;
            case 11:
                return c.e;
            case 12:
                return c.f1681f;
            case 13:
                return c.f1682g;
            case 14:
                return c.f1683h;
            case 15:
                return c.f1684i;
            case 16:
                return c.f1685j;
            case 17:
                return c.f1686k;
            case 18:
                return c.f1687l;
            case 19:
                return c.f1688m;
            case 20:
                return c.f1689n;
            case 21:
                return c.f1690o;
            case 22:
                return c.f1691p;
            case 23:
                return c.f1692q;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    @Override // x9.AbstractC3307a
    public final void azure() {
    }

    public final Pair coral(c cVar) {
        int i4;
        Context requireContext = requireContext();
        Intrinsics.delta(requireContext, "requireContext(...)");
        switch (f.$EnumSwitchMapping$1[cVar.ordinal()]) {
            case 1:
                i4 = R.string.check_battery_optimization;
                break;
            case 2:
                i4 = R.string.check_notifications;
                break;
            case 3:
                i4 = R.string.check_precise_permission;
                break;
            case 4:
                i4 = R.string.check_background_location;
                break;
            case 5:
                i4 = R.string.check_battery_saver_off;
                break;
            case 6:
                i4 = R.string.check_data_saver;
                break;
            case 7:
                i4 = R.string.check_scanning;
                break;
            case 8:
                i4 = R.string.check_google_location_accuracy;
                break;
            case 9:
                i4 = R.string.check_location_on;
                break;
            case 10:
                i4 = R.string.check_auto_time;
                break;
            case 11:
                i4 = R.string.check_background_restricted;
                break;
            case 12:
                i4 = R.string.check_gnss_weak;
                break;
            case 13:
                i4 = R.string.check_network_validated;
                break;
            case 14:
                i4 = R.string.check_internet;
                break;
            case 15:
                i4 = R.string.check_mock_location;
                break;
            case 16:
                i4 = R.string.check_xiaomi_battery_settings;
                break;
            case 17:
                i4 = R.string.check_huawei_app_launch;
                break;
            case 18:
                i4 = R.string.check_oppo_background_settings;
                break;
            case 19:
                i4 = R.string.check_samsung_battery_settings;
                break;
            case 20:
                i4 = R.string.check_vivo_battery_settings;
                break;
            case 21:
                i4 = R.string.check_nokia_battery_settings;
                break;
            case 22:
                i4 = R.string.check_motorola_battery_settings;
                break;
            case 23:
                i4 = R.string.check_transsion_battery_settings;
                break;
            case 24:
                i4 = R.string.check_zte_battery_settings;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        String string = requireContext.getString(i4);
        Intrinsics.delta(string, "getString(...)");
        return new Pair(string, string);
    }

    public final void crimson(List list, boolean z2) {
        int i4;
        int i5;
        int i10;
        String message = "Updating UI - checklist size: " + list.size() + ", allChecksPass: " + z2;
        Intrinsics.echo(message, "message");
        ab abVar = this.f1697u;
        if (abVar != null) {
            boolean isEmpty = list.isEmpty();
            RecyclerView recyclerView = (RecyclerView) abVar.white;
            int i11 = 0;
            if (!isEmpty) {
                i4 = 0;
            } else {
                i4 = 8;
            }
            recyclerView.setVisibility(i4);
            TextView textView = (TextView) abVar.red;
            if (isEmpty) {
                i5 = 0;
            } else {
                i5 = 8;
            }
            textView.setVisibility(i5);
            TextView textView2 = (TextView) abVar.silver;
            if (!isEmpty) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            textView2.setVisibility(i10);
            String MANUFACTURER = Build.MANUFACTURER;
            Intrinsics.delta(MANUFACTURER, "MANUFACTURER");
            String lowerCase = MANUFACTURER.toLowerCase(Locale.ROOT);
            Intrinsics.delta(lowerCase, "toLowerCase(...)");
            TextView textView3 = (TextView) abVar.teal;
            if (StringsKt.beige(lowerCase, "samsung", false)) {
                textView3.setText(getString(R.string.samsung_tips));
            } else if (!StringsKt.beige(lowerCase, "xiaomi", false) && !StringsKt.beige(lowerCase, "redmi", false)) {
                if (!StringsKt.beige(lowerCase, "huawei", false) && !StringsKt.beige(lowerCase, "honor", false)) {
                    if (!StringsKt.beige(lowerCase, "oppo", false) && !StringsKt.beige(lowerCase, "realme", false) && !StringsKt.beige(lowerCase, "oneplus", false)) {
                        if (!StringsKt.beige(lowerCase, "vivo", false) && !StringsKt.beige(lowerCase, "iqoo", false)) {
                            if (StringsKt.beige(lowerCase, "nokia", false)) {
                                textView3.setText(getString(R.string.nokia_tips));
                            } else if (StringsKt.beige(lowerCase, "motorola", false)) {
                                textView3.setText(getString(R.string.motorola_tips));
                            } else if (!StringsKt.beige(lowerCase, "tecno", false) && !StringsKt.beige(lowerCase, "itel", false) && !StringsKt.beige(lowerCase, "infinix", false) && !StringsKt.beige(lowerCase, "transsion", false)) {
                                if (StringsKt.beige(lowerCase, "zte", false)) {
                                    textView3.setText(getString(R.string.zte_tips));
                                } else {
                                    i11 = 8;
                                }
                            } else {
                                textView3.setText(getString(R.string.transsion_tips));
                            }
                        } else {
                            textView3.setText(getString(R.string.vivo_tips));
                        }
                    } else {
                        textView3.setText(getString(R.string.oppo_tips));
                    }
                } else {
                    textView3.setText(getString(R.string.huawei_tips));
                }
            } else {
                textView3.setText(getString(R.string.xiaomi_tips));
            }
            textView3.setVisibility(i11);
            recyclerView.getVisibility();
            textView2.getVisibility();
            textView.getVisibility();
            textView3.getVisibility();
            list.size();
            return;
        }
        Intrinsics.lima("binding");
        throw null;
    }

    @Override // androidx.fragment.app.ai
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.echo(inflater, "inflater");
        View inflate = inflater.inflate(R.layout.bottom_sheet_location_accuracy_instructions, viewGroup, false);
        int i4 = R.id.btn_close;
        ImageButton imageButton = (ImageButton) S3.bravo(R.id.btn_close, inflate);
        if (imageButton != null) {
            i4 = R.id.cardAllFixed;
            if (((CardView) S3.bravo(R.id.cardAllFixed, inflate)) != null) {
                i4 = R.id.cardOemTips;
                if (((CardView) S3.bravo(R.id.cardOemTips, inflate)) != null) {
                    i4 = R.id.headerContainer;
                    if (((ConstraintLayout) S3.bravo(R.id.headerContainer, inflate)) != null) {
                        i4 = R.id.iconHeader;
                        if (((ImageView) S3.bravo(R.id.iconHeader, inflate)) != null) {
                            i4 = R.id.rv_checklist;
                            RecyclerView recyclerView = (RecyclerView) S3.bravo(R.id.rv_checklist, inflate);
                            if (recyclerView != null) {
                                i4 = R.id.scroll_root;
                                if (((NestedScrollView) S3.bravo(R.id.scroll_root, inflate)) != null) {
                                    i4 = R.id.tv_all_fixed;
                                    TextView textView = (TextView) S3.bravo(R.id.tv_all_fixed, inflate);
                                    if (textView != null) {
                                        i4 = R.id.tv_checklist_title;
                                        TextView textView2 = (TextView) S3.bravo(R.id.tv_checklist_title, inflate);
                                        if (textView2 != null) {
                                            i4 = R.id.tv_oem_tips;
                                            TextView textView3 = (TextView) S3.bravo(R.id.tv_oem_tips, inflate);
                                            if (textView3 != null) {
                                                i4 = R.id.tv_title;
                                                if (((TextView) S3.bravo(R.id.tv_title, inflate)) != null) {
                                                    ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
                                                    this.f1697u = new ab(constraintLayout, imageButton, recyclerView, textView, textView2, textView3, 0);
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
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i4)));
    }

    @Override // androidx.fragment.app.ai
    public final void onRequestPermissionsResult(int i4, String[] permissions, int[] grantResults) {
        boolean z2;
        Intrinsics.echo(permissions, "permissions");
        Intrinsics.echo(grantResults, "grantResults");
        if (i4 == 1001) {
            if (grantResults.length == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2 && grantResults[0] == 0 && Build.VERSION.SDK_INT >= 29) {
                requestPermissions(new String[]{"android.permission.ACCESS_BACKGROUND_LOCATION"}, 1002);
            }
        }
    }

    @Override // x9.AbstractC3307a, androidx.fragment.app.ai
    public final void onResume() {
        List<Object> emptyList;
        super.onResume();
        o3.g gVar = this.f1698v;
        m mVar = null;
        if (gVar != null) {
            o3.b golf = gVar.golf();
            EnumC2159b bravo = golf.bravo();
            if (bravo != null) {
                c bronze = bronze(bravo);
                emptyList = kotlin.collections.ab.juliet(new a(bronze, (String) coral(bronze).getFirst(), (String) coral(bronze).getSecond()));
            } else {
                emptyList = CollectionsKt.emptyList();
            }
            crimson(emptyList, golf.alpha());
            ab abVar = this.f1697u;
            if (abVar != null) {
                az adapter = ((RecyclerView) abVar.white).getAdapter();
                if (adapter instanceof m) {
                    mVar = (m) adapter;
                }
                if (mVar != null) {
                    mVar.submitList(emptyList);
                    return;
                }
                return;
            }
            Intrinsics.lima("binding");
            throw null;
        }
        Intrinsics.lima("locationHealthChecker");
        throw null;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0627w, androidx.fragment.app.ai
    public final void onStart() {
        Window window;
        super.onStart();
        Dialog dialog = this.e;
        if (dialog != null && (window = dialog.getWindow()) != null) {
            window.setSoftInputMode(16);
        }
    }

    @Override // x9.AbstractC3307a, androidx.fragment.app.ai
    public final void onViewCreated(View view, Bundle bundle) {
        Intrinsics.echo(view, "view");
        super.onViewCreated(view, bundle);
        m mVar = new m(new Aa.l(13, this));
        ab abVar = this.f1697u;
        if (abVar != null) {
            ((RecyclerView) abVar.white).setAdapter(mVar);
            ab abVar2 = this.f1697u;
            if (abVar2 != null) {
                ((RecyclerView) abVar2.white).setNestedScrollingEnabled(false);
                ab abVar3 = this.f1697u;
                if (abVar3 != null) {
                    ((RecyclerView) abVar3.white).setOverScrollMode(2);
                    view.post(new A8.g(11, this, view));
                    ad.zulu(T.foxtrot(this), null, null, new g(this, mVar, null), 3);
                    ab abVar4 = this.f1697u;
                    if (abVar4 != null) {
                        ((ImageButton) abVar4.purple).setOnClickListener(new Fb.b(this, 5));
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

    @Override // x9.AbstractC3307a
    public final int whiskey() {
        return 2;
    }
}
