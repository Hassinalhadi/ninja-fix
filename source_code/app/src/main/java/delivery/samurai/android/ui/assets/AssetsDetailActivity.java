package delivery.samurai.android.ui.assets;

import A9.a;
import B9.ab;
import Ca.c;
import Eb.b;
import X9.g;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.app.base.BaseViewModel;
import com.app.network.network.models.captian.Assets;
import com.clevertap.android.sdk.Constants;
import com.google.android.gms.internal.measurement.C1298c;
import com.google.android.material.button.MaterialButton;
import com.google.gson.l;
import com.google.gson.reflect.TypeToken;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.Transformation;
import d3.k;
import dagger.hilt.android.AndroidEntryPoint;
import dagger.hilt.internal.GeneratedComponentManagerHolder;
import dagger.hilt.internal.UnsafeCasts;
import delivery.samurai.android.R;
import delivery.samurai.android.injections.modules.RetrofitModule_ProvideGsonFactory;
import delivery.samurai.android.ui.assets.AssetsDetailActivity;
import delivery.samurai.android.ui.assets.viewmodel.AssetViewModel;
import e3.InterfaceC1627a;
import e3.InterfaceC1628b;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.u;
import qa.d;
import s6.S6;
import t3.InterfaceC2956a;
import t3.InterfaceC2958c;
import t3.InterfaceC2960e;
import w9.j;
import w9.p;
import y9.C3403a;
import y9.C3404b;
import z9.C3484a;
import z9.C3488e;
import z9.C3490g;
import z9.i;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ldelivery/samurai/android/ui/assets/AssetsDetailActivity;", "Ld3/k;", "<init>", "()V", "app_ProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@AndroidEntryPoint
/* loaded from: classes2.dex */
public final class AssetsDetailActivity extends k {

    /* renamed from: M, reason: collision with root package name */
    public static final /* synthetic */ int f12148M = 0;

    /* renamed from: H, reason: collision with root package name */
    public boolean f12149H = false;

    /* renamed from: I, reason: collision with root package name */
    public l f12150I;

    /* renamed from: J, reason: collision with root package name */
    public c f12151J;

    /* renamed from: K, reason: collision with root package name */
    public final ab f12152K;

    /* renamed from: L, reason: collision with root package name */
    public Assets f12153L;

    public AssetsDetailActivity() {
        addOnContextAvailableListener(new b(this, 27));
        this.f12152K = new ab(u.alpha.bravo(AssetViewModel.class), new qa.c(this, 1), new qa.c(this, 0), new qa.c(this, 2));
    }

    @Override // d3.k
    public final BaseViewModel black() {
        return (AssetViewModel) this.f12152K.getValue();
    }

    @Override // d3.q
    public final void foxtrot() {
        if (!this.f12149H) {
            this.f12149H = true;
            d dVar = (d) ((GeneratedComponentManagerHolder) UnsafeCasts.unsafeCast(this)).generatedComponent();
            AssetsDetailActivity assetsDetailActivity = (AssetsDetailActivity) UnsafeCasts.unsafeCast(this);
            p pVar = ((j) dVar).alpha;
            assetsDetailActivity.teal = (C3403a) pVar.sierra.get();
            assetsDetailActivity.f12038c = (C3490g) pVar.uniform.get();
            assetsDetailActivity.f12039d = (InterfaceC2958c) pVar.whiskey.get();
            assetsDetailActivity.e = (InterfaceC2960e) pVar.xray.get();
            assetsDetailActivity.f12040f = (InterfaceC2956a) pVar.yankee.get();
            assetsDetailActivity.f12041g = (InterfaceC1628b) pVar.zulu.get();
            assetsDetailActivity.f12042h = (z9.l) pVar.amber.get();
            assetsDetailActivity.f12043i = (a) pVar.azure.get();
            assetsDetailActivity.f12044j = (InterfaceC1627a) pVar.black.get();
            assetsDetailActivity.f12045k = (C3488e) pVar.bronze.get();
            assetsDetailActivity.f12046l = (C3484a) pVar.coral.get();
            assetsDetailActivity.f12047m = (i) pVar.crimson.get();
            assetsDetailActivity.f12048n = (z9.k) pVar.cyan.get();
            assetsDetailActivity.f12049o = (C3404b) pVar.emerald.get();
            assetsDetailActivity.f12050p = (g) pVar.gold.get();
            assetsDetailActivity.f12150I = RetrofitModule_ProvideGsonFactory.bravo(pVar.foxtrot);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, com.squareup.picasso.Transformation] */
    @Override // d3.k, d3.q, androidx.fragment.app.an, ae.o, f1.i, android.app.Activity
    public final void onCreate(Bundle bundle) {
        String str;
        String str2;
        int i4;
        super.onCreate(bundle);
        setContentView(R.layout.activity_assets_detail);
        this.f12150I = new l();
        String stringExtra = getIntent().getStringExtra("ASSET_OBJECT");
        l lVar = this.f12150I;
        String str3 = null;
        if (lVar != null) {
            Assets assets = (Assets) lVar.echo(stringExtra, new TypeToken<Assets>() { // from class: delivery.samurai.android.ui.assets.AssetsDetailActivity$onCreate$1
            }.getType());
            this.f12153L = assets;
            int i5 = 0;
            if (assets != null) {
                ((TextView) findViewById(R.id.tv_asset_name)).setText(assets.getName());
                ((TextView) findViewById(R.id.tv_returning_location_label)).setText(getString(R.string.returning_location) + " " + assets.getReturnLocationName());
                ((TextView) findViewById(R.id.tv_cost)).setText("-" + assets.getCost());
                ((TextView) findViewById(R.id.tv_asset_externalId)).setText(assets.getExternalId());
                TextView textView = (TextView) findViewById(R.id.tv_instructions);
                if (assets.getInstructions().isEmpty()) {
                    i4 = 8;
                } else {
                    i4 = 0;
                }
                textView.setVisibility(i4);
            }
            RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_instructions);
            this.f12151J = new c(19);
            recyclerView.setLayoutManager(new LinearLayoutManager());
            c cVar = this.f12151J;
            if (cVar != null) {
                recyclerView.setAdapter(cVar);
                Assets assets2 = this.f12153L;
                if (assets2 != null) {
                    c cVar2 = this.f12151J;
                    if (cVar2 != null) {
                        cVar2.bravo(assets2.getInstructions());
                    } else {
                        Intrinsics.lima("instructionAdapter");
                        throw null;
                    }
                }
                final int i10 = 0;
                ((ImageButton) findViewById(R.id.btn_map)).setOnClickListener(new View.OnClickListener(this) { // from class: qa.b
                    public final /* synthetic */ AssetsDetailActivity purple;

                    {
                        this.purple = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i11;
                        String str4;
                        AssetsDetailActivity assetsDetailActivity = this.purple;
                        switch (i10) {
                            case 0:
                                Assets assets3 = assetsDetailActivity.f12153L;
                                if (assets3 != null) {
                                    double returnLocationLatitude = assets3.getReturnLocationLatitude();
                                    double returnLocationLongitude = assets3.getReturnLocationLongitude();
                                    Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("geo:" + returnLocationLatitude + Constants.SEPARATOR_COMMA + returnLocationLongitude + "?q=" + returnLocationLatitude + Constants.SEPARATOR_COMMA + returnLocationLongitude));
                                    intent.setPackage("com.google.android.apps.maps");
                                    if (intent.resolveActivity(assetsDetailActivity.getPackageManager()) != null) {
                                        assetsDetailActivity.startActivity(intent);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            case 1:
                                Assets assets4 = assetsDetailActivity.f12153L;
                                if (assets4 != null) {
                                    Integer id2 = assets4.getId();
                                    if (id2 != null) {
                                        i11 = id2.intValue();
                                    } else {
                                        i11 = 0;
                                    }
                                    k kVar = new k();
                                    kVar.setArguments(S6.charlie(new Pair("assetsId", Integer.valueOf(i11))));
                                    kVar.romeo(assetsDetailActivity.getSupportFragmentManager(), "ReturnAssetsDialog");
                                    return;
                                }
                                return;
                            default:
                                Assets assets5 = assetsDetailActivity.f12153L;
                                if (assets5 != null) {
                                    str4 = assets5.getImageUrl();
                                } else {
                                    str4 = null;
                                }
                                ArrayList azure = CollectionsKt.azure(str4);
                                C3.d dVar = new C3.d(assetsDetailActivity, new C1298c(azure, new com.google.firebase.messaging.l(17)));
                                if (!azure.isEmpty()) {
                                    dVar.alpha = true;
                                    ((androidx.appcompat.app.g) dVar.red).show();
                                    return;
                                } else {
                                    Log.w(assetsDetailActivity.getString(R.string.library_name), "Images list cannot be empty! Viewer ignored.");
                                    return;
                                }
                        }
                    }
                });
                final int i11 = 1;
                ((MaterialButton) findViewById(R.id.btn_return_location)).setOnClickListener(new View.OnClickListener(this) { // from class: qa.b
                    public final /* synthetic */ AssetsDetailActivity purple;

                    {
                        this.purple = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i112;
                        String str4;
                        AssetsDetailActivity assetsDetailActivity = this.purple;
                        switch (i11) {
                            case 0:
                                Assets assets3 = assetsDetailActivity.f12153L;
                                if (assets3 != null) {
                                    double returnLocationLatitude = assets3.getReturnLocationLatitude();
                                    double returnLocationLongitude = assets3.getReturnLocationLongitude();
                                    Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("geo:" + returnLocationLatitude + Constants.SEPARATOR_COMMA + returnLocationLongitude + "?q=" + returnLocationLatitude + Constants.SEPARATOR_COMMA + returnLocationLongitude));
                                    intent.setPackage("com.google.android.apps.maps");
                                    if (intent.resolveActivity(assetsDetailActivity.getPackageManager()) != null) {
                                        assetsDetailActivity.startActivity(intent);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            case 1:
                                Assets assets4 = assetsDetailActivity.f12153L;
                                if (assets4 != null) {
                                    Integer id2 = assets4.getId();
                                    if (id2 != null) {
                                        i112 = id2.intValue();
                                    } else {
                                        i112 = 0;
                                    }
                                    k kVar = new k();
                                    kVar.setArguments(S6.charlie(new Pair("assetsId", Integer.valueOf(i112))));
                                    kVar.romeo(assetsDetailActivity.getSupportFragmentManager(), "ReturnAssetsDialog");
                                    return;
                                }
                                return;
                            default:
                                Assets assets5 = assetsDetailActivity.f12153L;
                                if (assets5 != null) {
                                    str4 = assets5.getImageUrl();
                                } else {
                                    str4 = null;
                                }
                                ArrayList azure = CollectionsKt.azure(str4);
                                C3.d dVar = new C3.d(assetsDetailActivity, new C1298c(azure, new com.google.firebase.messaging.l(17)));
                                if (!azure.isEmpty()) {
                                    dVar.alpha = true;
                                    ((androidx.appcompat.app.g) dVar.red).show();
                                    return;
                                } else {
                                    Log.w(assetsDetailActivity.getString(R.string.library_name), "Images list cannot be empty! Viewer ignored.");
                                    return;
                                }
                        }
                    }
                });
                ImageView imageView = (ImageView) findViewById(R.id.ibAssetImage);
                Assets assets3 = this.f12153L;
                if (assets3 != null) {
                    str = assets3.getImageUrl();
                } else {
                    str = null;
                }
                if (str == null) {
                    i5 = 8;
                }
                imageView.setVisibility(i5);
                Assets assets4 = this.f12153L;
                if (assets4 != null) {
                    str2 = assets4.getImageUrl();
                } else {
                    str2 = null;
                }
                if (str2 != null) {
                    Picasso picasso = Picasso.get();
                    Assets assets5 = this.f12153L;
                    if (assets5 != null) {
                        str3 = assets5.getImageUrl();
                    }
                    picasso.load(str3).placeholder(R.drawable.ic_camera).error(R.drawable.ic_camera).transform((Transformation) new Object()).into(imageView);
                }
                final int i12 = 2;
                imageView.setOnClickListener(new View.OnClickListener(this) { // from class: qa.b
                    public final /* synthetic */ AssetsDetailActivity purple;

                    {
                        this.purple = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i112;
                        String str4;
                        AssetsDetailActivity assetsDetailActivity = this.purple;
                        switch (i12) {
                            case 0:
                                Assets assets32 = assetsDetailActivity.f12153L;
                                if (assets32 != null) {
                                    double returnLocationLatitude = assets32.getReturnLocationLatitude();
                                    double returnLocationLongitude = assets32.getReturnLocationLongitude();
                                    Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("geo:" + returnLocationLatitude + Constants.SEPARATOR_COMMA + returnLocationLongitude + "?q=" + returnLocationLatitude + Constants.SEPARATOR_COMMA + returnLocationLongitude));
                                    intent.setPackage("com.google.android.apps.maps");
                                    if (intent.resolveActivity(assetsDetailActivity.getPackageManager()) != null) {
                                        assetsDetailActivity.startActivity(intent);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            case 1:
                                Assets assets42 = assetsDetailActivity.f12153L;
                                if (assets42 != null) {
                                    Integer id2 = assets42.getId();
                                    if (id2 != null) {
                                        i112 = id2.intValue();
                                    } else {
                                        i112 = 0;
                                    }
                                    k kVar = new k();
                                    kVar.setArguments(S6.charlie(new Pair("assetsId", Integer.valueOf(i112))));
                                    kVar.romeo(assetsDetailActivity.getSupportFragmentManager(), "ReturnAssetsDialog");
                                    return;
                                }
                                return;
                            default:
                                Assets assets52 = assetsDetailActivity.f12153L;
                                if (assets52 != null) {
                                    str4 = assets52.getImageUrl();
                                } else {
                                    str4 = null;
                                }
                                ArrayList azure = CollectionsKt.azure(str4);
                                C3.d dVar = new C3.d(assetsDetailActivity, new C1298c(azure, new com.google.firebase.messaging.l(17)));
                                if (!azure.isEmpty()) {
                                    dVar.alpha = true;
                                    ((androidx.appcompat.app.g) dVar.red).show();
                                    return;
                                } else {
                                    Log.w(assetsDetailActivity.getString(R.string.library_name), "Images list cannot be empty! Viewer ignored.");
                                    return;
                                }
                        }
                    }
                });
                return;
            }
            Intrinsics.lima("instructionAdapter");
            throw null;
        }
        Intrinsics.lima("gson");
        throw null;
    }
}
