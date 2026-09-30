package delivery.samurai.android.ui.scanner;

import Fb.p;
import a4.s;
import android.os.Bundle;
import android.widget.ImageButton;
import bo.b;
import com.app.base.BaseViewModel;
import com.clevertap.android.sdk.inapp.fragment.a;
import com.google.mlkit.vision.barcode.BarcodeScanner;
import dagger.hilt.android.AndroidEntryPoint;
import delivery.samurai.android.R;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import sb.C2844c;
import va.C3180a;
import vc.C3186a;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ldelivery/samurai/android/ui/scanner/ScannerActivity;", "Ld3/k;", "<init>", "()V", "app_ProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@AndroidEntryPoint
/* loaded from: classes2.dex */
public final class ScannerActivity extends p {
    public static final /* synthetic */ int Q = 0;

    /* renamed from: J, reason: collision with root package name */
    public boolean f12453J;

    /* renamed from: K, reason: collision with root package name */
    public final AtomicBoolean f12454K;

    /* renamed from: L, reason: collision with root package name */
    public boolean f12455L;

    /* renamed from: M, reason: collision with root package name */
    public b f12456M;

    /* renamed from: N, reason: collision with root package name */
    public final ExecutorService f12457N;

    /* renamed from: O, reason: collision with root package name */
    public final Lazy f12458O;

    /* renamed from: P, reason: collision with root package name */
    public final ah.b f12459P;

    public ScannerActivity() {
        super(2);
        this.f1294I = false;
        addOnContextAvailableListener(new C3180a(this, 2));
        this.f12454K = new AtomicBoolean(false);
        this.f12457N = Executors.newSingleThreadExecutor();
        this.f12458O = LazyKt.lazy(new C2844c(8));
        this.f12459P = registerForActivityResult(new s(4), new C3186a(this));
    }

    @Override // d3.k
    public final BaseViewModel black() {
        return null;
    }

    @Override // d3.k, d3.q, androidx.fragment.app.an, ae.o, f1.i, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_scanner);
        ((ImageButton) findViewById(R.id.btn_flash)).setOnClickListener(new a(19, this));
        this.f12459P.alpha("android.permission.CAMERA");
    }

    @Override // d3.k, d3.q, androidx.appcompat.app.i, androidx.fragment.app.an, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        this.f12457N.shutdown();
        ((BarcodeScanner) this.f12458O.getValue()).close();
    }

    @Override // d3.k, androidx.fragment.app.an, android.app.Activity
    public final void onResume() {
        super.onResume();
        if (this.f12453J) {
            this.f12453J = false;
            this.f12459P.alpha("android.permission.CAMERA");
        }
    }
}
