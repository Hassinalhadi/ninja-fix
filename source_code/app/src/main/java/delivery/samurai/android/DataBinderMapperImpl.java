package delivery.samurai.android;

import B9.AbstractC0046j;
import B9.AbstractC0047j0;
import B9.AbstractC0063s;
import B9.AbstractC0064s0;
import B9.B;
import B9.B0;
import B9.C0029a0;
import B9.C0030b;
import B9.C0033c0;
import B9.C0034d;
import B9.C0037e0;
import B9.C0040g;
import B9.C0041g0;
import B9.C0044i;
import B9.C0045i0;
import B9.C0048k;
import B9.C0049k0;
import B9.C0052m;
import B9.C0053m0;
import B9.C0056o;
import B9.C0057o0;
import B9.C0059p0;
import B9.C0060q;
import B9.C0061q0;
import B9.C0065t;
import B9.C0066t0;
import B9.C0068u0;
import B9.C0069v;
import B9.C0070v0;
import B9.C0072w0;
import B9.C0073x;
import B9.C0074x0;
import B9.C0076y0;
import B9.C0077z;
import B9.C0078z0;
import B9.D;
import B9.D0;
import B9.F;
import B9.F0;
import B9.G0;
import B9.H;
import B9.H0;
import B9.I0;
import B9.J0;
import B9.L0;
import B9.M;
import B9.M0;
import B9.N0;
import B9.O;
import B9.O0;
import B9.Q;
import B9.R0;
import B9.S;
import B9.T0;
import B9.U;
import B9.U0;
import B9.V0;
import B9.W;
import B9.W0;
import B9.X;
import B9.X0;
import B9.Y;
import B9.Y0;
import B9.Z0;
import B9.a1;
import B9.ad;
import B9.af;
import B9.ah;
import B9.aj;
import B9.ak;
import B9.al;
import B9.ap;
import B9.as;
import B9.au;
import B9.ax;
import B9.az;
import B9.b1;
import B9.c1;
import B9.d1;
import B9.f1;
import B9.g1;
import B9.h1;
import B9.i1;
import B9.j1;
import B9.k1;
import B9.m1;
import B9.o1;
import B9.p1;
import B9.q1;
import B9.r1;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.P0;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.textview.MaterialTextView;
import java.util.ArrayList;
import java.util.List;
import net.cachapa.expandablelayout.ExpandableLayout;
import w9.t;
import z1.b;
import z1.c;
import z1.g;

/* loaded from: classes2.dex */
public class DataBinderMapperImpl extends b {
    public static final SparseIntArray alpha;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(79);
        alpha = sparseIntArray;
        sparseIntArray.put(R.layout.activity_address_note, 1);
        sparseIntArray.put(R.layout.activity_all_address_note, 2);
        sparseIntArray.put(R.layout.activity_attendance_registry, 3);
        sparseIntArray.put(R.layout.activity_call_customer, 4);
        sparseIntArray.put(R.layout.activity_customer_call_assist, 5);
        sparseIntArray.put(R.layout.activity_envelop_detail, 6);
        sparseIntArray.put(R.layout.activity_envelop_detail_v2, 7);
        sparseIntArray.put(R.layout.activity_register, 8);
        sparseIntArray.put(R.layout.activity_sign_up, 9);
        sparseIntArray.put(R.layout.activity_wallet_top_up, 10);
        sparseIntArray.put(R.layout.activity_withdraw_detail, 11);
        sparseIntArray.put(R.layout.bottom_sheet_add_address_note, 12);
        sparseIntArray.put(R.layout.bottom_sheet_redeem, 13);
        sparseIntArray.put(R.layout.bottom_sheet_upload_document, 14);
        sparseIntArray.put(R.layout.dialog_address_note_reward, 15);
        sparseIntArray.put(R.layout.dialog_break_approved, 16);
        sparseIntArray.put(R.layout.dialog_break_rejected, 17);
        sparseIntArray.put(R.layout.dialog_delivery_preview, 18);
        sparseIntArray.put(R.layout.dialog_order_processed_detail, 19);
        sparseIntArray.put(R.layout.dialog_point_score_show, 20);
        sparseIntArray.put(R.layout.dialog_rate_support, 21);
        sparseIntArray.put(R.layout.dialog_take_break, 22);
        sparseIntArray.put(R.layout.fragment_about_you, 23);
        sparseIntArray.put(R.layout.fragment_earn_your_money, 24);
        sparseIntArray.put(R.layout.fragment_share_documents, 25);
        sparseIntArray.put(R.layout.fragment_ticket_details, 26);
        sparseIntArray.put(R.layout.fragment_trophy_milestone, 27);
        sparseIntArray.put(R.layout.my_account_fragment, 28);
        sparseIntArray.put(R.layout.row_address_note, 29);
        sparseIntArray.put(R.layout.row_address_note_image, 30);
        sparseIntArray.put(R.layout.row_address_note_image_full, 31);
        sparseIntArray.put(R.layout.row_admin_message, 32);
        sparseIntArray.put(R.layout.row_agreement_item, 33);
        sparseIntArray.put(R.layout.row_asset_order, 34);
        sparseIntArray.put(R.layout.row_asset_order_v2, 35);
        sparseIntArray.put(R.layout.row_assets_item, 36);
        sparseIntArray.put(R.layout.row_bank, 37);
        sparseIntArray.put(R.layout.row_captain_message, 38);
        sparseIntArray.put(R.layout.row_city, 39);
        sparseIntArray.put(R.layout.row_city_selection, 40);
        sparseIntArray.put(R.layout.row_completed_order, 41);
        sparseIntArray.put(R.layout.row_country, 42);
        sparseIntArray.put(R.layout.row_country_selection, 43);
        sparseIntArray.put(R.layout.row_image, 44);
        sparseIntArray.put(R.layout.row_loading, 45);
        sparseIntArray.put(R.layout.row_location_accuracy_checklist, 46);
        sparseIntArray.put(R.layout.row_location_accuracy_instruction, 47);
        sparseIntArray.put(R.layout.row_loyality_item, 48);
        sparseIntArray.put(R.layout.row_notification, 49);
        sparseIntArray.put(R.layout.row_open_ticket, 50);
        sparseIntArray.put(R.layout.row_order_complete, 51);
        sparseIntArray.put(R.layout.row_order_complete_v2, 52);
        sparseIntArray.put(R.layout.row_order_meta_data, 53);
        sparseIntArray.put(R.layout.row_order_meta_data_v2, 54);
        sparseIntArray.put(R.layout.row_order_pick, 55);
        sparseIntArray.put(R.layout.row_order_pick_v2, 56);
        sparseIntArray.put(R.layout.row_order_return, 57);
        sparseIntArray.put(R.layout.row_order_shopping_list, 58);
        sparseIntArray.put(R.layout.row_order_shopping_list_v2, 59);
        sparseIntArray.put(R.layout.row_pick_up_place, 60);
        sparseIntArray.put(R.layout.row_platform_item, 61);
        sparseIntArray.put(R.layout.row_platform_selection, 62);
        sparseIntArray.put(R.layout.row_platforms_select, 63);
        sparseIntArray.put(R.layout.row_point_transaction, 64);
        sparseIntArray.put(R.layout.row_pointing_rule, 65);
        sparseIntArray.put(R.layout.row_preference, 66);
        sparseIntArray.put(R.layout.row_proof_image, 67);
        sparseIntArray.put(R.layout.row_redeem_item, 68);
        sparseIntArray.put(R.layout.row_resolved_ticket, 69);
        sparseIntArray.put(R.layout.row_select_bank, 70);
        sparseIntArray.put(R.layout.row_select_country, 71);
        sparseIntArray.put(R.layout.row_select_nationality, 72);
        sparseIntArray.put(R.layout.row_select_platform, 73);
        sparseIntArray.put(R.layout.row_shift, 74);
        sparseIntArray.put(R.layout.row_shift_summary, 75);
        sparseIntArray.put(R.layout.row_take_break, 76);
        sparseIntArray.put(R.layout.row_withdraw_history_item, 77);
        sparseIntArray.put(R.layout.row_withdraw_item, 78);
        sparseIntArray.put(R.layout.score_item, 79);
    }

    @Override // z1.b
    public final List alpha() {
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        arrayList.add(new com.app.base.DataBinderMapperImpl());
        arrayList.add(new com.app.extensions.DataBinderMapperImpl());
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v164, types: [B9.k0, B9.j0, z1.g] */
    /* JADX WARN: Type inference failed for: r0v184, types: [z1.g, B9.r0] */
    /* JADX WARN: Type inference failed for: r0v188, types: [B9.s0, z1.g, B9.t0] */
    /* JADX WARN: Type inference failed for: r0v196, types: [z1.g, B9.v0, B9.X] */
    /* JADX WARN: Type inference failed for: r0v232, types: [B9.I0, B9.H0, z1.g] */
    /* JADX WARN: Type inference failed for: r0v244, types: [B9.N0, B9.M0, z1.g] */
    /* JADX WARN: Type inference failed for: r0v248, types: [B9.O0, z1.g, B9.P0] */
    /* JADX WARN: Type inference failed for: r0v260, types: [z1.g, B9.V0, B9.U0] */
    /* JADX WARN: Type inference failed for: r0v272, types: [B9.Y0, z1.g] */
    /* JADX WARN: Type inference failed for: r0v276, types: [B9.Z0, z1.g, B9.a1] */
    /* JADX WARN: Type inference failed for: r0v280, types: [z1.g, B9.b1, B9.j] */
    /* JADX WARN: Type inference failed for: r0v284, types: [B9.d1, z1.g, B9.c1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v292, types: [z1.g, java.lang.Object, B9.h1, B9.g1] */
    /* JADX WARN: Type inference failed for: r0v295, types: [B9.j1, B9.i1, z1.g, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v315, types: [B9.p1, z1.g, B9.q1] */
    /* JADX WARN: Type inference failed for: r0v38, types: [B9.s, B9.t, z1.g] */
    @Override // z1.b
    public final g bravo(int i4, View view) {
        int i5 = alpha.get(i4);
        if (i5 > 0) {
            Object tag = view.getTag();
            if (tag != null) {
                int i10 = (i5 - 1) / 50;
                if (i10 != 0) {
                    if (i10 == 1) {
                        switch (i5) {
                            case 51:
                                if ("layout/row_order_complete_0".equals(tag)) {
                                    return new C0076y0(view);
                                }
                                throw new IllegalArgumentException(P0.bronze(tag, "The tag for row_order_complete is invalid. Received: "));
                            case 52:
                                if ("layout/row_order_complete_v2_0".equals(tag)) {
                                    return new C0078z0(view);
                                }
                                throw new IllegalArgumentException(P0.bronze(tag, "The tag for row_order_complete_v2 is invalid. Received: "));
                            case 53:
                                if ("layout/row_order_meta_data_0".equals(tag)) {
                                    return new B0(view);
                                }
                                throw new IllegalArgumentException(P0.bronze(tag, "The tag for row_order_meta_data is invalid. Received: "));
                            case 54:
                                if ("layout/row_order_meta_data_v2_0".equals(tag)) {
                                    return new D0(view);
                                }
                                throw new IllegalArgumentException(P0.bronze(tag, "The tag for row_order_meta_data_v2 is invalid. Received: "));
                            case 55:
                                if ("layout/row_order_pick_0".equals(tag)) {
                                    return new F0(view);
                                }
                                throw new IllegalArgumentException(P0.bronze(tag, "The tag for row_order_pick is invalid. Received: "));
                            case 56:
                                if ("layout/row_order_pick_v2_0".equals(tag)) {
                                    return new G0(view);
                                }
                                throw new IllegalArgumentException(P0.bronze(tag, "The tag for row_order_pick_v2 is invalid. Received: "));
                            case 57:
                                if ("layout/row_order_return_0".equals(tag)) {
                                    Object[] november = g.november(view, 12, null, I0.f154o);
                                    TextView textView = (TextView) november[2];
                                    FloatingActionButton floatingActionButton = (FloatingActionButton) november[6];
                                    FloatingActionButton floatingActionButton2 = (FloatingActionButton) november[7];
                                    FloatingActionButton floatingActionButton3 = (FloatingActionButton) november[5];
                                    ?? h02 = new H0(null, view, textView, floatingActionButton, floatingActionButton2, floatingActionButton3, (View) november[8], (TextView) november[3], (TextView) november[4], (TextView) november[1]);
                                    h02.f155n = -1L;
                                    h02.f146f.setTag(null);
                                    h02.f147g.setTag(null);
                                    h02.f148h.setTag(null);
                                    ((ConstraintLayout) november[0]).setTag(null);
                                    h02.f149i.setTag(null);
                                    h02.f151k.setTag(null);
                                    h02.f152l.setTag(null);
                                    h02.f153m.setTag(null);
                                    h02.papa(view);
                                    h02.lima();
                                    return h02;
                                }
                                throw new IllegalArgumentException(P0.bronze(tag, "The tag for row_order_return is invalid. Received: "));
                            case 58:
                                if ("layout/row_order_shopping_list_0".equals(tag)) {
                                    return new J0(view);
                                }
                                throw new IllegalArgumentException(P0.bronze(tag, "The tag for row_order_shopping_list is invalid. Received: "));
                            case 59:
                                if ("layout/row_order_shopping_list_v2_0".equals(tag)) {
                                    return new L0(view);
                                }
                                throw new IllegalArgumentException(P0.bronze(tag, "The tag for row_order_shopping_list_v2 is invalid. Received: "));
                            case 60:
                                if ("layout/row_pick_up_place_0".equals(tag)) {
                                    Object[] november2 = g.november(view, 9, null, N0.f206o);
                                    ConstraintLayout constraintLayout = (ConstraintLayout) november2[0];
                                    ImageView imageView = (ImageView) november2[3];
                                    TextView textView2 = (TextView) november2[1];
                                    RelativeLayout relativeLayout = (RelativeLayout) november2[4];
                                    TextView textView3 = (TextView) november2[2];
                                    TextView textView4 = (TextView) november2[8];
                                    TextView textView5 = (TextView) november2[6];
                                    ?? m02 = new M0(null, view, constraintLayout, imageView, textView2, relativeLayout, textView3, textView4, textView5);
                                    m02.f207n = -1L;
                                    m02.f183f.setTag(null);
                                    m02.f185h.setTag(null);
                                    m02.papa(view);
                                    m02.lima();
                                    return m02;
                                }
                                throw new IllegalArgumentException(P0.bronze(tag, "The tag for row_pick_up_place is invalid. Received: "));
                            case 61:
                                if ("layout/row_platform_item_0".equals(tag)) {
                                    Object[] november3 = g.november(view, 5, null, B9.P0.f214i);
                                    ?? o02 = new O0(null, view, (TextView) november3[2], (TextView) november3[1]);
                                    o02.f215h = -1L;
                                    ((FrameLayout) november3[0]).setTag(null);
                                    o02.f210f.setTag(null);
                                    o02.f211g.setTag(null);
                                    o02.papa(view);
                                    o02.lima();
                                    return o02;
                                }
                                throw new IllegalArgumentException(P0.bronze(tag, "The tag for row_platform_item is invalid. Received: "));
                            case 62:
                                if ("layout/row_platform_selection_0".equals(tag)) {
                                    return new R0(view);
                                }
                                throw new IllegalArgumentException(P0.bronze(tag, "The tag for row_platform_selection is invalid. Received: "));
                            case 63:
                                if ("layout/row_platforms_select_0".equals(tag)) {
                                    return new T0(view);
                                }
                                throw new IllegalArgumentException(P0.bronze(tag, "The tag for row_platforms_select is invalid. Received: "));
                            case 64:
                                if ("layout/row_point_transaction_0".equals(tag)) {
                                    Object[] november4 = g.november(view, 9, null, V0.f254q);
                                    ConstraintLayout constraintLayout2 = (ConstraintLayout) november4[0];
                                    ?? u02 = new U0(null, view, constraintLayout2, (TextView) november4[3], (TextView) november4[6], (TextView) november4[4], (TextView) november4[5], (TextView) november4[7], (TextView) november4[2], (TextView) november4[1]);
                                    u02.f255p = -1L;
                                    u02.f242f.setTag(null);
                                    u02.f243g.setTag(null);
                                    u02.f244h.setTag(null);
                                    u02.f245i.setTag(null);
                                    u02.f246j.setTag(null);
                                    u02.f247k.setTag(null);
                                    u02.f248l.setTag(null);
                                    u02.f249m.setTag(null);
                                    u02.papa(view);
                                    u02.lima();
                                    return u02;
                                }
                                throw new IllegalArgumentException(P0.bronze(tag, "The tag for row_point_transaction is invalid. Received: "));
                            case 65:
                                if ("layout/row_pointing_rule_0".equals(tag)) {
                                    return new W0(view);
                                }
                                throw new IllegalArgumentException(P0.bronze(tag, "The tag for row_pointing_rule is invalid. Received: "));
                            case 66:
                                if ("layout/row_preference_0".equals(tag)) {
                                    return new X0(view);
                                }
                                throw new IllegalArgumentException(P0.bronze(tag, "The tag for row_preference is invalid. Received: "));
                            case 67:
                                if ("layout/row_proof_image_0".equals(tag)) {
                                    Object[] november5 = g.november(view, 2, null, Y0.f274g);
                                    ?? gVar = new g(view, 0, null);
                                    gVar.f275f = -1L;
                                    ((CardView) november5[0]).setTag(null);
                                    gVar.papa(view);
                                    gVar.lima();
                                    return gVar;
                                }
                                throw new IllegalArgumentException(P0.bronze(tag, "The tag for row_proof_image is invalid. Received: "));
                            case 68:
                                if ("layout/row_redeem_item_0".equals(tag)) {
                                    Object[] november6 = g.november(view, 11, null, a1.f315r);
                                    LinearLayout linearLayout = (LinearLayout) november6[8];
                                    ImageView imageView2 = (ImageView) november6[1];
                                    ProgressBar progressBar = (ProgressBar) november6[3];
                                    TextView textView6 = (TextView) november6[10];
                                    ?? z02 = new Z0(null, view, linearLayout, imageView2, progressBar, textView6, (TextView) november6[2], (TextView) november6[5], (TextView) november6[4], (TextView) november6[6], (TextView) november6[7]);
                                    z02.f316q = -1L;
                                    z02.f284g.setTag(null);
                                    ((ConstraintLayout) november6[0]).setTag(null);
                                    z02.f287j.setTag(null);
                                    z02.papa(view);
                                    z02.lima();
                                    return z02;
                                }
                                throw new IllegalArgumentException(P0.bronze(tag, "The tag for row_redeem_item is invalid. Received: "));
                            case 69:
                                if ("layout/row_resolved_ticket_0".equals(tag)) {
                                    Object[] november7 = g.november(view, 6, null, b1.f422k);
                                    ?? abstractC0046j = new AbstractC0046j((c) null, view, (MaterialTextView) november7[2], (MaterialTextView) november7[4], (MaterialTextView) november7[1], (MaterialTextView) november7[3]);
                                    abstractC0046j.f423j = -1L;
                                    ((CardView) november7[0]).setTag(null);
                                    ((MaterialTextView) abstractC0046j.f499f).setTag(null);
                                    ((MaterialTextView) abstractC0046j.f500g).setTag(null);
                                    ((MaterialTextView) abstractC0046j.f501h).setTag(null);
                                    ((MaterialTextView) abstractC0046j.f502i).setTag(null);
                                    abstractC0046j.papa(view);
                                    abstractC0046j.lima();
                                    return abstractC0046j;
                                }
                                throw new IllegalArgumentException(P0.bronze(tag, "The tag for row_resolved_ticket is invalid. Received: "));
                            case 70:
                                if ("layout/row_select_bank_0".equals(tag)) {
                                    Object[] november8 = g.november(view, 3, null, d1.f442l);
                                    ?? c1Var = new c1(null, view, (ConstraintLayout) november8[0], (TextView) november8[1], (View) november8[2]);
                                    c1Var.f443k = -1L;
                                    c1Var.f432f.setTag(null);
                                    c1Var.f433g.setTag(null);
                                    view.setTag(R.id.dataBinding, c1Var);
                                    c1Var.lima();
                                    return c1Var;
                                }
                                throw new IllegalArgumentException(P0.bronze(tag, "The tag for row_select_bank is invalid. Received: "));
                            case 71:
                                if ("layout/row_select_country_0".equals(tag)) {
                                    return new f1(view);
                                }
                                throw new IllegalArgumentException(P0.bronze(tag, "The tag for row_select_country is invalid. Received: "));
                            case 72:
                                if ("layout/row_select_nationality_0".equals(tag)) {
                                    Object[] november9 = g.november(view, 3, null, h1.f486l);
                                    ?? g1Var = new g1(null, view, (ConstraintLayout) november9[0], (TextView) november9[1], (View) november9[2]);
                                    g1Var.f487k = -1L;
                                    g1Var.f468f.setTag(null);
                                    g1Var.f469g.setTag(null);
                                    view.setTag(R.id.dataBinding, g1Var);
                                    g1Var.lima();
                                    return g1Var;
                                }
                                throw new IllegalArgumentException(P0.bronze(tag, "The tag for row_select_nationality is invalid. Received: "));
                            case 73:
                                if ("layout/row_select_platform_0".equals(tag)) {
                                    Object[] november10 = g.november(view, 5, null, j1.f508m);
                                    ConstraintLayout constraintLayout3 = (ConstraintLayout) november10[0];
                                    ?? i1Var = new i1(null, view, constraintLayout3, (AppCompatImageView) november10[1], (TextView) november10[2], (View) november10[4]);
                                    i1Var.f509l = -1L;
                                    i1Var.f494f.setTag(null);
                                    i1Var.f495g.setTag(null);
                                    i1Var.f496h.setTag(null);
                                    view.setTag(R.id.dataBinding, i1Var);
                                    i1Var.lima();
                                    return i1Var;
                                }
                                throw new IllegalArgumentException(P0.bronze(tag, "The tag for row_select_platform is invalid. Received: "));
                            case 74:
                                if ("layout/row_shift_0".equals(tag)) {
                                    return new k1(view);
                                }
                                throw new IllegalArgumentException(P0.bronze(tag, "The tag for row_shift is invalid. Received: "));
                            case 75:
                                if ("layout/row_shift_summary_0".equals(tag)) {
                                    return new m1(view);
                                }
                                throw new IllegalArgumentException(P0.bronze(tag, "The tag for row_shift_summary is invalid. Received: "));
                            case 76:
                                if ("layout/row_take_break_0".equals(tag)) {
                                    return new C0068u0(1, view);
                                }
                                throw new IllegalArgumentException(P0.bronze(tag, "The tag for row_take_break is invalid. Received: "));
                            case 77:
                                if ("layout/row_withdraw_history_item_0".equals(tag)) {
                                    return new o1(view);
                                }
                                throw new IllegalArgumentException(P0.bronze(tag, "The tag for row_withdraw_history_item is invalid. Received: "));
                            case 78:
                                if ("layout/row_withdraw_item_0".equals(tag)) {
                                    Object[] november11 = g.november(view, 10, null, q1.f610q);
                                    ?? p1Var = new p1(null, view, (AppCompatImageView) november11[9], (MaterialButton) november11[8], (ImageView) november11[1], (TextView) november11[2], (TextView) november11[6], (TextView) november11[7], (TextView) november11[4], (TextView) november11[5], (TextView) november11[3]);
                                    p1Var.f611p = -1L;
                                    p1Var.f598g.setTag(null);
                                    ((CardView) november11[0]).setTag(null);
                                    p1Var.f599h.setTag(null);
                                    p1Var.f600i.setTag(null);
                                    p1Var.f601j.setTag(null);
                                    p1Var.f602k.setTag(null);
                                    p1Var.f603l.setTag(null);
                                    p1Var.f604m.setTag(null);
                                    p1Var.f605n.setTag(null);
                                    p1Var.papa(view);
                                    p1Var.lima();
                                    return p1Var;
                                }
                                throw new IllegalArgumentException(P0.bronze(tag, "The tag for row_withdraw_item is invalid. Received: "));
                            case 79:
                                if ("layout/score_item_0".equals(tag)) {
                                    Object[] november12 = g.november(view, 3, null, null);
                                    r1 r1Var = new r1(null, view, (ConstraintLayout) november12[0], (TextView) november12[2], (TextView) november12[1]);
                                    r1Var.f619j = -1L;
                                    r1Var.f615f.setTag(null);
                                    r1Var.f616g.setTag(null);
                                    r1Var.f617h.setTag(null);
                                    view.setTag(R.id.dataBinding, r1Var);
                                    r1Var.lima();
                                    return r1Var;
                                }
                                throw new IllegalArgumentException(P0.bronze(tag, "The tag for score_item is invalid. Received: "));
                        }
                    }
                } else {
                    switch (i5) {
                        case 1:
                            if ("layout/activity_address_note_0".equals(tag)) {
                                return new C0030b(view);
                            }
                            throw new IllegalArgumentException(P0.bronze(tag, "The tag for activity_address_note is invalid. Received: "));
                        case 2:
                            if ("layout/activity_all_address_note_0".equals(tag)) {
                                return new C0034d(view);
                            }
                            throw new IllegalArgumentException(P0.bronze(tag, "The tag for activity_all_address_note is invalid. Received: "));
                        case 3:
                            if ("layout/activity_attendance_registry_0".equals(tag)) {
                                return new C0040g(view);
                            }
                            throw new IllegalArgumentException(P0.bronze(tag, "The tag for activity_attendance_registry is invalid. Received: "));
                        case 4:
                            if ("layout/activity_call_customer_0".equals(tag)) {
                                return new C0044i(view);
                            }
                            throw new IllegalArgumentException(P0.bronze(tag, "The tag for activity_call_customer is invalid. Received: "));
                        case 5:
                            if ("layout/activity_customer_call_assist_0".equals(tag)) {
                                return new C0048k(view);
                            }
                            throw new IllegalArgumentException(P0.bronze(tag, "The tag for activity_customer_call_assist is invalid. Received: "));
                        case 6:
                            if ("layout/activity_envelop_detail_0".equals(tag)) {
                                return new C0052m(view);
                            }
                            throw new IllegalArgumentException(P0.bronze(tag, "The tag for activity_envelop_detail is invalid. Received: "));
                        case 7:
                            if ("layout/activity_envelop_detail_v2_0".equals(tag)) {
                                return new C0056o(view);
                            }
                            throw new IllegalArgumentException(P0.bronze(tag, "The tag for activity_envelop_detail_v2 is invalid. Received: "));
                        case 8:
                            if ("layout/activity_register_0".equals(tag)) {
                                return new C0060q(view);
                            }
                            throw new IllegalArgumentException(P0.bronze(tag, "The tag for activity_register is invalid. Received: "));
                        case 9:
                            if ("layout/activity_sign_up_0".equals(tag)) {
                                Object[] november13 = g.november(view, 70, null, C0065t.f690y0);
                                ImageButton imageButton = (ImageButton) november13[31];
                                ImageButton imageButton2 = (ImageButton) november13[57];
                                ImageButton imageButton3 = (ImageButton) november13[52];
                                ImageButton imageButton4 = (ImageButton) november13[67];
                                ImageButton imageButton5 = (ImageButton) november13[62];
                                ImageButton imageButton6 = (ImageButton) november13[42];
                                ImageButton imageButton7 = (ImageButton) november13[5];
                                MaterialButton materialButton = (MaterialButton) november13[69];
                                ConstraintLayout constraintLayout4 = (ConstraintLayout) november13[0];
                                TextView textView7 = (TextView) november13[58];
                                TextInputEditText textInputEditText = (TextInputEditText) november13[40];
                                TextInputEditText textInputEditText2 = (TextInputEditText) november13[24];
                                TextInputEditText textInputEditText3 = (TextInputEditText) november13[22];
                                TextInputEditText textInputEditText4 = (TextInputEditText) november13[14];
                                TextInputEditText textInputEditText5 = (TextInputEditText) november13[8];
                                TextInputEditText textInputEditText6 = (TextInputEditText) november13[34];
                                TextInputEditText textInputEditText7 = (TextInputEditText) november13[12];
                                TextInputEditText textInputEditText8 = (TextInputEditText) november13[38];
                                TextInputEditText textInputEditText9 = (TextInputEditText) november13[10];
                                TextInputEditText textInputEditText10 = (TextInputEditText) november13[26];
                                TextInputEditText textInputEditText11 = (TextInputEditText) november13[20];
                                TextInputEditText textInputEditText12 = (TextInputEditText) november13[18];
                                TextInputEditText textInputEditText13 = (TextInputEditText) november13[16];
                                TextInputEditText textInputEditText14 = (TextInputEditText) november13[29];
                                TextInputEditText textInputEditText15 = (TextInputEditText) november13[45];
                                TextInputEditText textInputEditText16 = (TextInputEditText) november13[47];
                                TextInputEditText textInputEditText17 = (TextInputEditText) november13[36];
                                ExpandableLayout expandableLayout = (ExpandableLayout) november13[32];
                                ExpandableLayout expandableLayout2 = (ExpandableLayout) november13[43];
                                ExpandableLayout expandableLayout3 = (ExpandableLayout) november13[6];
                                ConstraintLayout constraintLayout5 = (ConstraintLayout) november13[54];
                                ConstraintLayout constraintLayout6 = (ConstraintLayout) november13[48];
                                ConstraintLayout constraintLayout7 = (ConstraintLayout) november13[59];
                                ConstraintLayout constraintLayout8 = (ConstraintLayout) november13[64];
                                TextView textView8 = (TextView) november13[53];
                                TextInputLayout textInputLayout = (TextInputLayout) november13[39];
                                TextInputLayout textInputLayout2 = (TextInputLayout) november13[23];
                                TextInputLayout textInputLayout3 = (TextInputLayout) november13[21];
                                TextInputLayout textInputLayout4 = (TextInputLayout) november13[13];
                                TextInputLayout textInputLayout5 = (TextInputLayout) november13[7];
                                TextInputLayout textInputLayout6 = (TextInputLayout) november13[33];
                                TextInputLayout textInputLayout7 = (TextInputLayout) november13[11];
                                TextInputLayout textInputLayout8 = (TextInputLayout) november13[35];
                                TextInputLayout textInputLayout9 = (TextInputLayout) november13[37];
                                TextInputLayout textInputLayout10 = (TextInputLayout) november13[9];
                                TextInputLayout textInputLayout11 = (TextInputLayout) november13[25];
                                TextInputLayout textInputLayout12 = (TextInputLayout) november13[19];
                                TextInputLayout textInputLayout13 = (TextInputLayout) november13[17];
                                TextInputLayout textInputLayout14 = (TextInputLayout) november13[15];
                                TextInputLayout textInputLayout15 = (TextInputLayout) november13[28];
                                TextInputLayout textInputLayout16 = (TextInputLayout) november13[44];
                                TextInputLayout textInputLayout17 = (TextInputLayout) november13[46];
                                FloatingActionButton floatingActionButton4 = (FloatingActionButton) november13[3];
                                ImageView imageView3 = (ImageView) november13[56];
                                ImageView imageView4 = (ImageView) november13[51];
                                ImageView imageView5 = (ImageView) november13[66];
                                ImageView imageView6 = (ImageView) november13[61];
                                TextView textView9 = (TextView) november13[27];
                                TextView textView10 = (TextView) november13[68];
                                TextView textView11 = (TextView) november13[63];
                                ScrollView scrollView = (ScrollView) november13[2];
                                ?? abstractC0063s = new AbstractC0063s(null, view, imageButton, imageButton2, imageButton3, imageButton4, imageButton5, imageButton6, imageButton7, materialButton, constraintLayout4, textView7, textInputEditText, textInputEditText2, textInputEditText3, textInputEditText4, textInputEditText5, textInputEditText6, textInputEditText7, textInputEditText8, textInputEditText9, textInputEditText10, textInputEditText11, textInputEditText12, textInputEditText13, textInputEditText14, textInputEditText15, textInputEditText16, textInputEditText17, expandableLayout, expandableLayout2, expandableLayout3, constraintLayout5, constraintLayout6, constraintLayout7, constraintLayout8, textView8, textInputLayout, textInputLayout2, textInputLayout3, textInputLayout4, textInputLayout5, textInputLayout6, textInputLayout7, textInputLayout8, textInputLayout9, textInputLayout10, textInputLayout11, textInputLayout12, textInputLayout13, textInputLayout14, textInputLayout15, textInputLayout16, textInputLayout17, floatingActionButton4, imageView3, imageView4, imageView5, imageView6, textView9, textView10, textView11, scrollView, (Toolbar) november13[1], (TextView) november13[30], (TextView) november13[41], (TextView) november13[4], (View) november13[60], (View) november13[55], (View) november13[49], (View) november13[65]);
                                abstractC0063s.f691x0 = -1L;
                                abstractC0063s.f664n.setTag(null);
                                abstractC0063s.papa(view);
                                abstractC0063s.lima();
                                return abstractC0063s;
                            }
                            throw new IllegalArgumentException(P0.bronze(tag, "The tag for activity_sign_up is invalid. Received: "));
                        case 10:
                            if ("layout/activity_wallet_top_up_0".equals(tag)) {
                                return new C0069v(view);
                            }
                            throw new IllegalArgumentException(P0.bronze(tag, "The tag for activity_wallet_top_up is invalid. Received: "));
                        case 11:
                            if ("layout/activity_withdraw_detail_0".equals(tag)) {
                                return new C0073x(view);
                            }
                            throw new IllegalArgumentException(P0.bronze(tag, "The tag for activity_withdraw_detail is invalid. Received: "));
                        case 12:
                            if ("layout/bottom_sheet_add_address_note_0".equals(tag)) {
                                return new C0077z(view);
                            }
                            throw new IllegalArgumentException(P0.bronze(tag, "The tag for bottom_sheet_add_address_note is invalid. Received: "));
                        case 13:
                            if ("layout/bottom_sheet_redeem_0".equals(tag)) {
                                return new ad(view);
                            }
                            throw new IllegalArgumentException(P0.bronze(tag, "The tag for bottom_sheet_redeem is invalid. Received: "));
                        case 14:
                            if ("layout/bottom_sheet_upload_document_0".equals(tag)) {
                                return new af(view);
                            }
                            throw new IllegalArgumentException(P0.bronze(tag, "The tag for bottom_sheet_upload_document is invalid. Received: "));
                        case 15:
                            if ("layout/dialog_address_note_reward_0".equals(tag)) {
                                return new ah(view);
                            }
                            throw new IllegalArgumentException(P0.bronze(tag, "The tag for dialog_address_note_reward is invalid. Received: "));
                        case 16:
                            if ("layout/dialog_break_approved_0".equals(tag)) {
                                return new aj(view);
                            }
                            throw new IllegalArgumentException(P0.bronze(tag, "The tag for dialog_break_approved is invalid. Received: "));
                        case 17:
                            if ("layout/dialog_break_rejected_0".equals(tag)) {
                                return new ak(view);
                            }
                            throw new IllegalArgumentException(P0.bronze(tag, "The tag for dialog_break_rejected is invalid. Received: "));
                        case 18:
                            if ("layout/dialog_delivery_preview_0".equals(tag)) {
                                return new al(view);
                            }
                            throw new IllegalArgumentException(P0.bronze(tag, "The tag for dialog_delivery_preview is invalid. Received: "));
                        case 19:
                            if ("layout/dialog_order_processed_detail_0".equals(tag)) {
                                return new ap(view);
                            }
                            throw new IllegalArgumentException(P0.bronze(tag, "The tag for dialog_order_processed_detail is invalid. Received: "));
                        case 20:
                            if ("layout/dialog_point_score_show_0".equals(tag)) {
                                return new as(view);
                            }
                            throw new IllegalArgumentException(P0.bronze(tag, "The tag for dialog_point_score_show is invalid. Received: "));
                        case 21:
                            if ("layout/dialog_rate_support_0".equals(tag)) {
                                return new au(view);
                            }
                            throw new IllegalArgumentException(P0.bronze(tag, "The tag for dialog_rate_support is invalid. Received: "));
                        case 22:
                            if ("layout/dialog_take_break_0".equals(tag)) {
                                return new ax(view);
                            }
                            throw new IllegalArgumentException(P0.bronze(tag, "The tag for dialog_take_break is invalid. Received: "));
                        case 23:
                            if ("layout/fragment_about_you_0".equals(tag)) {
                                return new az(view);
                            }
                            throw new IllegalArgumentException(P0.bronze(tag, "The tag for fragment_about_you is invalid. Received: "));
                        case 24:
                            if ("layout/fragment_earn_your_money_0".equals(tag)) {
                                return new B(view);
                            }
                            throw new IllegalArgumentException(P0.bronze(tag, "The tag for fragment_earn_your_money is invalid. Received: "));
                        case 25:
                            if ("layout/fragment_share_documents_0".equals(tag)) {
                                return new D(view);
                            }
                            throw new IllegalArgumentException(P0.bronze(tag, "The tag for fragment_share_documents is invalid. Received: "));
                        case 26:
                            if ("layout/fragment_ticket_details_0".equals(tag)) {
                                return new F(view);
                            }
                            throw new IllegalArgumentException(P0.bronze(tag, "The tag for fragment_ticket_details is invalid. Received: "));
                        case 27:
                            if ("layout/fragment_trophy_milestone_0".equals(tag)) {
                                return new H(view);
                            }
                            throw new IllegalArgumentException(P0.bronze(tag, "The tag for fragment_trophy_milestone is invalid. Received: "));
                        case 28:
                            if ("layout/my_account_fragment_0".equals(tag)) {
                                return new M(view);
                            }
                            throw new IllegalArgumentException(P0.bronze(tag, "The tag for my_account_fragment is invalid. Received: "));
                        case 29:
                            if ("layout/row_address_note_0".equals(tag)) {
                                return new O(view);
                            }
                            throw new IllegalArgumentException(P0.bronze(tag, "The tag for row_address_note is invalid. Received: "));
                        case 30:
                            if ("layout/row_address_note_image_0".equals(tag)) {
                                return new Q(view);
                            }
                            throw new IllegalArgumentException(P0.bronze(tag, "The tag for row_address_note_image is invalid. Received: "));
                        case 31:
                            if ("layout/row_address_note_image_full_0".equals(tag)) {
                                return new S(view);
                            }
                            throw new IllegalArgumentException(P0.bronze(tag, "The tag for row_address_note_image_full is invalid. Received: "));
                        case 32:
                            if ("layout/row_admin_message_0".equals(tag)) {
                                return new U(view);
                            }
                            throw new IllegalArgumentException(P0.bronze(tag, "The tag for row_admin_message is invalid. Received: "));
                        case 33:
                            if ("layout/row_agreement_item_0".equals(tag)) {
                                return new W(view);
                            }
                            throw new IllegalArgumentException(P0.bronze(tag, "The tag for row_agreement_item is invalid. Received: "));
                        case 34:
                            if ("layout/row_asset_order_0".equals(tag)) {
                                return new Y(view);
                            }
                            throw new IllegalArgumentException(P0.bronze(tag, "The tag for row_asset_order is invalid. Received: "));
                        case 35:
                            if ("layout/row_asset_order_v2_0".equals(tag)) {
                                return new C0029a0(view);
                            }
                            throw new IllegalArgumentException(P0.bronze(tag, "The tag for row_asset_order_v2 is invalid. Received: "));
                        case 36:
                            if ("layout/row_assets_item_0".equals(tag)) {
                                return new C0033c0(view);
                            }
                            throw new IllegalArgumentException(P0.bronze(tag, "The tag for row_assets_item is invalid. Received: "));
                        case 37:
                            if ("layout/row_bank_0".equals(tag)) {
                                return new C0037e0(view);
                            }
                            throw new IllegalArgumentException(P0.bronze(tag, "The tag for row_bank is invalid. Received: "));
                        case 38:
                            if ("layout/row_captain_message_0".equals(tag)) {
                                return new C0041g0(view);
                            }
                            throw new IllegalArgumentException(P0.bronze(tag, "The tag for row_captain_message is invalid. Received: "));
                        case 39:
                            if ("layout/row_city_0".equals(tag)) {
                                return new C0045i0(view);
                            }
                            throw new IllegalArgumentException(P0.bronze(tag, "The tag for row_city is invalid. Received: "));
                        case 40:
                            if ("layout/row_city_selection_0".equals(tag)) {
                                Object[] november14 = g.november(view, 3, null, C0049k0.f512l);
                                ?? abstractC0047j0 = new AbstractC0047j0(null, view, (ConstraintLayout) november14[0], (TextView) november14[1], (View) november14[2]);
                                abstractC0047j0.f513k = -1L;
                                abstractC0047j0.f504f.setTag(null);
                                abstractC0047j0.f505g.setTag(null);
                                abstractC0047j0.papa(view);
                                abstractC0047j0.lima();
                                return abstractC0047j0;
                            }
                            throw new IllegalArgumentException(P0.bronze(tag, "The tag for row_city_selection is invalid. Received: "));
                        case 41:
                            if ("layout/row_completed_order_0".equals(tag)) {
                                return new C0053m0(view);
                            }
                            throw new IllegalArgumentException(P0.bronze(tag, "The tag for row_completed_order is invalid. Received: "));
                        case 42:
                            if ("layout/row_country_0".equals(tag)) {
                                return new C0057o0(view);
                            }
                            throw new IllegalArgumentException(P0.bronze(tag, "The tag for row_country is invalid. Received: "));
                        case 43:
                            if ("layout/row_country_selection_0".equals(tag)) {
                                return new C0059p0(view);
                            }
                            throw new IllegalArgumentException(P0.bronze(tag, "The tag for row_country_selection is invalid. Received: "));
                        case 44:
                            if ("layout/row_image_0".equals(tag)) {
                                return new C0061q0(view);
                            }
                            throw new IllegalArgumentException(P0.bronze(tag, "The tag for row_image is invalid. Received: "));
                        case 45:
                            if ("layout/row_loading_0".equals(tag)) {
                                Object[] november15 = g.november(view, 1, null, null);
                                ?? gVar2 = new g(view, 0, null);
                                gVar2.f613f = -1L;
                                ((FrameLayout) november15[0]).setTag(null);
                                gVar2.papa(view);
                                gVar2.lima();
                                return gVar2;
                            }
                            throw new IllegalArgumentException(P0.bronze(tag, "The tag for row_loading is invalid. Received: "));
                        case 46:
                            if ("layout/row_location_accuracy_checklist_0".equals(tag)) {
                                Object[] november16 = g.november(view, 5, null, C0066t0.f692l);
                                ?? abstractC0064s0 = new AbstractC0064s0(null, view, (View) november16[3], (TextView) november16[2], (TextView) november16[1]);
                                abstractC0064s0.f693k = -1L;
                                ((ConstraintLayout) november16[0]).setTag(null);
                                abstractC0064s0.f687g.setTag(null);
                                abstractC0064s0.f688h.setTag(null);
                                abstractC0064s0.papa(view);
                                abstractC0064s0.lima();
                                return abstractC0064s0;
                            }
                            throw new IllegalArgumentException(P0.bronze(tag, "The tag for row_location_accuracy_checklist is invalid. Received: "));
                        case 47:
                            if ("layout/row_location_accuracy_instruction_0".equals(tag)) {
                                return new C0068u0(0, view);
                            }
                            throw new IllegalArgumentException(P0.bronze(tag, "The tag for row_location_accuracy_instruction is invalid. Received: "));
                        case 48:
                            if ("layout/row_loyality_item_0".equals(tag)) {
                                Object[] november17 = g.november(view, 8, null, C0070v0.f705l);
                                ConstraintLayout constraintLayout9 = (ConstraintLayout) november17[0];
                                ?? x4 = new X((c) null, view, constraintLayout9, (TextView) november17[2], (TextView) november17[3], (TextView) november17[1], (TextView) november17[4]);
                                x4.f706k = -1L;
                                ((ConstraintLayout) x4.f268j).setTag(null);
                                x4.f264f.setTag(null);
                                x4.f265g.setTag(null);
                                x4.f266h.setTag(null);
                                x4.f267i.setTag(null);
                                x4.papa(view);
                                x4.lima();
                                return x4;
                            }
                            throw new IllegalArgumentException(P0.bronze(tag, "The tag for row_loyality_item is invalid. Received: "));
                        case 49:
                            if ("layout/row_notification_0".equals(tag)) {
                                return new C0072w0(view);
                            }
                            throw new IllegalArgumentException(P0.bronze(tag, "The tag for row_notification is invalid. Received: "));
                        case 50:
                            if ("layout/row_open_ticket_0".equals(tag)) {
                                return new C0074x0(view);
                            }
                            throw new IllegalArgumentException(P0.bronze(tag, "The tag for row_open_ticket is invalid. Received: "));
                    }
                }
            } else {
                throw new RuntimeException("view must have a tag");
            }
        }
        return null;
    }

    @Override // z1.b
    public final g charlie(View[] viewArr, int i4) {
        if (viewArr.length != 0 && alpha.get(i4) > 0 && viewArr[0].getTag() == null) {
            throw new RuntimeException("view must have a tag");
        }
        return null;
    }

    @Override // z1.b
    public final int delta(String str) {
        Integer num;
        if (str == null || (num = (Integer) t.alpha.get(str)) == null) {
            return 0;
        }
        return num.intValue();
    }
}
