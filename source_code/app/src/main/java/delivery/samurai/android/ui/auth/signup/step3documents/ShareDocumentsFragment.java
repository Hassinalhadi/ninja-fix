package delivery.samurai.android.ui.auth.signup.step3documents;

import B9.C;
import B9.ab;
import Da.a;
import Da.b;
import Da.h;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import androidx.lifecycle.T;
import com.app.network.network.models.SignUpRequest;
import com.google.android.material.textfield.TextInputLayout;
import dagger.hilt.android.AndroidEntryPoint;
import delivery.samurai.android.R;
import delivery.samurai.android.ui.auth.signup.step3documents.ShareDocumentsFragment;
import delivery.samurai.android.ui.splash.AuthViewModel;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.u;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import okhttp3.internal.ws.WebSocketProtocol;
import t6.S2;
import vf.ad;
import z1.d;
import z1.g;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ldelivery/samurai/android/ui/auth/signup/step3documents/ShareDocumentsFragment;", "Ld3/n;", "<init>", "()V", "app_ProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@AndroidEntryPoint
/* loaded from: classes2.dex */
public final class ShareDocumentsFragment extends b {

    /* renamed from: f, reason: collision with root package name */
    public C f12223f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f12224g;
    public final ab e = new ab(u.alpha.bravo(AuthViewModel.class), new h(this, 0), new h(this, 2), new h(this, 1));

    /* renamed from: h, reason: collision with root package name */
    public final Ba.h f12225h = new Ba.h(2, this);

    /* renamed from: i, reason: collision with root package name */
    public final Regex f12226i = new Regex("^[\\d\\u0660-\\u0669]{6,12}$");

    /* renamed from: j, reason: collision with root package name */
    public final Regex f12227j = new Regex("^[\\d\\u0660-\\u0669]{1,4}\\s*[-\\s]?\\s*[A-Za-z\\u0621-\\u064A]{1,4}$");

    public static String quebec(String input) {
        Intrinsics.echo(input, "input");
        ArrayList arrayList = new ArrayList(input.length());
        for (int i4 = 0; i4 < input.length(); i4++) {
            char charAt = input.charAt(i4);
            if (1632 <= charAt && charAt < 1642) {
                charAt = (char) (charAt - 1584);
            }
            arrayList.add(Character.valueOf(charAt));
        }
        return CollectionsKt.maroon(arrayList, "", null, null, null, 62);
    }

    @Override // androidx.fragment.app.ai
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.echo(inflater, "inflater");
        g charlie = d.charlie(inflater, R.layout.fragment_share_documents, viewGroup, false);
        Intrinsics.delta(charlie, "inflate(...)");
        this.f12223f = (C) charlie;
        return romeo().red;
    }

    @Override // d3.n, androidx.fragment.app.ai
    public final void onViewCreated(View view, Bundle bundle) {
        String vehicleSequenceNumber;
        Intrinsics.echo(view, "view");
        super.onViewCreated(view, bundle);
        oscar();
        SignUpRequest signUpRequest = (SignUpRequest) sierra().getSignUpRequest().getValue();
        String vehiclePlateNumber = signUpRequest.getVehiclePlateNumber();
        if ((vehiclePlateNumber != null && !StringsKt.gray(vehiclePlateNumber)) || ((vehicleSequenceNumber = signUpRequest.getVehicleSequenceNumber()) != null && !StringsKt.gray(vehicleSequenceNumber))) {
            C romeo = romeo();
            String vehiclePlateNumber2 = signUpRequest.getVehiclePlateNumber();
            String str = "";
            if (vehiclePlateNumber2 == null) {
                vehiclePlateNumber2 = "";
            }
            romeo.f88o.setText(vehiclePlateNumber2);
            C romeo2 = romeo();
            String vehicleSequenceNumber2 = signUpRequest.getVehicleSequenceNumber();
            if (vehicleSequenceNumber2 != null) {
                str = vehicleSequenceNumber2;
            }
            romeo2.f89p.setText(str);
            tango();
            uniform((a) sierra().getUploadedDocument().getValue());
        }
        ad.zulu(T.foxtrot(this), null, null, new Da.g(this, null), 3);
    }

    @Override // d3.n
    public final void oscar() {
        final C romeo = romeo();
        final int i4 = 0;
        romeo.f82i.setOnClickListener(new View.OnClickListener(this) { // from class: Da.d
            public final /* synthetic */ ShareDocumentsFragment purple;

            {
                this.purple = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C c3 = romeo;
                ShareDocumentsFragment shareDocumentsFragment = this.purple;
                switch (i4) {
                    case 0:
                        AuthViewModel sierra = shareDocumentsFragment.sierra();
                        K9.a[] aVarArr = K9.a.purple;
                        sierra.setUploadDocument(new Pair(1000, null));
                        ImageButton btnClearProfilePic = c3.f82i;
                        Intrinsics.delta(btnClearProfilePic, "btnClearProfilePic");
                        btnClearProfilePic.setVisibility(8);
                        ImageView ivProfilePic = c3.f93t;
                        Intrinsics.delta(ivProfilePic, "ivProfilePic");
                        ivProfilePic.setVisibility(8);
                        return;
                    case 1:
                        AuthViewModel sierra2 = shareDocumentsFragment.sierra();
                        K9.a[] aVarArr2 = K9.a.purple;
                        sierra2.setUploadDocument(new Pair(Integer.valueOf(WebSocketProtocol.CLOSE_CLIENT_GOING_AWAY), null));
                        ImageButton btnClearIqama = c3.f81h;
                        Intrinsics.delta(btnClearIqama, "btnClearIqama");
                        btnClearIqama.setVisibility(8);
                        ImageView ivIqamaPic = c3.f92s;
                        Intrinsics.delta(ivIqamaPic, "ivIqamaPic");
                        ivIqamaPic.setVisibility(8);
                        return;
                    case 2:
                        AuthViewModel sierra3 = shareDocumentsFragment.sierra();
                        K9.a[] aVarArr3 = K9.a.purple;
                        sierra3.setUploadDocument(new Pair(1002, null));
                        ImageButton btnClearDrivingLicense = c3.f80g;
                        Intrinsics.delta(btnClearDrivingLicense, "btnClearDrivingLicense");
                        btnClearDrivingLicense.setVisibility(8);
                        ImageView ivDrivingLicense = c3.f91r;
                        Intrinsics.delta(ivDrivingLicense, "ivDrivingLicense");
                        ivDrivingLicense.setVisibility(8);
                        return;
                    case 3:
                        AuthViewModel sierra4 = shareDocumentsFragment.sierra();
                        K9.a[] aVarArr4 = K9.a.purple;
                        sierra4.setUploadDocument(new Pair(1003, null));
                        ImageButton btnClearCarLicense = c3.f79f;
                        Intrinsics.delta(btnClearCarLicense, "btnClearCarLicense");
                        btnClearCarLicense.setVisibility(8);
                        ImageView ivCarLicense = c3.f90q;
                        Intrinsics.delta(ivCarLicense, "ivCarLicense");
                        ivCarLicense.setVisibility(8);
                        return;
                    default:
                        shareDocumentsFragment.sierra().updateRequest(new Cb.ad(1, c3, shareDocumentsFragment));
                        J2.f.alpha(shareDocumentsFragment).charlie(R.id.nav_earn_your_money, null, null);
                        return;
                }
            }
        });
        final int i5 = 1;
        romeo.f81h.setOnClickListener(new View.OnClickListener(this) { // from class: Da.d
            public final /* synthetic */ ShareDocumentsFragment purple;

            {
                this.purple = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C c3 = romeo;
                ShareDocumentsFragment shareDocumentsFragment = this.purple;
                switch (i5) {
                    case 0:
                        AuthViewModel sierra = shareDocumentsFragment.sierra();
                        K9.a[] aVarArr = K9.a.purple;
                        sierra.setUploadDocument(new Pair(1000, null));
                        ImageButton btnClearProfilePic = c3.f82i;
                        Intrinsics.delta(btnClearProfilePic, "btnClearProfilePic");
                        btnClearProfilePic.setVisibility(8);
                        ImageView ivProfilePic = c3.f93t;
                        Intrinsics.delta(ivProfilePic, "ivProfilePic");
                        ivProfilePic.setVisibility(8);
                        return;
                    case 1:
                        AuthViewModel sierra2 = shareDocumentsFragment.sierra();
                        K9.a[] aVarArr2 = K9.a.purple;
                        sierra2.setUploadDocument(new Pair(Integer.valueOf(WebSocketProtocol.CLOSE_CLIENT_GOING_AWAY), null));
                        ImageButton btnClearIqama = c3.f81h;
                        Intrinsics.delta(btnClearIqama, "btnClearIqama");
                        btnClearIqama.setVisibility(8);
                        ImageView ivIqamaPic = c3.f92s;
                        Intrinsics.delta(ivIqamaPic, "ivIqamaPic");
                        ivIqamaPic.setVisibility(8);
                        return;
                    case 2:
                        AuthViewModel sierra3 = shareDocumentsFragment.sierra();
                        K9.a[] aVarArr3 = K9.a.purple;
                        sierra3.setUploadDocument(new Pair(1002, null));
                        ImageButton btnClearDrivingLicense = c3.f80g;
                        Intrinsics.delta(btnClearDrivingLicense, "btnClearDrivingLicense");
                        btnClearDrivingLicense.setVisibility(8);
                        ImageView ivDrivingLicense = c3.f91r;
                        Intrinsics.delta(ivDrivingLicense, "ivDrivingLicense");
                        ivDrivingLicense.setVisibility(8);
                        return;
                    case 3:
                        AuthViewModel sierra4 = shareDocumentsFragment.sierra();
                        K9.a[] aVarArr4 = K9.a.purple;
                        sierra4.setUploadDocument(new Pair(1003, null));
                        ImageButton btnClearCarLicense = c3.f79f;
                        Intrinsics.delta(btnClearCarLicense, "btnClearCarLicense");
                        btnClearCarLicense.setVisibility(8);
                        ImageView ivCarLicense = c3.f90q;
                        Intrinsics.delta(ivCarLicense, "ivCarLicense");
                        ivCarLicense.setVisibility(8);
                        return;
                    default:
                        shareDocumentsFragment.sierra().updateRequest(new Cb.ad(1, c3, shareDocumentsFragment));
                        J2.f.alpha(shareDocumentsFragment).charlie(R.id.nav_earn_your_money, null, null);
                        return;
                }
            }
        });
        final int i10 = 2;
        romeo.f80g.setOnClickListener(new View.OnClickListener(this) { // from class: Da.d
            public final /* synthetic */ ShareDocumentsFragment purple;

            {
                this.purple = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C c3 = romeo;
                ShareDocumentsFragment shareDocumentsFragment = this.purple;
                switch (i10) {
                    case 0:
                        AuthViewModel sierra = shareDocumentsFragment.sierra();
                        K9.a[] aVarArr = K9.a.purple;
                        sierra.setUploadDocument(new Pair(1000, null));
                        ImageButton btnClearProfilePic = c3.f82i;
                        Intrinsics.delta(btnClearProfilePic, "btnClearProfilePic");
                        btnClearProfilePic.setVisibility(8);
                        ImageView ivProfilePic = c3.f93t;
                        Intrinsics.delta(ivProfilePic, "ivProfilePic");
                        ivProfilePic.setVisibility(8);
                        return;
                    case 1:
                        AuthViewModel sierra2 = shareDocumentsFragment.sierra();
                        K9.a[] aVarArr2 = K9.a.purple;
                        sierra2.setUploadDocument(new Pair(Integer.valueOf(WebSocketProtocol.CLOSE_CLIENT_GOING_AWAY), null));
                        ImageButton btnClearIqama = c3.f81h;
                        Intrinsics.delta(btnClearIqama, "btnClearIqama");
                        btnClearIqama.setVisibility(8);
                        ImageView ivIqamaPic = c3.f92s;
                        Intrinsics.delta(ivIqamaPic, "ivIqamaPic");
                        ivIqamaPic.setVisibility(8);
                        return;
                    case 2:
                        AuthViewModel sierra3 = shareDocumentsFragment.sierra();
                        K9.a[] aVarArr3 = K9.a.purple;
                        sierra3.setUploadDocument(new Pair(1002, null));
                        ImageButton btnClearDrivingLicense = c3.f80g;
                        Intrinsics.delta(btnClearDrivingLicense, "btnClearDrivingLicense");
                        btnClearDrivingLicense.setVisibility(8);
                        ImageView ivDrivingLicense = c3.f91r;
                        Intrinsics.delta(ivDrivingLicense, "ivDrivingLicense");
                        ivDrivingLicense.setVisibility(8);
                        return;
                    case 3:
                        AuthViewModel sierra4 = shareDocumentsFragment.sierra();
                        K9.a[] aVarArr4 = K9.a.purple;
                        sierra4.setUploadDocument(new Pair(1003, null));
                        ImageButton btnClearCarLicense = c3.f79f;
                        Intrinsics.delta(btnClearCarLicense, "btnClearCarLicense");
                        btnClearCarLicense.setVisibility(8);
                        ImageView ivCarLicense = c3.f90q;
                        Intrinsics.delta(ivCarLicense, "ivCarLicense");
                        ivCarLicense.setVisibility(8);
                        return;
                    default:
                        shareDocumentsFragment.sierra().updateRequest(new Cb.ad(1, c3, shareDocumentsFragment));
                        J2.f.alpha(shareDocumentsFragment).charlie(R.id.nav_earn_your_money, null, null);
                        return;
                }
            }
        });
        final int i11 = 3;
        romeo.f79f.setOnClickListener(new View.OnClickListener(this) { // from class: Da.d
            public final /* synthetic */ ShareDocumentsFragment purple;

            {
                this.purple = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C c3 = romeo;
                ShareDocumentsFragment shareDocumentsFragment = this.purple;
                switch (i11) {
                    case 0:
                        AuthViewModel sierra = shareDocumentsFragment.sierra();
                        K9.a[] aVarArr = K9.a.purple;
                        sierra.setUploadDocument(new Pair(1000, null));
                        ImageButton btnClearProfilePic = c3.f82i;
                        Intrinsics.delta(btnClearProfilePic, "btnClearProfilePic");
                        btnClearProfilePic.setVisibility(8);
                        ImageView ivProfilePic = c3.f93t;
                        Intrinsics.delta(ivProfilePic, "ivProfilePic");
                        ivProfilePic.setVisibility(8);
                        return;
                    case 1:
                        AuthViewModel sierra2 = shareDocumentsFragment.sierra();
                        K9.a[] aVarArr2 = K9.a.purple;
                        sierra2.setUploadDocument(new Pair(Integer.valueOf(WebSocketProtocol.CLOSE_CLIENT_GOING_AWAY), null));
                        ImageButton btnClearIqama = c3.f81h;
                        Intrinsics.delta(btnClearIqama, "btnClearIqama");
                        btnClearIqama.setVisibility(8);
                        ImageView ivIqamaPic = c3.f92s;
                        Intrinsics.delta(ivIqamaPic, "ivIqamaPic");
                        ivIqamaPic.setVisibility(8);
                        return;
                    case 2:
                        AuthViewModel sierra3 = shareDocumentsFragment.sierra();
                        K9.a[] aVarArr3 = K9.a.purple;
                        sierra3.setUploadDocument(new Pair(1002, null));
                        ImageButton btnClearDrivingLicense = c3.f80g;
                        Intrinsics.delta(btnClearDrivingLicense, "btnClearDrivingLicense");
                        btnClearDrivingLicense.setVisibility(8);
                        ImageView ivDrivingLicense = c3.f91r;
                        Intrinsics.delta(ivDrivingLicense, "ivDrivingLicense");
                        ivDrivingLicense.setVisibility(8);
                        return;
                    case 3:
                        AuthViewModel sierra4 = shareDocumentsFragment.sierra();
                        K9.a[] aVarArr4 = K9.a.purple;
                        sierra4.setUploadDocument(new Pair(1003, null));
                        ImageButton btnClearCarLicense = c3.f79f;
                        Intrinsics.delta(btnClearCarLicense, "btnClearCarLicense");
                        btnClearCarLicense.setVisibility(8);
                        ImageView ivCarLicense = c3.f90q;
                        Intrinsics.delta(ivCarLicense, "ivCarLicense");
                        ivCarLicense.setVisibility(8);
                        return;
                    default:
                        shareDocumentsFragment.sierra().updateRequest(new Cb.ad(1, c3, shareDocumentsFragment));
                        J2.f.alpha(shareDocumentsFragment).charlie(R.id.nav_earn_your_money, null, null);
                        return;
                }
            }
        });
        romeo.f87n.setOnClickListener(new View.OnClickListener(this) { // from class: Da.e
            public final /* synthetic */ ShareDocumentsFragment purple;

            {
                this.purple = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ShareDocumentsFragment shareDocumentsFragment = this.purple;
                switch (i4) {
                    case 0:
                        K9.a[] aVarArr = K9.a.purple;
                        String string = shareDocumentsFragment.getString(R.string.profile_picture);
                        Intrinsics.delta(string, "getString(...)");
                        String string2 = shareDocumentsFragment.getString(R.string.profile_picture_desc);
                        Intrinsics.delta(string2, "getString(...)");
                        String string3 = shareDocumentsFragment.getString(R.string.note_clear_copy);
                        String string4 = shareDocumentsFragment.getString(R.string.note_validity_three_months);
                        q qVar = new q();
                        Bundle bundle = new Bundle();
                        bundle.putInt("arg_doc_type", 1000);
                        bundle.putString("arg_title", string);
                        bundle.putString("arg_desc", string2);
                        bundle.putString("arg_note1", string3);
                        bundle.putString("arg_note2", string4);
                        qVar.setArguments(bundle);
                        qVar.romeo(shareDocumentsFragment.getParentFragmentManager(), null);
                        return;
                    case 1:
                        K9.a[] aVarArr2 = K9.a.purple;
                        String string5 = shareDocumentsFragment.getString(R.string.iqama_id);
                        Intrinsics.delta(string5, "getString(...)");
                        String string6 = shareDocumentsFragment.getString(R.string.iqama_description);
                        Intrinsics.delta(string6, "getString(...)");
                        String string7 = shareDocumentsFragment.getString(R.string.note_clear_copy);
                        String string8 = shareDocumentsFragment.getString(R.string.note_validity_three_months);
                        q qVar2 = new q();
                        Bundle bundle2 = new Bundle();
                        bundle2.putInt("arg_doc_type", WebSocketProtocol.CLOSE_CLIENT_GOING_AWAY);
                        bundle2.putString("arg_title", string5);
                        bundle2.putString("arg_desc", string6);
                        bundle2.putString("arg_note1", string7);
                        bundle2.putString("arg_note2", string8);
                        qVar2.setArguments(bundle2);
                        qVar2.romeo(shareDocumentsFragment.getParentFragmentManager(), null);
                        return;
                    case 2:
                        K9.a[] aVarArr3 = K9.a.purple;
                        String string9 = shareDocumentsFragment.getString(R.string.driving_license);
                        Intrinsics.delta(string9, "getString(...)");
                        String string10 = shareDocumentsFragment.getString(R.string.driving_license_desc);
                        Intrinsics.delta(string10, "getString(...)");
                        String string11 = shareDocumentsFragment.getString(R.string.note_clear_copy);
                        String string12 = shareDocumentsFragment.getString(R.string.note_validity_three_months);
                        q qVar3 = new q();
                        Bundle bundle3 = new Bundle();
                        bundle3.putInt("arg_doc_type", 1002);
                        bundle3.putString("arg_title", string9);
                        bundle3.putString("arg_desc", string10);
                        bundle3.putString("arg_note1", string11);
                        bundle3.putString("arg_note2", string12);
                        qVar3.setArguments(bundle3);
                        qVar3.romeo(shareDocumentsFragment.getParentFragmentManager(), null);
                        return;
                    default:
                        K9.a[] aVarArr4 = K9.a.purple;
                        String string13 = shareDocumentsFragment.getString(R.string.car_license);
                        Intrinsics.delta(string13, "getString(...)");
                        String string14 = shareDocumentsFragment.getString(R.string.car_license_desc);
                        Intrinsics.delta(string14, "getString(...)");
                        String string15 = shareDocumentsFragment.getString(R.string.note_clear_copy);
                        String string16 = shareDocumentsFragment.getString(R.string.note_validity_three_months);
                        q qVar4 = new q();
                        Bundle bundle4 = new Bundle();
                        bundle4.putInt("arg_doc_type", 1003);
                        bundle4.putString("arg_title", string13);
                        bundle4.putString("arg_desc", string14);
                        bundle4.putString("arg_note1", string15);
                        bundle4.putString("arg_note2", string16);
                        qVar4.setArguments(bundle4);
                        qVar4.romeo(shareDocumentsFragment.getParentFragmentManager(), null);
                        return;
                }
            }
        });
        romeo.f86m.setOnClickListener(new View.OnClickListener(this) { // from class: Da.e
            public final /* synthetic */ ShareDocumentsFragment purple;

            {
                this.purple = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ShareDocumentsFragment shareDocumentsFragment = this.purple;
                switch (i5) {
                    case 0:
                        K9.a[] aVarArr = K9.a.purple;
                        String string = shareDocumentsFragment.getString(R.string.profile_picture);
                        Intrinsics.delta(string, "getString(...)");
                        String string2 = shareDocumentsFragment.getString(R.string.profile_picture_desc);
                        Intrinsics.delta(string2, "getString(...)");
                        String string3 = shareDocumentsFragment.getString(R.string.note_clear_copy);
                        String string4 = shareDocumentsFragment.getString(R.string.note_validity_three_months);
                        q qVar = new q();
                        Bundle bundle = new Bundle();
                        bundle.putInt("arg_doc_type", 1000);
                        bundle.putString("arg_title", string);
                        bundle.putString("arg_desc", string2);
                        bundle.putString("arg_note1", string3);
                        bundle.putString("arg_note2", string4);
                        qVar.setArguments(bundle);
                        qVar.romeo(shareDocumentsFragment.getParentFragmentManager(), null);
                        return;
                    case 1:
                        K9.a[] aVarArr2 = K9.a.purple;
                        String string5 = shareDocumentsFragment.getString(R.string.iqama_id);
                        Intrinsics.delta(string5, "getString(...)");
                        String string6 = shareDocumentsFragment.getString(R.string.iqama_description);
                        Intrinsics.delta(string6, "getString(...)");
                        String string7 = shareDocumentsFragment.getString(R.string.note_clear_copy);
                        String string8 = shareDocumentsFragment.getString(R.string.note_validity_three_months);
                        q qVar2 = new q();
                        Bundle bundle2 = new Bundle();
                        bundle2.putInt("arg_doc_type", WebSocketProtocol.CLOSE_CLIENT_GOING_AWAY);
                        bundle2.putString("arg_title", string5);
                        bundle2.putString("arg_desc", string6);
                        bundle2.putString("arg_note1", string7);
                        bundle2.putString("arg_note2", string8);
                        qVar2.setArguments(bundle2);
                        qVar2.romeo(shareDocumentsFragment.getParentFragmentManager(), null);
                        return;
                    case 2:
                        K9.a[] aVarArr3 = K9.a.purple;
                        String string9 = shareDocumentsFragment.getString(R.string.driving_license);
                        Intrinsics.delta(string9, "getString(...)");
                        String string10 = shareDocumentsFragment.getString(R.string.driving_license_desc);
                        Intrinsics.delta(string10, "getString(...)");
                        String string11 = shareDocumentsFragment.getString(R.string.note_clear_copy);
                        String string12 = shareDocumentsFragment.getString(R.string.note_validity_three_months);
                        q qVar3 = new q();
                        Bundle bundle3 = new Bundle();
                        bundle3.putInt("arg_doc_type", 1002);
                        bundle3.putString("arg_title", string9);
                        bundle3.putString("arg_desc", string10);
                        bundle3.putString("arg_note1", string11);
                        bundle3.putString("arg_note2", string12);
                        qVar3.setArguments(bundle3);
                        qVar3.romeo(shareDocumentsFragment.getParentFragmentManager(), null);
                        return;
                    default:
                        K9.a[] aVarArr4 = K9.a.purple;
                        String string13 = shareDocumentsFragment.getString(R.string.car_license);
                        Intrinsics.delta(string13, "getString(...)");
                        String string14 = shareDocumentsFragment.getString(R.string.car_license_desc);
                        Intrinsics.delta(string14, "getString(...)");
                        String string15 = shareDocumentsFragment.getString(R.string.note_clear_copy);
                        String string16 = shareDocumentsFragment.getString(R.string.note_validity_three_months);
                        q qVar4 = new q();
                        Bundle bundle4 = new Bundle();
                        bundle4.putInt("arg_doc_type", 1003);
                        bundle4.putString("arg_title", string13);
                        bundle4.putString("arg_desc", string14);
                        bundle4.putString("arg_note1", string15);
                        bundle4.putString("arg_note2", string16);
                        qVar4.setArguments(bundle4);
                        qVar4.romeo(shareDocumentsFragment.getParentFragmentManager(), null);
                        return;
                }
            }
        });
        romeo.f85l.setOnClickListener(new View.OnClickListener(this) { // from class: Da.e
            public final /* synthetic */ ShareDocumentsFragment purple;

            {
                this.purple = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ShareDocumentsFragment shareDocumentsFragment = this.purple;
                switch (i10) {
                    case 0:
                        K9.a[] aVarArr = K9.a.purple;
                        String string = shareDocumentsFragment.getString(R.string.profile_picture);
                        Intrinsics.delta(string, "getString(...)");
                        String string2 = shareDocumentsFragment.getString(R.string.profile_picture_desc);
                        Intrinsics.delta(string2, "getString(...)");
                        String string3 = shareDocumentsFragment.getString(R.string.note_clear_copy);
                        String string4 = shareDocumentsFragment.getString(R.string.note_validity_three_months);
                        q qVar = new q();
                        Bundle bundle = new Bundle();
                        bundle.putInt("arg_doc_type", 1000);
                        bundle.putString("arg_title", string);
                        bundle.putString("arg_desc", string2);
                        bundle.putString("arg_note1", string3);
                        bundle.putString("arg_note2", string4);
                        qVar.setArguments(bundle);
                        qVar.romeo(shareDocumentsFragment.getParentFragmentManager(), null);
                        return;
                    case 1:
                        K9.a[] aVarArr2 = K9.a.purple;
                        String string5 = shareDocumentsFragment.getString(R.string.iqama_id);
                        Intrinsics.delta(string5, "getString(...)");
                        String string6 = shareDocumentsFragment.getString(R.string.iqama_description);
                        Intrinsics.delta(string6, "getString(...)");
                        String string7 = shareDocumentsFragment.getString(R.string.note_clear_copy);
                        String string8 = shareDocumentsFragment.getString(R.string.note_validity_three_months);
                        q qVar2 = new q();
                        Bundle bundle2 = new Bundle();
                        bundle2.putInt("arg_doc_type", WebSocketProtocol.CLOSE_CLIENT_GOING_AWAY);
                        bundle2.putString("arg_title", string5);
                        bundle2.putString("arg_desc", string6);
                        bundle2.putString("arg_note1", string7);
                        bundle2.putString("arg_note2", string8);
                        qVar2.setArguments(bundle2);
                        qVar2.romeo(shareDocumentsFragment.getParentFragmentManager(), null);
                        return;
                    case 2:
                        K9.a[] aVarArr3 = K9.a.purple;
                        String string9 = shareDocumentsFragment.getString(R.string.driving_license);
                        Intrinsics.delta(string9, "getString(...)");
                        String string10 = shareDocumentsFragment.getString(R.string.driving_license_desc);
                        Intrinsics.delta(string10, "getString(...)");
                        String string11 = shareDocumentsFragment.getString(R.string.note_clear_copy);
                        String string12 = shareDocumentsFragment.getString(R.string.note_validity_three_months);
                        q qVar3 = new q();
                        Bundle bundle3 = new Bundle();
                        bundle3.putInt("arg_doc_type", 1002);
                        bundle3.putString("arg_title", string9);
                        bundle3.putString("arg_desc", string10);
                        bundle3.putString("arg_note1", string11);
                        bundle3.putString("arg_note2", string12);
                        qVar3.setArguments(bundle3);
                        qVar3.romeo(shareDocumentsFragment.getParentFragmentManager(), null);
                        return;
                    default:
                        K9.a[] aVarArr4 = K9.a.purple;
                        String string13 = shareDocumentsFragment.getString(R.string.car_license);
                        Intrinsics.delta(string13, "getString(...)");
                        String string14 = shareDocumentsFragment.getString(R.string.car_license_desc);
                        Intrinsics.delta(string14, "getString(...)");
                        String string15 = shareDocumentsFragment.getString(R.string.note_clear_copy);
                        String string16 = shareDocumentsFragment.getString(R.string.note_validity_three_months);
                        q qVar4 = new q();
                        Bundle bundle4 = new Bundle();
                        bundle4.putInt("arg_doc_type", 1003);
                        bundle4.putString("arg_title", string13);
                        bundle4.putString("arg_desc", string14);
                        bundle4.putString("arg_note1", string15);
                        bundle4.putString("arg_note2", string16);
                        qVar4.setArguments(bundle4);
                        qVar4.romeo(shareDocumentsFragment.getParentFragmentManager(), null);
                        return;
                }
            }
        });
        romeo.f84k.setOnClickListener(new View.OnClickListener(this) { // from class: Da.e
            public final /* synthetic */ ShareDocumentsFragment purple;

            {
                this.purple = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ShareDocumentsFragment shareDocumentsFragment = this.purple;
                switch (i11) {
                    case 0:
                        K9.a[] aVarArr = K9.a.purple;
                        String string = shareDocumentsFragment.getString(R.string.profile_picture);
                        Intrinsics.delta(string, "getString(...)");
                        String string2 = shareDocumentsFragment.getString(R.string.profile_picture_desc);
                        Intrinsics.delta(string2, "getString(...)");
                        String string3 = shareDocumentsFragment.getString(R.string.note_clear_copy);
                        String string4 = shareDocumentsFragment.getString(R.string.note_validity_three_months);
                        q qVar = new q();
                        Bundle bundle = new Bundle();
                        bundle.putInt("arg_doc_type", 1000);
                        bundle.putString("arg_title", string);
                        bundle.putString("arg_desc", string2);
                        bundle.putString("arg_note1", string3);
                        bundle.putString("arg_note2", string4);
                        qVar.setArguments(bundle);
                        qVar.romeo(shareDocumentsFragment.getParentFragmentManager(), null);
                        return;
                    case 1:
                        K9.a[] aVarArr2 = K9.a.purple;
                        String string5 = shareDocumentsFragment.getString(R.string.iqama_id);
                        Intrinsics.delta(string5, "getString(...)");
                        String string6 = shareDocumentsFragment.getString(R.string.iqama_description);
                        Intrinsics.delta(string6, "getString(...)");
                        String string7 = shareDocumentsFragment.getString(R.string.note_clear_copy);
                        String string8 = shareDocumentsFragment.getString(R.string.note_validity_three_months);
                        q qVar2 = new q();
                        Bundle bundle2 = new Bundle();
                        bundle2.putInt("arg_doc_type", WebSocketProtocol.CLOSE_CLIENT_GOING_AWAY);
                        bundle2.putString("arg_title", string5);
                        bundle2.putString("arg_desc", string6);
                        bundle2.putString("arg_note1", string7);
                        bundle2.putString("arg_note2", string8);
                        qVar2.setArguments(bundle2);
                        qVar2.romeo(shareDocumentsFragment.getParentFragmentManager(), null);
                        return;
                    case 2:
                        K9.a[] aVarArr3 = K9.a.purple;
                        String string9 = shareDocumentsFragment.getString(R.string.driving_license);
                        Intrinsics.delta(string9, "getString(...)");
                        String string10 = shareDocumentsFragment.getString(R.string.driving_license_desc);
                        Intrinsics.delta(string10, "getString(...)");
                        String string11 = shareDocumentsFragment.getString(R.string.note_clear_copy);
                        String string12 = shareDocumentsFragment.getString(R.string.note_validity_three_months);
                        q qVar3 = new q();
                        Bundle bundle3 = new Bundle();
                        bundle3.putInt("arg_doc_type", 1002);
                        bundle3.putString("arg_title", string9);
                        bundle3.putString("arg_desc", string10);
                        bundle3.putString("arg_note1", string11);
                        bundle3.putString("arg_note2", string12);
                        qVar3.setArguments(bundle3);
                        qVar3.romeo(shareDocumentsFragment.getParentFragmentManager(), null);
                        return;
                    default:
                        K9.a[] aVarArr4 = K9.a.purple;
                        String string13 = shareDocumentsFragment.getString(R.string.car_license);
                        Intrinsics.delta(string13, "getString(...)");
                        String string14 = shareDocumentsFragment.getString(R.string.car_license_desc);
                        Intrinsics.delta(string14, "getString(...)");
                        String string15 = shareDocumentsFragment.getString(R.string.note_clear_copy);
                        String string16 = shareDocumentsFragment.getString(R.string.note_validity_three_months);
                        q qVar4 = new q();
                        Bundle bundle4 = new Bundle();
                        bundle4.putInt("arg_doc_type", 1003);
                        bundle4.putString("arg_title", string13);
                        bundle4.putString("arg_desc", string14);
                        bundle4.putString("arg_note1", string15);
                        bundle4.putString("arg_note2", string16);
                        qVar4.setArguments(bundle4);
                        qVar4.romeo(shareDocumentsFragment.getParentFragmentManager(), null);
                        return;
                }
            }
        });
        final int i12 = 4;
        romeo.f83j.setOnClickListener(new View.OnClickListener(this) { // from class: Da.d
            public final /* synthetic */ ShareDocumentsFragment purple;

            {
                this.purple = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C c3 = romeo;
                ShareDocumentsFragment shareDocumentsFragment = this.purple;
                switch (i12) {
                    case 0:
                        AuthViewModel sierra = shareDocumentsFragment.sierra();
                        K9.a[] aVarArr = K9.a.purple;
                        sierra.setUploadDocument(new Pair(1000, null));
                        ImageButton btnClearProfilePic = c3.f82i;
                        Intrinsics.delta(btnClearProfilePic, "btnClearProfilePic");
                        btnClearProfilePic.setVisibility(8);
                        ImageView ivProfilePic = c3.f93t;
                        Intrinsics.delta(ivProfilePic, "ivProfilePic");
                        ivProfilePic.setVisibility(8);
                        return;
                    case 1:
                        AuthViewModel sierra2 = shareDocumentsFragment.sierra();
                        K9.a[] aVarArr2 = K9.a.purple;
                        sierra2.setUploadDocument(new Pair(Integer.valueOf(WebSocketProtocol.CLOSE_CLIENT_GOING_AWAY), null));
                        ImageButton btnClearIqama = c3.f81h;
                        Intrinsics.delta(btnClearIqama, "btnClearIqama");
                        btnClearIqama.setVisibility(8);
                        ImageView ivIqamaPic = c3.f92s;
                        Intrinsics.delta(ivIqamaPic, "ivIqamaPic");
                        ivIqamaPic.setVisibility(8);
                        return;
                    case 2:
                        AuthViewModel sierra3 = shareDocumentsFragment.sierra();
                        K9.a[] aVarArr3 = K9.a.purple;
                        sierra3.setUploadDocument(new Pair(1002, null));
                        ImageButton btnClearDrivingLicense = c3.f80g;
                        Intrinsics.delta(btnClearDrivingLicense, "btnClearDrivingLicense");
                        btnClearDrivingLicense.setVisibility(8);
                        ImageView ivDrivingLicense = c3.f91r;
                        Intrinsics.delta(ivDrivingLicense, "ivDrivingLicense");
                        ivDrivingLicense.setVisibility(8);
                        return;
                    case 3:
                        AuthViewModel sierra4 = shareDocumentsFragment.sierra();
                        K9.a[] aVarArr4 = K9.a.purple;
                        sierra4.setUploadDocument(new Pair(1003, null));
                        ImageButton btnClearCarLicense = c3.f79f;
                        Intrinsics.delta(btnClearCarLicense, "btnClearCarLicense");
                        btnClearCarLicense.setVisibility(8);
                        ImageView ivCarLicense = c3.f90q;
                        Intrinsics.delta(ivCarLicense, "ivCarLicense");
                        ivCarLicense.setVisibility(8);
                        return;
                    default:
                        shareDocumentsFragment.sierra().updateRequest(new Cb.ad(1, c3, shareDocumentsFragment));
                        J2.f.alpha(shareDocumentsFragment).charlie(R.id.nav_earn_your_money, null, null);
                        return;
                }
            }
        });
        for (EditText editText : CollectionsKt.listOf(romeo.f94u.getEditText(), romeo.f95v.getEditText())) {
            if (editText != null) {
                editText.addTextChangedListener(this.f12225h);
            }
        }
    }

    public final C romeo() {
        C c3 = this.f12223f;
        if (c3 != null) {
            return c3;
        }
        Intrinsics.lima("binding");
        throw null;
    }

    public final AuthViewModel sierra() {
        return (AuthViewModel) this.e.getValue();
    }

    public final void tango() {
        boolean z2;
        C romeo = romeo();
        TextInputLayout tilVehiclePlate = romeo.f94u;
        Intrinsics.delta(tilVehiclePlate, "tilVehiclePlate");
        String obj = StringsKt.b(S2.bravo(tilVehiclePlate)).toString();
        TextInputLayout tilVehicleSequence = romeo.f95v;
        Intrinsics.delta(tilVehicleSequence, "tilVehicleSequence");
        String obj2 = StringsKt.b(S2.bravo(tilVehicleSequence)).toString();
        String quebec = quebec(obj);
        String quebec2 = quebec(obj2);
        boolean z10 = false;
        if (!StringsKt.gray(quebec) && this.f12227j.echo(quebec)) {
            tilVehiclePlate.setError(null);
            z2 = true;
        } else {
            Fc.b bVar = Fc.b.purple;
            tilVehiclePlate.setError(getString(R.string.validation_vehicle_plate));
            z2 = false;
        }
        if (!StringsKt.gray(quebec2) && this.f12226i.echo(quebec2)) {
            tilVehicleSequence.setError(null);
            z10 = z2;
        } else {
            Fc.b bVar2 = Fc.b.purple;
            tilVehicleSequence.setError(getString(R.string.validation_vehicle_sequence_number));
        }
        this.f12224g = z10;
    }

    public final void uniform(a aVar) {
        String str;
        boolean z2;
        String str2;
        String str3;
        Pair pair = aVar.alpha;
        String str4 = null;
        if (pair != null) {
            str = (String) pair.getSecond();
        } else {
            str = null;
        }
        boolean z10 = false;
        if (str != null) {
            Pair pair2 = aVar.bravo;
            if (pair2 != null) {
                str2 = (String) pair2.getSecond();
            } else {
                str2 = null;
            }
            if (str2 != null) {
                Pair pair3 = aVar.charlie;
                if (pair3 != null) {
                    str3 = (String) pair3.getSecond();
                } else {
                    str3 = null;
                }
                if (str3 != null) {
                    Pair pair4 = aVar.delta;
                    if (pair4 != null) {
                        str4 = (String) pair4.getSecond();
                    }
                    if (str4 != null) {
                        z2 = true;
                        C romeo = romeo();
                        if (z2 && this.f12224g) {
                            z10 = true;
                        }
                        romeo.f83j.setEnabled(z10);
                    }
                }
            }
        }
        z2 = false;
        C romeo2 = romeo();
        if (z2) {
            z10 = true;
        }
        romeo2.f83j.setEnabled(z10);
    }
}
