package S7;

import A0.z;
import B5.e;
import B9.ab;
import R7.as;
import R7.av;
import R7.o0;
import a4.w;
import android.graphics.SurfaceTexture;
import android.util.Base64;
import android.util.JsonReader;
import android.view.Surface;
import android.view.View;
import android.widget.ImageView;
import androidx.camera.core.M;
import androidx.camera.core.ay;
import androidx.camera.view.PreviewView;
import b0.d;
import b0.i;
import bz.InterfaceC0799y;
import com.checkout.components.interfaces.api.PaymentMethodComponent;
import com.checkout.components.interfaces.component.ApmErrorHandler;
import com.checkout.components.interfaces.error.CheckoutError;
import com.checkout.components.redirecthandler.RedirectWebViewExecutor;
import com.clevertap.android.sdk.inbox.CTInboxListViewFragment;
import com.google.android.gms.tasks.Task;
import com.google.android.material.textfield.x;
import com.google.firebase.datatransport.TransportRegistrar;
import com.squareup.picasso.Picasso;
import com.zendesk.service.HttpConstants;
import java.nio.charset.Charset;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import q9.InterfaceC2431a;
import s1.InterfaceC2587u;
import s1.a0;
import tg.k;

/* loaded from: classes2.dex */
public final /* synthetic */ class a implements b, InterfaceC2431a, e, InterfaceC2587u, ah.a, I7.e, ar.a, i, ay, InterfaceC0799y, ApmErrorHandler, x, G6.c {
    public final /* synthetic */ int alpha;

    public /* synthetic */ a(int i4) {
        this.alpha = i4;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:68:0x010d. Please report as an issue. */
    @Override // S7.b
    public Object alpha(JsonReader jsonReader) {
        boolean z2;
        boolean z10;
        String str = null;
        int i4 = 2;
        switch (this.alpha) {
            case 0:
                jsonReader.beginObject();
                List list = null;
                byte b2 = 0;
                int i5 = 0;
                while (jsonReader.hasNext()) {
                    String nextName = jsonReader.nextName();
                    nextName.getClass();
                    switch (nextName.hashCode()) {
                        case -1266514778:
                            if (nextName.equals("frames")) {
                                z2 = false;
                                break;
                            }
                            break;
                        case 3373707:
                            if (nextName.equals("name")) {
                                z2 = true;
                                break;
                            }
                            break;
                        case 2125650548:
                            if (nextName.equals("importance")) {
                                z2 = 2;
                                break;
                            }
                            break;
                    }
                    z2 = -1;
                    switch (z2) {
                        case false:
                            list = c.delta(jsonReader, new a(i4));
                            if (list == null) {
                                throw new NullPointerException("Null frames");
                            }
                        case true:
                            str = jsonReader.nextString();
                            if (str == null) {
                                throw new NullPointerException("Null name");
                            }
                        case true:
                            i5 = jsonReader.nextInt();
                            b2 = (byte) (b2 | 1);
                        default:
                            jsonReader.skipValue();
                    }
                }
                jsonReader.endObject();
                if (b2 == 1 && str != null && list != null) {
                    return new av(list, i5, str);
                }
                StringBuilder sb2 = new StringBuilder();
                if (str == null) {
                    sb2.append(" name");
                }
                if ((b2 & 1) == 0) {
                    sb2.append(" importance");
                }
                if (list == null) {
                    sb2.append(" frames");
                }
                throw new IllegalStateException(z.kilo(sb2, "Missing required properties:"));
            case 1:
                jsonReader.beginObject();
                String str2 = null;
                String str3 = null;
                byte b4 = 0;
                long j5 = 0;
                long j6 = 0;
                while (jsonReader.hasNext()) {
                    String nextName2 = jsonReader.nextName();
                    nextName2.getClass();
                    switch (nextName2.hashCode()) {
                        case 3373707:
                            if (nextName2.equals("name")) {
                                z10 = false;
                                break;
                            }
                            break;
                        case 3530753:
                            if (nextName2.equals("size")) {
                                z10 = true;
                                break;
                            }
                            break;
                        case 3601339:
                            if (nextName2.equals("uuid")) {
                                z10 = 2;
                                break;
                            }
                            break;
                        case 1153765347:
                            if (nextName2.equals("baseAddress")) {
                                z10 = 3;
                                break;
                            }
                            break;
                    }
                    z10 = -1;
                    switch (z10) {
                        case false:
                            String nextString = jsonReader.nextString();
                            if (nextString != null) {
                                str2 = nextString;
                                break;
                            } else {
                                throw new NullPointerException("Null name");
                            }
                        case true:
                            b4 = (byte) (b4 | 2);
                            j6 = jsonReader.nextLong();
                            break;
                        case true:
                            str3 = new String(Base64.decode(jsonReader.nextString(), 2), o0.alpha);
                            break;
                        case true:
                            b4 = (byte) (b4 | 1);
                            j5 = jsonReader.nextLong();
                            break;
                        default:
                            jsonReader.skipValue();
                            break;
                    }
                }
                jsonReader.endObject();
                if (b4 == 3 && str2 != null) {
                    return new as(j5, j6, str2, str3);
                }
                StringBuilder sb3 = new StringBuilder();
                if ((b4 & 1) == 0) {
                    sb3.append(" baseAddress");
                }
                if ((b4 & 2) == 0) {
                    sb3.append(" size");
                }
                if (str2 == null) {
                    sb3.append(" name");
                }
                throw new IllegalStateException(z.kilo(sb3, "Missing required properties:"));
            default:
                return c.alpha(jsonReader);
        }
    }

    @Override // B5.e, L5.f, be.InterfaceC0755a
    public Object apply(Object obj) {
        switch (this.alpha) {
            case 5:
                V7.a.bravo.getClass();
                return c.alpha.amber((o0) obj).getBytes(Charset.forName("UTF-8"));
            default:
                return null;
        }
    }

    @Override // bz.InterfaceC0799y
    public float bravo(float f5) {
        return f5;
    }

    @Override // ah.a
    public void charlie(Object obj) {
        w it = (w) obj;
        Intrinsics.echo(it, "it");
    }

    @Override // I7.e
    public Object create(I7.c cVar) {
        ab abVar = (ab) cVar;
        switch (this.alpha) {
            case 9:
                return TransportRegistrar.charlie(abVar);
            case 10:
                return TransportRegistrar.bravo(abVar);
            default:
                return TransportRegistrar.alpha(abVar);
        }
    }

    @Override // b0.i
    public double delta(double d4) {
        double d9;
        double d10;
        double d11;
        double d12;
        switch (this.alpha) {
            case 14:
                if (d4 < 0.0d) {
                    d9 = -d4;
                } else {
                    d9 = d4;
                }
                if (d9 >= 0.0031308049535603718d) {
                    d10 = (Math.pow(d9, 0.4166666666666667d) - 0.05213270142180095d) / 0.9478672985781991d;
                } else {
                    d10 = d9 / 0.07739938080495357d;
                }
                return Math.copySign(d10, d4);
            case 15:
                if (d4 < 0.0d) {
                    d11 = -d4;
                } else {
                    d11 = d4;
                }
                if (d11 >= 0.04045d) {
                    d12 = Math.pow((0.9478672985781991d * d11) + 0.05213270142180095d, 2.4d);
                } else {
                    d12 = 0.07739938080495357d * d11;
                }
                return Math.copySign(d12, d4);
            case 16:
                float[] fArr = d.alpha;
                return d.bravo(d.charlie, d4);
            case 17:
                float[] fArr2 = d.alpha;
                return d.alpha(d.charlie, d4);
            case 18:
                float[] fArr3 = d.alpha;
                return d.delta(d.delta, d4);
            case 19:
                float[] fArr4 = d.alpha;
                return d.charlie(d.delta, d4);
            default:
                return d4;
        }
    }

    @Override // q9.InterfaceC2431a
    public void foxtrot(ImageView imageView, Object obj) {
        String str = (String) obj;
        switch (this.alpha) {
            case 3:
                Picasso.get().load(str).into(imageView);
                return;
            case 4:
                Picasso.get().load(str).into(imageView);
                return;
            default:
                Picasso.get().load(str).into(imageView);
                return;
        }
    }

    @Override // s1.InterfaceC2587u
    public a0 gold(View view, a0 a0Var) {
        switch (this.alpha) {
            case 6:
                return RedirectWebViewExecutor.charlie(view, a0Var);
            default:
                return CTInboxListViewFragment.juliet(view, a0Var);
        }
    }

    @Override // G6.c
    public Object ivory(Task task) {
        switch (this.alpha) {
            case 28:
                return Integer.valueOf(HttpConstants.HTTP_FORBIDDEN);
            default:
                return -1;
        }
    }

    @Override // androidx.camera.core.ay
    public void november(M m4) {
        SurfaceTexture surfaceTexture = new SurfaceTexture(0);
        surfaceTexture.setDefaultBufferSize(m4.bravo.getWidth(), m4.bravo.getHeight());
        surfaceTexture.detachFromGLContext();
        Surface surface = new Surface(surfaceTexture);
        m4.alpha(surface, k.bravo(), new bf.d(0, surface, surfaceTexture));
    }

    @Override // com.checkout.components.interfaces.component.ApmErrorHandler
    public void onError(PaymentMethodComponent paymentMethodComponent, CheckoutError checkoutError) {
        ApmErrorHandler.Companion.a(paymentMethodComponent, checkoutError);
    }

    public /* synthetic */ a(PreviewView previewView) {
        this.alpha = 23;
    }
}
